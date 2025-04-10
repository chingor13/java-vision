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
// source: google/cloud/vision/v1/image_annotator.proto

package com.google.cloud.vision.v1;

public interface SafeSearchAnnotationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vision.v1.SafeSearchAnnotation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Represents the adult content likelihood for the image. Adult content may
   * contain elements such as nudity, pornographic images or cartoons, or
   * sexual activities.
   * </pre>
   *
   * <code>.google.cloud.vision.v1.Likelihood adult = 1;</code>
   */
  int getAdultValue();
  /**
   *
   *
   * <pre>
   * Represents the adult content likelihood for the image. Adult content may
   * contain elements such as nudity, pornographic images or cartoons, or
   * sexual activities.
   * </pre>
   *
   * <code>.google.cloud.vision.v1.Likelihood adult = 1;</code>
   */
  com.google.cloud.vision.v1.Likelihood getAdult();

  /**
   *
   *
   * <pre>
   * Spoof likelihood. The likelihood that an modification
   * was made to the image's canonical version to make it appear
   * funny or offensive.
   * </pre>
   *
   * <code>.google.cloud.vision.v1.Likelihood spoof = 2;</code>
   */
  int getSpoofValue();
  /**
   *
   *
   * <pre>
   * Spoof likelihood. The likelihood that an modification
   * was made to the image's canonical version to make it appear
   * funny or offensive.
   * </pre>
   *
   * <code>.google.cloud.vision.v1.Likelihood spoof = 2;</code>
   */
  com.google.cloud.vision.v1.Likelihood getSpoof();

  /**
   *
   *
   * <pre>
   * Likelihood that this is a medical image.
   * </pre>
   *
   * <code>.google.cloud.vision.v1.Likelihood medical = 3;</code>
   */
  int getMedicalValue();
  /**
   *
   *
   * <pre>
   * Likelihood that this is a medical image.
   * </pre>
   *
   * <code>.google.cloud.vision.v1.Likelihood medical = 3;</code>
   */
  com.google.cloud.vision.v1.Likelihood getMedical();

  /**
   *
   *
   * <pre>
   * Likelihood that this image contains violent content.
   * </pre>
   *
   * <code>.google.cloud.vision.v1.Likelihood violence = 4;</code>
   */
  int getViolenceValue();
  /**
   *
   *
   * <pre>
   * Likelihood that this image contains violent content.
   * </pre>
   *
   * <code>.google.cloud.vision.v1.Likelihood violence = 4;</code>
   */
  com.google.cloud.vision.v1.Likelihood getViolence();

  /**
   *
   *
   * <pre>
   * Likelihood that the request image contains racy content. Racy content may
   * include (but is not limited to) skimpy or sheer clothing, strategically
   * covered nudity, lewd or provocative poses, or close-ups of sensitive
   * body areas.
   * </pre>
   *
   * <code>.google.cloud.vision.v1.Likelihood racy = 9;</code>
   */
  int getRacyValue();
  /**
   *
   *
   * <pre>
   * Likelihood that the request image contains racy content. Racy content may
   * include (but is not limited to) skimpy or sheer clothing, strategically
   * covered nudity, lewd or provocative poses, or close-ups of sensitive
   * body areas.
   * </pre>
   *
   * <code>.google.cloud.vision.v1.Likelihood racy = 9;</code>
   */
  com.google.cloud.vision.v1.Likelihood getRacy();

  /**
   *
   *
   * <pre>
   * Confidence of adult_score. Range [0, 1]. 0 means not confident, 1 means
   * very confident.
   * </pre>
   *
   * <code>float adult_confidence = 16;</code>
   */
  float getAdultConfidence();

  /**
   *
   *
   * <pre>
   * Confidence of spoof_score. Range [0, 1]. 0 means not confident, 1 means
   * very confident.
   * </pre>
   *
   * <code>float spoof_confidence = 18;</code>
   */
  float getSpoofConfidence();

  /**
   *
   *
   * <pre>
   * Confidence of medical_score. Range [0, 1]. 0 means not confident, 1 means
   * very confident.
   * </pre>
   *
   * <code>float medical_confidence = 20;</code>
   */
  float getMedicalConfidence();

  /**
   *
   *
   * <pre>
   * Confidence of violence_score. Range [0, 1]. 0 means not confident, 1 means
   * very confident.
   * </pre>
   *
   * <code>float violence_confidence = 22;</code>
   */
  float getViolenceConfidence();

  /**
   *
   *
   * <pre>
   * Confidence of racy_score. Range [0, 1]. 0 means not confident, 1 means very
   * confident.
   * </pre>
   *
   * <code>float racy_confidence = 24;</code>
   */
  float getRacyConfidence();

  /**
   *
   *
   * <pre>
   * Confidence of nsfw_score. Range [0, 1]. 0 means not confident, 1 means very
   * confident.
   * </pre>
   *
   * <code>float nsfw_confidence = 26;</code>
   */
  float getNsfwConfidence();
}
