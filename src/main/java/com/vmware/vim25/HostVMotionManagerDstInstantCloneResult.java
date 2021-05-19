
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostVMotionManagerDstInstantCloneResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HostVMotionManagerDstInstantCloneResult">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:vim25}DynamicData">
 *       &lt;sequence>
 *         &lt;element name="dstVmId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="cptLoadTime" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="cptLoadDoneTime" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="replicateMemDoneTime" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="endTime" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="cptXferTime" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="cptCacheUsed" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="devCptStreamSize" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="devCptStreamTime" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostVMotionManagerDstInstantCloneResult", propOrder = {
    "dstVmId",
    "startTime",
    "cptLoadTime",
    "cptLoadDoneTime",
    "replicateMemDoneTime",
    "endTime",
    "cptXferTime",
    "cptCacheUsed",
    "devCptStreamSize",
    "devCptStreamTime"
})
public class HostVMotionManagerDstInstantCloneResult
    extends DynamicData
{

    protected Integer dstVmId;
    protected Long startTime;
    protected Long cptLoadTime;
    protected Long cptLoadDoneTime;
    protected Long replicateMemDoneTime;
    protected Long endTime;
    protected Long cptXferTime;
    protected Long cptCacheUsed;
    protected Long devCptStreamSize;
    protected Long devCptStreamTime;

    /**
     * Gets the value of the dstVmId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDstVmId() {
        return dstVmId;
    }

    /**
     * Sets the value of the dstVmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDstVmId(Integer value) {
        this.dstVmId = value;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStartTime(Long value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the cptLoadTime property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCptLoadTime() {
        return cptLoadTime;
    }

    /**
     * Sets the value of the cptLoadTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCptLoadTime(Long value) {
        this.cptLoadTime = value;
    }

    /**
     * Gets the value of the cptLoadDoneTime property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCptLoadDoneTime() {
        return cptLoadDoneTime;
    }

    /**
     * Sets the value of the cptLoadDoneTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCptLoadDoneTime(Long value) {
        this.cptLoadDoneTime = value;
    }

    /**
     * Gets the value of the replicateMemDoneTime property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReplicateMemDoneTime() {
        return replicateMemDoneTime;
    }

    /**
     * Sets the value of the replicateMemDoneTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReplicateMemDoneTime(Long value) {
        this.replicateMemDoneTime = value;
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEndTime(Long value) {
        this.endTime = value;
    }

    /**
     * Gets the value of the cptXferTime property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCptXferTime() {
        return cptXferTime;
    }

    /**
     * Sets the value of the cptXferTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCptXferTime(Long value) {
        this.cptXferTime = value;
    }

    /**
     * Gets the value of the cptCacheUsed property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCptCacheUsed() {
        return cptCacheUsed;
    }

    /**
     * Sets the value of the cptCacheUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCptCacheUsed(Long value) {
        this.cptCacheUsed = value;
    }

    /**
     * Gets the value of the devCptStreamSize property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDevCptStreamSize() {
        return devCptStreamSize;
    }

    /**
     * Sets the value of the devCptStreamSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDevCptStreamSize(Long value) {
        this.devCptStreamSize = value;
    }

    /**
     * Gets the value of the devCptStreamTime property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDevCptStreamTime() {
        return devCptStreamTime;
    }

    /**
     * Sets the value of the devCptStreamTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDevCptStreamTime(Long value) {
        this.devCptStreamTime = value;
    }

}
