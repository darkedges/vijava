
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfHttpNfcLeaseProbeResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfHttpNfcLeaseProbeResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HttpNfcLeaseProbeResult" type="{urn:vim25}HttpNfcLeaseProbeResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHttpNfcLeaseProbeResult", propOrder = {
    "httpNfcLeaseProbeResult"
})
public class ArrayOfHttpNfcLeaseProbeResult {

    @XmlElement(name = "HttpNfcLeaseProbeResult")
    protected List<HttpNfcLeaseProbeResult> httpNfcLeaseProbeResult;

    /**
     * Gets the value of the httpNfcLeaseProbeResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the httpNfcLeaseProbeResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHttpNfcLeaseProbeResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HttpNfcLeaseProbeResult }
     * 
     * 
     */
    public List<HttpNfcLeaseProbeResult> getHttpNfcLeaseProbeResult() {
        if (httpNfcLeaseProbeResult == null) {
            httpNfcLeaseProbeResult = new ArrayList<HttpNfcLeaseProbeResult>();
        }
        return this.httpNfcLeaseProbeResult;
    }

}
