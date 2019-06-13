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

package com.google.api.services.compute.model;

/**
 * Model definition for ResourcePolicy.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ResourcePolicy extends com.google.api.client.json.GenericJson {

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String creationTimestamp;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger id;

  /**
   * [Output Only] Type of the resource. Always compute#resource_policies for resource policies.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The name of the resource, provided by the client when initially creating the resource. The
   * resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name
   * must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`
   * which means the first character must be a lowercase letter, and all following characters must
   * be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String region;

  /**
   * [Output Only] Server-defined fully-qualified URL for this resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * Resource policy for persistent disks for creating snapshots.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ResourcePolicySnapshotSchedulePolicy snapshotSchedulePolicy;

  /**
   * [Output Only] The status of resource policy creation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String status;

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * @return value or {@code null} for none
   */
  public java.lang.String getCreationTimestamp() {
    return creationTimestamp;
  }

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * @param creationTimestamp creationTimestamp or {@code null} for none
   */
  public ResourcePolicy setCreationTimestamp(java.lang.String creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * @param description description or {@code null} for none
   */
  public ResourcePolicy setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getId() {
    return id;
  }

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * @param id id or {@code null} for none
   */
  public ResourcePolicy setId(java.math.BigInteger id) {
    this.id = id;
    return this;
  }

  /**
   * [Output Only] Type of the resource. Always compute#resource_policies for resource policies.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * [Output Only] Type of the resource. Always compute#resource_policies for resource policies.
   * @param kind kind or {@code null} for none
   */
  public ResourcePolicy setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The name of the resource, provided by the client when initially creating the resource. The
   * resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name
   * must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`
   * which means the first character must be a lowercase letter, and all following characters must
   * be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of the resource, provided by the client when initially creating the resource. The
   * resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name
   * must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`
   * which means the first character must be a lowercase letter, and all following characters must
   * be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
   * @param name name or {@code null} for none
   */
  public ResourcePolicy setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getRegion() {
    return region;
  }

  /**
   * @param region region or {@code null} for none
   */
  public ResourcePolicy setRegion(java.lang.String region) {
    this.region = region;
    return this;
  }

  /**
   * [Output Only] Server-defined fully-qualified URL for this resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * [Output Only] Server-defined fully-qualified URL for this resource.
   * @param selfLink selfLink or {@code null} for none
   */
  public ResourcePolicy setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * Resource policy for persistent disks for creating snapshots.
   * @return value or {@code null} for none
   */
  public ResourcePolicySnapshotSchedulePolicy getSnapshotSchedulePolicy() {
    return snapshotSchedulePolicy;
  }

  /**
   * Resource policy for persistent disks for creating snapshots.
   * @param snapshotSchedulePolicy snapshotSchedulePolicy or {@code null} for none
   */
  public ResourcePolicy setSnapshotSchedulePolicy(ResourcePolicySnapshotSchedulePolicy snapshotSchedulePolicy) {
    this.snapshotSchedulePolicy = snapshotSchedulePolicy;
    return this;
  }

  /**
   * [Output Only] The status of resource policy creation.
   * @return value or {@code null} for none
   */
  public java.lang.String getStatus() {
    return status;
  }

  /**
   * [Output Only] The status of resource policy creation.
   * @param status status or {@code null} for none
   */
  public ResourcePolicy setStatus(java.lang.String status) {
    this.status = status;
    return this;
  }

  @Override
  public ResourcePolicy set(String fieldName, Object value) {
    return (ResourcePolicy) super.set(fieldName, value);
  }

  @Override
  public ResourcePolicy clone() {
    return (ResourcePolicy) super.clone();
  }

}
