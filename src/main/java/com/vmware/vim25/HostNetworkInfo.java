
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostNetworkInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HostNetworkInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:vim25}DynamicData">
 *       &lt;sequence>
 *         &lt;element name="vswitch" type="{urn:vim25}HostVirtualSwitch" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="proxySwitch" type="{urn:vim25}HostProxySwitch" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="portgroup" type="{urn:vim25}HostPortGroup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="pnic" type="{urn:vim25}PhysicalNic" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="rdmaDevice" type="{urn:vim25}HostRdmaDevice" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="vnic" type="{urn:vim25}HostVirtualNic" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="consoleVnic" type="{urn:vim25}HostVirtualNic" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="dnsConfig" type="{urn:vim25}HostDnsConfig" minOccurs="0"/>
 *         &lt;element name="ipRouteConfig" type="{urn:vim25}HostIpRouteConfig" minOccurs="0"/>
 *         &lt;element name="consoleIpRouteConfig" type="{urn:vim25}HostIpRouteConfig" minOccurs="0"/>
 *         &lt;element name="routeTableInfo" type="{urn:vim25}HostIpRouteTableInfo" minOccurs="0"/>
 *         &lt;element name="dhcp" type="{urn:vim25}HostDhcpService" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="nat" type="{urn:vim25}HostNatService" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ipV6Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="atBootIpV6Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="netStackInstance" type="{urn:vim25}HostNetStackInstance" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="opaqueSwitch" type="{urn:vim25}HostOpaqueSwitch" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="opaqueNetwork" type="{urn:vim25}HostOpaqueNetworkInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="nsxTransportNodeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nvdsToVdsMigrationRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="migrationStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostNetworkInfo", propOrder = {
    "vswitch",
    "proxySwitch",
    "portgroup",
    "pnic",
    "rdmaDevice",
    "vnic",
    "consoleVnic",
    "dnsConfig",
    "ipRouteConfig",
    "consoleIpRouteConfig",
    "routeTableInfo",
    "dhcp",
    "nat",
    "ipV6Enabled",
    "atBootIpV6Enabled",
    "netStackInstance",
    "opaqueSwitch",
    "opaqueNetwork",
    "nsxTransportNodeId",
    "nvdsToVdsMigrationRequired",
    "migrationStatus"
})
public class HostNetworkInfo
    extends DynamicData
{

    protected List<HostVirtualSwitch> vswitch;
    protected List<HostProxySwitch> proxySwitch;
    protected List<HostPortGroup> portgroup;
    protected List<PhysicalNic> pnic;
    protected List<HostRdmaDevice> rdmaDevice;
    protected List<HostVirtualNic> vnic;
    protected List<HostVirtualNic> consoleVnic;
    protected HostDnsConfig dnsConfig;
    protected HostIpRouteConfig ipRouteConfig;
    protected HostIpRouteConfig consoleIpRouteConfig;
    protected HostIpRouteTableInfo routeTableInfo;
    protected List<HostDhcpService> dhcp;
    protected List<HostNatService> nat;
    protected Boolean ipV6Enabled;
    protected Boolean atBootIpV6Enabled;
    protected List<HostNetStackInstance> netStackInstance;
    protected List<HostOpaqueSwitch> opaqueSwitch;
    protected List<HostOpaqueNetworkInfo> opaqueNetwork;
    protected String nsxTransportNodeId;
    protected Boolean nvdsToVdsMigrationRequired;
    protected String migrationStatus;

    /**
     * Gets the value of the vswitch property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vswitch property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVswitch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostVirtualSwitch }
     * 
     * 
     */
    public List<HostVirtualSwitch> getVswitch() {
        if (vswitch == null) {
            vswitch = new ArrayList<HostVirtualSwitch>();
        }
        return this.vswitch;
    }

    /**
     * Gets the value of the proxySwitch property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the proxySwitch property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProxySwitch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostProxySwitch }
     * 
     * 
     */
    public List<HostProxySwitch> getProxySwitch() {
        if (proxySwitch == null) {
            proxySwitch = new ArrayList<HostProxySwitch>();
        }
        return this.proxySwitch;
    }

    /**
     * Gets the value of the portgroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the portgroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPortgroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostPortGroup }
     * 
     * 
     */
    public List<HostPortGroup> getPortgroup() {
        if (portgroup == null) {
            portgroup = new ArrayList<HostPortGroup>();
        }
        return this.portgroup;
    }

    /**
     * Gets the value of the pnic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pnic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPnic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhysicalNic }
     * 
     * 
     */
    public List<PhysicalNic> getPnic() {
        if (pnic == null) {
            pnic = new ArrayList<PhysicalNic>();
        }
        return this.pnic;
    }

    /**
     * Gets the value of the rdmaDevice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rdmaDevice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRdmaDevice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostRdmaDevice }
     * 
     * 
     */
    public List<HostRdmaDevice> getRdmaDevice() {
        if (rdmaDevice == null) {
            rdmaDevice = new ArrayList<HostRdmaDevice>();
        }
        return this.rdmaDevice;
    }

    /**
     * Gets the value of the vnic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vnic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVnic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostVirtualNic }
     * 
     * 
     */
    public List<HostVirtualNic> getVnic() {
        if (vnic == null) {
            vnic = new ArrayList<HostVirtualNic>();
        }
        return this.vnic;
    }

    /**
     * Gets the value of the consoleVnic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consoleVnic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsoleVnic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostVirtualNic }
     * 
     * 
     */
    public List<HostVirtualNic> getConsoleVnic() {
        if (consoleVnic == null) {
            consoleVnic = new ArrayList<HostVirtualNic>();
        }
        return this.consoleVnic;
    }

    /**
     * Gets the value of the dnsConfig property.
     * 
     * @return
     *     possible object is
     *     {@link HostDnsConfig }
     *     
     */
    public HostDnsConfig getDnsConfig() {
        return dnsConfig;
    }

    /**
     * Sets the value of the dnsConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostDnsConfig }
     *     
     */
    public void setDnsConfig(HostDnsConfig value) {
        this.dnsConfig = value;
    }

    /**
     * Gets the value of the ipRouteConfig property.
     * 
     * @return
     *     possible object is
     *     {@link HostIpRouteConfig }
     *     
     */
    public HostIpRouteConfig getIpRouteConfig() {
        return ipRouteConfig;
    }

    /**
     * Sets the value of the ipRouteConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostIpRouteConfig }
     *     
     */
    public void setIpRouteConfig(HostIpRouteConfig value) {
        this.ipRouteConfig = value;
    }

    /**
     * Gets the value of the consoleIpRouteConfig property.
     * 
     * @return
     *     possible object is
     *     {@link HostIpRouteConfig }
     *     
     */
    public HostIpRouteConfig getConsoleIpRouteConfig() {
        return consoleIpRouteConfig;
    }

    /**
     * Sets the value of the consoleIpRouteConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostIpRouteConfig }
     *     
     */
    public void setConsoleIpRouteConfig(HostIpRouteConfig value) {
        this.consoleIpRouteConfig = value;
    }

    /**
     * Gets the value of the routeTableInfo property.
     * 
     * @return
     *     possible object is
     *     {@link HostIpRouteTableInfo }
     *     
     */
    public HostIpRouteTableInfo getRouteTableInfo() {
        return routeTableInfo;
    }

    /**
     * Sets the value of the routeTableInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostIpRouteTableInfo }
     *     
     */
    public void setRouteTableInfo(HostIpRouteTableInfo value) {
        this.routeTableInfo = value;
    }

    /**
     * Gets the value of the dhcp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dhcp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDhcp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostDhcpService }
     * 
     * 
     */
    public List<HostDhcpService> getDhcp() {
        if (dhcp == null) {
            dhcp = new ArrayList<HostDhcpService>();
        }
        return this.dhcp;
    }

    /**
     * Gets the value of the nat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostNatService }
     * 
     * 
     */
    public List<HostNatService> getNat() {
        if (nat == null) {
            nat = new ArrayList<HostNatService>();
        }
        return this.nat;
    }

    /**
     * Gets the value of the ipV6Enabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIpV6Enabled() {
        return ipV6Enabled;
    }

    /**
     * Sets the value of the ipV6Enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIpV6Enabled(Boolean value) {
        this.ipV6Enabled = value;
    }

    /**
     * Gets the value of the atBootIpV6Enabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAtBootIpV6Enabled() {
        return atBootIpV6Enabled;
    }

    /**
     * Sets the value of the atBootIpV6Enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAtBootIpV6Enabled(Boolean value) {
        this.atBootIpV6Enabled = value;
    }

    /**
     * Gets the value of the netStackInstance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the netStackInstance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNetStackInstance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostNetStackInstance }
     * 
     * 
     */
    public List<HostNetStackInstance> getNetStackInstance() {
        if (netStackInstance == null) {
            netStackInstance = new ArrayList<HostNetStackInstance>();
        }
        return this.netStackInstance;
    }

    /**
     * Gets the value of the opaqueSwitch property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the opaqueSwitch property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOpaqueSwitch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostOpaqueSwitch }
     * 
     * 
     */
    public List<HostOpaqueSwitch> getOpaqueSwitch() {
        if (opaqueSwitch == null) {
            opaqueSwitch = new ArrayList<HostOpaqueSwitch>();
        }
        return this.opaqueSwitch;
    }

    /**
     * Gets the value of the opaqueNetwork property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the opaqueNetwork property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOpaqueNetwork().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostOpaqueNetworkInfo }
     * 
     * 
     */
    public List<HostOpaqueNetworkInfo> getOpaqueNetwork() {
        if (opaqueNetwork == null) {
            opaqueNetwork = new ArrayList<HostOpaqueNetworkInfo>();
        }
        return this.opaqueNetwork;
    }

    /**
     * Gets the value of the nsxTransportNodeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNsxTransportNodeId() {
        return nsxTransportNodeId;
    }

    /**
     * Sets the value of the nsxTransportNodeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNsxTransportNodeId(String value) {
        this.nsxTransportNodeId = value;
    }

    /**
     * Gets the value of the nvdsToVdsMigrationRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNvdsToVdsMigrationRequired() {
        return nvdsToVdsMigrationRequired;
    }

    /**
     * Sets the value of the nvdsToVdsMigrationRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNvdsToVdsMigrationRequired(Boolean value) {
        this.nvdsToVdsMigrationRequired = value;
    }

    /**
     * Gets the value of the migrationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMigrationStatus() {
        return migrationStatus;
    }

    /**
     * Sets the value of the migrationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMigrationStatus(String value) {
        this.migrationStatus = value;
    }

}
