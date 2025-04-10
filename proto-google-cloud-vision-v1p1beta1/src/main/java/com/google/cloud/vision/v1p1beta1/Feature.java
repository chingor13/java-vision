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
// source: google/cloud/vision/v1p1beta1/image_annotator.proto

package com.google.cloud.vision.v1p1beta1;

/**
 *
 *
 * <pre>
 * Users describe the type of Google Cloud Vision API tasks to perform over
 * images by using *Feature*s. Each Feature indicates a type of image
 * detection task to perform. Features encode the Cloud Vision API
 * vertical to operate on and the number of top-scoring results to return.
 * </pre>
 *
 * Protobuf type {@code google.cloud.vision.v1p1beta1.Feature}
 */
public final class Feature extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.vision.v1p1beta1.Feature)
    FeatureOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Feature.newBuilder() to construct.
  private Feature(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Feature() {
    type_ = 0;
    model_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private Feature(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8:
            {
              int rawValue = input.readEnum();

              type_ = rawValue;
              break;
            }
          case 16:
            {
              maxResults_ = input.readInt32();
              break;
            }
          case 26:
            {
              java.lang.String s = input.readStringRequireUtf8();

              model_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.vision.v1p1beta1.ImageAnnotatorProto
        .internal_static_google_cloud_vision_v1p1beta1_Feature_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.vision.v1p1beta1.ImageAnnotatorProto
        .internal_static_google_cloud_vision_v1p1beta1_Feature_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.vision.v1p1beta1.Feature.class,
            com.google.cloud.vision.v1p1beta1.Feature.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Type of image feature.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.vision.v1p1beta1.Feature.Type}
   */
  public enum Type implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Unspecified feature type.
     * </pre>
     *
     * <code>TYPE_UNSPECIFIED = 0;</code>
     */
    TYPE_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * Run face detection.
     * </pre>
     *
     * <code>FACE_DETECTION = 1;</code>
     */
    FACE_DETECTION(1),
    /**
     *
     *
     * <pre>
     * Run landmark detection.
     * </pre>
     *
     * <code>LANDMARK_DETECTION = 2;</code>
     */
    LANDMARK_DETECTION(2),
    /**
     *
     *
     * <pre>
     * Run logo detection.
     * </pre>
     *
     * <code>LOGO_DETECTION = 3;</code>
     */
    LOGO_DETECTION(3),
    /**
     *
     *
     * <pre>
     * Run label detection.
     * </pre>
     *
     * <code>LABEL_DETECTION = 4;</code>
     */
    LABEL_DETECTION(4),
    /**
     *
     *
     * <pre>
     * Run OCR.
     * </pre>
     *
     * <code>TEXT_DETECTION = 5;</code>
     */
    TEXT_DETECTION(5),
    /**
     *
     *
     * <pre>
     * Run dense text document OCR. Takes precedence when both
     * DOCUMENT_TEXT_DETECTION and TEXT_DETECTION are present.
     * </pre>
     *
     * <code>DOCUMENT_TEXT_DETECTION = 11;</code>
     */
    DOCUMENT_TEXT_DETECTION(11),
    /**
     *
     *
     * <pre>
     * Run computer vision models to compute image safe-search properties.
     * </pre>
     *
     * <code>SAFE_SEARCH_DETECTION = 6;</code>
     */
    SAFE_SEARCH_DETECTION(6),
    /**
     *
     *
     * <pre>
     * Compute a set of image properties, such as the image's dominant colors.
     * </pre>
     *
     * <code>IMAGE_PROPERTIES = 7;</code>
     */
    IMAGE_PROPERTIES(7),
    /**
     *
     *
     * <pre>
     * Run crop hints.
     * </pre>
     *
     * <code>CROP_HINTS = 9;</code>
     */
    CROP_HINTS(9),
    /**
     *
     *
     * <pre>
     * Run web detection.
     * </pre>
     *
     * <code>WEB_DETECTION = 10;</code>
     */
    WEB_DETECTION(10),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Unspecified feature type.
     * </pre>
     *
     * <code>TYPE_UNSPECIFIED = 0;</code>
     */
    public static final int TYPE_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * Run face detection.
     * </pre>
     *
     * <code>FACE_DETECTION = 1;</code>
     */
    public static final int FACE_DETECTION_VALUE = 1;
    /**
     *
     *
     * <pre>
     * Run landmark detection.
     * </pre>
     *
     * <code>LANDMARK_DETECTION = 2;</code>
     */
    public static final int LANDMARK_DETECTION_VALUE = 2;
    /**
     *
     *
     * <pre>
     * Run logo detection.
     * </pre>
     *
     * <code>LOGO_DETECTION = 3;</code>
     */
    public static final int LOGO_DETECTION_VALUE = 3;
    /**
     *
     *
     * <pre>
     * Run label detection.
     * </pre>
     *
     * <code>LABEL_DETECTION = 4;</code>
     */
    public static final int LABEL_DETECTION_VALUE = 4;
    /**
     *
     *
     * <pre>
     * Run OCR.
     * </pre>
     *
     * <code>TEXT_DETECTION = 5;</code>
     */
    public static final int TEXT_DETECTION_VALUE = 5;
    /**
     *
     *
     * <pre>
     * Run dense text document OCR. Takes precedence when both
     * DOCUMENT_TEXT_DETECTION and TEXT_DETECTION are present.
     * </pre>
     *
     * <code>DOCUMENT_TEXT_DETECTION = 11;</code>
     */
    public static final int DOCUMENT_TEXT_DETECTION_VALUE = 11;
    /**
     *
     *
     * <pre>
     * Run computer vision models to compute image safe-search properties.
     * </pre>
     *
     * <code>SAFE_SEARCH_DETECTION = 6;</code>
     */
    public static final int SAFE_SEARCH_DETECTION_VALUE = 6;
    /**
     *
     *
     * <pre>
     * Compute a set of image properties, such as the image's dominant colors.
     * </pre>
     *
     * <code>IMAGE_PROPERTIES = 7;</code>
     */
    public static final int IMAGE_PROPERTIES_VALUE = 7;
    /**
     *
     *
     * <pre>
     * Run crop hints.
     * </pre>
     *
     * <code>CROP_HINTS = 9;</code>
     */
    public static final int CROP_HINTS_VALUE = 9;
    /**
     *
     *
     * <pre>
     * Run web detection.
     * </pre>
     *
     * <code>WEB_DETECTION = 10;</code>
     */
    public static final int WEB_DETECTION_VALUE = 10;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /** @deprecated Use {@link #forNumber(int)} instead. */
    @java.lang.Deprecated
    public static Type valueOf(int value) {
      return forNumber(value);
    }

    public static Type forNumber(int value) {
      switch (value) {
        case 0:
          return TYPE_UNSPECIFIED;
        case 1:
          return FACE_DETECTION;
        case 2:
          return LANDMARK_DETECTION;
        case 3:
          return LOGO_DETECTION;
        case 4:
          return LABEL_DETECTION;
        case 5:
          return TEXT_DETECTION;
        case 11:
          return DOCUMENT_TEXT_DETECTION;
        case 6:
          return SAFE_SEARCH_DETECTION;
        case 7:
          return IMAGE_PROPERTIES;
        case 9:
          return CROP_HINTS;
        case 10:
          return WEB_DETECTION;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Type> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<Type> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Type>() {
          public Type findValueByNumber(int number) {
            return Type.forNumber(number);
          }
        };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.cloud.vision.v1p1beta1.Feature.getDescriptor().getEnumTypes().get(0);
    }

    private static final Type[] VALUES = values();

    public static Type valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Type(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.vision.v1p1beta1.Feature.Type)
  }

  public static final int TYPE_FIELD_NUMBER = 1;
  private int type_;
  /**
   *
   *
   * <pre>
   * The feature type.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p1beta1.Feature.Type type = 1;</code>
   */
  public int getTypeValue() {
    return type_;
  }
  /**
   *
   *
   * <pre>
   * The feature type.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p1beta1.Feature.Type type = 1;</code>
   */
  public com.google.cloud.vision.v1p1beta1.Feature.Type getType() {
    @SuppressWarnings("deprecation")
    com.google.cloud.vision.v1p1beta1.Feature.Type result =
        com.google.cloud.vision.v1p1beta1.Feature.Type.valueOf(type_);
    return result == null ? com.google.cloud.vision.v1p1beta1.Feature.Type.UNRECOGNIZED : result;
  }

  public static final int MAX_RESULTS_FIELD_NUMBER = 2;
  private int maxResults_;
  /**
   *
   *
   * <pre>
   * Maximum number of results of this type.
   * </pre>
   *
   * <code>int32 max_results = 2;</code>
   */
  public int getMaxResults() {
    return maxResults_;
  }

  public static final int MODEL_FIELD_NUMBER = 3;
  private volatile java.lang.Object model_;
  /**
   *
   *
   * <pre>
   * Model to use for the feature.
   * Supported values: "builtin/stable" (the default if unset) and
   * "builtin/latest".
   * </pre>
   *
   * <code>string model = 3;</code>
   */
  public java.lang.String getModel() {
    java.lang.Object ref = model_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      model_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Model to use for the feature.
   * Supported values: "builtin/stable" (the default if unset) and
   * "builtin/latest".
   * </pre>
   *
   * <code>string model = 3;</code>
   */
  public com.google.protobuf.ByteString getModelBytes() {
    java.lang.Object ref = model_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      model_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (type_ != com.google.cloud.vision.v1p1beta1.Feature.Type.TYPE_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, type_);
    }
    if (maxResults_ != 0) {
      output.writeInt32(2, maxResults_);
    }
    if (!getModelBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, model_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (type_ != com.google.cloud.vision.v1p1beta1.Feature.Type.TYPE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, type_);
    }
    if (maxResults_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(2, maxResults_);
    }
    if (!getModelBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, model_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.vision.v1p1beta1.Feature)) {
      return super.equals(obj);
    }
    com.google.cloud.vision.v1p1beta1.Feature other =
        (com.google.cloud.vision.v1p1beta1.Feature) obj;

    if (type_ != other.type_) return false;
    if (getMaxResults() != other.getMaxResults()) return false;
    if (!getModel().equals(other.getModel())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    hash = (37 * hash) + MAX_RESULTS_FIELD_NUMBER;
    hash = (53 * hash) + getMaxResults();
    hash = (37 * hash) + MODEL_FIELD_NUMBER;
    hash = (53 * hash) + getModel().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.vision.v1p1beta1.Feature parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vision.v1p1beta1.Feature parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vision.v1p1beta1.Feature parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vision.v1p1beta1.Feature parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vision.v1p1beta1.Feature parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vision.v1p1beta1.Feature parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vision.v1p1beta1.Feature parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.vision.v1p1beta1.Feature parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.vision.v1p1beta1.Feature parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.vision.v1p1beta1.Feature parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.vision.v1p1beta1.Feature parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.vision.v1p1beta1.Feature parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.cloud.vision.v1p1beta1.Feature prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Users describe the type of Google Cloud Vision API tasks to perform over
   * images by using *Feature*s. Each Feature indicates a type of image
   * detection task to perform. Features encode the Cloud Vision API
   * vertical to operate on and the number of top-scoring results to return.
   * </pre>
   *
   * Protobuf type {@code google.cloud.vision.v1p1beta1.Feature}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.vision.v1p1beta1.Feature)
      com.google.cloud.vision.v1p1beta1.FeatureOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.vision.v1p1beta1.ImageAnnotatorProto
          .internal_static_google_cloud_vision_v1p1beta1_Feature_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.vision.v1p1beta1.ImageAnnotatorProto
          .internal_static_google_cloud_vision_v1p1beta1_Feature_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.vision.v1p1beta1.Feature.class,
              com.google.cloud.vision.v1p1beta1.Feature.Builder.class);
    }

    // Construct using com.google.cloud.vision.v1p1beta1.Feature.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      type_ = 0;

      maxResults_ = 0;

      model_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.vision.v1p1beta1.ImageAnnotatorProto
          .internal_static_google_cloud_vision_v1p1beta1_Feature_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.vision.v1p1beta1.Feature getDefaultInstanceForType() {
      return com.google.cloud.vision.v1p1beta1.Feature.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.vision.v1p1beta1.Feature build() {
      com.google.cloud.vision.v1p1beta1.Feature result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.vision.v1p1beta1.Feature buildPartial() {
      com.google.cloud.vision.v1p1beta1.Feature result =
          new com.google.cloud.vision.v1p1beta1.Feature(this);
      result.type_ = type_;
      result.maxResults_ = maxResults_;
      result.model_ = model_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.vision.v1p1beta1.Feature) {
        return mergeFrom((com.google.cloud.vision.v1p1beta1.Feature) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.vision.v1p1beta1.Feature other) {
      if (other == com.google.cloud.vision.v1p1beta1.Feature.getDefaultInstance()) return this;
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
      }
      if (other.getMaxResults() != 0) {
        setMaxResults(other.getMaxResults());
      }
      if (!other.getModel().isEmpty()) {
        model_ = other.model_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.vision.v1p1beta1.Feature parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.vision.v1p1beta1.Feature) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int type_ = 0;
    /**
     *
     *
     * <pre>
     * The feature type.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p1beta1.Feature.Type type = 1;</code>
     */
    public int getTypeValue() {
      return type_;
    }
    /**
     *
     *
     * <pre>
     * The feature type.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p1beta1.Feature.Type type = 1;</code>
     */
    public Builder setTypeValue(int value) {
      type_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The feature type.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p1beta1.Feature.Type type = 1;</code>
     */
    public com.google.cloud.vision.v1p1beta1.Feature.Type getType() {
      @SuppressWarnings("deprecation")
      com.google.cloud.vision.v1p1beta1.Feature.Type result =
          com.google.cloud.vision.v1p1beta1.Feature.Type.valueOf(type_);
      return result == null ? com.google.cloud.vision.v1p1beta1.Feature.Type.UNRECOGNIZED : result;
    }
    /**
     *
     *
     * <pre>
     * The feature type.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p1beta1.Feature.Type type = 1;</code>
     */
    public Builder setType(com.google.cloud.vision.v1p1beta1.Feature.Type value) {
      if (value == null) {
        throw new NullPointerException();
      }

      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The feature type.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p1beta1.Feature.Type type = 1;</code>
     */
    public Builder clearType() {

      type_ = 0;
      onChanged();
      return this;
    }

    private int maxResults_;
    /**
     *
     *
     * <pre>
     * Maximum number of results of this type.
     * </pre>
     *
     * <code>int32 max_results = 2;</code>
     */
    public int getMaxResults() {
      return maxResults_;
    }
    /**
     *
     *
     * <pre>
     * Maximum number of results of this type.
     * </pre>
     *
     * <code>int32 max_results = 2;</code>
     */
    public Builder setMaxResults(int value) {

      maxResults_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Maximum number of results of this type.
     * </pre>
     *
     * <code>int32 max_results = 2;</code>
     */
    public Builder clearMaxResults() {

      maxResults_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object model_ = "";
    /**
     *
     *
     * <pre>
     * Model to use for the feature.
     * Supported values: "builtin/stable" (the default if unset) and
     * "builtin/latest".
     * </pre>
     *
     * <code>string model = 3;</code>
     */
    public java.lang.String getModel() {
      java.lang.Object ref = model_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        model_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Model to use for the feature.
     * Supported values: "builtin/stable" (the default if unset) and
     * "builtin/latest".
     * </pre>
     *
     * <code>string model = 3;</code>
     */
    public com.google.protobuf.ByteString getModelBytes() {
      java.lang.Object ref = model_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        model_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Model to use for the feature.
     * Supported values: "builtin/stable" (the default if unset) and
     * "builtin/latest".
     * </pre>
     *
     * <code>string model = 3;</code>
     */
    public Builder setModel(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      model_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Model to use for the feature.
     * Supported values: "builtin/stable" (the default if unset) and
     * "builtin/latest".
     * </pre>
     *
     * <code>string model = 3;</code>
     */
    public Builder clearModel() {

      model_ = getDefaultInstance().getModel();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Model to use for the feature.
     * Supported values: "builtin/stable" (the default if unset) and
     * "builtin/latest".
     * </pre>
     *
     * <code>string model = 3;</code>
     */
    public Builder setModelBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      model_ = value;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.vision.v1p1beta1.Feature)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.vision.v1p1beta1.Feature)
  private static final com.google.cloud.vision.v1p1beta1.Feature DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.vision.v1p1beta1.Feature();
  }

  public static com.google.cloud.vision.v1p1beta1.Feature getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Feature> PARSER =
      new com.google.protobuf.AbstractParser<Feature>() {
        @java.lang.Override
        public Feature parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new Feature(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<Feature> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Feature> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.vision.v1p1beta1.Feature getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
