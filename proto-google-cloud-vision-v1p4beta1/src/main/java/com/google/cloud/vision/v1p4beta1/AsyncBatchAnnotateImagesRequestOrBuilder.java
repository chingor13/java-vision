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
// source: google/cloud/vision/v1p4beta1/image_annotator.proto

package com.google.cloud.vision.v1p4beta1;

public interface AsyncBatchAnnotateImagesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vision.v1p4beta1.AsyncBatchAnnotateImagesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Individual image annotation requests for this batch.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p4beta1.AnnotateImageRequest requests = 1;</code>
   */
  java.util.List<com.google.cloud.vision.v1p4beta1.AnnotateImageRequest> getRequestsList();
  /**
   *
   *
   * <pre>
   * Individual image annotation requests for this batch.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p4beta1.AnnotateImageRequest requests = 1;</code>
   */
  com.google.cloud.vision.v1p4beta1.AnnotateImageRequest getRequests(int index);
  /**
   *
   *
   * <pre>
   * Individual image annotation requests for this batch.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p4beta1.AnnotateImageRequest requests = 1;</code>
   */
  int getRequestsCount();
  /**
   *
   *
   * <pre>
   * Individual image annotation requests for this batch.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p4beta1.AnnotateImageRequest requests = 1;</code>
   */
  java.util.List<? extends com.google.cloud.vision.v1p4beta1.AnnotateImageRequestOrBuilder>
      getRequestsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Individual image annotation requests for this batch.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p4beta1.AnnotateImageRequest requests = 1;</code>
   */
  com.google.cloud.vision.v1p4beta1.AnnotateImageRequestOrBuilder getRequestsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Required. The desired output location and metadata (e.g. format).
   * </pre>
   *
   * <code>.google.cloud.vision.v1p4beta1.OutputConfig output_config = 2;</code>
   */
  boolean hasOutputConfig();
  /**
   *
   *
   * <pre>
   * Required. The desired output location and metadata (e.g. format).
   * </pre>
   *
   * <code>.google.cloud.vision.v1p4beta1.OutputConfig output_config = 2;</code>
   */
  com.google.cloud.vision.v1p4beta1.OutputConfig getOutputConfig();
  /**
   *
   *
   * <pre>
   * Required. The desired output location and metadata (e.g. format).
   * </pre>
   *
   * <code>.google.cloud.vision.v1p4beta1.OutputConfig output_config = 2;</code>
   */
  com.google.cloud.vision.v1p4beta1.OutputConfigOrBuilder getOutputConfigOrBuilder();
}
