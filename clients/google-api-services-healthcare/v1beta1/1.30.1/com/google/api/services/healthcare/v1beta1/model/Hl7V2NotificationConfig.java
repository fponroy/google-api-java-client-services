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

package com.google.api.services.healthcare.v1beta1.model;

/**
 * Specifies where and whether to send notifications upon changes to a data store.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Healthcare API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Hl7V2NotificationConfig extends com.google.api.client.json.GenericJson {

  /**
   * Restricts notifications sent for messages matching a filter. If this is empty, all messages are
   * matched. Syntax: https://cloud.google.com/appengine/docs/standard/python/search/query_strings
   *
   * Fields/functions available for filtering are:
   *
   * *  `message_type`, from the MSH-9.1 field. For example, `NOT message_type = "ADT"`. *
   * `send_date` or `sendDate`, the YYYY-MM-DD date the message was sent in the dataset's time_zone,
   * from the MSH-7 segment. For example, `send_date < "2017-01-02"`. *  `send_time`, the timestamp
   * when the message was sent, using the RFC3339 time format for comparisons, from the MSH-7
   * segment. For example, `send_time < "2017-01-02T00:00:00-05:00"`. *  `send_facility`, the care
   * center that the message came from, from the MSH-4 segment. For example, `send_facility =
   * "ABC"`. *  `PatientId(value, type)`, which matches if the message lists a patient having an ID
   * of the given value and type in the PID-2, PID-3, or PID-4 segments. For example,
   * `PatientId("123456", "MRN")`. *  `labels.x`, a string value of the label with key `x` as set
   * using the Message.labels map. For example, `labels."priority"="high"`. The operator `:*` can be
   * used to assert the existence of a label. For example, `labels."priority":*`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String filter;

  /**
   * The [Cloud Pubsub](https://cloud.google.com/pubsub/docs/) topic that notifications of changes
   * are published on. Supplied by the client. The notification is a `PubsubMessage` with the
   * following fields:
   *
   * *  `PubsubMessage.Data` contains the resource name. *  `PubsubMessage.MessageId` is the ID of
   * this notification. It is guaranteed to be unique within the topic. *
   * `PubsubMessage.PublishTime` is the time at which the message was published.
   *
   * Note that notifications are only sent if the topic is non-empty. [Topic
   * names](https://cloud.google.com/pubsub/docs/overview#names) must be scoped to a project. cloud-
   * healthcare@system.gserviceaccount.com must have publisher permissions on the given Pubsub
   * topic. Not having adequate permissions causes the calls that send notifications to fail.
   *
   * If a notification cannot be published to Cloud Pub/Sub, errors will be logged to Stackdriver
   * (see [Viewing logs](/healthcare/docs/how- tos/stackdriver-logging)).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pubsubTopic;

  /**
   * Restricts notifications sent for messages matching a filter. If this is empty, all messages are
   * matched. Syntax: https://cloud.google.com/appengine/docs/standard/python/search/query_strings
   *
   * Fields/functions available for filtering are:
   *
   * *  `message_type`, from the MSH-9.1 field. For example, `NOT message_type = "ADT"`. *
   * `send_date` or `sendDate`, the YYYY-MM-DD date the message was sent in the dataset's time_zone,
   * from the MSH-7 segment. For example, `send_date < "2017-01-02"`. *  `send_time`, the timestamp
   * when the message was sent, using the RFC3339 time format for comparisons, from the MSH-7
   * segment. For example, `send_time < "2017-01-02T00:00:00-05:00"`. *  `send_facility`, the care
   * center that the message came from, from the MSH-4 segment. For example, `send_facility =
   * "ABC"`. *  `PatientId(value, type)`, which matches if the message lists a patient having an ID
   * of the given value and type in the PID-2, PID-3, or PID-4 segments. For example,
   * `PatientId("123456", "MRN")`. *  `labels.x`, a string value of the label with key `x` as set
   * using the Message.labels map. For example, `labels."priority"="high"`. The operator `:*` can be
   * used to assert the existence of a label. For example, `labels."priority":*`.
   * @return value or {@code null} for none
   */
  public java.lang.String getFilter() {
    return filter;
  }

  /**
   * Restricts notifications sent for messages matching a filter. If this is empty, all messages are
   * matched. Syntax: https://cloud.google.com/appengine/docs/standard/python/search/query_strings
   *
   * Fields/functions available for filtering are:
   *
   * *  `message_type`, from the MSH-9.1 field. For example, `NOT message_type = "ADT"`. *
   * `send_date` or `sendDate`, the YYYY-MM-DD date the message was sent in the dataset's time_zone,
   * from the MSH-7 segment. For example, `send_date < "2017-01-02"`. *  `send_time`, the timestamp
   * when the message was sent, using the RFC3339 time format for comparisons, from the MSH-7
   * segment. For example, `send_time < "2017-01-02T00:00:00-05:00"`. *  `send_facility`, the care
   * center that the message came from, from the MSH-4 segment. For example, `send_facility =
   * "ABC"`. *  `PatientId(value, type)`, which matches if the message lists a patient having an ID
   * of the given value and type in the PID-2, PID-3, or PID-4 segments. For example,
   * `PatientId("123456", "MRN")`. *  `labels.x`, a string value of the label with key `x` as set
   * using the Message.labels map. For example, `labels."priority"="high"`. The operator `:*` can be
   * used to assert the existence of a label. For example, `labels."priority":*`.
   * @param filter filter or {@code null} for none
   */
  public Hl7V2NotificationConfig setFilter(java.lang.String filter) {
    this.filter = filter;
    return this;
  }

  /**
   * The [Cloud Pubsub](https://cloud.google.com/pubsub/docs/) topic that notifications of changes
   * are published on. Supplied by the client. The notification is a `PubsubMessage` with the
   * following fields:
   *
   * *  `PubsubMessage.Data` contains the resource name. *  `PubsubMessage.MessageId` is the ID of
   * this notification. It is guaranteed to be unique within the topic. *
   * `PubsubMessage.PublishTime` is the time at which the message was published.
   *
   * Note that notifications are only sent if the topic is non-empty. [Topic
   * names](https://cloud.google.com/pubsub/docs/overview#names) must be scoped to a project. cloud-
   * healthcare@system.gserviceaccount.com must have publisher permissions on the given Pubsub
   * topic. Not having adequate permissions causes the calls that send notifications to fail.
   *
   * If a notification cannot be published to Cloud Pub/Sub, errors will be logged to Stackdriver
   * (see [Viewing logs](/healthcare/docs/how- tos/stackdriver-logging)).
   * @return value or {@code null} for none
   */
  public java.lang.String getPubsubTopic() {
    return pubsubTopic;
  }

  /**
   * The [Cloud Pubsub](https://cloud.google.com/pubsub/docs/) topic that notifications of changes
   * are published on. Supplied by the client. The notification is a `PubsubMessage` with the
   * following fields:
   *
   * *  `PubsubMessage.Data` contains the resource name. *  `PubsubMessage.MessageId` is the ID of
   * this notification. It is guaranteed to be unique within the topic. *
   * `PubsubMessage.PublishTime` is the time at which the message was published.
   *
   * Note that notifications are only sent if the topic is non-empty. [Topic
   * names](https://cloud.google.com/pubsub/docs/overview#names) must be scoped to a project. cloud-
   * healthcare@system.gserviceaccount.com must have publisher permissions on the given Pubsub
   * topic. Not having adequate permissions causes the calls that send notifications to fail.
   *
   * If a notification cannot be published to Cloud Pub/Sub, errors will be logged to Stackdriver
   * (see [Viewing logs](/healthcare/docs/how- tos/stackdriver-logging)).
   * @param pubsubTopic pubsubTopic or {@code null} for none
   */
  public Hl7V2NotificationConfig setPubsubTopic(java.lang.String pubsubTopic) {
    this.pubsubTopic = pubsubTopic;
    return this;
  }

  @Override
  public Hl7V2NotificationConfig set(String fieldName, Object value) {
    return (Hl7V2NotificationConfig) super.set(fieldName, value);
  }

  @Override
  public Hl7V2NotificationConfig clone() {
    return (Hl7V2NotificationConfig) super.clone();
  }

}