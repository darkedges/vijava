
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VsanDatastoreInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VsanDatastoreInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:vim25}DatastoreInfo">
 *       &lt;sequence>
 *         &lt;element name="membershipUuid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accessGenNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VsanDatastoreInfo", propOrder = {
    "membershipUuid",
    "accessGenNo"
})
public class VsanDatastoreInfo
    extends DatastoreInfo
{

    protected String membershipUuid;
    protected Integer accessGenNo;

    /**
     * Gets the value of the membershipUuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMembershipUuid() {
        return membershipUuid;
    }

    /**
     * Sets the value of the membershipUuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMembershipUuid(String value) {
        this.membershipUuid = value;
    }

    /**
     * Gets the value of the accessGenNo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAccessGenNo() {
        return accessGenNo;
    }

    /**
     * Sets the value of the accessGenNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAccessGenNo(Integer value) {
        this.accessGenNo = value;
    }

}
