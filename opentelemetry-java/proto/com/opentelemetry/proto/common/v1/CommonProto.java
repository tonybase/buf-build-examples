// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: opentelemetry/proto/common/v1/common.proto

package com.opentelemetry.proto.common.v1;

public final class CommonProto {
  private CommonProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opentelemetry_proto_common_v1_AnyValue_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opentelemetry_proto_common_v1_AnyValue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opentelemetry_proto_common_v1_ArrayValue_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opentelemetry_proto_common_v1_ArrayValue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opentelemetry_proto_common_v1_KeyValueList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opentelemetry_proto_common_v1_KeyValueList_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opentelemetry_proto_common_v1_KeyValue_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opentelemetry_proto_common_v1_KeyValue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opentelemetry_proto_common_v1_InstrumentationLibrary_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opentelemetry_proto_common_v1_InstrumentationLibrary_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opentelemetry_proto_common_v1_InstrumentationScope_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opentelemetry_proto_common_v1_InstrumentationScope_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n*opentelemetry/proto/common/v1/common.p" +
      "roto\022\035opentelemetry.proto.common.v1\"\340\002\n\010" +
      "AnyValue\022#\n\014string_value\030\001 \001(\tH\000R\013string" +
      "Value\022\037\n\nbool_value\030\002 \001(\010H\000R\tboolValue\022\035" +
      "\n\tint_value\030\003 \001(\003H\000R\010intValue\022#\n\014double_" +
      "value\030\004 \001(\001H\000R\013doubleValue\022L\n\013array_valu" +
      "e\030\005 \001(\0132).opentelemetry.proto.common.v1." +
      "ArrayValueH\000R\narrayValue\022P\n\014kvlist_value" +
      "\030\006 \001(\0132+.opentelemetry.proto.common.v1.K" +
      "eyValueListH\000R\013kvlistValue\022!\n\013bytes_valu" +
      "e\030\007 \001(\014H\000R\nbytesValueB\007\n\005value\"M\n\nArrayV" +
      "alue\022?\n\006values\030\001 \003(\0132\'.opentelemetry.pro" +
      "to.common.v1.AnyValueR\006values\"O\n\014KeyValu" +
      "eList\022?\n\006values\030\001 \003(\0132\'.opentelemetry.pr" +
      "oto.common.v1.KeyValueR\006values\"[\n\010KeyVal" +
      "ue\022\020\n\003key\030\001 \001(\tR\003key\022=\n\005value\030\002 \001(\0132\'.op" +
      "entelemetry.proto.common.v1.AnyValueR\005va" +
      "lue\"J\n\026InstrumentationLibrary\022\022\n\004name\030\001 " +
      "\001(\tR\004name\022\030\n\007version\030\002 \001(\tR\007version:\002\030\001\"" +
      "D\n\024InstrumentationScope\022\022\n\004name\030\001 \001(\tR\004n" +
      "ame\022\030\n\007version\030\002 \001(\tR\007versionB\361\001\n!com.op" +
      "entelemetry.proto.common.v1B\013CommonProto" +
      "P\001Z(go.opentelemetry.io/proto/otlp/commo" +
      "n/v1\242\002\003OPC\252\002\035Opentelemetry.Proto.Common." +
      "V1\312\002\035Opentelemetry\\Proto\\Common\\V1\342\002)Ope" +
      "ntelemetry\\Proto\\Common\\V1\\GPBMetadata\352\002" +
      " Opentelemetry::Proto::Common::V1b\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_opentelemetry_proto_common_v1_AnyValue_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_opentelemetry_proto_common_v1_AnyValue_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opentelemetry_proto_common_v1_AnyValue_descriptor,
        new java.lang.String[] { "StringValue", "BoolValue", "IntValue", "DoubleValue", "ArrayValue", "KvlistValue", "BytesValue", "Value", });
    internal_static_opentelemetry_proto_common_v1_ArrayValue_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_opentelemetry_proto_common_v1_ArrayValue_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opentelemetry_proto_common_v1_ArrayValue_descriptor,
        new java.lang.String[] { "Values", });
    internal_static_opentelemetry_proto_common_v1_KeyValueList_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_opentelemetry_proto_common_v1_KeyValueList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opentelemetry_proto_common_v1_KeyValueList_descriptor,
        new java.lang.String[] { "Values", });
    internal_static_opentelemetry_proto_common_v1_KeyValue_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_opentelemetry_proto_common_v1_KeyValue_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opentelemetry_proto_common_v1_KeyValue_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_opentelemetry_proto_common_v1_InstrumentationLibrary_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_opentelemetry_proto_common_v1_InstrumentationLibrary_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opentelemetry_proto_common_v1_InstrumentationLibrary_descriptor,
        new java.lang.String[] { "Name", "Version", });
    internal_static_opentelemetry_proto_common_v1_InstrumentationScope_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_opentelemetry_proto_common_v1_InstrumentationScope_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opentelemetry_proto_common_v1_InstrumentationScope_descriptor,
        new java.lang.String[] { "Name", "Version", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
