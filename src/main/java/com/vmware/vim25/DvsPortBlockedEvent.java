
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DvsPortBlockedEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DvsPortBlockedEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:vim25}DvsEvent">
 *       &lt;sequence>
 *         &lt;element name="portKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="statusDetail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="runtimeInfo" type="{urn:vim25}DVPortStatus" minOccurs="0"/>
 *         &lt;element name="prevBlockState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DvsPortBlockedEvent", propOrder = {
    "portKey",
    "statusDetail",
    "runtimeInfo",
    "prevBlockState"
})
public class DvsPortBlockedEvent
    extends DvsEvent
{

    @XmlElement(required = true)
    protected String portKey;
    protected String statusDetail;
    protected DVPortStatus runtimeInfo;
    protected String prevBlockState;

    /**
     * Gets the value of the portKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortKey() {
        return portKey;
    }

    /**
     * Sets the value of the portKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortKey(String value) {
        this.portKey = value;
    }

    /**
     * Gets the value of the statusDetail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusDetail() {
        return statusDetail;
    }

    /**
     * Sets the value of the statusDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusDetail(String value) {
        this.statusDetail = value;
    }

    /**
     * Gets the value of the runtimeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DVPortStatus }
     *     
     */
    public DVPortStatus getRuntimeInfo() {
        return runtimeInfo;
    }

    /**
     * Sets the value of the runtimeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DVPortStatus }
     *     
     */
    public void setRuntimeInfo(DVPortStatus value) {
        this.runtimeInfo = value;
    }

    /**
     * Gets the value of the prevBlockState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrevBlockState() {
        return prevBlockState;
    }

    /**
     * Sets the value of the prevBlockState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrevBlockState(String value) {
        this.prevBlockState = value;
    }

}
