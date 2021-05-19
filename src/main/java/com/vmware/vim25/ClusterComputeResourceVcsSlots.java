
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClusterComputeResourceVcsSlots complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClusterComputeResourceVcsSlots">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:vim25}DynamicData">
 *       &lt;sequence>
 *         &lt;element name="host" type="{urn:vim25}ManagedObjectReference"/>
 *         &lt;element name="totalSlots" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterComputeResourceVcsSlots", propOrder = {
    "host",
    "totalSlots"
})
public class ClusterComputeResourceVcsSlots
    extends DynamicData
{

    @XmlElement(required = true)
    protected ManagedObjectReference host;
    protected int totalSlots;

    /**
     * Gets the value of the host property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getHost() {
        return host;
    }

    /**
     * Sets the value of the host property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setHost(ManagedObjectReference value) {
        this.host = value;
    }

    /**
     * Gets the value of the totalSlots property.
     * 
     */
    public int getTotalSlots() {
        return totalSlots;
    }

    /**
     * Sets the value of the totalSlots property.
     * 
     */
    public void setTotalSlots(int value) {
        this.totalSlots = value;
    }

}
