// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: opentelemetry/proto/logs/v1/logs.proto

package com.opentelemetry.proto.logs.v1;

public interface ResourceLogsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opentelemetry.proto.logs.v1.ResourceLogs)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource for the logs in this message.
   * If this field is not set then resource info is unknown.
   * </pre>
   *
   * <code>.opentelemetry.proto.resource.v1.Resource resource = 1 [json_name = "resource"];</code>
   * @return Whether the resource field is set.
   */
  boolean hasResource();
  /**
   * <pre>
   * The resource for the logs in this message.
   * If this field is not set then resource info is unknown.
   * </pre>
   *
   * <code>.opentelemetry.proto.resource.v1.Resource resource = 1 [json_name = "resource"];</code>
   * @return The resource.
   */
  com.opentelemetry.proto.resource.v1.Resource getResource();
  /**
   * <pre>
   * The resource for the logs in this message.
   * If this field is not set then resource info is unknown.
   * </pre>
   *
   * <code>.opentelemetry.proto.resource.v1.Resource resource = 1 [json_name = "resource"];</code>
   */
  com.opentelemetry.proto.resource.v1.ResourceOrBuilder getResourceOrBuilder();

  /**
   * <pre>
   * A list of ScopeLogs that originate from a resource.
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.logs.v1.ScopeLogs scope_logs = 2 [json_name = "scopeLogs"];</code>
   */
  java.util.List<com.opentelemetry.proto.logs.v1.ScopeLogs> 
      getScopeLogsList();
  /**
   * <pre>
   * A list of ScopeLogs that originate from a resource.
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.logs.v1.ScopeLogs scope_logs = 2 [json_name = "scopeLogs"];</code>
   */
  com.opentelemetry.proto.logs.v1.ScopeLogs getScopeLogs(int index);
  /**
   * <pre>
   * A list of ScopeLogs that originate from a resource.
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.logs.v1.ScopeLogs scope_logs = 2 [json_name = "scopeLogs"];</code>
   */
  int getScopeLogsCount();
  /**
   * <pre>
   * A list of ScopeLogs that originate from a resource.
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.logs.v1.ScopeLogs scope_logs = 2 [json_name = "scopeLogs"];</code>
   */
  java.util.List<? extends com.opentelemetry.proto.logs.v1.ScopeLogsOrBuilder> 
      getScopeLogsOrBuilderList();
  /**
   * <pre>
   * A list of ScopeLogs that originate from a resource.
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.logs.v1.ScopeLogs scope_logs = 2 [json_name = "scopeLogs"];</code>
   */
  com.opentelemetry.proto.logs.v1.ScopeLogsOrBuilder getScopeLogsOrBuilder(
      int index);

  /**
   * <pre>
   * A list of InstrumentationLibraryLogs that originate from a resource.
   * This field is deprecated and will be removed after grace period expires on June 15, 2022.
   * During the grace period the following rules SHOULD be followed:
   * For Binary Protobufs
   * ====================
   * Binary Protobuf senders SHOULD NOT set instrumentation_library_logs. Instead
   * scope_logs SHOULD be set.
   * Binary Protobuf receivers SHOULD check if instrumentation_library_logs is set
   * and scope_logs is not set then the value in instrumentation_library_logs
   * SHOULD be used instead by converting InstrumentationLibraryLogs into ScopeLogs.
   * If scope_logs is set then instrumentation_library_logs SHOULD be ignored.
   * For JSON
   * ========
   * JSON senders that set instrumentation_library_logs field MAY also set
   * scope_logs to carry the same logs, essentially double-publishing the same data.
   * Such double-publishing MAY be controlled by a user-settable option.
   * If double-publishing is not used then the senders SHOULD set scope_logs and
   * SHOULD NOT set instrumentation_library_logs.
   * JSON receivers SHOULD check if instrumentation_library_logs is set and
   * scope_logs is not set then the value in instrumentation_library_logs
   * SHOULD be used instead by converting InstrumentationLibraryLogs into ScopeLogs.
   * If scope_logs is set then instrumentation_library_logs field SHOULD be ignored.
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.logs.v1.InstrumentationLibraryLogs instrumentation_library_logs = 1000 [json_name = "instrumentationLibraryLogs", deprecated = true];</code>
   */
  @java.lang.Deprecated java.util.List<com.opentelemetry.proto.logs.v1.InstrumentationLibraryLogs> 
      getInstrumentationLibraryLogsList();
  /**
   * <pre>
   * A list of InstrumentationLibraryLogs that originate from a resource.
   * This field is deprecated and will be removed after grace period expires on June 15, 2022.
   * During the grace period the following rules SHOULD be followed:
   * For Binary Protobufs
   * ====================
   * Binary Protobuf senders SHOULD NOT set instrumentation_library_logs. Instead
   * scope_logs SHOULD be set.
   * Binary Protobuf receivers SHOULD check if instrumentation_library_logs is set
   * and scope_logs is not set then the value in instrumentation_library_logs
   * SHOULD be used instead by converting InstrumentationLibraryLogs into ScopeLogs.
   * If scope_logs is set then instrumentation_library_logs SHOULD be ignored.
   * For JSON
   * ========
   * JSON senders that set instrumentation_library_logs field MAY also set
   * scope_logs to carry the same logs, essentially double-publishing the same data.
   * Such double-publishing MAY be controlled by a user-settable option.
   * If double-publishing is not used then the senders SHOULD set scope_logs and
   * SHOULD NOT set instrumentation_library_logs.
   * JSON receivers SHOULD check if instrumentation_library_logs is set and
   * scope_logs is not set then the value in instrumentation_library_logs
   * SHOULD be used instead by converting InstrumentationLibraryLogs into ScopeLogs.
   * If scope_logs is set then instrumentation_library_logs field SHOULD be ignored.
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.logs.v1.InstrumentationLibraryLogs instrumentation_library_logs = 1000 [json_name = "instrumentationLibraryLogs", deprecated = true];</code>
   */
  @java.lang.Deprecated com.opentelemetry.proto.logs.v1.InstrumentationLibraryLogs getInstrumentationLibraryLogs(int index);
  /**
   * <pre>
   * A list of InstrumentationLibraryLogs that originate from a resource.
   * This field is deprecated and will be removed after grace period expires on June 15, 2022.
   * During the grace period the following rules SHOULD be followed:
   * For Binary Protobufs
   * ====================
   * Binary Protobuf senders SHOULD NOT set instrumentation_library_logs. Instead
   * scope_logs SHOULD be set.
   * Binary Protobuf receivers SHOULD check if instrumentation_library_logs is set
   * and scope_logs is not set then the value in instrumentation_library_logs
   * SHOULD be used instead by converting InstrumentationLibraryLogs into ScopeLogs.
   * If scope_logs is set then instrumentation_library_logs SHOULD be ignored.
   * For JSON
   * ========
   * JSON senders that set instrumentation_library_logs field MAY also set
   * scope_logs to carry the same logs, essentially double-publishing the same data.
   * Such double-publishing MAY be controlled by a user-settable option.
   * If double-publishing is not used then the senders SHOULD set scope_logs and
   * SHOULD NOT set instrumentation_library_logs.
   * JSON receivers SHOULD check if instrumentation_library_logs is set and
   * scope_logs is not set then the value in instrumentation_library_logs
   * SHOULD be used instead by converting InstrumentationLibraryLogs into ScopeLogs.
   * If scope_logs is set then instrumentation_library_logs field SHOULD be ignored.
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.logs.v1.InstrumentationLibraryLogs instrumentation_library_logs = 1000 [json_name = "instrumentationLibraryLogs", deprecated = true];</code>
   */
  @java.lang.Deprecated int getInstrumentationLibraryLogsCount();
  /**
   * <pre>
   * A list of InstrumentationLibraryLogs that originate from a resource.
   * This field is deprecated and will be removed after grace period expires on June 15, 2022.
   * During the grace period the following rules SHOULD be followed:
   * For Binary Protobufs
   * ====================
   * Binary Protobuf senders SHOULD NOT set instrumentation_library_logs. Instead
   * scope_logs SHOULD be set.
   * Binary Protobuf receivers SHOULD check if instrumentation_library_logs is set
   * and scope_logs is not set then the value in instrumentation_library_logs
   * SHOULD be used instead by converting InstrumentationLibraryLogs into ScopeLogs.
   * If scope_logs is set then instrumentation_library_logs SHOULD be ignored.
   * For JSON
   * ========
   * JSON senders that set instrumentation_library_logs field MAY also set
   * scope_logs to carry the same logs, essentially double-publishing the same data.
   * Such double-publishing MAY be controlled by a user-settable option.
   * If double-publishing is not used then the senders SHOULD set scope_logs and
   * SHOULD NOT set instrumentation_library_logs.
   * JSON receivers SHOULD check if instrumentation_library_logs is set and
   * scope_logs is not set then the value in instrumentation_library_logs
   * SHOULD be used instead by converting InstrumentationLibraryLogs into ScopeLogs.
   * If scope_logs is set then instrumentation_library_logs field SHOULD be ignored.
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.logs.v1.InstrumentationLibraryLogs instrumentation_library_logs = 1000 [json_name = "instrumentationLibraryLogs", deprecated = true];</code>
   */
  @java.lang.Deprecated java.util.List<? extends com.opentelemetry.proto.logs.v1.InstrumentationLibraryLogsOrBuilder> 
      getInstrumentationLibraryLogsOrBuilderList();
  /**
   * <pre>
   * A list of InstrumentationLibraryLogs that originate from a resource.
   * This field is deprecated and will be removed after grace period expires on June 15, 2022.
   * During the grace period the following rules SHOULD be followed:
   * For Binary Protobufs
   * ====================
   * Binary Protobuf senders SHOULD NOT set instrumentation_library_logs. Instead
   * scope_logs SHOULD be set.
   * Binary Protobuf receivers SHOULD check if instrumentation_library_logs is set
   * and scope_logs is not set then the value in instrumentation_library_logs
   * SHOULD be used instead by converting InstrumentationLibraryLogs into ScopeLogs.
   * If scope_logs is set then instrumentation_library_logs SHOULD be ignored.
   * For JSON
   * ========
   * JSON senders that set instrumentation_library_logs field MAY also set
   * scope_logs to carry the same logs, essentially double-publishing the same data.
   * Such double-publishing MAY be controlled by a user-settable option.
   * If double-publishing is not used then the senders SHOULD set scope_logs and
   * SHOULD NOT set instrumentation_library_logs.
   * JSON receivers SHOULD check if instrumentation_library_logs is set and
   * scope_logs is not set then the value in instrumentation_library_logs
   * SHOULD be used instead by converting InstrumentationLibraryLogs into ScopeLogs.
   * If scope_logs is set then instrumentation_library_logs field SHOULD be ignored.
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.logs.v1.InstrumentationLibraryLogs instrumentation_library_logs = 1000 [json_name = "instrumentationLibraryLogs", deprecated = true];</code>
   */
  @java.lang.Deprecated com.opentelemetry.proto.logs.v1.InstrumentationLibraryLogsOrBuilder getInstrumentationLibraryLogsOrBuilder(
      int index);

  /**
   * <pre>
   * This schema_url applies to the data in the "resource" field. It does not apply
   * to the data in the "scope_logs" field which have their own schema_url field.
   * </pre>
   *
   * <code>string schema_url = 3 [json_name = "schemaUrl"];</code>
   * @return The schemaUrl.
   */
  java.lang.String getSchemaUrl();
  /**
   * <pre>
   * This schema_url applies to the data in the "resource" field. It does not apply
   * to the data in the "scope_logs" field which have their own schema_url field.
   * </pre>
   *
   * <code>string schema_url = 3 [json_name = "schemaUrl"];</code>
   * @return The bytes for schemaUrl.
   */
  com.google.protobuf.ByteString
      getSchemaUrlBytes();
}
