
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualMachineContentLibraryItemInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VirtualMachineContentLibraryItemInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:vim25}DynamicData">
 *       &lt;sequence>
 *         &lt;element name="contentLibraryItemUuid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="contentLibraryItemVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineContentLibraryItemInfo", propOrder = {
    "contentLibraryItemUuid",
    "contentLibraryItemVersion"
})
public class VirtualMachineContentLibraryItemInfo
    extends DynamicData
{

    @XmlElement(required = true)
    protected String contentLibraryItemUuid;
    protected String contentLibraryItemVersion;

    /**
     * Gets the value of the contentLibraryItemUuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentLibraryItemUuid() {
        return contentLibraryItemUuid;
    }

    /**
     * Sets the value of the contentLibraryItemUuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentLibraryItemUuid(String value) {
        this.contentLibraryItemUuid = value;
    }

    /**
     * Gets the value of the contentLibraryItemVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentLibraryItemVersion() {
        return contentLibraryItemVersion;
    }

    /**
     * Sets the value of the contentLibraryItemVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentLibraryItemVersion(String value) {
        this.contentLibraryItemVersion = value;
    }

}
