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
// source: google/cloud/vision/v1p3beta1/product_search.proto

package com.google.cloud.vision.v1p3beta1;

public interface ProductSearchResultsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vision.v1p3beta1.ProductSearchResults)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Product category.
   * [Deprecated] Use `product_category`.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p3beta1.ProductSearchCategory category = 1;</code>
   */
  int getCategoryValue();
  /**
   *
   *
   * <pre>
   * Product category.
   * [Deprecated] Use `product_category`.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p3beta1.ProductSearchCategory category = 1;</code>
   */
  com.google.cloud.vision.v1p3beta1.ProductSearchCategory getCategory();

  /**
   *
   *
   * <pre>
   * Product category.
   * Supported values are `bag` and `shoe`.
   * [Deprecated] `product_category` is provided in each Product.
   * </pre>
   *
   * <code>string product_category = 4;</code>
   */
  java.lang.String getProductCategory();
  /**
   *
   *
   * <pre>
   * Product category.
   * Supported values are `bag` and `shoe`.
   * [Deprecated] `product_category` is provided in each Product.
   * </pre>
   *
   * <code>string product_category = 4;</code>
   */
  com.google.protobuf.ByteString getProductCategoryBytes();

  /**
   *
   *
   * <pre>
   * Timestamp of the index which provided these results. Changes made after
   * this time are not reflected in the current results.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp index_time = 2;</code>
   */
  boolean hasIndexTime();
  /**
   *
   *
   * <pre>
   * Timestamp of the index which provided these results. Changes made after
   * this time are not reflected in the current results.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp index_time = 2;</code>
   */
  com.google.protobuf.Timestamp getIndexTime();
  /**
   *
   *
   * <pre>
   * Timestamp of the index which provided these results. Changes made after
   * this time are not reflected in the current results.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp index_time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getIndexTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * List of detected products.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p3beta1.ProductSearchResults.ProductInfo products = 3;
   * </code>
   */
  java.util.List<com.google.cloud.vision.v1p3beta1.ProductSearchResults.ProductInfo>
      getProductsList();
  /**
   *
   *
   * <pre>
   * List of detected products.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p3beta1.ProductSearchResults.ProductInfo products = 3;
   * </code>
   */
  com.google.cloud.vision.v1p3beta1.ProductSearchResults.ProductInfo getProducts(int index);
  /**
   *
   *
   * <pre>
   * List of detected products.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p3beta1.ProductSearchResults.ProductInfo products = 3;
   * </code>
   */
  int getProductsCount();
  /**
   *
   *
   * <pre>
   * List of detected products.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p3beta1.ProductSearchResults.ProductInfo products = 3;
   * </code>
   */
  java.util.List<
          ? extends com.google.cloud.vision.v1p3beta1.ProductSearchResults.ProductInfoOrBuilder>
      getProductsOrBuilderList();
  /**
   *
   *
   * <pre>
   * List of detected products.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p3beta1.ProductSearchResults.ProductInfo products = 3;
   * </code>
   */
  com.google.cloud.vision.v1p3beta1.ProductSearchResults.ProductInfoOrBuilder getProductsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * List of results, one for each product match.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p3beta1.ProductSearchResults.Result results = 5;</code>
   */
  java.util.List<com.google.cloud.vision.v1p3beta1.ProductSearchResults.Result> getResultsList();
  /**
   *
   *
   * <pre>
   * List of results, one for each product match.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p3beta1.ProductSearchResults.Result results = 5;</code>
   */
  com.google.cloud.vision.v1p3beta1.ProductSearchResults.Result getResults(int index);
  /**
   *
   *
   * <pre>
   * List of results, one for each product match.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p3beta1.ProductSearchResults.Result results = 5;</code>
   */
  int getResultsCount();
  /**
   *
   *
   * <pre>
   * List of results, one for each product match.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p3beta1.ProductSearchResults.Result results = 5;</code>
   */
  java.util.List<? extends com.google.cloud.vision.v1p3beta1.ProductSearchResults.ResultOrBuilder>
      getResultsOrBuilderList();
  /**
   *
   *
   * <pre>
   * List of results, one for each product match.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p3beta1.ProductSearchResults.Result results = 5;</code>
   */
  com.google.cloud.vision.v1p3beta1.ProductSearchResults.ResultOrBuilder getResultsOrBuilder(
      int index);
}
