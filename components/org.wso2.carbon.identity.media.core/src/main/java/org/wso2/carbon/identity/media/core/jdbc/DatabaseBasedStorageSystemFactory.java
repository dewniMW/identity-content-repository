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
package org.wso2.carbon.identity.media.core.jdbc;

import org.wso2.carbon.identity.media.core.StorageSystem;
import org.wso2.carbon.identity.media.core.StorageSystemFactory;

/**
 * Factory class related to producing DatabaseBasedStorageSystemImpl objects.
 */
public class DatabaseBasedStorageSystemFactory extends StorageSystemFactory {

    private static final String JDBC = "org.wso2.carbon.identity.media.jdbc.DatabaseBasedStorageSystemImpl";

    @Override
    public StorageSystem getInstance() {

        StorageSystem dbBasedStorageSystem = new DatabaseBasedStorageSystemImpl();
        return dbBasedStorageSystem;
    }

    @Override
    public String getStorageType() {

        return JDBC;
    }
}
