// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: opentelemetry/proto/trace/v1/trace_config.proto

package com.opentelemetry.proto.trace.v1;

/**
 * <pre>
 * Sampler that tries to uniformly sample traces with a given ratio.
 * The ratio of sampling a trace is equal to that of the specified ratio.
 * </pre>
 *
 * Protobuf type {@code opentelemetry.proto.trace.v1.TraceIdRatioBased}
 */
public final class TraceIdRatioBased extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opentelemetry.proto.trace.v1.TraceIdRatioBased)
    TraceIdRatioBasedOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TraceIdRatioBased.newBuilder() to construct.
  private TraceIdRatioBased(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TraceIdRatioBased() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TraceIdRatioBased();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TraceIdRatioBased(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 9: {

            samplingRatio_ = input.readDouble();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.opentelemetry.proto.trace.v1.TraceConfigProto.internal_static_opentelemetry_proto_trace_v1_TraceIdRatioBased_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.opentelemetry.proto.trace.v1.TraceConfigProto.internal_static_opentelemetry_proto_trace_v1_TraceIdRatioBased_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.opentelemetry.proto.trace.v1.TraceIdRatioBased.class, com.opentelemetry.proto.trace.v1.TraceIdRatioBased.Builder.class);
  }

  public static final int SAMPLINGRATIO_FIELD_NUMBER = 1;
  private double samplingRatio_;
  /**
   * <pre>
   * The desired ratio of sampling. Must be within [0.0, 1.0].
   * </pre>
   *
   * <code>double samplingRatio = 1 [json_name = "samplingRatio"];</code>
   * @return The samplingRatio.
   */
  @java.lang.Override
  public double getSamplingRatio() {
    return samplingRatio_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (java.lang.Double.doubleToRawLongBits(samplingRatio_) != 0) {
      output.writeDouble(1, samplingRatio_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (java.lang.Double.doubleToRawLongBits(samplingRatio_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(1, samplingRatio_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.opentelemetry.proto.trace.v1.TraceIdRatioBased)) {
      return super.equals(obj);
    }
    com.opentelemetry.proto.trace.v1.TraceIdRatioBased other = (com.opentelemetry.proto.trace.v1.TraceIdRatioBased) obj;

    if (java.lang.Double.doubleToLongBits(getSamplingRatio())
        != java.lang.Double.doubleToLongBits(
            other.getSamplingRatio())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + SAMPLINGRATIO_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getSamplingRatio()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.opentelemetry.proto.trace.v1.TraceIdRatioBased parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.opentelemetry.proto.trace.v1.TraceIdRatioBased parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.opentelemetry.proto.trace.v1.TraceIdRatioBased parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.opentelemetry.proto.trace.v1.TraceIdRatioBased parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.opentelemetry.proto.trace.v1.TraceIdRatioBased parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.opentelemetry.proto.trace.v1.TraceIdRatioBased parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.opentelemetry.proto.trace.v1.TraceIdRatioBased parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.opentelemetry.proto.trace.v1.TraceIdRatioBased parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.opentelemetry.proto.trace.v1.TraceIdRatioBased parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.opentelemetry.proto.trace.v1.TraceIdRatioBased parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.opentelemetry.proto.trace.v1.TraceIdRatioBased parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.opentelemetry.proto.trace.v1.TraceIdRatioBased parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.opentelemetry.proto.trace.v1.TraceIdRatioBased prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Sampler that tries to uniformly sample traces with a given ratio.
   * The ratio of sampling a trace is equal to that of the specified ratio.
   * </pre>
   *
   * Protobuf type {@code opentelemetry.proto.trace.v1.TraceIdRatioBased}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opentelemetry.proto.trace.v1.TraceIdRatioBased)
      com.opentelemetry.proto.trace.v1.TraceIdRatioBasedOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.opentelemetry.proto.trace.v1.TraceConfigProto.internal_static_opentelemetry_proto_trace_v1_TraceIdRatioBased_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.opentelemetry.proto.trace.v1.TraceConfigProto.internal_static_opentelemetry_proto_trace_v1_TraceIdRatioBased_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.opentelemetry.proto.trace.v1.TraceIdRatioBased.class, com.opentelemetry.proto.trace.v1.TraceIdRatioBased.Builder.class);
    }

    // Construct using com.opentelemetry.proto.trace.v1.TraceIdRatioBased.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      samplingRatio_ = 0D;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.opentelemetry.proto.trace.v1.TraceConfigProto.internal_static_opentelemetry_proto_trace_v1_TraceIdRatioBased_descriptor;
    }

    @java.lang.Override
    public com.opentelemetry.proto.trace.v1.TraceIdRatioBased getDefaultInstanceForType() {
      return com.opentelemetry.proto.trace.v1.TraceIdRatioBased.getDefaultInstance();
    }

    @java.lang.Override
    public com.opentelemetry.proto.trace.v1.TraceIdRatioBased build() {
      com.opentelemetry.proto.trace.v1.TraceIdRatioBased result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.opentelemetry.proto.trace.v1.TraceIdRatioBased buildPartial() {
      com.opentelemetry.proto.trace.v1.TraceIdRatioBased result = new com.opentelemetry.proto.trace.v1.TraceIdRatioBased(this);
      result.samplingRatio_ = samplingRatio_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.opentelemetry.proto.trace.v1.TraceIdRatioBased) {
        return mergeFrom((com.opentelemetry.proto.trace.v1.TraceIdRatioBased)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.opentelemetry.proto.trace.v1.TraceIdRatioBased other) {
      if (other == com.opentelemetry.proto.trace.v1.TraceIdRatioBased.getDefaultInstance()) return this;
      if (other.getSamplingRatio() != 0D) {
        setSamplingRatio(other.getSamplingRatio());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.opentelemetry.proto.trace.v1.TraceIdRatioBased parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.opentelemetry.proto.trace.v1.TraceIdRatioBased) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private double samplingRatio_ ;
    /**
     * <pre>
     * The desired ratio of sampling. Must be within [0.0, 1.0].
     * </pre>
     *
     * <code>double samplingRatio = 1 [json_name = "samplingRatio"];</code>
     * @return The samplingRatio.
     */
    @java.lang.Override
    public double getSamplingRatio() {
      return samplingRatio_;
    }
    /**
     * <pre>
     * The desired ratio of sampling. Must be within [0.0, 1.0].
     * </pre>
     *
     * <code>double samplingRatio = 1 [json_name = "samplingRatio"];</code>
     * @param value The samplingRatio to set.
     * @return This builder for chaining.
     */
    public Builder setSamplingRatio(double value) {
      
      samplingRatio_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The desired ratio of sampling. Must be within [0.0, 1.0].
     * </pre>
     *
     * <code>double samplingRatio = 1 [json_name = "samplingRatio"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSamplingRatio() {
      
      samplingRatio_ = 0D;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:opentelemetry.proto.trace.v1.TraceIdRatioBased)
  }

  // @@protoc_insertion_point(class_scope:opentelemetry.proto.trace.v1.TraceIdRatioBased)
  private static final com.opentelemetry.proto.trace.v1.TraceIdRatioBased DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.opentelemetry.proto.trace.v1.TraceIdRatioBased();
  }

  public static com.opentelemetry.proto.trace.v1.TraceIdRatioBased getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TraceIdRatioBased>
      PARSER = new com.google.protobuf.AbstractParser<TraceIdRatioBased>() {
    @java.lang.Override
    public TraceIdRatioBased parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TraceIdRatioBased(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TraceIdRatioBased> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TraceIdRatioBased> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.opentelemetry.proto.trace.v1.TraceIdRatioBased getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

