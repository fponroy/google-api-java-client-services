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

package com.google.api.services.tpu.v1.model;

/**
 * A Symptom instance.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud TPU API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Symptom extends com.google.api.client.json.GenericJson {

  /**
   * Timestamp when the Symptom is created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Detailed information of the current Symptom.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String details;

  /**
   * Type of the Symptom.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String symptomType;

  /**
   * A string used to uniquely distinguish a worker within a TPU node.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String workerId;

  /**
   * Timestamp when the Symptom is created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Timestamp when the Symptom is created.
   * @param createTime createTime or {@code null} for none
   */
  public Symptom setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Detailed information of the current Symptom.
   * @return value or {@code null} for none
   */
  public java.lang.String getDetails() {
    return details;
  }

  /**
   * Detailed information of the current Symptom.
   * @param details details or {@code null} for none
   */
  public Symptom setDetails(java.lang.String details) {
    this.details = details;
    return this;
  }

  /**
   * Type of the Symptom.
   * @return value or {@code null} for none
   */
  public java.lang.String getSymptomType() {
    return symptomType;
  }

  /**
   * Type of the Symptom.
   * @param symptomType symptomType or {@code null} for none
   */
  public Symptom setSymptomType(java.lang.String symptomType) {
    this.symptomType = symptomType;
    return this;
  }

  /**
   * A string used to uniquely distinguish a worker within a TPU node.
   * @return value or {@code null} for none
   */
  public java.lang.String getWorkerId() {
    return workerId;
  }

  /**
   * A string used to uniquely distinguish a worker within a TPU node.
   * @param workerId workerId or {@code null} for none
   */
  public Symptom setWorkerId(java.lang.String workerId) {
    this.workerId = workerId;
    return this;
  }

  @Override
  public Symptom set(String fieldName, Object value) {
    return (Symptom) super.set(fieldName, value);
  }

  @Override
  public Symptom clone() {
    return (Symptom) super.clone();
  }

}
