package com.sanjula.wso2.marketplaceapp.searchfunction;

public class SearchRequest {
    private String searchTerm;

    public String getSearchTerm() {
        return searchTerm;
    }

    public void setSearchTerm(String searchTerm) {
        this.searchTerm = searchTerm;
    }

    @Override
    public String toString() {
        return "SearchRequest{" + "searchTerm='" + searchTerm + '\'' + '}';
    }
}
