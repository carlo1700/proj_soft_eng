// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: thermostat.proto

package com.smarthome.proto;

public final class ThermostatProto {
  private ThermostatProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smarthome_ThermostatTurnOnRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smarthome_ThermostatTurnOnRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smarthome_ThermostatTurnOnResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smarthome_ThermostatTurnOnResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smarthome_ThermostatTurnOffRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smarthome_ThermostatTurnOffRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smarthome_ThermostatTurnOffResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smarthome_ThermostatTurnOffResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smarthome_SetTargetTemperatureRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smarthome_SetTargetTemperatureRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smarthome_SetTargetTemperatureResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smarthome_SetTargetTemperatureResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smarthome_SetModeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smarthome_SetModeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smarthome_SetModeResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smarthome_SetModeResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smarthome_ThermostatGetStatusRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smarthome_ThermostatGetStatusRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smarthome_ThermostatGetStatusResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smarthome_ThermostatGetStatusResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020thermostat.proto\022\tsmarthome\"\031\n\027Thermos" +
      "tatTurnOnRequest\"<\n\030ThermostatTurnOnResp" +
      "onse\022\017\n\007success\030\001 \001(\010\022\017\n\007message\030\002 \001(\t\"\032" +
      "\n\030ThermostatTurnOffRequest\"=\n\031Thermostat" +
      "TurnOffResponse\022\017\n\007success\030\001 \001(\010\022\017\n\007mess" +
      "age\030\002 \001(\t\"9\n\033SetTargetTemperatureRequest" +
      "\022\032\n\022target_temperature\030\001 \001(\001\"@\n\034SetTarge" +
      "tTemperatureResponse\022\017\n\007success\030\001 \001(\010\022\017\n" +
      "\007message\030\002 \001(\t\"9\n\016SetModeRequest\022\'\n\004mode" +
      "\030\001 \001(\0162\031.smarthome.ThermostatMode\"3\n\017Set" +
      "ModeResponse\022\017\n\007success\030\001 \001(\010\022\017\n\007message" +
      "\030\002 \001(\t\"\034\n\032ThermostatGetStatusRequest\"\241\001\n" +
      "\033ThermostatGetStatusResponse\022\033\n\023current_" +
      "temperature\030\001 \001(\001\022\032\n\022target_temperature\030" +
      "\002 \001(\001\022\'\n\004mode\030\003 \001(\0162\031.smarthome.Thermost" +
      "atMode\022\017\n\007heating\030\004 \001(\010\022\017\n\007cooling\030\005 \001(\010" +
      "*7\n\016ThermostatMode\022\007\n\003OFF\020\000\022\010\n\004HEAT\020\001\022\010\n" +
      "\004COOL\020\002\022\010\n\004AUTO\020\0032\303\003\n\021ThermostatService\022" +
      "Q\n\006TurnOn\022\".smarthome.ThermostatTurnOnRe" +
      "quest\032#.smarthome.ThermostatTurnOnRespon" +
      "se\022T\n\007TurnOff\022#.smarthome.ThermostatTurn" +
      "OffRequest\032$.smarthome.ThermostatTurnOff" +
      "Response\022g\n\024SetTargetTemperature\022&.smart" +
      "home.SetTargetTemperatureRequest\032\'.smart" +
      "home.SetTargetTemperatureResponse\022@\n\007Set" +
      "Mode\022\031.smarthome.SetModeRequest\032\032.smarth" +
      "ome.SetModeResponse\022Z\n\tGetStatus\022%.smart" +
      "home.ThermostatGetStatusRequest\032&.smarth" +
      "ome.ThermostatGetStatusResponseB(\n\023com.s" +
      "marthome.protoB\017ThermostatProtoP\001b\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_smarthome_ThermostatTurnOnRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_smarthome_ThermostatTurnOnRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smarthome_ThermostatTurnOnRequest_descriptor,
        new java.lang.String[] { });
    internal_static_smarthome_ThermostatTurnOnResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_smarthome_ThermostatTurnOnResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smarthome_ThermostatTurnOnResponse_descriptor,
        new java.lang.String[] { "Success", "Message", });
    internal_static_smarthome_ThermostatTurnOffRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_smarthome_ThermostatTurnOffRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smarthome_ThermostatTurnOffRequest_descriptor,
        new java.lang.String[] { });
    internal_static_smarthome_ThermostatTurnOffResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_smarthome_ThermostatTurnOffResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smarthome_ThermostatTurnOffResponse_descriptor,
        new java.lang.String[] { "Success", "Message", });
    internal_static_smarthome_SetTargetTemperatureRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_smarthome_SetTargetTemperatureRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smarthome_SetTargetTemperatureRequest_descriptor,
        new java.lang.String[] { "TargetTemperature", });
    internal_static_smarthome_SetTargetTemperatureResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_smarthome_SetTargetTemperatureResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smarthome_SetTargetTemperatureResponse_descriptor,
        new java.lang.String[] { "Success", "Message", });
    internal_static_smarthome_SetModeRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_smarthome_SetModeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smarthome_SetModeRequest_descriptor,
        new java.lang.String[] { "Mode", });
    internal_static_smarthome_SetModeResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_smarthome_SetModeResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smarthome_SetModeResponse_descriptor,
        new java.lang.String[] { "Success", "Message", });
    internal_static_smarthome_ThermostatGetStatusRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_smarthome_ThermostatGetStatusRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smarthome_ThermostatGetStatusRequest_descriptor,
        new java.lang.String[] { });
    internal_static_smarthome_ThermostatGetStatusResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_smarthome_ThermostatGetStatusResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smarthome_ThermostatGetStatusResponse_descriptor,
        new java.lang.String[] { "CurrentTemperature", "TargetTemperature", "Mode", "Heating", "Cooling", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
