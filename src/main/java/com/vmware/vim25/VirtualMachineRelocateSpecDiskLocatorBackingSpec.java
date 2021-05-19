
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualMachineRelocateSpecDiskLocatorBackingSpec complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VirtualMachineRelocateSpecDiskLocatorBackingSpec">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:vim25}DynamicData">
 *       &lt;sequence>
 *         &lt;element name="parent" type="{urn:vim25}VirtualMachineRelocateSpecDiskLocatorBackingSpec" minOccurs="0"/>
 *         &lt;element name="crypto" type="{urn:vim25}CryptoSpec" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineRelocateSpecDiskLocatorBackingSpec", propOrder = {
    "parent",
    "crypto"
})
public class VirtualMachineRelocateSpecDiskLocatorBackingSpec
    extends DynamicData
{

    protected VirtualMachineRelocateSpecDiskLocatorBackingSpec parent;
    protected CryptoSpec crypto;

    /**
     * Gets the value of the parent property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualMachineRelocateSpecDiskLocatorBackingSpec }
     *     
     */
    public VirtualMachineRelocateSpecDiskLocatorBackingSpec getParent() {
        return parent;
    }

    /**
     * Sets the value of the parent property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualMachineRelocateSpecDiskLocatorBackingSpec }
     *     
     */
    public void setParent(VirtualMachineRelocateSpecDiskLocatorBackingSpec value) {
        this.parent = value;
    }

    /**
     * Gets the value of the crypto property.
     * 
     * @return
     *     possible object is
     *     {@link CryptoSpec }
     *     
     */
    public CryptoSpec getCrypto() {
        return crypto;
    }

    /**
     * Sets the value of the crypto property.
     * 
     * @param value
     *     allowed object is
     *     {@link CryptoSpec }
     *     
     */
    public void setCrypto(CryptoSpec value) {
        this.crypto = value;
    }

}
