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

package org.wso2.carbon.identity.media.endpoint.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.wso2.carbon.identity.media.endpoint.PublicApiService;
import org.wso2.carbon.identity.media.endpoint.service.MediaService;

import javax.ws.rs.core.Response;

/**
 * Provides service implementation for downloading publicly available media.
 */
public class PublicApiServiceImpl implements PublicApiService {

    @Autowired
    private MediaService mediaService;

    @Override
    public Response downloadPublicMedia(String type, String id, String identifier, String ifNoneMatch) {

        return mediaService.downloadMediaFile(type, id, identifier, ifNoneMatch);
    }
}
