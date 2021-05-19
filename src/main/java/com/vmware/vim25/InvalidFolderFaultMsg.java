
package com.vmware.vim25;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "InvalidFolderFault", targetNamespace = "urn:vim25")
public class InvalidFolderFaultMsg
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private InvalidFolder faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public InvalidFolderFaultMsg(String message, InvalidFolder faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public InvalidFolderFaultMsg(String message, InvalidFolder faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.vmware.vim25.InvalidFolder
     */
    public InvalidFolder getFaultInfo() {
        return faultInfo;
    }

}
