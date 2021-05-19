
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfVirtualMachineDynamicPassthroughInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfVirtualMachineDynamicPassthroughInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VirtualMachineDynamicPassthroughInfo" type="{urn:vim25}VirtualMachineDynamicPassthroughInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVirtualMachineDynamicPassthroughInfo", propOrder = {
    "virtualMachineDynamicPassthroughInfo"
})
public class ArrayOfVirtualMachineDynamicPassthroughInfo {

    @XmlElement(name = "VirtualMachineDynamicPassthroughInfo")
    protected List<VirtualMachineDynamicPassthroughInfo> virtualMachineDynamicPassthroughInfo;

    /**
     * Gets the value of the virtualMachineDynamicPassthroughInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the virtualMachineDynamicPassthroughInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVirtualMachineDynamicPassthroughInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VirtualMachineDynamicPassthroughInfo }
     * 
     * 
     */
    public List<VirtualMachineDynamicPassthroughInfo> getVirtualMachineDynamicPassthroughInfo() {
        if (virtualMachineDynamicPassthroughInfo == null) {
            virtualMachineDynamicPassthroughInfo = new ArrayList<VirtualMachineDynamicPassthroughInfo>();
        }
        return this.virtualMachineDynamicPassthroughInfo;
    }

}
