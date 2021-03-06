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

package com.google.api.services.firebase.v1beta1.model;

/**
 * Model definition for AdminSdkConfig.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Firebase Management API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AdminSdkConfig extends com.google.api.client.json.GenericJson {

  /**
   * The default Firebase Realtime Database URL.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String databaseURL;

  /**
   * The ID of the Project's default GCP resource location. The location is one of the available
   * [GCP resource locations](https://firebase.google.com/docs/projects/locations). This field is
   * omitted if the default GCP resource location has not been finalized yet. To set a Project's
   * default GCP resource location, call
   * [`FinalizeDefaultLocation`](../projects.defaultLocation/finalize) after you add Firebase
   * resources to the Project.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String locationId;

  /**
   * Immutable. A user-assigned unique identifier for the `FirebaseProject`. This identifier may
   * appear in URLs or names for some Firebase resources associated with the Project, but it should
   * generally be treated as a convenience alias to reference the Project.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String projectId;

  /**
   * The default Cloud Storage for Firebase storage bucket name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String storageBucket;

  /**
   * The default Firebase Realtime Database URL.
   * @return value or {@code null} for none
   */
  public java.lang.String getDatabaseURL() {
    return databaseURL;
  }

  /**
   * The default Firebase Realtime Database URL.
   * @param databaseURL databaseURL or {@code null} for none
   */
  public AdminSdkConfig setDatabaseURL(java.lang.String databaseURL) {
    this.databaseURL = databaseURL;
    return this;
  }

  /**
   * The ID of the Project's default GCP resource location. The location is one of the available
   * [GCP resource locations](https://firebase.google.com/docs/projects/locations). This field is
   * omitted if the default GCP resource location has not been finalized yet. To set a Project's
   * default GCP resource location, call
   * [`FinalizeDefaultLocation`](../projects.defaultLocation/finalize) after you add Firebase
   * resources to the Project.
   * @return value or {@code null} for none
   */
  public java.lang.String getLocationId() {
    return locationId;
  }

  /**
   * The ID of the Project's default GCP resource location. The location is one of the available
   * [GCP resource locations](https://firebase.google.com/docs/projects/locations). This field is
   * omitted if the default GCP resource location has not been finalized yet. To set a Project's
   * default GCP resource location, call
   * [`FinalizeDefaultLocation`](../projects.defaultLocation/finalize) after you add Firebase
   * resources to the Project.
   * @param locationId locationId or {@code null} for none
   */
  public AdminSdkConfig setLocationId(java.lang.String locationId) {
    this.locationId = locationId;
    return this;
  }

  /**
   * Immutable. A user-assigned unique identifier for the `FirebaseProject`. This identifier may
   * appear in URLs or names for some Firebase resources associated with the Project, but it should
   * generally be treated as a convenience alias to reference the Project.
   * @return value or {@code null} for none
   */
  public java.lang.String getProjectId() {
    return projectId;
  }

  /**
   * Immutable. A user-assigned unique identifier for the `FirebaseProject`. This identifier may
   * appear in URLs or names for some Firebase resources associated with the Project, but it should
   * generally be treated as a convenience alias to reference the Project.
   * @param projectId projectId or {@code null} for none
   */
  public AdminSdkConfig setProjectId(java.lang.String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * The default Cloud Storage for Firebase storage bucket name.
   * @return value or {@code null} for none
   */
  public java.lang.String getStorageBucket() {
    return storageBucket;
  }

  /**
   * The default Cloud Storage for Firebase storage bucket name.
   * @param storageBucket storageBucket or {@code null} for none
   */
  public AdminSdkConfig setStorageBucket(java.lang.String storageBucket) {
    this.storageBucket = storageBucket;
    return this;
  }

  @Override
  public AdminSdkConfig set(String fieldName, Object value) {
    return (AdminSdkConfig) super.set(fieldName, value);
  }

  @Override
  public AdminSdkConfig clone() {
    return (AdminSdkConfig) super.clone();
  }

}
