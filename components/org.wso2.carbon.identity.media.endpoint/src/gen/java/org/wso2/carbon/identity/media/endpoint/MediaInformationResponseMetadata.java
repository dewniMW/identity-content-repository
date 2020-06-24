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

import java.util.Objects;
import javax.validation.Valid;

public class MediaInformationResponseMetadata  {
  
    private String tag;
    private Security security;

    /**
    * The file tag.
    **/
    public MediaInformationResponseMetadata tag(String tag) {

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
    public MediaInformationResponseMetadata security(Security security) {

        this.security = security;
        return this;
    }
    
    @ApiModelProperty(value = "")
    @JsonProperty("security")
    @Valid
    public Security getSecurity() {
        return security;
    }
    public void setSecurity(Security security) {
        this.security = security;
    }



    @Override
    public boolean equals(java.lang.Object o) {

        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MediaInformationResponseMetadata mediaInformationResponseMetadata = (MediaInformationResponseMetadata) o;
        return Objects.equals(this.tag, mediaInformationResponseMetadata.tag) &&
            Objects.equals(this.security, mediaInformationResponseMetadata.security);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tag, security);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("class MediaInformationResponseMetadata {\n");
        
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
        sb.append("    security: ").append(toIndentedString(security)).append("\n");
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

