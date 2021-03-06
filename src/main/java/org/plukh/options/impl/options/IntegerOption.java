/*
 *
 *  * Copyright 2012, 2013 by Victor Denisov (vdenisov@plukh.org).
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

package org.plukh.options.impl.options;

import org.plukh.options.ParseException;

public class IntegerOption extends AbstractOption {

    public IntegerOption() {
    }

    public IntegerOption(String key, String stringValue) {
        super(key, stringValue);
    }

    public IntegerOption(String key, Integer value) {
        super(key);
        this.value = value;
        this.stringToValueConverted = true;
        this.valueToStringConverted = false;
    }

    public IntegerOption(String key) {
        super(key);
    }

    @Override
    public Object convertStringToValue(String s) throws ParseException {
        if (s == null || s.isEmpty()) return null;
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            throw new ParseException("Error converting string: " + s + " to integer value", e);
        }
    }

    @Override
    public String convertValueToString(Object o) {
        if (o == null) return null;
        return o.toString();
    }

    public Integer getIntValue() {
        return (Integer) getValue();
    }

    @Override
    public void setValue(Object value) {
        if (value != null && !(value instanceof Integer)) throw new IllegalArgumentException("Can only set value to Integer");
        super.setValue(value);
    }
}
