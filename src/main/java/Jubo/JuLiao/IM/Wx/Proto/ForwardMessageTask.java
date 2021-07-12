// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ForwardMessageTask.proto

package Jubo.JuLiao.IM.Wx.Proto;

public final class ForwardMessageTask {
  private ForwardMessageTask() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ForwardMessageTaskMessageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Jubo.JuLiao.IM.Wx.Proto.ForwardMessageTaskMessage)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * 消息Id
     * </pre>
     *
     * <code>int64 MsgSrvId = 1;</code>
     */
    long getMsgSrvId();

    /**
     * <pre>
     * </pre>
     *
     * <code>string WeChatId = 2;</code>
     */
    java.lang.String getWeChatId();
    /**
     * <pre>
     * </pre>
     *
     * <code>string WeChatId = 2;</code>
     */
    com.google.protobuf.ByteString
        getWeChatIdBytes();

    /**
     * <pre>
     *目标人群id列表，用逗号,分隔
     * </pre>
     *
     * <code>string FriendIds = 3;</code>
     */
    java.lang.String getFriendIds();
    /**
     * <pre>
     *目标人群id列表，用逗号,分隔
     * </pre>
     *
     * <code>string FriendIds = 3;</code>
     */
    com.google.protobuf.ByteString
        getFriendIdsBytes();

    /**
     * <pre>
     * 附带消息
     * </pre>
     *
     * <code>string ExtMsg = 4;</code>
     */
    java.lang.String getExtMsg();
    /**
     * <pre>
     * 附带消息
     * </pre>
     *
     * <code>string ExtMsg = 4;</code>
     */
    com.google.protobuf.ByteString
        getExtMsgBytes();

    /**
     * <pre>
     * 转发消息的会话
     * </pre>
     *
     * <code>string Talker = 5;</code>
     */
    java.lang.String getTalker();
    /**
     * <pre>
     * 转发消息的会话
     * </pre>
     *
     * <code>string Talker = 5;</code>
     */
    com.google.protobuf.ByteString
        getTalkerBytes();

    /**
     * <pre>
     *任务id
     * </pre>
     *
     * <code>int64 TaskId = 6;</code>
     */
    long getTaskId();
  }
  /**
   * Protobuf type {@code Jubo.JuLiao.IM.Wx.Proto.ForwardMessageTaskMessage}
   */
  public  static final class ForwardMessageTaskMessage extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Jubo.JuLiao.IM.Wx.Proto.ForwardMessageTaskMessage)
      ForwardMessageTaskMessageOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ForwardMessageTaskMessage.newBuilder() to construct.
    private ForwardMessageTaskMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ForwardMessageTaskMessage() {
      msgSrvId_ = 0L;
      weChatId_ = "";
      friendIds_ = "";
      extMsg_ = "";
      talker_ = "";
      taskId_ = 0L;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ForwardMessageTaskMessage(
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
            default: {
              if (!parseUnknownFieldProto3(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {

              msgSrvId_ = input.readInt64();
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              weChatId_ = s;
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              friendIds_ = s;
              break;
            }
            case 34: {
              java.lang.String s = input.readStringRequireUtf8();

              extMsg_ = s;
              break;
            }
            case 42: {
              java.lang.String s = input.readStringRequireUtf8();

              talker_ = s;
              break;
            }
            case 48: {

              taskId_ = input.readInt64();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Jubo.JuLiao.IM.Wx.Proto.ForwardMessageTask.internal_static_Jubo_JuLiao_IM_Wx_Proto_ForwardMessageTaskMessage_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Jubo.JuLiao.IM.Wx.Proto.ForwardMessageTask.internal_static_Jubo_JuLiao_IM_Wx_Proto_ForwardMessageTaskMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Jubo.JuLiao.IM.Wx.Proto.ForwardMessageTask.ForwardMessageTaskMessage.class, Jubo.JuLiao.IM.Wx.Proto.ForwardMessageTask.ForwardMessageTaskMessage.Builder.class);
    }

    public static final int MSGSRVID_FIELD_NUMBER = 1;
    private long msgSrvId_;
    /**
     * <pre>
     * 消息Id
     * </pre>
     *
     * <code>int64 MsgSrvId = 1;</code>
     */
    public long getMsgSrvId() {
      return msgSrvId_;
    }

    public static final int WECHATID_FIELD_NUMBER = 2;
    private volatile java.lang.Object weChatId_;
    /**
     * <pre>
     * </pre>
     *
     * <code>string WeChatId = 2;</code>
     */
    public java.lang.String getWeChatId() {
      java.lang.Object ref = weChatId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        weChatId_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string WeChatId = 2;</code>
     */
    public com.google.protobuf.ByteString
        getWeChatIdBytes() {
      java.lang.Object ref = weChatId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        weChatId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int FRIENDIDS_FIELD_NUMBER = 3;
    private volatile java.lang.Object friendIds_;
    /**
     * <pre>
     *目标人群id列表，用逗号,分隔
     * </pre>
     *
     * <code>string FriendIds = 3;</code>
     */
    public java.lang.String getFriendIds() {
      java.lang.Object ref = friendIds_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        friendIds_ = s;
        return s;
      }
    }
    /**
     * <pre>
     *目标人群id列表，用逗号,分隔
     * </pre>
     *
     * <code>string FriendIds = 3;</code>
     */
    public com.google.protobuf.ByteString
        getFriendIdsBytes() {
      java.lang.Object ref = friendIds_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        friendIds_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int EXTMSG_FIELD_NUMBER = 4;
    private volatile java.lang.Object extMsg_;
    /**
     * <pre>
     * 附带消息
     * </pre>
     *
     * <code>string ExtMsg = 4;</code>
     */
    public java.lang.String getExtMsg() {
      java.lang.Object ref = extMsg_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        extMsg_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * 附带消息
     * </pre>
     *
     * <code>string ExtMsg = 4;</code>
     */
    public com.google.protobuf.ByteString
        getExtMsgBytes() {
      java.lang.Object ref = extMsg_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        extMsg_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TALKER_FIELD_NUMBER = 5;
    private volatile java.lang.Object talker_;
    /**
     * <pre>
     * 转发消息的会话
     * </pre>
     *
     * <code>string Talker = 5;</code>
     */
    public java.lang.String getTalker() {
      java.lang.Object ref = talker_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        talker_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * 转发消息的会话
     * </pre>
     *
     * <code>string Talker = 5;</code>
     */
    public com.google.protobuf.ByteString
        getTalkerBytes() {
      java.lang.Object ref = talker_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        talker_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TASKID_FIELD_NUMBER = 6;
    private long taskId_;
    /**
     * <pre>
     *任务id
     * </pre>
     *
     * <code>int64 TaskId = 6;</code>
     */
    public long getTaskId() {
      return taskId_;
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (msgSrvId_ != 0L) {
        output.writeInt64(1, msgSrvId_);
      }
      if (!getWeChatIdBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, weChatId_);
      }
      if (!getFriendIdsBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, friendIds_);
      }
      if (!getExtMsgBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, extMsg_);
      }
      if (!getTalkerBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 5, talker_);
      }
      if (taskId_ != 0L) {
        output.writeInt64(6, taskId_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (msgSrvId_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(1, msgSrvId_);
      }
      if (!getWeChatIdBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, weChatId_);
      }
      if (!getFriendIdsBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, friendIds_);
      }
      if (!getExtMsgBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, extMsg_);
      }
      if (!getTalkerBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, talker_);
      }
      if (taskId_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(6, taskId_);
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
      if (!(obj instanceof Jubo.JuLiao.IM.Wx.Proto.ForwardMessageTask.ForwardMessageTaskMessage)) {
        return super.equals(obj);
      }
      Jubo.JuLiao.IM.Wx.Proto.ForwardMessageTask.ForwardMessageTaskMessage other = (Jubo.JuLiao.IM.Wx.Proto.ForwardMessageTask.ForwardMessageTaskMessage) obj;

      boolean result = true;
      result = result && (getMsgSrvId()
          == other.getMsgSrvId());
      result = result && getWeChatId()
          .equals(other.getWeChatId());
      result = result && getFriendIds()
          .equals(other.getFriendIds());
      result = result && getExtMsg()
          .equals(other.getExtMsg());
      result = result && getTalker()
          .equals(other.getTalker());
      result = result && (getTaskId()
          == other.getTaskId());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + MSGSRVID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getMsgSrvId());
      hash = (37 * hash) + WECHATID_FIELD_NUMBER;
      hash = (53 * hash) + getWeChatId().hashCode();
      hash = (37 * hash) + FRIENDIDS_FIELD_NUMBER;
      hash = (53 * hash) + getFriendIds().hashCode();
      hash = (37 * hash) + EXTMSG_FIELD_NUMBER;
      hash = (53 * hash) + getExtMsg().hashCode();
      hash = (37 * hash) + TALKER_FIELD_NUMBER;
      hash = (53 * hash) + getTalker().hashCode();
      hash = (37 * hash) + TASKID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getTaskId());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static Jubo.JuLiao.IM.Wx.Proto.ForwardMessageTask.ForwardMessageTaskMessage parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Jubo.JuLiao.IM.Wx.Proto.ForwardMessageTask.ForwardMessageTaskMessage parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Jubo.JuLiao.IM.Wx.Proto.ForwardMessageTask.ForwardMessageTaskMessage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Jubo.JuLiao.IM.Wx.Proto.ForwardMessageTask.ForwardMessageTaskMessage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Jubo.JuLiao.IM.Wx.Proto.ForwardMessageTask.ForwardMessageTaskMessage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Jubo.JuLiao.IM.Wx.Proto.ForwardMessageTask.ForwardMessageTaskMessage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Jubo.JuLiao.IM.Wx.Proto.ForwardMessageTask.ForwardMessageTaskMessage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static Jubo.JuLiao.IM.Wx.Proto.ForwardMessageTask.ForwardMessageTaskMessage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static Jubo.JuLiao.IM.Wx.Proto.ForwardMessageTask.ForwardMessageTaskMessage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static Jubo.JuLiao.IM.Wx.Proto.ForwardMessageTask.ForwardMessageTaskMessage parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static Jubo.JuLiao.IM.Wx.Proto.ForwardMessageTask.ForwardMessageTaskMessage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static Jubo.JuLiao.IM.Wx.Proto.ForwardMessageTask.ForwardMessageTaskMessage parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(Jubo.JuLiao.IM.Wx.Proto.ForwardMessageTask.ForwardMessageTaskMessage prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code Jubo.JuLiao.IM.Wx.Proto.ForwardMessageTaskMessage}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Jubo.JuLiao.IM.Wx.Proto.ForwardMessageTaskMessage)
        Jubo.JuLiao.IM.Wx.Proto.ForwardMessageTask.ForwardMessageTaskMessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return Jubo.JuLiao.IM.Wx.Proto.ForwardMessageTask.internal_static_Jubo_JuLiao_IM_Wx_Proto_ForwardMessageTaskMessage_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return Jubo.JuLiao.IM.Wx.Proto.ForwardMessageTask.internal_static_Jubo_JuLiao_IM_Wx_Proto_ForwardMessageTaskMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                Jubo.JuLiao.IM.Wx.Proto.ForwardMessageTask.ForwardMessageTaskMessage.class, Jubo.JuLiao.IM.Wx.Proto.ForwardMessageTask.ForwardMessageTaskMessage.Builder.class);
      }

      // Construct using Jubo.JuLiao.IM.Wx.Proto.ForwardMessageTask.ForwardMessageTaskMessage.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        msgSrvId_ = 0L;

        weChatId_ = "";

        friendIds_ = "";

        extMsg_ = "";

        talker_ = "";

        taskId_ = 0L;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return Jubo.JuLiao.IM.Wx.Proto.ForwardMessageTask.internal_static_Jubo_JuLiao_IM_Wx_Proto_ForwardMessageTaskMessage_descriptor;
      }

      public Jubo.JuLiao.IM.Wx.Proto.ForwardMessageTask.ForwardMessageTaskMessage getDefaultInstanceForType() {
        return Jubo.JuLiao.IM.Wx.Proto.ForwardMessageTask.ForwardMessageTaskMessage.getDefaultInstance();
      }

      public Jubo.JuLiao.IM.Wx.Proto.ForwardMessageTask.ForwardMessageTaskMessage build() {
        Jubo.JuLiao.IM.Wx.Proto.ForwardMessageTask.ForwardMessageTaskMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public Jubo.JuLiao.IM.Wx.Proto.ForwardMessageTask.ForwardMessageTaskMessage buildPartial() {
        Jubo.JuLiao.IM.Wx.Proto.ForwardMessageTask.ForwardMessageTaskMessage result = new Jubo.JuLiao.IM.Wx.Proto.ForwardMessageTask.ForwardMessageTaskMessage(this);
        result.msgSrvId_ = msgSrvId_;
        result.weChatId_ = weChatId_;
        result.friendIds_ = friendIds_;
        result.extMsg_ = extMsg_;
        result.talker_ = talker_;
        result.taskId_ = taskId_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof Jubo.JuLiao.IM.Wx.Proto.ForwardMessageTask.ForwardMessageTaskMessage) {
          return mergeFrom((Jubo.JuLiao.IM.Wx.Proto.ForwardMessageTask.ForwardMessageTaskMessage)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(Jubo.JuLiao.IM.Wx.Proto.ForwardMessageTask.ForwardMessageTaskMessage other) {
        if (other == Jubo.JuLiao.IM.Wx.Proto.ForwardMessageTask.ForwardMessageTaskMessage.getDefaultInstance()) return this;
        if (other.getMsgSrvId() != 0L) {
          setMsgSrvId(other.getMsgSrvId());
        }
        if (!other.getWeChatId().isEmpty()) {
          weChatId_ = other.weChatId_;
          onChanged();
        }
        if (!other.getFriendIds().isEmpty()) {
          friendIds_ = other.friendIds_;
          onChanged();
        }
        if (!other.getExtMsg().isEmpty()) {
          extMsg_ = other.extMsg_;
          onChanged();
        }
        if (!other.getTalker().isEmpty()) {
          talker_ = other.talker_;
          onChanged();
        }
        if (other.getTaskId() != 0L) {
          setTaskId(other.getTaskId());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        Jubo.JuLiao.IM.Wx.Proto.ForwardMessageTask.ForwardMessageTaskMessage parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (Jubo.JuLiao.IM.Wx.Proto.ForwardMessageTask.ForwardMessageTaskMessage) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private long msgSrvId_ ;
      /**
       * <pre>
       * 消息Id
       * </pre>
       *
       * <code>int64 MsgSrvId = 1;</code>
       */
      public long getMsgSrvId() {
        return msgSrvId_;
      }
      /**
       * <pre>
       * 消息Id
       * </pre>
       *
       * <code>int64 MsgSrvId = 1;</code>
       */
      public Builder setMsgSrvId(long value) {
        
        msgSrvId_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 消息Id
       * </pre>
       *
       * <code>int64 MsgSrvId = 1;</code>
       */
      public Builder clearMsgSrvId() {
        
        msgSrvId_ = 0L;
        onChanged();
        return this;
      }

      private java.lang.Object weChatId_ = "";
      /**
       * <pre>
       * </pre>
       *
       * <code>string WeChatId = 2;</code>
       */
      public java.lang.String getWeChatId() {
        java.lang.Object ref = weChatId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          weChatId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * </pre>
       *
       * <code>string WeChatId = 2;</code>
       */
      public com.google.protobuf.ByteString
          getWeChatIdBytes() {
        java.lang.Object ref = weChatId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          weChatId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * </pre>
       *
       * <code>string WeChatId = 2;</code>
       */
      public Builder setWeChatId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        weChatId_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * </pre>
       *
       * <code>string WeChatId = 2;</code>
       */
      public Builder clearWeChatId() {
        
        weChatId_ = getDefaultInstance().getWeChatId();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * </pre>
       *
       * <code>string WeChatId = 2;</code>
       */
      public Builder setWeChatIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        weChatId_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object friendIds_ = "";
      /**
       * <pre>
       *目标人群id列表，用逗号,分隔
       * </pre>
       *
       * <code>string FriendIds = 3;</code>
       */
      public java.lang.String getFriendIds() {
        java.lang.Object ref = friendIds_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          friendIds_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       *目标人群id列表，用逗号,分隔
       * </pre>
       *
       * <code>string FriendIds = 3;</code>
       */
      public com.google.protobuf.ByteString
          getFriendIdsBytes() {
        java.lang.Object ref = friendIds_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          friendIds_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       *目标人群id列表，用逗号,分隔
       * </pre>
       *
       * <code>string FriendIds = 3;</code>
       */
      public Builder setFriendIds(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        friendIds_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *目标人群id列表，用逗号,分隔
       * </pre>
       *
       * <code>string FriendIds = 3;</code>
       */
      public Builder clearFriendIds() {
        
        friendIds_ = getDefaultInstance().getFriendIds();
        onChanged();
        return this;
      }
      /**
       * <pre>
       *目标人群id列表，用逗号,分隔
       * </pre>
       *
       * <code>string FriendIds = 3;</code>
       */
      public Builder setFriendIdsBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        friendIds_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object extMsg_ = "";
      /**
       * <pre>
       * 附带消息
       * </pre>
       *
       * <code>string ExtMsg = 4;</code>
       */
      public java.lang.String getExtMsg() {
        java.lang.Object ref = extMsg_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          extMsg_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * 附带消息
       * </pre>
       *
       * <code>string ExtMsg = 4;</code>
       */
      public com.google.protobuf.ByteString
          getExtMsgBytes() {
        java.lang.Object ref = extMsg_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          extMsg_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * 附带消息
       * </pre>
       *
       * <code>string ExtMsg = 4;</code>
       */
      public Builder setExtMsg(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        extMsg_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 附带消息
       * </pre>
       *
       * <code>string ExtMsg = 4;</code>
       */
      public Builder clearExtMsg() {
        
        extMsg_ = getDefaultInstance().getExtMsg();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 附带消息
       * </pre>
       *
       * <code>string ExtMsg = 4;</code>
       */
      public Builder setExtMsgBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        extMsg_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object talker_ = "";
      /**
       * <pre>
       * 转发消息的会话
       * </pre>
       *
       * <code>string Talker = 5;</code>
       */
      public java.lang.String getTalker() {
        java.lang.Object ref = talker_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          talker_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * 转发消息的会话
       * </pre>
       *
       * <code>string Talker = 5;</code>
       */
      public com.google.protobuf.ByteString
          getTalkerBytes() {
        java.lang.Object ref = talker_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          talker_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * 转发消息的会话
       * </pre>
       *
       * <code>string Talker = 5;</code>
       */
      public Builder setTalker(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        talker_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 转发消息的会话
       * </pre>
       *
       * <code>string Talker = 5;</code>
       */
      public Builder clearTalker() {
        
        talker_ = getDefaultInstance().getTalker();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 转发消息的会话
       * </pre>
       *
       * <code>string Talker = 5;</code>
       */
      public Builder setTalkerBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        talker_ = value;
        onChanged();
        return this;
      }

      private long taskId_ ;
      /**
       * <pre>
       *任务id
       * </pre>
       *
       * <code>int64 TaskId = 6;</code>
       */
      public long getTaskId() {
        return taskId_;
      }
      /**
       * <pre>
       *任务id
       * </pre>
       *
       * <code>int64 TaskId = 6;</code>
       */
      public Builder setTaskId(long value) {
        
        taskId_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *任务id
       * </pre>
       *
       * <code>int64 TaskId = 6;</code>
       */
      public Builder clearTaskId() {
        
        taskId_ = 0L;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:Jubo.JuLiao.IM.Wx.Proto.ForwardMessageTaskMessage)
    }

    // @@protoc_insertion_point(class_scope:Jubo.JuLiao.IM.Wx.Proto.ForwardMessageTaskMessage)
    private static final Jubo.JuLiao.IM.Wx.Proto.ForwardMessageTask.ForwardMessageTaskMessage DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new Jubo.JuLiao.IM.Wx.Proto.ForwardMessageTask.ForwardMessageTaskMessage();
    }

    public static Jubo.JuLiao.IM.Wx.Proto.ForwardMessageTask.ForwardMessageTaskMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ForwardMessageTaskMessage>
        PARSER = new com.google.protobuf.AbstractParser<ForwardMessageTaskMessage>() {
      public ForwardMessageTaskMessage parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ForwardMessageTaskMessage(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ForwardMessageTaskMessage> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ForwardMessageTaskMessage> getParserForType() {
      return PARSER;
    }

    public Jubo.JuLiao.IM.Wx.Proto.ForwardMessageTask.ForwardMessageTaskMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Jubo_JuLiao_IM_Wx_Proto_ForwardMessageTaskMessage_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Jubo_JuLiao_IM_Wx_Proto_ForwardMessageTaskMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030ForwardMessageTask.proto\022\027Jubo.JuLiao." +
      "IM.Wx.Proto\"\202\001\n\031ForwardMessageTaskMessag" +
      "e\022\020\n\010MsgSrvId\030\001 \001(\003\022\020\n\010WeChatId\030\002 \001(\t\022\021\n" +
      "\tFriendIds\030\003 \001(\t\022\016\n\006ExtMsg\030\004 \001(\t\022\016\n\006Talk" +
      "er\030\005 \001(\t\022\016\n\006TaskId\030\006 \001(\003b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_Jubo_JuLiao_IM_Wx_Proto_ForwardMessageTaskMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Jubo_JuLiao_IM_Wx_Proto_ForwardMessageTaskMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Jubo_JuLiao_IM_Wx_Proto_ForwardMessageTaskMessage_descriptor,
        new java.lang.String[] { "MsgSrvId", "WeChatId", "FriendIds", "ExtMsg", "Talker", "TaskId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}