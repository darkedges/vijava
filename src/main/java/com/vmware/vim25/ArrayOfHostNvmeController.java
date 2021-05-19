
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfHostNvmeController complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfHostNvmeController">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HostNvmeController" type="{urn:vim25}HostNvmeController" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostNvmeController", propOrder = {
    "hostNvmeController"
})
public class ArrayOfHostNvmeController {

    @XmlElement(name = "HostNvmeController")
    protected List<HostNvmeController> hostNvmeController;

    /**
     * Gets the value of the hostNvmeController property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostNvmeController property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHostNvmeController().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostNvmeController }
     * 
     * 
     */
    public List<HostNvmeController> getHostNvmeController() {
        if (hostNvmeController == null) {
            hostNvmeController = new ArrayList<HostNvmeController>();
        }
        return this.hostNvmeController;
    }

}
