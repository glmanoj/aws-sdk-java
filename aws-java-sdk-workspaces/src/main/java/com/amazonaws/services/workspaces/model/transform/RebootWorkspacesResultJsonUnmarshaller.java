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

package com.amazonaws.services.workspaces.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.services.workspaces.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Reboot Workspaces Result JSON Unmarshaller
 */
public class RebootWorkspacesResultJsonUnmarshaller implements Unmarshaller<RebootWorkspacesResult, JsonUnmarshallerContext> {

    public RebootWorkspacesResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        RebootWorkspacesResult rebootWorkspacesResult = new RebootWorkspacesResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null) token = context.nextToken();
        if (token == VALUE_NULL) return null;

        while (true) {
            if (token == null) break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("FailedRequests", targetDepth)) {
                    context.nextToken();
                    rebootWorkspacesResult.setFailedRequests(new ListUnmarshaller<FailedWorkspaceChangeRequest>(FailedWorkspaceChangeRequestJsonUnmarshaller.getInstance()).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth) break;
                }
            }

            token = context.nextToken();
        }
        
        return rebootWorkspacesResult;
    }

    private static RebootWorkspacesResultJsonUnmarshaller instance;
    public static RebootWorkspacesResultJsonUnmarshaller getInstance() {
        if (instance == null) instance = new RebootWorkspacesResultJsonUnmarshaller();
        return instance;
    }
}
    