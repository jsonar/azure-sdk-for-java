/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datalake.analytics.models;

import java.util.List;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * A Data Lake Analytics account object, containing all information associated
 * with the named Data Lake Analytics account.
 */
@JsonFlatten
public class DataLakeAnalyticsAccount extends Resource {
    /**
     * the provisioning status of the Data Lake Analytics account. Possible
     * values include: 'Failed', 'Creating', 'Running', 'Succeeded',
     * 'Patching', 'Suspending', 'Resuming', 'Deleting', 'Deleted'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private DataLakeAnalyticsAccountStatus provisioningState;

    /**
     * the state of the Data Lake Analytics account. Possible values include:
     * 'Active', 'Suspended'.
     */
    @JsonProperty(value = "properties.state", access = JsonProperty.Access.WRITE_ONLY)
    private DataLakeAnalyticsAccountState state;

    /**
     * the default data lake storage account associated with this Data Lake
     * Analytics account.
     */
    @JsonProperty(value = "properties.defaultDataLakeStoreAccount", required = true)
    private String defaultDataLakeStoreAccount;

    /**
     * the maximum supported degree of parallelism for this account.
     */
    @JsonProperty(value = "properties.maxDegreeOfParallelism")
    private Integer maxDegreeOfParallelism;

    /**
     * the number of days that job metadata is retained.
     */
    @JsonProperty(value = "properties.queryStoreRetention")
    private Integer queryStoreRetention;

    /**
     * the maximum supported jobs running under the account at the same time.
     */
    @JsonProperty(value = "properties.maxJobCount")
    private Integer maxJobCount;

    /**
     * the system defined maximum supported degree of parallelism for this
     * account, which restricts the maximum value of parallelism the user can
     * set for the account..
     */
    @JsonProperty(value = "properties.systemMaxDegreeOfParallelism", access = JsonProperty.Access.WRITE_ONLY)
    private Integer systemMaxDegreeOfParallelism;

    /**
     * the system defined maximum supported jobs running under the account at
     * the same time, which restricts the maximum number of running jobs the
     * user can set for the account.
     */
    @JsonProperty(value = "properties.systemMaxJobCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer systemMaxJobCount;

    /**
     * the list of Data Lake storage accounts associated with this account.
     */
    @JsonProperty(value = "properties.dataLakeStoreAccounts", required = true)
    private List<DataLakeStoreAccountInfo> dataLakeStoreAccounts;

    /**
     * the list of Azure Blob storage accounts associated with this account.
     */
    @JsonProperty(value = "properties.storageAccounts")
    private List<StorageAccountInfo> storageAccounts;

    /**
     * the account creation time.
     */
    @JsonProperty(value = "properties.creationTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime creationTime;

    /**
     * the account last modified time.
     */
    @JsonProperty(value = "properties.lastModifiedTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime lastModifiedTime;

    /**
     * the full CName endpoint for this account.
     */
    @JsonProperty(value = "properties.endpoint", access = JsonProperty.Access.WRITE_ONLY)
    private String endpoint;

    /**
     * the commitment tier for the next month. Possible values include:
     * 'Consumption', 'Commitment_100AUHours', 'Commitment_500AUHours',
     * 'Commitment_1000AUHours', 'Commitment_5000AUHours',
     * 'Commitment_10000AUHours', 'Commitment_50000AUHours',
     * 'Commitment_100000AUHours', 'Commitment_500000AUHours'.
     */
    @JsonProperty(value = "properties.newTier")
    private TierType newTier;

    /**
     * the commitment tier in use for the current month. Possible values
     * include: 'Consumption', 'Commitment_100AUHours',
     * 'Commitment_500AUHours', 'Commitment_1000AUHours',
     * 'Commitment_5000AUHours', 'Commitment_10000AUHours',
     * 'Commitment_50000AUHours', 'Commitment_100000AUHours',
     * 'Commitment_500000AUHours'.
     */
    @JsonProperty(value = "properties.currentTier", access = JsonProperty.Access.WRITE_ONLY)
    private TierType currentTier;

    /**
     * The current state of the IP address firewall for this Data Lake
     * Analytics account. Possible values include: 'Enabled', 'Disabled'.
     */
    @JsonProperty(value = "properties.firewallState")
    private FirewallState firewallState;

    /**
     * The current state of allowing or disallowing IPs originating within
     * Azure through the firewall. If the firewall is disabled, this is not
     * enforced. Possible values include: 'Enabled', 'Disabled'.
     */
    @JsonProperty(value = "properties.firewallAllowAzureIps")
    private FirewallAllowAzureIpsState firewallAllowAzureIps;

    /**
     * The list of firewall rules associated with this Data Lake Analytics
     * account.
     */
    @JsonProperty(value = "properties.firewallRules")
    private List<FirewallRule> firewallRules;

    /**
     * the maximum supported degree of parallelism per job for this account.
     */
    @JsonProperty(value = "properties.maxDegreeOfParallelismPerJob")
    private Integer maxDegreeOfParallelismPerJob;

    /**
     * the minimum supported priority per job for this account.
     */
    @JsonProperty(value = "properties.minPriorityPerJob")
    private Integer minPriorityPerJob;

    /**
     * the list of compute policies to create in this account.
     */
    @JsonProperty(value = "properties.computePolicies")
    private List<ComputePolicyAccountCreateParameters> computePolicies;

    /**
     * Get the provisioningState value.
     *
     * @return the provisioningState value
     */
    public DataLakeAnalyticsAccountStatus provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the state value.
     *
     * @return the state value
     */
    public DataLakeAnalyticsAccountState state() {
        return this.state;
    }

    /**
     * Get the defaultDataLakeStoreAccount value.
     *
     * @return the defaultDataLakeStoreAccount value
     */
    public String defaultDataLakeStoreAccount() {
        return this.defaultDataLakeStoreAccount;
    }

    /**
     * Set the defaultDataLakeStoreAccount value.
     *
     * @param defaultDataLakeStoreAccount the defaultDataLakeStoreAccount value to set
     * @return the DataLakeAnalyticsAccount object itself.
     */
    public DataLakeAnalyticsAccount withDefaultDataLakeStoreAccount(String defaultDataLakeStoreAccount) {
        this.defaultDataLakeStoreAccount = defaultDataLakeStoreAccount;
        return this;
    }

    /**
     * Get the maxDegreeOfParallelism value.
     *
     * @return the maxDegreeOfParallelism value
     */
    public Integer maxDegreeOfParallelism() {
        return this.maxDegreeOfParallelism;
    }

    /**
     * Set the maxDegreeOfParallelism value.
     *
     * @param maxDegreeOfParallelism the maxDegreeOfParallelism value to set
     * @return the DataLakeAnalyticsAccount object itself.
     */
    public DataLakeAnalyticsAccount withMaxDegreeOfParallelism(Integer maxDegreeOfParallelism) {
        this.maxDegreeOfParallelism = maxDegreeOfParallelism;
        return this;
    }

    /**
     * Get the queryStoreRetention value.
     *
     * @return the queryStoreRetention value
     */
    public Integer queryStoreRetention() {
        return this.queryStoreRetention;
    }

    /**
     * Set the queryStoreRetention value.
     *
     * @param queryStoreRetention the queryStoreRetention value to set
     * @return the DataLakeAnalyticsAccount object itself.
     */
    public DataLakeAnalyticsAccount withQueryStoreRetention(Integer queryStoreRetention) {
        this.queryStoreRetention = queryStoreRetention;
        return this;
    }

    /**
     * Get the maxJobCount value.
     *
     * @return the maxJobCount value
     */
    public Integer maxJobCount() {
        return this.maxJobCount;
    }

    /**
     * Set the maxJobCount value.
     *
     * @param maxJobCount the maxJobCount value to set
     * @return the DataLakeAnalyticsAccount object itself.
     */
    public DataLakeAnalyticsAccount withMaxJobCount(Integer maxJobCount) {
        this.maxJobCount = maxJobCount;
        return this;
    }

    /**
     * Get the systemMaxDegreeOfParallelism value.
     *
     * @return the systemMaxDegreeOfParallelism value
     */
    public Integer systemMaxDegreeOfParallelism() {
        return this.systemMaxDegreeOfParallelism;
    }

    /**
     * Get the systemMaxJobCount value.
     *
     * @return the systemMaxJobCount value
     */
    public Integer systemMaxJobCount() {
        return this.systemMaxJobCount;
    }

    /**
     * Get the dataLakeStoreAccounts value.
     *
     * @return the dataLakeStoreAccounts value
     */
    public List<DataLakeStoreAccountInfo> dataLakeStoreAccounts() {
        return this.dataLakeStoreAccounts;
    }

    /**
     * Set the dataLakeStoreAccounts value.
     *
     * @param dataLakeStoreAccounts the dataLakeStoreAccounts value to set
     * @return the DataLakeAnalyticsAccount object itself.
     */
    public DataLakeAnalyticsAccount withDataLakeStoreAccounts(List<DataLakeStoreAccountInfo> dataLakeStoreAccounts) {
        this.dataLakeStoreAccounts = dataLakeStoreAccounts;
        return this;
    }

    /**
     * Get the storageAccounts value.
     *
     * @return the storageAccounts value
     */
    public List<StorageAccountInfo> storageAccounts() {
        return this.storageAccounts;
    }

    /**
     * Set the storageAccounts value.
     *
     * @param storageAccounts the storageAccounts value to set
     * @return the DataLakeAnalyticsAccount object itself.
     */
    public DataLakeAnalyticsAccount withStorageAccounts(List<StorageAccountInfo> storageAccounts) {
        this.storageAccounts = storageAccounts;
        return this;
    }

    /**
     * Get the creationTime value.
     *
     * @return the creationTime value
     */
    public DateTime creationTime() {
        return this.creationTime;
    }

    /**
     * Get the lastModifiedTime value.
     *
     * @return the lastModifiedTime value
     */
    public DateTime lastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * Get the endpoint value.
     *
     * @return the endpoint value
     */
    public String endpoint() {
        return this.endpoint;
    }

    /**
     * Get the newTier value.
     *
     * @return the newTier value
     */
    public TierType newTier() {
        return this.newTier;
    }

    /**
     * Set the newTier value.
     *
     * @param newTier the newTier value to set
     * @return the DataLakeAnalyticsAccount object itself.
     */
    public DataLakeAnalyticsAccount withNewTier(TierType newTier) {
        this.newTier = newTier;
        return this;
    }

    /**
     * Get the currentTier value.
     *
     * @return the currentTier value
     */
    public TierType currentTier() {
        return this.currentTier;
    }

    /**
     * Get the firewallState value.
     *
     * @return the firewallState value
     */
    public FirewallState firewallState() {
        return this.firewallState;
    }

    /**
     * Set the firewallState value.
     *
     * @param firewallState the firewallState value to set
     * @return the DataLakeAnalyticsAccount object itself.
     */
    public DataLakeAnalyticsAccount withFirewallState(FirewallState firewallState) {
        this.firewallState = firewallState;
        return this;
    }

    /**
     * Get the firewallAllowAzureIps value.
     *
     * @return the firewallAllowAzureIps value
     */
    public FirewallAllowAzureIpsState firewallAllowAzureIps() {
        return this.firewallAllowAzureIps;
    }

    /**
     * Set the firewallAllowAzureIps value.
     *
     * @param firewallAllowAzureIps the firewallAllowAzureIps value to set
     * @return the DataLakeAnalyticsAccount object itself.
     */
    public DataLakeAnalyticsAccount withFirewallAllowAzureIps(FirewallAllowAzureIpsState firewallAllowAzureIps) {
        this.firewallAllowAzureIps = firewallAllowAzureIps;
        return this;
    }

    /**
     * Get the firewallRules value.
     *
     * @return the firewallRules value
     */
    public List<FirewallRule> firewallRules() {
        return this.firewallRules;
    }

    /**
     * Set the firewallRules value.
     *
     * @param firewallRules the firewallRules value to set
     * @return the DataLakeAnalyticsAccount object itself.
     */
    public DataLakeAnalyticsAccount withFirewallRules(List<FirewallRule> firewallRules) {
        this.firewallRules = firewallRules;
        return this;
    }

    /**
     * Get the maxDegreeOfParallelismPerJob value.
     *
     * @return the maxDegreeOfParallelismPerJob value
     */
    public Integer maxDegreeOfParallelismPerJob() {
        return this.maxDegreeOfParallelismPerJob;
    }

    /**
     * Set the maxDegreeOfParallelismPerJob value.
     *
     * @param maxDegreeOfParallelismPerJob the maxDegreeOfParallelismPerJob value to set
     * @return the DataLakeAnalyticsAccount object itself.
     */
    public DataLakeAnalyticsAccount withMaxDegreeOfParallelismPerJob(Integer maxDegreeOfParallelismPerJob) {
        this.maxDegreeOfParallelismPerJob = maxDegreeOfParallelismPerJob;
        return this;
    }

    /**
     * Get the minPriorityPerJob value.
     *
     * @return the minPriorityPerJob value
     */
    public Integer minPriorityPerJob() {
        return this.minPriorityPerJob;
    }

    /**
     * Set the minPriorityPerJob value.
     *
     * @param minPriorityPerJob the minPriorityPerJob value to set
     * @return the DataLakeAnalyticsAccount object itself.
     */
    public DataLakeAnalyticsAccount withMinPriorityPerJob(Integer minPriorityPerJob) {
        this.minPriorityPerJob = minPriorityPerJob;
        return this;
    }

    /**
     * Get the computePolicies value.
     *
     * @return the computePolicies value
     */
    public List<ComputePolicyAccountCreateParameters> computePolicies() {
        return this.computePolicies;
    }

    /**
     * Set the computePolicies value.
     *
     * @param computePolicies the computePolicies value to set
     * @return the DataLakeAnalyticsAccount object itself.
     */
    public DataLakeAnalyticsAccount withComputePolicies(List<ComputePolicyAccountCreateParameters> computePolicies) {
        this.computePolicies = computePolicies;
        return this;
    }

}
