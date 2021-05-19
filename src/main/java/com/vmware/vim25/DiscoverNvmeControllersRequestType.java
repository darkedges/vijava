
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DiscoverNvmeControllersRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiscoverNvmeControllersRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="_this" type="{urn:vim25}ManagedObjectReference"/>
 *         &lt;element name="discoverSpec" type="{urn:vim25}HostNvmeDiscoverSpec"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiscoverNvmeControllersRequestType", propOrder = {
    "_this",
    "discoverSpec"
})
public class DiscoverNvmeControllersRequestType {

    @XmlElement(required = true)
    protected ManagedObjectReference _this;
    @XmlElement(required = true)
    protected HostNvmeDiscoverSpec discoverSpec;

    /**
     * Gets the value of the this property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getThis() {
        return _this;
    }

    /**
     * Sets the value of the this property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setThis(ManagedObjectReference value) {
        this._this = value;
    }

    /**
     * Gets the value of the discoverSpec property.
     * 
     * @return
     *     possible object is
     *     {@link HostNvmeDiscoverSpec }
     *     
     */
    public HostNvmeDiscoverSpec getDiscoverSpec() {
        return discoverSpec;
    }

    /**
     * Sets the value of the discoverSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostNvmeDiscoverSpec }
     *     
     */
    public void setDiscoverSpec(HostNvmeDiscoverSpec value) {
        this.discoverSpec = value;
    }

}
