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

package com.google.api.services.run.v1beta1.model;

/**
 * CustomResourceSubresources defines the status and scale subresources for CustomResources.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Run Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CustomResourceSubresources extends com.google.api.client.json.GenericJson {

  /**
   * Scale denotes the scale subresource for CustomResources +optional
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CustomResourceSubresourceScale scale;

  /**
   * Status denotes the status subresource for CustomResources +optional
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CustomResourceSubresourceStatus status;

  /**
   * Scale denotes the scale subresource for CustomResources +optional
   * @return value or {@code null} for none
   */
  public CustomResourceSubresourceScale getScale() {
    return scale;
  }

  /**
   * Scale denotes the scale subresource for CustomResources +optional
   * @param scale scale or {@code null} for none
   */
  public CustomResourceSubresources setScale(CustomResourceSubresourceScale scale) {
    this.scale = scale;
    return this;
  }

  /**
   * Status denotes the status subresource for CustomResources +optional
   * @return value or {@code null} for none
   */
  public CustomResourceSubresourceStatus getStatus() {
    return status;
  }

  /**
   * Status denotes the status subresource for CustomResources +optional
   * @param status status or {@code null} for none
   */
  public CustomResourceSubresources setStatus(CustomResourceSubresourceStatus status) {
    this.status = status;
    return this;
  }

  @Override
  public CustomResourceSubresources set(String fieldName, Object value) {
    return (CustomResourceSubresources) super.set(fieldName, value);
  }

  @Override
  public CustomResourceSubresources clone() {
    return (CustomResourceSubresources) super.clone();
  }

}
