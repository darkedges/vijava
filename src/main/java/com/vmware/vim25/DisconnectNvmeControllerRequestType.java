
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DisconnectNvmeControllerRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DisconnectNvmeControllerRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="_this" type="{urn:vim25}ManagedObjectReference"/>
 *         &lt;element name="disconnectSpec" type="{urn:vim25}HostNvmeDisconnectSpec"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisconnectNvmeControllerRequestType", propOrder = {
    "_this",
    "disconnectSpec"
})
public class DisconnectNvmeControllerRequestType {

    @XmlElement(required = true)
    protected ManagedObjectReference _this;
    @XmlElement(required = true)
    protected HostNvmeDisconnectSpec disconnectSpec;

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
     * Gets the value of the disconnectSpec property.
     * 
     * @return
     *     possible object is
     *     {@link HostNvmeDisconnectSpec }
     *     
     */
    public HostNvmeDisconnectSpec getDisconnectSpec() {
        return disconnectSpec;
    }

    /**
     * Sets the value of the disconnectSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostNvmeDisconnectSpec }
     *     
     */
    public void setDisconnectSpec(HostNvmeDisconnectSpec value) {
        this.disconnectSpec = value;
    }

}
