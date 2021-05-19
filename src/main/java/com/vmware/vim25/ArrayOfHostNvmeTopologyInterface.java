
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfHostNvmeTopologyInterface complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfHostNvmeTopologyInterface">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HostNvmeTopologyInterface" type="{urn:vim25}HostNvmeTopologyInterface" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostNvmeTopologyInterface", propOrder = {
    "hostNvmeTopologyInterface"
})
public class ArrayOfHostNvmeTopologyInterface {

    @XmlElement(name = "HostNvmeTopologyInterface")
    protected List<HostNvmeTopologyInterface> hostNvmeTopologyInterface;

    /**
     * Gets the value of the hostNvmeTopologyInterface property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostNvmeTopologyInterface property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHostNvmeTopologyInterface().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostNvmeTopologyInterface }
     * 
     * 
     */
    public List<HostNvmeTopologyInterface> getHostNvmeTopologyInterface() {
        if (hostNvmeTopologyInterface == null) {
            hostNvmeTopologyInterface = new ArrayList<HostNvmeTopologyInterface>();
        }
        return this.hostNvmeTopologyInterface;
    }

}
