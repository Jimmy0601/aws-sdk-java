/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.certificatemanager.model;

/**
 * 
 */
public enum FailureReason {

    NO_AVAILABLE_CONTACTS("NO_AVAILABLE_CONTACTS"),
    ADDITIONAL_VERIFICATION_REQUIRED("ADDITIONAL_VERIFICATION_REQUIRED"),
    DOMAIN_NOT_ALLOWED("DOMAIN_NOT_ALLOWED"),
    INVALID_PUBLIC_DOMAIN("INVALID_PUBLIC_DOMAIN"),
    OTHER("OTHER");

    private String value;

    private FailureReason(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *        real value
     * @return FailureReason corresponding to the value
     */
    public static FailureReason fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (FailureReason enumEntry : FailureReason.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
