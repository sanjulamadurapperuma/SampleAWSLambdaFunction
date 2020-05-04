package com.sanjula.wso2.marketplaceapp.searchfunction;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class SearchHandler implements RequestHandler<SearchRequest, SearchResponse> {

    @Override public SearchResponse handleRequest(SearchRequest searchRequest, Context context) {
        context.getLogger().log("Input: " + searchRequest);
        SearchResponse lambdaResponse = new SearchResponse(searchRequest.getSearchTerm());
        context.getLogger().log("Response : " + lambdaResponse);
        return lambdaResponse;
    }
}
