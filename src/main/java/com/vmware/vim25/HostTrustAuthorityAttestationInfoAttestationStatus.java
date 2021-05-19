
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostTrustAuthorityAttestationInfoAttestationStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HostTrustAuthorityAttestationInfoAttestationStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="attested"/>
 *     &lt;enumeration value="notAttested"/>
 *     &lt;enumeration value="unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HostTrustAuthorityAttestationInfoAttestationStatus")
@XmlEnum
public enum HostTrustAuthorityAttestationInfoAttestationStatus {

    @XmlEnumValue("attested")
    ATTESTED("attested"),
    @XmlEnumValue("notAttested")
    NOT_ATTESTED("notAttested"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    HostTrustAuthorityAttestationInfoAttestationStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HostTrustAuthorityAttestationInfoAttestationStatus fromValue(String v) {
        for (HostTrustAuthorityAttestationInfoAttestationStatus c: HostTrustAuthorityAttestationInfoAttestationStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
