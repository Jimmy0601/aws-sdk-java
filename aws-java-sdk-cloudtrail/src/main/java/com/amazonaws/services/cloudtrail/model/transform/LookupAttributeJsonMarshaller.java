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
package com.amazonaws.services.cloudtrail.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cloudtrail.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * LookupAttributeMarshaller
 */
public class LookupAttributeJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(LookupAttribute lookupAttribute, StructuredJsonGenerator jsonGenerator) {

        if (lookupAttribute == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (lookupAttribute.getAttributeKey() != null) {
                jsonGenerator.writeFieldName("AttributeKey").writeValue(lookupAttribute.getAttributeKey());
            }
            if (lookupAttribute.getAttributeValue() != null) {
                jsonGenerator.writeFieldName("AttributeValue").writeValue(lookupAttribute.getAttributeValue());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static LookupAttributeJsonMarshaller instance;

    public static LookupAttributeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LookupAttributeJsonMarshaller();
        return instance;
    }

}
