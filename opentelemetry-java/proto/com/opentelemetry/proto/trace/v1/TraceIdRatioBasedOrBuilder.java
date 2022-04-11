// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: opentelemetry/proto/trace/v1/trace_config.proto

package com.opentelemetry.proto.trace.v1;

public interface TraceIdRatioBasedOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opentelemetry.proto.trace.v1.TraceIdRatioBased)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The desired ratio of sampling. Must be within [0.0, 1.0].
   * </pre>
   *
   * <code>double samplingRatio = 1 [json_name = "samplingRatio"];</code>
   * @return The samplingRatio.
   */
  double getSamplingRatio();
}
