/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.content.model;

/**
 * Model definition for ReturnPolicyPolicy.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Content API for Shopping. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ReturnPolicyPolicy extends com.google.api.client.json.GenericJson {

  /**
   * Last day for returning the items. In ISO 8601 format. When specifying the return window like
   * this, set the policy type to "lastReturnDate". Use this for seasonal overrides only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String lastReturnDate;

  /**
   * The number of days items can be returned after delivery, where one day is defined to be 24
   * hours after the delivery timestamp. When specifying the return window like this, set the policy
   * type to "numberOfDaysAfterDelivery". Acceptable values are 30, 45, 60, 90, 100, 180, 270 and
   * 365 for the default policy. Additional policies further allow 14, 15, 21 and 28 days, but note
   * that for most items a minimum of 30 days is required for returns. Exceptions may be made for
   * electronics. A policy of less than 30 days can only be applied to those items.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long numberOfDays;

  /**
   * Policy type. Use "lastReturnDate" for seasonal overrides only. Note that for most items a
   * minimum of 30 days is required for returns. Exceptions may be made for electronics or non-
   * returnable items such as food, perishables, and living things. A policy of less than 30 days
   * can only be applied to those items.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * Last day for returning the items. In ISO 8601 format. When specifying the return window like
   * this, set the policy type to "lastReturnDate". Use this for seasonal overrides only.
   * @return value or {@code null} for none
   */
  public java.lang.String getLastReturnDate() {
    return lastReturnDate;
  }

  /**
   * Last day for returning the items. In ISO 8601 format. When specifying the return window like
   * this, set the policy type to "lastReturnDate". Use this for seasonal overrides only.
   * @param lastReturnDate lastReturnDate or {@code null} for none
   */
  public ReturnPolicyPolicy setLastReturnDate(java.lang.String lastReturnDate) {
    this.lastReturnDate = lastReturnDate;
    return this;
  }

  /**
   * The number of days items can be returned after delivery, where one day is defined to be 24
   * hours after the delivery timestamp. When specifying the return window like this, set the policy
   * type to "numberOfDaysAfterDelivery". Acceptable values are 30, 45, 60, 90, 100, 180, 270 and
   * 365 for the default policy. Additional policies further allow 14, 15, 21 and 28 days, but note
   * that for most items a minimum of 30 days is required for returns. Exceptions may be made for
   * electronics. A policy of less than 30 days can only be applied to those items.
   * @return value or {@code null} for none
   */
  public java.lang.Long getNumberOfDays() {
    return numberOfDays;
  }

  /**
   * The number of days items can be returned after delivery, where one day is defined to be 24
   * hours after the delivery timestamp. When specifying the return window like this, set the policy
   * type to "numberOfDaysAfterDelivery". Acceptable values are 30, 45, 60, 90, 100, 180, 270 and
   * 365 for the default policy. Additional policies further allow 14, 15, 21 and 28 days, but note
   * that for most items a minimum of 30 days is required for returns. Exceptions may be made for
   * electronics. A policy of less than 30 days can only be applied to those items.
   * @param numberOfDays numberOfDays or {@code null} for none
   */
  public ReturnPolicyPolicy setNumberOfDays(java.lang.Long numberOfDays) {
    this.numberOfDays = numberOfDays;
    return this;
  }

  /**
   * Policy type. Use "lastReturnDate" for seasonal overrides only. Note that for most items a
   * minimum of 30 days is required for returns. Exceptions may be made for electronics or non-
   * returnable items such as food, perishables, and living things. A policy of less than 30 days
   * can only be applied to those items.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Policy type. Use "lastReturnDate" for seasonal overrides only. Note that for most items a
   * minimum of 30 days is required for returns. Exceptions may be made for electronics or non-
   * returnable items such as food, perishables, and living things. A policy of less than 30 days
   * can only be applied to those items.
   * @param type type or {@code null} for none
   */
  public ReturnPolicyPolicy setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public ReturnPolicyPolicy set(String fieldName, Object value) {
    return (ReturnPolicyPolicy) super.set(fieldName, value);
  }

  @Override
  public ReturnPolicyPolicy clone() {
    return (ReturnPolicyPolicy) super.clone();
  }

}
