
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResourceConfigSpecScaleSharesBehavior.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ResourceConfigSpecScaleSharesBehavior">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="disabled"/>
 *     &lt;enumeration value="scaleCpuAndMemoryShares"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ResourceConfigSpecScaleSharesBehavior")
@XmlEnum
public enum ResourceConfigSpecScaleSharesBehavior {

    @XmlEnumValue("disabled")
    DISABLED("disabled"),
    @XmlEnumValue("scaleCpuAndMemoryShares")
    SCALE_CPU_AND_MEMORY_SHARES("scaleCpuAndMemoryShares");
    private final String value;

    ResourceConfigSpecScaleSharesBehavior(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResourceConfigSpecScaleSharesBehavior fromValue(String v) {
        for (ResourceConfigSpecScaleSharesBehavior c: ResourceConfigSpecScaleSharesBehavior.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
