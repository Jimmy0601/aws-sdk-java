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
package com.amazonaws.services.config.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.config.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * ResourceIdentifierMarshaller
 */
public class ResourceIdentifierJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(ResourceIdentifier resourceIdentifier, StructuredJsonGenerator jsonGenerator) {

        if (resourceIdentifier == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (resourceIdentifier.getResourceType() != null) {
                jsonGenerator.writeFieldName("resourceType").writeValue(resourceIdentifier.getResourceType());
            }
            if (resourceIdentifier.getResourceId() != null) {
                jsonGenerator.writeFieldName("resourceId").writeValue(resourceIdentifier.getResourceId());
            }
            if (resourceIdentifier.getResourceName() != null) {
                jsonGenerator.writeFieldName("resourceName").writeValue(resourceIdentifier.getResourceName());
            }
            if (resourceIdentifier.getResourceDeletionTime() != null) {
                jsonGenerator.writeFieldName("resourceDeletionTime").writeValue(resourceIdentifier.getResourceDeletionTime());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ResourceIdentifierJsonMarshaller instance;

    public static ResourceIdentifierJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ResourceIdentifierJsonMarshaller();
        return instance;
    }

}
