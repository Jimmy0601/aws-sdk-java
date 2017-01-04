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
package com.amazonaws.services.snowball.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.snowball.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * S3ResourceMarshaller
 */
public class S3ResourceJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(S3Resource s3Resource, StructuredJsonGenerator jsonGenerator) {

        if (s3Resource == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (s3Resource.getBucketArn() != null) {
                jsonGenerator.writeFieldName("BucketArn").writeValue(s3Resource.getBucketArn());
            }
            if (s3Resource.getKeyRange() != null) {
                jsonGenerator.writeFieldName("KeyRange");
                KeyRangeJsonMarshaller.getInstance().marshall(s3Resource.getKeyRange(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static S3ResourceJsonMarshaller instance;

    public static S3ResourceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new S3ResourceJsonMarshaller();
        return instance;
    }

}
