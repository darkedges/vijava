
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GuestInfoCustomizationStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GuestInfoCustomizationStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TOOLSDEPLOYPKG_IDLE"/>
 *     &lt;enumeration value="TOOLSDEPLOYPKG_PENDING"/>
 *     &lt;enumeration value="TOOLSDEPLOYPKG_RUNNING"/>
 *     &lt;enumeration value="TOOLSDEPLOYPKG_SUCCEEDED"/>
 *     &lt;enumeration value="TOOLSDEPLOYPKG_FAILED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GuestInfoCustomizationStatus")
@XmlEnum
public enum GuestInfoCustomizationStatus {

    TOOLSDEPLOYPKG_IDLE,
    TOOLSDEPLOYPKG_PENDING,
    TOOLSDEPLOYPKG_RUNNING,
    TOOLSDEPLOYPKG_SUCCEEDED,
    TOOLSDEPLOYPKG_FAILED;

    public String value() {
        return name();
    }

    public static GuestInfoCustomizationStatus fromValue(String v) {
        return valueOf(v);
    }

}
