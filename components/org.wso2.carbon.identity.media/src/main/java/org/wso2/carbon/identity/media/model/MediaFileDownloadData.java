/*
 * Copyright (c) 2020, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
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

package org.wso2.carbon.identity.media.model;

import java.io.File;

/**
 * This class represents requested file and the content type of the file.
 */
public class MediaFileDownloadData {

    private File mediaFile;
    private String responseContentType;

    public File getMediaFile() {

        return mediaFile;
    }

    public void setMediaFile(File mediaFile) {

        this.mediaFile = mediaFile;
    }

    public String getResponseContentType() {

        return responseContentType;
    }

    public void setResponseContentType(String responseContentType) {

        this.responseContentType = responseContentType;
    }
}
