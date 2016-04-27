/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.website.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * Description of a managed hosting environment.
 */
@JsonFlatten
public class ManagedHostingEnvironment extends Resource {
    /**
     * Name of the managed hosting environment.
     */
    @JsonProperty(value = "properties.name")
    private String managedHostingEnvironmentName;

    /**
     * Location of the managed hosting environment e.g. "West US".
     */
    @JsonProperty(value = "properties.location")
    private String managedHostingEnvironmentLocation;

    /**
     * Current status of the managed hosting environment. Possible values
     * include: 'Preparing', 'Ready', 'Deleting'.
     */
    @JsonProperty(value = "properties.status")
    private ManagedHostingEnvironmentStatus status;

    /**
     * Description of the managed hosting environment's virtual network.
     */
    @JsonProperty(value = "properties.virtualNetwork")
    private VirtualNetworkProfile virtualNetwork;

    /**
     * Number of ip ssl addresses reserved for the managed hosting environment.
     */
    @JsonProperty(value = "properties.ipsslAddressCount")
    private Integer ipsslAddressCount;

    /**
     * DNS suffix of the managed hosting environment.
     */
    @JsonProperty(value = "properties.dnsSuffix")
    private String dnsSuffix;

    /**
     * Subscription of the managed hosting environment (read only).
     */
    @JsonProperty(value = "properties.subscriptionId")
    private String subscriptionId;

    /**
     * Resource group of the managed hosting environment (read only).
     */
    @JsonProperty(value = "properties.resourceGroup")
    private String resourceGroup;

    /**
     * True/false indicating whether the managed hosting environment is
     * healthy.
     */
    @JsonProperty(value = "properties.environmentIsHealthy")
    private Boolean environmentIsHealthy;

    /**
     * Detailed message about with results of the last check of the managed
     * hosting environment.
     */
    @JsonProperty(value = "properties.environmentStatus")
    private String environmentStatus;

    /**
     * True/false indicating whether the managed hosting environment is
     * suspended. The environment can be suspended e.g. when the management
     * endpoint is no longer available
     * (most likely because NSG blocked the incoming traffic).
     */
    @JsonProperty(value = "properties.suspended")
    private Boolean suspended;

    /**
     * Resource id of the api management account associated with this managed
     * hosting environment (read only).
     */
    @JsonProperty(value = "properties.apiManagementAccount")
    private String apiManagementAccount;

    /**
     * Get the managedHostingEnvironmentName value.
     *
     * @return the managedHostingEnvironmentName value
     */
    public String getManagedHostingEnvironmentName() {
        return this.managedHostingEnvironmentName;
    }

    /**
     * Set the managedHostingEnvironmentName value.
     *
     * @param managedHostingEnvironmentName the managedHostingEnvironmentName value to set
     */
    public void setManagedHostingEnvironmentName(String managedHostingEnvironmentName) {
        this.managedHostingEnvironmentName = managedHostingEnvironmentName;
    }

    /**
     * Get the managedHostingEnvironmentLocation value.
     *
     * @return the managedHostingEnvironmentLocation value
     */
    public String getManagedHostingEnvironmentLocation() {
        return this.managedHostingEnvironmentLocation;
    }

    /**
     * Set the managedHostingEnvironmentLocation value.
     *
     * @param managedHostingEnvironmentLocation the managedHostingEnvironmentLocation value to set
     */
    public void setManagedHostingEnvironmentLocation(String managedHostingEnvironmentLocation) {
        this.managedHostingEnvironmentLocation = managedHostingEnvironmentLocation;
    }

    /**
     * Get the status value.
     *
     * @return the status value
     */
    public ManagedHostingEnvironmentStatus getStatus() {
        return this.status;
    }

    /**
     * Set the status value.
     *
     * @param status the status value to set
     */
    public void setStatus(ManagedHostingEnvironmentStatus status) {
        this.status = status;
    }

    /**
     * Get the virtualNetwork value.
     *
     * @return the virtualNetwork value
     */
    public VirtualNetworkProfile getVirtualNetwork() {
        return this.virtualNetwork;
    }

    /**
     * Set the virtualNetwork value.
     *
     * @param virtualNetwork the virtualNetwork value to set
     */
    public void setVirtualNetwork(VirtualNetworkProfile virtualNetwork) {
        this.virtualNetwork = virtualNetwork;
    }

    /**
     * Get the ipsslAddressCount value.
     *
     * @return the ipsslAddressCount value
     */
    public Integer getIpsslAddressCount() {
        return this.ipsslAddressCount;
    }

    /**
     * Set the ipsslAddressCount value.
     *
     * @param ipsslAddressCount the ipsslAddressCount value to set
     */
    public void setIpsslAddressCount(Integer ipsslAddressCount) {
        this.ipsslAddressCount = ipsslAddressCount;
    }

    /**
     * Get the dnsSuffix value.
     *
     * @return the dnsSuffix value
     */
    public String getDnsSuffix() {
        return this.dnsSuffix;
    }

    /**
     * Set the dnsSuffix value.
     *
     * @param dnsSuffix the dnsSuffix value to set
     */
    public void setDnsSuffix(String dnsSuffix) {
        this.dnsSuffix = dnsSuffix;
    }

    /**
     * Get the subscriptionId value.
     *
     * @return the subscriptionId value
     */
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Set the subscriptionId value.
     *
     * @param subscriptionId the subscriptionId value to set
     */
    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    /**
     * Get the resourceGroup value.
     *
     * @return the resourceGroup value
     */
    public String getResourceGroup() {
        return this.resourceGroup;
    }

    /**
     * Set the resourceGroup value.
     *
     * @param resourceGroup the resourceGroup value to set
     */
    public void setResourceGroup(String resourceGroup) {
        this.resourceGroup = resourceGroup;
    }

    /**
     * Get the environmentIsHealthy value.
     *
     * @return the environmentIsHealthy value
     */
    public Boolean getEnvironmentIsHealthy() {
        return this.environmentIsHealthy;
    }

    /**
     * Set the environmentIsHealthy value.
     *
     * @param environmentIsHealthy the environmentIsHealthy value to set
     */
    public void setEnvironmentIsHealthy(Boolean environmentIsHealthy) {
        this.environmentIsHealthy = environmentIsHealthy;
    }

    /**
     * Get the environmentStatus value.
     *
     * @return the environmentStatus value
     */
    public String getEnvironmentStatus() {
        return this.environmentStatus;
    }

    /**
     * Set the environmentStatus value.
     *
     * @param environmentStatus the environmentStatus value to set
     */
    public void setEnvironmentStatus(String environmentStatus) {
        this.environmentStatus = environmentStatus;
    }

    /**
     * Get the suspended value.
     *
     * @return the suspended value
     */
    public Boolean getSuspended() {
        return this.suspended;
    }

    /**
     * Set the suspended value.
     *
     * @param suspended the suspended value to set
     */
    public void setSuspended(Boolean suspended) {
        this.suspended = suspended;
    }

    /**
     * Get the apiManagementAccount value.
     *
     * @return the apiManagementAccount value
     */
    public String getApiManagementAccount() {
        return this.apiManagementAccount;
    }

    /**
     * Set the apiManagementAccount value.
     *
     * @param apiManagementAccount the apiManagementAccount value to set
     */
    public void setApiManagementAccount(String apiManagementAccount) {
        this.apiManagementAccount = apiManagementAccount;
    }

}