
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClusterFailoverResourcesAdmissionControlPolicy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClusterFailoverResourcesAdmissionControlPolicy">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:vim25}ClusterDasAdmissionControlPolicy">
 *       &lt;sequence>
 *         &lt;element name="cpuFailoverResourcesPercent" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="memoryFailoverResourcesPercent" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="failoverLevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="autoComputePercentages" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="pMemFailoverResourcesPercent" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="autoComputePMemFailoverResourcesPercent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterFailoverResourcesAdmissionControlPolicy", propOrder = {
    "cpuFailoverResourcesPercent",
    "memoryFailoverResourcesPercent",
    "failoverLevel",
    "autoComputePercentages",
    "pMemFailoverResourcesPercent",
    "autoComputePMemFailoverResourcesPercent"
})
public class ClusterFailoverResourcesAdmissionControlPolicy
    extends ClusterDasAdmissionControlPolicy
{

    protected int cpuFailoverResourcesPercent;
    protected int memoryFailoverResourcesPercent;
    protected Integer failoverLevel;
    protected Boolean autoComputePercentages;
    protected Integer pMemFailoverResourcesPercent;
    protected Boolean autoComputePMemFailoverResourcesPercent;

    /**
     * Gets the value of the cpuFailoverResourcesPercent property.
     * 
     */
    public int getCpuFailoverResourcesPercent() {
        return cpuFailoverResourcesPercent;
    }

    /**
     * Sets the value of the cpuFailoverResourcesPercent property.
     * 
     */
    public void setCpuFailoverResourcesPercent(int value) {
        this.cpuFailoverResourcesPercent = value;
    }

    /**
     * Gets the value of the memoryFailoverResourcesPercent property.
     * 
     */
    public int getMemoryFailoverResourcesPercent() {
        return memoryFailoverResourcesPercent;
    }

    /**
     * Sets the value of the memoryFailoverResourcesPercent property.
     * 
     */
    public void setMemoryFailoverResourcesPercent(int value) {
        this.memoryFailoverResourcesPercent = value;
    }

    /**
     * Gets the value of the failoverLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFailoverLevel() {
        return failoverLevel;
    }

    /**
     * Sets the value of the failoverLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFailoverLevel(Integer value) {
        this.failoverLevel = value;
    }

    /**
     * Gets the value of the autoComputePercentages property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoComputePercentages() {
        return autoComputePercentages;
    }

    /**
     * Sets the value of the autoComputePercentages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoComputePercentages(Boolean value) {
        this.autoComputePercentages = value;
    }

    /**
     * Gets the value of the pMemFailoverResourcesPercent property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPMemFailoverResourcesPercent() {
        return pMemFailoverResourcesPercent;
    }

    /**
     * Sets the value of the pMemFailoverResourcesPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPMemFailoverResourcesPercent(Integer value) {
        this.pMemFailoverResourcesPercent = value;
    }

    /**
     * Gets the value of the autoComputePMemFailoverResourcesPercent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoComputePMemFailoverResourcesPercent() {
        return autoComputePMemFailoverResourcesPercent;
    }

    /**
     * Sets the value of the autoComputePMemFailoverResourcesPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoComputePMemFailoverResourcesPercent(Boolean value) {
        this.autoComputePMemFailoverResourcesPercent = value;
    }

}
