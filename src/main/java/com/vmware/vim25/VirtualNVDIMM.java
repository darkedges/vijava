
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualNVDIMM complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VirtualNVDIMM">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:vim25}VirtualDevice">
 *       &lt;sequence>
 *         &lt;element name="capacityInMB" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="configuredCapacityInMB" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualNVDIMM", propOrder = {
    "capacityInMB",
    "configuredCapacityInMB"
})
public class VirtualNVDIMM
    extends VirtualDevice
{

    protected long capacityInMB;
    protected Long configuredCapacityInMB;

    /**
     * Gets the value of the capacityInMB property.
     * 
     */
    public long getCapacityInMB() {
        return capacityInMB;
    }

    /**
     * Sets the value of the capacityInMB property.
     * 
     */
    public void setCapacityInMB(long value) {
        this.capacityInMB = value;
    }

    /**
     * Gets the value of the configuredCapacityInMB property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getConfiguredCapacityInMB() {
        return configuredCapacityInMB;
    }

    /**
     * Sets the value of the configuredCapacityInMB property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setConfiguredCapacityInMB(Long value) {
        this.configuredCapacityInMB = value;
    }

}
