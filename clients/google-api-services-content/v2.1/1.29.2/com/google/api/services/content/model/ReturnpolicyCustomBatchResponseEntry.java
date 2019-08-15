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
 * Model definition for ReturnpolicyCustomBatchResponseEntry.
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
public final class ReturnpolicyCustomBatchResponseEntry extends com.google.api.client.json.GenericJson {

  /**
   * The ID of the request entry to which this entry responds.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Long batchId;

  /**
   * A list of errors defined if, and only if, the request failed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Errors errors;

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "content#returnpolicyCustomBatchResponseEntry".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The retrieved return policy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ReturnPolicy returnPolicy;

  /**
   * The ID of the request entry to which this entry responds.
   * @return value or {@code null} for none
   */
  public java.lang.Long getBatchId() {
    return batchId;
  }

  /**
   * The ID of the request entry to which this entry responds.
   * @param batchId batchId or {@code null} for none
   */
  public ReturnpolicyCustomBatchResponseEntry setBatchId(java.lang.Long batchId) {
    this.batchId = batchId;
    return this;
  }

  /**
   * A list of errors defined if, and only if, the request failed.
   * @return value or {@code null} for none
   */
  public Errors getErrors() {
    return errors;
  }

  /**
   * A list of errors defined if, and only if, the request failed.
   * @param errors errors or {@code null} for none
   */
  public ReturnpolicyCustomBatchResponseEntry setErrors(Errors errors) {
    this.errors = errors;
    return this;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "content#returnpolicyCustomBatchResponseEntry".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "content#returnpolicyCustomBatchResponseEntry".
   * @param kind kind or {@code null} for none
   */
  public ReturnpolicyCustomBatchResponseEntry setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The retrieved return policy.
   * @return value or {@code null} for none
   */
  public ReturnPolicy getReturnPolicy() {
    return returnPolicy;
  }

  /**
   * The retrieved return policy.
   * @param returnPolicy returnPolicy or {@code null} for none
   */
  public ReturnpolicyCustomBatchResponseEntry setReturnPolicy(ReturnPolicy returnPolicy) {
    this.returnPolicy = returnPolicy;
    return this;
  }

  @Override
  public ReturnpolicyCustomBatchResponseEntry set(String fieldName, Object value) {
    return (ReturnpolicyCustomBatchResponseEntry) super.set(fieldName, value);
  }

  @Override
  public ReturnpolicyCustomBatchResponseEntry clone() {
    return (ReturnpolicyCustomBatchResponseEntry) super.clone();
  }

}
