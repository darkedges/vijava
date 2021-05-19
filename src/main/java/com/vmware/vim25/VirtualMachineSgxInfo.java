
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualMachineSgxInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VirtualMachineSgxInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:vim25}DynamicData">
 *       &lt;sequence>
 *         &lt;element name="epcSize" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="flcMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lePubKeyHash" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineSgxInfo", propOrder = {
    "epcSize",
    "flcMode",
    "lePubKeyHash"
})
public class VirtualMachineSgxInfo
    extends DynamicData
{

    protected long epcSize;
    protected String flcMode;
    protected String lePubKeyHash;

    /**
     * Gets the value of the epcSize property.
     * 
     */
    public long getEpcSize() {
        return epcSize;
    }

    /**
     * Sets the value of the epcSize property.
     * 
     */
    public void setEpcSize(long value) {
        this.epcSize = value;
    }

    /**
     * Gets the value of the flcMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlcMode() {
        return flcMode;
    }

    /**
     * Sets the value of the flcMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlcMode(String value) {
        this.flcMode = value;
    }

    /**
     * Gets the value of the lePubKeyHash property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLePubKeyHash() {
        return lePubKeyHash;
    }

    /**
     * Sets the value of the lePubKeyHash property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLePubKeyHash(String value) {
        this.lePubKeyHash = value;
    }

}
