package com.sanjula.wso2.marketplaceapp.searchfunction;

public class SearchResponse {
    private String responseMessage;
    private boolean found;

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public SearchResponse(String message) {
        for (SearchTerm searchTerm : SearchTerm.values()) {
            if (searchTerm.name().equals(message.toUpperCase())) {
                setResponseMessage(message + " exists in our inventories...");
                found = true;
            }
        }
        if (!found) {
            setResponseMessage(message + " does not exist in our inventories...");
        }
    }

    @Override public String toString() {
        return responseMessage;
    }
}
