// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: motionsensor.proto

package com.smarthome.proto;

public final class MotionSensorProto {
  private MotionSensorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smarthome_MotionSensorTurnOnRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smarthome_MotionSensorTurnOnRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smarthome_MotionSensorTurnOnResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smarthome_MotionSensorTurnOnResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smarthome_MotionSensorTurnOffRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smarthome_MotionSensorTurnOffRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smarthome_MotionSensorTurnOffResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smarthome_MotionSensorTurnOffResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smarthome_MotionSensorGetStatusRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smarthome_MotionSensorGetStatusRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smarthome_MotionSensorGetStatusResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smarthome_MotionSensorGetStatusResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smarthome_SetSensitivityRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smarthome_SetSensitivityRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smarthome_SetSensitivityResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smarthome_SetSensitivityResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022motionsensor.proto\022\tsmarthome\"\033\n\031Motio" +
      "nSensorTurnOnRequest\">\n\032MotionSensorTurn" +
      "OnResponse\022\017\n\007success\030\001 \001(\010\022\017\n\007message\030\002" +
      " \001(\t\"\034\n\032MotionSensorTurnOffRequest\"?\n\033Mo" +
      "tionSensorTurnOffResponse\022\017\n\007success\030\001 \001" +
      "(\010\022\017\n\007message\030\002 \001(\t\"\036\n\034MotionSensorGetSt" +
      "atusRequest\"g\n\035MotionSensorGetStatusResp" +
      "onse\022\027\n\017motion_detected\030\001 \001(\010\022\030\n\020last_mo" +
      "tion_time\030\002 \001(\003\022\023\n\013sensitivity\030\003 \001(\005\",\n\025" +
      "SetSensitivityRequest\022\023\n\013sensitivity\030\001 \001" +
      "(\005\":\n\026SetSensitivityResponse\022\017\n\007success\030" +
      "\001 \001(\010\022\017\n\007message\030\002 \001(\t2\375\002\n\023MotionSensorS" +
      "ervice\022U\n\006TurnOn\022$.smarthome.MotionSenso" +
      "rTurnOnRequest\032%.smarthome.MotionSensorT" +
      "urnOnResponse\022X\n\007TurnOff\022%.smarthome.Mot" +
      "ionSensorTurnOffRequest\032&.smarthome.Moti" +
      "onSensorTurnOffResponse\022^\n\tGetStatus\022\'.s" +
      "marthome.MotionSensorGetStatusRequest\032(." +
      "smarthome.MotionSensorGetStatusResponse\022" +
      "U\n\016SetSensitivity\022 .smarthome.SetSensiti" +
      "vityRequest\032!.smarthome.SetSensitivityRe" +
      "sponseB*\n\023com.smarthome.protoB\021MotionSen" +
      "sorProtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_smarthome_MotionSensorTurnOnRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_smarthome_MotionSensorTurnOnRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smarthome_MotionSensorTurnOnRequest_descriptor,
        new java.lang.String[] { });
    internal_static_smarthome_MotionSensorTurnOnResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_smarthome_MotionSensorTurnOnResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smarthome_MotionSensorTurnOnResponse_descriptor,
        new java.lang.String[] { "Success", "Message", });
    internal_static_smarthome_MotionSensorTurnOffRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_smarthome_MotionSensorTurnOffRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smarthome_MotionSensorTurnOffRequest_descriptor,
        new java.lang.String[] { });
    internal_static_smarthome_MotionSensorTurnOffResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_smarthome_MotionSensorTurnOffResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smarthome_MotionSensorTurnOffResponse_descriptor,
        new java.lang.String[] { "Success", "Message", });
    internal_static_smarthome_MotionSensorGetStatusRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_smarthome_MotionSensorGetStatusRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smarthome_MotionSensorGetStatusRequest_descriptor,
        new java.lang.String[] { });
    internal_static_smarthome_MotionSensorGetStatusResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_smarthome_MotionSensorGetStatusResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smarthome_MotionSensorGetStatusResponse_descriptor,
        new java.lang.String[] { "MotionDetected", "LastMotionTime", "Sensitivity", });
    internal_static_smarthome_SetSensitivityRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_smarthome_SetSensitivityRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smarthome_SetSensitivityRequest_descriptor,
        new java.lang.String[] { "Sensitivity", });
    internal_static_smarthome_SetSensitivityResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_smarthome_SetSensitivityResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smarthome_SetSensitivityResponse_descriptor,
        new java.lang.String[] { "Success", "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
