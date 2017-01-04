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
package com.amazonaws.services.sns.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.sns.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;

/**
 * OptInPhoneNumberRequest Marshaller
 */

public class OptInPhoneNumberRequestMarshaller implements Marshaller<Request<OptInPhoneNumberRequest>, OptInPhoneNumberRequest> {

    public Request<OptInPhoneNumberRequest> marshall(OptInPhoneNumberRequest optInPhoneNumberRequest) {

        if (optInPhoneNumberRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<OptInPhoneNumberRequest> request = new DefaultRequest<OptInPhoneNumberRequest>(optInPhoneNumberRequest, "AmazonSNS");
        request.addParameter("Action", "OptInPhoneNumber");
        request.addParameter("Version", "2010-03-31");
        request.setHttpMethod(HttpMethodName.POST);

        if (optInPhoneNumberRequest.getPhoneNumber() != null) {
            request.addParameter("phoneNumber", StringUtils.fromString(optInPhoneNumberRequest.getPhoneNumber()));
        }

        return request;
    }

}
