
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualMachineGuestMonitoringModeInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VirtualMachineGuestMonitoringModeInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:vim25}DynamicData">
 *       &lt;sequence>
 *         &lt;element name="gmmFile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gmmAppliance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineGuestMonitoringModeInfo", propOrder = {
    "gmmFile",
    "gmmAppliance"
})
public class VirtualMachineGuestMonitoringModeInfo
    extends DynamicData
{

    protected String gmmFile;
    protected String gmmAppliance;

    /**
     * Gets the value of the gmmFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGmmFile() {
        return gmmFile;
    }

    /**
     * Sets the value of the gmmFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGmmFile(String value) {
        this.gmmFile = value;
    }

    /**
     * Gets the value of the gmmAppliance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGmmAppliance() {
        return gmmAppliance;
    }

    /**
     * Sets the value of the gmmAppliance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGmmAppliance(String value) {
        this.gmmAppliance = value;
    }

}
