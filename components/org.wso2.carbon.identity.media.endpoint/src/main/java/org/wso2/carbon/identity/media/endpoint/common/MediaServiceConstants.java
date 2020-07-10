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

package org.wso2.carbon.identity.media.endpoint.common;

/**
 * Contains the constants related to media service.
 */
public class MediaServiceConstants {

    private MediaServiceConstants() {

    }

    static final String MEDIA_API_PATH_COMPONENT = "/api/identity/media";
    static final String V1_API_PATH_COMPONENT = "/v1.0";
    static final String CORRELATION_ID_MDC = "Correlation-ID";
    static final String TENANT_CONTEXT_PATH_COMPONENT = "/t/%s";
    public static final String CONTENT_PATH_COMPONENT = "content";
    public static final String PUBLIC_PATH_COMPONENT = "public";
    public static final String ME_PATH_COMPONENT = "me";
    private static final String MEDIA_SERVICE = "MED-";

    /**
     * Enum for error messages related to media service.
     */
    public enum ErrorMessage {

        // Client errors.
        ERROR_CODE_INVALID_REQUEST_BODY("60001", "Invalid Request.", "Provided request body content " +
                "is not in the expected format."),
        ERROR_CODE_ERROR_UPLOADING_MEDIA_CONTENT_TYPE_MISMATCH("60002", "Unable to upload the provided media.",
                "Mismatch in the media type path parameter: %s and the actual media type of the media: %s"),
        ERROR_CODE_ERROR_UPLOADING_MEDIA_UNSUPPORTED_CONTENT_TYPE("60003", "Unable to upload the provided media.",
                "Unsupported file content type: %s"),
        ERROR_CODE_ERROR_DOWNLOADING_MEDIA_FILE_NOT_FOUND("60004", "Unable to download the requested media.",
                "File with id: %s not found."),
        ERROR_CODE_ERROR_RETRIEVING_MEDIA_INFORMATION_FILE_NOT_FOUND("60005", "Unable to retrieve the requested" +
                " media information.", "File with id: %s not found."),
        ERROR_CODE_ERROR_DELETING_MEDIA_FILE_NOT_FOUND("60006", "Unable to delete the requested media.",
                "File with id: %s not found for media type: %s"),
        ERROR_CODE_ERROR_UNSUPPORTED_CONTENT_TYPE_PATH_PARAM("60007", "Unable to perform the requested media" +
                " operation.", "Unsupported file content type available as a path parameter in the request."),
        ERROR_CODE_INVALID_MEDIA_SIZE("60008", "Unable to upload the provided media.",
                "Media size exceeds the maximum allowed size."),

        // Server errors.
        ERROR_CODE_ERROR_UPLOADING_MEDIA("65001", "Unable to upload the provided media.",
                "Server encountered an error while uploading the media."),
        ERROR_CODE_ERROR_EVALUATING_ACCESS_SECURITY("65002", "Unable to evaluate access security for the" +
                " requested media.", "Server encountered an error while evaluating security access to the media" +
                " with id: %s"),
        ERROR_CODE_ERROR_DOWNLOADING_MEDIA("65003", "Unable to download the requested media.",
                "Server encountered an error while downloading the media with id: %s"),
        ERROR_CODE_ERROR_EVALUATING_MEDIA_MANAGEMENT_SECURITY("65004", "Unable to evaluate media management" +
                " security", "Server encountered an error while evaluating media management security."),
        ERROR_CODE_ERROR_DELETING_MEDIA("65005", "Unable to delete the requested media.",
                "Server encountered an error while deleting the media with id: %s"),
        ERROR_CODE_ERROR_RETRIEVING_MEDIA_INFORMATION("65006", "Unable to retrieve the requested media information.",
                "Server encountered an error while retrieving the information for media with id: %s"),
        ERROR_CODE_ERROR_BUILDING_RESPONSE_HEADER_URL("65007", "Unable to build uploaded media location URL.",
                "Server encountered an error while building URL for response header."),
        ERROR_CODE_ERROR_RETRIEVING_STORAGE_SYSTEM_MANAGER("65008", "Unable to fulfill the request.",
                "Server encountered an error while retrieving StorageSystemManager."),
        ERROR_CODE_ERROR_CALCULATING_MEDIA_SIZE("65009", "Unable to upload the provided media.",
                "Server encountered an error while calculating media size.");

        private final String code;
        private final String message;
        private final String description;

        ErrorMessage(String code, String message, String description) {

            this.code = code;
            this.message = message;
            this.description = description;
        }

        public String getCode() {

            return MEDIA_SERVICE + code;
        }

        public String getMessage() {

            return message;
        }

        public String getDescription() {

            return description;
        }

        @Override
        public String toString() {

            return code + " | " + message;
        }
    }
}
