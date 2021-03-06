// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: opentelemetry/proto/logs/v1/logs.proto

package com.opentelemetry.proto.logs.v1;

public interface ScopeLogsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opentelemetry.proto.logs.v1.ScopeLogs)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The instrumentation scope information for the logs in this message.
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
   * The instrumentation scope information for the logs in this message.
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
   * The instrumentation scope information for the logs in this message.
   * Semantically when InstrumentationScope isn't set, it is equivalent with
   * an empty instrumentation scope name (unknown).
   * </pre>
   *
   * <code>.opentelemetry.proto.common.v1.InstrumentationScope scope = 1 [json_name = "scope"];</code>
   */
  com.opentelemetry.proto.common.v1.InstrumentationScopeOrBuilder getScopeOrBuilder();

  /**
   * <pre>
   * A list of log records.
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.logs.v1.LogRecord log_records = 2 [json_name = "logRecords"];</code>
   */
  java.util.List<com.opentelemetry.proto.logs.v1.LogRecord> 
      getLogRecordsList();
  /**
   * <pre>
   * A list of log records.
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.logs.v1.LogRecord log_records = 2 [json_name = "logRecords"];</code>
   */
  com.opentelemetry.proto.logs.v1.LogRecord getLogRecords(int index);
  /**
   * <pre>
   * A list of log records.
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.logs.v1.LogRecord log_records = 2 [json_name = "logRecords"];</code>
   */
  int getLogRecordsCount();
  /**
   * <pre>
   * A list of log records.
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.logs.v1.LogRecord log_records = 2 [json_name = "logRecords"];</code>
   */
  java.util.List<? extends com.opentelemetry.proto.logs.v1.LogRecordOrBuilder> 
      getLogRecordsOrBuilderList();
  /**
   * <pre>
   * A list of log records.
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.logs.v1.LogRecord log_records = 2 [json_name = "logRecords"];</code>
   */
  com.opentelemetry.proto.logs.v1.LogRecordOrBuilder getLogRecordsOrBuilder(
      int index);

  /**
   * <pre>
   * This schema_url applies to all logs in the "logs" field.
   * </pre>
   *
   * <code>string schema_url = 3 [json_name = "schemaUrl"];</code>
   * @return The schemaUrl.
   */
  java.lang.String getSchemaUrl();
  /**
   * <pre>
   * This schema_url applies to all logs in the "logs" field.
   * </pre>
   *
   * <code>string schema_url = 3 [json_name = "schemaUrl"];</code>
   * @return The bytes for schemaUrl.
   */
  com.google.protobuf.ByteString
      getSchemaUrlBytes();
}
