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
package com.amazonaws.services.lightsail.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lightsail.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * RegionMarshaller
 */
public class RegionJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Region region, StructuredJsonGenerator jsonGenerator) {

        if (region == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (region.getContinentCode() != null) {
                jsonGenerator.writeFieldName("continentCode").writeValue(region.getContinentCode());
            }
            if (region.getDescription() != null) {
                jsonGenerator.writeFieldName("description").writeValue(region.getDescription());
            }
            if (region.getDisplayName() != null) {
                jsonGenerator.writeFieldName("displayName").writeValue(region.getDisplayName());
            }
            if (region.getName() != null) {
                jsonGenerator.writeFieldName("name").writeValue(region.getName());
            }

            java.util.List<AvailabilityZone> availabilityZonesList = region.getAvailabilityZones();
            if (availabilityZonesList != null) {
                jsonGenerator.writeFieldName("availabilityZones");
                jsonGenerator.writeStartArray();
                for (AvailabilityZone availabilityZonesListValue : availabilityZonesList) {
                    if (availabilityZonesListValue != null) {

                        AvailabilityZoneJsonMarshaller.getInstance().marshall(availabilityZonesListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static RegionJsonMarshaller instance;

    public static RegionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RegionJsonMarshaller();
        return instance;
    }

}
