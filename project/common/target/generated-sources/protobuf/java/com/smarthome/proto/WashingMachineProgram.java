// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: washingmachine.proto

package com.smarthome.proto;

/**
 * Protobuf enum {@code smarthome.WashingMachineProgram}
 */
public enum WashingMachineProgram
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>COTTON = 0;</code>
   */
  COTTON(0),
  /**
   * <code>SYNTHETIC = 1;</code>
   */
  SYNTHETIC(1),
  /**
   * <code>DELICATE = 2;</code>
   */
  DELICATE(2),
  /**
   * <code>WOOL = 3;</code>
   */
  WOOL(3),
  /**
   * <code>QUICK_WASH = 4;</code>
   */
  QUICK_WASH(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>COTTON = 0;</code>
   */
  public static final int COTTON_VALUE = 0;
  /**
   * <code>SYNTHETIC = 1;</code>
   */
  public static final int SYNTHETIC_VALUE = 1;
  /**
   * <code>DELICATE = 2;</code>
   */
  public static final int DELICATE_VALUE = 2;
  /**
   * <code>WOOL = 3;</code>
   */
  public static final int WOOL_VALUE = 3;
  /**
   * <code>QUICK_WASH = 4;</code>
   */
  public static final int QUICK_WASH_VALUE = 4;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static WashingMachineProgram valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static WashingMachineProgram forNumber(int value) {
    switch (value) {
      case 0: return COTTON;
      case 1: return SYNTHETIC;
      case 2: return DELICATE;
      case 3: return WOOL;
      case 4: return QUICK_WASH;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<WashingMachineProgram>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      WashingMachineProgram> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<WashingMachineProgram>() {
          public WashingMachineProgram findValueByNumber(int number) {
            return WashingMachineProgram.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.smarthome.proto.WashingMachineProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final WashingMachineProgram[] VALUES = values();

  public static WashingMachineProgram valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private WashingMachineProgram(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:smarthome.WashingMachineProgram)
}

