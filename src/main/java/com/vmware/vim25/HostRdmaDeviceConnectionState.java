
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostRdmaDeviceConnectionState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HostRdmaDeviceConnectionState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="down"/>
 *     &lt;enumeration value="init"/>
 *     &lt;enumeration value="armed"/>
 *     &lt;enumeration value="active"/>
 *     &lt;enumeration value="activeDefer"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HostRdmaDeviceConnectionState")
@XmlEnum
public enum HostRdmaDeviceConnectionState {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("down")
    DOWN("down"),
    @XmlEnumValue("init")
    INIT("init"),
    @XmlEnumValue("armed")
    ARMED("armed"),
    @XmlEnumValue("active")
    ACTIVE("active"),
    @XmlEnumValue("activeDefer")
    ACTIVE_DEFER("activeDefer");
    private final String value;

    HostRdmaDeviceConnectionState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HostRdmaDeviceConnectionState fromValue(String v) {
        for (HostRdmaDeviceConnectionState c: HostRdmaDeviceConnectionState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
