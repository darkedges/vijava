
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDesiredSoftwareSpecComponentSpec complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDesiredSoftwareSpecComponentSpec">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DesiredSoftwareSpecComponentSpec" type="{urn:vim25}DesiredSoftwareSpecComponentSpec" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDesiredSoftwareSpecComponentSpec", propOrder = {
    "desiredSoftwareSpecComponentSpec"
})
public class ArrayOfDesiredSoftwareSpecComponentSpec {

    @XmlElement(name = "DesiredSoftwareSpecComponentSpec")
    protected List<DesiredSoftwareSpecComponentSpec> desiredSoftwareSpecComponentSpec;

    /**
     * Gets the value of the desiredSoftwareSpecComponentSpec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the desiredSoftwareSpecComponentSpec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDesiredSoftwareSpecComponentSpec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DesiredSoftwareSpecComponentSpec }
     * 
     * 
     */
    public List<DesiredSoftwareSpecComponentSpec> getDesiredSoftwareSpecComponentSpec() {
        if (desiredSoftwareSpecComponentSpec == null) {
            desiredSoftwareSpecComponentSpec = new ArrayList<DesiredSoftwareSpecComponentSpec>();
        }
        return this.desiredSoftwareSpecComponentSpec;
    }

}
