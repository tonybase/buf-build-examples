// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: opentelemetry/proto/metrics/v1/metrics.proto

package com.opentelemetry.proto.metrics.v1;

public interface GaugeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opentelemetry.proto.metrics.v1.Gauge)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .opentelemetry.proto.metrics.v1.NumberDataPoint data_points = 1 [json_name = "dataPoints"];</code>
   */
  java.util.List<com.opentelemetry.proto.metrics.v1.NumberDataPoint> 
      getDataPointsList();
  /**
   * <code>repeated .opentelemetry.proto.metrics.v1.NumberDataPoint data_points = 1 [json_name = "dataPoints"];</code>
   */
  com.opentelemetry.proto.metrics.v1.NumberDataPoint getDataPoints(int index);
  /**
   * <code>repeated .opentelemetry.proto.metrics.v1.NumberDataPoint data_points = 1 [json_name = "dataPoints"];</code>
   */
  int getDataPointsCount();
  /**
   * <code>repeated .opentelemetry.proto.metrics.v1.NumberDataPoint data_points = 1 [json_name = "dataPoints"];</code>
   */
  java.util.List<? extends com.opentelemetry.proto.metrics.v1.NumberDataPointOrBuilder> 
      getDataPointsOrBuilderList();
  /**
   * <code>repeated .opentelemetry.proto.metrics.v1.NumberDataPoint data_points = 1 [json_name = "dataPoints"];</code>
   */
  com.opentelemetry.proto.metrics.v1.NumberDataPointOrBuilder getDataPointsOrBuilder(
      int index);
}
