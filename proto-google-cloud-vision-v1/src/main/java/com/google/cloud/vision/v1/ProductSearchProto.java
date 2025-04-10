/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vision/v1/product_search.proto

package com.google.cloud.vision.v1;

public final class ProductSearchProto {
  private ProductSearchProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vision_v1_ProductSearchParams_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vision_v1_ProductSearchParams_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vision_v1_ProductSearchResults_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vision_v1_ProductSearchResults_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vision_v1_ProductSearchResults_Result_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vision_v1_ProductSearchResults_Result_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vision_v1_ProductSearchResults_ObjectAnnotation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vision_v1_ProductSearchResults_ObjectAnnotation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vision_v1_ProductSearchResults_GroupedResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vision_v1_ProductSearchResults_GroupedResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n+google/cloud/vision/v1/product_search."
          + "proto\022\026google.cloud.vision.v1\032%google/cl"
          + "oud/vision/v1/geometry.proto\0323google/clo"
          + "ud/vision/v1/product_search_service.prot"
          + "o\032\037google/protobuf/timestamp.proto\032\034goog"
          + "le/api/annotations.proto\032\031google/api/res"
          + "ource.proto\"\272\001\n\023ProductSearchParams\022;\n\rb"
          + "ounding_poly\030\t \001(\0132$.google.cloud.vision"
          + ".v1.BoundingPoly\022:\n\013product_set\030\006 \001(\tB%\372"
          + "A\"\n vision.googleapis.com/ProductSet\022\032\n\022"
          + "product_categories\030\007 \003(\t\022\016\n\006filter\030\010 \001(\t"
          + "\"\210\005\n\024ProductSearchResults\022.\n\nindex_time\030"
          + "\002 \001(\0132\032.google.protobuf.Timestamp\022D\n\007res"
          + "ults\030\005 \003(\01323.google.cloud.vision.v1.Prod"
          + "uctSearchResults.Result\022[\n\027product_group"
          + "ed_results\030\006 \003(\0132:.google.cloud.vision.v"
          + "1.ProductSearchResults.GroupedResult\032X\n\006"
          + "Result\0220\n\007product\030\001 \001(\0132\037.google.cloud.v"
          + "ision.v1.Product\022\r\n\005score\030\002 \001(\002\022\r\n\005image"
          + "\030\003 \001(\t\032S\n\020ObjectAnnotation\022\013\n\003mid\030\001 \001(\t\022"
          + "\025\n\rlanguage_code\030\002 \001(\t\022\014\n\004name\030\003 \001(\t\022\r\n\005"
          + "score\030\004 \001(\002\032\355\001\n\rGroupedResult\022;\n\rboundin"
          + "g_poly\030\001 \001(\0132$.google.cloud.vision.v1.Bo"
          + "undingPoly\022D\n\007results\030\002 \003(\01323.google.clo"
          + "ud.vision.v1.ProductSearchResults.Result"
          + "\022Y\n\022object_annotations\030\003 \003(\0132=.google.cl"
          + "oud.vision.v1.ProductSearchResults.Objec"
          + "tAnnotationBz\n\032com.google.cloud.vision.v"
          + "1B\022ProductSearchProtoP\001Z<google.golang.o"
          + "rg/genproto/googleapis/cloud/vision/v1;v"
          + "ision\370\001\001\242\002\004GCVNb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
        descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.cloud.vision.v1.GeometryProto.getDescriptor(),
          com.google.cloud.vision.v1.ProductSearchServiceProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        },
        assigner);
    internal_static_google_cloud_vision_v1_ProductSearchParams_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_vision_v1_ProductSearchParams_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vision_v1_ProductSearchParams_descriptor,
            new java.lang.String[] {
              "BoundingPoly", "ProductSet", "ProductCategories", "Filter",
            });
    internal_static_google_cloud_vision_v1_ProductSearchResults_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_vision_v1_ProductSearchResults_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vision_v1_ProductSearchResults_descriptor,
            new java.lang.String[] {
              "IndexTime", "Results", "ProductGroupedResults",
            });
    internal_static_google_cloud_vision_v1_ProductSearchResults_Result_descriptor =
        internal_static_google_cloud_vision_v1_ProductSearchResults_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_vision_v1_ProductSearchResults_Result_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vision_v1_ProductSearchResults_Result_descriptor,
            new java.lang.String[] {
              "Product", "Score", "Image",
            });
    internal_static_google_cloud_vision_v1_ProductSearchResults_ObjectAnnotation_descriptor =
        internal_static_google_cloud_vision_v1_ProductSearchResults_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_vision_v1_ProductSearchResults_ObjectAnnotation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vision_v1_ProductSearchResults_ObjectAnnotation_descriptor,
            new java.lang.String[] {
              "Mid", "LanguageCode", "Name", "Score",
            });
    internal_static_google_cloud_vision_v1_ProductSearchResults_GroupedResult_descriptor =
        internal_static_google_cloud_vision_v1_ProductSearchResults_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_vision_v1_ProductSearchResults_GroupedResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vision_v1_ProductSearchResults_GroupedResult_descriptor,
            new java.lang.String[] {
              "BoundingPoly", "Results", "ObjectAnnotations",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.cloud.vision.v1.GeometryProto.getDescriptor();
    com.google.cloud.vision.v1.ProductSearchServiceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
