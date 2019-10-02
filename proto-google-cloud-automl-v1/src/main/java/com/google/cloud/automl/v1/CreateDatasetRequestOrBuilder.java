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
// source: google/cloud/automl/v1/service.proto

package com.google.cloud.automl.v1;

public interface CreateDatasetRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.automl.v1.CreateDatasetRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The resource name of the project to create the dataset for.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * The resource name of the project to create the dataset for.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * The dataset to create.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.Dataset dataset = 2;</code>
   */
  boolean hasDataset();
  /**
   *
   *
   * <pre>
   * The dataset to create.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.Dataset dataset = 2;</code>
   */
  com.google.cloud.automl.v1.Dataset getDataset();
  /**
   *
   *
   * <pre>
   * The dataset to create.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.Dataset dataset = 2;</code>
   */
  com.google.cloud.automl.v1.DatasetOrBuilder getDatasetOrBuilder();
}