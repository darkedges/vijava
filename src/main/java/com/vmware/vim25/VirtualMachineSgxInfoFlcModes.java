
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualMachineSgxInfoFlcModes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VirtualMachineSgxInfoFlcModes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="locked"/>
 *     &lt;enumeration value="unlocked"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VirtualMachineSgxInfoFlcModes")
@XmlEnum
public enum VirtualMachineSgxInfoFlcModes {

    @XmlEnumValue("locked")
    LOCKED("locked"),
    @XmlEnumValue("unlocked")
    UNLOCKED("unlocked");
    private final String value;

    VirtualMachineSgxInfoFlcModes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VirtualMachineSgxInfoFlcModes fromValue(String v) {
        for (VirtualMachineSgxInfoFlcModes c: VirtualMachineSgxInfoFlcModes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
