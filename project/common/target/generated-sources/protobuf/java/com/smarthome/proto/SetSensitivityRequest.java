// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: motionsensor.proto

package com.smarthome.proto;

/**
 * Protobuf type {@code smarthome.SetSensitivityRequest}
 */
public final class SetSensitivityRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:smarthome.SetSensitivityRequest)
    SetSensitivityRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SetSensitivityRequest.newBuilder() to construct.
  private SetSensitivityRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SetSensitivityRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SetSensitivityRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.smarthome.proto.MotionSensorProto.internal_static_smarthome_SetSensitivityRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.smarthome.proto.MotionSensorProto.internal_static_smarthome_SetSensitivityRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.smarthome.proto.SetSensitivityRequest.class, com.smarthome.proto.SetSensitivityRequest.Builder.class);
  }

  public static final int SENSITIVITY_FIELD_NUMBER = 1;
  private int sensitivity_ = 0;
  /**
   * <pre>
   * 1-10
   * </pre>
   *
   * <code>int32 sensitivity = 1;</code>
   * @return The sensitivity.
   */
  @java.lang.Override
  public int getSensitivity() {
    return sensitivity_;
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
    if (sensitivity_ != 0) {
      output.writeInt32(1, sensitivity_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (sensitivity_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, sensitivity_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.smarthome.proto.SetSensitivityRequest)) {
      return super.equals(obj);
    }
    com.smarthome.proto.SetSensitivityRequest other = (com.smarthome.proto.SetSensitivityRequest) obj;

    if (getSensitivity()
        != other.getSensitivity()) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + SENSITIVITY_FIELD_NUMBER;
    hash = (53 * hash) + getSensitivity();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.smarthome.proto.SetSensitivityRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.smarthome.proto.SetSensitivityRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.smarthome.proto.SetSensitivityRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.smarthome.proto.SetSensitivityRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.smarthome.proto.SetSensitivityRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.smarthome.proto.SetSensitivityRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.smarthome.proto.SetSensitivityRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.smarthome.proto.SetSensitivityRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.smarthome.proto.SetSensitivityRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.smarthome.proto.SetSensitivityRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.smarthome.proto.SetSensitivityRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.smarthome.proto.SetSensitivityRequest parseFrom(
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
  public static Builder newBuilder(com.smarthome.proto.SetSensitivityRequest prototype) {
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
   * Protobuf type {@code smarthome.SetSensitivityRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:smarthome.SetSensitivityRequest)
      com.smarthome.proto.SetSensitivityRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.smarthome.proto.MotionSensorProto.internal_static_smarthome_SetSensitivityRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.smarthome.proto.MotionSensorProto.internal_static_smarthome_SetSensitivityRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.smarthome.proto.SetSensitivityRequest.class, com.smarthome.proto.SetSensitivityRequest.Builder.class);
    }

    // Construct using com.smarthome.proto.SetSensitivityRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      sensitivity_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.smarthome.proto.MotionSensorProto.internal_static_smarthome_SetSensitivityRequest_descriptor;
    }

    @java.lang.Override
    public com.smarthome.proto.SetSensitivityRequest getDefaultInstanceForType() {
      return com.smarthome.proto.SetSensitivityRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.smarthome.proto.SetSensitivityRequest build() {
      com.smarthome.proto.SetSensitivityRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.smarthome.proto.SetSensitivityRequest buildPartial() {
      com.smarthome.proto.SetSensitivityRequest result = new com.smarthome.proto.SetSensitivityRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.smarthome.proto.SetSensitivityRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.sensitivity_ = sensitivity_;
      }
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
      if (other instanceof com.smarthome.proto.SetSensitivityRequest) {
        return mergeFrom((com.smarthome.proto.SetSensitivityRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.smarthome.proto.SetSensitivityRequest other) {
      if (other == com.smarthome.proto.SetSensitivityRequest.getDefaultInstance()) return this;
      if (other.getSensitivity() != 0) {
        setSensitivity(other.getSensitivity());
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              sensitivity_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private int sensitivity_ ;
    /**
     * <pre>
     * 1-10
     * </pre>
     *
     * <code>int32 sensitivity = 1;</code>
     * @return The sensitivity.
     */
    @java.lang.Override
    public int getSensitivity() {
      return sensitivity_;
    }
    /**
     * <pre>
     * 1-10
     * </pre>
     *
     * <code>int32 sensitivity = 1;</code>
     * @param value The sensitivity to set.
     * @return This builder for chaining.
     */
    public Builder setSensitivity(int value) {

      sensitivity_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 1-10
     * </pre>
     *
     * <code>int32 sensitivity = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSensitivity() {
      bitField0_ = (bitField0_ & ~0x00000001);
      sensitivity_ = 0;
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


    // @@protoc_insertion_point(builder_scope:smarthome.SetSensitivityRequest)
  }

  // @@protoc_insertion_point(class_scope:smarthome.SetSensitivityRequest)
  private static final com.smarthome.proto.SetSensitivityRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.smarthome.proto.SetSensitivityRequest();
  }

  public static com.smarthome.proto.SetSensitivityRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SetSensitivityRequest>
      PARSER = new com.google.protobuf.AbstractParser<SetSensitivityRequest>() {
    @java.lang.Override
    public SetSensitivityRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<SetSensitivityRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SetSensitivityRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.smarthome.proto.SetSensitivityRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

