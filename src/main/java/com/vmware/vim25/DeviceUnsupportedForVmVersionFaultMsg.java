
package com.vmware.vim25;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "DeviceUnsupportedForVmVersionFault", targetNamespace = "urn:vim25")
public class DeviceUnsupportedForVmVersionFaultMsg
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private DeviceUnsupportedForVmVersion faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public DeviceUnsupportedForVmVersionFaultMsg(String message, DeviceUnsupportedForVmVersion faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public DeviceUnsupportedForVmVersionFaultMsg(String message, DeviceUnsupportedForVmVersion faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.vmware.vim25.DeviceUnsupportedForVmVersion
     */
    public DeviceUnsupportedForVmVersion getFaultInfo() {
        return faultInfo;
    }

}