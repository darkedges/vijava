
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostRdmaDevicePnicBacking complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HostRdmaDevicePnicBacking">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:vim25}HostRdmaDeviceBacking">
 *       &lt;sequence>
 *         &lt;element name="pairedUplink" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostRdmaDevicePnicBacking", propOrder = {
    "pairedUplink"
})
public class HostRdmaDevicePnicBacking
    extends HostRdmaDeviceBacking
{

    @XmlElement(required = true)
    protected String pairedUplink;

    /**
     * Gets the value of the pairedUplink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPairedUplink() {
        return pairedUplink;
    }

    /**
     * Sets the value of the pairedUplink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPairedUplink(String value) {
        this.pairedUplink = value;
    }

}
