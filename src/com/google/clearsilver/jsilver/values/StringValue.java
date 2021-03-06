/*
 * Copyright (C) 2010 Google Inc.
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

package com.google.clearsilver.jsilver.values;

import com.google.clearsilver.jsilver.autoescape.EscapeMode;

/**
 * A simple string value.
 * 
 * @see Value
 */
class StringValue extends VariantValue {

  private final String value;

  public StringValue(String value, EscapeMode escapeMode, boolean partiallyEscaped) {
    super(escapeMode, partiallyEscaped);
    this.value = value;
  }

  @Override
  protected String value() {
    return value;
  }

  @Override
  public boolean exists() {
    return true;
  }

  @Override
  public boolean isEmpty() {
    return value.length() == 0;
  }
}
