
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostProxySwitch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HostProxySwitch">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:vim25}DynamicData">
 *       &lt;sequence>
 *         &lt;element name="dvsUuid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dvsName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numPorts" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="configNumPorts" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numPortsAvailable" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="uplinkPort" type="{urn:vim25}KeyValue" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="mtu" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="pnic" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="spec" type="{urn:vim25}HostProxySwitchSpec"/>
 *         &lt;element name="hostLag" type="{urn:vim25}HostProxySwitchHostLagConfig" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="networkReservationSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="nsxtEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ensEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ensInterruptEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="transportZones" type="{urn:vim25}DistributedVirtualSwitchHostMemberTransportZoneInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="nsxUsedUplinkPort" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="nsxtStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nsxtStatusDetail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostProxySwitch", propOrder = {
    "dvsUuid",
    "dvsName",
    "key",
    "numPorts",
    "configNumPorts",
    "numPortsAvailable",
    "uplinkPort",
    "mtu",
    "pnic",
    "spec",
    "hostLag",
    "networkReservationSupported",
    "nsxtEnabled",
    "ensEnabled",
    "ensInterruptEnabled",
    "transportZones",
    "nsxUsedUplinkPort",
    "nsxtStatus",
    "nsxtStatusDetail"
})
public class HostProxySwitch
    extends DynamicData
{

    @XmlElement(required = true)
    protected String dvsUuid;
    @XmlElement(required = true)
    protected String dvsName;
    @XmlElement(required = true)
    protected String key;
    protected int numPorts;
    protected Integer configNumPorts;
    protected int numPortsAvailable;
    protected List<KeyValue> uplinkPort;
    protected Integer mtu;
    protected List<String> pnic;
    @XmlElement(required = true)
    protected HostProxySwitchSpec spec;
    protected List<HostProxySwitchHostLagConfig> hostLag;
    protected Boolean networkReservationSupported;
    protected Boolean nsxtEnabled;
    protected Boolean ensEnabled;
    protected Boolean ensInterruptEnabled;
    protected List<DistributedVirtualSwitchHostMemberTransportZoneInfo> transportZones;
    protected List<String> nsxUsedUplinkPort;
    protected String nsxtStatus;
    protected String nsxtStatusDetail;

    /**
     * Gets the value of the dvsUuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDvsUuid() {
        return dvsUuid;
    }

    /**
     * Sets the value of the dvsUuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDvsUuid(String value) {
        this.dvsUuid = value;
    }

    /**
     * Gets the value of the dvsName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDvsName() {
        return dvsName;
    }

    /**
     * Sets the value of the dvsName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDvsName(String value) {
        this.dvsName = value;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Gets the value of the numPorts property.
     * 
     */
    public int getNumPorts() {
        return numPorts;
    }

    /**
     * Sets the value of the numPorts property.
     * 
     */
    public void setNumPorts(int value) {
        this.numPorts = value;
    }

    /**
     * Gets the value of the configNumPorts property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConfigNumPorts() {
        return configNumPorts;
    }

    /**
     * Sets the value of the configNumPorts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConfigNumPorts(Integer value) {
        this.configNumPorts = value;
    }

    /**
     * Gets the value of the numPortsAvailable property.
     * 
     */
    public int getNumPortsAvailable() {
        return numPortsAvailable;
    }

    /**
     * Sets the value of the numPortsAvailable property.
     * 
     */
    public void setNumPortsAvailable(int value) {
        this.numPortsAvailable = value;
    }

    /**
     * Gets the value of the uplinkPort property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uplinkPort property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUplinkPort().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyValue }
     * 
     * 
     */
    public List<KeyValue> getUplinkPort() {
        if (uplinkPort == null) {
            uplinkPort = new ArrayList<KeyValue>();
        }
        return this.uplinkPort;
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
     * {@link String }
     * 
     * 
     */
    public List<String> getPnic() {
        if (pnic == null) {
            pnic = new ArrayList<String>();
        }
        return this.pnic;
    }

    /**
     * Gets the value of the spec property.
     * 
     * @return
     *     possible object is
     *     {@link HostProxySwitchSpec }
     *     
     */
    public HostProxySwitchSpec getSpec() {
        return spec;
    }

    /**
     * Sets the value of the spec property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostProxySwitchSpec }
     *     
     */
    public void setSpec(HostProxySwitchSpec value) {
        this.spec = value;
    }

    /**
     * Gets the value of the hostLag property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostLag property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHostLag().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostProxySwitchHostLagConfig }
     * 
     * 
     */
    public List<HostProxySwitchHostLagConfig> getHostLag() {
        if (hostLag == null) {
            hostLag = new ArrayList<HostProxySwitchHostLagConfig>();
        }
        return this.hostLag;
    }

    /**
     * Gets the value of the networkReservationSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNetworkReservationSupported() {
        return networkReservationSupported;
    }

    /**
     * Sets the value of the networkReservationSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNetworkReservationSupported(Boolean value) {
        this.networkReservationSupported = value;
    }

    /**
     * Gets the value of the nsxtEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNsxtEnabled() {
        return nsxtEnabled;
    }

    /**
     * Sets the value of the nsxtEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNsxtEnabled(Boolean value) {
        this.nsxtEnabled = value;
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
     * Gets the value of the nsxUsedUplinkPort property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nsxUsedUplinkPort property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNsxUsedUplinkPort().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNsxUsedUplinkPort() {
        if (nsxUsedUplinkPort == null) {
            nsxUsedUplinkPort = new ArrayList<String>();
        }
        return this.nsxUsedUplinkPort;
    }

    /**
     * Gets the value of the nsxtStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNsxtStatus() {
        return nsxtStatus;
    }

    /**
     * Sets the value of the nsxtStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNsxtStatus(String value) {
        this.nsxtStatus = value;
    }

    /**
     * Gets the value of the nsxtStatusDetail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNsxtStatusDetail() {
        return nsxtStatusDetail;
    }

    /**
     * Sets the value of the nsxtStatusDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNsxtStatusDetail(String value) {
        this.nsxtStatusDetail = value;
    }

}
