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
 * Model definition for PollingOptions.
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
public final class PollingOptions extends com.google.api.client.json.GenericJson {

  /**
   * An array of diagnostics to be collected by Deployment Manager, these diagnostics will be
   * displayed to the user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Diagnostic> diagnostics;

  static {
    // hack to force ProGuard to consider Diagnostic used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Diagnostic.class);
  }

  /**
   * JsonPath expression that determines if the request failed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String failCondition;

  /**
   * JsonPath expression that determines if the request is completed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String finishCondition;

  /**
   * JsonPath expression that evaluates to string, it indicates where to poll.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pollingLink;

  /**
   * JsonPath expression, after polling is completed, indicates where to fetch the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String targetLink;

  /**
   * An array of diagnostics to be collected by Deployment Manager, these diagnostics will be
   * displayed to the user.
   * @return value or {@code null} for none
   */
  public java.util.List<Diagnostic> getDiagnostics() {
    return diagnostics;
  }

  /**
   * An array of diagnostics to be collected by Deployment Manager, these diagnostics will be
   * displayed to the user.
   * @param diagnostics diagnostics or {@code null} for none
   */
  public PollingOptions setDiagnostics(java.util.List<Diagnostic> diagnostics) {
    this.diagnostics = diagnostics;
    return this;
  }

  /**
   * JsonPath expression that determines if the request failed.
   * @return value or {@code null} for none
   */
  public java.lang.String getFailCondition() {
    return failCondition;
  }

  /**
   * JsonPath expression that determines if the request failed.
   * @param failCondition failCondition or {@code null} for none
   */
  public PollingOptions setFailCondition(java.lang.String failCondition) {
    this.failCondition = failCondition;
    return this;
  }

  /**
   * JsonPath expression that determines if the request is completed.
   * @return value or {@code null} for none
   */
  public java.lang.String getFinishCondition() {
    return finishCondition;
  }

  /**
   * JsonPath expression that determines if the request is completed.
   * @param finishCondition finishCondition or {@code null} for none
   */
  public PollingOptions setFinishCondition(java.lang.String finishCondition) {
    this.finishCondition = finishCondition;
    return this;
  }

  /**
   * JsonPath expression that evaluates to string, it indicates where to poll.
   * @return value or {@code null} for none
   */
  public java.lang.String getPollingLink() {
    return pollingLink;
  }

  /**
   * JsonPath expression that evaluates to string, it indicates where to poll.
   * @param pollingLink pollingLink or {@code null} for none
   */
  public PollingOptions setPollingLink(java.lang.String pollingLink) {
    this.pollingLink = pollingLink;
    return this;
  }

  /**
   * JsonPath expression, after polling is completed, indicates where to fetch the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getTargetLink() {
    return targetLink;
  }

  /**
   * JsonPath expression, after polling is completed, indicates where to fetch the resource.
   * @param targetLink targetLink or {@code null} for none
   */
  public PollingOptions setTargetLink(java.lang.String targetLink) {
    this.targetLink = targetLink;
    return this;
  }

  @Override
  public PollingOptions set(String fieldName, Object value) {
    return (PollingOptions) super.set(fieldName, value);
  }

  @Override
  public PollingOptions clone() {
    return (PollingOptions) super.clone();
  }

}
