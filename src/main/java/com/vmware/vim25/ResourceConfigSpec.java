
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ResourceConfigSpec complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResourceConfigSpec">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:vim25}DynamicData">
 *       &lt;sequence>
 *         &lt;element name="entity" type="{urn:vim25}ManagedObjectReference" minOccurs="0"/>
 *         &lt;element name="changeVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastModified" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="cpuAllocation" type="{urn:vim25}ResourceAllocationInfo"/>
 *         &lt;element name="memoryAllocation" type="{urn:vim25}ResourceAllocationInfo"/>
 *         &lt;element name="scaleDescendantsShares" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourceConfigSpec", propOrder = {
    "entity",
    "changeVersion",
    "lastModified",
    "cpuAllocation",
    "memoryAllocation",
    "scaleDescendantsShares"
})
public class ResourceConfigSpec
    extends DynamicData
{

    protected ManagedObjectReference entity;
    protected String changeVersion;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModified;
    @XmlElement(required = true)
    protected ResourceAllocationInfo cpuAllocation;
    @XmlElement(required = true)
    protected ResourceAllocationInfo memoryAllocation;
    protected String scaleDescendantsShares;

    /**
     * Gets the value of the entity property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getEntity() {
        return entity;
    }

    /**
     * Sets the value of the entity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setEntity(ManagedObjectReference value) {
        this.entity = value;
    }

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
     * Gets the value of the lastModified property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModified() {
        return lastModified;
    }

    /**
     * Sets the value of the lastModified property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModified(XMLGregorianCalendar value) {
        this.lastModified = value;
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
     * Gets the value of the scaleDescendantsShares property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScaleDescendantsShares() {
        return scaleDescendantsShares;
    }

    /**
     * Sets the value of the scaleDescendantsShares property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScaleDescendantsShares(String value) {
        this.scaleDescendantsShares = value;
    }

}
