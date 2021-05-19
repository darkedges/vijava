
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HttpNfcLeaseProbeResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HttpNfcLeaseProbeResult">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:vim25}DynamicData">
 *       &lt;sequence>
 *         &lt;element name="serverAccessible" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HttpNfcLeaseProbeResult", propOrder = {
    "serverAccessible"
})
public class HttpNfcLeaseProbeResult
    extends DynamicData
{

    protected boolean serverAccessible;

    /**
     * Gets the value of the serverAccessible property.
     * 
     */
    public boolean isServerAccessible() {
        return serverAccessible;
    }

    /**
     * Sets the value of the serverAccessible property.
     * 
     */
    public void setServerAccessible(boolean value) {
        this.serverAccessible = value;
    }

}
