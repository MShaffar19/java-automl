// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/automl/v1beta1/dataset.proto

package com.google.cloud.automl.v1beta1;

public interface AnnotationSpecOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.automl.v1beta1.AnnotationSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Resource name of the annotation spec.
   * Form:
   * 'projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/annotationSpecs/{annotation_spec_id}'
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. Resource name of the annotation spec.
   * Form:
   * 'projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/annotationSpecs/{annotation_spec_id}'
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required.
   * The name of the annotation spec to show in the interface. The name can be
   * up to 32 characters long and can consist only of ASCII Latin letters A-Z
   * and a-z, underscores
   * (_), and ASCII digits 0-9.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Required.
   * The name of the annotation spec to show in the interface. The name can be
   * up to 32 characters long and can consist only of ASCII Latin letters A-Z
   * and a-z, underscores
   * (_), and ASCII digits 0-9.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. The number of examples in the parent dataset
   * labeled by the annotation spec.
   * </pre>
   *
   * <code>int32 example_count = 9;</code>
   */
  int getExampleCount();
}
