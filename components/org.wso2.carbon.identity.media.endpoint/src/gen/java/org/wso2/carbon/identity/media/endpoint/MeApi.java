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
import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;
import java.io.InputStream;
import java.util.List;

import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import io.swagger.annotations.*;

@Path("/me")
@Api(description = "The me API")

public class MeApi  {

    @Autowired
    private MeApiService delegate;

    @Valid
    @DELETE
    @Path("/{type}/{id}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "An end-user deletes a resource file and metadata associated with the resource file.", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "BasicAuth"),
        @Authorization(value = "OAuth2", scopes = {
            
        })
    }, tags={ "Delete Media", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Resource file and metadata deleted successfully.", response = Void.class),
        @ApiResponse(code = 400, message = "Invalid input in the request.", response = Error.class),
        @ApiResponse(code = 404, message = "Requested resource is not found.", response = Error.class),
        @ApiResponse(code = 401, message = "Authentication information is missing or invalid.", response = Void.class),
        @ApiResponse(code = 403, message = "Access forbidden.", response = Void.class),
        @ApiResponse(code = 500, message = "Internal server error.", response = Error.class)
    })
    public Response deleteMedia(@ApiParam(value = "The media type.",required=true) @PathParam("type") String type, @ApiParam(value = "Unique identifier for the file.",required=true) @PathParam("id") String id) {

        return delegate.deleteMedia(type,  id );
    }

    @Valid
    @GET
    @Path("/{type}/{id}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "An end-user requests media location(s) and associated metadata for the given media id.", notes = "", response = MediaInformationResponse.class, authorizations = {
        @Authorization(value = "BasicAuth"),
        @Authorization(value = "OAuth2", scopes = {
            
        })
    }, tags={ "Get Media Details", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Requested media information retrieved successfully.", response = MediaInformationResponse.class),
        @ApiResponse(code = 400, message = "Invalid input in the request.", response = Error.class),
        @ApiResponse(code = 404, message = "Requested resource is not found.", response = Error.class),
        @ApiResponse(code = 401, message = "Authentication information is missing or invalid.", response = Void.class),
        @ApiResponse(code = 403, message = "Access forbidden.", response = Void.class),
        @ApiResponse(code = 500, message = "Internal server error.", response = Error.class)
    })
    public Response listMediaInformation(@ApiParam(value = "The media type.",required=true) @PathParam("type") String type, @ApiParam(value = "Unique identifier for the file.",required=true) @PathParam("id") String id) {

        return delegate.listMediaInformation(type,  id );
    }

    @Valid
    @POST
    @Path("/{type}")
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json" })
    @ApiOperation(value = "A user uploads a single resource file or multiple representations of a single resource and metadata associated with the resource file(s).", notes = "", response = MultipleFilesUploadResponse.class, authorizations = {
        @Authorization(value = "BasicAuth"),
        @Authorization(value = "OAuth2", scopes = {
            
        })
    }, tags={ "Upload Media" })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "File(s) uploaded successfully.", response = MultipleFilesUploadResponse.class),
        @ApiResponse(code = 400, message = "Invalid input in the request.", response = Error.class),
        @ApiResponse(code = 401, message = "Authentication information is missing or invalid.", response = Void.class),
        @ApiResponse(code = 403, message = "Access forbidden.", response = Void.class),
        @ApiResponse(code = 500, message = "Internal server error.", response = Error.class),
        @ApiResponse(code = 501, message = "Not implemented.", response = Error.class)
    })
    public Response uploadMedia(@ApiParam(value = "The media type.",required=true) @PathParam("type") String type, @Multipart(value = "files") List<InputStream> filesInputStream, @Multipart(value = "files" ) List<Attachment> filesDetail, @Multipart(value = "metadata", required = false)  Metadata metadata) {

        return delegate.uploadMedia(type,  filesInputStream, filesDetail,  metadata );
    }

}
