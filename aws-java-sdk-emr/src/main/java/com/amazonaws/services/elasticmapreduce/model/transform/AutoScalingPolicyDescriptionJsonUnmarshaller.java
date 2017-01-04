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
package com.amazonaws.services.elasticmapreduce.model.transform;

import java.util.Map;
import java.util.Map.Entry;
import java.math.*;
import java.nio.ByteBuffer;

import com.amazonaws.services.elasticmapreduce.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AutoScalingPolicyDescription JSON Unmarshaller
 */
public class AutoScalingPolicyDescriptionJsonUnmarshaller implements Unmarshaller<AutoScalingPolicyDescription, JsonUnmarshallerContext> {

    public AutoScalingPolicyDescription unmarshall(JsonUnmarshallerContext context) throws Exception {
        AutoScalingPolicyDescription autoScalingPolicyDescription = new AutoScalingPolicyDescription();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL)
            return null;

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    autoScalingPolicyDescription.setStatus(AutoScalingPolicyStatusJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Constraints", targetDepth)) {
                    context.nextToken();
                    autoScalingPolicyDescription.setConstraints(ScalingConstraintsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Rules", targetDepth)) {
                    context.nextToken();
                    autoScalingPolicyDescription.setRules(new ListUnmarshaller<ScalingRule>(ScalingRuleJsonUnmarshaller.getInstance()).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return autoScalingPolicyDescription;
    }

    private static AutoScalingPolicyDescriptionJsonUnmarshaller instance;

    public static AutoScalingPolicyDescriptionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AutoScalingPolicyDescriptionJsonUnmarshaller();
        return instance;
    }
}
