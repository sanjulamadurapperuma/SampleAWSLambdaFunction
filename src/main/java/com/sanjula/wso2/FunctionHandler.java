/*
 *  Copyright (c) 2020, Sanjula Madurapperuma (https://www.github.com/sanjulamadurapperuma) All Rights Reserved.
 *
 *  Sanjula Madurapperuma licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.sanjula.wso2;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.sanjula.wso2.dto.LambdaRequest;
import com.sanjula.wso2.dto.LambdaResponse;

import java.util.Date;
import java.util.UUID;

public class FunctionHandler implements RequestHandler<LambdaRequest, LambdaResponse> {
    @Override
    public LambdaResponse handleRequest(LambdaRequest lambdaRequest, Context context) {
        context.getLogger().log("Input: " + lambdaRequest);
        LambdaResponse lambdaResponse = new LambdaResponse();
        try {
            lambdaResponse.setResponseMessage("Hello " + lambdaRequest.getName() + " Response Time : " + new Date());
            lambdaResponse.setTransactionID(UUID.randomUUID().toString());
        } catch (Exception e) {
            e.printStackTrace();
            lambdaResponse.setResponseMessage(e.getMessage());
        }
        context.getLogger().log("Response : " + lambdaResponse);
        return lambdaResponse;
    }
}
