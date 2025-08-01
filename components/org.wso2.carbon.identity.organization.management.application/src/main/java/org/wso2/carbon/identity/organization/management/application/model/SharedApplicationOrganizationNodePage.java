/*
 * Copyright (c) 2025, WSO2 LLC. (http://www.wso2.com).
 *
 * WSO2 LLC. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.organization.management.application.model;

import java.util.List;

/**
 * Represents a page of shared application organization nodes.
 */
public class SharedApplicationOrganizationNodePage {

    private final List<SharedApplicationOrganizationNode> sharedApplicationOrganizationNodes;
    private final SharingModeDO sharingModeDO;
    private final int nextPageCursor;
    private final int previousPageCursor;

    public SharedApplicationOrganizationNodePage(List<SharedApplicationOrganizationNode>
                                                         sharedApplicationOrganizationNodes,
                                                 SharingModeDO sharingModeDO, int nextPageCursor,
                                                 int previousPageCursor) {

        this.sharedApplicationOrganizationNodes = sharedApplicationOrganizationNodes;
        this.sharingModeDO = sharingModeDO;
        this.nextPageCursor = nextPageCursor;
        this.previousPageCursor = previousPageCursor;
    }

    public List<SharedApplicationOrganizationNode> getSharedApplicationOrganizationNodes() {

        return sharedApplicationOrganizationNodes;
    }

    public int getNextPageCursor() {

        return nextPageCursor;
    }

    public int getPreviousPageCursor() {

        return previousPageCursor;
    }

    public SharingModeDO getSharingModeDO() {

        return sharingModeDO;
    }
}
