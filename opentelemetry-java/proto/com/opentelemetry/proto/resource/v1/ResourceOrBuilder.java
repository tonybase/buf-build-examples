// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: opentelemetry/proto/resource/v1/resource.proto

package com.opentelemetry.proto.resource.v1;

public interface ResourceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opentelemetry.proto.resource.v1.Resource)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Set of attributes that describe the resource.
   * Attribute keys MUST be unique (it is not allowed to have more than one
   * attribute with the same key).
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.common.v1.KeyValue attributes = 1 [json_name = "attributes"];</code>
   */
  java.util.List<com.opentelemetry.proto.common.v1.KeyValue> 
      getAttributesList();
  /**
   * <pre>
   * Set of attributes that describe the resource.
   * Attribute keys MUST be unique (it is not allowed to have more than one
   * attribute with the same key).
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.common.v1.KeyValue attributes = 1 [json_name = "attributes"];</code>
   */
  com.opentelemetry.proto.common.v1.KeyValue getAttributes(int index);
  /**
   * <pre>
   * Set of attributes that describe the resource.
   * Attribute keys MUST be unique (it is not allowed to have more than one
   * attribute with the same key).
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.common.v1.KeyValue attributes = 1 [json_name = "attributes"];</code>
   */
  int getAttributesCount();
  /**
   * <pre>
   * Set of attributes that describe the resource.
   * Attribute keys MUST be unique (it is not allowed to have more than one
   * attribute with the same key).
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.common.v1.KeyValue attributes = 1 [json_name = "attributes"];</code>
   */
  java.util.List<? extends com.opentelemetry.proto.common.v1.KeyValueOrBuilder> 
      getAttributesOrBuilderList();
  /**
   * <pre>
   * Set of attributes that describe the resource.
   * Attribute keys MUST be unique (it is not allowed to have more than one
   * attribute with the same key).
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.common.v1.KeyValue attributes = 1 [json_name = "attributes"];</code>
   */
  com.opentelemetry.proto.common.v1.KeyValueOrBuilder getAttributesOrBuilder(
      int index);

  /**
   * <pre>
   * dropped_attributes_count is the number of dropped attributes. If the value is 0, then
   * no attributes were dropped.
   * </pre>
   *
   * <code>uint32 dropped_attributes_count = 2 [json_name = "droppedAttributesCount"];</code>
   * @return The droppedAttributesCount.
   */
  int getDroppedAttributesCount();
}