// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: opentelemetry/proto/trace/v1/trace_config.proto

package com.opentelemetry.proto.trace.v1;

/**
 * <pre>
 * Sampler that tries to sample with a rate per time window.
 * </pre>
 *
 * Protobuf type {@code opentelemetry.proto.trace.v1.RateLimitingSampler}
 */
public final class RateLimitingSampler extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opentelemetry.proto.trace.v1.RateLimitingSampler)
    RateLimitingSamplerOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RateLimitingSampler.newBuilder() to construct.
  private RateLimitingSampler(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RateLimitingSampler() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RateLimitingSampler();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RateLimitingSampler(
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
          case 8: {

            qps_ = input.readInt64();
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
    return com.opentelemetry.proto.trace.v1.TraceConfigProto.internal_static_opentelemetry_proto_trace_v1_RateLimitingSampler_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.opentelemetry.proto.trace.v1.TraceConfigProto.internal_static_opentelemetry_proto_trace_v1_RateLimitingSampler_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.opentelemetry.proto.trace.v1.RateLimitingSampler.class, com.opentelemetry.proto.trace.v1.RateLimitingSampler.Builder.class);
  }

  public static final int QPS_FIELD_NUMBER = 1;
  private long qps_;
  /**
   * <pre>
   * Rate per second.
   * </pre>
   *
   * <code>int64 qps = 1 [json_name = "qps"];</code>
   * @return The qps.
   */
  @java.lang.Override
  public long getQps() {
    return qps_;
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
    if (qps_ != 0L) {
      output.writeInt64(1, qps_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (qps_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, qps_);
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
    if (!(obj instanceof com.opentelemetry.proto.trace.v1.RateLimitingSampler)) {
      return super.equals(obj);
    }
    com.opentelemetry.proto.trace.v1.RateLimitingSampler other = (com.opentelemetry.proto.trace.v1.RateLimitingSampler) obj;

    if (getQps()
        != other.getQps()) return false;
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
    hash = (37 * hash) + QPS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getQps());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.opentelemetry.proto.trace.v1.RateLimitingSampler parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.opentelemetry.proto.trace.v1.RateLimitingSampler parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.opentelemetry.proto.trace.v1.RateLimitingSampler parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.opentelemetry.proto.trace.v1.RateLimitingSampler parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.opentelemetry.proto.trace.v1.RateLimitingSampler parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.opentelemetry.proto.trace.v1.RateLimitingSampler parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.opentelemetry.proto.trace.v1.RateLimitingSampler parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.opentelemetry.proto.trace.v1.RateLimitingSampler parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.opentelemetry.proto.trace.v1.RateLimitingSampler parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.opentelemetry.proto.trace.v1.RateLimitingSampler parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.opentelemetry.proto.trace.v1.RateLimitingSampler parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.opentelemetry.proto.trace.v1.RateLimitingSampler parseFrom(
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
  public static Builder newBuilder(com.opentelemetry.proto.trace.v1.RateLimitingSampler prototype) {
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
   * Sampler that tries to sample with a rate per time window.
   * </pre>
   *
   * Protobuf type {@code opentelemetry.proto.trace.v1.RateLimitingSampler}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opentelemetry.proto.trace.v1.RateLimitingSampler)
      com.opentelemetry.proto.trace.v1.RateLimitingSamplerOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.opentelemetry.proto.trace.v1.TraceConfigProto.internal_static_opentelemetry_proto_trace_v1_RateLimitingSampler_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.opentelemetry.proto.trace.v1.TraceConfigProto.internal_static_opentelemetry_proto_trace_v1_RateLimitingSampler_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.opentelemetry.proto.trace.v1.RateLimitingSampler.class, com.opentelemetry.proto.trace.v1.RateLimitingSampler.Builder.class);
    }

    // Construct using com.opentelemetry.proto.trace.v1.RateLimitingSampler.newBuilder()
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
      qps_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.opentelemetry.proto.trace.v1.TraceConfigProto.internal_static_opentelemetry_proto_trace_v1_RateLimitingSampler_descriptor;
    }

    @java.lang.Override
    public com.opentelemetry.proto.trace.v1.RateLimitingSampler getDefaultInstanceForType() {
      return com.opentelemetry.proto.trace.v1.RateLimitingSampler.getDefaultInstance();
    }

    @java.lang.Override
    public com.opentelemetry.proto.trace.v1.RateLimitingSampler build() {
      com.opentelemetry.proto.trace.v1.RateLimitingSampler result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.opentelemetry.proto.trace.v1.RateLimitingSampler buildPartial() {
      com.opentelemetry.proto.trace.v1.RateLimitingSampler result = new com.opentelemetry.proto.trace.v1.RateLimitingSampler(this);
      result.qps_ = qps_;
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
      if (other instanceof com.opentelemetry.proto.trace.v1.RateLimitingSampler) {
        return mergeFrom((com.opentelemetry.proto.trace.v1.RateLimitingSampler)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.opentelemetry.proto.trace.v1.RateLimitingSampler other) {
      if (other == com.opentelemetry.proto.trace.v1.RateLimitingSampler.getDefaultInstance()) return this;
      if (other.getQps() != 0L) {
        setQps(other.getQps());
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
      com.opentelemetry.proto.trace.v1.RateLimitingSampler parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.opentelemetry.proto.trace.v1.RateLimitingSampler) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long qps_ ;
    /**
     * <pre>
     * Rate per second.
     * </pre>
     *
     * <code>int64 qps = 1 [json_name = "qps"];</code>
     * @return The qps.
     */
    @java.lang.Override
    public long getQps() {
      return qps_;
    }
    /**
     * <pre>
     * Rate per second.
     * </pre>
     *
     * <code>int64 qps = 1 [json_name = "qps"];</code>
     * @param value The qps to set.
     * @return This builder for chaining.
     */
    public Builder setQps(long value) {
      
      qps_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Rate per second.
     * </pre>
     *
     * <code>int64 qps = 1 [json_name = "qps"];</code>
     * @return This builder for chaining.
     */
    public Builder clearQps() {
      
      qps_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:opentelemetry.proto.trace.v1.RateLimitingSampler)
  }

  // @@protoc_insertion_point(class_scope:opentelemetry.proto.trace.v1.RateLimitingSampler)
  private static final com.opentelemetry.proto.trace.v1.RateLimitingSampler DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.opentelemetry.proto.trace.v1.RateLimitingSampler();
  }

  public static com.opentelemetry.proto.trace.v1.RateLimitingSampler getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RateLimitingSampler>
      PARSER = new com.google.protobuf.AbstractParser<RateLimitingSampler>() {
    @java.lang.Override
    public RateLimitingSampler parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RateLimitingSampler(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RateLimitingSampler> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RateLimitingSampler> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.opentelemetry.proto.trace.v1.RateLimitingSampler getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

