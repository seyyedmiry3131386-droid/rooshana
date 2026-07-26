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
public final class MutationPayload$DrawColorCommandPayload extends com.google.protobuf.o implements fv4 {
    public static final int BLENDMODE_FIELD_NUMBER = 2;
    public static final int COLOR_FIELD_NUMBER = 1;
    private static final MutationPayload$DrawColorCommandPayload DEFAULT_INSTANCE;
    private static volatile j26 PARSER;
    private int bitField0_;
    private int blendMode_;
    private MutationPayload$Color4f color_;

    static {
        MutationPayload$DrawColorCommandPayload mutationPayload$DrawColorCommandPayload = new MutationPayload$DrawColorCommandPayload();
        DEFAULT_INSTANCE = mutationPayload$DrawColorCommandPayload;
        com.google.protobuf.o.registerDefaultInstance(MutationPayload$DrawColorCommandPayload.class, mutationPayload$DrawColorCommandPayload);
    }

    private MutationPayload$DrawColorCommandPayload() {
    }

    private void clearBlendMode() {
        this.bitField0_ &= -3;
        this.blendMode_ = 0;
    }

    private void clearColor() {
        this.color_ = null;
        this.bitField0_ &= -2;
    }

    public static MutationPayload$DrawColorCommandPayload getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeColor(MutationPayload$Color4f mutationPayload$Color4f) {
        mutationPayload$Color4f.getClass();
        MutationPayload$Color4f mutationPayload$Color4f2 = this.color_;
        if (mutationPayload$Color4f2 == null || mutationPayload$Color4f2 == MutationPayload$Color4f.getDefaultInstance()) {
            this.color_ = mutationPayload$Color4f;
        } else {
            this.color_ = (MutationPayload$Color4f) ((C0114f) MutationPayload$Color4f.newBuilder(this.color_).mergeFrom((com.google.protobuf.o) mutationPayload$Color4f)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static D newBuilder() {
        return (D) DEFAULT_INSTANCE.createBuilder();
    }

    public static MutationPayload$DrawColorCommandPayload parseDelimitedFrom(InputStream inputStream) {
        return (MutationPayload$DrawColorCommandPayload) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$DrawColorCommandPayload parseFrom(ByteBuffer byteBuffer) {
        return (MutationPayload$DrawColorCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static j26 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setBlendMode(int i) {
        this.bitField0_ |= 2;
        this.blendMode_ = i;
    }

    private void setColor(MutationPayload$Color4f mutationPayload$Color4f) {
        mutationPayload$Color4f.getClass();
        this.color_ = mutationPayload$Color4f;
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.o
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, Object obj, Object obj2) {
        j26 fr2Var;
        switch (AbstractC0103a.a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new MutationPayload$DrawColorCommandPayload();
            case 2:
                return new D();
            case 3:
                return com.google.protobuf.o.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001", new Object[]{"bitField0_", "color_", "blendMode_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                j26 j26Var = PARSER;
                if (j26Var != null) {
                    return j26Var;
                }
                synchronized (MutationPayload$DrawColorCommandPayload.class) {
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

    public int getBlendMode() {
        return this.blendMode_;
    }

    public MutationPayload$Color4f getColor() {
        MutationPayload$Color4f mutationPayload$Color4f = this.color_;
        return mutationPayload$Color4f == null ? MutationPayload$Color4f.getDefaultInstance() : mutationPayload$Color4f;
    }

    public boolean hasBlendMode() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasColor() {
        return (this.bitField0_ & 1) != 0;
    }

    public static D newBuilder(MutationPayload$DrawColorCommandPayload mutationPayload$DrawColorCommandPayload) {
        return (D) DEFAULT_INSTANCE.createBuilder(mutationPayload$DrawColorCommandPayload);
    }

    public static MutationPayload$DrawColorCommandPayload parseDelimitedFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$DrawColorCommandPayload) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$DrawColorCommandPayload parseFrom(ByteBuffer byteBuffer, h72 h72Var) {
        return (MutationPayload$DrawColorCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer, h72Var);
    }

    public static MutationPayload$DrawColorCommandPayload parseFrom(ByteString byteString) {
        return (MutationPayload$DrawColorCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MutationPayload$DrawColorCommandPayload parseFrom(ByteString byteString, h72 h72Var) {
        return (MutationPayload$DrawColorCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString, h72Var);
    }

    public static MutationPayload$DrawColorCommandPayload parseFrom(byte[] bArr) {
        return (MutationPayload$DrawColorCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MutationPayload$DrawColorCommandPayload parseFrom(byte[] bArr, h72 h72Var) {
        return (MutationPayload$DrawColorCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr, h72Var);
    }

    public static MutationPayload$DrawColorCommandPayload parseFrom(InputStream inputStream) {
        return (MutationPayload$DrawColorCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$DrawColorCommandPayload parseFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$DrawColorCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$DrawColorCommandPayload parseFrom(lu0 lu0Var) {
        return (MutationPayload$DrawColorCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var);
    }

    public static MutationPayload$DrawColorCommandPayload parseFrom(lu0 lu0Var, h72 h72Var) {
        return (MutationPayload$DrawColorCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var, h72Var);
    }
}
