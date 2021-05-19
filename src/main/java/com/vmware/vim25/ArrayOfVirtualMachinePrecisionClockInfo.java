
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfVirtualMachinePrecisionClockInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfVirtualMachinePrecisionClockInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VirtualMachinePrecisionClockInfo" type="{urn:vim25}VirtualMachinePrecisionClockInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVirtualMachinePrecisionClockInfo", propOrder = {
    "virtualMachinePrecisionClockInfo"
})
public class ArrayOfVirtualMachinePrecisionClockInfo {

    @XmlElement(name = "VirtualMachinePrecisionClockInfo")
    protected List<VirtualMachinePrecisionClockInfo> virtualMachinePrecisionClockInfo;

    /**
     * Gets the value of the virtualMachinePrecisionClockInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the virtualMachinePrecisionClockInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVirtualMachinePrecisionClockInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VirtualMachinePrecisionClockInfo }
     * 
     * 
     */
    public List<VirtualMachinePrecisionClockInfo> getVirtualMachinePrecisionClockInfo() {
        if (virtualMachinePrecisionClockInfo == null) {
            virtualMachinePrecisionClockInfo = new ArrayList<VirtualMachinePrecisionClockInfo>();
        }
        return this.virtualMachinePrecisionClockInfo;
    }

}
