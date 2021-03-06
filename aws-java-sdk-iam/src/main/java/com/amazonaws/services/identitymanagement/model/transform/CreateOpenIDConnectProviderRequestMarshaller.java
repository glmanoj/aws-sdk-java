/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.identitymanagement.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.internal.ListWithAutoConstructFlag;
import com.amazonaws.services.identitymanagement.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Create Open I D Connect Provider Request Marshaller
 */
public class CreateOpenIDConnectProviderRequestMarshaller implements Marshaller<Request<CreateOpenIDConnectProviderRequest>, CreateOpenIDConnectProviderRequest> {

    public Request<CreateOpenIDConnectProviderRequest> marshall(CreateOpenIDConnectProviderRequest createOpenIDConnectProviderRequest) {

        if (createOpenIDConnectProviderRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateOpenIDConnectProviderRequest> request = new DefaultRequest<CreateOpenIDConnectProviderRequest>(createOpenIDConnectProviderRequest, "AmazonIdentityManagement");
        request.addParameter("Action", "CreateOpenIDConnectProvider");
        request.addParameter("Version", "2010-05-08");

        if (createOpenIDConnectProviderRequest.getUrl() != null) {
            request.addParameter("Url", StringUtils.fromString(createOpenIDConnectProviderRequest.getUrl()));
        }

        java.util.List<String> clientIDListList = createOpenIDConnectProviderRequest.getClientIDList();
        int clientIDListListIndex = 1;

        for (String clientIDListListValue : clientIDListList) {
            if (clientIDListListValue != null) {
                request.addParameter("ClientIDList.member." + clientIDListListIndex, StringUtils.fromString(clientIDListListValue));
            }

            clientIDListListIndex++;
        }

        java.util.List<String> thumbprintListList = createOpenIDConnectProviderRequest.getThumbprintList();
        int thumbprintListListIndex = 1;

        for (String thumbprintListListValue : thumbprintListList) {
            if (thumbprintListListValue != null) {
                request.addParameter("ThumbprintList.member." + thumbprintListListIndex, StringUtils.fromString(thumbprintListListValue));
            }

            thumbprintListListIndex++;
        }

        return request;
    }
}
