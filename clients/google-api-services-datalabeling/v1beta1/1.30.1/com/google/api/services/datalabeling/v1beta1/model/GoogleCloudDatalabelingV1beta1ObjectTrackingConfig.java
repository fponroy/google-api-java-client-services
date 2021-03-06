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
 * Config for video object tracking human labeling task.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Data Labeling API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDatalabelingV1beta1ObjectTrackingConfig extends com.google.api.client.json.GenericJson {

  /**
   * Required. Annotation spec set resource name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String annotationSpecSet;

  /**
   * Videos will be cut to smaller clips to make it easier for labelers to work on. Users can
   * configure is field in seconds, if not set, default value is 20s.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer clipLength;

  /**
   * The overlap length between different video clips. Users can configure is field in seconds, if
   * not set, default value is 0.3s.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer overlapLength;

  /**
   * Required. Annotation spec set resource name.
   * @return value or {@code null} for none
   */
  public java.lang.String getAnnotationSpecSet() {
    return annotationSpecSet;
  }

  /**
   * Required. Annotation spec set resource name.
   * @param annotationSpecSet annotationSpecSet or {@code null} for none
   */
  public GoogleCloudDatalabelingV1beta1ObjectTrackingConfig setAnnotationSpecSet(java.lang.String annotationSpecSet) {
    this.annotationSpecSet = annotationSpecSet;
    return this;
  }

  /**
   * Videos will be cut to smaller clips to make it easier for labelers to work on. Users can
   * configure is field in seconds, if not set, default value is 20s.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getClipLength() {
    return clipLength;
  }

  /**
   * Videos will be cut to smaller clips to make it easier for labelers to work on. Users can
   * configure is field in seconds, if not set, default value is 20s.
   * @param clipLength clipLength or {@code null} for none
   */
  public GoogleCloudDatalabelingV1beta1ObjectTrackingConfig setClipLength(java.lang.Integer clipLength) {
    this.clipLength = clipLength;
    return this;
  }

  /**
   * The overlap length between different video clips. Users can configure is field in seconds, if
   * not set, default value is 0.3s.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getOverlapLength() {
    return overlapLength;
  }

  /**
   * The overlap length between different video clips. Users can configure is field in seconds, if
   * not set, default value is 0.3s.
   * @param overlapLength overlapLength or {@code null} for none
   */
  public GoogleCloudDatalabelingV1beta1ObjectTrackingConfig setOverlapLength(java.lang.Integer overlapLength) {
    this.overlapLength = overlapLength;
    return this;
  }

  @Override
  public GoogleCloudDatalabelingV1beta1ObjectTrackingConfig set(String fieldName, Object value) {
    return (GoogleCloudDatalabelingV1beta1ObjectTrackingConfig) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDatalabelingV1beta1ObjectTrackingConfig clone() {
    return (GoogleCloudDatalabelingV1beta1ObjectTrackingConfig) super.clone();
  }

}
