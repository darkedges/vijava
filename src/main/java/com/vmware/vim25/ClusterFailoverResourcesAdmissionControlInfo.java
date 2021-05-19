
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClusterFailoverResourcesAdmissionControlInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClusterFailoverResourcesAdmissionControlInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:vim25}ClusterDasAdmissionControlInfo">
 *       &lt;sequence>
 *         &lt;element name="currentCpuFailoverResourcesPercent" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="currentMemoryFailoverResourcesPercent" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="currentPMemFailoverResourcesPercent" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterFailoverResourcesAdmissionControlInfo", propOrder = {
    "currentCpuFailoverResourcesPercent",
    "currentMemoryFailoverResourcesPercent",
    "currentPMemFailoverResourcesPercent"
})
public class ClusterFailoverResourcesAdmissionControlInfo
    extends ClusterDasAdmissionControlInfo
{

    protected int currentCpuFailoverResourcesPercent;
    protected int currentMemoryFailoverResourcesPercent;
    protected Integer currentPMemFailoverResourcesPercent;

    /**
     * Gets the value of the currentCpuFailoverResourcesPercent property.
     * 
     */
    public int getCurrentCpuFailoverResourcesPercent() {
        return currentCpuFailoverResourcesPercent;
    }

    /**
     * Sets the value of the currentCpuFailoverResourcesPercent property.
     * 
     */
    public void setCurrentCpuFailoverResourcesPercent(int value) {
        this.currentCpuFailoverResourcesPercent = value;
    }

    /**
     * Gets the value of the currentMemoryFailoverResourcesPercent property.
     * 
     */
    public int getCurrentMemoryFailoverResourcesPercent() {
        return currentMemoryFailoverResourcesPercent;
    }

    /**
     * Sets the value of the currentMemoryFailoverResourcesPercent property.
     * 
     */
    public void setCurrentMemoryFailoverResourcesPercent(int value) {
        this.currentMemoryFailoverResourcesPercent = value;
    }

    /**
     * Gets the value of the currentPMemFailoverResourcesPercent property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCurrentPMemFailoverResourcesPercent() {
        return currentPMemFailoverResourcesPercent;
    }

    /**
     * Sets the value of the currentPMemFailoverResourcesPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCurrentPMemFailoverResourcesPercent(Integer value) {
        this.currentPMemFailoverResourcesPercent = value;
    }

}
