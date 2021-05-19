
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DesiredSoftwareSpec complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DesiredSoftwareSpec">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:vim25}DynamicData">
 *       &lt;sequence>
 *         &lt;element name="baseImageSpec" type="{urn:vim25}DesiredSoftwareSpecBaseImageSpec"/>
 *         &lt;element name="vendorAddOnSpec" type="{urn:vim25}DesiredSoftwareSpecVendorAddOnSpec" minOccurs="0"/>
 *         &lt;element name="components" type="{urn:vim25}DesiredSoftwareSpecComponentSpec" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DesiredSoftwareSpec", propOrder = {
    "baseImageSpec",
    "vendorAddOnSpec",
    "components"
})
public class DesiredSoftwareSpec
    extends DynamicData
{

    @XmlElement(required = true)
    protected DesiredSoftwareSpecBaseImageSpec baseImageSpec;
    protected DesiredSoftwareSpecVendorAddOnSpec vendorAddOnSpec;
    protected List<DesiredSoftwareSpecComponentSpec> components;

    /**
     * Gets the value of the baseImageSpec property.
     * 
     * @return
     *     possible object is
     *     {@link DesiredSoftwareSpecBaseImageSpec }
     *     
     */
    public DesiredSoftwareSpecBaseImageSpec getBaseImageSpec() {
        return baseImageSpec;
    }

    /**
     * Sets the value of the baseImageSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link DesiredSoftwareSpecBaseImageSpec }
     *     
     */
    public void setBaseImageSpec(DesiredSoftwareSpecBaseImageSpec value) {
        this.baseImageSpec = value;
    }

    /**
     * Gets the value of the vendorAddOnSpec property.
     * 
     * @return
     *     possible object is
     *     {@link DesiredSoftwareSpecVendorAddOnSpec }
     *     
     */
    public DesiredSoftwareSpecVendorAddOnSpec getVendorAddOnSpec() {
        return vendorAddOnSpec;
    }

    /**
     * Sets the value of the vendorAddOnSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link DesiredSoftwareSpecVendorAddOnSpec }
     *     
     */
    public void setVendorAddOnSpec(DesiredSoftwareSpecVendorAddOnSpec value) {
        this.vendorAddOnSpec = value;
    }

    /**
     * Gets the value of the components property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the components property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComponents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DesiredSoftwareSpecComponentSpec }
     * 
     * 
     */
    public List<DesiredSoftwareSpecComponentSpec> getComponents() {
        if (components == null) {
            components = new ArrayList<DesiredSoftwareSpecComponentSpec>();
        }
        return this.components;
    }

}
