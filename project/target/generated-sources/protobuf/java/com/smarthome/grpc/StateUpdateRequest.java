// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: device.proto

package com.smarthome.grpc;

/**
 * Protobuf type {@code device.StateUpdateRequest}
 */
public final class StateUpdateRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:device.StateUpdateRequest)
    StateUpdateRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StateUpdateRequest.newBuilder() to construct.
  private StateUpdateRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StateUpdateRequest() {
    deviceId_ = "";
    deviceType_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new StateUpdateRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.smarthome.grpc.DeviceProto.internal_static_device_StateUpdateRequest_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 3:
        return internalGetProperties();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.smarthome.grpc.DeviceProto.internal_static_device_StateUpdateRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.smarthome.grpc.StateUpdateRequest.class, com.smarthome.grpc.StateUpdateRequest.Builder.class);
  }

  public static final int DEVICE_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object deviceId_ = "";
  /**
   * <code>string device_id = 1;</code>
   * @return The deviceId.
   */
  @java.lang.Override
  public java.lang.String getDeviceId() {
    java.lang.Object ref = deviceId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      deviceId_ = s;
      return s;
    }
  }
  /**
   * <code>string device_id = 1;</code>
   * @return The bytes for deviceId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDeviceIdBytes() {
    java.lang.Object ref = deviceId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      deviceId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DEVICE_TYPE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object deviceType_ = "";
  /**
   * <code>string device_type = 2;</code>
   * @return The deviceType.
   */
  @java.lang.Override
  public java.lang.String getDeviceType() {
    java.lang.Object ref = deviceType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      deviceType_ = s;
      return s;
    }
  }
  /**
   * <code>string device_type = 2;</code>
   * @return The bytes for deviceType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDeviceTypeBytes() {
    java.lang.Object ref = deviceType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      deviceType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PROPERTIES_FIELD_NUMBER = 3;
  private static final class PropertiesDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, java.lang.String> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, java.lang.String>newDefaultInstance(
                com.smarthome.grpc.DeviceProto.internal_static_device_StateUpdateRequest_PropertiesEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.STRING,
                "");
  }
  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<
      java.lang.String, java.lang.String> properties_;
  private com.google.protobuf.MapField<java.lang.String, java.lang.String>
  internalGetProperties() {
    if (properties_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          PropertiesDefaultEntryHolder.defaultEntry);
    }
    return properties_;
  }
  public int getPropertiesCount() {
    return internalGetProperties().getMap().size();
  }
  /**
   * <code>map&lt;string, string&gt; properties = 3;</code>
   */
  @java.lang.Override
  public boolean containsProperties(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    return internalGetProperties().getMap().containsKey(key);
  }
  /**
   * Use {@link #getPropertiesMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getProperties() {
    return getPropertiesMap();
  }
  /**
   * <code>map&lt;string, string&gt; properties = 3;</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, java.lang.String> getPropertiesMap() {
    return internalGetProperties().getMap();
  }
  /**
   * <code>map&lt;string, string&gt; properties = 3;</code>
   */
  @java.lang.Override
  public /* nullable */
java.lang.String getPropertiesOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetProperties().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;string, string&gt; properties = 3;</code>
   */
  @java.lang.Override
  public java.lang.String getPropertiesOrThrow(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetProperties().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(deviceId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, deviceId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(deviceType_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, deviceType_);
    }
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetProperties(),
        PropertiesDefaultEntryHolder.defaultEntry,
        3);
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(deviceId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, deviceId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(deviceType_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, deviceType_);
    }
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry
         : internalGetProperties().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
      properties__ = PropertiesDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, properties__);
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
    if (!(obj instanceof com.smarthome.grpc.StateUpdateRequest)) {
      return super.equals(obj);
    }
    com.smarthome.grpc.StateUpdateRequest other = (com.smarthome.grpc.StateUpdateRequest) obj;

    if (!getDeviceId()
        .equals(other.getDeviceId())) return false;
    if (!getDeviceType()
        .equals(other.getDeviceType())) return false;
    if (!internalGetProperties().equals(
        other.internalGetProperties())) return false;
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
    hash = (37 * hash) + DEVICE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getDeviceId().hashCode();
    hash = (37 * hash) + DEVICE_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getDeviceType().hashCode();
    if (!internalGetProperties().getMap().isEmpty()) {
      hash = (37 * hash) + PROPERTIES_FIELD_NUMBER;
      hash = (53 * hash) + internalGetProperties().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.smarthome.grpc.StateUpdateRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.smarthome.grpc.StateUpdateRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.smarthome.grpc.StateUpdateRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.smarthome.grpc.StateUpdateRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.smarthome.grpc.StateUpdateRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.smarthome.grpc.StateUpdateRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.smarthome.grpc.StateUpdateRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.smarthome.grpc.StateUpdateRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.smarthome.grpc.StateUpdateRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.smarthome.grpc.StateUpdateRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.smarthome.grpc.StateUpdateRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.smarthome.grpc.StateUpdateRequest parseFrom(
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
  public static Builder newBuilder(com.smarthome.grpc.StateUpdateRequest prototype) {
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
   * Protobuf type {@code device.StateUpdateRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:device.StateUpdateRequest)
      com.smarthome.grpc.StateUpdateRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.smarthome.grpc.DeviceProto.internal_static_device_StateUpdateRequest_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 3:
          return internalGetProperties();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 3:
          return internalGetMutableProperties();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.smarthome.grpc.DeviceProto.internal_static_device_StateUpdateRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.smarthome.grpc.StateUpdateRequest.class, com.smarthome.grpc.StateUpdateRequest.Builder.class);
    }

    // Construct using com.smarthome.grpc.StateUpdateRequest.newBuilder()
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
      deviceId_ = "";
      deviceType_ = "";
      internalGetMutableProperties().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.smarthome.grpc.DeviceProto.internal_static_device_StateUpdateRequest_descriptor;
    }

    @java.lang.Override
    public com.smarthome.grpc.StateUpdateRequest getDefaultInstanceForType() {
      return com.smarthome.grpc.StateUpdateRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.smarthome.grpc.StateUpdateRequest build() {
      com.smarthome.grpc.StateUpdateRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.smarthome.grpc.StateUpdateRequest buildPartial() {
      com.smarthome.grpc.StateUpdateRequest result = new com.smarthome.grpc.StateUpdateRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.smarthome.grpc.StateUpdateRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.deviceId_ = deviceId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.deviceType_ = deviceType_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.properties_ = internalGetProperties();
        result.properties_.makeImmutable();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.smarthome.grpc.StateUpdateRequest) {
        return mergeFrom((com.smarthome.grpc.StateUpdateRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.smarthome.grpc.StateUpdateRequest other) {
      if (other == com.smarthome.grpc.StateUpdateRequest.getDefaultInstance()) return this;
      if (!other.getDeviceId().isEmpty()) {
        deviceId_ = other.deviceId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getDeviceType().isEmpty()) {
        deviceType_ = other.deviceType_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      internalGetMutableProperties().mergeFrom(
          other.internalGetProperties());
      bitField0_ |= 0x00000004;
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
            case 10: {
              deviceId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              deviceType_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
              properties__ = input.readMessage(
                  PropertiesDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              internalGetMutableProperties().getMutableMap().put(
                  properties__.getKey(), properties__.getValue());
              bitField0_ |= 0x00000004;
              break;
            } // case 26
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

    private java.lang.Object deviceId_ = "";
    /**
     * <code>string device_id = 1;</code>
     * @return The deviceId.
     */
    public java.lang.String getDeviceId() {
      java.lang.Object ref = deviceId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        deviceId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string device_id = 1;</code>
     * @return The bytes for deviceId.
     */
    public com.google.protobuf.ByteString
        getDeviceIdBytes() {
      java.lang.Object ref = deviceId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        deviceId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string device_id = 1;</code>
     * @param value The deviceId to set.
     * @return This builder for chaining.
     */
    public Builder setDeviceId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      deviceId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string device_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDeviceId() {
      deviceId_ = getDefaultInstance().getDeviceId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string device_id = 1;</code>
     * @param value The bytes for deviceId to set.
     * @return This builder for chaining.
     */
    public Builder setDeviceIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      deviceId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object deviceType_ = "";
    /**
     * <code>string device_type = 2;</code>
     * @return The deviceType.
     */
    public java.lang.String getDeviceType() {
      java.lang.Object ref = deviceType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        deviceType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string device_type = 2;</code>
     * @return The bytes for deviceType.
     */
    public com.google.protobuf.ByteString
        getDeviceTypeBytes() {
      java.lang.Object ref = deviceType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        deviceType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string device_type = 2;</code>
     * @param value The deviceType to set.
     * @return This builder for chaining.
     */
    public Builder setDeviceType(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      deviceType_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string device_type = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDeviceType() {
      deviceType_ = getDefaultInstance().getDeviceType();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string device_type = 2;</code>
     * @param value The bytes for deviceType to set.
     * @return This builder for chaining.
     */
    public Builder setDeviceTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      deviceType_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<
        java.lang.String, java.lang.String> properties_;
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
        internalGetProperties() {
      if (properties_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            PropertiesDefaultEntryHolder.defaultEntry);
      }
      return properties_;
    }
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
        internalGetMutableProperties() {
      if (properties_ == null) {
        properties_ = com.google.protobuf.MapField.newMapField(
            PropertiesDefaultEntryHolder.defaultEntry);
      }
      if (!properties_.isMutable()) {
        properties_ = properties_.copy();
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return properties_;
    }
    public int getPropertiesCount() {
      return internalGetProperties().getMap().size();
    }
    /**
     * <code>map&lt;string, string&gt; properties = 3;</code>
     */
    @java.lang.Override
    public boolean containsProperties(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      return internalGetProperties().getMap().containsKey(key);
    }
    /**
     * Use {@link #getPropertiesMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getProperties() {
      return getPropertiesMap();
    }
    /**
     * <code>map&lt;string, string&gt; properties = 3;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, java.lang.String> getPropertiesMap() {
      return internalGetProperties().getMap();
    }
    /**
     * <code>map&lt;string, string&gt; properties = 3;</code>
     */
    @java.lang.Override
    public /* nullable */
java.lang.String getPropertiesOrDefault(
        java.lang.String key,
        /* nullable */
java.lang.String defaultValue) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetProperties().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;string, string&gt; properties = 3;</code>
     */
    @java.lang.Override
    public java.lang.String getPropertiesOrThrow(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetProperties().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }
    public Builder clearProperties() {
      bitField0_ = (bitField0_ & ~0x00000004);
      internalGetMutableProperties().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <code>map&lt;string, string&gt; properties = 3;</code>
     */
    public Builder removeProperties(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      internalGetMutableProperties().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String>
        getMutableProperties() {
      bitField0_ |= 0x00000004;
      return internalGetMutableProperties().getMutableMap();
    }
    /**
     * <code>map&lt;string, string&gt; properties = 3;</code>
     */
    public Builder putProperties(
        java.lang.String key,
        java.lang.String value) {
      if (key == null) { throw new NullPointerException("map key"); }
      if (value == null) { throw new NullPointerException("map value"); }
      internalGetMutableProperties().getMutableMap()
          .put(key, value);
      bitField0_ |= 0x00000004;
      return this;
    }
    /**
     * <code>map&lt;string, string&gt; properties = 3;</code>
     */
    public Builder putAllProperties(
        java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutableProperties().getMutableMap()
          .putAll(values);
      bitField0_ |= 0x00000004;
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


    // @@protoc_insertion_point(builder_scope:device.StateUpdateRequest)
  }

  // @@protoc_insertion_point(class_scope:device.StateUpdateRequest)
  private static final com.smarthome.grpc.StateUpdateRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.smarthome.grpc.StateUpdateRequest();
  }

  public static com.smarthome.grpc.StateUpdateRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StateUpdateRequest>
      PARSER = new com.google.protobuf.AbstractParser<StateUpdateRequest>() {
    @java.lang.Override
    public StateUpdateRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<StateUpdateRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StateUpdateRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.smarthome.grpc.StateUpdateRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

