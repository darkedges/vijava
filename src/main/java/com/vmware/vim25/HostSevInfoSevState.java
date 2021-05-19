
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostSevInfoSevState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HostSevInfoSevState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="uninitialized"/>
 *     &lt;enumeration value="initialized"/>
 *     &lt;enumeration value="working"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HostSevInfoSevState")
@XmlEnum
public enum HostSevInfoSevState {

    @XmlEnumValue("uninitialized")
    UNINITIALIZED("uninitialized"),
    @XmlEnumValue("initialized")
    INITIALIZED("initialized"),
    @XmlEnumValue("working")
    WORKING("working");
    private final String value;

    HostSevInfoSevState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HostSevInfoSevState fromValue(String v) {
        for (HostSevInfoSevState c: HostSevInfoSevState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
