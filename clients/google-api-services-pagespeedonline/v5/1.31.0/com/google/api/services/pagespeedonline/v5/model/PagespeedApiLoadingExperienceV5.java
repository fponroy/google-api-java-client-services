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

package com.google.api.services.pagespeedonline.v5.model;

/**
 * The CrUX loading experience object that contains CrUX data breakdowns.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the PageSpeed Insights API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PagespeedApiLoadingExperienceV5 extends com.google.api.client.json.GenericJson {

  /**
   * The url, pattern or origin which the metrics are on.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * The requested URL, which may differ from the resolved "id".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("initial_url")
  private java.lang.String initialUrl;

  /**
   * The map of .
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, UserPageLoadMetricV5> metrics;

  /**
   * True if the result is an origin fallback from a page, false otherwise.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("origin_fallback")
  private java.lang.Boolean originFallback;

  /**
   * The human readable speed "category" of the id.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("overall_category")
  private java.lang.String overallCategory;

  /**
   * The url, pattern or origin which the metrics are on.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * The url, pattern or origin which the metrics are on.
   * @param id id or {@code null} for none
   */
  public PagespeedApiLoadingExperienceV5 setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * The requested URL, which may differ from the resolved "id".
   * @return value or {@code null} for none
   */
  public java.lang.String getInitialUrl() {
    return initialUrl;
  }

  /**
   * The requested URL, which may differ from the resolved "id".
   * @param initialUrl initialUrl or {@code null} for none
   */
  public PagespeedApiLoadingExperienceV5 setInitialUrl(java.lang.String initialUrl) {
    this.initialUrl = initialUrl;
    return this;
  }

  /**
   * The map of .
   * @return value or {@code null} for none
   */
  public java.util.Map<String, UserPageLoadMetricV5> getMetrics() {
    return metrics;
  }

  /**
   * The map of .
   * @param metrics metrics or {@code null} for none
   */
  public PagespeedApiLoadingExperienceV5 setMetrics(java.util.Map<String, UserPageLoadMetricV5> metrics) {
    this.metrics = metrics;
    return this;
  }

  /**
   * True if the result is an origin fallback from a page, false otherwise.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getOriginFallback() {
    return originFallback;
  }

  /**
   * True if the result is an origin fallback from a page, false otherwise.
   * @param originFallback originFallback or {@code null} for none
   */
  public PagespeedApiLoadingExperienceV5 setOriginFallback(java.lang.Boolean originFallback) {
    this.originFallback = originFallback;
    return this;
  }

  /**
   * The human readable speed "category" of the id.
   * @return value or {@code null} for none
   */
  public java.lang.String getOverallCategory() {
    return overallCategory;
  }

  /**
   * The human readable speed "category" of the id.
   * @param overallCategory overallCategory or {@code null} for none
   */
  public PagespeedApiLoadingExperienceV5 setOverallCategory(java.lang.String overallCategory) {
    this.overallCategory = overallCategory;
    return this;
  }

  @Override
  public PagespeedApiLoadingExperienceV5 set(String fieldName, Object value) {
    return (PagespeedApiLoadingExperienceV5) super.set(fieldName, value);
  }

  @Override
  public PagespeedApiLoadingExperienceV5 clone() {
    return (PagespeedApiLoadingExperienceV5) super.clone();
  }

}
