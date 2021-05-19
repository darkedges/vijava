
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostMaintenanceSpecPurpose.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HostMaintenanceSpecPurpose">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="hostUpgrade"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HostMaintenanceSpecPurpose")
@XmlEnum
public enum HostMaintenanceSpecPurpose {

    @XmlEnumValue("hostUpgrade")
    HOST_UPGRADE("hostUpgrade");
    private final String value;

    HostMaintenanceSpecPurpose(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HostMaintenanceSpecPurpose fromValue(String v) {
        for (HostMaintenanceSpecPurpose c: HostMaintenanceSpecPurpose.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
