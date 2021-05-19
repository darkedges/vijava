
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostNvmeSpec complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HostNvmeSpec">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:vim25}DynamicData">
 *       &lt;sequence>
 *         &lt;element name="hbaName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="transportParameters" type="{urn:vim25}HostNvmeTransportParameters"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostNvmeSpec", propOrder = {
    "hbaName",
    "transportParameters"
})
@XmlSeeAlso({
    HostNvmeConnectSpec.class,
    HostNvmeDiscoverSpec.class
})
public class HostNvmeSpec
    extends DynamicData
{

    @XmlElement(required = true)
    protected String hbaName;
    @XmlElement(required = true)
    protected HostNvmeTransportParameters transportParameters;

    /**
     * Gets the value of the hbaName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHbaName() {
        return hbaName;
    }

    /**
     * Sets the value of the hbaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHbaName(String value) {
        this.hbaName = value;
    }

    /**
     * Gets the value of the transportParameters property.
     * 
     * @return
     *     possible object is
     *     {@link HostNvmeTransportParameters }
     *     
     */
    public HostNvmeTransportParameters getTransportParameters() {
        return transportParameters;
    }

    /**
     * Sets the value of the transportParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostNvmeTransportParameters }
     *     
     */
    public void setTransportParameters(HostNvmeTransportParameters value) {
        this.transportParameters = value;
    }

}
