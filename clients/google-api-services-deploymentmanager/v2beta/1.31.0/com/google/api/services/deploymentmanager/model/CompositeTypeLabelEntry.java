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

package com.google.api.services.deploymentmanager.model;

/**
 * Label object for CompositeTypes
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Deployment Manager V2 API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CompositeTypeLabelEntry extends com.google.api.client.json.GenericJson {

  /**
   * Key of the label
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String key;

  /**
   * Value of the label
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String value;

  /**
   * Key of the label
   * @return value or {@code null} for none
   */
  public java.lang.String getKey() {
    return key;
  }

  /**
   * Key of the label
   * @param key key or {@code null} for none
   */
  public CompositeTypeLabelEntry setKey(java.lang.String key) {
    this.key = key;
    return this;
  }

  /**
   * Value of the label
   * @return value or {@code null} for none
   */
  public java.lang.String getValue() {
    return value;
  }

  /**
   * Value of the label
   * @param value value or {@code null} for none
   */
  public CompositeTypeLabelEntry setValue(java.lang.String value) {
    this.value = value;
    return this;
  }

  @Override
  public CompositeTypeLabelEntry set(String fieldName, Object value) {
    return (CompositeTypeLabelEntry) super.set(fieldName, value);
  }

  @Override
  public CompositeTypeLabelEntry clone() {
    return (CompositeTypeLabelEntry) super.clone();
  }

}
