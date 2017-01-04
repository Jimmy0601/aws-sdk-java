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
package com.amazonaws.services.simpleemail.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.simpleemail.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;

/**
 * CreateReceiptRuleSetRequest Marshaller
 */

public class CreateReceiptRuleSetRequestMarshaller implements Marshaller<Request<CreateReceiptRuleSetRequest>, CreateReceiptRuleSetRequest> {

    public Request<CreateReceiptRuleSetRequest> marshall(CreateReceiptRuleSetRequest createReceiptRuleSetRequest) {

        if (createReceiptRuleSetRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateReceiptRuleSetRequest> request = new DefaultRequest<CreateReceiptRuleSetRequest>(createReceiptRuleSetRequest, "AmazonSimpleEmailService");
        request.addParameter("Action", "CreateReceiptRuleSet");
        request.addParameter("Version", "2010-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (createReceiptRuleSetRequest.getRuleSetName() != null) {
            request.addParameter("RuleSetName", StringUtils.fromString(createReceiptRuleSetRequest.getRuleSetName()));
        }

        return request;
    }

}
