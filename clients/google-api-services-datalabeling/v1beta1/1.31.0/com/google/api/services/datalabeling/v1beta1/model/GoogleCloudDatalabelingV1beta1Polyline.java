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

package com.google.api.services.datalabeling.v1beta1.model;

/**
 * A line with multiple line segments.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Data Labeling API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDatalabelingV1beta1Polyline extends com.google.api.client.json.GenericJson {

  /**
   * The polyline vertices.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDatalabelingV1beta1Vertex> vertices;

  /**
   * The polyline vertices.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDatalabelingV1beta1Vertex> getVertices() {
    return vertices;
  }

  /**
   * The polyline vertices.
   * @param vertices vertices or {@code null} for none
   */
  public GoogleCloudDatalabelingV1beta1Polyline setVertices(java.util.List<GoogleCloudDatalabelingV1beta1Vertex> vertices) {
    this.vertices = vertices;
    return this;
  }

  @Override
  public GoogleCloudDatalabelingV1beta1Polyline set(String fieldName, Object value) {
    return (GoogleCloudDatalabelingV1beta1Polyline) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDatalabelingV1beta1Polyline clone() {
    return (GoogleCloudDatalabelingV1beta1Polyline) super.clone();
  }

}
