/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql;


/**
 * Respresents a SKU on an ARM resource.
 */
public class ArmResourceSku {
    /**
     * The name property.
     */
    private String name;

    /**
     * The tier property.
     */
    private String tier;

    /**
     * The size property.
     */
    private String size;

    /**
     * The family property.
     */
    private String family;

    /**
     * The capacity property.
     */
    private Integer capacity;

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the ArmResourceSku object itself.
     */
    public ArmResourceSku withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the tier value.
     *
     * @return the tier value
     */
    public String tier() {
        return this.tier;
    }

    /**
     * Set the tier value.
     *
     * @param tier the tier value to set
     * @return the ArmResourceSku object itself.
     */
    public ArmResourceSku withTier(String tier) {
        this.tier = tier;
        return this;
    }

    /**
     * Get the size value.
     *
     * @return the size value
     */
    public String size() {
        return this.size;
    }

    /**
     * Set the size value.
     *
     * @param size the size value to set
     * @return the ArmResourceSku object itself.
     */
    public ArmResourceSku withSize(String size) {
        this.size = size;
        return this;
    }

    /**
     * Get the family value.
     *
     * @return the family value
     */
    public String family() {
        return this.family;
    }

    /**
     * Set the family value.
     *
     * @param family the family value to set
     * @return the ArmResourceSku object itself.
     */
    public ArmResourceSku withFamily(String family) {
        this.family = family;
        return this;
    }

    /**
     * Get the capacity value.
     *
     * @return the capacity value
     */
    public Integer capacity() {
        return this.capacity;
    }

    /**
     * Set the capacity value.
     *
     * @param capacity the capacity value to set
     * @return the ArmResourceSku object itself.
     */
    public ArmResourceSku withCapacity(Integer capacity) {
        this.capacity = capacity;
        return this;
    }

}