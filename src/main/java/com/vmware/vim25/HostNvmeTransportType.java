
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostNvmeTransportType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HostNvmeTransportType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="pcie"/>
 *     &lt;enumeration value="fibreChannel"/>
 *     &lt;enumeration value="rdma"/>
 *     &lt;enumeration value="loopback"/>
 *     &lt;enumeration value="unsupported"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HostNvmeTransportType")
@XmlEnum
public enum HostNvmeTransportType {

    @XmlEnumValue("pcie")
    PCIE("pcie"),
    @XmlEnumValue("fibreChannel")
    FIBRE_CHANNEL("fibreChannel"),
    @XmlEnumValue("rdma")
    RDMA("rdma"),
    @XmlEnumValue("loopback")
    LOOPBACK("loopback"),
    @XmlEnumValue("unsupported")
    UNSUPPORTED("unsupported");
    private final String value;

    HostNvmeTransportType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HostNvmeTransportType fromValue(String v) {
        for (HostNvmeTransportType c: HostNvmeTransportType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
