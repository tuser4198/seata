// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: abstractTransactionResponse.proto

package io.seata.core.protocol.protobuf;

public final class AbstractTransactionResponse {
  private AbstractTransactionResponse() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_seata_protocol_protobuf_AbstractTransactionResponseProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_seata_protocol_protobuf_AbstractTransactionResponseProto_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!abstractTransactionResponse.proto\022\032io." +
      "seata.protocol.protobuf\032\033abstractResultM" +
      "essage.proto\032\036transactionExceptionCode.p" +
      "roto\"\326\001\n AbstractTransactionResponseProt" +
      "o\022U\n\025abstractResultMessage\030\001 \001(\01326.io.se" +
      "ata.protocol.protobuf.AbstractResultMess" +
      "ageProto\022[\n\030transactionExceptionCode\030\002 \001" +
      "(\01629.io.seata.protocol.protobuf.Transact" +
      "ionExceptionCodeProtoB@\n\037io.seata.core.p" +
      "rotocol.protobufB\033AbstractTransactionRes" +
      "ponseP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.seata.core.protocol.protobuf.AbstractResultMessage.getDescriptor(),
          io.seata.core.protocol.protobuf.TransactionExceptionCode.getDescriptor(),
        }, assigner);
    internal_static_io_seata_protocol_protobuf_AbstractTransactionResponseProto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_io_seata_protocol_protobuf_AbstractTransactionResponseProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_seata_protocol_protobuf_AbstractTransactionResponseProto_descriptor,
        new java.lang.String[] { "AbstractResultMessage", "TransactionExceptionCode", });
    io.seata.core.protocol.protobuf.AbstractResultMessage.getDescriptor();
    io.seata.core.protocol.protobuf.TransactionExceptionCode.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
