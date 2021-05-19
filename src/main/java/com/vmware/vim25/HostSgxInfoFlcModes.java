
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostSgxInfoFlcModes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HostSgxInfoFlcModes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="off"/>
 *     &lt;enumeration value="locked"/>
 *     &lt;enumeration value="unlocked"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HostSgxInfoFlcModes")
@XmlEnum
public enum HostSgxInfoFlcModes {

    @XmlEnumValue("off")
    OFF("off"),
    @XmlEnumValue("locked")
    LOCKED("locked"),
    @XmlEnumValue("unlocked")
    UNLOCKED("unlocked");
    private final String value;

    HostSgxInfoFlcModes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HostSgxInfoFlcModes fromValue(String v) {
        for (HostSgxInfoFlcModes c: HostSgxInfoFlcModes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
