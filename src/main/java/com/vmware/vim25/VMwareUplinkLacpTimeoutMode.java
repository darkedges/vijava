
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VMwareUplinkLacpTimeoutMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VMwareUplinkLacpTimeoutMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="fast"/>
 *     &lt;enumeration value="slow"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VMwareUplinkLacpTimeoutMode")
@XmlEnum
public enum VMwareUplinkLacpTimeoutMode {

    @XmlEnumValue("fast")
    FAST("fast"),
    @XmlEnumValue("slow")
    SLOW("slow");
    private final String value;

    VMwareUplinkLacpTimeoutMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VMwareUplinkLacpTimeoutMode fromValue(String v) {
        for (VMwareUplinkLacpTimeoutMode c: VMwareUplinkLacpTimeoutMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
