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

package org.plukh.options.impl.persistence.interfaces;

import org.plukh.options.Option;
import org.plukh.options.Persistence;
import org.plukh.options.PersistenceType;
import org.plukh.options.impl.persistence.PersistenceOptions;

@Persistence(PersistenceType.PROPERTIES_FILE)
public interface ReadOnlyTestOptions extends PersistenceOptions {
    @Option(key="read.only", readOnly = true, defaultValue = "1")
    int getReadOnlyOption();
}
