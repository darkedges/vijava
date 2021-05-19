
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfVirtualMachineConfigSpec complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfVirtualMachineConfigSpec">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VirtualMachineConfigSpec" type="{urn:vim25}VirtualMachineConfigSpec" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVirtualMachineConfigSpec", propOrder = {
    "virtualMachineConfigSpec"
})
public class ArrayOfVirtualMachineConfigSpec {

    @XmlElement(name = "VirtualMachineConfigSpec")
    protected List<VirtualMachineConfigSpec> virtualMachineConfigSpec;

    /**
     * Gets the value of the virtualMachineConfigSpec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the virtualMachineConfigSpec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVirtualMachineConfigSpec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VirtualMachineConfigSpec }
     * 
     * 
     */
    public List<VirtualMachineConfigSpec> getVirtualMachineConfigSpec() {
        if (virtualMachineConfigSpec == null) {
            virtualMachineConfigSpec = new ArrayList<VirtualMachineConfigSpec>();
        }
        return this.virtualMachineConfigSpec;
    }

}
