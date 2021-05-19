
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DistributedVirtualPortgroupNsxPortgroupOperationResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DistributedVirtualPortgroupNsxPortgroupOperationResult">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:vim25}DynamicData">
 *       &lt;sequence>
 *         &lt;element name="portgroups" type="{urn:vim25}ManagedObjectReference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="problems" type="{urn:vim25}DistributedVirtualPortgroupProblem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistributedVirtualPortgroupNsxPortgroupOperationResult", propOrder = {
    "portgroups",
    "problems"
})
public class DistributedVirtualPortgroupNsxPortgroupOperationResult
    extends DynamicData
{

    protected List<ManagedObjectReference> portgroups;
    protected List<DistributedVirtualPortgroupProblem> problems;

    /**
     * Gets the value of the portgroups property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the portgroups property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPortgroups().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ManagedObjectReference }
     * 
     * 
     */
    public List<ManagedObjectReference> getPortgroups() {
        if (portgroups == null) {
            portgroups = new ArrayList<ManagedObjectReference>();
        }
        return this.portgroups;
    }

    /**
     * Gets the value of the problems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the problems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProblems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DistributedVirtualPortgroupProblem }
     * 
     * 
     */
    public List<DistributedVirtualPortgroupProblem> getProblems() {
        if (problems == null) {
            problems = new ArrayList<DistributedVirtualPortgroupProblem>();
        }
        return this.problems;
    }

}
