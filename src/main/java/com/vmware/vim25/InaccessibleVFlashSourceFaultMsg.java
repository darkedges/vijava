
package com.vmware.vim25;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "InaccessibleVFlashSourceFault", targetNamespace = "urn:vim25")
public class InaccessibleVFlashSourceFaultMsg
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private InaccessibleVFlashSource faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public InaccessibleVFlashSourceFaultMsg(String message, InaccessibleVFlashSource faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public InaccessibleVFlashSourceFaultMsg(String message, InaccessibleVFlashSource faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.vmware.vim25.InaccessibleVFlashSource
     */
    public InaccessibleVFlashSource getFaultInfo() {
        return faultInfo;
    }

}
