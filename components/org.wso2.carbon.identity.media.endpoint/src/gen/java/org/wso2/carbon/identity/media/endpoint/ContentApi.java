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

import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;

import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import io.swagger.annotations.*;

@Path("/content")
@Api(description = "The content API")

public class ContentApi  {

    @Autowired
    private ContentApiService delegate;

    @Valid
    @GET
    @Path("/{type}/{id}")
    
    @Produces({ "application/octet-stream", "application/json" })
    @ApiOperation(value = "An end-user or priviledged user downloads an access protected file.", notes = "", response = File.class, authorizations = {
        @Authorization(value = "BasicAuth"),
        @Authorization(value = "OAuth2", scopes = {
            
        })
    }, tags={ "Download Media" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "File downloaded successfully.", response = File.class),
        @ApiResponse(code = 400, message = "Invalid input in the request.", response = Error.class),
        @ApiResponse(code = 404, message = "Requested resource is not found.", response = Error.class),
        @ApiResponse(code = 401, message = "Authentication information is missing or invalid.", response = Void.class),
        @ApiResponse(code = 403, message = "Access forbidden.", response = Void.class),
        @ApiResponse(code = 500, message = "Internal server error.", response = Error.class),
        @ApiResponse(code = 501, message = "Not implemented.", response = Error.class)
    })
    public Response downloadMedia(@ApiParam(value = "The media type.",required=true) @PathParam("type") String type, @ApiParam(value = "Unique identifier for the file.",required=true) @PathParam("id") String id,     @Valid@ApiParam(value = "")  @QueryParam("identifier") String identifier) {

        return delegate.downloadMedia(type,  id,  identifier );
    }

}
