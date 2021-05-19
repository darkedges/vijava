
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DynamicData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DynamicData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DynamicData")
@XmlSeeAlso({
    VStorageObject.class,
    ProfileDescription.class,
    GuestRegKeyRecordSpec.class,
    VStorageObjectStateInfo.class,
    HttpNfcLeaseManifestEntry.class,
    HostDiskPartitionInfo.class,
    PerfMetricId.class,
    ExtensionManagerIpAllocationUsage.class,
    HostNvmeDiscoveryLog.class,
    ConfigTarget.class,
    PerfProviderSummary.class,
    ComplianceResult.class,
    OvfParseDescriptorResult.class,
    LicenseManagerLicenseInfo.class,
    TaskInfo.class,
    DiagnosticManagerLogDescriptor.class,
    ClusterHostRecommendation.class,
    SiteInfo.class,
    HostBootDeviceInfo.class,
    HostUnresolvedVmfsVolume.class,
    DVSManagerDvsConfigTarget.class,
    HostVsanInternalSystemVsanPhysicalDiskDiagnosticsResult.class,
    UserSession.class,
    VStorageObjectAssociations.class,
    HostStorageArrayTypePolicyOption.class,
    VslmInfrastructureObjectPolicy.class,
    GuestMappedAliases.class,
    KernelModuleInfo.class,
    CryptoKeyId.class,
    HostServiceTicket.class,
    ClusterResourceUsageSummary.class,
    HostImageProfileSummary.class,
    IscsiStatus.class,
    AnswerFileStatusResult.class,
    GuestAliases.class,
    DatacenterBasicConnectInfo.class,
    VirtualMachineTicket.class,
    ProfilePolicyMetadata.class,
    HttpNfcLeaseProbeResult.class,
    KmipClusterInfo.class,
    EventArgDesc.class,
    HostNasVolumeUserInfo.class,
    IscsiPortInfo.class,
    VchaClusterConfigInfo.class,
    HostTpmAttestationReport.class,
    KeyProviderId.class,
    HostVsanInternalSystemVsanObjectOperationResult.class,
    PerfCounterInfo.class,
    GuestRegValueSpec.class,
    SoftwarePackage.class,
    CryptoKeyResult.class,
    LicenseAvailabilityInfo.class,
    CryptoManagerKmipServerCertInfo.class,
    VStorageObjectSnapshotInfo.class,
    Permission.class,
    HostConnectInfo.class,
    StoragePlacementResult.class,
    VirtualNicManagerNetConfig.class,
    VmfsConfigOption.class,
    HostDiskDimensionsChs.class,
    ID.class,
    DiskChangeInfo.class,
    HealthUpdate.class,
    DistributedVirtualSwitchManagerCompatibilityResult.class,
    StoragePerformanceSummary.class,
    RetrieveResult.class,
    PerfCompositeMetric.class,
    Extension.class,
    AnswerFile.class,
    HostUnresolvedVmfsResolutionResult.class,
    DatabaseSizeEstimate.class,
    CryptoManagerKmipCryptoKeyStatus.class,
    StorageIORMConfigOption.class,
    DiagnosticManagerLogHeader.class,
    HealthUpdateInfo.class,
    PlacementResult.class,
    OvfValidateHostResult.class,
    VirtualMachineConfigOption.class,
    HostVMotionCompatibility.class,
    HostSpecification.class,
    VirtualMachineMksTicket.class,
    VStorageObjectSnapshotDetails.class,
    DistributedVirtualSwitchHostProductSpec.class,
    ProfileExpressionMetadata.class,
    VirtualMachineConfigOptionDescriptor.class,
    VsanPolicySatisfiability.class,
    VmfsDatastoreOption.class,
    VsanUpgradeSystemUpgradeStatus.class,
    HostProfileManagerConfigTaskList.class,
    ProfileMetadata.class,
    UpdateSet.class,
    AlarmState.class,
    VchaClusterHealth.class,
    ProductComponentInfo.class,
    OvfCreateDescriptorResult.class,
    IpPool.class,
    OvfCreateImportSpecResult.class,
    VsanHostDiskResult.class,
    IoFilterQueryIssueResult.class,
    FileTransferInformation.class,
    VslmTagEntry.class,
    HostPathSelectionPolicyOption.class,
    IpPoolManagerIpAllocation.class,
    IscsiMigrationDependency.class,
    SessionManagerLocalTicket.class,
    HostCapability.class,
    GuestListFileInfo.class,
    SessionManagerGenericServiceTicket.class,
    HostDateTimeSystemTimeZone.class,
    CustomizationSpecItem.class,
    PhysicalNicHintInfo.class,
    HostDiagnosticPartition.class,
    VsanHostClusterStatus.class,
    SystemEventInfo.class,
    VsanUpgradeSystemPreflightCheckResult.class,
    KeyValue.class,
    VirtualDiskId.class,
    LicenseUsageInfo.class,
    HostVsanInternalSystemDeleteVsanObjectsResult.class,
    VirtualDiskVFlashCacheConfigInfo.class,
    EntityPrivilege.class,
    LicenseFeatureInfo.class,
    CustomFieldDef.class,
    LicenseAssignmentManagerLicenseAssignment.class,
    DistributedVirtualPort.class,
    HostNetworkConfigResult.class,
    ProfileProfileStructure.class,
    ResourceConfigOption.class,
    ServiceContent.class,
    LocalizedMethodFault.class,
    UserPrivilegeResult.class,
    ServiceManagerServiceInfo.class,
    DistributedVirtualSwitchProductSpec.class,
    ObjectContent.class,
    HostAccessControlEntry.class,
    ClusterEnterMaintenanceResult.class,
    HostDiagnosticPartitionCreateOption.class,
    HostDiagnosticPartitionCreateDescription.class,
    GuestProcessInfo.class,
    HostDiskDimensions.class,
    ProfileParameterMetadata.class,
    HostLowLevelProvisioningManagerVmMigrationStatus.class,
    VsanHostVsanDiskInfo.class,
    HostNumericSensorInfo.class,
    VirtualMachineGuestIntegrityInfo.class,
    HostNetworkResourceRuntime.class,
    HostMultipathStateInfoPath.class,
    HealthSystemRuntime.class,
    HostStorageSystemVmfsVolumeResult.class,
    StorageIOAllocationInfo.class,
    HostLowLevelProvisioningManagerVmRecoveryInfo.class,
    HostVFlashManagerVFlashCacheConfigInfoVFlashModuleConfigOption.class,
    VslmCreateSpec.class,
    HostVmciAccessManagerAccessSpec.class,
    DvsOperationBulkFaultFaultOnHost.class,
    UsbScanCodeSpecKeyEvent.class,
    HostNatServiceNameServiceSpec.class,
    HostVFlashManagerVFlashResourceConfigInfo.class,
    VsanHostClusterStatusState.class,
    HostPatchManagerResult.class,
    PowerSystemInfo.class,
    DVPortgroupConfigInfo.class,
    EnvironmentBrowserConfigOptionQuerySpec.class,
    DistributedVirtualSwitchInfo.class,
    HttpNfcLeaseSourceFile.class,
    HostFlagInfo.class,
    HostPatchManagerPatchManagerOperationSpec.class,
    OvfDeploymentOption.class,
    HostNtpConfig.class,
    AuthorizationPrivilege.class,
    HostIpConfigIpV6AddressConfiguration.class,
    HostIpRouteConfig.class,
    VirtualMachineFileLayout.class,
    HostLowLevelProvisioningManagerDiskLayoutSpec.class,
    ClusterDasAamNodeState.class,
    HostInternetScsiHbaIPProperties.class,
    IpPoolAssociation.class,
    VsanHostFaultDomainInfo.class,
    HostProfilesEntityCustomizations.class,
    EventAlarmExpressionComparison.class,
    CustomizationGuiRunOnce.class,
    ClusterComputeResourceHCIConfigInfo.class,
    DasHeartbeatDatastoreInfo.class,
    ClusterDasFailoverLevelAdvancedRuntimeInfoVmSlots.class,
    HostLicenseConnectInfo.class,
    VMwareVspanSession.class,
    HostNetworkConfigNetStackSpec.class,
    HostNicTeamingPolicy.class,
    StoragePodSummary.class,
    HostActiveDirectory.class,
    ExtensionEventTypeInfo.class,
    OvfCreateDescriptorParams.class,
    DistributedVirtualSwitchPortConnectee.class,
    StorageDrsPodConfigInfo.class,
    HostVmfsRescanResult.class,
    VirtualMachineWipeResult.class,
    VirtualMachineUsageOnDatastore.class,
    VirtualMachineFileLayoutExDiskUnit.class,
    DatastoreSummary.class,
    FcoeConfigVlanRange.class,
    HostProxySwitch.class,
    HostFirewallRule.class,
    StorageDrsVmConfigInfo.class,
    HostInternetScsiHbaDigestCapabilities.class,
    DistributedVirtualSwitchHostMemberTransportZoneInfo.class,
    BatchResult.class,
    HostVirtualNicManagerInfo.class,
    ExtensionClientInfo.class,
    DvsTrafficRuleset.class,
    HostInternetScsiHbaDiscoveryProperties.class,
    ComplianceFailureComplianceFailureValues.class,
    HostDiskMappingPartitionOption.class,
    DVSFeatureCapability.class,
    ApplyHostProfileConfigurationResult.class,
    ProfilePolicy.class,
    NvdimmHealthInfo.class,
    NvdimmSystemInfo.class,
    HostPlugStoreTopologyAdapter.class,
    DVSCapability.class,
    HostFileSystemVolumeInfo.class,
    StorageDrsConfigInfo.class,
    CustomizationGlobalIPSettings.class,
    HostEsxAgentHostManagerConfigInfo.class,
    NetIpRouteConfigSpec.class,
    CryptoManagerKmipClusterStatus.class,
    DistributedVirtualSwitchHostMemberPnicSpec.class,
    ClusterActionHistory.class,
    HostInternetScsiHbaAuthenticationProperties.class,
    VAppIPAssignmentInfo.class,
    HostPlugStoreTopologyDevice.class,
    VirtualMachineRuntimeInfoDasProtectionState.class,
    HostSnmpDestination.class,
    ProfileExpression.class,
    SourceNodeSpec.class,
    DvsTrafficRule.class,
    NvdimmInterleaveSetInfo.class,
    FailoverNodeInfo.class,
    PodStorageDrsEntry.class,
    ClusterComputeResourceHostConfigurationProfile.class,
    NetDnsConfigInfo.class,
    PropertyFilterUpdate.class,
    HostNetOffloadCapabilities.class,
    HostVirtualNicConfig.class,
    FcoeConfig.class,
    VsanPolicyCost.class,
    ClusterNotAttemptedVmInfo.class,
    ClusterComputeResourceHostVmkNicInfo.class,
    VirtualMachineMetadataManagerVmMetadataResult.class,
    ExtensionTaskTypeInfo.class,
    VirtualMachineCapability.class,
    HostNasVolumeConfig.class,
    DiskChangeExtent.class,
    VsanHostClusterStatusStateCompletionEstimate.class,
    ClusterVmComponentProtectionSettings.class,
    OvfFileItem.class,
    LicenseDiagnostics.class,
    VirtualMachineMetadataManagerVmMetadataInput.class,
    HostDateTimeConfig.class,
    HostNvmeDiscoveryLogEntry.class,
    StorageIORMConfigSpec.class,
    VsanHostRuntimeInfo.class,
    HostPatchManagerStatusPrerequisitePatch.class,
    LinkLayerDiscoveryProtocolInfo.class,
    HostCacheConfigurationSpec.class,
    HostSnmpSystemAgentLimits.class,
    HostDiskMappingInfo.class,
    HostLowLevelProvisioningManagerFileReserveResult.class,
    HostPortGroupConfig.class,
    VirtualEthernetCardResourceAllocation.class,
    HostIpRouteTableInfo.class,
    ClusterDpmConfigInfo.class,
    VirtualMachineSnapshotInfo.class,
    ResourceConfigSpec.class,
    VirtualDiskDeltaDiskFormatsSupported.class,
    ClusterEVCManagerCheckResult.class,
    DistributedVirtualSwitchPortStatistics.class,
    ObjectSpec.class,
    DistributedVirtualSwitchPortCriteria.class,
    HostDhcpService.class,
    NvdimmNamespaceCreateSpec.class,
    ProfileExecuteError.class,
    ResourceAllocationOption.class,
    HostVirtualSwitchConfig.class,
    HostOpaqueSwitchPhysicalNicZone.class,
    HostDigestInfo.class,
    CustomizationSpecInfo.class,
    KmipServerInfo.class,
    HostVirtualNicOpaqueNetworkSpec.class,
    DistributedVirtualSwitchKeyedOpaqueBlob.class,
    VmConfigFileQueryFilter.class,
    DatastoreOption.class,
    ClusterComputeResourceVcsSlots.class,
    ComplianceProfile.class,
    DVSHostLocalPortInfo.class,
    SDDCBase.class,
    HostMemorySpec.class,
    EventFilterSpecByUsername.class,
    HbrManagerReplicationVmInfo.class,
    ClusterDrsMigration.class,
    HostDiskDimensionsLba.class,
    VchaClusterNetworkSpec.class,
    HostAssignableHardwareConfigAttributeOverride.class,
    HostNumaInfo.class,
    HostPatchManagerStatus.class,
    ClusterDasAdvancedRuntimeInfo.class,
    DeviceGroupId.class,
    LocalizationManagerMessageCatalog.class,
    HostRdmaDevice.class,
    HostMountInfo.class,
    VVolVmConfigFileUpdateResultFailedVmConfigFileInfo.class,
    VasaProviderContainerSpec.class,
    ClusterDasFdmHostState.class,
    VirtualMachineFileLayoutEx.class,
    FaultToleranceDiskSpec.class,
    EventFilterSpec.class,
    NetDhcpConfigInfo.class,
    HostDevice.class,
    VchaClusterRuntimeInfo.class,
    HttpNfcLeaseDeviceUrl.class,
    AuthorizationRole.class,
    UsbScanCodeSpec.class,
    HostScsiTopology.class,
    Tag.class,
    DvsVmVnicResourcePoolConfigSpec.class,
    HostStorageSystemScsiLunResult.class,
    HostUnresolvedVmfsResignatureSpec.class,
    ClusterVmOrchestrationInfo.class,
    HostDiskConfigurationResult.class,
    HostFirewallDefaultPolicy.class,
    NetIpStackInfo.class,
    OpaqueNetworkCapability.class,
    HostUnresolvedVmfsExtent.class,
    HostBIOSInfo.class,
    NvdimmNamespaceDetails.class,
    VchaClusterConfigSpec.class,
    VirtualMachineQuestionInfo.class,
    HostSystemHealthInfo.class,
    MethodActionArgument.class,
    VMwareDvsLacpGroupConfig.class,
    VsanHostConfigInfoNetworkInfoPortConfig.class,
    ExtensionHealthInfo.class,
    AnswerFileUpdateFailure.class,
    ClusterConfigInfo.class,
    OvfResourceMap.class,
    DistributedVirtualSwitchHostMember.class,
    FaultsByHost.class,
    NvdimmRegionInfo.class,
    HostDatastoreSystemVvolDatastoreSpec.class,
    HostHyperThreadScheduleInfo.class,
    PasswordField.class,
    VirtualMachineRelocateSpecDiskLocatorBackingSpec.class,
    HostNetCapabilities.class,
    KernelModuleSectionInfo.class,
    HostIpConfig.class,
    ComplianceFailure.class,
    GuestRegValueNameSpec.class,
    CryptoKeyPlain.class,
    HostTpmEventLogEntry.class,
    HostSslThumbprintInfo.class,
    HostServiceInfo.class,
    NetIpConfigInfoIpAddress.class,
    HostMultipathInfo.class,
    HostNetworkTrafficShapingPolicy.class,
    VirtualMachinePropertyRelation.class,
    DvsFilterParameter.class,
    ExtManagedEntityInfo.class,
    VirtualMachineQuickStats.class,
    VirtualMachineProfileRawData.class,
    HostFeatureCapability.class,
    NetIpConfigSpecIpAddressSpec.class,
    Capability.class,
    HostNvmeTopologyInterface.class,
    ScheduledTaskDescription.class,
    VirtualMachineConfigSummary.class,
    CustomizationGuiUnattended.class,
    HostSystemRemediationState.class,
    VirtualMachineGuestSummary.class,
    VirtualMachineGuestMonitoringModeInfo.class,
    StorageDrsPlacementRankVmSpec.class,
    VsanHostDiskMapping.class,
    HostServiceConfig.class,
    GuestStackInfo.class,
    FaultToleranceVMConfigSpec.class,
    ComputeResourceConfigSpec.class,
    HostAssignableHardwareConfig.class,
    HostDiskPartitionLayout.class,
    HostStorageSystemDiskLocatorLedResult.class,
    AutoStartDefaults.class,
    HostCpuPowerManagementInfo.class,
    HostProtocolEndpoint.class,
    HostPlacedVirtualNicIdentifier.class,
    HostScsiDiskPartition.class,
    VirtualMachineVMCIDeviceFilterSpec.class,
    HostVffsSpec.class,
    VimVasaProvider.class,
    HostLowLevelProvisioningManagerFileDeleteSpec.class,
    VirtualMachineFlagInfo.class,
    HostCpuIdInfo.class,
    VirtualMachineFileLayoutExSnapshotLayout.class,
    PropertyFilterSpec.class,
    ClusterDasFailoverLevelAdvancedRuntimeInfoSlotInfo.class,
    SharesInfo.class,
    AboutInfo.class,
    HostNicOrderPolicy.class,
    HostServiceSourcePackage.class,
    VStorageObjectAssociationsVmDiskAssociations.class,
    VirtualMachineFileLayoutExFileInfo.class,
    VsanHostIpConfig.class,
    VirtualMachineConnection.class,
    HostSystemComplianceCheckState.class,
    HostLowLevelProvisioningManagerFileReserveSpec.class,
    VirtualMachineConfigInfoDatastoreUrlPair.class,
    GuestNicInfo.class,
    VirtualMachineForkConfigInfo.class,
    DiskCryptoSpec.class,
    VimVasaProviderInfo.class,
    ServiceLocator.class,
    VirtualMachineAffinityInfo.class,
    HostHardwareInfo.class,
    VirtualMachineConfigInfo.class,
    UpdateVirtualMachineFilesResultFailedVmFileInfo.class,
    HostVMotionManagerSrcInstantCloneResult.class,
    HostFileSystemMountInfo.class,
    VirtualMachineFileLayoutDiskLayout.class,
    NumericRange.class,
    VirtualMachineRelocateSpec.class,
    MissingProperty.class,
    HostRuntimeInfo.class,
    HostProfileValidationFailureInfo.class,
    ClusterDrsFaultsFaultsByVm.class,
    HostProfileManagerHostToConfigSpecMap.class,
    HostIpRouteOp.class,
    VirtualPCIPassthroughAllowedDevice.class,
    VirtualMachineIdeDiskDevicePartitionInfo.class,
    VirtualMachineDatastoreVolumeOption.class,
    OvfNetworkInfo.class,
    NetDnsConfigSpec.class,
    OvfFile.class,
    DatabaseSizeParam.class,
    DVSNetworkResourceManagementCapability.class,
    HostDateTimeInfo.class,
    NetIpRouteConfigSpecIpRouteSpec.class,
    FileQueryFlags.class,
    ProfileDescriptionSection.class,
    ApplyStorageRecommendationResult.class,
    DVSUplinkPortPolicy.class,
    StorageDrsIoLoadBalanceConfig.class,
    DVSPolicy.class,
    HostLicenseSpec.class,
    PhysicalNicCdpInfo.class,
    VmDiskFileQueryFilter.class,
    HostConfigSpec.class,
    NetDhcpConfigSpecDhcpOptionsSpec.class,
    SoftwarePackageCapability.class,
    HostVFlashManagerVFlashCacheConfigSpec.class,
    VMwareDVSPvlanConfigSpec.class,
    HostVirtualNicIpRouteSpec.class,
    VslmVClockInfo.class,
    HostSubSpecification.class,
    VmfsUnmapBandwidthSpec.class,
    DvsVmVnicResourceAllocation.class,
    ClusterComputeResourceDvsProfileDVPortgroupSpecToServiceMapping.class,
    VirtualMachineRelocateSpecDiskLocator.class,
    VirtualMachineProfileDetailsDiskProfileDetails.class,
    PhysicalNicLinkInfo.class,
    ManagedByInfo.class,
    DistributedVirtualPortgroupInfo.class,
    HostFirewallRulesetRulesetSpec.class,
    DvsHostInfrastructureTrafficResourceAllocation.class,
    HostFirewallConfigRuleSetConfig.class,
    ServiceConsoleReservationInfo.class,
    HostVvolVolumeSpecification.class,
    HostDiskMappingPartitionInfo.class,
    NetIpRouteConfigInfoGateway.class,
    StorageDrsPodConfigSpec.class,
    SessionManagerServiceRequestSpec.class,
    VirtualMachineMemoryReservationSpec.class,
    VirtualMachineFeatureRequirement.class,
    HostBootDevice.class,
    DatastoreMountPathDatastorePair.class,
    HostNicFailureCriteria.class,
    NetIpRouteConfigSpecGatewaySpec.class,
    HostPlugStoreTopologyPlugin.class,
    ClusterComputeResourceDVSSettingDVPortgroupToServiceMapping.class,
    HostFirewallConfig.class,
    OvfOptionInfo.class,
    HostVMotionManagerDstInstantCloneResult.class,
    HostNvmeDisconnectSpec.class,
    HostVirtualNicManagerNicTypeSelection.class,
    DistributedVirtualSwitchManagerImportResult.class,
    FolderFailedHostResult.class,
    LatencySensitivity.class,
    HostProxySwitchHostLagConfig.class,
    ScsiLunDescriptor.class,
    HostVFlashManagerVFlashResourceConfigSpec.class,
    HostDatastoreSystemCapabilities.class,
    HostRdmaDeviceCapability.class,
    ProfilePolicyOptionMetadata.class,
    HostPortGroupPort.class,
    HostSystemResourceInfo.class,
    PerformanceDescription.class,
    DatastoreVVolContainerFailoverPair.class,
    HostLowLevelProvisioningManagerSnapshotLayoutSpec.class,
    PropertyChange.class,
    VchaNodeRuntimeInfo.class,
    GuestRegKeySpec.class,
    ProfileApplyProfileProperty.class,
    ClusterComputeResourceDvsProfile.class,
    DatastoreHostMount.class,
    HostDatastoreSystemDatastoreResult.class,
    HostAutoStartManagerConfig.class,
    IpPoolIpPoolConfigInfo.class,
    HostInternetScsiHbaSendTarget.class,
    ReplicationInfoDiskSettings.class,
    VMwareDvsLagIpfixConfig.class,
    HostAuthenticationManagerInfo.class,
    ClusterDrsFaults.class,
    DVSNetworkResourcePoolConfigSpec.class,
    HostScsiTopologyLun.class,
    CustomizationPassword.class,
    ClusterDpmHostConfigInfo.class,
    HostListSummaryGatewaySummary.class,
    AuthorizationDescription.class,
    ComplianceLocator.class,
    VASAStorageArray.class,
    HostPnicNetworkResourceInfo.class,
    HbrManagerVmReplicationCapability.class,
    HostConfigSummary.class,
    DesiredSoftwareSpec.class,
    BaseConfigInfoBackingInfo.class,
    VsanHostConfigInfoStorageInfo.class,
    ClusterVmReadiness.class,
    HostSystemSwapConfiguration.class,
    ClusterPowerOnVmResult.class,
    ProfileProfileStructureProperty.class,
    HostPortGroupSpec.class,
    HostNatService.class,
    GuestOsDescriptor.class,
    HostFirewallRulesetIpList.class,
    FaultToleranceMetaSpec.class,
    DVPortSetting.class,
    NetIpConfigInfo.class,
    NodeNetworkSpec.class,
    HostStorageDeviceInfo.class,
    ClusterComputeResourceClusterConfigResult.class,
    HostInternetScsiHbaTargetSet.class,
    PolicyOption.class,
    ToolsConfigInfoToolsLastInstallInfo.class,
    ProfilePropertyPath.class,
    VirtualMachineVcpuConfig.class,
    HostListSummary.class,
    HostFibreChannelOverEthernetHbaLinkInfo.class,
    PerfMetricSeries.class,
    CustomizationUserData.class,
    NvdimmSummary.class,
    VsanClusterConfigInfo.class,
    ExtensionOvfConsumerInfo.class,
    DistributedVirtualSwitchHostMemberConfigSpec.class,
    VirtualAppLinkInfo.class,
    VirtualDeviceBusSlotOption.class,
    FaultToleranceConfigSpec.class,
    HostNumaNode.class,
    SharesOption.class,
    DVSNetworkResourcePoolAllocationInfo.class,
    EventDescription.class,
    HostGraphicsConfig.class,
    GuestDiskInfo.class,
    DistributedVirtualSwitchPortConnection.class,
    PhysicalNicConfig.class,
    ClusterDasAdvancedRuntimeInfoVmcpCapabilityInfo.class,
    VirtualMachineContentLibraryItemInfo.class,
    ClusterDasHostInfo.class,
    ProfileDeferredPolicyOptionParameter.class,
    HostIpRouteEntry.class,
    HostSystemReconnectSpec.class,
    CustomizationAdapterMapping.class,
    HostConnectSpec.class,
    HostVFlashManagerVFlashConfigInfo.class,
    TaskDescription.class,
    VsanHostDiskMapResult.class,
    HttpNfcLeaseDatastoreLeaseInfo.class,
    CustomizationIPSettingsIpV6AddressSpec.class,
    IscsiDependencyEntity.class,
    MissingObject.class,
    ClusterProactiveDrsConfigInfo.class,
    HostVirtualNicConnection.class,
    DistributedVirtualSwitchHostMemberBacking.class,
    PhysicalNic.class,
    ExtensionResourceInfo.class,
    ClusterDasHostRecommendation.class,
    VMwareDVSPvlanMapEntry.class,
    UpdateVirtualMachineFilesResult.class,
    HostDiskPartitionBlockRange.class,
    VMwareDvsLagVlanConfig.class,
    StorageResourceManagerStorageProfileStatistics.class,
    HostDeploymentInfo.class,
    HostRdmaDeviceBacking.class,
    VirtualMachineProfileDetails.class,
    PerfInterval.class,
    StorageIOAllocationOption.class,
    VirtualMachineVMCIDeviceOptionFilterSpecOption.class,
    SelectionSpec.class,
    NetIpRouteConfigInfoIpRoute.class,
    ObjectUpdate.class,
    HostService.class,
    HostConfigChange.class,
    NetworkSummary.class,
    PlacementSpec.class,
    ClusterComputeResourceHostConfigurationInput.class,
    VsanPolicyChangeBatch.class,
    OvfConsumerOvfSection.class,
    TaskFilterSpec.class,
    HostAssignableHardwareBinding.class,
    HostVFlashManagerVFlashResourceRunTimeInfo.class,
    VAppPropertyInfo.class,
    CryptoManagerKmipServerStatus.class,
    DVSRuntimeInfo.class,
    VnicPortArgument.class,
    HostPersistentMemoryInfo.class,
    VmConfigInfo.class,
    HostLicensableResourceInfo.class,
    VirtualHardwareOption.class,
    DistributedVirtualSwitchManagerDvsProductSpec.class,
    NetDhcpConfigInfoDhcpOptions.class,
    FaultToleranceSecondaryOpResult.class,
    VmDiskFileEncryptionInfo.class,
    HostCertificateManagerCertificateInfo.class,
    HostSriovDevicePoolInfo.class,
    NvdimmGuid.class,
    VirtualMachineStorageInfo.class,
    DiagnosticManagerBundleInfo.class,
    LicenseSource.class,
    HostNatServicePortForwardSpec.class,
    HostEnterMaintenanceResult.class,
    HostGraphicsConfigDeviceType.class,
    HostSevInfo.class,
    VMwareDvsIpfixCapability.class,
    HostPlugStoreTopologyPath.class,
    HostDatastoreBrowserSearchResults.class,
    HostProfileManagerCompositionResultResultElement.class,
    DistributedVirtualSwitchManagerHostDvsFilterSpec.class,
    HostConfigInfo.class,
    DesiredSoftwareSpecBaseImageSpec.class,
    KmipServerSpec.class,
    HostVMotionNetConfig.class,
    ToolsConfigInfo.class,
    WaitOptions.class,
    StorageDrsPodSelectionSpec.class,
    HostMultipathInfoPath.class,
    ClusterNetworkConfigSpec.class,
    HostFirewallRuleset.class,
    DVSContactInfo.class,
    PerfQuerySpec.class,
    IoFilterHostIssue.class,
    VmConfigSpec.class,
    VirtualDeviceConfigSpecBackingSpec.class,
    HostGraphicsInfo.class,
    HttpNfcLeaseHostInfo.class,
    HostTpmEventDetails.class,
    FcoeConfigFcoeCapabilities.class,
    ExtensionServerInfo.class,
    NetDhcpConfigSpec.class,
    ExtensionFaultTypeInfo.class,
    ClusterComputeResourceDVSSetting.class,
    ProfileMetadataProfileSortSpec.class,
    HostDiskPartitionSpec.class,
    FcoeConfigFcoeSpecification.class,
    VirtualMachineStorageSummary.class,
    ModeInfo.class,
    VirtualMachineFileInfo.class,
    HostProxySwitchSpec.class,
    VirtualDeviceConnectOption.class,
    OvfManagerCommonParams.class,
    VirtualMachineInstantCloneSpec.class,
    TaskFilterSpecByEntity.class,
    HostResignatureRescanResult.class,
    DvsHostInfrastructureTrafficResource.class,
    ProfileUpdateFailedUpdateFailure.class,
    AlarmDescription.class,
    ClusterUsageSummary.class,
    VsanUpgradeSystemNetworkPartitionInfo.class,
    VsanClusterConfigInfoHostDefaultInfo.class,
    NetIpRouteConfigInfo.class,
    ImportSpec.class,
    OvfNetworkMapping.class,
    HostPlugStoreTopology.class,
    HostDatastoreBrowserSearchSpec.class,
    VirtualMachineSnapshotTree.class,
    VslmMigrateSpec.class,
    HostUnresolvedVmfsVolumeResolveStatus.class,
    MultipleCertificatesVerifyFaultThumbprintData.class,
    KeyAnyValue.class,
    FolderBatchAddHostsToClusterResult.class,
    HostDhcpServiceSpec.class,
    ResourcePoolRuntimeInfo.class,
    AnswerFileStatusError.class,
    HostNatServiceSpec.class,
    HostVirtualSwitchBeaconConfig.class,
    HostScsiTopologyInterface.class,
    EntityBackup.class,
    DatastoreInfo.class,
    HostTrustAuthorityAttestationInfo.class,
    ImportOperationBulkFaultFaultOnImport.class,
    HostMultipathStateInfo.class,
    HostMultipathInfoLogicalUnitPolicy.class,
    ReplicationConfigSpec.class,
    VAppCloneSpecResourceMap.class,
    DVPortConfigSpec.class,
    TaskFilterSpecByUsername.class,
    ComputeResourceSummary.class,
    HostSnmpConfigSpec.class,
    HostDiagnosticPartitionCreateSpec.class,
    DesiredSoftwareSpecComponentSpec.class,
    HostMaintenanceSpec.class,
    GuestAuthAliasInfo.class,
    ProfileConfigInfo.class,
    IoFilterInfo.class,
    VmConfigFileQueryFlags.class,
    HostMemberRuntimeInfo.class,
    HostNvmeSpec.class,
    HostInternetScsiHbaIPCapabilities.class,
    HostVirtualNicSpec.class,
    ResourceAllocationInfo.class,
    PrivilegePolicyDef.class,
    VirtualMachineConsolePreferences.class,
    HostCpuInfo.class,
    VirtualMachineDisplayTopology.class,
    HostPciDevice.class,
    VMwareDvsLacpCapability.class,
    HostNetworkConfig.class,
    FaultToleranceConfigInfo.class,
    StorageDrsAutomationConfig.class,
    HostLocalFileSystemVolumeSpec.class,
    CheckResult.class,
    HostAuthenticationStoreInfo.class,
    ClusterDasAdmissionControlPolicy.class,
    PerformanceStatisticsDescription.class,
    DvsVmVnicNetworkResourcePoolRuntimeInfo.class,
    HostFileAccess.class,
    ResourcePoolSummary.class,
    EventFilterSpecByEntity.class,
    DatastoreCapability.class,
    ClusterCryptoConfigInfo.class,
    ExtExtendedProductInfo.class,
    DatacenterConfigSpec.class,
    WitnessNodeInfo.class,
    HostInternetScsiHbaIscsiIpv6Address.class,
    ScsiLunCapabilities.class,
    ClusterEVCManagerEVCState.class,
    HostTpmAttestationInfo.class,
    StoragePlacementSpec.class,
    HostUnresolvedVmfsResolutionSpec.class,
    VslmCreateSpecBackingSpec.class,
    VirtualMachineCloneSpec.class,
    HostActiveDirectorySpec.class,
    HostMultipathInfoLogicalUnitStorageArrayTypePolicy.class,
    CustomizationOptions.class,
    ChangesInfoEventArgument.class,
    VirtualMachineFileLayoutSnapshotLayout.class,
    HostSgxInfo.class,
    HostNvmeNamespace.class,
    CryptoSpec.class,
    VirtualDeviceConnectInfo.class,
    DVPortState.class,
    ClusterComputeResourceHCIConfigSpec.class,
    NetIpStackInfoNetToMedia.class,
    HttpNfcLeaseInfo.class,
    DVSBackupRestoreCapability.class,
    FolderNewHostSpec.class,
    ClusterRecommendation.class,
    NvdimmDimmInfo.class,
    VsanHostMembershipInfo.class,
    CustomizationIdentification.class,
    GuestFileInfo.class,
    ClusterDasAdmissionControlInfo.class,
    CustomizationIpV6Generator.class,
    FaultsByVM.class,
    InventoryDescription.class,
    DVSVmVnicNetworkResourcePool.class,
    HostDnsConfig.class,
    PrivilegeAvailability.class,
    HostFeatureVersionInfo.class,
    EventFilterSpecByTime.class,
    HttpNfcLeaseCapabilities.class,
    HostPciPassthruConfig.class,
    NvdimmNamespaceInfo.class,
    VirtualMachineGuestQuiesceSpec.class,
    ProfileMetadataProfileOperationMessage.class,
    HostVFlashResourceConfigurationResult.class,
    PlacementRankResult.class,
    DVSRollbackCapability.class,
    ClusterFailoverHostAdmissionControlInfoHostStatus.class,
    DVSSummary.class,
    DvsResourceRuntimeInfo.class,
    NodeDeploymentSpec.class,
    VMwareDvsLacpGroupSpec.class,
    AlarmExpression.class,
    StorageDrsConfigSpec.class,
    ResourcePoolResourceUsage.class,
    VirtualMachineDeviceRuntimeInfo.class,
    StorageDrsSpaceLoadBalanceConfig.class,
    HostConfigManager.class,
    HostReliableMemoryInfo.class,
    VirtualMachineFileLayoutExDiskLayout.class,
    DvsApplyOperationFaultFaultOnObject.class,
    DVPortgroupConfigSpec.class,
    VMwareDVSVspanConfigSpec.class,
    ClusterDasFailoverLevelAdvancedRuntimeInfoHostSlots.class,
    DistributedVirtualPortgroupProblem.class,
    VirtualMachineRuntimeInfo.class,
    LicenseReservationInfo.class,
    DVPortConfigInfo.class,
    HostCacheConfigurationInfo.class,
    HostPciPassthruInfo.class,
    VirtualMachineSummary.class,
    PlacementRankSpec.class,
    VirtualMachineMemoryReservationInfo.class,
    HostFaultToleranceManagerComponentHealthInfo.class,
    HostNatServiceConfig.class,
    LicenseManagerEvaluationInfo.class,
    DvsNetworkRuleQualifier.class,
    DatacenterMismatchArgument.class,
    ClusterComputeResourceValidationResultBase.class,
    ReplicationVmProgressInfo.class,
    VirtualDiskSpec.class,
    HostOpaqueSwitch.class,
    DVSCreateSpec.class,
    TaskReason.class,
    HostVirtualNic.class,
    ReplicationSpec.class,
    HostDiskMappingOption.class,
    KmipServerStatus.class,
    HostNetworkInfo.class,
    ClusterAttemptedVmInfo.class,
    VslmInfrastructureObjectPolicySpec.class,
    HostMultipathInfoLogicalUnit.class,
    HostInternetScsiHbaAuthenticationCapabilities.class,
    GuestInfo.class,
    DatacenterConfigInfo.class,
    DVSNetworkResourcePool.class,
    EventDescriptionEventDetail.class,
    HostDhcpServiceConfig.class,
    PerformanceManagerCounterLevelMapping.class,
    HostVirtualSwitch.class,
    VirtualMachineDefaultPowerOpInfo.class,
    HostNasVolumeSpec.class,
    HostFirewallRulesetIpNetwork.class,
    ProfileParameterMetadataParameterRelationMetadata.class,
    VirtualMachineMessage.class,
    ExtSolutionManagerInfo.class,
    HostVirtualSwitchSpec.class,
    VirtualMachineProfileSpec.class,
    HostVMotionInfo.class,
    HostInternetScsiHbaDigestProperties.class,
    NvdimmNamespaceDeleteSpec.class,
    VirtualMachineMetadataManagerVmMetadata.class,
    DVPortStatus.class,
    PhysicalNicSpec.class,
    HostPlugStoreTopologyTarget.class,
    ServiceLocatorCredential.class,
    HostNetworkPolicy.class,
    AlarmSpec.class,
    HostNvmeTopology.class,
    StorageIORMInfo.class,
    VirtualMachineBootOptions.class,
    VAppProductInfo.class,
    DistributedVirtualSwitchManagerHostContainer.class,
    AnswerFileCreateSpec.class,
    VmfsDatastoreSpec.class,
    HostProfileManagerCompositionValidationResult.class,
    FileQuery.class,
    ComputeResourceConfigInfo.class,
    NetBIOSConfigInfo.class,
    ClusterOrchestrationInfo.class,
    CryptoManagerKmipCertificateInfo.class,
    HostProxySwitchConfig.class,
    NetIpConfigSpec.class,
    HostIpRouteTableConfig.class,
    PhysicalNicCdpDeviceCapability.class,
    HostRuntimeInfoNetworkRuntimeInfo.class,
    VsanNewPolicyBatch.class,
    VStorageObjectSnapshotInfoVStorageObjectSnapshot.class,
    HostListSummaryQuickStats.class,
    PowerSystemCapability.class,
    EventArgument.class,
    GuestInfoNamespaceGenerationInfo.class,
    HostIpConfigIpV6Address.class,
    NetIpStackInfoDefaultRouter.class,
    HostNetStackInstance.class,
    VsanUpgradeSystemUpgradeHistoryItem.class,
    GuestFileAttributes.class,
    SelectionSet.class,
    VirtualDiskOptionVFlashCacheConfigOption.class,
    VmConfigFileEncryptionInfo.class,
    HostSharedGpuCapabilities.class,
    ClusterSlotPolicy.class,
    ExtensionPrivilegeInfo.class,
    TaskFilterSpecByTime.class,
    HostIpmiInfo.class,
    OptionValue.class,
    HostScsiTopologyTarget.class,
    StorageRequirement.class,
    HostPortGroup.class,
    FaultDomainId.class,
    CustomizationIdentitySettings.class,
    VMwareVspanPort.class,
    ClusterConfigSpec.class,
    CustomizationLicenseFilePrintData.class,
    ClusterDasVmConfigInfo.class,
    VirtualMachineDeviceRuntimeInfoDeviceRuntimeState.class,
    HostPatchManagerLocator.class,
    ClusterGroupInfo.class,
    HostNvmeController.class,
    ClusterDasConfigInfo.class,
    VsanHostRuntimeInfoDiskIssue.class,
    VAppCloneSpec.class,
    DVPortgroupPolicy.class,
    VirtualMachineNetworkShaperInfo.class,
    VmPodConfigForPlacement.class,
    VsanHostDecommissionMode.class,
    ProfileExecuteResult.class,
    VmfsDatastoreBaseOption.class,
    HostInternetScsiHbaDiscoveryCapabilities.class,
    FileInfo.class,
    EntityBackupConfig.class,
    ClusterDasVmSettings.class,
    NvdimmPMemNamespaceCreateSpec.class,
    ArrayUpdateSpec.class,
    VmDiskFileQueryFlags.class,
    HostInternetScsiHbaStaticTarget.class,
    PerfSampleInfo.class,
    GuestProgramSpec.class,
    VVolHostPE.class,
    Description.class,
    OvfConsumerOstNode.class,
    GuestAuthentication.class,
    HostHardwareStatusInfo.class,
    HostProfileManagerCompositionValidationResultResultElement.class,
    ResourcePoolQuickStats.class,
    ComputeResourceHostSPBMLicenseInfo.class,
    DVSConfigSpec.class,
    VsanHostConfigInfoClusterInfo.class,
    CustomFieldValue.class,
    CustomizationSpec.class,
    HostVsanInternalSystemCmmdsQuery.class,
    LinkDiscoveryProtocolConfig.class,
    ScheduledTaskSpec.class,
    GuestAuthSubject.class,
    GuestInfoCustomizationInfo.class,
    AutoStartPowerInfo.class,
    GuestInfoVirtualDiskMapping.class,
    VirtualDeviceBusSlotInfo.class,
    HostHardwareSummary.class,
    ProfileCreateSpec.class,
    VimVasaProviderStatePerArray.class,
    VirtualMachineVMCIDeviceFilterInfo.class,
    HostVmfsSpec.class,
    Relation.class,
    RetrieveVStorageObjSpec.class,
    ScsiLunDurableName.class,
    DesiredSoftwareSpecVendorAddOnSpec.class,
    HostVirtualSwitchBridge.class,
    VirtualMachineSriovDevicePoolInfo.class,
    DVSConfigInfo.class,
    PropertySpec.class,
    ClusterAction.class,
    HostRuntimeInfoNetStackInstanceRuntimeInfo.class,
    HostProfileManagerCompositionResult.class,
    HostPowerPolicy.class,
    VAppOvfSectionInfo.class,
    HostForceMountedInfo.class,
    PlacementAffinityRule.class,
    HostHardwareElementInfo.class,
    VirtualMachineSgxInfo.class,
    GuestScreenInfo.class,
    ClusterRuleInfo.class,
    HostStorageOperationalInfo.class,
    ReplicationGroupId.class,
    ScheduledHardwareUpgradeInfo.class,
    PodDiskLocator.class,
    ClusterDrsConfigInfo.class,
    AlarmSetting.class,
    UserSearchResult.class,
    VirtualMachineConfigInfoOverheadInfo.class,
    ConflictingConfigurationConfig.class,
    NegatableExpression.class,
    UsbScanCodeSpecModifierType.class,
    HostDatastoreConnectInfo.class,
    HostLowLevelProvisioningManagerFileDeleteResult.class,
    DvsOutOfSyncHostArgument.class,
    HostRdmaDeviceConnectionInfo.class,
    PerfEntityMetricBase.class,
    VirtualDeviceConfigSpec.class,
    HostSystemInfo.class,
    VirtualMachineLegacyNetworkSwitchInfo.class,
    DistributedVirtualSwitchHostMemberConfigInfo.class,
    VirtualMachineMetadataManagerVmMetadataOwner.class,
    AlarmAction.class,
    HostOpaqueNetworkInfo.class,
    VsanHostDiskMapInfo.class,
    GuestRegValueDataSpec.class,
    LocalizableMessage.class,
    ClusterVmToolsMonitoringSettings.class,
    HostMemberHealthCheckResult.class,
    HostInternetScsiHbaIPv6Properties.class,
    HostSecuritySpec.class,
    VMwareDVSVspanCapability.class,
    ClusterInfraUpdateHaConfigInfo.class,
    VAppCloneSpecNetworkMappingPair.class,
    DVSHealthCheckConfig.class,
    ClusterDrsRecommendation.class,
    VVolVmConfigFileUpdateResult.class,
    AlarmTriggeringActionTransitionSpec.class,
    TaskScheduler.class,
    HostVMotionConfig.class,
    VirtualMachineBootOptionsBootableDevice.class,
    HostDiskPartitionAttributes.class,
    HostGatewaySpec.class,
    RetrieveOptions.class,
    EnumDescription.class,
    VsanHostConfigInfo.class,
    HostNvmeTransportParameters.class,
    HostCpuPackage.class,
    Action.class,
    AlarmFilterSpec.class,
    DistributedVirtualSwitchHostMemberRuntimeState.class,
    DistributedVirtualPortgroupNsxPortgroupOperationResult.class,
    PhysicalNicHint.class,
    BaseConfigInfo.class,
    HostSystemSwapConfigurationSystemSwapOption.class,
    VsanHostConfigInfoNetworkInfo.class,
    CustomizationIPSettings.class,
    ClusterComputeResourceVCProfile.class,
    HostVFlashManagerVFlashCacheConfigInfo.class,
    DvsVnicAllocatedResource.class,
    VirtualDeviceOption.class,
    HostFirewallInfo.class,
    HostFeatureMask.class,
    VsanUpgradeSystemPreflightCheckIssue.class,
    ExtendedEventPair.class,
    FolderBatchAddStandaloneHostsResult.class,
    HostTargetTransport.class,
    HostNetworkSecurityPolicy.class,
    VMwareDvsMtuCapability.class,
    ClusterDrsVmConfigInfo.class,
    VirtualDeviceBackingOption.class,
    VchaClusterDeploymentSpec.class,
    VirtualDevice.class,
    HostConnectInfoNetworkInfo.class,
    VirtualHardware.class,
    DVSHealthCheckCapability.class,
    DvsNetworkRuleAction.class,
    OptionType.class,
    HostSystemIdentificationInfo.class,
    HostAccountSpec.class,
    ExtSolutionManagerInfoTabInfo.class,
    HostHostBusAdapter.class,
    CustomizationName.class,
    ClusterDasData.class,
    VAppEntityConfigInfo.class,
    VirtualMachineConfigSpec.class,
    ApplyProfile.class,
    InheritablePolicy.class,
    VirtualMachineTargetInfo.class,
    VMwareIpfixConfig.class,
    VirtualDeviceBackingInfo.class,
    GuestRegKeyNameSpec.class,
    Event.class,
    CustomizationIpGenerator.class,
    HostFileSystemVolume.class
})
public class DynamicData {


}