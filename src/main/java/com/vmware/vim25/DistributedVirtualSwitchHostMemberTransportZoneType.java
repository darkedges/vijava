
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DistributedVirtualSwitchHostMemberTransportZoneType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DistributedVirtualSwitchHostMemberTransportZoneType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="vlan"/>
 *     &lt;enumeration value="overlay"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DistributedVirtualSwitchHostMemberTransportZoneType")
@XmlEnum
public enum DistributedVirtualSwitchHostMemberTransportZoneType {

    @XmlEnumValue("vlan")
    VLAN("vlan"),
    @XmlEnumValue("overlay")
    OVERLAY("overlay");
    private final String value;

    DistributedVirtualSwitchHostMemberTransportZoneType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DistributedVirtualSwitchHostMemberTransportZoneType fromValue(String v) {
        for (DistributedVirtualSwitchHostMemberTransportZoneType c: DistributedVirtualSwitchHostMemberTransportZoneType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
