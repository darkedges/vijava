
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KmipClusterInfoKmsManagementType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="KmipClusterInfoKmsManagementType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="vCenter"/>
 *     &lt;enumeration value="trustAuthority"/>
 *     &lt;enumeration value="nativeProvider"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "KmipClusterInfoKmsManagementType")
@XmlEnum
public enum KmipClusterInfoKmsManagementType {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("vCenter")
    V_CENTER("vCenter"),
    @XmlEnumValue("trustAuthority")
    TRUST_AUTHORITY("trustAuthority"),
    @XmlEnumValue("nativeProvider")
    NATIVE_PROVIDER("nativeProvider");
    private final String value;

    KmipClusterInfoKmsManagementType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static KmipClusterInfoKmsManagementType fromValue(String v) {
        for (KmipClusterInfoKmsManagementType c: KmipClusterInfoKmsManagementType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
