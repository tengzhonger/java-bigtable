/*
 * Copyright 2020 Google LLC
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
// source: google/bigtable/admin/v2/instance.proto

package com.google.bigtable.admin.v2;

public final class InstanceProto {
  private InstanceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_bigtable_admin_v2_Instance_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_admin_v2_Instance_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_bigtable_admin_v2_Instance_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_admin_v2_Instance_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_bigtable_admin_v2_Cluster_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_admin_v2_Cluster_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_bigtable_admin_v2_Cluster_EncryptionConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_admin_v2_Cluster_EncryptionConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_bigtable_admin_v2_AppProfile_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_admin_v2_AppProfile_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_bigtable_admin_v2_AppProfile_MultiClusterRoutingUseAny_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_admin_v2_AppProfile_MultiClusterRoutingUseAny_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_bigtable_admin_v2_AppProfile_SingleClusterRouting_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_admin_v2_AppProfile_SingleClusterRouting_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n\'google/bigtable/admin/v2/instance.prot"
          + "o\022\030google.bigtable.admin.v2\032\037google/api/"
          + "field_behavior.proto\032\031google/api/resourc"
          + "e.proto\032%google/bigtable/admin/v2/common"
          + ".proto\032\037google/protobuf/timestamp.proto\032"
          + "\034google/api/annotations.proto\"\230\004\n\010Instan"
          + "ce\022\021\n\004name\030\001 \001(\tB\003\340A\003\022\031\n\014display_name\030\002 "
          + "\001(\tB\003\340A\002\0227\n\005state\030\003 \001(\0162(.google.bigtabl"
          + "e.admin.v2.Instance.State\0225\n\004type\030\004 \001(\0162"
          + "\'.google.bigtable.admin.v2.Instance.Type"
          + "\022>\n\006labels\030\005 \003(\0132..google.bigtable.admin"
          + ".v2.Instance.LabelsEntry\0224\n\013create_time\030"
          + "\007 \001(\0132\032.google.protobuf.TimestampB\003\340A\003\032-"
          + "\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001("
          + "\t:\0028\001\"5\n\005State\022\023\n\017STATE_NOT_KNOWN\020\000\022\t\n\005R"
          + "EADY\020\001\022\014\n\010CREATING\020\002\"=\n\004Type\022\024\n\020TYPE_UNS"
          + "PECIFIED\020\000\022\016\n\nPRODUCTION\020\001\022\017\n\013DEVELOPMEN"
          + "T\020\002:S\352AP\n%bigtableadmin.googleapis.com/I"
          + "nstance\022\'projects/{project}/instances/{i"
          + "nstance}\"\322\004\n\007Cluster\022\021\n\004name\030\001 \001(\tB\003\340A\003\022"
          + "8\n\010location\030\002 \001(\tB&\372A#\n!locations.google"
          + "apis.com/Location\022;\n\005state\030\003 \001(\0162\'.googl"
          + "e.bigtable.admin.v2.Cluster.StateB\003\340A\003\022\030"
          + "\n\013serve_nodes\030\004 \001(\005B\003\340A\002\022C\n\024default_stor"
          + "age_type\030\005 \001(\0162%.google.bigtable.admin.v"
          + "2.StorageType\022R\n\021encryption_config\030\006 \001(\013"
          + "22.google.bigtable.admin.v2.Cluster.Encr"
          + "yptionConfigB\003\340A\005\032P\n\020EncryptionConfig\022<\n"
          + "\014kms_key_name\030\001 \001(\tB&\372A#\n!cloudkms.googl"
          + "eapis.com/CryptoKey\"Q\n\005State\022\023\n\017STATE_NO"
          + "T_KNOWN\020\000\022\t\n\005READY\020\001\022\014\n\010CREATING\020\002\022\014\n\010RE"
          + "SIZING\020\003\022\014\n\010DISABLED\020\004:e\352Ab\n$bigtableadm"
          + "in.googleapis.com/Cluster\022:projects/{pro"
          + "ject}/instances/{instance}/clusters/{clu"
          + "ster}\"\210\004\n\nAppProfile\022\014\n\004name\030\001 \001(\t\022\014\n\004et"
          + "ag\030\002 \001(\t\022\023\n\013description\030\003 \001(\t\022g\n\035multi_c"
          + "luster_routing_use_any\030\005 \001(\0132>.google.bi"
          + "gtable.admin.v2.AppProfile.MultiClusterR"
          + "outingUseAnyH\000\022[\n\026single_cluster_routing"
          + "\030\006 \001(\01329.google.bigtable.admin.v2.AppPro"
          + "file.SingleClusterRoutingH\000\0320\n\031MultiClus"
          + "terRoutingUseAny\022\023\n\013cluster_ids\030\001 \003(\t\032N\n"
          + "\024SingleClusterRouting\022\022\n\ncluster_id\030\001 \001("
          + "\t\022\"\n\032allow_transactional_writes\030\002 \001(\010:o\352"
          + "Al\n\'bigtableadmin.googleapis.com/AppProf"
          + "ile\022Aprojects/{project}/instances/{insta"
          + "nce}/appProfiles/{app_profile}B\020\n\016routin"
          + "g_policyB\320\002\n\034com.google.bigtable.admin.v"
          + "2B\rInstanceProtoP\001Z=google.golang.org/ge"
          + "nproto/googleapis/bigtable/admin/v2;admi"
          + "n\252\002\036Google.Cloud.Bigtable.Admin.V2\312\002\036Goo"
          + "gle\\Cloud\\Bigtable\\Admin\\V2\352\002\"Google::Cl"
          + "oud::Bigtable::Admin::V2\352Ax\n!cloudkms.go"
          + "ogleapis.com/CryptoKey\022Sprojects/{projec"
          + "t}/locations/{location}/keyRings/{key_ri"
          + "ng}/cryptoKeys/{crypto_key}b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.bigtable.admin.v2.CommonProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.api.AnnotationsProto.getDescriptor(),
            });
    internal_static_google_bigtable_admin_v2_Instance_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_bigtable_admin_v2_Instance_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_bigtable_admin_v2_Instance_descriptor,
            new java.lang.String[] {
              "Name", "DisplayName", "State", "Type", "Labels", "CreateTime",
            });
    internal_static_google_bigtable_admin_v2_Instance_LabelsEntry_descriptor =
        internal_static_google_bigtable_admin_v2_Instance_descriptor.getNestedTypes().get(0);
    internal_static_google_bigtable_admin_v2_Instance_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_bigtable_admin_v2_Instance_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_bigtable_admin_v2_Cluster_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_bigtable_admin_v2_Cluster_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_bigtable_admin_v2_Cluster_descriptor,
            new java.lang.String[] {
              "Name", "Location", "State", "ServeNodes", "DefaultStorageType", "EncryptionConfig",
            });
    internal_static_google_bigtable_admin_v2_Cluster_EncryptionConfig_descriptor =
        internal_static_google_bigtable_admin_v2_Cluster_descriptor.getNestedTypes().get(0);
    internal_static_google_bigtable_admin_v2_Cluster_EncryptionConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_bigtable_admin_v2_Cluster_EncryptionConfig_descriptor,
            new java.lang.String[] {
              "KmsKeyName",
            });
    internal_static_google_bigtable_admin_v2_AppProfile_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_bigtable_admin_v2_AppProfile_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_bigtable_admin_v2_AppProfile_descriptor,
            new java.lang.String[] {
              "Name",
              "Etag",
              "Description",
              "MultiClusterRoutingUseAny",
              "SingleClusterRouting",
              "RoutingPolicy",
            });
    internal_static_google_bigtable_admin_v2_AppProfile_MultiClusterRoutingUseAny_descriptor =
        internal_static_google_bigtable_admin_v2_AppProfile_descriptor.getNestedTypes().get(0);
    internal_static_google_bigtable_admin_v2_AppProfile_MultiClusterRoutingUseAny_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_bigtable_admin_v2_AppProfile_MultiClusterRoutingUseAny_descriptor,
            new java.lang.String[] {
              "ClusterIds",
            });
    internal_static_google_bigtable_admin_v2_AppProfile_SingleClusterRouting_descriptor =
        internal_static_google_bigtable_admin_v2_AppProfile_descriptor.getNestedTypes().get(1);
    internal_static_google_bigtable_admin_v2_AppProfile_SingleClusterRouting_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_bigtable_admin_v2_AppProfile_SingleClusterRouting_descriptor,
            new java.lang.String[] {
              "ClusterId", "AllowTransactionalWrites",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceDefinition);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.bigtable.admin.v2.CommonProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
