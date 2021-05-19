
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DistributedVirtualSwitchHostMemberConfigInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DistributedVirtualSwitchHostMemberConfigInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:vim25}DynamicData">
 *       &lt;sequence>
 *         &lt;element name="host" type="{urn:vim25}ManagedObjectReference" minOccurs="0"/>
 *         &lt;element name="maxProxySwitchPorts" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="vendorSpecificConfig" type="{urn:vim25}DistributedVirtualSwitchKeyedOpaqueBlob" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="backing" type="{urn:vim25}DistributedVirtualSwitchHostMemberBacking"/>
 *         &lt;element name="nsxSwitch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ensEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ensInterruptEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="transportZones" type="{urn:vim25}DistributedVirtualSwitchHostMemberTransportZoneInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="nsxtUsedUplinkNames" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistributedVirtualSwitchHostMemberConfigInfo", propOrder = {
    "host",
    "maxProxySwitchPorts",
    "vendorSpecificConfig",
    "backing",
    "nsxSwitch",
    "ensEnabled",
    "ensInterruptEnabled",
    "transportZones",
    "nsxtUsedUplinkNames"
})
public class DistributedVirtualSwitchHostMemberConfigInfo
    extends DynamicData
{

    protected ManagedObjectReference host;
    protected int maxProxySwitchPorts;
    protected List<DistributedVirtualSwitchKeyedOpaqueBlob> vendorSpecificConfig;
    @XmlElement(required = true)
    protected DistributedVirtualSwitchHostMemberBacking backing;
    protected Boolean nsxSwitch;
    protected Boolean ensEnabled;
    protected Boolean ensInterruptEnabled;
    protected List<DistributedVirtualSwitchHostMemberTransportZoneInfo> transportZones;
    protected List<String> nsxtUsedUplinkNames;

    /**
     * Gets the value of the host property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getHost() {
        return host;
    }

    /**
     * Sets the value of the host property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setHost(ManagedObjectReference value) {
        this.host = value;
    }

    /**
     * Gets the value of the maxProxySwitchPorts property.
     * 
     */
    public int getMaxProxySwitchPorts() {
        return maxProxySwitchPorts;
    }

    /**
     * Sets the value of the maxProxySwitchPorts property.
     * 
     */
    public void setMaxProxySwitchPorts(int value) {
        this.maxProxySwitchPorts = value;
    }

    /**
     * Gets the value of the vendorSpecificConfig property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vendorSpecificConfig property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVendorSpecificConfig().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DistributedVirtualSwitchKeyedOpaqueBlob }
     * 
     * 
     */
    public List<DistributedVirtualSwitchKeyedOpaqueBlob> getVendorSpecificConfig() {
        if (vendorSpecificConfig == null) {
            vendorSpecificConfig = new ArrayList<DistributedVirtualSwitchKeyedOpaqueBlob>();
        }
        return this.vendorSpecificConfig;
    }

    /**
     * Gets the value of the backing property.
     * 
     * @return
     *     possible object is
     *     {@link DistributedVirtualSwitchHostMemberBacking }
     *     
     */
    public DistributedVirtualSwitchHostMemberBacking getBacking() {
        return backing;
    }

    /**
     * Sets the value of the backing property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributedVirtualSwitchHostMemberBacking }
     *     
     */
    public void setBacking(DistributedVirtualSwitchHostMemberBacking value) {
        this.backing = value;
    }

    /**
     * Gets the value of the nsxSwitch property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNsxSwitch() {
        return nsxSwitch;
    }

    /**
     * Sets the value of the nsxSwitch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNsxSwitch(Boolean value) {
        this.nsxSwitch = value;
    }

    /**
     * Gets the value of the ensEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnsEnabled() {
        return ensEnabled;
    }

    /**
     * Sets the value of the ensEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnsEnabled(Boolean value) {
        this.ensEnabled = value;
    }

    /**
     * Gets the value of the ensInterruptEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnsInterruptEnabled() {
        return ensInterruptEnabled;
    }

    /**
     * Sets the value of the ensInterruptEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnsInterruptEnabled(Boolean value) {
        this.ensInterruptEnabled = value;
    }

    /**
     * Gets the value of the transportZones property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transportZones property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransportZones().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DistributedVirtualSwitchHostMemberTransportZoneInfo }
     * 
     * 
     */
    public List<DistributedVirtualSwitchHostMemberTransportZoneInfo> getTransportZones() {
        if (transportZones == null) {
            transportZones = new ArrayList<DistributedVirtualSwitchHostMemberTransportZoneInfo>();
        }
        return this.transportZones;
    }

    /**
     * Gets the value of the nsxtUsedUplinkNames property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nsxtUsedUplinkNames property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNsxtUsedUplinkNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNsxtUsedUplinkNames() {
        if (nsxtUsedUplinkNames == null) {
            nsxtUsedUplinkNames = new ArrayList<String>();
        }
        return this.nsxtUsedUplinkNames;
    }

}
