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

package org.sample.customcomponent.action;

import com.bytechef.component.definition.ActionContext;
import com.bytechef.component.definition.ComponentDsl.ModifiableActionDefinition;
import com.bytechef.component.definition.Parameters;

import static com.bytechef.component.definition.ComponentDsl.action;
import static com.bytechef.component.definition.ComponentDsl.outputSchema;
import static com.bytechef.component.definition.ComponentDsl.string;
import static org.sample.customcomponent.constant.SampleConstants.SAMPLE_ACTION;

/**
 * @author Mario Cvjetojevic
 */
public final class SampleAction {

    public static final ModifiableActionDefinition ACTION_DEFINITION = action(SAMPLE_ACTION)
        .title("Sample Action")
        .description("Sample action description")
        .properties(
            string("property1")
                .label("Property1")
        )
        .output(outputSchema(string()))
        .perform(SampleAction::perform);

    private SampleAction() {
    }

    public static Record perform(
        Parameters inputParameters, Parameters connectionParameters, ActionContext actionContext) {

        return new Result("key1", "Hello " + inputParameters.get("property1"));
    }

    record Result(String key, String message) {
    }
}
