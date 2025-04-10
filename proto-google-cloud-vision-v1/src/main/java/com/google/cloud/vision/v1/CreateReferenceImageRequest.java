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
// source: google/cloud/vision/v1/product_search_service.proto

package com.google.cloud.vision.v1;

/**
 *
 *
 * <pre>
 * Request message for the `CreateReferenceImage` method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.vision.v1.CreateReferenceImageRequest}
 */
public final class CreateReferenceImageRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.vision.v1.CreateReferenceImageRequest)
    CreateReferenceImageRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateReferenceImageRequest.newBuilder() to construct.
  private CreateReferenceImageRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateReferenceImageRequest() {
    parent_ = "";
    referenceImageId_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private CreateReferenceImageRequest(
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
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              parent_ = s;
              break;
            }
          case 18:
            {
              com.google.cloud.vision.v1.ReferenceImage.Builder subBuilder = null;
              if (referenceImage_ != null) {
                subBuilder = referenceImage_.toBuilder();
              }
              referenceImage_ =
                  input.readMessage(
                      com.google.cloud.vision.v1.ReferenceImage.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(referenceImage_);
                referenceImage_ = subBuilder.buildPartial();
              }

              break;
            }
          case 26:
            {
              java.lang.String s = input.readStringRequireUtf8();

              referenceImageId_ = s;
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
    return com.google.cloud.vision.v1.ProductSearchServiceProto
        .internal_static_google_cloud_vision_v1_CreateReferenceImageRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.vision.v1.ProductSearchServiceProto
        .internal_static_google_cloud_vision_v1_CreateReferenceImageRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.vision.v1.CreateReferenceImageRequest.class,
            com.google.cloud.vision.v1.CreateReferenceImageRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   *
   *
   * <pre>
   * Required. Resource name of the product in which to create the reference image.
   * Format is
   * `projects/PROJECT_ID/locations/LOC_ID/products/PRODUCT_ID`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   */
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. Resource name of the product in which to create the reference image.
   * Format is
   * `projects/PROJECT_ID/locations/LOC_ID/products/PRODUCT_ID`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   */
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REFERENCE_IMAGE_FIELD_NUMBER = 2;
  private com.google.cloud.vision.v1.ReferenceImage referenceImage_;
  /**
   *
   *
   * <pre>
   * Required. The reference image to create.
   * If an image ID is specified, it is ignored.
   * </pre>
   *
   * <code>
   * .google.cloud.vision.v1.ReferenceImage reference_image = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  public boolean hasReferenceImage() {
    return referenceImage_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The reference image to create.
   * If an image ID is specified, it is ignored.
   * </pre>
   *
   * <code>
   * .google.cloud.vision.v1.ReferenceImage reference_image = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  public com.google.cloud.vision.v1.ReferenceImage getReferenceImage() {
    return referenceImage_ == null
        ? com.google.cloud.vision.v1.ReferenceImage.getDefaultInstance()
        : referenceImage_;
  }
  /**
   *
   *
   * <pre>
   * Required. The reference image to create.
   * If an image ID is specified, it is ignored.
   * </pre>
   *
   * <code>
   * .google.cloud.vision.v1.ReferenceImage reference_image = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  public com.google.cloud.vision.v1.ReferenceImageOrBuilder getReferenceImageOrBuilder() {
    return getReferenceImage();
  }

  public static final int REFERENCE_IMAGE_ID_FIELD_NUMBER = 3;
  private volatile java.lang.Object referenceImageId_;
  /**
   *
   *
   * <pre>
   * A user-supplied resource id for the ReferenceImage to be added. If set,
   * the server will attempt to use this value as the resource id. If it is
   * already in use, an error is returned with code ALREADY_EXISTS. Must be at
   * most 128 characters long. It cannot contain the character `/`.
   * </pre>
   *
   * <code>string reference_image_id = 3;</code>
   */
  public java.lang.String getReferenceImageId() {
    java.lang.Object ref = referenceImageId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      referenceImageId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * A user-supplied resource id for the ReferenceImage to be added. If set,
   * the server will attempt to use this value as the resource id. If it is
   * already in use, an error is returned with code ALREADY_EXISTS. Must be at
   * most 128 characters long. It cannot contain the character `/`.
   * </pre>
   *
   * <code>string reference_image_id = 3;</code>
   */
  public com.google.protobuf.ByteString getReferenceImageIdBytes() {
    java.lang.Object ref = referenceImageId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      referenceImageId_ = b;
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
    if (!getParentBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (referenceImage_ != null) {
      output.writeMessage(2, getReferenceImage());
    }
    if (!getReferenceImageIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, referenceImageId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getParentBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (referenceImage_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getReferenceImage());
    }
    if (!getReferenceImageIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, referenceImageId_);
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
    if (!(obj instanceof com.google.cloud.vision.v1.CreateReferenceImageRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.vision.v1.CreateReferenceImageRequest other =
        (com.google.cloud.vision.v1.CreateReferenceImageRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasReferenceImage() != other.hasReferenceImage()) return false;
    if (hasReferenceImage()) {
      if (!getReferenceImage().equals(other.getReferenceImage())) return false;
    }
    if (!getReferenceImageId().equals(other.getReferenceImageId())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasReferenceImage()) {
      hash = (37 * hash) + REFERENCE_IMAGE_FIELD_NUMBER;
      hash = (53 * hash) + getReferenceImage().hashCode();
    }
    hash = (37 * hash) + REFERENCE_IMAGE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getReferenceImageId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.vision.v1.CreateReferenceImageRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vision.v1.CreateReferenceImageRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vision.v1.CreateReferenceImageRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vision.v1.CreateReferenceImageRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vision.v1.CreateReferenceImageRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vision.v1.CreateReferenceImageRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vision.v1.CreateReferenceImageRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.vision.v1.CreateReferenceImageRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.vision.v1.CreateReferenceImageRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.vision.v1.CreateReferenceImageRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.vision.v1.CreateReferenceImageRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.vision.v1.CreateReferenceImageRequest parseFrom(
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

  public static Builder newBuilder(
      com.google.cloud.vision.v1.CreateReferenceImageRequest prototype) {
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
   * Request message for the `CreateReferenceImage` method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.vision.v1.CreateReferenceImageRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.vision.v1.CreateReferenceImageRequest)
      com.google.cloud.vision.v1.CreateReferenceImageRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.vision.v1.ProductSearchServiceProto
          .internal_static_google_cloud_vision_v1_CreateReferenceImageRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.vision.v1.ProductSearchServiceProto
          .internal_static_google_cloud_vision_v1_CreateReferenceImageRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.vision.v1.CreateReferenceImageRequest.class,
              com.google.cloud.vision.v1.CreateReferenceImageRequest.Builder.class);
    }

    // Construct using com.google.cloud.vision.v1.CreateReferenceImageRequest.newBuilder()
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
      parent_ = "";

      if (referenceImageBuilder_ == null) {
        referenceImage_ = null;
      } else {
        referenceImage_ = null;
        referenceImageBuilder_ = null;
      }
      referenceImageId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.vision.v1.ProductSearchServiceProto
          .internal_static_google_cloud_vision_v1_CreateReferenceImageRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.vision.v1.CreateReferenceImageRequest getDefaultInstanceForType() {
      return com.google.cloud.vision.v1.CreateReferenceImageRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.vision.v1.CreateReferenceImageRequest build() {
      com.google.cloud.vision.v1.CreateReferenceImageRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.vision.v1.CreateReferenceImageRequest buildPartial() {
      com.google.cloud.vision.v1.CreateReferenceImageRequest result =
          new com.google.cloud.vision.v1.CreateReferenceImageRequest(this);
      result.parent_ = parent_;
      if (referenceImageBuilder_ == null) {
        result.referenceImage_ = referenceImage_;
      } else {
        result.referenceImage_ = referenceImageBuilder_.build();
      }
      result.referenceImageId_ = referenceImageId_;
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
      if (other instanceof com.google.cloud.vision.v1.CreateReferenceImageRequest) {
        return mergeFrom((com.google.cloud.vision.v1.CreateReferenceImageRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.vision.v1.CreateReferenceImageRequest other) {
      if (other == com.google.cloud.vision.v1.CreateReferenceImageRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasReferenceImage()) {
        mergeReferenceImage(other.getReferenceImage());
      }
      if (!other.getReferenceImageId().isEmpty()) {
        referenceImageId_ = other.referenceImageId_;
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
      com.google.cloud.vision.v1.CreateReferenceImageRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.vision.v1.CreateReferenceImageRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. Resource name of the product in which to create the reference image.
     * Format is
     * `projects/PROJECT_ID/locations/LOC_ID/products/PRODUCT_ID`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Resource name of the product in which to create the reference image.
     * Format is
     * `projects/PROJECT_ID/locations/LOC_ID/products/PRODUCT_ID`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Resource name of the product in which to create the reference image.
     * Format is
     * `projects/PROJECT_ID/locations/LOC_ID/products/PRODUCT_ID`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      parent_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Resource name of the product in which to create the reference image.
     * Format is
     * `projects/PROJECT_ID/locations/LOC_ID/products/PRODUCT_ID`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     */
    public Builder clearParent() {

      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Resource name of the product in which to create the reference image.
     * Format is
     * `projects/PROJECT_ID/locations/LOC_ID/products/PRODUCT_ID`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      parent_ = value;
      onChanged();
      return this;
    }

    private com.google.cloud.vision.v1.ReferenceImage referenceImage_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.vision.v1.ReferenceImage,
            com.google.cloud.vision.v1.ReferenceImage.Builder,
            com.google.cloud.vision.v1.ReferenceImageOrBuilder>
        referenceImageBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The reference image to create.
     * If an image ID is specified, it is ignored.
     * </pre>
     *
     * <code>
     * .google.cloud.vision.v1.ReferenceImage reference_image = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public boolean hasReferenceImage() {
      return referenceImageBuilder_ != null || referenceImage_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. The reference image to create.
     * If an image ID is specified, it is ignored.
     * </pre>
     *
     * <code>
     * .google.cloud.vision.v1.ReferenceImage reference_image = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.vision.v1.ReferenceImage getReferenceImage() {
      if (referenceImageBuilder_ == null) {
        return referenceImage_ == null
            ? com.google.cloud.vision.v1.ReferenceImage.getDefaultInstance()
            : referenceImage_;
      } else {
        return referenceImageBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The reference image to create.
     * If an image ID is specified, it is ignored.
     * </pre>
     *
     * <code>
     * .google.cloud.vision.v1.ReferenceImage reference_image = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setReferenceImage(com.google.cloud.vision.v1.ReferenceImage value) {
      if (referenceImageBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        referenceImage_ = value;
        onChanged();
      } else {
        referenceImageBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The reference image to create.
     * If an image ID is specified, it is ignored.
     * </pre>
     *
     * <code>
     * .google.cloud.vision.v1.ReferenceImage reference_image = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setReferenceImage(
        com.google.cloud.vision.v1.ReferenceImage.Builder builderForValue) {
      if (referenceImageBuilder_ == null) {
        referenceImage_ = builderForValue.build();
        onChanged();
      } else {
        referenceImageBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The reference image to create.
     * If an image ID is specified, it is ignored.
     * </pre>
     *
     * <code>
     * .google.cloud.vision.v1.ReferenceImage reference_image = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeReferenceImage(com.google.cloud.vision.v1.ReferenceImage value) {
      if (referenceImageBuilder_ == null) {
        if (referenceImage_ != null) {
          referenceImage_ =
              com.google.cloud.vision.v1.ReferenceImage.newBuilder(referenceImage_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          referenceImage_ = value;
        }
        onChanged();
      } else {
        referenceImageBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The reference image to create.
     * If an image ID is specified, it is ignored.
     * </pre>
     *
     * <code>
     * .google.cloud.vision.v1.ReferenceImage reference_image = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearReferenceImage() {
      if (referenceImageBuilder_ == null) {
        referenceImage_ = null;
        onChanged();
      } else {
        referenceImage_ = null;
        referenceImageBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The reference image to create.
     * If an image ID is specified, it is ignored.
     * </pre>
     *
     * <code>
     * .google.cloud.vision.v1.ReferenceImage reference_image = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.vision.v1.ReferenceImage.Builder getReferenceImageBuilder() {

      onChanged();
      return getReferenceImageFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The reference image to create.
     * If an image ID is specified, it is ignored.
     * </pre>
     *
     * <code>
     * .google.cloud.vision.v1.ReferenceImage reference_image = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.vision.v1.ReferenceImageOrBuilder getReferenceImageOrBuilder() {
      if (referenceImageBuilder_ != null) {
        return referenceImageBuilder_.getMessageOrBuilder();
      } else {
        return referenceImage_ == null
            ? com.google.cloud.vision.v1.ReferenceImage.getDefaultInstance()
            : referenceImage_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The reference image to create.
     * If an image ID is specified, it is ignored.
     * </pre>
     *
     * <code>
     * .google.cloud.vision.v1.ReferenceImage reference_image = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.vision.v1.ReferenceImage,
            com.google.cloud.vision.v1.ReferenceImage.Builder,
            com.google.cloud.vision.v1.ReferenceImageOrBuilder>
        getReferenceImageFieldBuilder() {
      if (referenceImageBuilder_ == null) {
        referenceImageBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.vision.v1.ReferenceImage,
                com.google.cloud.vision.v1.ReferenceImage.Builder,
                com.google.cloud.vision.v1.ReferenceImageOrBuilder>(
                getReferenceImage(), getParentForChildren(), isClean());
        referenceImage_ = null;
      }
      return referenceImageBuilder_;
    }

    private java.lang.Object referenceImageId_ = "";
    /**
     *
     *
     * <pre>
     * A user-supplied resource id for the ReferenceImage to be added. If set,
     * the server will attempt to use this value as the resource id. If it is
     * already in use, an error is returned with code ALREADY_EXISTS. Must be at
     * most 128 characters long. It cannot contain the character `/`.
     * </pre>
     *
     * <code>string reference_image_id = 3;</code>
     */
    public java.lang.String getReferenceImageId() {
      java.lang.Object ref = referenceImageId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        referenceImageId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A user-supplied resource id for the ReferenceImage to be added. If set,
     * the server will attempt to use this value as the resource id. If it is
     * already in use, an error is returned with code ALREADY_EXISTS. Must be at
     * most 128 characters long. It cannot contain the character `/`.
     * </pre>
     *
     * <code>string reference_image_id = 3;</code>
     */
    public com.google.protobuf.ByteString getReferenceImageIdBytes() {
      java.lang.Object ref = referenceImageId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        referenceImageId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A user-supplied resource id for the ReferenceImage to be added. If set,
     * the server will attempt to use this value as the resource id. If it is
     * already in use, an error is returned with code ALREADY_EXISTS. Must be at
     * most 128 characters long. It cannot contain the character `/`.
     * </pre>
     *
     * <code>string reference_image_id = 3;</code>
     */
    public Builder setReferenceImageId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      referenceImageId_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A user-supplied resource id for the ReferenceImage to be added. If set,
     * the server will attempt to use this value as the resource id. If it is
     * already in use, an error is returned with code ALREADY_EXISTS. Must be at
     * most 128 characters long. It cannot contain the character `/`.
     * </pre>
     *
     * <code>string reference_image_id = 3;</code>
     */
    public Builder clearReferenceImageId() {

      referenceImageId_ = getDefaultInstance().getReferenceImageId();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A user-supplied resource id for the ReferenceImage to be added. If set,
     * the server will attempt to use this value as the resource id. If it is
     * already in use, an error is returned with code ALREADY_EXISTS. Must be at
     * most 128 characters long. It cannot contain the character `/`.
     * </pre>
     *
     * <code>string reference_image_id = 3;</code>
     */
    public Builder setReferenceImageIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      referenceImageId_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.vision.v1.CreateReferenceImageRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.vision.v1.CreateReferenceImageRequest)
  private static final com.google.cloud.vision.v1.CreateReferenceImageRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.vision.v1.CreateReferenceImageRequest();
  }

  public static com.google.cloud.vision.v1.CreateReferenceImageRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateReferenceImageRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateReferenceImageRequest>() {
        @java.lang.Override
        public CreateReferenceImageRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new CreateReferenceImageRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<CreateReferenceImageRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateReferenceImageRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.vision.v1.CreateReferenceImageRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
