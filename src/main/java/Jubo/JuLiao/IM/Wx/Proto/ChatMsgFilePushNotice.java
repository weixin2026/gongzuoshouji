// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ChatMsgFilePushNotice.proto

package Jubo.JuLiao.IM.Wx.Proto;

public final class ChatMsgFilePushNotice {
  private ChatMsgFilePushNotice() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ChatMsgFilePushNoticeMessageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Jubo.JuLiao.IM.Wx.Proto.ChatMsgFilePushNoticeMessage)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * 商家个人微信内部全局唯一识别码
     * </pre>
     *
     * <code>string WeChatId = 1;</code>
     */
    java.lang.String getWeChatId();
    /**
     * <pre>
     * 商家个人微信内部全局唯一识别码
     * </pre>
     *
     * <code>string WeChatId = 1;</code>
     */
    com.google.protobuf.ByteString
        getWeChatIdBytes();

    /**
     * <pre>
     * 消息唯一id
     * </pre>
     *
     * <code>int64 MsgSvrId = 2;</code>
     */
    long getMsgSvrId();

    /**
     * <pre>
     * 消息类型
     * </pre>
     *
     * <code>int32 MsgType = 3;</code>
     */
    int getMsgType();

    /**
     * <pre>
     * </pre>
     *
     * <code>string Url = 4;</code>
     */
    java.lang.String getUrl();
    /**
     * <pre>
     * </pre>
     *
     * <code>string Url = 4;</code>
     */
    com.google.protobuf.ByteString
        getUrlBytes();

    /**
     * <pre>
     * </pre>
     *
     * <code>int64 FileSize = 5;</code>
     */
    long getFileSize();
  }
  /**
   * Protobuf type {@code Jubo.JuLiao.IM.Wx.Proto.ChatMsgFilePushNoticeMessage}
   */
  public  static final class ChatMsgFilePushNoticeMessage extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Jubo.JuLiao.IM.Wx.Proto.ChatMsgFilePushNoticeMessage)
      ChatMsgFilePushNoticeMessageOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ChatMsgFilePushNoticeMessage.newBuilder() to construct.
    private ChatMsgFilePushNoticeMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ChatMsgFilePushNoticeMessage() {
      weChatId_ = "";
      msgSvrId_ = 0L;
      msgType_ = 0;
      url_ = "";
      fileSize_ = 0L;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ChatMsgFilePushNoticeMessage(
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
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              weChatId_ = s;
              break;
            }
            case 16: {

              msgSvrId_ = input.readInt64();
              break;
            }
            case 24: {

              msgType_ = input.readInt32();
              break;
            }
            case 34: {
              java.lang.String s = input.readStringRequireUtf8();

              url_ = s;
              break;
            }
            case 40: {

              fileSize_ = input.readInt64();
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
      return Jubo.JuLiao.IM.Wx.Proto.ChatMsgFilePushNotice.internal_static_Jubo_JuLiao_IM_Wx_Proto_ChatMsgFilePushNoticeMessage_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Jubo.JuLiao.IM.Wx.Proto.ChatMsgFilePushNotice.internal_static_Jubo_JuLiao_IM_Wx_Proto_ChatMsgFilePushNoticeMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Jubo.JuLiao.IM.Wx.Proto.ChatMsgFilePushNotice.ChatMsgFilePushNoticeMessage.class, Jubo.JuLiao.IM.Wx.Proto.ChatMsgFilePushNotice.ChatMsgFilePushNoticeMessage.Builder.class);
    }

    public static final int WECHATID_FIELD_NUMBER = 1;
    private volatile java.lang.Object weChatId_;
    /**
     * <pre>
     * 商家个人微信内部全局唯一识别码
     * </pre>
     *
     * <code>string WeChatId = 1;</code>
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
     * 商家个人微信内部全局唯一识别码
     * </pre>
     *
     * <code>string WeChatId = 1;</code>
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

    public static final int MSGSVRID_FIELD_NUMBER = 2;
    private long msgSvrId_;
    /**
     * <pre>
     * 消息唯一id
     * </pre>
     *
     * <code>int64 MsgSvrId = 2;</code>
     */
    public long getMsgSvrId() {
      return msgSvrId_;
    }

    public static final int MSGTYPE_FIELD_NUMBER = 3;
    private int msgType_;
    /**
     * <pre>
     * 消息类型
     * </pre>
     *
     * <code>int32 MsgType = 3;</code>
     */
    public int getMsgType() {
      return msgType_;
    }

    public static final int URL_FIELD_NUMBER = 4;
    private volatile java.lang.Object url_;
    /**
     * <pre>
     * </pre>
     *
     * <code>string Url = 4;</code>
     */
    public java.lang.String getUrl() {
      java.lang.Object ref = url_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        url_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string Url = 4;</code>
     */
    public com.google.protobuf.ByteString
        getUrlBytes() {
      java.lang.Object ref = url_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        url_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int FILESIZE_FIELD_NUMBER = 5;
    private long fileSize_;
    /**
     * <pre>
     * </pre>
     *
     * <code>int64 FileSize = 5;</code>
     */
    public long getFileSize() {
      return fileSize_;
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
      if (!getWeChatIdBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, weChatId_);
      }
      if (msgSvrId_ != 0L) {
        output.writeInt64(2, msgSvrId_);
      }
      if (msgType_ != 0) {
        output.writeInt32(3, msgType_);
      }
      if (!getUrlBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, url_);
      }
      if (fileSize_ != 0L) {
        output.writeInt64(5, fileSize_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getWeChatIdBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, weChatId_);
      }
      if (msgSvrId_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(2, msgSvrId_);
      }
      if (msgType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, msgType_);
      }
      if (!getUrlBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, url_);
      }
      if (fileSize_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(5, fileSize_);
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
      if (!(obj instanceof Jubo.JuLiao.IM.Wx.Proto.ChatMsgFilePushNotice.ChatMsgFilePushNoticeMessage)) {
        return super.equals(obj);
      }
      Jubo.JuLiao.IM.Wx.Proto.ChatMsgFilePushNotice.ChatMsgFilePushNoticeMessage other = (Jubo.JuLiao.IM.Wx.Proto.ChatMsgFilePushNotice.ChatMsgFilePushNoticeMessage) obj;

      boolean result = true;
      result = result && getWeChatId()
          .equals(other.getWeChatId());
      result = result && (getMsgSvrId()
          == other.getMsgSvrId());
      result = result && (getMsgType()
          == other.getMsgType());
      result = result && getUrl()
          .equals(other.getUrl());
      result = result && (getFileSize()
          == other.getFileSize());
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
      hash = (37 * hash) + WECHATID_FIELD_NUMBER;
      hash = (53 * hash) + getWeChatId().hashCode();
      hash = (37 * hash) + MSGSVRID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getMsgSvrId());
      hash = (37 * hash) + MSGTYPE_FIELD_NUMBER;
      hash = (53 * hash) + getMsgType();
      hash = (37 * hash) + URL_FIELD_NUMBER;
      hash = (53 * hash) + getUrl().hashCode();
      hash = (37 * hash) + FILESIZE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getFileSize());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static Jubo.JuLiao.IM.Wx.Proto.ChatMsgFilePushNotice.ChatMsgFilePushNoticeMessage parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Jubo.JuLiao.IM.Wx.Proto.ChatMsgFilePushNotice.ChatMsgFilePushNoticeMessage parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Jubo.JuLiao.IM.Wx.Proto.ChatMsgFilePushNotice.ChatMsgFilePushNoticeMessage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Jubo.JuLiao.IM.Wx.Proto.ChatMsgFilePushNotice.ChatMsgFilePushNoticeMessage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Jubo.JuLiao.IM.Wx.Proto.ChatMsgFilePushNotice.ChatMsgFilePushNoticeMessage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Jubo.JuLiao.IM.Wx.Proto.ChatMsgFilePushNotice.ChatMsgFilePushNoticeMessage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Jubo.JuLiao.IM.Wx.Proto.ChatMsgFilePushNotice.ChatMsgFilePushNoticeMessage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static Jubo.JuLiao.IM.Wx.Proto.ChatMsgFilePushNotice.ChatMsgFilePushNoticeMessage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static Jubo.JuLiao.IM.Wx.Proto.ChatMsgFilePushNotice.ChatMsgFilePushNoticeMessage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static Jubo.JuLiao.IM.Wx.Proto.ChatMsgFilePushNotice.ChatMsgFilePushNoticeMessage parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static Jubo.JuLiao.IM.Wx.Proto.ChatMsgFilePushNotice.ChatMsgFilePushNoticeMessage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static Jubo.JuLiao.IM.Wx.Proto.ChatMsgFilePushNotice.ChatMsgFilePushNoticeMessage parseFrom(
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
    public static Builder newBuilder(Jubo.JuLiao.IM.Wx.Proto.ChatMsgFilePushNotice.ChatMsgFilePushNoticeMessage prototype) {
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
     * Protobuf type {@code Jubo.JuLiao.IM.Wx.Proto.ChatMsgFilePushNoticeMessage}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Jubo.JuLiao.IM.Wx.Proto.ChatMsgFilePushNoticeMessage)
        Jubo.JuLiao.IM.Wx.Proto.ChatMsgFilePushNotice.ChatMsgFilePushNoticeMessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return Jubo.JuLiao.IM.Wx.Proto.ChatMsgFilePushNotice.internal_static_Jubo_JuLiao_IM_Wx_Proto_ChatMsgFilePushNoticeMessage_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return Jubo.JuLiao.IM.Wx.Proto.ChatMsgFilePushNotice.internal_static_Jubo_JuLiao_IM_Wx_Proto_ChatMsgFilePushNoticeMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                Jubo.JuLiao.IM.Wx.Proto.ChatMsgFilePushNotice.ChatMsgFilePushNoticeMessage.class, Jubo.JuLiao.IM.Wx.Proto.ChatMsgFilePushNotice.ChatMsgFilePushNoticeMessage.Builder.class);
      }

      // Construct using Jubo.JuLiao.IM.Wx.Proto.ChatMsgFilePushNotice.ChatMsgFilePushNoticeMessage.newBuilder()
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
        weChatId_ = "";

        msgSvrId_ = 0L;

        msgType_ = 0;

        url_ = "";

        fileSize_ = 0L;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return Jubo.JuLiao.IM.Wx.Proto.ChatMsgFilePushNotice.internal_static_Jubo_JuLiao_IM_Wx_Proto_ChatMsgFilePushNoticeMessage_descriptor;
      }

      public Jubo.JuLiao.IM.Wx.Proto.ChatMsgFilePushNotice.ChatMsgFilePushNoticeMessage getDefaultInstanceForType() {
        return Jubo.JuLiao.IM.Wx.Proto.ChatMsgFilePushNotice.ChatMsgFilePushNoticeMessage.getDefaultInstance();
      }

      public Jubo.JuLiao.IM.Wx.Proto.ChatMsgFilePushNotice.ChatMsgFilePushNoticeMessage build() {
        Jubo.JuLiao.IM.Wx.Proto.ChatMsgFilePushNotice.ChatMsgFilePushNoticeMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public Jubo.JuLiao.IM.Wx.Proto.ChatMsgFilePushNotice.ChatMsgFilePushNoticeMessage buildPartial() {
        Jubo.JuLiao.IM.Wx.Proto.ChatMsgFilePushNotice.ChatMsgFilePushNoticeMessage result = new Jubo.JuLiao.IM.Wx.Proto.ChatMsgFilePushNotice.ChatMsgFilePushNoticeMessage(this);
        result.weChatId_ = weChatId_;
        result.msgSvrId_ = msgSvrId_;
        result.msgType_ = msgType_;
        result.url_ = url_;
        result.fileSize_ = fileSize_;
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
        if (other instanceof Jubo.JuLiao.IM.Wx.Proto.ChatMsgFilePushNotice.ChatMsgFilePushNoticeMessage) {
          return mergeFrom((Jubo.JuLiao.IM.Wx.Proto.ChatMsgFilePushNotice.ChatMsgFilePushNoticeMessage)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(Jubo.JuLiao.IM.Wx.Proto.ChatMsgFilePushNotice.ChatMsgFilePushNoticeMessage other) {
        if (other == Jubo.JuLiao.IM.Wx.Proto.ChatMsgFilePushNotice.ChatMsgFilePushNoticeMessage.getDefaultInstance()) return this;
        if (!other.getWeChatId().isEmpty()) {
          weChatId_ = other.weChatId_;
          onChanged();
        }
        if (other.getMsgSvrId() != 0L) {
          setMsgSvrId(other.getMsgSvrId());
        }
        if (other.getMsgType() != 0) {
          setMsgType(other.getMsgType());
        }
        if (!other.getUrl().isEmpty()) {
          url_ = other.url_;
          onChanged();
        }
        if (other.getFileSize() != 0L) {
          setFileSize(other.getFileSize());
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
        Jubo.JuLiao.IM.Wx.Proto.ChatMsgFilePushNotice.ChatMsgFilePushNoticeMessage parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (Jubo.JuLiao.IM.Wx.Proto.ChatMsgFilePushNotice.ChatMsgFilePushNoticeMessage) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object weChatId_ = "";
      /**
       * <pre>
       * 商家个人微信内部全局唯一识别码
       * </pre>
       *
       * <code>string WeChatId = 1;</code>
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
       * 商家个人微信内部全局唯一识别码
       * </pre>
       *
       * <code>string WeChatId = 1;</code>
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
       * 商家个人微信内部全局唯一识别码
       * </pre>
       *
       * <code>string WeChatId = 1;</code>
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
       * 商家个人微信内部全局唯一识别码
       * </pre>
       *
       * <code>string WeChatId = 1;</code>
       */
      public Builder clearWeChatId() {
        
        weChatId_ = getDefaultInstance().getWeChatId();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 商家个人微信内部全局唯一识别码
       * </pre>
       *
       * <code>string WeChatId = 1;</code>
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

      private long msgSvrId_ ;
      /**
       * <pre>
       * 消息唯一id
       * </pre>
       *
       * <code>int64 MsgSvrId = 2;</code>
       */
      public long getMsgSvrId() {
        return msgSvrId_;
      }
      /**
       * <pre>
       * 消息唯一id
       * </pre>
       *
       * <code>int64 MsgSvrId = 2;</code>
       */
      public Builder setMsgSvrId(long value) {
        
        msgSvrId_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 消息唯一id
       * </pre>
       *
       * <code>int64 MsgSvrId = 2;</code>
       */
      public Builder clearMsgSvrId() {
        
        msgSvrId_ = 0L;
        onChanged();
        return this;
      }

      private int msgType_ ;
      /**
       * <pre>
       * 消息类型
       * </pre>
       *
       * <code>int32 MsgType = 3;</code>
       */
      public int getMsgType() {
        return msgType_;
      }
      /**
       * <pre>
       * 消息类型
       * </pre>
       *
       * <code>int32 MsgType = 3;</code>
       */
      public Builder setMsgType(int value) {
        
        msgType_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 消息类型
       * </pre>
       *
       * <code>int32 MsgType = 3;</code>
       */
      public Builder clearMsgType() {
        
        msgType_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object url_ = "";
      /**
       * <pre>
       * </pre>
       *
       * <code>string Url = 4;</code>
       */
      public java.lang.String getUrl() {
        java.lang.Object ref = url_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          url_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * </pre>
       *
       * <code>string Url = 4;</code>
       */
      public com.google.protobuf.ByteString
          getUrlBytes() {
        java.lang.Object ref = url_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          url_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * </pre>
       *
       * <code>string Url = 4;</code>
       */
      public Builder setUrl(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        url_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * </pre>
       *
       * <code>string Url = 4;</code>
       */
      public Builder clearUrl() {
        
        url_ = getDefaultInstance().getUrl();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * </pre>
       *
       * <code>string Url = 4;</code>
       */
      public Builder setUrlBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        url_ = value;
        onChanged();
        return this;
      }

      private long fileSize_ ;
      /**
       * <pre>
       * </pre>
       *
       * <code>int64 FileSize = 5;</code>
       */
      public long getFileSize() {
        return fileSize_;
      }
      /**
       * <pre>
       * </pre>
       *
       * <code>int64 FileSize = 5;</code>
       */
      public Builder setFileSize(long value) {
        
        fileSize_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * </pre>
       *
       * <code>int64 FileSize = 5;</code>
       */
      public Builder clearFileSize() {
        
        fileSize_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:Jubo.JuLiao.IM.Wx.Proto.ChatMsgFilePushNoticeMessage)
    }

    // @@protoc_insertion_point(class_scope:Jubo.JuLiao.IM.Wx.Proto.ChatMsgFilePushNoticeMessage)
    private static final Jubo.JuLiao.IM.Wx.Proto.ChatMsgFilePushNotice.ChatMsgFilePushNoticeMessage DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new Jubo.JuLiao.IM.Wx.Proto.ChatMsgFilePushNotice.ChatMsgFilePushNoticeMessage();
    }

    public static Jubo.JuLiao.IM.Wx.Proto.ChatMsgFilePushNotice.ChatMsgFilePushNoticeMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ChatMsgFilePushNoticeMessage>
        PARSER = new com.google.protobuf.AbstractParser<ChatMsgFilePushNoticeMessage>() {
      public ChatMsgFilePushNoticeMessage parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ChatMsgFilePushNoticeMessage(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ChatMsgFilePushNoticeMessage> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ChatMsgFilePushNoticeMessage> getParserForType() {
      return PARSER;
    }

    public Jubo.JuLiao.IM.Wx.Proto.ChatMsgFilePushNotice.ChatMsgFilePushNoticeMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Jubo_JuLiao_IM_Wx_Proto_ChatMsgFilePushNoticeMessage_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Jubo_JuLiao_IM_Wx_Proto_ChatMsgFilePushNoticeMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033ChatMsgFilePushNotice.proto\022\027Jubo.JuLi" +
      "ao.IM.Wx.Proto\032\026TransportMessage.proto\"r" +
      "\n\034ChatMsgFilePushNoticeMessage\022\020\n\010WeChat" +
      "Id\030\001 \001(\t\022\020\n\010MsgSvrId\030\002 \001(\003\022\017\n\007MsgType\030\003 " +
      "\001(\005\022\013\n\003Url\030\004 \001(\t\022\020\n\010FileSize\030\005 \001(\003b\006prot" +
      "o3"
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
          Jubo.JuLiao.IM.Wx.Proto.TransportMessageOuterClass.getDescriptor(),
        }, assigner);
    internal_static_Jubo_JuLiao_IM_Wx_Proto_ChatMsgFilePushNoticeMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Jubo_JuLiao_IM_Wx_Proto_ChatMsgFilePushNoticeMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Jubo_JuLiao_IM_Wx_Proto_ChatMsgFilePushNoticeMessage_descriptor,
        new java.lang.String[] { "WeChatId", "MsgSvrId", "MsgType", "Url", "FileSize", });
    Jubo.JuLiao.IM.Wx.Proto.TransportMessageOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
