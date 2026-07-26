package com.microsoft.clarity.protomodels.mutationpayload;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import defpackage.fr2;
import defpackage.fv4;
import defpackage.h72;
import defpackage.j26;
import defpackage.lu0;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class MutationPayload$ErrorViewAnnotationCommandPayload extends com.google.protobuf.o implements fv4 {
    private static final MutationPayload$ErrorViewAnnotationCommandPayload DEFAULT_INSTANCE;
    public static final int ERRORMESSAGE_FIELD_NUMBER = 2;
    private static volatile j26 PARSER = null;
    public static final int VIEWTYPE_FIELD_NUMBER = 1;
    private int bitField0_;
    private String viewType_ = "";
    private String errorMessage_ = "";

    static {
        MutationPayload$ErrorViewAnnotationCommandPayload mutationPayload$ErrorViewAnnotationCommandPayload = new MutationPayload$ErrorViewAnnotationCommandPayload();
        DEFAULT_INSTANCE = mutationPayload$ErrorViewAnnotationCommandPayload;
        com.google.protobuf.o.registerDefaultInstance(MutationPayload$ErrorViewAnnotationCommandPayload.class, mutationPayload$ErrorViewAnnotationCommandPayload);
    }

    private MutationPayload$ErrorViewAnnotationCommandPayload() {
    }

    private void clearErrorMessage() {
        this.bitField0_ &= -3;
        this.errorMessage_ = getDefaultInstance().getErrorMessage();
    }

    private void clearViewType() {
        this.bitField0_ &= -2;
        this.viewType_ = getDefaultInstance().getViewType();
    }

    public static MutationPayload$ErrorViewAnnotationCommandPayload getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Z newBuilder() {
        return (Z) DEFAULT_INSTANCE.createBuilder();
    }

    public static MutationPayload$ErrorViewAnnotationCommandPayload parseDelimitedFrom(InputStream inputStream) {
        return (MutationPayload$ErrorViewAnnotationCommandPayload) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$ErrorViewAnnotationCommandPayload parseFrom(ByteBuffer byteBuffer) {
        return (MutationPayload$ErrorViewAnnotationCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static j26 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setErrorMessage(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.errorMessage_ = str;
    }

    private void setErrorMessageBytes(ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.errorMessage_ = byteString.w();
        this.bitField0_ |= 2;
    }

    private void setViewType(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.viewType_ = str;
    }

    private void setViewTypeBytes(ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.viewType_ = byteString.w();
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.o
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, Object obj, Object obj2) {
        j26 fr2Var;
        switch (AbstractC0103a.a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new MutationPayload$ErrorViewAnnotationCommandPayload();
            case 2:
                return new Z();
            case 3:
                return com.google.protobuf.o.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001", new Object[]{"bitField0_", "viewType_", "errorMessage_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                j26 j26Var = PARSER;
                if (j26Var != null) {
                    return j26Var;
                }
                synchronized (MutationPayload$ErrorViewAnnotationCommandPayload.class) {
                    try {
                        fr2Var = PARSER;
                        if (fr2Var == null) {
                            fr2Var = new fr2();
                            PARSER = fr2Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return fr2Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public String getErrorMessage() {
        return this.errorMessage_;
    }

    public ByteString getErrorMessageBytes() {
        return ByteString.i(this.errorMessage_);
    }

    public String getViewType() {
        return this.viewType_;
    }

    public ByteString getViewTypeBytes() {
        return ByteString.i(this.viewType_);
    }

    public boolean hasErrorMessage() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasViewType() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Z newBuilder(MutationPayload$ErrorViewAnnotationCommandPayload mutationPayload$ErrorViewAnnotationCommandPayload) {
        return (Z) DEFAULT_INSTANCE.createBuilder(mutationPayload$ErrorViewAnnotationCommandPayload);
    }

    public static MutationPayload$ErrorViewAnnotationCommandPayload parseDelimitedFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$ErrorViewAnnotationCommandPayload) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$ErrorViewAnnotationCommandPayload parseFrom(ByteBuffer byteBuffer, h72 h72Var) {
        return (MutationPayload$ErrorViewAnnotationCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer, h72Var);
    }

    public static MutationPayload$ErrorViewAnnotationCommandPayload parseFrom(ByteString byteString) {
        return (MutationPayload$ErrorViewAnnotationCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MutationPayload$ErrorViewAnnotationCommandPayload parseFrom(ByteString byteString, h72 h72Var) {
        return (MutationPayload$ErrorViewAnnotationCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString, h72Var);
    }

    public static MutationPayload$ErrorViewAnnotationCommandPayload parseFrom(byte[] bArr) {
        return (MutationPayload$ErrorViewAnnotationCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MutationPayload$ErrorViewAnnotationCommandPayload parseFrom(byte[] bArr, h72 h72Var) {
        return (MutationPayload$ErrorViewAnnotationCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr, h72Var);
    }

    public static MutationPayload$ErrorViewAnnotationCommandPayload parseFrom(InputStream inputStream) {
        return (MutationPayload$ErrorViewAnnotationCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$ErrorViewAnnotationCommandPayload parseFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$ErrorViewAnnotationCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$ErrorViewAnnotationCommandPayload parseFrom(lu0 lu0Var) {
        return (MutationPayload$ErrorViewAnnotationCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var);
    }

    public static MutationPayload$ErrorViewAnnotationCommandPayload parseFrom(lu0 lu0Var, h72 h72Var) {
        return (MutationPayload$ErrorViewAnnotationCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var, h72Var);
    }
}
