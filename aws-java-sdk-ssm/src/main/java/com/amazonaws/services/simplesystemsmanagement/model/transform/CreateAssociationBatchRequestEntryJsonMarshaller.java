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
package com.amazonaws.services.simplesystemsmanagement.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.simplesystemsmanagement.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * CreateAssociationBatchRequestEntryMarshaller
 */
public class CreateAssociationBatchRequestEntryJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(CreateAssociationBatchRequestEntry createAssociationBatchRequestEntry, StructuredJsonGenerator jsonGenerator) {

        if (createAssociationBatchRequestEntry == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (createAssociationBatchRequestEntry.getName() != null) {
                jsonGenerator.writeFieldName("Name").writeValue(createAssociationBatchRequestEntry.getName());
            }
            if (createAssociationBatchRequestEntry.getInstanceId() != null) {
                jsonGenerator.writeFieldName("InstanceId").writeValue(createAssociationBatchRequestEntry.getInstanceId());
            }

            java.util.Map<String, java.util.List<String>> parametersMap = createAssociationBatchRequestEntry.getParameters();
            if (parametersMap != null) {
                jsonGenerator.writeFieldName("Parameters");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, java.util.List<String>> parametersMapValue : parametersMap.entrySet()) {
                    if (parametersMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(parametersMapValue.getKey());

                        jsonGenerator.writeStartArray();
                        for (String parametersMapValueList : parametersMapValue.getValue()) {
                            if (parametersMapValueList != null) {
                                jsonGenerator.writeValue(parametersMapValueList);
                            }
                        }
                        jsonGenerator.writeEndArray();
                    }
                }
                jsonGenerator.writeEndObject();
            }
            if (createAssociationBatchRequestEntry.getDocumentVersion() != null) {
                jsonGenerator.writeFieldName("DocumentVersion").writeValue(createAssociationBatchRequestEntry.getDocumentVersion());
            }

            com.amazonaws.internal.SdkInternalList<Target> targetsList = (com.amazonaws.internal.SdkInternalList<Target>) createAssociationBatchRequestEntry
                    .getTargets();
            if (!targetsList.isEmpty() || !targetsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("Targets");
                jsonGenerator.writeStartArray();
                for (Target targetsListValue : targetsList) {
                    if (targetsListValue != null) {

                        TargetJsonMarshaller.getInstance().marshall(targetsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (createAssociationBatchRequestEntry.getScheduleExpression() != null) {
                jsonGenerator.writeFieldName("ScheduleExpression").writeValue(createAssociationBatchRequestEntry.getScheduleExpression());
            }
            if (createAssociationBatchRequestEntry.getOutputLocation() != null) {
                jsonGenerator.writeFieldName("OutputLocation");
                InstanceAssociationOutputLocationJsonMarshaller.getInstance().marshall(createAssociationBatchRequestEntry.getOutputLocation(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static CreateAssociationBatchRequestEntryJsonMarshaller instance;

    public static CreateAssociationBatchRequestEntryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CreateAssociationBatchRequestEntryJsonMarshaller();
        return instance;
    }

}
