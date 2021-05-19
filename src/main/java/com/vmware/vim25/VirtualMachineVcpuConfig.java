
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualMachineVcpuConfig complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VirtualMachineVcpuConfig">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:vim25}DynamicData">
 *       &lt;sequence>
 *         &lt;element name="latencySensitivity" type="{urn:vim25}LatencySensitivity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineVcpuConfig", propOrder = {
    "latencySensitivity"
})
public class VirtualMachineVcpuConfig
    extends DynamicData
{

    protected LatencySensitivity latencySensitivity;

    /**
     * Gets the value of the latencySensitivity property.
     * 
     * @return
     *     possible object is
     *     {@link LatencySensitivity }
     *     
     */
    public LatencySensitivity getLatencySensitivity() {
        return latencySensitivity;
    }

    /**
     * Sets the value of the latencySensitivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link LatencySensitivity }
     *     
     */
    public void setLatencySensitivity(LatencySensitivity value) {
        this.latencySensitivity = value;
    }

}
