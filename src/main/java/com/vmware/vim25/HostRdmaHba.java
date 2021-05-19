
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostRdmaHba complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HostRdmaHba">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:vim25}HostHostBusAdapter">
 *       &lt;sequence>
 *         &lt;element name="associatedRdmaDevice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostRdmaHba", propOrder = {
    "associatedRdmaDevice"
})
public class HostRdmaHba
    extends HostHostBusAdapter
{

    protected String associatedRdmaDevice;

    /**
     * Gets the value of the associatedRdmaDevice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssociatedRdmaDevice() {
        return associatedRdmaDevice;
    }

    /**
     * Sets the value of the associatedRdmaDevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssociatedRdmaDevice(String value) {
        this.associatedRdmaDevice = value;
    }

}
