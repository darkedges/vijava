
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OvfImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OvfImport">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:vim25}OvfFault">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OvfImport")
@XmlSeeAlso({
    OvfUnsupportedDiskProvisioning.class,
    OvfMissingHardware.class,
    OvfImportFailed.class,
    OvfHardwareCheck.class,
    OvfNetworkMappingNotSupported.class,
    OvfMappedOsId.class,
    OvfCpuCompatibility.class,
    OvfCpuCompatibilityCheckNotSupported.class
})
public class OvfImport
    extends OvfFault
{


}
