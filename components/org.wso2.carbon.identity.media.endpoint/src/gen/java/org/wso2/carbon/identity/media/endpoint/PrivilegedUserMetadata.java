/*
* Copyright (c) 2020, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package org.wso2.carbon.identity.media.endpoint;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.util.Objects;
import javax.validation.Valid;

public class PrivilegedUserMetadata  {
  
    private String tag;
    private PrivilegedUserSecurity security = null;
    private List<String> identifiers = null;


    /**
    * The file tag.
    **/
    public PrivilegedUserMetadata tag(String tag) {

        this.tag = tag;
        return this;
    }
    
    @ApiModelProperty(example = "user", value = "The file tag.")
    @JsonProperty("tag")
    @Valid
    public String getTag() {
        return tag;
    }
    public void setTag(String tag) {
        this.tag = tag;
    }

    /**
    **/
    public PrivilegedUserMetadata security(PrivilegedUserSecurity security) {

        this.security = security;
        return this;
    }
    
    @ApiModelProperty(value = "")
    @JsonProperty("security")
    @Valid
    public PrivilegedUserSecurity getSecurity() {
        return security;
    }
    public void setSecurity(PrivilegedUserSecurity security) {
        this.security = security;
    }

    /**
    * In a multiple file upload (representing a single resource) scenario, the identifiers will uniquely identify each of the files. The identifiers should be in the order in which the files are uploaded as an array (file index should match with identifiers index).
    **/
    public PrivilegedUserMetadata identifiers(List<String> identifiers) {

        this.identifiers = identifiers;
        return this;
    }
    
    @ApiModelProperty(example = "[\"large\",\"medium\",\"small\"]", value = "In a multiple file upload (representing a single resource) scenario, the identifiers will uniquely identify each of the files. The identifiers should be in the order in which the files are uploaded as an array (file index should match with identifiers index).")
    @JsonProperty("identifiers")
    @Valid
    public List<String> getIdentifiers() {
        return identifiers;
    }
    public void setIdentifiers(List<String> identifiers) {
        this.identifiers = identifiers;
    }

    public PrivilegedUserMetadata addIdentifiersItem(String identifiersItem) {
        if (this.identifiers == null) {
            this.identifiers = new ArrayList<>();
        }
        this.identifiers.add(identifiersItem);
        return this;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {

        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PrivilegedUserMetadata privilegedUserMetadata = (PrivilegedUserMetadata) o;
        return Objects.equals(this.tag, privilegedUserMetadata.tag) &&
            Objects.equals(this.security, privilegedUserMetadata.security) &&
            Objects.equals(this.identifiers, privilegedUserMetadata.identifiers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tag, security, identifiers);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("class PrivilegedUserMetadata {\n");
        
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
        sb.append("    security: ").append(toIndentedString(security)).append("\n");
        sb.append("    identifiers: ").append(toIndentedString(identifiers)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
    * Convert the given object to string with each line indented by 4 spaces
    * (except the first line).
    */
    private String toIndentedString(java.lang.Object o) {

        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n");
    }
}

