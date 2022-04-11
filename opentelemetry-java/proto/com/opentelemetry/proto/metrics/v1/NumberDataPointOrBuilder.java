// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: opentelemetry/proto/metrics/v1/metrics.proto

package com.opentelemetry.proto.metrics.v1;

public interface NumberDataPointOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opentelemetry.proto.metrics.v1.NumberDataPoint)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The set of key/value pairs that uniquely identify the timeseries from
   * where this point belongs. The list may be empty (may contain 0 elements).
   * Attribute keys MUST be unique (it is not allowed to have more than one
   * attribute with the same key).
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.common.v1.KeyValue attributes = 7 [json_name = "attributes"];</code>
   */
  java.util.List<com.opentelemetry.proto.common.v1.KeyValue> 
      getAttributesList();
  /**
   * <pre>
   * The set of key/value pairs that uniquely identify the timeseries from
   * where this point belongs. The list may be empty (may contain 0 elements).
   * Attribute keys MUST be unique (it is not allowed to have more than one
   * attribute with the same key).
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.common.v1.KeyValue attributes = 7 [json_name = "attributes"];</code>
   */
  com.opentelemetry.proto.common.v1.KeyValue getAttributes(int index);
  /**
   * <pre>
   * The set of key/value pairs that uniquely identify the timeseries from
   * where this point belongs. The list may be empty (may contain 0 elements).
   * Attribute keys MUST be unique (it is not allowed to have more than one
   * attribute with the same key).
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.common.v1.KeyValue attributes = 7 [json_name = "attributes"];</code>
   */
  int getAttributesCount();
  /**
   * <pre>
   * The set of key/value pairs that uniquely identify the timeseries from
   * where this point belongs. The list may be empty (may contain 0 elements).
   * Attribute keys MUST be unique (it is not allowed to have more than one
   * attribute with the same key).
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.common.v1.KeyValue attributes = 7 [json_name = "attributes"];</code>
   */
  java.util.List<? extends com.opentelemetry.proto.common.v1.KeyValueOrBuilder> 
      getAttributesOrBuilderList();
  /**
   * <pre>
   * The set of key/value pairs that uniquely identify the timeseries from
   * where this point belongs. The list may be empty (may contain 0 elements).
   * Attribute keys MUST be unique (it is not allowed to have more than one
   * attribute with the same key).
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.common.v1.KeyValue attributes = 7 [json_name = "attributes"];</code>
   */
  com.opentelemetry.proto.common.v1.KeyValueOrBuilder getAttributesOrBuilder(
      int index);

  /**
   * <pre>
   * StartTimeUnixNano is optional but strongly encouraged, see the
   * the detailed comments above Metric.
   * Value is UNIX Epoch time in nanoseconds since 00:00:00 UTC on 1 January
   * 1970.
   * </pre>
   *
   * <code>fixed64 start_time_unix_nano = 2 [json_name = "startTimeUnixNano"];</code>
   * @return The startTimeUnixNano.
   */
  long getStartTimeUnixNano();

  /**
   * <pre>
   * TimeUnixNano is required, see the detailed comments above Metric.
   * Value is UNIX Epoch time in nanoseconds since 00:00:00 UTC on 1 January
   * 1970.
   * </pre>
   *
   * <code>fixed64 time_unix_nano = 3 [json_name = "timeUnixNano"];</code>
   * @return The timeUnixNano.
   */
  long getTimeUnixNano();

  /**
   * <code>double as_double = 4 [json_name = "asDouble"];</code>
   * @return Whether the asDouble field is set.
   */
  boolean hasAsDouble();
  /**
   * <code>double as_double = 4 [json_name = "asDouble"];</code>
   * @return The asDouble.
   */
  double getAsDouble();

  /**
   * <code>sfixed64 as_int = 6 [json_name = "asInt"];</code>
   * @return Whether the asInt field is set.
   */
  boolean hasAsInt();
  /**
   * <code>sfixed64 as_int = 6 [json_name = "asInt"];</code>
   * @return The asInt.
   */
  long getAsInt();

  /**
   * <pre>
   * (Optional) List of exemplars collected from
   * measurements that were used to form the data point
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.metrics.v1.Exemplar exemplars = 5 [json_name = "exemplars"];</code>
   */
  java.util.List<com.opentelemetry.proto.metrics.v1.Exemplar> 
      getExemplarsList();
  /**
   * <pre>
   * (Optional) List of exemplars collected from
   * measurements that were used to form the data point
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.metrics.v1.Exemplar exemplars = 5 [json_name = "exemplars"];</code>
   */
  com.opentelemetry.proto.metrics.v1.Exemplar getExemplars(int index);
  /**
   * <pre>
   * (Optional) List of exemplars collected from
   * measurements that were used to form the data point
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.metrics.v1.Exemplar exemplars = 5 [json_name = "exemplars"];</code>
   */
  int getExemplarsCount();
  /**
   * <pre>
   * (Optional) List of exemplars collected from
   * measurements that were used to form the data point
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.metrics.v1.Exemplar exemplars = 5 [json_name = "exemplars"];</code>
   */
  java.util.List<? extends com.opentelemetry.proto.metrics.v1.ExemplarOrBuilder> 
      getExemplarsOrBuilderList();
  /**
   * <pre>
   * (Optional) List of exemplars collected from
   * measurements that were used to form the data point
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.metrics.v1.Exemplar exemplars = 5 [json_name = "exemplars"];</code>
   */
  com.opentelemetry.proto.metrics.v1.ExemplarOrBuilder getExemplarsOrBuilder(
      int index);

  /**
   * <pre>
   * Flags that apply to this specific data point.  See DataPointFlags
   * for the available flags and their meaning.
   * </pre>
   *
   * <code>uint32 flags = 8 [json_name = "flags"];</code>
   * @return The flags.
   */
  int getFlags();

  public com.opentelemetry.proto.metrics.v1.NumberDataPoint.ValueCase getValueCase();
}