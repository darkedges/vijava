
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DistributedVirtualPortgroupProblem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DistributedVirtualPortgroupProblem">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:vim25}DynamicData">
 *       &lt;sequence>
 *         &lt;element name="logicalSwitchUuid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fault" type="{urn:vim25}LocalizedMethodFault"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistributedVirtualPortgroupProblem", propOrder = {
    "logicalSwitchUuid",
    "fault"
})
public class DistributedVirtualPortgroupProblem
    extends DynamicData
{

    @XmlElement(required = true)
    protected String logicalSwitchUuid;
    @XmlElement(required = true)
    protected LocalizedMethodFault fault;

    /**
     * Gets the value of the logicalSwitchUuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogicalSwitchUuid() {
        return logicalSwitchUuid;
    }

    /**
     * Sets the value of the logicalSwitchUuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogicalSwitchUuid(String value) {
        this.logicalSwitchUuid = value;
    }

    /**
     * Gets the value of the fault property.
     * 
     * @return
     *     possible object is
     *     {@link LocalizedMethodFault }
     *     
     */
    public LocalizedMethodFault getFault() {
        return fault;
    }

    /**
     * Sets the value of the fault property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalizedMethodFault }
     *     
     */
    public void setFault(LocalizedMethodFault value) {
        this.fault = value;
    }

}
