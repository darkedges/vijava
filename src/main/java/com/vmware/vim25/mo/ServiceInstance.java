/*================================================================================
Copyright (c) 2008 VMware, Inc. All Rights Reserved.

Redistribution and use in source and binary forms, with or without modification, 
are permitted provided that the following conditions are met:

* Redistributions of source code must retain the above copyright notice, 
this list of conditions and the following disclaimer.

* Redistributions in binary form must reproduce the above copyright notice, 
this list of conditions and the following disclaimer in the documentation 
and/or other materials provided with the distribution.

* Neither the name of VMware, Inc. nor the names of its contributors may be used
to endorse or promote products derived from this software without specific prior 
written permission.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND 
ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
IN NO EVENT SHALL VMWARE, INC. OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, 
INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT 
LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR 
PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
POSSIBILITY OF SUCH DAMAGE.
================================================================================*/

package com.vmware.vim25.mo;

import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import javax.xml.ws.BindingProvider;

import com.vmware.vim25.AboutInfo;
import com.vmware.vim25.Capability;
import com.vmware.vim25.Event;
import com.vmware.vim25.HostVMotionCompatibility;
import com.vmware.vim25.InvalidLocaleFaultMsg;
import com.vmware.vim25.InvalidLoginFaultMsg;
import com.vmware.vim25.InvalidStateFaultMsg;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.ProductComponentInfo;
import com.vmware.vim25.RuntimeFaultFaultMsg;
import com.vmware.vim25.ServiceContent;
import com.vmware.vim25.UserSession;
import com.vmware.vim25.VimPortType;
import com.vmware.vim25.VimService;
import com.vmware.vim25.VirtualMachinePowerState;
import com.vmware.vim25.mo.util.MorUtil;

/**
 * The managed object class corresponding to the one defined in VI SDK API
 * reference.
 * 
 * @author Steve JIN (http://www.doublecloud.org)
 */

public class ServiceInstance extends ManagedObject {
	private ServiceContent serviceContent = null;
	final static ManagedObjectReference SERVICE_INSTANCE_MOR;
	public final static String VIM25_NAMESPACE = " xmlns=\"urn:vim25\">";
	public final static String VIM20_NAMESPACE = " xmlns=\"urn:vim2\">";

	static {
		SERVICE_INSTANCE_MOR = new ManagedObjectReference();
		SERVICE_INSTANCE_MOR.setValue("ServiceInstance");
		SERVICE_INSTANCE_MOR.setType("ServiceInstance");
	}

	public ServiceInstance(URL url, String username, String password) throws KeyManagementException,
			NoSuchAlgorithmException, RuntimeFaultFaultMsg, InvalidLocaleFaultMsg, InvalidLoginFaultMsg {
		this(url, username, password, false);
	}

	public ServiceInstance(URL url, String username, String password, boolean ignoreCert) throws KeyManagementException,
			NoSuchAlgorithmException, RuntimeFaultFaultMsg, InvalidLocaleFaultMsg, InvalidLoginFaultMsg {
		this(url, username, password, ignoreCert, VIM25_NAMESPACE);
	}

	public ServiceInstance(URL url, String username, String password, boolean ignoreCert, String namespace)
			throws RuntimeFaultFaultMsg, InvalidLocaleFaultMsg, InvalidLoginFaultMsg, KeyManagementException,
			NoSuchAlgorithmException {
		if (url == null || username == null) {
			throw new NullPointerException("None of url, username can be null.");
		}

		if (ignoreCert) {
			DisableSecurity.trustEveryone();
		}

		VimService vimService = new VimService();
		VimPortType vimPort = vimService.getVimPort();

		Map<String, Object> ctxt = ((BindingProvider) vimPort).getRequestContext();
		ctxt.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, url.toString());
		ctxt.put(BindingProvider.SESSION_MAINTAIN_PROPERTY, true);

		setMOR(SERVICE_INSTANCE_MOR);

		serviceContent = vimPort.retrieveServiceContent(SERVICE_INSTANCE_MOR); // with new SOAP_ACTION
		setServerConnection(new ServerConnection(url, vimPort, this));

		UserSession userSession = getSessionManager().login(username, password, null);
		getServerConnection().setUserSession(userSession);
	}

	public ServiceInstance(URL url, String sessionStr, boolean ignoreCert) throws RuntimeFaultFaultMsg {
		this(url, sessionStr, ignoreCert, VIM25_NAMESPACE);
	}

	// sessionStr format:
	// "vmware_soap_session=\"B3240D15-34DF-4BB8-B902-A844FDF42E85\""
	public ServiceInstance(URL url, String sessionStr, boolean ignoreCert, String namespace)
			throws RuntimeFaultFaultMsg {
		if (url == null || sessionStr == null) {
			throw new NullPointerException("None of url, session string can be null.");
		}

		setMOR(SERVICE_INSTANCE_MOR);

		VimService vService = new VimService();
		VimPortType vimService = vService.getVimPort();

		Map<String, Object> ctxt = ((BindingProvider) vimService).getRequestContext();
		ctxt.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, url);
		ctxt.put(BindingProvider.SESSION_MAINTAIN_PROPERTY, true);

		serviceContent = vimService.retrieveServiceContent(SERVICE_INSTANCE_MOR);
		setServerConnection(new ServerConnection(url, vimService, this));
		UserSession userSession = (UserSession) getSessionManager().getCurrentProperty("currentSession");
		getServerConnection().setUserSession(userSession);
	}

	public ServiceInstance(ServerConnection sc) {
		super(sc, SERVICE_INSTANCE_MOR);
	}

	public Calendar getServerClock() {
		return (Calendar) getCurrentProperty("serverClock");
	}

	public Capability getCapability() {
		return (Capability) getCurrentProperty("capability");
	}

	public ClusterProfileManager getClusterProfileManager() {
		return (ClusterProfileManager) createMO(getServiceContent().getClusterProfileManager());
	}

	public Calendar currentTime() throws RuntimeFaultFaultMsg {
		return getVimService().currentTime(getMOR()).toGregorianCalendar();
	}

	public Folder getRootFolder() {
		return new Folder(this.getServerConnection(), this.getServiceContent().getRootFolder());
	}

	public List<HostVMotionCompatibility> queryVMotionCompatibility(VirtualMachine vm, List<ManagedObject> hosts,
			List<String> compatibility) throws RuntimeFaultFaultMsg {
		if (vm == null || hosts == null) {
			throw new IllegalArgumentException("Neither vm or hosts can be null.");
		}
		return getVimService().queryVMotionCompatibility(getMOR(), vm.getMOR(), MorUtil.createMORs(hosts),
				compatibility);
	}

	public List<ProductComponentInfo> retrieveProductComponents() throws RuntimeFaultFaultMsg {
		return getVimService().retrieveProductComponents(getMOR());
	}

	private ServiceContent retrieveServiceContent() throws RuntimeFaultFaultMsg {
		return getVimService().retrieveServiceContent(getMOR());
	}

	public List<Event> validateMigration(List<ManagedObject> vms, VirtualMachinePowerState state, List<String> testType,
			ResourcePool pool, HostSystem host) throws RuntimeFaultFaultMsg, InvalidStateFaultMsg {
		if (vms == null) {
			throw new IllegalArgumentException("vms must not be null.");
		}

		return getVimService().validateMigration(getMOR(), MorUtil.createMORs(vms), state, testType,
				pool == null ? null : pool.getMOR(), host == null ? null : host.getMOR());
	}

	public ServiceContent getServiceContent() {
		if (serviceContent == null) {
			try {
				serviceContent = retrieveServiceContent();
			} catch (Exception e) {

			}
		}
		return serviceContent;
	}

	public AboutInfo getAboutInfo() {
		return getServiceContent().getAbout();
	}

	public AlarmManager getAlarmManager() {
		return (AlarmManager) createMO(getServiceContent().getAlarmManager());
	}

	public AuthorizationManager getAuthorizationManager() {
		return (AuthorizationManager) createMO(getServiceContent().getAuthorizationManager());
	}

	public CustomFieldsManager getCustomFieldsManager() {
		return (CustomFieldsManager) createMO(getServiceContent().getCustomFieldsManager());
	}

	public CustomizationSpecManager getCustomizationSpecManager() {
		return (CustomizationSpecManager) createMO(getServiceContent().getCustomizationSpecManager());
	}

	public EventManager getEventManager() {
		return (EventManager) createMO(getServiceContent().getEventManager());
	}

	public DiagnosticManager getDiagnosticManager() {
		return (DiagnosticManager) createMO(getServiceContent().getDiagnosticManager());
	}

	public DistributedVirtualSwitchManager getDistributedVirtualSwitchManager() {
		return (DistributedVirtualSwitchManager) createMO(getServiceContent().getDvSwitchManager());
	}

	public ExtensionManager getExtensionManager() {
		return (ExtensionManager) createMO(getServiceContent().getExtensionManager());
	}

	public FileManager getFileManager() {
		return (FileManager) createMO(getServiceContent().getFileManager());
	}

	public GuestOperationsManager getGuestOperationsManager() {
		return (GuestOperationsManager) createMO(getServiceContent().getGuestOperationsManager());
	}

	public HostLocalAccountManager getAccountManager() {
		return (HostLocalAccountManager) createMO(getServiceContent().getAccountManager());
	}

	public LicenseManager getLicenseManager() {
		return (LicenseManager) createMO(getServiceContent().getLicenseManager());
	}

	public LocalizationManager getLocalizationManager() {
		return (LocalizationManager) createMO(getServiceContent().getLocalizationManager());
	}

	public PerformanceManager getPerformanceManager() {
		return (PerformanceManager) createMO(getServiceContent().getPerfManager());
	}

	public ProfileComplianceManager getProfileComplianceManager() {
		return (ProfileComplianceManager) createMO(getServiceContent().getComplianceManager());
	}

	public PropertyCollector getPropertyCollector() {
		return (PropertyCollector) createMO(getServiceContent().getPropertyCollector());
	}

	public ScheduledTaskManager getScheduledTaskManager() {
		return (ScheduledTaskManager) createMO(getServiceContent().getScheduledTaskManager());
	}

	public SearchIndex getSearchIndex() {
		return (SearchIndex) createMO(getServiceContent().getSearchIndex());
	}

	public SessionManager getSessionManager() {
		return (SessionManager) createMO(getServiceContent().getSessionManager());
	}

	public HostSnmpSystem getHostSnmpSystem() {
		return (HostSnmpSystem) createMO(getServiceContent().getSnmpSystem());
	}

	public HostProfileManager getHostProfileManager() {
		return (HostProfileManager) createMO(getServiceContent().getHostProfileManager());
	}

	public IpPoolManager getIpPoolManager() {
		return (IpPoolManager) createMO(getServiceContent().getIpPoolManager());
	}

	public VirtualMachineProvisioningChecker getVirtualMachineProvisioningChecker() {
		return (VirtualMachineProvisioningChecker) createMO(getServiceContent().getVmProvisioningChecker());
	}

	public VirtualMachineCompatibilityChecker getVirtualMachineCompatibilityChecker() {
		return (VirtualMachineCompatibilityChecker) createMO(getServiceContent().getVmCompatibilityChecker());
	}

	public TaskManager getTaskManager() {
		return (TaskManager) createMO(getServiceContent().getTaskManager());
	}

	public UserDirectory getUserDirectory() {
		return (UserDirectory) createMO(getServiceContent().getUserDirectory());
	}

	public ViewManager getViewManager() {
		return (ViewManager) createMO(getServiceContent().getViewManager());
	}

	public VirtualDiskManager getVirtualDiskManager() {
		return (VirtualDiskManager) createMO(getServiceContent().getVirtualDiskManager());
	}

	public OptionManager getOptionManager() {
		return (OptionManager) createMO(getServiceContent().getSetting());
	}

	public OvfManager getOvfManager() {
		return (OvfManager) createMO(getServiceContent().getOvfManager());
	}

	private ManagedObject createMO(ManagedObjectReference mor) {
		return MorUtil.createExactManagedObject(getServerConnection(), mor);
	}

	// TODO vim.VirtualizationManager is defined in servicecontent but no
	// documentation there. Filed a bug already

}
