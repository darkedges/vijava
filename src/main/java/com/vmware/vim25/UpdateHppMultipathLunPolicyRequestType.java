
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateHppMultipathLunPolicyRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateHppMultipathLunPolicyRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="_this" type="{urn:vim25}ManagedObjectReference"/>
 *         &lt;element name="lunId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="policy" type="{urn:vim25}HostMultipathInfoHppLogicalUnitPolicy"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateHppMultipathLunPolicyRequestType", propOrder = {
    "_this",
    "lunId",
    "policy"
})
public class UpdateHppMultipathLunPolicyRequestType {

    @XmlElement(required = true)
    protected ManagedObjectReference _this;
    @XmlElement(required = true)
    protected String lunId;
    @XmlElement(required = true)
    protected HostMultipathInfoHppLogicalUnitPolicy policy;

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
     * Gets the value of the lunId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLunId() {
        return lunId;
    }

    /**
     * Sets the value of the lunId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLunId(String value) {
        this.lunId = value;
    }

    /**
     * Gets the value of the policy property.
     * 
     * @return
     *     possible object is
     *     {@link HostMultipathInfoHppLogicalUnitPolicy }
     *     
     */
    public HostMultipathInfoHppLogicalUnitPolicy getPolicy() {
        return policy;
    }

    /**
     * Sets the value of the policy property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostMultipathInfoHppLogicalUnitPolicy }
     *     
     */
    public void setPolicy(HostMultipathInfoHppLogicalUnitPolicy value) {
        this.policy = value;
    }

}
