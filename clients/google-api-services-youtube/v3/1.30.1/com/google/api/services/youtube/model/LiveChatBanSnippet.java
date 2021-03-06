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

package com.google.api.services.youtube.model;

/**
 * Model definition for LiveChatBanSnippet.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the YouTube Data API v3. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class LiveChatBanSnippet extends com.google.api.client.json.GenericJson {

  /**
   * The duration of a ban, only filled if the ban has type TEMPORARY.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger banDurationSeconds;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ChannelProfileDetails bannedUserDetails;

  /**
   * The chat this ban is pertinent to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String liveChatId;

  /**
   * The type of ban.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * The duration of a ban, only filled if the ban has type TEMPORARY.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getBanDurationSeconds() {
    return banDurationSeconds;
  }

  /**
   * The duration of a ban, only filled if the ban has type TEMPORARY.
   * @param banDurationSeconds banDurationSeconds or {@code null} for none
   */
  public LiveChatBanSnippet setBanDurationSeconds(java.math.BigInteger banDurationSeconds) {
    this.banDurationSeconds = banDurationSeconds;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public ChannelProfileDetails getBannedUserDetails() {
    return bannedUserDetails;
  }

  /**
   * @param bannedUserDetails bannedUserDetails or {@code null} for none
   */
  public LiveChatBanSnippet setBannedUserDetails(ChannelProfileDetails bannedUserDetails) {
    this.bannedUserDetails = bannedUserDetails;
    return this;
  }

  /**
   * The chat this ban is pertinent to.
   * @return value or {@code null} for none
   */
  public java.lang.String getLiveChatId() {
    return liveChatId;
  }

  /**
   * The chat this ban is pertinent to.
   * @param liveChatId liveChatId or {@code null} for none
   */
  public LiveChatBanSnippet setLiveChatId(java.lang.String liveChatId) {
    this.liveChatId = liveChatId;
    return this;
  }

  /**
   * The type of ban.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The type of ban.
   * @param type type or {@code null} for none
   */
  public LiveChatBanSnippet setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public LiveChatBanSnippet set(String fieldName, Object value) {
    return (LiveChatBanSnippet) super.set(fieldName, value);
  }

  @Override
  public LiveChatBanSnippet clone() {
    return (LiveChatBanSnippet) super.clone();
  }

}
