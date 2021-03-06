/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlab;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Subnet information.
 */
public class SubnetFragment {
    /**
     * The resource ID of the subnet.
     */
    @JsonProperty(value = "resourceId")
    private String resourceId;

    /**
     * The name of the subnet as seen in the lab.
     */
    @JsonProperty(value = "labSubnetName")
    private String labSubnetName;

    /**
     * The permission policy of the subnet for allowing public IP addresses
     * (i.e. Allow, Deny)). Possible values include: 'Default', 'Deny',
     * 'Allow'.
     */
    @JsonProperty(value = "allowPublicIp")
    private UsagePermissionType allowPublicIp;

    /**
     * Get the resourceId value.
     *
     * @return the resourceId value
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the resourceId value.
     *
     * @param resourceId the resourceId value to set
     * @return the SubnetFragment object itself.
     */
    public SubnetFragment withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get the labSubnetName value.
     *
     * @return the labSubnetName value
     */
    public String labSubnetName() {
        return this.labSubnetName;
    }

    /**
     * Set the labSubnetName value.
     *
     * @param labSubnetName the labSubnetName value to set
     * @return the SubnetFragment object itself.
     */
    public SubnetFragment withLabSubnetName(String labSubnetName) {
        this.labSubnetName = labSubnetName;
        return this;
    }

    /**
     * Get the allowPublicIp value.
     *
     * @return the allowPublicIp value
     */
    public UsagePermissionType allowPublicIp() {
        return this.allowPublicIp;
    }

    /**
     * Set the allowPublicIp value.
     *
     * @param allowPublicIp the allowPublicIp value to set
     * @return the SubnetFragment object itself.
     */
    public SubnetFragment withAllowPublicIp(UsagePermissionType allowPublicIp) {
        this.allowPublicIp = allowPublicIp;
        return this;
    }

}
