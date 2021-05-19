
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostDateTimeInfoProtocol.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HostDateTimeInfoProtocol">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ntp"/>
 *     &lt;enumeration value="ptp"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HostDateTimeInfoProtocol")
@XmlEnum
public enum HostDateTimeInfoProtocol {

    @XmlEnumValue("ntp")
    NTP("ntp"),
    @XmlEnumValue("ptp")
    PTP("ptp");
    private final String value;

    HostDateTimeInfoProtocol(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HostDateTimeInfoProtocol fromValue(String v) {
        for (HostDateTimeInfoProtocol c: HostDateTimeInfoProtocol.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
