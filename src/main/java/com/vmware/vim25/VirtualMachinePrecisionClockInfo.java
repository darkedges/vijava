
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualMachinePrecisionClockInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VirtualMachinePrecisionClockInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:vim25}VirtualMachineTargetInfo">
 *       &lt;sequence>
 *         &lt;element name="systemClockProtocol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachinePrecisionClockInfo", propOrder = {
    "systemClockProtocol"
})
public class VirtualMachinePrecisionClockInfo
    extends VirtualMachineTargetInfo
{

    protected String systemClockProtocol;

    /**
     * Gets the value of the systemClockProtocol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemClockProtocol() {
        return systemClockProtocol;
    }

    /**
     * Sets the value of the systemClockProtocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemClockProtocol(String value) {
        this.systemClockProtocol = value;
    }

}
