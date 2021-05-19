
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualMachineSgxTargetInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VirtualMachineSgxTargetInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:vim25}VirtualMachineTargetInfo">
 *       &lt;sequence>
 *         &lt;element name="maxEpcSize" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="flcModes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="lePubKeyHashes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineSgxTargetInfo", propOrder = {
    "maxEpcSize",
    "flcModes",
    "lePubKeyHashes"
})
public class VirtualMachineSgxTargetInfo
    extends VirtualMachineTargetInfo
{

    protected long maxEpcSize;
    protected List<String> flcModes;
    protected List<String> lePubKeyHashes;

    /**
     * Gets the value of the maxEpcSize property.
     * 
     */
    public long getMaxEpcSize() {
        return maxEpcSize;
    }

    /**
     * Sets the value of the maxEpcSize property.
     * 
     */
    public void setMaxEpcSize(long value) {
        this.maxEpcSize = value;
    }

    /**
     * Gets the value of the flcModes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flcModes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlcModes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFlcModes() {
        if (flcModes == null) {
            flcModes = new ArrayList<String>();
        }
        return this.flcModes;
    }

    /**
     * Gets the value of the lePubKeyHashes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lePubKeyHashes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLePubKeyHashes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLePubKeyHashes() {
        if (lePubKeyHashes == null) {
            lePubKeyHashes = new ArrayList<String>();
        }
        return this.lePubKeyHashes;
    }

}
