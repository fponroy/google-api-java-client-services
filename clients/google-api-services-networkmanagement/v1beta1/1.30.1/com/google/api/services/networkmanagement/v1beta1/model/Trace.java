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

package com.google.api.services.networkmanagement.v1beta1.model;

/**
 * Trace represents one simulated packet forwarding path.
 *
 *   Each trace contains multiple ordered steps.   Each step is in a particular state and has an
 * associated   configuration. State is categorized as a final or non-final   state. Each final
 * state has a reason associated with it.   Each trace must end with a final state (the last step).
 *
 *   |---------------------Trace----------------------|   Step1(State) Step2(State) ---
 * StepN(State(final))
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Network Management API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Trace extends com.google.api.client.json.GenericJson {

  /**
   * Derived from the source and destination endpoints definition, and validated by the data plane
   * model. If there are multiple traces starting from different source locations, then the
   * endpoint_info may be different between traces.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private EndpointInfo endpointInfo;

  /**
   * A trace of a test contains multiple steps from the initial state to the final state (delivered,
   * dropped, forwarded, or aborted).
   *
   * The steps are ordered by the processing sequence within the simulated network state machine. It
   * is critical to preserve the order of the steps and avoid reordering or sorting them.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Step> steps;

  static {
    // hack to force ProGuard to consider Step used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Step.class);
  }

  /**
   * Derived from the source and destination endpoints definition, and validated by the data plane
   * model. If there are multiple traces starting from different source locations, then the
   * endpoint_info may be different between traces.
   * @return value or {@code null} for none
   */
  public EndpointInfo getEndpointInfo() {
    return endpointInfo;
  }

  /**
   * Derived from the source and destination endpoints definition, and validated by the data plane
   * model. If there are multiple traces starting from different source locations, then the
   * endpoint_info may be different between traces.
   * @param endpointInfo endpointInfo or {@code null} for none
   */
  public Trace setEndpointInfo(EndpointInfo endpointInfo) {
    this.endpointInfo = endpointInfo;
    return this;
  }

  /**
   * A trace of a test contains multiple steps from the initial state to the final state (delivered,
   * dropped, forwarded, or aborted).
   *
   * The steps are ordered by the processing sequence within the simulated network state machine. It
   * is critical to preserve the order of the steps and avoid reordering or sorting them.
   * @return value or {@code null} for none
   */
  public java.util.List<Step> getSteps() {
    return steps;
  }

  /**
   * A trace of a test contains multiple steps from the initial state to the final state (delivered,
   * dropped, forwarded, or aborted).
   *
   * The steps are ordered by the processing sequence within the simulated network state machine. It
   * is critical to preserve the order of the steps and avoid reordering or sorting them.
   * @param steps steps or {@code null} for none
   */
  public Trace setSteps(java.util.List<Step> steps) {
    this.steps = steps;
    return this;
  }

  @Override
  public Trace set(String fieldName, Object value) {
    return (Trace) super.set(fieldName, value);
  }

  @Override
  public Trace clone() {
    return (Trace) super.clone();
  }

}