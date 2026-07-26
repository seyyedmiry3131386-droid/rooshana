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
public final class MutationPayload$TextDecoration extends com.google.protobuf.o implements fv4 {
    private static final MutationPayload$TextDecoration DEFAULT_INSTANCE;
    public static final int MASK_FIELD_NUMBER = 1;
    private static volatile j26 PARSER;
    private int bitField0_;
    private int mask_;

    static {
        MutationPayload$TextDecoration mutationPayload$TextDecoration = new MutationPayload$TextDecoration();
        DEFAULT_INSTANCE = mutationPayload$TextDecoration;
        com.google.protobuf.o.registerDefaultInstance(MutationPayload$TextDecoration.class, mutationPayload$TextDecoration);
    }

    private MutationPayload$TextDecoration() {
    }

    private void clearMask() {
        this.bitField0_ &= -2;
        this.mask_ = 0;
    }

    public static MutationPayload$TextDecoration getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static n1 newBuilder() {
        return (n1) DEFAULT_INSTANCE.createBuilder();
    }

    public static MutationPayload$TextDecoration parseDelimitedFrom(InputStream inputStream) {
        return (MutationPayload$TextDecoration) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$TextDecoration parseFrom(ByteBuffer byteBuffer) {
        return (MutationPayload$TextDecoration) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static j26 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setMask(int i) {
        this.bitField0_ |= 1;
        this.mask_ = i;
    }

    @Override // com.google.protobuf.o
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, Object obj, Object obj2) {
        j26 fr2Var;
        switch (AbstractC0103a.a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new MutationPayload$TextDecoration();
            case 2:
                return new n1();
            case 3:
                return com.google.protobuf.o.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"bitField0_", "mask_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                j26 j26Var = PARSER;
                if (j26Var != null) {
                    return j26Var;
                }
                synchronized (MutationPayload$TextDecoration.class) {
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

    public int getMask() {
        return this.mask_;
    }

    public boolean hasMask() {
        return (this.bitField0_ & 1) != 0;
    }

    public static n1 newBuilder(MutationPayload$TextDecoration mutationPayload$TextDecoration) {
        return (n1) DEFAULT_INSTANCE.createBuilder(mutationPayload$TextDecoration);
    }

    public static MutationPayload$TextDecoration parseDelimitedFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$TextDecoration) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$TextDecoration parseFrom(ByteBuffer byteBuffer, h72 h72Var) {
        return (MutationPayload$TextDecoration) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer, h72Var);
    }

    public static MutationPayload$TextDecoration parseFrom(ByteString byteString) {
        return (MutationPayload$TextDecoration) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MutationPayload$TextDecoration parseFrom(ByteString byteString, h72 h72Var) {
        return (MutationPayload$TextDecoration) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString, h72Var);
    }

    public static MutationPayload$TextDecoration parseFrom(byte[] bArr) {
        return (MutationPayload$TextDecoration) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MutationPayload$TextDecoration parseFrom(byte[] bArr, h72 h72Var) {
        return (MutationPayload$TextDecoration) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr, h72Var);
    }

    public static MutationPayload$TextDecoration parseFrom(InputStream inputStream) {
        return (MutationPayload$TextDecoration) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$TextDecoration parseFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$TextDecoration) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$TextDecoration parseFrom(lu0 lu0Var) {
        return (MutationPayload$TextDecoration) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var);
    }

    public static MutationPayload$TextDecoration parseFrom(lu0 lu0Var, h72 h72Var) {
        return (MutationPayload$TextDecoration) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var, h72Var);
    }
}
