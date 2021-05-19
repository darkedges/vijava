
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostSgxInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HostSgxInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:vim25}DynamicData">
 *       &lt;sequence>
 *         &lt;element name="sgxState" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="totalEpcMemory" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="flcMode" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "HostSgxInfo", propOrder = {
    "sgxState",
    "totalEpcMemory",
    "flcMode",
    "lePubKeyHash"
})
public class HostSgxInfo
    extends DynamicData
{

    @XmlElement(required = true)
    protected String sgxState;
    protected long totalEpcMemory;
    @XmlElement(required = true)
    protected String flcMode;
    protected String lePubKeyHash;

    /**
     * Gets the value of the sgxState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSgxState() {
        return sgxState;
    }

    /**
     * Sets the value of the sgxState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSgxState(String value) {
        this.sgxState = value;
    }

    /**
     * Gets the value of the totalEpcMemory property.
     * 
     */
    public long getTotalEpcMemory() {
        return totalEpcMemory;
    }

    /**
     * Sets the value of the totalEpcMemory property.
     * 
     */
    public void setTotalEpcMemory(long value) {
        this.totalEpcMemory = value;
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
