// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: opentelemetry/proto/trace/v1/trace_config.proto

package com.opentelemetry.proto.trace.v1;

public interface RateLimitingSamplerOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opentelemetry.proto.trace.v1.RateLimitingSampler)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Rate per second.
   * </pre>
   *
   * <code>int64 qps = 1 [json_name = "qps"];</code>
   * @return The qps.
   */
  long getQps();
}
