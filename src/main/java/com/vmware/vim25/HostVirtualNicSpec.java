
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostVirtualNicSpec complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HostVirtualNicSpec">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:vim25}DynamicData">
 *       &lt;sequence>
 *         &lt;element name="ip" type="{urn:vim25}HostIpConfig" minOccurs="0"/>
 *         &lt;element name="mac" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distributedVirtualPort" type="{urn:vim25}DistributedVirtualSwitchPortConnection" minOccurs="0"/>
 *         &lt;element name="portgroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mtu" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tsoEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="netStackInstanceKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="opaqueNetwork" type="{urn:vim25}HostVirtualNicOpaqueNetworkSpec" minOccurs="0"/>
 *         &lt;element name="externalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pinnedPnic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ipRouteSpec" type="{urn:vim25}HostVirtualNicIpRouteSpec" minOccurs="0"/>
 *         &lt;element name="systemOwned" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostVirtualNicSpec", propOrder = {
    "ip",
    "mac",
    "distributedVirtualPort",
    "portgroup",
    "mtu",
    "tsoEnabled",
    "netStackInstanceKey",
    "opaqueNetwork",
    "externalId",
    "pinnedPnic",
    "ipRouteSpec",
    "systemOwned"
})
public class HostVirtualNicSpec
    extends DynamicData
{

    protected HostIpConfig ip;
    protected String mac;
    protected DistributedVirtualSwitchPortConnection distributedVirtualPort;
    protected String portgroup;
    protected Integer mtu;
    protected Boolean tsoEnabled;
    protected String netStackInstanceKey;
    protected HostVirtualNicOpaqueNetworkSpec opaqueNetwork;
    protected String externalId;
    protected String pinnedPnic;
    protected HostVirtualNicIpRouteSpec ipRouteSpec;
    protected Boolean systemOwned;

    /**
     * Gets the value of the ip property.
     * 
     * @return
     *     possible object is
     *     {@link HostIpConfig }
     *     
     */
    public HostIpConfig getIp() {
        return ip;
    }

    /**
     * Sets the value of the ip property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostIpConfig }
     *     
     */
    public void setIp(HostIpConfig value) {
        this.ip = value;
    }

    /**
     * Gets the value of the mac property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMac() {
        return mac;
    }

    /**
     * Sets the value of the mac property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMac(String value) {
        this.mac = value;
    }

    /**
     * Gets the value of the distributedVirtualPort property.
     * 
     * @return
     *     possible object is
     *     {@link DistributedVirtualSwitchPortConnection }
     *     
     */
    public DistributedVirtualSwitchPortConnection getDistributedVirtualPort() {
        return distributedVirtualPort;
    }

    /**
     * Sets the value of the distributedVirtualPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributedVirtualSwitchPortConnection }
     *     
     */
    public void setDistributedVirtualPort(DistributedVirtualSwitchPortConnection value) {
        this.distributedVirtualPort = value;
    }

    /**
     * Gets the value of the portgroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortgroup() {
        return portgroup;
    }

    /**
     * Sets the value of the portgroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortgroup(String value) {
        this.portgroup = value;
    }

    /**
     * Gets the value of the mtu property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMtu() {
        return mtu;
    }

    /**
     * Sets the value of the mtu property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMtu(Integer value) {
        this.mtu = value;
    }

    /**
     * Gets the value of the tsoEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTsoEnabled() {
        return tsoEnabled;
    }

    /**
     * Sets the value of the tsoEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTsoEnabled(Boolean value) {
        this.tsoEnabled = value;
    }

    /**
     * Gets the value of the netStackInstanceKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetStackInstanceKey() {
        return netStackInstanceKey;
    }

    /**
     * Sets the value of the netStackInstanceKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetStackInstanceKey(String value) {
        this.netStackInstanceKey = value;
    }

    /**
     * Gets the value of the opaqueNetwork property.
     * 
     * @return
     *     possible object is
     *     {@link HostVirtualNicOpaqueNetworkSpec }
     *     
     */
    public HostVirtualNicOpaqueNetworkSpec getOpaqueNetwork() {
        return opaqueNetwork;
    }

    /**
     * Sets the value of the opaqueNetwork property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostVirtualNicOpaqueNetworkSpec }
     *     
     */
    public void setOpaqueNetwork(HostVirtualNicOpaqueNetworkSpec value) {
        this.opaqueNetwork = value;
    }

    /**
     * Gets the value of the externalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalId() {
        return externalId;
    }

    /**
     * Sets the value of the externalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalId(String value) {
        this.externalId = value;
    }

    /**
     * Gets the value of the pinnedPnic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPinnedPnic() {
        return pinnedPnic;
    }

    /**
     * Sets the value of the pinnedPnic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPinnedPnic(String value) {
        this.pinnedPnic = value;
    }

    /**
     * Gets the value of the ipRouteSpec property.
     * 
     * @return
     *     possible object is
     *     {@link HostVirtualNicIpRouteSpec }
     *     
     */
    public HostVirtualNicIpRouteSpec getIpRouteSpec() {
        return ipRouteSpec;
    }

    /**
     * Sets the value of the ipRouteSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostVirtualNicIpRouteSpec }
     *     
     */
    public void setIpRouteSpec(HostVirtualNicIpRouteSpec value) {
        this.ipRouteSpec = value;
    }

    /**
     * Gets the value of the systemOwned property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSystemOwned() {
        return systemOwned;
    }

    /**
     * Sets the value of the systemOwned property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSystemOwned(Boolean value) {
        this.systemOwned = value;
    }

}
