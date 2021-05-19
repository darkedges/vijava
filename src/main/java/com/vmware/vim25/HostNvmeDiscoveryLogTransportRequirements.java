
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostNvmeDiscoveryLogTransportRequirements.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HostNvmeDiscoveryLogTransportRequirements">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="secureChannelRequired"/>
 *     &lt;enumeration value="secureChannelNotRequired"/>
 *     &lt;enumeration value="requirementsNotSpecified"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HostNvmeDiscoveryLogTransportRequirements")
@XmlEnum
public enum HostNvmeDiscoveryLogTransportRequirements {

    @XmlEnumValue("secureChannelRequired")
    SECURE_CHANNEL_REQUIRED("secureChannelRequired"),
    @XmlEnumValue("secureChannelNotRequired")
    SECURE_CHANNEL_NOT_REQUIRED("secureChannelNotRequired"),
    @XmlEnumValue("requirementsNotSpecified")
    REQUIREMENTS_NOT_SPECIFIED("requirementsNotSpecified");
    private final String value;

    HostNvmeDiscoveryLogTransportRequirements(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HostNvmeDiscoveryLogTransportRequirements fromValue(String v) {
        for (HostNvmeDiscoveryLogTransportRequirements c: HostNvmeDiscoveryLogTransportRequirements.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
