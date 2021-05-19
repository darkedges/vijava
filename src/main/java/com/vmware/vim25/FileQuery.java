
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FileQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FileQuery">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:vim25}DynamicData">
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
@XmlType(name = "FileQuery")
@XmlSeeAlso({
    VmSnapshotFileQuery.class,
    FolderFileQuery.class,
    VmLogFileQuery.class,
    VmConfigFileQuery.class,
    VmDiskFileQuery.class,
    VmNvramFileQuery.class,
    FloppyImageFileQuery.class,
    IsoImageFileQuery.class
})
public class FileQuery
    extends DynamicData
{


}
