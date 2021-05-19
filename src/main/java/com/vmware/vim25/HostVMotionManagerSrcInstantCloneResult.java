
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostVMotionManagerSrcInstantCloneResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HostVMotionManagerSrcInstantCloneResult">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:vim25}DynamicData">
 *       &lt;sequence>
 *         &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="quiesceTime" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="quiesceDoneTime" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="resumeDoneTime" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="endTime" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostVMotionManagerSrcInstantCloneResult", propOrder = {
    "startTime",
    "quiesceTime",
    "quiesceDoneTime",
    "resumeDoneTime",
    "endTime"
})
public class HostVMotionManagerSrcInstantCloneResult
    extends DynamicData
{

    protected Long startTime;
    protected Long quiesceTime;
    protected Long quiesceDoneTime;
    protected Long resumeDoneTime;
    protected Long endTime;

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
     * Gets the value of the quiesceTime property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getQuiesceTime() {
        return quiesceTime;
    }

    /**
     * Sets the value of the quiesceTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setQuiesceTime(Long value) {
        this.quiesceTime = value;
    }

    /**
     * Gets the value of the quiesceDoneTime property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getQuiesceDoneTime() {
        return quiesceDoneTime;
    }

    /**
     * Sets the value of the quiesceDoneTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setQuiesceDoneTime(Long value) {
        this.quiesceDoneTime = value;
    }

    /**
     * Gets the value of the resumeDoneTime property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getResumeDoneTime() {
        return resumeDoneTime;
    }

    /**
     * Sets the value of the resumeDoneTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setResumeDoneTime(Long value) {
        this.resumeDoneTime = value;
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

}
