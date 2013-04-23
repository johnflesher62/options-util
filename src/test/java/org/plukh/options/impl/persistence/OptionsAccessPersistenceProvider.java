/*
 *
 *  * Copyright 2012 by Victor Denisov (vdenisov@redline.ru).
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *      http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */

package org.plukh.options.impl.persistence;

import org.plukh.options.OptionsException;
import org.plukh.options.PersistenceConfig;
import org.plukh.options.ProviderConfigurationException;
import org.plukh.options.impl.options.AbstractOption;

import java.util.Collection;

public class OptionsAccessPersistenceProvider extends TransientPersistenceProvider {
    private Collection<AbstractOption> options;
    private boolean suppressConversionErrors;

    @Override
    public void configure(PersistenceConfig configuration) throws ProviderConfigurationException {

    }

    @Override
    public boolean load(Collection<AbstractOption> options, boolean suppressConversionErrors) throws OptionsException {
        this.options = options;
        this.suppressConversionErrors = suppressConversionErrors;
        return true;
    }

    public Collection<AbstractOption> getOptions() {
        return options;
    }
}