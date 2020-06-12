/*
 * Copyright (c) 2019, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
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
package org.wso2.carbon.identity.media;

import org.wso2.carbon.identity.media.exception.StorageSystemException;
import org.wso2.carbon.identity.media.model.MediaMetadata;

import java.io.InputStream;
import java.util.List;

/**
 * Interface describing the functionality provided by an underlying storage system.
 */
public interface StorageSystem {

    String addFile(List<InputStream> inputStreams, MediaMetadata mediaMetadata, String uuid, String tenantDomain)
            throws StorageSystemException;

    DataContent getFile(String id, String type, String tenantDomain) throws StorageSystemException;

    void deleteFile(String id, String type, String tenantDomain) throws StorageSystemException;

    InputStream transform(String id, String type, String tenantDomain, InputStream inputStream)
            throws StorageSystemException;

}
