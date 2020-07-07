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
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;
import javax.validation.Valid;
import javax.xml.bind.annotation.*;

public class Security  {
  
    private Boolean allowedAll;

    /**
    * Defines whether the file is publicly available for access or has restricted access.
    **/
    public Security allowedAll(Boolean allowedAll) {

        this.allowedAll = allowedAll;
        return this;
    }
    
    @ApiModelProperty(example = "false", value = "Defines whether the file is publicly available for access or has restricted access.")
    @JsonProperty("allowedAll")
    @Valid
    public Boolean getAllowedAll() {
        return allowedAll;
    }
    public void setAllowedAll(Boolean allowedAll) {
        this.allowedAll = allowedAll;
    }



    @Override
    public boolean equals(java.lang.Object o) {

        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Security security = (Security) o;
        return Objects.equals(this.allowedAll, security.allowedAll);
    }

    @Override
    public int hashCode() {
        return Objects.hash(allowedAll);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("class Security {\n");
        
        sb.append("    allowedAll: ").append(toIndentedString(allowedAll)).append("\n");
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

