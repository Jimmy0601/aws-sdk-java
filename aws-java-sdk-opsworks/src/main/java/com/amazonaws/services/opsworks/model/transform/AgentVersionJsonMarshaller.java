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
package com.amazonaws.services.opsworks.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.opsworks.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * AgentVersionMarshaller
 */
public class AgentVersionJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(AgentVersion agentVersion, StructuredJsonGenerator jsonGenerator) {

        if (agentVersion == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (agentVersion.getVersion() != null) {
                jsonGenerator.writeFieldName("Version").writeValue(agentVersion.getVersion());
            }
            if (agentVersion.getConfigurationManager() != null) {
                jsonGenerator.writeFieldName("ConfigurationManager");
                StackConfigurationManagerJsonMarshaller.getInstance().marshall(agentVersion.getConfigurationManager(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static AgentVersionJsonMarshaller instance;

    public static AgentVersionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AgentVersionJsonMarshaller();
        return instance;
    }

}
