
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClusterComputeResourceVcsHealthStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ClusterComputeResourceVcsHealthStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="healthy"/>
 *     &lt;enumeration value="degraded"/>
 *     &lt;enumeration value="nonhealthy"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ClusterComputeResourceVcsHealthStatus")
@XmlEnum
public enum ClusterComputeResourceVcsHealthStatus {

    @XmlEnumValue("healthy")
    HEALTHY("healthy"),
    @XmlEnumValue("degraded")
    DEGRADED("degraded"),
    @XmlEnumValue("nonhealthy")
    NONHEALTHY("nonhealthy");
    private final String value;

    ClusterComputeResourceVcsHealthStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ClusterComputeResourceVcsHealthStatus fromValue(String v) {
        for (ClusterComputeResourceVcsHealthStatus c: ClusterComputeResourceVcsHealthStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
