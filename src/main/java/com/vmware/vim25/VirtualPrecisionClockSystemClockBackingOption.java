
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualPrecisionClockSystemClockBackingOption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VirtualPrecisionClockSystemClockBackingOption">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:vim25}VirtualDeviceBackingOption">
 *       &lt;sequence>
 *         &lt;element name="protocol" type="{urn:vim25}ChoiceOption"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualPrecisionClockSystemClockBackingOption", propOrder = {
    "protocol"
})
public class VirtualPrecisionClockSystemClockBackingOption
    extends VirtualDeviceBackingOption
{

    @XmlElement(required = true)
    protected ChoiceOption protocol;

    /**
     * Gets the value of the protocol property.
     * 
     * @return
     *     possible object is
     *     {@link ChoiceOption }
     *     
     */
    public ChoiceOption getProtocol() {
        return protocol;
    }

    /**
     * Sets the value of the protocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChoiceOption }
     *     
     */
    public void setProtocol(ChoiceOption value) {
        this.protocol = value;
    }

}
