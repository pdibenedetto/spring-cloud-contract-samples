// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: beer.proto

package com.example;

public final class Beer {
  private Beer() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_beer_PersonToCheck_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_beer_PersonToCheck_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_beer_Response_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_beer_Response_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\nbeer.proto\022\004beer\"\034\n\rPersonToCheck\022\013\n\003a" +
      "ge\030\001 \001(\005\"a\n\010Response\022.\n\006status\030\001 \001(\0162\036.b" +
      "eer.Response.BeerCheckStatus\"%\n\017BeerChec" +
      "kStatus\022\n\n\006NOT_OK\020\000\022\006\n\002OK\020\0012=\n\013BeerServi" +
      "ce\022.\n\005check\022\023.beer.PersonToCheck\032\016.beer." +
      "Response\"\000B\025\n\013com.exampleB\004BeerP\001b\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_beer_PersonToCheck_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_beer_PersonToCheck_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_beer_PersonToCheck_descriptor,
        new java.lang.String[] { "Age", });
    internal_static_beer_Response_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_beer_Response_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_beer_Response_descriptor,
        new java.lang.String[] { "Status", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}