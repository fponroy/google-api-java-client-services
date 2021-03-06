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
 * Message containing connection draining configuration.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ConnectionDraining extends com.google.api.client.json.GenericJson {

  /**
   * Configures a duration timeout for existing requests on a removed backend instance. For
   * supported load balancers and protocols, as described in Enabling connection draining.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer drainingTimeoutSec;

  /**
   * Configures a duration timeout for existing requests on a removed backend instance. For
   * supported load balancers and protocols, as described in Enabling connection draining.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getDrainingTimeoutSec() {
    return drainingTimeoutSec;
  }

  /**
   * Configures a duration timeout for existing requests on a removed backend instance. For
   * supported load balancers and protocols, as described in Enabling connection draining.
   * @param drainingTimeoutSec drainingTimeoutSec or {@code null} for none
   */
  public ConnectionDraining setDrainingTimeoutSec(java.lang.Integer drainingTimeoutSec) {
    this.drainingTimeoutSec = drainingTimeoutSec;
    return this;
  }

  @Override
  public ConnectionDraining set(String fieldName, Object value) {
    return (ConnectionDraining) super.set(fieldName, value);
  }

  @Override
  public ConnectionDraining clone() {
    return (ConnectionDraining) super.clone();
  }

}
