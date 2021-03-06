
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConfigureEvcModeRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConfigureEvcModeRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="_this" type="{urn:vim25}ManagedObjectReference"/>
 *         &lt;element name="evcModeKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="evcGraphicsModeKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfigureEvcModeRequestType", propOrder = {
    "_this",
    "evcModeKey",
    "evcGraphicsModeKey"
})
public class ConfigureEvcModeRequestType {

    @XmlElement(required = true)
    protected ManagedObjectReference _this;
    @XmlElement(required = true)
    protected String evcModeKey;
    protected String evcGraphicsModeKey;

    /**
     * Gets the value of the this property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getThis() {
        return _this;
    }

    /**
     * Sets the value of the this property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setThis(ManagedObjectReference value) {
        this._this = value;
    }

    /**
     * Gets the value of the evcModeKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvcModeKey() {
        return evcModeKey;
    }

    /**
     * Sets the value of the evcModeKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvcModeKey(String value) {
        this.evcModeKey = value;
    }

    /**
     * Gets the value of the evcGraphicsModeKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvcGraphicsModeKey() {
        return evcGraphicsModeKey;
    }

    /**
     * Sets the value of the evcGraphicsModeKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvcGraphicsModeKey(String value) {
        this.evcGraphicsModeKey = value;
    }

}
