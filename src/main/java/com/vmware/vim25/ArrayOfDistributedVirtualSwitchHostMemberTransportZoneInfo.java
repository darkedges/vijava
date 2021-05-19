
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDistributedVirtualSwitchHostMemberTransportZoneInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDistributedVirtualSwitchHostMemberTransportZoneInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DistributedVirtualSwitchHostMemberTransportZoneInfo" type="{urn:vim25}DistributedVirtualSwitchHostMemberTransportZoneInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDistributedVirtualSwitchHostMemberTransportZoneInfo", propOrder = {
    "distributedVirtualSwitchHostMemberTransportZoneInfo"
})
public class ArrayOfDistributedVirtualSwitchHostMemberTransportZoneInfo {

    @XmlElement(name = "DistributedVirtualSwitchHostMemberTransportZoneInfo")
    protected List<DistributedVirtualSwitchHostMemberTransportZoneInfo> distributedVirtualSwitchHostMemberTransportZoneInfo;

    /**
     * Gets the value of the distributedVirtualSwitchHostMemberTransportZoneInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the distributedVirtualSwitchHostMemberTransportZoneInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDistributedVirtualSwitchHostMemberTransportZoneInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DistributedVirtualSwitchHostMemberTransportZoneInfo }
     * 
     * 
     */
    public List<DistributedVirtualSwitchHostMemberTransportZoneInfo> getDistributedVirtualSwitchHostMemberTransportZoneInfo() {
        if (distributedVirtualSwitchHostMemberTransportZoneInfo == null) {
            distributedVirtualSwitchHostMemberTransportZoneInfo = new ArrayList<DistributedVirtualSwitchHostMemberTransportZoneInfo>();
        }
        return this.distributedVirtualSwitchHostMemberTransportZoneInfo;
    }

}
