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

package com.google.api.services.androidpublisher.model;

/**
 * Model definition for ApksAddExternallyHostedResponse.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play Developer API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ApksAddExternallyHostedResponse extends com.google.api.client.json.GenericJson {

  /**
   * The definition of the externally-hosted APK and where it is located.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ExternallyHostedApk externallyHostedApk;

  /**
   * The definition of the externally-hosted APK and where it is located.
   * @return value or {@code null} for none
   */
  public ExternallyHostedApk getExternallyHostedApk() {
    return externallyHostedApk;
  }

  /**
   * The definition of the externally-hosted APK and where it is located.
   * @param externallyHostedApk externallyHostedApk or {@code null} for none
   */
  public ApksAddExternallyHostedResponse setExternallyHostedApk(ExternallyHostedApk externallyHostedApk) {
    this.externallyHostedApk = externallyHostedApk;
    return this;
  }

  @Override
  public ApksAddExternallyHostedResponse set(String fieldName, Object value) {
    return (ApksAddExternallyHostedResponse) super.set(fieldName, value);
  }

  @Override
  public ApksAddExternallyHostedResponse clone() {
    return (ApksAddExternallyHostedResponse) super.clone();
  }

}
