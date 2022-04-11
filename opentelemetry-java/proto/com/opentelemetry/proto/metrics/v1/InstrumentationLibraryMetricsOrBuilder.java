// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: opentelemetry/proto/metrics/v1/metrics.proto

package com.opentelemetry.proto.metrics.v1;

@java.lang.Deprecated public interface InstrumentationLibraryMetricsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opentelemetry.proto.metrics.v1.InstrumentationLibraryMetrics)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The instrumentation library information for the metrics in this message.
   * Semantically when InstrumentationLibrary isn't set, it is equivalent with
   * an empty instrumentation library name (unknown).
   * </pre>
   *
   * <code>.opentelemetry.proto.common.v1.InstrumentationLibrary instrumentation_library = 1 [json_name = "instrumentationLibrary"];</code>
   * @return Whether the instrumentationLibrary field is set.
   */
  boolean hasInstrumentationLibrary();
  /**
   * <pre>
   * The instrumentation library information for the metrics in this message.
   * Semantically when InstrumentationLibrary isn't set, it is equivalent with
   * an empty instrumentation library name (unknown).
   * </pre>
   *
   * <code>.opentelemetry.proto.common.v1.InstrumentationLibrary instrumentation_library = 1 [json_name = "instrumentationLibrary"];</code>
   * @return The instrumentationLibrary.
   */
  com.opentelemetry.proto.common.v1.InstrumentationLibrary getInstrumentationLibrary();
  /**
   * <pre>
   * The instrumentation library information for the metrics in this message.
   * Semantically when InstrumentationLibrary isn't set, it is equivalent with
   * an empty instrumentation library name (unknown).
   * </pre>
   *
   * <code>.opentelemetry.proto.common.v1.InstrumentationLibrary instrumentation_library = 1 [json_name = "instrumentationLibrary"];</code>
   */
  com.opentelemetry.proto.common.v1.InstrumentationLibraryOrBuilder getInstrumentationLibraryOrBuilder();

  /**
   * <pre>
   * A list of metrics that originate from an instrumentation library.
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.metrics.v1.Metric metrics = 2 [json_name = "metrics"];</code>
   */
  java.util.List<com.opentelemetry.proto.metrics.v1.Metric> 
      getMetricsList();
  /**
   * <pre>
   * A list of metrics that originate from an instrumentation library.
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.metrics.v1.Metric metrics = 2 [json_name = "metrics"];</code>
   */
  com.opentelemetry.proto.metrics.v1.Metric getMetrics(int index);
  /**
   * <pre>
   * A list of metrics that originate from an instrumentation library.
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.metrics.v1.Metric metrics = 2 [json_name = "metrics"];</code>
   */
  int getMetricsCount();
  /**
   * <pre>
   * A list of metrics that originate from an instrumentation library.
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.metrics.v1.Metric metrics = 2 [json_name = "metrics"];</code>
   */
  java.util.List<? extends com.opentelemetry.proto.metrics.v1.MetricOrBuilder> 
      getMetricsOrBuilderList();
  /**
   * <pre>
   * A list of metrics that originate from an instrumentation library.
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.metrics.v1.Metric metrics = 2 [json_name = "metrics"];</code>
   */
  com.opentelemetry.proto.metrics.v1.MetricOrBuilder getMetricsOrBuilder(
      int index);

  /**
   * <pre>
   * This schema_url applies to all metrics in the "metrics" field.
   * </pre>
   *
   * <code>string schema_url = 3 [json_name = "schemaUrl"];</code>
   * @return The schemaUrl.
   */
  java.lang.String getSchemaUrl();
  /**
   * <pre>
   * This schema_url applies to all metrics in the "metrics" field.
   * </pre>
   *
   * <code>string schema_url = 3 [json_name = "schemaUrl"];</code>
   * @return The bytes for schemaUrl.
   */
  com.google.protobuf.ByteString
      getSchemaUrlBytes();
}