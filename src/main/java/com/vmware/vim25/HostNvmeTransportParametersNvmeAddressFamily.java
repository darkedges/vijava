
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostNvmeTransportParametersNvmeAddressFamily.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HostNvmeTransportParametersNvmeAddressFamily">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ipv4"/>
 *     &lt;enumeration value="ipv6"/>
 *     &lt;enumeration value="infiniBand"/>
 *     &lt;enumeration value="fc"/>
 *     &lt;enumeration value="loopback"/>
 *     &lt;enumeration value="unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HostNvmeTransportParametersNvmeAddressFamily")
@XmlEnum
public enum HostNvmeTransportParametersNvmeAddressFamily {

    @XmlEnumValue("ipv4")
    IPV_4("ipv4"),
    @XmlEnumValue("ipv6")
    IPV_6("ipv6"),
    @XmlEnumValue("infiniBand")
    INFINI_BAND("infiniBand"),
    @XmlEnumValue("fc")
    FC("fc"),
    @XmlEnumValue("loopback")
    LOOPBACK("loopback"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    HostNvmeTransportParametersNvmeAddressFamily(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HostNvmeTransportParametersNvmeAddressFamily fromValue(String v) {
        for (HostNvmeTransportParametersNvmeAddressFamily c: HostNvmeTransportParametersNvmeAddressFamily.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
