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

package com.google.api.services.dfareporting.model;

/**
 * Represents a DimensionValuesRequest.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Campaign Manager 360 API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DimensionValueRequest extends com.google.api.client.json.GenericJson {

  /**
   * The name of the dimension for which values should be requested.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dimensionName;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime endDate;

  /**
   * The list of filters by which to filter values. The filters are ANDed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<DimensionFilter> filters;

  static {
    // hack to force ProGuard to consider DimensionFilter used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(DimensionFilter.class);
  }

  /**
   * The kind of request this is, in this case dfareporting#dimensionValueRequest .
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime startDate;

  /**
   * The name of the dimension for which values should be requested.
   * @return value or {@code null} for none
   */
  public java.lang.String getDimensionName() {
    return dimensionName;
  }

  /**
   * The name of the dimension for which values should be requested.
   * @param dimensionName dimensionName or {@code null} for none
   */
  public DimensionValueRequest setDimensionName(java.lang.String dimensionName) {
    this.dimensionName = dimensionName;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getEndDate() {
    return endDate;
  }

  /**
   * @param endDate endDate or {@code null} for none
   */
  public DimensionValueRequest setEndDate(com.google.api.client.util.DateTime endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * The list of filters by which to filter values. The filters are ANDed.
   * @return value or {@code null} for none
   */
  public java.util.List<DimensionFilter> getFilters() {
    return filters;
  }

  /**
   * The list of filters by which to filter values. The filters are ANDed.
   * @param filters filters or {@code null} for none
   */
  public DimensionValueRequest setFilters(java.util.List<DimensionFilter> filters) {
    this.filters = filters;
    return this;
  }

  /**
   * The kind of request this is, in this case dfareporting#dimensionValueRequest .
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * The kind of request this is, in this case dfareporting#dimensionValueRequest .
   * @param kind kind or {@code null} for none
   */
  public DimensionValueRequest setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getStartDate() {
    return startDate;
  }

  /**
   * @param startDate startDate or {@code null} for none
   */
  public DimensionValueRequest setStartDate(com.google.api.client.util.DateTime startDate) {
    this.startDate = startDate;
    return this;
  }

  @Override
  public DimensionValueRequest set(String fieldName, Object value) {
    return (DimensionValueRequest) super.set(fieldName, value);
  }

  @Override
  public DimensionValueRequest clone() {
    return (DimensionValueRequest) super.clone();
  }

}
