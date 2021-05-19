
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostNvmeDisconnectSpec complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HostNvmeDisconnectSpec">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:vim25}DynamicData">
 *       &lt;sequence>
 *         &lt;element name="hbaName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="subnqn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="controllerNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostNvmeDisconnectSpec", propOrder = {
    "hbaName",
    "subnqn",
    "controllerNumber"
})
public class HostNvmeDisconnectSpec
    extends DynamicData
{

    @XmlElement(required = true)
    protected String hbaName;
    protected String subnqn;
    protected Integer controllerNumber;

    /**
     * Gets the value of the hbaName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHbaName() {
        return hbaName;
    }

    /**
     * Sets the value of the hbaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHbaName(String value) {
        this.hbaName = value;
    }

    /**
     * Gets the value of the subnqn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubnqn() {
        return subnqn;
    }

    /**
     * Sets the value of the subnqn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubnqn(String value) {
        this.subnqn = value;
    }

    /**
     * Gets the value of the controllerNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getControllerNumber() {
        return controllerNumber;
    }

    /**
     * Sets the value of the controllerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setControllerNumber(Integer value) {
        this.controllerNumber = value;
    }

}
