
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
 * <p>Java class for HostRuntimeInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HostRuntimeInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:vim25}DynamicData">
 *       &lt;sequence>
 *         &lt;element name="connectionState" type="{urn:vim25}HostSystemConnectionState"/>
 *         &lt;element name="powerState" type="{urn:vim25}HostSystemPowerState"/>
 *         &lt;element name="standbyMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inMaintenanceMode" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="inQuarantineMode" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="bootTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="healthSystemRuntime" type="{urn:vim25}HealthSystemRuntime" minOccurs="0"/>
 *         &lt;element name="dasHostState" type="{urn:vim25}ClusterDasFdmHostState" minOccurs="0"/>
 *         &lt;element name="tpmPcrValues" type="{urn:vim25}HostTpmDigestInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="vsanRuntimeInfo" type="{urn:vim25}VsanHostRuntimeInfo" minOccurs="0"/>
 *         &lt;element name="networkRuntimeInfo" type="{urn:vim25}HostRuntimeInfoNetworkRuntimeInfo" minOccurs="0"/>
 *         &lt;element name="vFlashResourceRuntimeInfo" type="{urn:vim25}HostVFlashManagerVFlashResourceRunTimeInfo" minOccurs="0"/>
 *         &lt;element name="hostMaxVirtualDiskCapacity" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="cryptoState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cryptoKeyId" type="{urn:vim25}CryptoKeyId" minOccurs="0"/>
 *         &lt;element name="statelessNvdsMigrationReady" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostRuntimeInfo", propOrder = {
    "connectionState",
    "powerState",
    "standbyMode",
    "inMaintenanceMode",
    "inQuarantineMode",
    "bootTime",
    "healthSystemRuntime",
    "dasHostState",
    "tpmPcrValues",
    "vsanRuntimeInfo",
    "networkRuntimeInfo",
    "vFlashResourceRuntimeInfo",
    "hostMaxVirtualDiskCapacity",
    "cryptoState",
    "cryptoKeyId",
    "statelessNvdsMigrationReady"
})
public class HostRuntimeInfo
    extends DynamicData
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected HostSystemConnectionState connectionState;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected HostSystemPowerState powerState;
    protected String standbyMode;
    protected boolean inMaintenanceMode;
    protected Boolean inQuarantineMode;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar bootTime;
    protected HealthSystemRuntime healthSystemRuntime;
    protected ClusterDasFdmHostState dasHostState;
    protected List<HostTpmDigestInfo> tpmPcrValues;
    protected VsanHostRuntimeInfo vsanRuntimeInfo;
    protected HostRuntimeInfoNetworkRuntimeInfo networkRuntimeInfo;
    protected HostVFlashManagerVFlashResourceRunTimeInfo vFlashResourceRuntimeInfo;
    protected Long hostMaxVirtualDiskCapacity;
    protected String cryptoState;
    protected CryptoKeyId cryptoKeyId;
    protected String statelessNvdsMigrationReady;

    /**
     * Gets the value of the connectionState property.
     * 
     * @return
     *     possible object is
     *     {@link HostSystemConnectionState }
     *     
     */
    public HostSystemConnectionState getConnectionState() {
        return connectionState;
    }

    /**
     * Sets the value of the connectionState property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostSystemConnectionState }
     *     
     */
    public void setConnectionState(HostSystemConnectionState value) {
        this.connectionState = value;
    }

    /**
     * Gets the value of the powerState property.
     * 
     * @return
     *     possible object is
     *     {@link HostSystemPowerState }
     *     
     */
    public HostSystemPowerState getPowerState() {
        return powerState;
    }

    /**
     * Sets the value of the powerState property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostSystemPowerState }
     *     
     */
    public void setPowerState(HostSystemPowerState value) {
        this.powerState = value;
    }

    /**
     * Gets the value of the standbyMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandbyMode() {
        return standbyMode;
    }

    /**
     * Sets the value of the standbyMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandbyMode(String value) {
        this.standbyMode = value;
    }

    /**
     * Gets the value of the inMaintenanceMode property.
     * 
     */
    public boolean isInMaintenanceMode() {
        return inMaintenanceMode;
    }

    /**
     * Sets the value of the inMaintenanceMode property.
     * 
     */
    public void setInMaintenanceMode(boolean value) {
        this.inMaintenanceMode = value;
    }

    /**
     * Gets the value of the inQuarantineMode property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInQuarantineMode() {
        return inQuarantineMode;
    }

    /**
     * Sets the value of the inQuarantineMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInQuarantineMode(Boolean value) {
        this.inQuarantineMode = value;
    }

    /**
     * Gets the value of the bootTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBootTime() {
        return bootTime;
    }

    /**
     * Sets the value of the bootTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBootTime(XMLGregorianCalendar value) {
        this.bootTime = value;
    }

    /**
     * Gets the value of the healthSystemRuntime property.
     * 
     * @return
     *     possible object is
     *     {@link HealthSystemRuntime }
     *     
     */
    public HealthSystemRuntime getHealthSystemRuntime() {
        return healthSystemRuntime;
    }

    /**
     * Sets the value of the healthSystemRuntime property.
     * 
     * @param value
     *     allowed object is
     *     {@link HealthSystemRuntime }
     *     
     */
    public void setHealthSystemRuntime(HealthSystemRuntime value) {
        this.healthSystemRuntime = value;
    }

    /**
     * Gets the value of the dasHostState property.
     * 
     * @return
     *     possible object is
     *     {@link ClusterDasFdmHostState }
     *     
     */
    public ClusterDasFdmHostState getDasHostState() {
        return dasHostState;
    }

    /**
     * Sets the value of the dasHostState property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClusterDasFdmHostState }
     *     
     */
    public void setDasHostState(ClusterDasFdmHostState value) {
        this.dasHostState = value;
    }

    /**
     * Gets the value of the tpmPcrValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tpmPcrValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTpmPcrValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostTpmDigestInfo }
     * 
     * 
     */
    public List<HostTpmDigestInfo> getTpmPcrValues() {
        if (tpmPcrValues == null) {
            tpmPcrValues = new ArrayList<HostTpmDigestInfo>();
        }
        return this.tpmPcrValues;
    }

    /**
     * Gets the value of the vsanRuntimeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link VsanHostRuntimeInfo }
     *     
     */
    public VsanHostRuntimeInfo getVsanRuntimeInfo() {
        return vsanRuntimeInfo;
    }

    /**
     * Sets the value of the vsanRuntimeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link VsanHostRuntimeInfo }
     *     
     */
    public void setVsanRuntimeInfo(VsanHostRuntimeInfo value) {
        this.vsanRuntimeInfo = value;
    }

    /**
     * Gets the value of the networkRuntimeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link HostRuntimeInfoNetworkRuntimeInfo }
     *     
     */
    public HostRuntimeInfoNetworkRuntimeInfo getNetworkRuntimeInfo() {
        return networkRuntimeInfo;
    }

    /**
     * Sets the value of the networkRuntimeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostRuntimeInfoNetworkRuntimeInfo }
     *     
     */
    public void setNetworkRuntimeInfo(HostRuntimeInfoNetworkRuntimeInfo value) {
        this.networkRuntimeInfo = value;
    }

    /**
     * Gets the value of the vFlashResourceRuntimeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link HostVFlashManagerVFlashResourceRunTimeInfo }
     *     
     */
    public HostVFlashManagerVFlashResourceRunTimeInfo getVFlashResourceRuntimeInfo() {
        return vFlashResourceRuntimeInfo;
    }

    /**
     * Sets the value of the vFlashResourceRuntimeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostVFlashManagerVFlashResourceRunTimeInfo }
     *     
     */
    public void setVFlashResourceRuntimeInfo(HostVFlashManagerVFlashResourceRunTimeInfo value) {
        this.vFlashResourceRuntimeInfo = value;
    }

    /**
     * Gets the value of the hostMaxVirtualDiskCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHostMaxVirtualDiskCapacity() {
        return hostMaxVirtualDiskCapacity;
    }

    /**
     * Sets the value of the hostMaxVirtualDiskCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHostMaxVirtualDiskCapacity(Long value) {
        this.hostMaxVirtualDiskCapacity = value;
    }

    /**
     * Gets the value of the cryptoState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCryptoState() {
        return cryptoState;
    }

    /**
     * Sets the value of the cryptoState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCryptoState(String value) {
        this.cryptoState = value;
    }

    /**
     * Gets the value of the cryptoKeyId property.
     * 
     * @return
     *     possible object is
     *     {@link CryptoKeyId }
     *     
     */
    public CryptoKeyId getCryptoKeyId() {
        return cryptoKeyId;
    }

    /**
     * Sets the value of the cryptoKeyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CryptoKeyId }
     *     
     */
    public void setCryptoKeyId(CryptoKeyId value) {
        this.cryptoKeyId = value;
    }

    /**
     * Gets the value of the statelessNvdsMigrationReady property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatelessNvdsMigrationReady() {
        return statelessNvdsMigrationReady;
    }

    /**
     * Sets the value of the statelessNvdsMigrationReady property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatelessNvdsMigrationReady(String value) {
        this.statelessNvdsMigrationReady = value;
    }

}
