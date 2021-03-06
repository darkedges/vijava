
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryCryptoKeyStatusRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryCryptoKeyStatusRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="_this" type="{urn:vim25}ManagedObjectReference"/>
 *         &lt;element name="keyIds" type="{urn:vim25}CryptoKeyId" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="checkKeyBitMap" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryCryptoKeyStatusRequestType", propOrder = {
    "_this",
    "keyIds",
    "checkKeyBitMap"
})
public class QueryCryptoKeyStatusRequestType {

    @XmlElement(required = true)
    protected ManagedObjectReference _this;
    protected List<CryptoKeyId> keyIds;
    protected int checkKeyBitMap;

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
     * Gets the value of the keyIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CryptoKeyId }
     * 
     * 
     */
    public List<CryptoKeyId> getKeyIds() {
        if (keyIds == null) {
            keyIds = new ArrayList<CryptoKeyId>();
        }
        return this.keyIds;
    }

    /**
     * Gets the value of the checkKeyBitMap property.
     * 
     */
    public int getCheckKeyBitMap() {
        return checkKeyBitMap;
    }

    /**
     * Sets the value of the checkKeyBitMap property.
     * 
     */
    public void setCheckKeyBitMap(int value) {
        this.checkKeyBitMap = value;
    }

}
