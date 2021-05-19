
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomizationFault complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomizationFault">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:vim25}VimFault">
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
@XmlType(name = "CustomizationFault")
@XmlSeeAlso({
    UnexpectedCustomizationFault.class,
    VolumeEditorError.class,
    MissingLinuxCustResources.class,
    IpHostnameGeneratorError.class,
    NicSettingMismatch.class,
    MountError.class,
    CustomizationPending.class,
    NoDisksToCustomize.class,
    LinuxVolumeNotClean.class,
    CannotDecryptPasswords.class,
    MissingWindowsCustResources.class,
    UncustomizableGuest.class
})
public class CustomizationFault
    extends VimFault
{


}
