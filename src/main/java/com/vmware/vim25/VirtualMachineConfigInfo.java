
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
 * <p>Java class for VirtualMachineConfigInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VirtualMachineConfigInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:vim25}DynamicData">
 *       &lt;sequence>
 *         &lt;element name="changeVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="modified" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="guestFullName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="uuid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="createDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="instanceUuid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="npivNodeWorldWideName" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="npivPortWorldWideName" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="npivWorldWideNameType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="npivDesiredNodeWwns" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="npivDesiredPortWwns" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="npivTemporaryDisabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="npivOnNonRdmDisks" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="locationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="template" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="guestId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="alternateGuestName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="annotation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="files" type="{urn:vim25}VirtualMachineFileInfo"/>
 *         &lt;element name="tools" type="{urn:vim25}ToolsConfigInfo" minOccurs="0"/>
 *         &lt;element name="flags" type="{urn:vim25}VirtualMachineFlagInfo"/>
 *         &lt;element name="consolePreferences" type="{urn:vim25}VirtualMachineConsolePreferences" minOccurs="0"/>
 *         &lt;element name="defaultPowerOps" type="{urn:vim25}VirtualMachineDefaultPowerOpInfo"/>
 *         &lt;element name="hardware" type="{urn:vim25}VirtualHardware"/>
 *         &lt;element name="vcpuConfig" type="{urn:vim25}VirtualMachineVcpuConfig" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="cpuAllocation" type="{urn:vim25}ResourceAllocationInfo" minOccurs="0"/>
 *         &lt;element name="memoryAllocation" type="{urn:vim25}ResourceAllocationInfo" minOccurs="0"/>
 *         &lt;element name="latencySensitivity" type="{urn:vim25}LatencySensitivity" minOccurs="0"/>
 *         &lt;element name="memoryHotAddEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cpuHotAddEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cpuHotRemoveEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="hotPlugMemoryLimit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="hotPlugMemoryIncrementSize" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="cpuAffinity" type="{urn:vim25}VirtualMachineAffinityInfo" minOccurs="0"/>
 *         &lt;element name="memoryAffinity" type="{urn:vim25}VirtualMachineAffinityInfo" minOccurs="0"/>
 *         &lt;element name="networkShaper" type="{urn:vim25}VirtualMachineNetworkShaperInfo" minOccurs="0"/>
 *         &lt;element name="extraConfig" type="{urn:vim25}OptionValue" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="cpuFeatureMask" type="{urn:vim25}HostCpuIdInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="datastoreUrl" type="{urn:vim25}VirtualMachineConfigInfoDatastoreUrlPair" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="swapPlacement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bootOptions" type="{urn:vim25}VirtualMachineBootOptions" minOccurs="0"/>
 *         &lt;element name="ftInfo" type="{urn:vim25}FaultToleranceConfigInfo" minOccurs="0"/>
 *         &lt;element name="repConfig" type="{urn:vim25}ReplicationConfigSpec" minOccurs="0"/>
 *         &lt;element name="vAppConfig" type="{urn:vim25}VmConfigInfo" minOccurs="0"/>
 *         &lt;element name="vAssertsEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="changeTrackingEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="firmware" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maxMksConnections" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="guestAutoLockEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="managedBy" type="{urn:vim25}ManagedByInfo" minOccurs="0"/>
 *         &lt;element name="memoryReservationLockedToMax" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="initialOverhead" type="{urn:vim25}VirtualMachineConfigInfoOverheadInfo" minOccurs="0"/>
 *         &lt;element name="nestedHVEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="vPMCEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="scheduledHardwareUpgradeInfo" type="{urn:vim25}ScheduledHardwareUpgradeInfo" minOccurs="0"/>
 *         &lt;element name="forkConfigInfo" type="{urn:vim25}VirtualMachineForkConfigInfo" minOccurs="0"/>
 *         &lt;element name="vFlashCacheReservation" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="vmxConfigChecksum" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="messageBusTunnelEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="vmStorageObjectId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="swapStorageObjectId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="keyId" type="{urn:vim25}CryptoKeyId" minOccurs="0"/>
 *         &lt;element name="guestIntegrityInfo" type="{urn:vim25}VirtualMachineGuestIntegrityInfo" minOccurs="0"/>
 *         &lt;element name="migrateEncryption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sgxInfo" type="{urn:vim25}VirtualMachineSgxInfo" minOccurs="0"/>
 *         &lt;element name="contentLibItemInfo" type="{urn:vim25}VirtualMachineContentLibraryItemInfo" minOccurs="0"/>
 *         &lt;element name="ftEncryptionMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="guestMonitoringModeInfo" type="{urn:vim25}VirtualMachineGuestMonitoringModeInfo" minOccurs="0"/>
 *         &lt;element name="sevEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="pmemFailoverEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineConfigInfo", propOrder = {
    "changeVersion",
    "modified",
    "name",
    "guestFullName",
    "version",
    "uuid",
    "createDate",
    "instanceUuid",
    "npivNodeWorldWideName",
    "npivPortWorldWideName",
    "npivWorldWideNameType",
    "npivDesiredNodeWwns",
    "npivDesiredPortWwns",
    "npivTemporaryDisabled",
    "npivOnNonRdmDisks",
    "locationId",
    "template",
    "guestId",
    "alternateGuestName",
    "annotation",
    "files",
    "tools",
    "flags",
    "consolePreferences",
    "defaultPowerOps",
    "hardware",
    "vcpuConfig",
    "cpuAllocation",
    "memoryAllocation",
    "latencySensitivity",
    "memoryHotAddEnabled",
    "cpuHotAddEnabled",
    "cpuHotRemoveEnabled",
    "hotPlugMemoryLimit",
    "hotPlugMemoryIncrementSize",
    "cpuAffinity",
    "memoryAffinity",
    "networkShaper",
    "extraConfig",
    "cpuFeatureMask",
    "datastoreUrl",
    "swapPlacement",
    "bootOptions",
    "ftInfo",
    "repConfig",
    "vAppConfig",
    "vAssertsEnabled",
    "changeTrackingEnabled",
    "firmware",
    "maxMksConnections",
    "guestAutoLockEnabled",
    "managedBy",
    "memoryReservationLockedToMax",
    "initialOverhead",
    "nestedHVEnabled",
    "vpmcEnabled",
    "scheduledHardwareUpgradeInfo",
    "forkConfigInfo",
    "vFlashCacheReservation",
    "vmxConfigChecksum",
    "messageBusTunnelEnabled",
    "vmStorageObjectId",
    "swapStorageObjectId",
    "keyId",
    "guestIntegrityInfo",
    "migrateEncryption",
    "sgxInfo",
    "contentLibItemInfo",
    "ftEncryptionMode",
    "guestMonitoringModeInfo",
    "sevEnabled",
    "pmemFailoverEnabled"
})
public class VirtualMachineConfigInfo
    extends DynamicData
{

    @XmlElement(required = true)
    protected String changeVersion;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modified;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String guestFullName;
    @XmlElement(required = true)
    protected String version;
    @XmlElement(required = true)
    protected String uuid;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDate;
    protected String instanceUuid;
    @XmlElement(type = Long.class)
    protected List<Long> npivNodeWorldWideName;
    @XmlElement(type = Long.class)
    protected List<Long> npivPortWorldWideName;
    protected String npivWorldWideNameType;
    protected Short npivDesiredNodeWwns;
    protected Short npivDesiredPortWwns;
    protected Boolean npivTemporaryDisabled;
    protected Boolean npivOnNonRdmDisks;
    protected String locationId;
    protected boolean template;
    @XmlElement(required = true)
    protected String guestId;
    @XmlElement(required = true)
    protected String alternateGuestName;
    protected String annotation;
    @XmlElement(required = true)
    protected VirtualMachineFileInfo files;
    protected ToolsConfigInfo tools;
    @XmlElement(required = true)
    protected VirtualMachineFlagInfo flags;
    protected VirtualMachineConsolePreferences consolePreferences;
    @XmlElement(required = true)
    protected VirtualMachineDefaultPowerOpInfo defaultPowerOps;
    @XmlElement(required = true)
    protected VirtualHardware hardware;
    protected List<VirtualMachineVcpuConfig> vcpuConfig;
    protected ResourceAllocationInfo cpuAllocation;
    protected ResourceAllocationInfo memoryAllocation;
    protected LatencySensitivity latencySensitivity;
    protected Boolean memoryHotAddEnabled;
    protected Boolean cpuHotAddEnabled;
    protected Boolean cpuHotRemoveEnabled;
    protected Long hotPlugMemoryLimit;
    protected Long hotPlugMemoryIncrementSize;
    protected VirtualMachineAffinityInfo cpuAffinity;
    protected VirtualMachineAffinityInfo memoryAffinity;
    protected VirtualMachineNetworkShaperInfo networkShaper;
    protected List<OptionValue> extraConfig;
    protected List<HostCpuIdInfo> cpuFeatureMask;
    protected List<VirtualMachineConfigInfoDatastoreUrlPair> datastoreUrl;
    protected String swapPlacement;
    protected VirtualMachineBootOptions bootOptions;
    protected FaultToleranceConfigInfo ftInfo;
    protected ReplicationConfigSpec repConfig;
    protected VmConfigInfo vAppConfig;
    protected Boolean vAssertsEnabled;
    protected Boolean changeTrackingEnabled;
    protected String firmware;
    protected Integer maxMksConnections;
    protected Boolean guestAutoLockEnabled;
    protected ManagedByInfo managedBy;
    protected Boolean memoryReservationLockedToMax;
    protected VirtualMachineConfigInfoOverheadInfo initialOverhead;
    protected Boolean nestedHVEnabled;
    @XmlElement(name = "vPMCEnabled")
    protected Boolean vpmcEnabled;
    protected ScheduledHardwareUpgradeInfo scheduledHardwareUpgradeInfo;
    protected VirtualMachineForkConfigInfo forkConfigInfo;
    protected Long vFlashCacheReservation;
    protected byte[] vmxConfigChecksum;
    protected Boolean messageBusTunnelEnabled;
    protected String vmStorageObjectId;
    protected String swapStorageObjectId;
    protected CryptoKeyId keyId;
    protected VirtualMachineGuestIntegrityInfo guestIntegrityInfo;
    protected String migrateEncryption;
    protected VirtualMachineSgxInfo sgxInfo;
    protected VirtualMachineContentLibraryItemInfo contentLibItemInfo;
    protected String ftEncryptionMode;
    protected VirtualMachineGuestMonitoringModeInfo guestMonitoringModeInfo;
    protected Boolean sevEnabled;
    protected Boolean pmemFailoverEnabled;

    /**
     * Gets the value of the changeVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeVersion() {
        return changeVersion;
    }

    /**
     * Sets the value of the changeVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeVersion(String value) {
        this.changeVersion = value;
    }

    /**
     * Gets the value of the modified property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getModified() {
        return modified;
    }

    /**
     * Sets the value of the modified property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setModified(XMLGregorianCalendar value) {
        this.modified = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the guestFullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuestFullName() {
        return guestFullName;
    }

    /**
     * Sets the value of the guestFullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuestFullName(String value) {
        this.guestFullName = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the uuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * Sets the value of the uuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUuid(String value) {
        this.uuid = value;
    }

    /**
     * Gets the value of the createDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateDate() {
        return createDate;
    }

    /**
     * Sets the value of the createDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateDate(XMLGregorianCalendar value) {
        this.createDate = value;
    }

    /**
     * Gets the value of the instanceUuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstanceUuid() {
        return instanceUuid;
    }

    /**
     * Sets the value of the instanceUuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstanceUuid(String value) {
        this.instanceUuid = value;
    }

    /**
     * Gets the value of the npivNodeWorldWideName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the npivNodeWorldWideName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNpivNodeWorldWideName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getNpivNodeWorldWideName() {
        if (npivNodeWorldWideName == null) {
            npivNodeWorldWideName = new ArrayList<Long>();
        }
        return this.npivNodeWorldWideName;
    }

    /**
     * Gets the value of the npivPortWorldWideName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the npivPortWorldWideName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNpivPortWorldWideName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getNpivPortWorldWideName() {
        if (npivPortWorldWideName == null) {
            npivPortWorldWideName = new ArrayList<Long>();
        }
        return this.npivPortWorldWideName;
    }

    /**
     * Gets the value of the npivWorldWideNameType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNpivWorldWideNameType() {
        return npivWorldWideNameType;
    }

    /**
     * Sets the value of the npivWorldWideNameType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNpivWorldWideNameType(String value) {
        this.npivWorldWideNameType = value;
    }

    /**
     * Gets the value of the npivDesiredNodeWwns property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getNpivDesiredNodeWwns() {
        return npivDesiredNodeWwns;
    }

    /**
     * Sets the value of the npivDesiredNodeWwns property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setNpivDesiredNodeWwns(Short value) {
        this.npivDesiredNodeWwns = value;
    }

    /**
     * Gets the value of the npivDesiredPortWwns property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getNpivDesiredPortWwns() {
        return npivDesiredPortWwns;
    }

    /**
     * Sets the value of the npivDesiredPortWwns property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setNpivDesiredPortWwns(Short value) {
        this.npivDesiredPortWwns = value;
    }

    /**
     * Gets the value of the npivTemporaryDisabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNpivTemporaryDisabled() {
        return npivTemporaryDisabled;
    }

    /**
     * Sets the value of the npivTemporaryDisabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNpivTemporaryDisabled(Boolean value) {
        this.npivTemporaryDisabled = value;
    }

    /**
     * Gets the value of the npivOnNonRdmDisks property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNpivOnNonRdmDisks() {
        return npivOnNonRdmDisks;
    }

    /**
     * Sets the value of the npivOnNonRdmDisks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNpivOnNonRdmDisks(Boolean value) {
        this.npivOnNonRdmDisks = value;
    }

    /**
     * Gets the value of the locationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationId() {
        return locationId;
    }

    /**
     * Sets the value of the locationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationId(String value) {
        this.locationId = value;
    }

    /**
     * Gets the value of the template property.
     * 
     */
    public boolean isTemplate() {
        return template;
    }

    /**
     * Sets the value of the template property.
     * 
     */
    public void setTemplate(boolean value) {
        this.template = value;
    }

    /**
     * Gets the value of the guestId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuestId() {
        return guestId;
    }

    /**
     * Sets the value of the guestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuestId(String value) {
        this.guestId = value;
    }

    /**
     * Gets the value of the alternateGuestName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateGuestName() {
        return alternateGuestName;
    }

    /**
     * Sets the value of the alternateGuestName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternateGuestName(String value) {
        this.alternateGuestName = value;
    }

    /**
     * Gets the value of the annotation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnotation() {
        return annotation;
    }

    /**
     * Sets the value of the annotation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnotation(String value) {
        this.annotation = value;
    }

    /**
     * Gets the value of the files property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualMachineFileInfo }
     *     
     */
    public VirtualMachineFileInfo getFiles() {
        return files;
    }

    /**
     * Sets the value of the files property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualMachineFileInfo }
     *     
     */
    public void setFiles(VirtualMachineFileInfo value) {
        this.files = value;
    }

    /**
     * Gets the value of the tools property.
     * 
     * @return
     *     possible object is
     *     {@link ToolsConfigInfo }
     *     
     */
    public ToolsConfigInfo getTools() {
        return tools;
    }

    /**
     * Sets the value of the tools property.
     * 
     * @param value
     *     allowed object is
     *     {@link ToolsConfigInfo }
     *     
     */
    public void setTools(ToolsConfigInfo value) {
        this.tools = value;
    }

    /**
     * Gets the value of the flags property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualMachineFlagInfo }
     *     
     */
    public VirtualMachineFlagInfo getFlags() {
        return flags;
    }

    /**
     * Sets the value of the flags property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualMachineFlagInfo }
     *     
     */
    public void setFlags(VirtualMachineFlagInfo value) {
        this.flags = value;
    }

    /**
     * Gets the value of the consolePreferences property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualMachineConsolePreferences }
     *     
     */
    public VirtualMachineConsolePreferences getConsolePreferences() {
        return consolePreferences;
    }

    /**
     * Sets the value of the consolePreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualMachineConsolePreferences }
     *     
     */
    public void setConsolePreferences(VirtualMachineConsolePreferences value) {
        this.consolePreferences = value;
    }

    /**
     * Gets the value of the defaultPowerOps property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualMachineDefaultPowerOpInfo }
     *     
     */
    public VirtualMachineDefaultPowerOpInfo getDefaultPowerOps() {
        return defaultPowerOps;
    }

    /**
     * Sets the value of the defaultPowerOps property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualMachineDefaultPowerOpInfo }
     *     
     */
    public void setDefaultPowerOps(VirtualMachineDefaultPowerOpInfo value) {
        this.defaultPowerOps = value;
    }

    /**
     * Gets the value of the hardware property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualHardware }
     *     
     */
    public VirtualHardware getHardware() {
        return hardware;
    }

    /**
     * Sets the value of the hardware property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualHardware }
     *     
     */
    public void setHardware(VirtualHardware value) {
        this.hardware = value;
    }

    /**
     * Gets the value of the vcpuConfig property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vcpuConfig property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVcpuConfig().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VirtualMachineVcpuConfig }
     * 
     * 
     */
    public List<VirtualMachineVcpuConfig> getVcpuConfig() {
        if (vcpuConfig == null) {
            vcpuConfig = new ArrayList<VirtualMachineVcpuConfig>();
        }
        return this.vcpuConfig;
    }

    /**
     * Gets the value of the cpuAllocation property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceAllocationInfo }
     *     
     */
    public ResourceAllocationInfo getCpuAllocation() {
        return cpuAllocation;
    }

    /**
     * Sets the value of the cpuAllocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceAllocationInfo }
     *     
     */
    public void setCpuAllocation(ResourceAllocationInfo value) {
        this.cpuAllocation = value;
    }

    /**
     * Gets the value of the memoryAllocation property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceAllocationInfo }
     *     
     */
    public ResourceAllocationInfo getMemoryAllocation() {
        return memoryAllocation;
    }

    /**
     * Sets the value of the memoryAllocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceAllocationInfo }
     *     
     */
    public void setMemoryAllocation(ResourceAllocationInfo value) {
        this.memoryAllocation = value;
    }

    /**
     * Gets the value of the latencySensitivity property.
     * 
     * @return
     *     possible object is
     *     {@link LatencySensitivity }
     *     
     */
    public LatencySensitivity getLatencySensitivity() {
        return latencySensitivity;
    }

    /**
     * Sets the value of the latencySensitivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link LatencySensitivity }
     *     
     */
    public void setLatencySensitivity(LatencySensitivity value) {
        this.latencySensitivity = value;
    }

    /**
     * Gets the value of the memoryHotAddEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMemoryHotAddEnabled() {
        return memoryHotAddEnabled;
    }

    /**
     * Sets the value of the memoryHotAddEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMemoryHotAddEnabled(Boolean value) {
        this.memoryHotAddEnabled = value;
    }

    /**
     * Gets the value of the cpuHotAddEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCpuHotAddEnabled() {
        return cpuHotAddEnabled;
    }

    /**
     * Sets the value of the cpuHotAddEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCpuHotAddEnabled(Boolean value) {
        this.cpuHotAddEnabled = value;
    }

    /**
     * Gets the value of the cpuHotRemoveEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCpuHotRemoveEnabled() {
        return cpuHotRemoveEnabled;
    }

    /**
     * Sets the value of the cpuHotRemoveEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCpuHotRemoveEnabled(Boolean value) {
        this.cpuHotRemoveEnabled = value;
    }

    /**
     * Gets the value of the hotPlugMemoryLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHotPlugMemoryLimit() {
        return hotPlugMemoryLimit;
    }

    /**
     * Sets the value of the hotPlugMemoryLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHotPlugMemoryLimit(Long value) {
        this.hotPlugMemoryLimit = value;
    }

    /**
     * Gets the value of the hotPlugMemoryIncrementSize property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHotPlugMemoryIncrementSize() {
        return hotPlugMemoryIncrementSize;
    }

    /**
     * Sets the value of the hotPlugMemoryIncrementSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHotPlugMemoryIncrementSize(Long value) {
        this.hotPlugMemoryIncrementSize = value;
    }

    /**
     * Gets the value of the cpuAffinity property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualMachineAffinityInfo }
     *     
     */
    public VirtualMachineAffinityInfo getCpuAffinity() {
        return cpuAffinity;
    }

    /**
     * Sets the value of the cpuAffinity property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualMachineAffinityInfo }
     *     
     */
    public void setCpuAffinity(VirtualMachineAffinityInfo value) {
        this.cpuAffinity = value;
    }

    /**
     * Gets the value of the memoryAffinity property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualMachineAffinityInfo }
     *     
     */
    public VirtualMachineAffinityInfo getMemoryAffinity() {
        return memoryAffinity;
    }

    /**
     * Sets the value of the memoryAffinity property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualMachineAffinityInfo }
     *     
     */
    public void setMemoryAffinity(VirtualMachineAffinityInfo value) {
        this.memoryAffinity = value;
    }

    /**
     * Gets the value of the networkShaper property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualMachineNetworkShaperInfo }
     *     
     */
    public VirtualMachineNetworkShaperInfo getNetworkShaper() {
        return networkShaper;
    }

    /**
     * Sets the value of the networkShaper property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualMachineNetworkShaperInfo }
     *     
     */
    public void setNetworkShaper(VirtualMachineNetworkShaperInfo value) {
        this.networkShaper = value;
    }

    /**
     * Gets the value of the extraConfig property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extraConfig property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtraConfig().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OptionValue }
     * 
     * 
     */
    public List<OptionValue> getExtraConfig() {
        if (extraConfig == null) {
            extraConfig = new ArrayList<OptionValue>();
        }
        return this.extraConfig;
    }

    /**
     * Gets the value of the cpuFeatureMask property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cpuFeatureMask property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCpuFeatureMask().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostCpuIdInfo }
     * 
     * 
     */
    public List<HostCpuIdInfo> getCpuFeatureMask() {
        if (cpuFeatureMask == null) {
            cpuFeatureMask = new ArrayList<HostCpuIdInfo>();
        }
        return this.cpuFeatureMask;
    }

    /**
     * Gets the value of the datastoreUrl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datastoreUrl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatastoreUrl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VirtualMachineConfigInfoDatastoreUrlPair }
     * 
     * 
     */
    public List<VirtualMachineConfigInfoDatastoreUrlPair> getDatastoreUrl() {
        if (datastoreUrl == null) {
            datastoreUrl = new ArrayList<VirtualMachineConfigInfoDatastoreUrlPair>();
        }
        return this.datastoreUrl;
    }

    /**
     * Gets the value of the swapPlacement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwapPlacement() {
        return swapPlacement;
    }

    /**
     * Sets the value of the swapPlacement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwapPlacement(String value) {
        this.swapPlacement = value;
    }

    /**
     * Gets the value of the bootOptions property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualMachineBootOptions }
     *     
     */
    public VirtualMachineBootOptions getBootOptions() {
        return bootOptions;
    }

    /**
     * Sets the value of the bootOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualMachineBootOptions }
     *     
     */
    public void setBootOptions(VirtualMachineBootOptions value) {
        this.bootOptions = value;
    }

    /**
     * Gets the value of the ftInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FaultToleranceConfigInfo }
     *     
     */
    public FaultToleranceConfigInfo getFtInfo() {
        return ftInfo;
    }

    /**
     * Sets the value of the ftInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FaultToleranceConfigInfo }
     *     
     */
    public void setFtInfo(FaultToleranceConfigInfo value) {
        this.ftInfo = value;
    }

    /**
     * Gets the value of the repConfig property.
     * 
     * @return
     *     possible object is
     *     {@link ReplicationConfigSpec }
     *     
     */
    public ReplicationConfigSpec getRepConfig() {
        return repConfig;
    }

    /**
     * Sets the value of the repConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReplicationConfigSpec }
     *     
     */
    public void setRepConfig(ReplicationConfigSpec value) {
        this.repConfig = value;
    }

    /**
     * Gets the value of the vAppConfig property.
     * 
     * @return
     *     possible object is
     *     {@link VmConfigInfo }
     *     
     */
    public VmConfigInfo getVAppConfig() {
        return vAppConfig;
    }

    /**
     * Sets the value of the vAppConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link VmConfigInfo }
     *     
     */
    public void setVAppConfig(VmConfigInfo value) {
        this.vAppConfig = value;
    }

    /**
     * Gets the value of the vAssertsEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVAssertsEnabled() {
        return vAssertsEnabled;
    }

    /**
     * Sets the value of the vAssertsEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVAssertsEnabled(Boolean value) {
        this.vAssertsEnabled = value;
    }

    /**
     * Gets the value of the changeTrackingEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChangeTrackingEnabled() {
        return changeTrackingEnabled;
    }

    /**
     * Sets the value of the changeTrackingEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChangeTrackingEnabled(Boolean value) {
        this.changeTrackingEnabled = value;
    }

    /**
     * Gets the value of the firmware property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirmware() {
        return firmware;
    }

    /**
     * Sets the value of the firmware property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirmware(String value) {
        this.firmware = value;
    }

    /**
     * Gets the value of the maxMksConnections property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxMksConnections() {
        return maxMksConnections;
    }

    /**
     * Sets the value of the maxMksConnections property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxMksConnections(Integer value) {
        this.maxMksConnections = value;
    }

    /**
     * Gets the value of the guestAutoLockEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGuestAutoLockEnabled() {
        return guestAutoLockEnabled;
    }

    /**
     * Sets the value of the guestAutoLockEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGuestAutoLockEnabled(Boolean value) {
        this.guestAutoLockEnabled = value;
    }

    /**
     * Gets the value of the managedBy property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedByInfo }
     *     
     */
    public ManagedByInfo getManagedBy() {
        return managedBy;
    }

    /**
     * Sets the value of the managedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedByInfo }
     *     
     */
    public void setManagedBy(ManagedByInfo value) {
        this.managedBy = value;
    }

    /**
     * Gets the value of the memoryReservationLockedToMax property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMemoryReservationLockedToMax() {
        return memoryReservationLockedToMax;
    }

    /**
     * Sets the value of the memoryReservationLockedToMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMemoryReservationLockedToMax(Boolean value) {
        this.memoryReservationLockedToMax = value;
    }

    /**
     * Gets the value of the initialOverhead property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualMachineConfigInfoOverheadInfo }
     *     
     */
    public VirtualMachineConfigInfoOverheadInfo getInitialOverhead() {
        return initialOverhead;
    }

    /**
     * Sets the value of the initialOverhead property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualMachineConfigInfoOverheadInfo }
     *     
     */
    public void setInitialOverhead(VirtualMachineConfigInfoOverheadInfo value) {
        this.initialOverhead = value;
    }

    /**
     * Gets the value of the nestedHVEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNestedHVEnabled() {
        return nestedHVEnabled;
    }

    /**
     * Sets the value of the nestedHVEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNestedHVEnabled(Boolean value) {
        this.nestedHVEnabled = value;
    }

    /**
     * Gets the value of the vpmcEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVPMCEnabled() {
        return vpmcEnabled;
    }

    /**
     * Sets the value of the vpmcEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVPMCEnabled(Boolean value) {
        this.vpmcEnabled = value;
    }

    /**
     * Gets the value of the scheduledHardwareUpgradeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduledHardwareUpgradeInfo }
     *     
     */
    public ScheduledHardwareUpgradeInfo getScheduledHardwareUpgradeInfo() {
        return scheduledHardwareUpgradeInfo;
    }

    /**
     * Sets the value of the scheduledHardwareUpgradeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduledHardwareUpgradeInfo }
     *     
     */
    public void setScheduledHardwareUpgradeInfo(ScheduledHardwareUpgradeInfo value) {
        this.scheduledHardwareUpgradeInfo = value;
    }

    /**
     * Gets the value of the forkConfigInfo property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualMachineForkConfigInfo }
     *     
     */
    public VirtualMachineForkConfigInfo getForkConfigInfo() {
        return forkConfigInfo;
    }

    /**
     * Sets the value of the forkConfigInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualMachineForkConfigInfo }
     *     
     */
    public void setForkConfigInfo(VirtualMachineForkConfigInfo value) {
        this.forkConfigInfo = value;
    }

    /**
     * Gets the value of the vFlashCacheReservation property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVFlashCacheReservation() {
        return vFlashCacheReservation;
    }

    /**
     * Sets the value of the vFlashCacheReservation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVFlashCacheReservation(Long value) {
        this.vFlashCacheReservation = value;
    }

    /**
     * Gets the value of the vmxConfigChecksum property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getVmxConfigChecksum() {
        return vmxConfigChecksum;
    }

    /**
     * Sets the value of the vmxConfigChecksum property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setVmxConfigChecksum(byte[] value) {
        this.vmxConfigChecksum = value;
    }

    /**
     * Gets the value of the messageBusTunnelEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMessageBusTunnelEnabled() {
        return messageBusTunnelEnabled;
    }

    /**
     * Sets the value of the messageBusTunnelEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMessageBusTunnelEnabled(Boolean value) {
        this.messageBusTunnelEnabled = value;
    }

    /**
     * Gets the value of the vmStorageObjectId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVmStorageObjectId() {
        return vmStorageObjectId;
    }

    /**
     * Sets the value of the vmStorageObjectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVmStorageObjectId(String value) {
        this.vmStorageObjectId = value;
    }

    /**
     * Gets the value of the swapStorageObjectId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwapStorageObjectId() {
        return swapStorageObjectId;
    }

    /**
     * Sets the value of the swapStorageObjectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwapStorageObjectId(String value) {
        this.swapStorageObjectId = value;
    }

    /**
     * Gets the value of the keyId property.
     * 
     * @return
     *     possible object is
     *     {@link CryptoKeyId }
     *     
     */
    public CryptoKeyId getKeyId() {
        return keyId;
    }

    /**
     * Sets the value of the keyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CryptoKeyId }
     *     
     */
    public void setKeyId(CryptoKeyId value) {
        this.keyId = value;
    }

    /**
     * Gets the value of the guestIntegrityInfo property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualMachineGuestIntegrityInfo }
     *     
     */
    public VirtualMachineGuestIntegrityInfo getGuestIntegrityInfo() {
        return guestIntegrityInfo;
    }

    /**
     * Sets the value of the guestIntegrityInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualMachineGuestIntegrityInfo }
     *     
     */
    public void setGuestIntegrityInfo(VirtualMachineGuestIntegrityInfo value) {
        this.guestIntegrityInfo = value;
    }

    /**
     * Gets the value of the migrateEncryption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMigrateEncryption() {
        return migrateEncryption;
    }

    /**
     * Sets the value of the migrateEncryption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMigrateEncryption(String value) {
        this.migrateEncryption = value;
    }

    /**
     * Gets the value of the sgxInfo property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualMachineSgxInfo }
     *     
     */
    public VirtualMachineSgxInfo getSgxInfo() {
        return sgxInfo;
    }

    /**
     * Sets the value of the sgxInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualMachineSgxInfo }
     *     
     */
    public void setSgxInfo(VirtualMachineSgxInfo value) {
        this.sgxInfo = value;
    }

    /**
     * Gets the value of the contentLibItemInfo property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualMachineContentLibraryItemInfo }
     *     
     */
    public VirtualMachineContentLibraryItemInfo getContentLibItemInfo() {
        return contentLibItemInfo;
    }

    /**
     * Sets the value of the contentLibItemInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualMachineContentLibraryItemInfo }
     *     
     */
    public void setContentLibItemInfo(VirtualMachineContentLibraryItemInfo value) {
        this.contentLibItemInfo = value;
    }

    /**
     * Gets the value of the ftEncryptionMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFtEncryptionMode() {
        return ftEncryptionMode;
    }

    /**
     * Sets the value of the ftEncryptionMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFtEncryptionMode(String value) {
        this.ftEncryptionMode = value;
    }

    /**
     * Gets the value of the guestMonitoringModeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualMachineGuestMonitoringModeInfo }
     *     
     */
    public VirtualMachineGuestMonitoringModeInfo getGuestMonitoringModeInfo() {
        return guestMonitoringModeInfo;
    }

    /**
     * Sets the value of the guestMonitoringModeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualMachineGuestMonitoringModeInfo }
     *     
     */
    public void setGuestMonitoringModeInfo(VirtualMachineGuestMonitoringModeInfo value) {
        this.guestMonitoringModeInfo = value;
    }

    /**
     * Gets the value of the sevEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSevEnabled() {
        return sevEnabled;
    }

    /**
     * Sets the value of the sevEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSevEnabled(Boolean value) {
        this.sevEnabled = value;
    }

    /**
     * Gets the value of the pmemFailoverEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPmemFailoverEnabled() {
        return pmemFailoverEnabled;
    }

    /**
     * Sets the value of the pmemFailoverEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPmemFailoverEnabled(Boolean value) {
        this.pmemFailoverEnabled = value;
    }

}
