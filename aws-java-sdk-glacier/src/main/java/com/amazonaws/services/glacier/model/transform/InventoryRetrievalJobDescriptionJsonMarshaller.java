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
package com.amazonaws.services.glacier.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.glacier.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * InventoryRetrievalJobDescriptionMarshaller
 */
public class InventoryRetrievalJobDescriptionJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(InventoryRetrievalJobDescription inventoryRetrievalJobDescription, StructuredJsonGenerator jsonGenerator) {

        if (inventoryRetrievalJobDescription == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (inventoryRetrievalJobDescription.getFormat() != null) {
                jsonGenerator.writeFieldName("Format").writeValue(inventoryRetrievalJobDescription.getFormat());
            }
            if (inventoryRetrievalJobDescription.getStartDate() != null) {
                jsonGenerator.writeFieldName("StartDate").writeValue(inventoryRetrievalJobDescription.getStartDate());
            }
            if (inventoryRetrievalJobDescription.getEndDate() != null) {
                jsonGenerator.writeFieldName("EndDate").writeValue(inventoryRetrievalJobDescription.getEndDate());
            }
            if (inventoryRetrievalJobDescription.getLimit() != null) {
                jsonGenerator.writeFieldName("Limit").writeValue(inventoryRetrievalJobDescription.getLimit());
            }
            if (inventoryRetrievalJobDescription.getMarker() != null) {
                jsonGenerator.writeFieldName("Marker").writeValue(inventoryRetrievalJobDescription.getMarker());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static InventoryRetrievalJobDescriptionJsonMarshaller instance;

    public static InventoryRetrievalJobDescriptionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InventoryRetrievalJobDescriptionJsonMarshaller();
        return instance;
    }

}
