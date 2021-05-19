
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Capability complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Capability">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:vim25}DynamicData">
 *       &lt;sequence>
 *         &lt;element name="provisioningSupported" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="multiHostSupported" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="userShellAccessSupported" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="supportedEVCMode" type="{urn:vim25}EVCMode" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="supportedEVCGraphicsMode" type="{urn:vim25}FeatureEVCMode" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="networkBackupAndRestoreSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ftDrsWithoutEvcSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="hciWorkflowSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="computePolicyVersion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="clusterPlacementSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="lifecycleManagementSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="hostSeedingSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="scalableSharesSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="hadcsSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Capability", propOrder = {
    "provisioningSupported",
    "multiHostSupported",
    "userShellAccessSupported",
    "supportedEVCMode",
    "supportedEVCGraphicsMode",
    "networkBackupAndRestoreSupported",
    "ftDrsWithoutEvcSupported",
    "hciWorkflowSupported",
    "computePolicyVersion",
    "clusterPlacementSupported",
    "lifecycleManagementSupported",
    "hostSeedingSupported",
    "scalableSharesSupported",
    "hadcsSupported"
})
public class Capability
    extends DynamicData
{

    protected boolean provisioningSupported;
    protected boolean multiHostSupported;
    protected boolean userShellAccessSupported;
    protected List<EVCMode> supportedEVCMode;
    protected List<FeatureEVCMode> supportedEVCGraphicsMode;
    protected Boolean networkBackupAndRestoreSupported;
    protected Boolean ftDrsWithoutEvcSupported;
    protected Boolean hciWorkflowSupported;
    protected Integer computePolicyVersion;
    protected Boolean clusterPlacementSupported;
    protected Boolean lifecycleManagementSupported;
    protected Boolean hostSeedingSupported;
    protected Boolean scalableSharesSupported;
    protected Boolean hadcsSupported;

    /**
     * Gets the value of the provisioningSupported property.
     * 
     */
    public boolean isProvisioningSupported() {
        return provisioningSupported;
    }

    /**
     * Sets the value of the provisioningSupported property.
     * 
     */
    public void setProvisioningSupported(boolean value) {
        this.provisioningSupported = value;
    }

    /**
     * Gets the value of the multiHostSupported property.
     * 
     */
    public boolean isMultiHostSupported() {
        return multiHostSupported;
    }

    /**
     * Sets the value of the multiHostSupported property.
     * 
     */
    public void setMultiHostSupported(boolean value) {
        this.multiHostSupported = value;
    }

    /**
     * Gets the value of the userShellAccessSupported property.
     * 
     */
    public boolean isUserShellAccessSupported() {
        return userShellAccessSupported;
    }

    /**
     * Sets the value of the userShellAccessSupported property.
     * 
     */
    public void setUserShellAccessSupported(boolean value) {
        this.userShellAccessSupported = value;
    }

    /**
     * Gets the value of the supportedEVCMode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportedEVCMode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupportedEVCMode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EVCMode }
     * 
     * 
     */
    public List<EVCMode> getSupportedEVCMode() {
        if (supportedEVCMode == null) {
            supportedEVCMode = new ArrayList<EVCMode>();
        }
        return this.supportedEVCMode;
    }

    /**
     * Gets the value of the supportedEVCGraphicsMode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportedEVCGraphicsMode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupportedEVCGraphicsMode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeatureEVCMode }
     * 
     * 
     */
    public List<FeatureEVCMode> getSupportedEVCGraphicsMode() {
        if (supportedEVCGraphicsMode == null) {
            supportedEVCGraphicsMode = new ArrayList<FeatureEVCMode>();
        }
        return this.supportedEVCGraphicsMode;
    }

    /**
     * Gets the value of the networkBackupAndRestoreSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNetworkBackupAndRestoreSupported() {
        return networkBackupAndRestoreSupported;
    }

    /**
     * Sets the value of the networkBackupAndRestoreSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNetworkBackupAndRestoreSupported(Boolean value) {
        this.networkBackupAndRestoreSupported = value;
    }

    /**
     * Gets the value of the ftDrsWithoutEvcSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFtDrsWithoutEvcSupported() {
        return ftDrsWithoutEvcSupported;
    }

    /**
     * Sets the value of the ftDrsWithoutEvcSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFtDrsWithoutEvcSupported(Boolean value) {
        this.ftDrsWithoutEvcSupported = value;
    }

    /**
     * Gets the value of the hciWorkflowSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHciWorkflowSupported() {
        return hciWorkflowSupported;
    }

    /**
     * Sets the value of the hciWorkflowSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHciWorkflowSupported(Boolean value) {
        this.hciWorkflowSupported = value;
    }

    /**
     * Gets the value of the computePolicyVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getComputePolicyVersion() {
        return computePolicyVersion;
    }

    /**
     * Sets the value of the computePolicyVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setComputePolicyVersion(Integer value) {
        this.computePolicyVersion = value;
    }

    /**
     * Gets the value of the clusterPlacementSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClusterPlacementSupported() {
        return clusterPlacementSupported;
    }

    /**
     * Sets the value of the clusterPlacementSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClusterPlacementSupported(Boolean value) {
        this.clusterPlacementSupported = value;
    }

    /**
     * Gets the value of the lifecycleManagementSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLifecycleManagementSupported() {
        return lifecycleManagementSupported;
    }

    /**
     * Sets the value of the lifecycleManagementSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLifecycleManagementSupported(Boolean value) {
        this.lifecycleManagementSupported = value;
    }

    /**
     * Gets the value of the hostSeedingSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHostSeedingSupported() {
        return hostSeedingSupported;
    }

    /**
     * Sets the value of the hostSeedingSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHostSeedingSupported(Boolean value) {
        this.hostSeedingSupported = value;
    }

    /**
     * Gets the value of the scalableSharesSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isScalableSharesSupported() {
        return scalableSharesSupported;
    }

    /**
     * Sets the value of the scalableSharesSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setScalableSharesSupported(Boolean value) {
        this.scalableSharesSupported = value;
    }

    /**
     * Gets the value of the hadcsSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHadcsSupported() {
        return hadcsSupported;
    }

    /**
     * Sets the value of the hadcsSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHadcsSupported(Boolean value) {
        this.hadcsSupported = value;
    }

}
