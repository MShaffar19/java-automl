// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/automl/v1beta1/data_stats.proto

package com.google.cloud.automl.v1beta1;

public interface TimestampStatsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.automl.v1beta1.TimestampStats)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The string key is the pre-defined granularity. Currently supported:
   * hour_of_day, day_of_week, month_of_year.
   * Granularities finer that the granularity of timestamp data are not
   * populated (e.g. if timestamps are at day granularity, then hour_of_day
   * is not populated).
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.automl.v1beta1.TimestampStats.GranularStats&gt; granular_stats = 1;
   * </code>
   */
  int getGranularStatsCount();
  /**
   *
   *
   * <pre>
   * The string key is the pre-defined granularity. Currently supported:
   * hour_of_day, day_of_week, month_of_year.
   * Granularities finer that the granularity of timestamp data are not
   * populated (e.g. if timestamps are at day granularity, then hour_of_day
   * is not populated).
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.automl.v1beta1.TimestampStats.GranularStats&gt; granular_stats = 1;
   * </code>
   */
  boolean containsGranularStats(java.lang.String key);
  /** Use {@link #getGranularStatsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.cloud.automl.v1beta1.TimestampStats.GranularStats>
      getGranularStats();
  /**
   *
   *
   * <pre>
   * The string key is the pre-defined granularity. Currently supported:
   * hour_of_day, day_of_week, month_of_year.
   * Granularities finer that the granularity of timestamp data are not
   * populated (e.g. if timestamps are at day granularity, then hour_of_day
   * is not populated).
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.automl.v1beta1.TimestampStats.GranularStats&gt; granular_stats = 1;
   * </code>
   */
  java.util.Map<java.lang.String, com.google.cloud.automl.v1beta1.TimestampStats.GranularStats>
      getGranularStatsMap();
  /**
   *
   *
   * <pre>
   * The string key is the pre-defined granularity. Currently supported:
   * hour_of_day, day_of_week, month_of_year.
   * Granularities finer that the granularity of timestamp data are not
   * populated (e.g. if timestamps are at day granularity, then hour_of_day
   * is not populated).
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.automl.v1beta1.TimestampStats.GranularStats&gt; granular_stats = 1;
   * </code>
   */
  com.google.cloud.automl.v1beta1.TimestampStats.GranularStats getGranularStatsOrDefault(
      java.lang.String key,
      com.google.cloud.automl.v1beta1.TimestampStats.GranularStats defaultValue);
  /**
   *
   *
   * <pre>
   * The string key is the pre-defined granularity. Currently supported:
   * hour_of_day, day_of_week, month_of_year.
   * Granularities finer that the granularity of timestamp data are not
   * populated (e.g. if timestamps are at day granularity, then hour_of_day
   * is not populated).
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.automl.v1beta1.TimestampStats.GranularStats&gt; granular_stats = 1;
   * </code>
   */
  com.google.cloud.automl.v1beta1.TimestampStats.GranularStats getGranularStatsOrThrow(
      java.lang.String key);
}