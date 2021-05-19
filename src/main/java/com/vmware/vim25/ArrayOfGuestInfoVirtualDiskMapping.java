
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfGuestInfoVirtualDiskMapping complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfGuestInfoVirtualDiskMapping">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GuestInfoVirtualDiskMapping" type="{urn:vim25}GuestInfoVirtualDiskMapping" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfGuestInfoVirtualDiskMapping", propOrder = {
    "guestInfoVirtualDiskMapping"
})
public class ArrayOfGuestInfoVirtualDiskMapping {

    @XmlElement(name = "GuestInfoVirtualDiskMapping")
    protected List<GuestInfoVirtualDiskMapping> guestInfoVirtualDiskMapping;

    /**
     * Gets the value of the guestInfoVirtualDiskMapping property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guestInfoVirtualDiskMapping property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuestInfoVirtualDiskMapping().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GuestInfoVirtualDiskMapping }
     * 
     * 
     */
    public List<GuestInfoVirtualDiskMapping> getGuestInfoVirtualDiskMapping() {
        if (guestInfoVirtualDiskMapping == null) {
            guestInfoVirtualDiskMapping = new ArrayList<GuestInfoVirtualDiskMapping>();
        }
        return this.guestInfoVirtualDiskMapping;
    }

}
