/*
 * Copyright 2023-present ByteChef Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.sample.customcomponent;

import com.bytechef.component.ComponentHandler;
import com.bytechef.component.definition.ComponentCategory;
import com.bytechef.component.definition.ComponentDefinition;
import com.google.auto.service.AutoService;
import org.sample.customcomponent.connection.SampleConnection;
import org.sample.customcomponent.action.SampleAction;

import static com.bytechef.component.definition.ComponentDsl.component;
import static org.sample.customcomponent.constant.SampleConstants.SAMPLE_CUSTOM_COMPONENT;

/**
 * @author Ivica Cardic
 */
@AutoService(ComponentHandler.class)
public class SampleComponentHandler implements ComponentHandler {

    private static final ComponentDefinition COMPONENT_DEFINITION = component(SAMPLE_CUSTOM_COMPONENT)
        .title("Sample Custom Component")
        .description("Sample custom component description.")
        .icon("path:assets/sample.svg")
        .categories(ComponentCategory.HELPERS)
        .connection(SampleConnection.CONNECTION_DEFINITION)
        .actions(SampleAction.ACTION_DEFINITION);

    @Override
    public ComponentDefinition getDefinition() {
        return COMPONENT_DEFINITION;
    }
}