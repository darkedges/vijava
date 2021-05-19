
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualMachineConfigSpecEncryptedFtModes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VirtualMachineConfigSpecEncryptedFtModes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ftEncryptionDisabled"/>
 *     &lt;enumeration value="ftEncryptionOpportunistic"/>
 *     &lt;enumeration value="ftEncryptionRequired"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VirtualMachineConfigSpecEncryptedFtModes")
@XmlEnum
public enum VirtualMachineConfigSpecEncryptedFtModes {

    @XmlEnumValue("ftEncryptionDisabled")
    FT_ENCRYPTION_DISABLED("ftEncryptionDisabled"),
    @XmlEnumValue("ftEncryptionOpportunistic")
    FT_ENCRYPTION_OPPORTUNISTIC("ftEncryptionOpportunistic"),
    @XmlEnumValue("ftEncryptionRequired")
    FT_ENCRYPTION_REQUIRED("ftEncryptionRequired");
    private final String value;

    VirtualMachineConfigSpecEncryptedFtModes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VirtualMachineConfigSpecEncryptedFtModes fromValue(String v) {
        for (VirtualMachineConfigSpecEncryptedFtModes c: VirtualMachineConfigSpecEncryptedFtModes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
