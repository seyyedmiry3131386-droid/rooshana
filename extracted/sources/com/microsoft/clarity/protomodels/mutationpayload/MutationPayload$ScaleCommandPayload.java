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
public final class MutationPayload$ScaleCommandPayload extends com.google.protobuf.o implements fv4 {
    private static final MutationPayload$ScaleCommandPayload DEFAULT_INSTANCE;
    private static volatile j26 PARSER = null;
    public static final int SX_FIELD_NUMBER = 1;
    public static final int SY_FIELD_NUMBER = 2;
    private int bitField0_;
    private float sx_;
    private float sy_;

    static {
        MutationPayload$ScaleCommandPayload mutationPayload$ScaleCommandPayload = new MutationPayload$ScaleCommandPayload();
        DEFAULT_INSTANCE = mutationPayload$ScaleCommandPayload;
        com.google.protobuf.o.registerDefaultInstance(MutationPayload$ScaleCommandPayload.class, mutationPayload$ScaleCommandPayload);
    }

    private MutationPayload$ScaleCommandPayload() {
    }

    private void clearSx() {
        this.bitField0_ &= -2;
        this.sx_ = 0.0f;
    }

    private void clearSy() {
        this.bitField0_ &= -3;
        this.sy_ = 0.0f;
    }

    public static MutationPayload$ScaleCommandPayload getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static b1 newBuilder() {
        return (b1) DEFAULT_INSTANCE.createBuilder();
    }

    public static MutationPayload$ScaleCommandPayload parseDelimitedFrom(InputStream inputStream) {
        return (MutationPayload$ScaleCommandPayload) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$ScaleCommandPayload parseFrom(ByteBuffer byteBuffer) {
        return (MutationPayload$ScaleCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static j26 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSx(float f) {
        this.bitField0_ |= 1;
        this.sx_ = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSy(float f) {
        this.bitField0_ |= 2;
        this.sy_ = f;
    }

    @Override // com.google.protobuf.o
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, Object obj, Object obj2) {
        j26 fr2Var;
        switch (AbstractC0103a.a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new MutationPayload$ScaleCommandPayload();
            case 2:
                return new b1();
            case 3:
                return com.google.protobuf.o.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001", new Object[]{"bitField0_", "sx_", "sy_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                j26 j26Var = PARSER;
                if (j26Var != null) {
                    return j26Var;
                }
                synchronized (MutationPayload$ScaleCommandPayload.class) {
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

    public float getSx() {
        return this.sx_;
    }

    public float getSy() {
        return this.sy_;
    }

    public boolean hasSx() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasSy() {
        return (this.bitField0_ & 2) != 0;
    }

    public static b1 newBuilder(MutationPayload$ScaleCommandPayload mutationPayload$ScaleCommandPayload) {
        return (b1) DEFAULT_INSTANCE.createBuilder(mutationPayload$ScaleCommandPayload);
    }

    public static MutationPayload$ScaleCommandPayload parseDelimitedFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$ScaleCommandPayload) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$ScaleCommandPayload parseFrom(ByteBuffer byteBuffer, h72 h72Var) {
        return (MutationPayload$ScaleCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer, h72Var);
    }

    public static MutationPayload$ScaleCommandPayload parseFrom(ByteString byteString) {
        return (MutationPayload$ScaleCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MutationPayload$ScaleCommandPayload parseFrom(ByteString byteString, h72 h72Var) {
        return (MutationPayload$ScaleCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString, h72Var);
    }

    public static MutationPayload$ScaleCommandPayload parseFrom(byte[] bArr) {
        return (MutationPayload$ScaleCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MutationPayload$ScaleCommandPayload parseFrom(byte[] bArr, h72 h72Var) {
        return (MutationPayload$ScaleCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr, h72Var);
    }

    public static MutationPayload$ScaleCommandPayload parseFrom(InputStream inputStream) {
        return (MutationPayload$ScaleCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$ScaleCommandPayload parseFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$ScaleCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$ScaleCommandPayload parseFrom(lu0 lu0Var) {
        return (MutationPayload$ScaleCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var);
    }

    public static MutationPayload$ScaleCommandPayload parseFrom(lu0 lu0Var, h72 h72Var) {
        return (MutationPayload$ScaleCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var, h72Var);
    }
}
