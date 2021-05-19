
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VMwareDvsMtuCapability complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VMwareDvsMtuCapability">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:vim25}DynamicData">
 *       &lt;sequence>
 *         &lt;element name="minMtuSupported" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="maxMtuSupported" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VMwareDvsMtuCapability", propOrder = {
    "minMtuSupported",
    "maxMtuSupported"
})
public class VMwareDvsMtuCapability
    extends DynamicData
{

    protected int minMtuSupported;
    protected int maxMtuSupported;

    /**
     * Gets the value of the minMtuSupported property.
     * 
     */
    public int getMinMtuSupported() {
        return minMtuSupported;
    }

    /**
     * Sets the value of the minMtuSupported property.
     * 
     */
    public void setMinMtuSupported(int value) {
        this.minMtuSupported = value;
    }

    /**
     * Gets the value of the maxMtuSupported property.
     * 
     */
    public int getMaxMtuSupported() {
        return maxMtuSupported;
    }

    /**
     * Sets the value of the maxMtuSupported property.
     * 
     */
    public void setMaxMtuSupported(int value) {
        this.maxMtuSupported = value;
    }

}
