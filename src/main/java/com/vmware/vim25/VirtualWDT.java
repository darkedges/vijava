
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualWDT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VirtualWDT">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:vim25}VirtualDevice">
 *       &lt;sequence>
 *         &lt;element name="runOnBoot" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="running" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualWDT", propOrder = {
    "runOnBoot",
    "running"
})
public class VirtualWDT
    extends VirtualDevice
{

    protected boolean runOnBoot;
    protected boolean running;

    /**
     * Gets the value of the runOnBoot property.
     * 
     */
    public boolean isRunOnBoot() {
        return runOnBoot;
    }

    /**
     * Sets the value of the runOnBoot property.
     * 
     */
    public void setRunOnBoot(boolean value) {
        this.runOnBoot = value;
    }

    /**
     * Gets the value of the running property.
     * 
     */
    public boolean isRunning() {
        return running;
    }

    /**
     * Sets the value of the running property.
     * 
     */
    public void setRunning(boolean value) {
        this.running = value;
    }

}
