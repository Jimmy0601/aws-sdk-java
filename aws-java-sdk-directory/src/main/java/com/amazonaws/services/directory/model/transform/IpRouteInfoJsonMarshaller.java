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
package com.amazonaws.services.directory.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.directory.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * IpRouteInfoMarshaller
 */
public class IpRouteInfoJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(IpRouteInfo ipRouteInfo, StructuredJsonGenerator jsonGenerator) {

        if (ipRouteInfo == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (ipRouteInfo.getDirectoryId() != null) {
                jsonGenerator.writeFieldName("DirectoryId").writeValue(ipRouteInfo.getDirectoryId());
            }
            if (ipRouteInfo.getCidrIp() != null) {
                jsonGenerator.writeFieldName("CidrIp").writeValue(ipRouteInfo.getCidrIp());
            }
            if (ipRouteInfo.getIpRouteStatusMsg() != null) {
                jsonGenerator.writeFieldName("IpRouteStatusMsg").writeValue(ipRouteInfo.getIpRouteStatusMsg());
            }
            if (ipRouteInfo.getAddedDateTime() != null) {
                jsonGenerator.writeFieldName("AddedDateTime").writeValue(ipRouteInfo.getAddedDateTime());
            }
            if (ipRouteInfo.getIpRouteStatusReason() != null) {
                jsonGenerator.writeFieldName("IpRouteStatusReason").writeValue(ipRouteInfo.getIpRouteStatusReason());
            }
            if (ipRouteInfo.getDescription() != null) {
                jsonGenerator.writeFieldName("Description").writeValue(ipRouteInfo.getDescription());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static IpRouteInfoJsonMarshaller instance;

    public static IpRouteInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new IpRouteInfoJsonMarshaller();
        return instance;
    }

}
