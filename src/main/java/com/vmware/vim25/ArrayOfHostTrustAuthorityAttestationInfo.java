
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfHostTrustAuthorityAttestationInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfHostTrustAuthorityAttestationInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HostTrustAuthorityAttestationInfo" type="{urn:vim25}HostTrustAuthorityAttestationInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostTrustAuthorityAttestationInfo", propOrder = {
    "hostTrustAuthorityAttestationInfo"
})
public class ArrayOfHostTrustAuthorityAttestationInfo {

    @XmlElement(name = "HostTrustAuthorityAttestationInfo")
    protected List<HostTrustAuthorityAttestationInfo> hostTrustAuthorityAttestationInfo;

    /**
     * Gets the value of the hostTrustAuthorityAttestationInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostTrustAuthorityAttestationInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHostTrustAuthorityAttestationInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostTrustAuthorityAttestationInfo }
     * 
     * 
     */
    public List<HostTrustAuthorityAttestationInfo> getHostTrustAuthorityAttestationInfo() {
        if (hostTrustAuthorityAttestationInfo == null) {
            hostTrustAuthorityAttestationInfo = new ArrayList<HostTrustAuthorityAttestationInfo>();
        }
        return this.hostTrustAuthorityAttestationInfo;
    }

}
