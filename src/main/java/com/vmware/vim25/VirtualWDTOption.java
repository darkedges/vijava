
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualWDTOption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VirtualWDTOption">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:vim25}VirtualDeviceOption">
 *       &lt;sequence>
 *         &lt;element name="runOnBoot" type="{urn:vim25}BoolOption"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualWDTOption", propOrder = {
    "runOnBoot"
})
public class VirtualWDTOption
    extends VirtualDeviceOption
{

    @XmlElement(required = true)
    protected BoolOption runOnBoot;

    /**
     * Gets the value of the runOnBoot property.
     * 
     * @return
     *     possible object is
     *     {@link BoolOption }
     *     
     */
    public BoolOption getRunOnBoot() {
        return runOnBoot;
    }

    /**
     * Sets the value of the runOnBoot property.
     * 
     * @param value
     *     allowed object is
     *     {@link BoolOption }
     *     
     */
    public void setRunOnBoot(BoolOption value) {
        this.runOnBoot = value;
    }

}
