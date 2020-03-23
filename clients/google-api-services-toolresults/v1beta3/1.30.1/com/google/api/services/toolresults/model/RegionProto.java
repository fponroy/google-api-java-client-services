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

package com.google.api.services.toolresults.model;

/**
 * A rectangular region.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Tool Results API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RegionProto extends com.google.api.client.json.GenericJson {

  /**
   * The height, in pixels. Always set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer heightPx;

  /**
   * The left side of the rectangle, in pixels. Always set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer leftPx;

  /**
   * The top of the rectangle, in pixels. Always set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer topPx;

  /**
   * The width, in pixels. Always set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer widthPx;

  /**
   * The height, in pixels. Always set.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getHeightPx() {
    return heightPx;
  }

  /**
   * The height, in pixels. Always set.
   * @param heightPx heightPx or {@code null} for none
   */
  public RegionProto setHeightPx(java.lang.Integer heightPx) {
    this.heightPx = heightPx;
    return this;
  }

  /**
   * The left side of the rectangle, in pixels. Always set.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getLeftPx() {
    return leftPx;
  }

  /**
   * The left side of the rectangle, in pixels. Always set.
   * @param leftPx leftPx or {@code null} for none
   */
  public RegionProto setLeftPx(java.lang.Integer leftPx) {
    this.leftPx = leftPx;
    return this;
  }

  /**
   * The top of the rectangle, in pixels. Always set.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTopPx() {
    return topPx;
  }

  /**
   * The top of the rectangle, in pixels. Always set.
   * @param topPx topPx or {@code null} for none
   */
  public RegionProto setTopPx(java.lang.Integer topPx) {
    this.topPx = topPx;
    return this;
  }

  /**
   * The width, in pixels. Always set.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getWidthPx() {
    return widthPx;
  }

  /**
   * The width, in pixels. Always set.
   * @param widthPx widthPx or {@code null} for none
   */
  public RegionProto setWidthPx(java.lang.Integer widthPx) {
    this.widthPx = widthPx;
    return this;
  }

  @Override
  public RegionProto set(String fieldName, Object value) {
    return (RegionProto) super.set(fieldName, value);
  }

  @Override
  public RegionProto clone() {
    return (RegionProto) super.clone();
  }

}