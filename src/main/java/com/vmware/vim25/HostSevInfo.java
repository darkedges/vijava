
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostSevInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HostSevInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:vim25}DynamicData">
 *       &lt;sequence>
 *         &lt;element name="sevState" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="maxSevEsGuests" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostSevInfo", propOrder = {
    "sevState",
    "maxSevEsGuests"
})
public class HostSevInfo
    extends DynamicData
{

    @XmlElement(required = true)
    protected String sevState;
    protected long maxSevEsGuests;

    /**
     * Gets the value of the sevState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSevState() {
        return sevState;
    }

    /**
     * Sets the value of the sevState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSevState(String value) {
        this.sevState = value;
    }

    /**
     * Gets the value of the maxSevEsGuests property.
     * 
     */
    public long getMaxSevEsGuests() {
        return maxSevEsGuests;
    }

    /**
     * Sets the value of the maxSevEsGuests property.
     * 
     */
    public void setMaxSevEsGuests(long value) {
        this.maxSevEsGuests = value;
    }

}
