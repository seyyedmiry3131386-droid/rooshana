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
public final class MutationPayload$TranslateCommandPayload extends com.google.protobuf.o implements fv4 {
    private static final MutationPayload$TranslateCommandPayload DEFAULT_INSTANCE;
    public static final int LEFT_FIELD_NUMBER = 1;
    private static volatile j26 PARSER = null;
    public static final int TOP_FIELD_NUMBER = 2;
    private int bitField0_;
    private float left_;
    private float top_;

    static {
        MutationPayload$TranslateCommandPayload mutationPayload$TranslateCommandPayload = new MutationPayload$TranslateCommandPayload();
        DEFAULT_INSTANCE = mutationPayload$TranslateCommandPayload;
        com.google.protobuf.o.registerDefaultInstance(MutationPayload$TranslateCommandPayload.class, mutationPayload$TranslateCommandPayload);
    }

    private MutationPayload$TranslateCommandPayload() {
    }

    private void clearLeft() {
        this.bitField0_ &= -2;
        this.left_ = 0.0f;
    }

    private void clearTop() {
        this.bitField0_ &= -3;
        this.top_ = 0.0f;
    }

    public static MutationPayload$TranslateCommandPayload getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static r1 newBuilder() {
        return (r1) DEFAULT_INSTANCE.createBuilder();
    }

    public static MutationPayload$TranslateCommandPayload parseDelimitedFrom(InputStream inputStream) {
        return (MutationPayload$TranslateCommandPayload) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$TranslateCommandPayload parseFrom(ByteBuffer byteBuffer) {
        return (MutationPayload$TranslateCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static j26 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLeft(float f) {
        this.bitField0_ |= 1;
        this.left_ = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTop(float f) {
        this.bitField0_ |= 2;
        this.top_ = f;
    }

    @Override // com.google.protobuf.o
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, Object obj, Object obj2) {
        j26 fr2Var;
        switch (AbstractC0103a.a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new MutationPayload$TranslateCommandPayload();
            case 2:
                return new r1();
            case 3:
                return com.google.protobuf.o.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001", new Object[]{"bitField0_", "left_", "top_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                j26 j26Var = PARSER;
                if (j26Var != null) {
                    return j26Var;
                }
                synchronized (MutationPayload$TranslateCommandPayload.class) {
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

    public float getLeft() {
        return this.left_;
    }

    public float getTop() {
        return this.top_;
    }

    public boolean hasLeft() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasTop() {
        return (this.bitField0_ & 2) != 0;
    }

    public static r1 newBuilder(MutationPayload$TranslateCommandPayload mutationPayload$TranslateCommandPayload) {
        return (r1) DEFAULT_INSTANCE.createBuilder(mutationPayload$TranslateCommandPayload);
    }

    public static MutationPayload$TranslateCommandPayload parseDelimitedFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$TranslateCommandPayload) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$TranslateCommandPayload parseFrom(ByteBuffer byteBuffer, h72 h72Var) {
        return (MutationPayload$TranslateCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer, h72Var);
    }

    public static MutationPayload$TranslateCommandPayload parseFrom(ByteString byteString) {
        return (MutationPayload$TranslateCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MutationPayload$TranslateCommandPayload parseFrom(ByteString byteString, h72 h72Var) {
        return (MutationPayload$TranslateCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString, h72Var);
    }

    public static MutationPayload$TranslateCommandPayload parseFrom(byte[] bArr) {
        return (MutationPayload$TranslateCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MutationPayload$TranslateCommandPayload parseFrom(byte[] bArr, h72 h72Var) {
        return (MutationPayload$TranslateCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr, h72Var);
    }

    public static MutationPayload$TranslateCommandPayload parseFrom(InputStream inputStream) {
        return (MutationPayload$TranslateCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$TranslateCommandPayload parseFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$TranslateCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$TranslateCommandPayload parseFrom(lu0 lu0Var) {
        return (MutationPayload$TranslateCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var);
    }

    public static MutationPayload$TranslateCommandPayload parseFrom(lu0 lu0Var, h72 h72Var) {
        return (MutationPayload$TranslateCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var, h72Var);
    }
}
