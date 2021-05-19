
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for HostTrustAuthorityAttestationInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HostTrustAuthorityAttestationInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:vim25}DynamicData">
 *       &lt;sequence>
 *         &lt;element name="attestationStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="serviceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="attestedAt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="attestedUntil" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="messages" type="{urn:vim25}LocalizableMessage" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostTrustAuthorityAttestationInfo", propOrder = {
    "attestationStatus",
    "serviceId",
    "attestedAt",
    "attestedUntil",
    "messages"
})
public class HostTrustAuthorityAttestationInfo
    extends DynamicData
{

    @XmlElement(required = true)
    protected String attestationStatus;
    protected String serviceId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar attestedAt;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar attestedUntil;
    protected List<LocalizableMessage> messages;

    /**
     * Gets the value of the attestationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttestationStatus() {
        return attestationStatus;
    }

    /**
     * Sets the value of the attestationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttestationStatus(String value) {
        this.attestationStatus = value;
    }

    /**
     * Gets the value of the serviceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceId() {
        return serviceId;
    }

    /**
     * Sets the value of the serviceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceId(String value) {
        this.serviceId = value;
    }

    /**
     * Gets the value of the attestedAt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAttestedAt() {
        return attestedAt;
    }

    /**
     * Sets the value of the attestedAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAttestedAt(XMLGregorianCalendar value) {
        this.attestedAt = value;
    }

    /**
     * Gets the value of the attestedUntil property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAttestedUntil() {
        return attestedUntil;
    }

    /**
     * Sets the value of the attestedUntil property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAttestedUntil(XMLGregorianCalendar value) {
        this.attestedUntil = value;
    }

    /**
     * Gets the value of the messages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocalizableMessage }
     * 
     * 
     */
    public List<LocalizableMessage> getMessages() {
        if (messages == null) {
            messages = new ArrayList<LocalizableMessage>();
        }
        return this.messages;
    }

}
