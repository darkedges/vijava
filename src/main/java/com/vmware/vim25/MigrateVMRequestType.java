
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MigrateVMRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MigrateVMRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="_this" type="{urn:vim25}ManagedObjectReference"/>
 *         &lt;element name="pool" type="{urn:vim25}ManagedObjectReference" minOccurs="0"/>
 *         &lt;element name="host" type="{urn:vim25}ManagedObjectReference" minOccurs="0"/>
 *         &lt;element name="priority" type="{urn:vim25}VirtualMachineMovePriority"/>
 *         &lt;element name="state" type="{urn:vim25}VirtualMachinePowerState" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MigrateVMRequestType", propOrder = {
    "_this",
    "pool",
    "host",
    "priority",
    "state"
})
public class MigrateVMRequestType {

    @XmlElement(required = true)
    protected ManagedObjectReference _this;
    protected ManagedObjectReference pool;
    protected ManagedObjectReference host;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected VirtualMachineMovePriority priority;
    @XmlSchemaType(name = "string")
    protected VirtualMachinePowerState state;

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
     * Gets the value of the pool property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getPool() {
        return pool;
    }

    /**
     * Sets the value of the pool property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setPool(ManagedObjectReference value) {
        this.pool = value;
    }

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
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualMachineMovePriority }
     *     
     */
    public VirtualMachineMovePriority getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualMachineMovePriority }
     *     
     */
    public void setPriority(VirtualMachineMovePriority value) {
        this.priority = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualMachinePowerState }
     *     
     */
    public VirtualMachinePowerState getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualMachinePowerState }
     *     
     */
    public void setState(VirtualMachinePowerState value) {
        this.state = value;
    }

}
