/**
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * Copyright 2012-2015 the original author or authors.
 */
package org.assertj.core.error.builders;

public class MessageBuilder {

  private static class Lexicon {
    static final String EXPECTING_VALUE = "%nExpecting value <%s> ";
    static final String EXPECTING_VALUES = "%nExpecting values:%n  <%s>";
    static final String EXPECTING = "%nExpecting: <%s> ";
    static final String EXPECTING_NEWLINE = "%nExpecting:%n <%s>%n";
    static final String IN_FIELD = "in field <%s> ";
    static final String IN_FIELDS = "%nin fields:%n  <%s>";
    static final String BUT_WAS = "but was <%s> ";
    static final String BUT_WERE = "%nbut were:%n  <%s>";
    static final String IN = "in <%s>";
    static final String NEWLINE_IN = "%nin <%s>";
    static final String COMPARISON_ON_FIELDS = ".%nComparison was performed on fields:%n  <%s>";
    static final String HAVE_SAME_GENERIC_TYPE = "have the same generic type as condition <%s>";
    static final String TO_BE_GREATER_THAN_OR_EQUAL_TO = "to be greater than or equal to:%n <%s> %s";
  }

  private StringBuilder builder = new StringBuilder();

  private MessageBuilder() {

  }

  public MessageBuilder expecting() {
    builder.append(Lexicon.EXPECTING);
    return this;
  }

  public MessageBuilder expectingWithNewLine() {
    builder.append(Lexicon.EXPECTING_NEWLINE);
    return this;
  }

  public MessageBuilder expectingValueInField() {
    builder.append(Lexicon.EXPECTING_VALUE).append(Lexicon.IN_FIELD);
    return this;
  }

  public MessageBuilder expectingValuesInFields() {
    builder.append(Lexicon.EXPECTING_VALUES).append(Lexicon.IN_FIELDS);
    return this;
  }

  public MessageBuilder butWasIn() {
    builder.append(Lexicon.BUT_WAS).append(Lexicon.IN);
    return this;
  }

  public MessageBuilder butWereIn() {
    builder.append(Lexicon.BUT_WERE).append(Lexicon.NEWLINE_IN);
    return this;
  }

  public MessageBuilder withComparisonOnFields() {
    builder.append(Lexicon.COMPARISON_ON_FIELDS);
    return this;
  }

  public MessageBuilder haveSameGenericType() {
    builder.append(Lexicon.HAVE_SAME_GENERIC_TYPE);
    return this;
  }
  public MessageBuilder toBeGreaterThanOrEqualTo() {
    builder.append(Lexicon.TO_BE_GREATER_THAN_OR_EQUAL_TO);
    return this;
  }

  public String build() {
    return builder.toString();
  }

  public static MessageBuilder aMessage() {
    return new MessageBuilder();
  }
}
