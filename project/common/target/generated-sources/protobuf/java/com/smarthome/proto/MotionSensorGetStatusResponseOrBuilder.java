// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: motionsensor.proto

package com.smarthome.proto;

public interface MotionSensorGetStatusResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:smarthome.MotionSensorGetStatusResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bool motion_detected = 1;</code>
   * @return The motionDetected.
   */
  boolean getMotionDetected();

  /**
   * <pre>
   * timestamp
   * </pre>
   *
   * <code>int64 last_motion_time = 2;</code>
   * @return The lastMotionTime.
   */
  long getLastMotionTime();

  /**
   * <pre>
   * 1-10
   * </pre>
   *
   * <code>int32 sensitivity = 3;</code>
   * @return The sensitivity.
   */
  int getSensitivity();
}
