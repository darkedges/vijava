
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostNvmeDiscoveryLogSubsystemType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HostNvmeDiscoveryLogSubsystemType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="discovery"/>
 *     &lt;enumeration value="nvm"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HostNvmeDiscoveryLogSubsystemType")
@XmlEnum
public enum HostNvmeDiscoveryLogSubsystemType {

    @XmlEnumValue("discovery")
    DISCOVERY("discovery"),
    @XmlEnumValue("nvm")
    NVM("nvm");
    private final String value;

    HostNvmeDiscoveryLogSubsystemType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HostNvmeDiscoveryLogSubsystemType fromValue(String v) {
        for (HostNvmeDiscoveryLogSubsystemType c: HostNvmeDiscoveryLogSubsystemType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
