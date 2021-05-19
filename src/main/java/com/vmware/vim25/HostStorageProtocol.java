
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostStorageProtocol.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HostStorageProtocol">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="scsi"/>
 *     &lt;enumeration value="nvme"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HostStorageProtocol")
@XmlEnum
public enum HostStorageProtocol {

    @XmlEnumValue("scsi")
    SCSI("scsi"),
    @XmlEnumValue("nvme")
    NVME("nvme");
    private final String value;

    HostStorageProtocol(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HostStorageProtocol fromValue(String v) {
        for (HostStorageProtocol c: HostStorageProtocol.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
