
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClusterCryptoConfigInfoCryptoMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ClusterCryptoConfigInfoCryptoMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="onDemand"/>
 *     &lt;enumeration value="forceEnable"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ClusterCryptoConfigInfoCryptoMode")
@XmlEnum
public enum ClusterCryptoConfigInfoCryptoMode {

    @XmlEnumValue("onDemand")
    ON_DEMAND("onDemand"),
    @XmlEnumValue("forceEnable")
    FORCE_ENABLE("forceEnable");
    private final String value;

    ClusterCryptoConfigInfoCryptoMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ClusterCryptoConfigInfoCryptoMode fromValue(String v) {
        for (ClusterCryptoConfigInfoCryptoMode c: ClusterCryptoConfigInfoCryptoMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
