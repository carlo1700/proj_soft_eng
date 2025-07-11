// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: blind.proto

package com.smarthome.proto;

public final class BlindProto {
  private BlindProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smarthome_BlindSetUpRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smarthome_BlindSetUpRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smarthome_BlindSetUpResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smarthome_BlindSetUpResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smarthome_BlindSetDownRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smarthome_BlindSetDownRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smarthome_BlindSetDownResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smarthome_BlindSetDownResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smarthome_BlindGetStatusRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smarthome_BlindGetStatusRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smarthome_BlindGetStatusResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smarthome_BlindGetStatusResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013blind.proto\022\tsmarthome\"\023\n\021BlindSetUpRe" +
      "quest\"6\n\022BlindSetUpResponse\022\017\n\007success\030\001" +
      " \001(\010\022\017\n\007message\030\002 \001(\t\"\025\n\023BlindSetDownReq" +
      "uest\"8\n\024BlindSetDownResponse\022\017\n\007success\030" +
      "\001 \001(\010\022\017\n\007message\030\002 \001(\t\"\027\n\025BlindGetStatus" +
      "Request\"\'\n\026BlindGetStatusResponse\022\r\n\005is_" +
      "up\030\001 \001(\0102\362\001\n\014BlindService\022D\n\005SetUp\022\034.sma" +
      "rthome.BlindSetUpRequest\032\035.smarthome.Bli" +
      "ndSetUpResponse\022J\n\007SetDown\022\036.smarthome.B" +
      "lindSetDownRequest\032\037.smarthome.BlindSetD" +
      "ownResponse\022P\n\tGetStatus\022 .smarthome.Bli" +
      "ndGetStatusRequest\032!.smarthome.BlindGetS" +
      "tatusResponseB#\n\023com.smarthome.protoB\nBl" +
      "indProtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_smarthome_BlindSetUpRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_smarthome_BlindSetUpRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smarthome_BlindSetUpRequest_descriptor,
        new java.lang.String[] { });
    internal_static_smarthome_BlindSetUpResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_smarthome_BlindSetUpResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smarthome_BlindSetUpResponse_descriptor,
        new java.lang.String[] { "Success", "Message", });
    internal_static_smarthome_BlindSetDownRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_smarthome_BlindSetDownRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smarthome_BlindSetDownRequest_descriptor,
        new java.lang.String[] { });
    internal_static_smarthome_BlindSetDownResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_smarthome_BlindSetDownResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smarthome_BlindSetDownResponse_descriptor,
        new java.lang.String[] { "Success", "Message", });
    internal_static_smarthome_BlindGetStatusRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_smarthome_BlindGetStatusRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smarthome_BlindGetStatusRequest_descriptor,
        new java.lang.String[] { });
    internal_static_smarthome_BlindGetStatusResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_smarthome_BlindGetStatusResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smarthome_BlindGetStatusResponse_descriptor,
        new java.lang.String[] { "IsUp", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
