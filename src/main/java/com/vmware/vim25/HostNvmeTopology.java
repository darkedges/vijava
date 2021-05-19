
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostNvmeTopology complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HostNvmeTopology">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:vim25}DynamicData">
 *       &lt;sequence>
 *         &lt;element name="adapter" type="{urn:vim25}HostNvmeTopologyInterface" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostNvmeTopology", propOrder = {
    "adapter"
})
public class HostNvmeTopology
    extends DynamicData
{

    protected List<HostNvmeTopologyInterface> adapter;

    /**
     * Gets the value of the adapter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adapter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdapter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostNvmeTopologyInterface }
     * 
     * 
     */
    public List<HostNvmeTopologyInterface> getAdapter() {
        if (adapter == null) {
            adapter = new ArrayList<HostNvmeTopologyInterface>();
        }
        return this.adapter;
    }

}
