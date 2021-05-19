
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomizationFailedReasonCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CustomizationFailedReasonCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="userDefinedScriptDisabled"/>
 *     &lt;enumeration value="customizationDisabled"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CustomizationFailedReasonCode")
@XmlEnum
public enum CustomizationFailedReasonCode {

    @XmlEnumValue("userDefinedScriptDisabled")
    USER_DEFINED_SCRIPT_DISABLED("userDefinedScriptDisabled"),
    @XmlEnumValue("customizationDisabled")
    CUSTOMIZATION_DISABLED("customizationDisabled");
    private final String value;

    CustomizationFailedReasonCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CustomizationFailedReasonCode fromValue(String v) {
        for (CustomizationFailedReasonCode c: CustomizationFailedReasonCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
