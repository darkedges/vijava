
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SessionManagerGenericServiceTicketTicketType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SessionManagerGenericServiceTicketTicketType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="HttpNfcServiceTicket"/>
 *     &lt;enumeration value="HostServiceTicket"/>
 *     &lt;enumeration value="VcServiceTicket"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SessionManagerGenericServiceTicketTicketType")
@XmlEnum
public enum SessionManagerGenericServiceTicketTicketType {

    @XmlEnumValue("HttpNfcServiceTicket")
    HTTP_NFC_SERVICE_TICKET("HttpNfcServiceTicket"),
    @XmlEnumValue("HostServiceTicket")
    HOST_SERVICE_TICKET("HostServiceTicket"),
    @XmlEnumValue("VcServiceTicket")
    VC_SERVICE_TICKET("VcServiceTicket");
    private final String value;

    SessionManagerGenericServiceTicketTicketType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SessionManagerGenericServiceTicketTicketType fromValue(String v) {
        for (SessionManagerGenericServiceTicketTicketType c: SessionManagerGenericServiceTicketTicketType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
