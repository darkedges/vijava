
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostRuntimeInfoStatelessNvdsMigrationState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HostRuntimeInfoStatelessNvdsMigrationState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ready"/>
 *     &lt;enumeration value="notNeeded"/>
 *     &lt;enumeration value="unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HostRuntimeInfoStatelessNvdsMigrationState")
@XmlEnum
public enum HostRuntimeInfoStatelessNvdsMigrationState {

    @XmlEnumValue("ready")
    READY("ready"),
    @XmlEnumValue("notNeeded")
    NOT_NEEDED("notNeeded"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    HostRuntimeInfoStatelessNvdsMigrationState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HostRuntimeInfoStatelessNvdsMigrationState fromValue(String v) {
        for (HostRuntimeInfoStatelessNvdsMigrationState c: HostRuntimeInfoStatelessNvdsMigrationState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
