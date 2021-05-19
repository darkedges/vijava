
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for vslmVClockInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vslmVClockInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:vim25}DynamicData">
 *       &lt;sequence>
 *         &lt;element name="vClockTime" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vslmVClockInfo", propOrder = {
    "vClockTime"
})
public class VslmVClockInfo
    extends DynamicData
{

    protected long vClockTime;

    /**
     * Gets the value of the vClockTime property.
     * 
     */
    public long getVClockTime() {
        return vClockTime;
    }

    /**
     * Sets the value of the vClockTime property.
     * 
     */
    public void setVClockTime(long value) {
        this.vClockTime = value;
    }

}
