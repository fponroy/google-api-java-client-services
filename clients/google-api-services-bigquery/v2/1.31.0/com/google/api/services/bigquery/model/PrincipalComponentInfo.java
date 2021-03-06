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

package com.google.api.services.bigquery.model;

/**
 * Principal component infos, used only for eigen decomposition based models, e.g., PCA. Ordered by
 * explained_variance in the descending order.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BigQuery API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PrincipalComponentInfo extends com.google.api.client.json.GenericJson {

  /**
   * The explained_variance is pre-ordered in the descending order to compute the cumulative
   * explained variance ratio.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double cumulativeExplainedVarianceRatio;

  /**
   * Explained variance by this principal component, which is simply the eigenvalue.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double explainedVariance;

  /**
   * Explained_variance over the total explained variance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double explainedVarianceRatio;

  /**
   * Id of the principal component.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long principalComponentId;

  /**
   * The explained_variance is pre-ordered in the descending order to compute the cumulative
   * explained variance ratio.
   * @return value or {@code null} for none
   */
  public java.lang.Double getCumulativeExplainedVarianceRatio() {
    return cumulativeExplainedVarianceRatio;
  }

  /**
   * The explained_variance is pre-ordered in the descending order to compute the cumulative
   * explained variance ratio.
   * @param cumulativeExplainedVarianceRatio cumulativeExplainedVarianceRatio or {@code null} for none
   */
  public PrincipalComponentInfo setCumulativeExplainedVarianceRatio(java.lang.Double cumulativeExplainedVarianceRatio) {
    this.cumulativeExplainedVarianceRatio = cumulativeExplainedVarianceRatio;
    return this;
  }

  /**
   * Explained variance by this principal component, which is simply the eigenvalue.
   * @return value or {@code null} for none
   */
  public java.lang.Double getExplainedVariance() {
    return explainedVariance;
  }

  /**
   * Explained variance by this principal component, which is simply the eigenvalue.
   * @param explainedVariance explainedVariance or {@code null} for none
   */
  public PrincipalComponentInfo setExplainedVariance(java.lang.Double explainedVariance) {
    this.explainedVariance = explainedVariance;
    return this;
  }

  /**
   * Explained_variance over the total explained variance.
   * @return value or {@code null} for none
   */
  public java.lang.Double getExplainedVarianceRatio() {
    return explainedVarianceRatio;
  }

  /**
   * Explained_variance over the total explained variance.
   * @param explainedVarianceRatio explainedVarianceRatio or {@code null} for none
   */
  public PrincipalComponentInfo setExplainedVarianceRatio(java.lang.Double explainedVarianceRatio) {
    this.explainedVarianceRatio = explainedVarianceRatio;
    return this;
  }

  /**
   * Id of the principal component.
   * @return value or {@code null} for none
   */
  public java.lang.Long getPrincipalComponentId() {
    return principalComponentId;
  }

  /**
   * Id of the principal component.
   * @param principalComponentId principalComponentId or {@code null} for none
   */
  public PrincipalComponentInfo setPrincipalComponentId(java.lang.Long principalComponentId) {
    this.principalComponentId = principalComponentId;
    return this;
  }

  @Override
  public PrincipalComponentInfo set(String fieldName, Object value) {
    return (PrincipalComponentInfo) super.set(fieldName, value);
  }

  @Override
  public PrincipalComponentInfo clone() {
    return (PrincipalComponentInfo) super.clone();
  }

}
