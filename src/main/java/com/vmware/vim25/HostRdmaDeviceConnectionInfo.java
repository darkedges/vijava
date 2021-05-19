
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostRdmaDeviceConnectionInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HostRdmaDeviceConnectionInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:vim25}DynamicData">
 *       &lt;sequence>
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mtu" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="speedInMbps" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostRdmaDeviceConnectionInfo", propOrder = {
    "state",
    "mtu",
    "speedInMbps"
})
public class HostRdmaDeviceConnectionInfo
    extends DynamicData
{

    @XmlElement(required = true)
    protected String state;
    protected int mtu;
    protected int speedInMbps;

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the mtu property.
     * 
     */
    public int getMtu() {
        return mtu;
    }

    /**
     * Sets the value of the mtu property.
     * 
     */
    public void setMtu(int value) {
        this.mtu = value;
    }

    /**
     * Gets the value of the speedInMbps property.
     * 
     */
    public int getSpeedInMbps() {
        return speedInMbps;
    }

    /**
     * Sets the value of the speedInMbps property.
     * 
     */
    public void setSpeedInMbps(int value) {
        this.speedInMbps = value;
    }

}
