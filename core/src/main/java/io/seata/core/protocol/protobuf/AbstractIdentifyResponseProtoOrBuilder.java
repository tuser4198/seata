// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: abstractIdentifyResponse.proto

package io.seata.core.protocol.protobuf;

public interface AbstractIdentifyResponseProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:io.seata.protocol.protobuf.AbstractIdentifyResponseProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.io.seata.protocol.protobuf.AbstractResultMessageProto abstractResultMessage = 1;</code>
   */
  boolean hasAbstractResultMessage();
  /**
   * <code>.io.seata.protocol.protobuf.AbstractResultMessageProto abstractResultMessage = 1;</code>
   */
  io.seata.core.protocol.protobuf.AbstractResultMessageProto getAbstractResultMessage();
  /**
   * <code>.io.seata.protocol.protobuf.AbstractResultMessageProto abstractResultMessage = 1;</code>
   */
  io.seata.core.protocol.protobuf.AbstractResultMessageProtoOrBuilder getAbstractResultMessageOrBuilder();

  /**
   * <code>string version = 2;</code>
   */
  java.lang.String getVersion();
  /**
   * <code>string version = 2;</code>
   */
  com.google.protobuf.ByteString
      getVersionBytes();

  /**
   * <code>string extraData = 3;</code>
   */
  java.lang.String getExtraData();
  /**
   * <code>string extraData = 3;</code>
   */
  com.google.protobuf.ByteString
      getExtraDataBytes();

  /**
   * <code>bool identified = 4;</code>
   */
  boolean getIdentified();
}
