// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: opentelemetry/proto/metrics/v1/metrics.proto

package com.opentelemetry.proto.metrics.v1;

public interface ScopeMetricsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opentelemetry.proto.metrics.v1.ScopeMetrics)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The instrumentation scope information for the metrics in this message.
   * Semantically when InstrumentationScope isn't set, it is equivalent with
   * an empty instrumentation scope name (unknown).
   * </pre>
   *
   * <code>.opentelemetry.proto.common.v1.InstrumentationScope scope = 1 [json_name = "scope"];</code>
   * @return Whether the scope field is set.
   */
  boolean hasScope();
  /**
   * <pre>
   * The instrumentation scope information for the metrics in this message.
   * Semantically when InstrumentationScope isn't set, it is equivalent with
   * an empty instrumentation scope name (unknown).
   * </pre>
   *
   * <code>.opentelemetry.proto.common.v1.InstrumentationScope scope = 1 [json_name = "scope"];</code>
   * @return The scope.
   */
  com.opentelemetry.proto.common.v1.InstrumentationScope getScope();
  /**
   * <pre>
   * The instrumentation scope information for the metrics in this message.
   * Semantically when InstrumentationScope isn't set, it is equivalent with
   * an empty instrumentation scope name (unknown).
   * </pre>
   *
   * <code>.opentelemetry.proto.common.v1.InstrumentationScope scope = 1 [json_name = "scope"];</code>
   */
  com.opentelemetry.proto.common.v1.InstrumentationScopeOrBuilder getScopeOrBuilder();

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
