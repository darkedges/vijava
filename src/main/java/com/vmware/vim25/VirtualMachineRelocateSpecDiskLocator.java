
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualMachineRelocateSpecDiskLocator complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VirtualMachineRelocateSpecDiskLocator">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:vim25}DynamicData">
 *       &lt;sequence>
 *         &lt;element name="diskId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="datastore" type="{urn:vim25}ManagedObjectReference"/>
 *         &lt;element name="diskMoveType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="diskBackingInfo" type="{urn:vim25}VirtualDeviceBackingInfo" minOccurs="0"/>
 *         &lt;element name="profile" type="{urn:vim25}VirtualMachineProfileSpec" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="backing" type="{urn:vim25}VirtualMachineRelocateSpecDiskLocatorBackingSpec" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineRelocateSpecDiskLocator", propOrder = {
    "diskId",
    "datastore",
    "diskMoveType",
    "diskBackingInfo",
    "profile",
    "backing"
})
public class VirtualMachineRelocateSpecDiskLocator
    extends DynamicData
{

    protected int diskId;
    @XmlElement(required = true)
    protected ManagedObjectReference datastore;
    protected String diskMoveType;
    protected VirtualDeviceBackingInfo diskBackingInfo;
    protected List<VirtualMachineProfileSpec> profile;
    protected VirtualMachineRelocateSpecDiskLocatorBackingSpec backing;

    /**
     * Gets the value of the diskId property.
     * 
     */
    public int getDiskId() {
        return diskId;
    }

    /**
     * Sets the value of the diskId property.
     * 
     */
    public void setDiskId(int value) {
        this.diskId = value;
    }

    /**
     * Gets the value of the datastore property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getDatastore() {
        return datastore;
    }

    /**
     * Sets the value of the datastore property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setDatastore(ManagedObjectReference value) {
        this.datastore = value;
    }

    /**
     * Gets the value of the diskMoveType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiskMoveType() {
        return diskMoveType;
    }

    /**
     * Sets the value of the diskMoveType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiskMoveType(String value) {
        this.diskMoveType = value;
    }

    /**
     * Gets the value of the diskBackingInfo property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualDeviceBackingInfo }
     *     
     */
    public VirtualDeviceBackingInfo getDiskBackingInfo() {
        return diskBackingInfo;
    }

    /**
     * Sets the value of the diskBackingInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualDeviceBackingInfo }
     *     
     */
    public void setDiskBackingInfo(VirtualDeviceBackingInfo value) {
        this.diskBackingInfo = value;
    }

    /**
     * Gets the value of the profile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the profile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProfile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VirtualMachineProfileSpec }
     * 
     * 
     */
    public List<VirtualMachineProfileSpec> getProfile() {
        if (profile == null) {
            profile = new ArrayList<VirtualMachineProfileSpec>();
        }
        return this.profile;
    }

    /**
     * Gets the value of the backing property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualMachineRelocateSpecDiskLocatorBackingSpec }
     *     
     */
    public VirtualMachineRelocateSpecDiskLocatorBackingSpec getBacking() {
        return backing;
    }

    /**
     * Sets the value of the backing property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualMachineRelocateSpecDiskLocatorBackingSpec }
     *     
     */
    public void setBacking(VirtualMachineRelocateSpecDiskLocatorBackingSpec value) {
        this.backing = value;
    }

}
