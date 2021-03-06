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
 * Properties for creating a custom image from a VHD.
 */
public class CustomImagePropertiesCustom {
    /**
     * The image name.
     */
    @JsonProperty(value = "imageName")
    private String imageName;

    /**
     * Indicates whether sysprep has been run on the VHD.
     */
    @JsonProperty(value = "sysPrep")
    private Boolean sysPrep;

    /**
     * The OS type of the custom image (i.e. Windows, Linux). Possible values
     * include: 'Windows', 'Linux', 'None'.
     */
    @JsonProperty(value = "osType", required = true)
    private CustomImageOsType osType;

    /**
     * Get the imageName value.
     *
     * @return the imageName value
     */
    public String imageName() {
        return this.imageName;
    }

    /**
     * Set the imageName value.
     *
     * @param imageName the imageName value to set
     * @return the CustomImagePropertiesCustom object itself.
     */
    public CustomImagePropertiesCustom withImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }

    /**
     * Get the sysPrep value.
     *
     * @return the sysPrep value
     */
    public Boolean sysPrep() {
        return this.sysPrep;
    }

    /**
     * Set the sysPrep value.
     *
     * @param sysPrep the sysPrep value to set
     * @return the CustomImagePropertiesCustom object itself.
     */
    public CustomImagePropertiesCustom withSysPrep(Boolean sysPrep) {
        this.sysPrep = sysPrep;
        return this;
    }

    /**
     * Get the osType value.
     *
     * @return the osType value
     */
    public CustomImageOsType osType() {
        return this.osType;
    }

    /**
     * Set the osType value.
     *
     * @param osType the osType value to set
     * @return the CustomImagePropertiesCustom object itself.
     */
    public CustomImagePropertiesCustom withOsType(CustomImageOsType osType) {
        this.osType = osType;
        return this;
    }

}
