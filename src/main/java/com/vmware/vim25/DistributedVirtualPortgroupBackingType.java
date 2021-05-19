
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DistributedVirtualPortgroupBackingType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DistributedVirtualPortgroupBackingType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="standard"/>
 *     &lt;enumeration value="nsx"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DistributedVirtualPortgroupBackingType")
@XmlEnum
public enum DistributedVirtualPortgroupBackingType {

    @XmlEnumValue("standard")
    STANDARD("standard"),
    @XmlEnumValue("nsx")
    NSX("nsx");
    private final String value;

    DistributedVirtualPortgroupBackingType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DistributedVirtualPortgroupBackingType fromValue(String v) {
        for (DistributedVirtualPortgroupBackingType c: DistributedVirtualPortgroupBackingType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
