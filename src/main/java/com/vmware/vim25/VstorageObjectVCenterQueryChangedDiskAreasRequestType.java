
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VstorageObjectVCenterQueryChangedDiskAreasRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VstorageObjectVCenterQueryChangedDiskAreasRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="_this" type="{urn:vim25}ManagedObjectReference"/>
 *         &lt;element name="id" type="{urn:vim25}ID"/>
 *         &lt;element name="datastore" type="{urn:vim25}ManagedObjectReference"/>
 *         &lt;element name="snapshotId" type="{urn:vim25}ID"/>
 *         &lt;element name="startOffset" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="changeId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VstorageObjectVCenterQueryChangedDiskAreasRequestType", propOrder = {
    "_this",
    "id",
    "datastore",
    "snapshotId",
    "startOffset",
    "changeId"
})
public class VstorageObjectVCenterQueryChangedDiskAreasRequestType {

    @XmlElement(required = true)
    protected ManagedObjectReference _this;
    @XmlElement(required = true)
    protected ID id;
    @XmlElement(required = true)
    protected ManagedObjectReference datastore;
    @XmlElement(required = true)
    protected ID snapshotId;
    protected long startOffset;
    @XmlElement(required = true)
    protected String changeId;

    /**
     * Gets the value of the this property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getThis() {
        return _this;
    }

    /**
     * Sets the value of the this property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setThis(ManagedObjectReference value) {
        this._this = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link ID }
     *     
     */
    public ID getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link ID }
     *     
     */
    public void setId(ID value) {
        this.id = value;
    }

    /**
     * Gets the value of the datastore property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getDatastore() {
        return datastore;
    }

    /**
     * Sets the value of the datastore property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setDatastore(ManagedObjectReference value) {
        this.datastore = value;
    }

    /**
     * Gets the value of the snapshotId property.
     * 
     * @return
     *     possible object is
     *     {@link ID }
     *     
     */
    public ID getSnapshotId() {
        return snapshotId;
    }

    /**
     * Sets the value of the snapshotId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ID }
     *     
     */
    public void setSnapshotId(ID value) {
        this.snapshotId = value;
    }

    /**
     * Gets the value of the startOffset property.
     * 
     */
    public long getStartOffset() {
        return startOffset;
    }

    /**
     * Sets the value of the startOffset property.
     * 
     */
    public void setStartOffset(long value) {
        this.startOffset = value;
    }

    /**
     * Gets the value of the changeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeId() {
        return changeId;
    }

    /**
     * Sets the value of the changeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeId(String value) {
        this.changeId = value;
    }

}
