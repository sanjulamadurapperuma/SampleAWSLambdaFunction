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
