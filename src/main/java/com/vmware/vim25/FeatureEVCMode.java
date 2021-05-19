
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeatureEVCMode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeatureEVCMode">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:vim25}ElementDescription">
 *       &lt;sequence>
 *         &lt;element name="mask" type="{urn:vim25}HostFeatureMask" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="capability" type="{urn:vim25}HostFeatureCapability" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="requirement" type="{urn:vim25}VirtualMachineFeatureRequirement" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeatureEVCMode", propOrder = {
    "mask",
    "capability",
    "requirement"
})
public class FeatureEVCMode
    extends ElementDescription
{

    protected List<HostFeatureMask> mask;
    protected List<HostFeatureCapability> capability;
    protected List<VirtualMachineFeatureRequirement> requirement;

    /**
     * Gets the value of the mask property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mask property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMask().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostFeatureMask }
     * 
     * 
     */
    public List<HostFeatureMask> getMask() {
        if (mask == null) {
            mask = new ArrayList<HostFeatureMask>();
        }
        return this.mask;
    }

    /**
     * Gets the value of the capability property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the capability property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCapability().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostFeatureCapability }
     * 
     * 
     */
    public List<HostFeatureCapability> getCapability() {
        if (capability == null) {
            capability = new ArrayList<HostFeatureCapability>();
        }
        return this.capability;
    }

    /**
     * Gets the value of the requirement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requirement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequirement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VirtualMachineFeatureRequirement }
     * 
     * 
     */
    public List<VirtualMachineFeatureRequirement> getRequirement() {
        if (requirement == null) {
            requirement = new ArrayList<VirtualMachineFeatureRequirement>();
        }
        return this.requirement;
    }

}
