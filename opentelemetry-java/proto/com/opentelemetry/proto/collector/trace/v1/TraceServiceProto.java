// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: opentelemetry/proto/collector/trace/v1/trace_service.proto

package com.opentelemetry.proto.collector.trace.v1;

public final class TraceServiceProto {
  private TraceServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opentelemetry_proto_collector_trace_v1_ExportTraceServiceRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opentelemetry_proto_collector_trace_v1_ExportTraceServiceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opentelemetry_proto_collector_trace_v1_ExportTraceServiceResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opentelemetry_proto_collector_trace_v1_ExportTraceServiceResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n:opentelemetry/proto/collector/trace/v1" +
      "/trace_service.proto\022&opentelemetry.prot" +
      "o.collector.trace.v1\032(opentelemetry/prot" +
      "o/trace/v1/trace.proto\"o\n\031ExportTraceSer" +
      "viceRequest\022R\n\016resource_spans\030\001 \003(\0132+.op" +
      "entelemetry.proto.trace.v1.ResourceSpans" +
      "R\rresourceSpans\"\034\n\032ExportTraceServiceRes" +
      "ponse2\242\001\n\014TraceService\022\221\001\n\006Export\022A.open" +
      "telemetry.proto.collector.trace.v1.Expor" +
      "tTraceServiceRequest\032B.opentelemetry.pro" +
      "to.collector.trace.v1.ExportTraceService" +
      "Response\"\000B\257\002\n*com.opentelemetry.proto.c" +
      "ollector.trace.v1B\021TraceServiceProtoP\001Z1" +
      "go.opentelemetry.io/proto/otlp/collector" +
      "/trace/v1\242\002\004OPCT\252\002&Opentelemetry.Proto.C" +
      "ollector.Trace.V1\312\002&Opentelemetry\\Proto\\" +
      "Collector\\Trace\\V1\342\0022Opentelemetry\\Proto" +
      "\\Collector\\Trace\\V1\\GPBMetadata\352\002*Opente" +
      "lemetry::Proto::Collector::Trace::V1b\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.opentelemetry.proto.trace.v1.TraceProto.getDescriptor(),
        });
    internal_static_opentelemetry_proto_collector_trace_v1_ExportTraceServiceRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_opentelemetry_proto_collector_trace_v1_ExportTraceServiceRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opentelemetry_proto_collector_trace_v1_ExportTraceServiceRequest_descriptor,
        new java.lang.String[] { "ResourceSpans", });
    internal_static_opentelemetry_proto_collector_trace_v1_ExportTraceServiceResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_opentelemetry_proto_collector_trace_v1_ExportTraceServiceResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opentelemetry_proto_collector_trace_v1_ExportTraceServiceResponse_descriptor,
        new java.lang.String[] { });
    com.opentelemetry.proto.trace.v1.TraceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}