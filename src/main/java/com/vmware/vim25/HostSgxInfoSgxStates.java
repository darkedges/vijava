
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostSgxInfoSgxStates.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HostSgxInfoSgxStates">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="notPresent"/>
 *     &lt;enumeration value="disabledBIOS"/>
 *     &lt;enumeration value="disabledCFW101"/>
 *     &lt;enumeration value="disabledCPUMismatch"/>
 *     &lt;enumeration value="disabledNoFLC"/>
 *     &lt;enumeration value="disabledNUMAUnsup"/>
 *     &lt;enumeration value="disabledMaxEPCRegs"/>
 *     &lt;enumeration value="enabled"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HostSgxInfoSgxStates")
@XmlEnum
public enum HostSgxInfoSgxStates {

    @XmlEnumValue("notPresent")
    NOT_PRESENT("notPresent"),
    @XmlEnumValue("disabledBIOS")
    DISABLED_BIOS("disabledBIOS"),
    @XmlEnumValue("disabledCFW101")
    DISABLED_CFW_101("disabledCFW101"),
    @XmlEnumValue("disabledCPUMismatch")
    DISABLED_CPU_MISMATCH("disabledCPUMismatch"),
    @XmlEnumValue("disabledNoFLC")
    DISABLED_NO_FLC("disabledNoFLC"),
    @XmlEnumValue("disabledNUMAUnsup")
    DISABLED_NUMA_UNSUP("disabledNUMAUnsup"),
    @XmlEnumValue("disabledMaxEPCRegs")
    DISABLED_MAX_EPC_REGS("disabledMaxEPCRegs"),
    @XmlEnumValue("enabled")
    ENABLED("enabled");
    private final String value;

    HostSgxInfoSgxStates(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HostSgxInfoSgxStates fromValue(String v) {
        for (HostSgxInfoSgxStates c: HostSgxInfoSgxStates.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
