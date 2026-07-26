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
public final class MutationPayload$RestoreToCountCommandPayload extends com.google.protobuf.o implements fv4 {
    public static final int COUNT_FIELD_NUMBER = 1;
    private static final MutationPayload$RestoreToCountCommandPayload DEFAULT_INSTANCE;
    private static volatile j26 PARSER;
    private int bitField0_;
    private int count_;

    static {
        MutationPayload$RestoreToCountCommandPayload mutationPayload$RestoreToCountCommandPayload = new MutationPayload$RestoreToCountCommandPayload();
        DEFAULT_INSTANCE = mutationPayload$RestoreToCountCommandPayload;
        com.google.protobuf.o.registerDefaultInstance(MutationPayload$RestoreToCountCommandPayload.class, mutationPayload$RestoreToCountCommandPayload);
    }

    private MutationPayload$RestoreToCountCommandPayload() {
    }

    private void clearCount() {
        this.bitField0_ &= -2;
        this.count_ = 0;
    }

    public static MutationPayload$RestoreToCountCommandPayload getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static T0 newBuilder() {
        return (T0) DEFAULT_INSTANCE.createBuilder();
    }

    public static MutationPayload$RestoreToCountCommandPayload parseDelimitedFrom(InputStream inputStream) {
        return (MutationPayload$RestoreToCountCommandPayload) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$RestoreToCountCommandPayload parseFrom(ByteBuffer byteBuffer) {
        return (MutationPayload$RestoreToCountCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static j26 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setCount(int i) {
        this.bitField0_ |= 1;
        this.count_ = i;
    }

    @Override // com.google.protobuf.o
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, Object obj, Object obj2) {
        j26 fr2Var;
        switch (AbstractC0103a.a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new MutationPayload$RestoreToCountCommandPayload();
            case 2:
                return new T0();
            case 3:
                return com.google.protobuf.o.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"bitField0_", "count_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                j26 j26Var = PARSER;
                if (j26Var != null) {
                    return j26Var;
                }
                synchronized (MutationPayload$RestoreToCountCommandPayload.class) {
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

    public int getCount() {
        return this.count_;
    }

    public boolean hasCount() {
        return (this.bitField0_ & 1) != 0;
    }

    public static T0 newBuilder(MutationPayload$RestoreToCountCommandPayload mutationPayload$RestoreToCountCommandPayload) {
        return (T0) DEFAULT_INSTANCE.createBuilder(mutationPayload$RestoreToCountCommandPayload);
    }

    public static MutationPayload$RestoreToCountCommandPayload parseDelimitedFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$RestoreToCountCommandPayload) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$RestoreToCountCommandPayload parseFrom(ByteBuffer byteBuffer, h72 h72Var) {
        return (MutationPayload$RestoreToCountCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer, h72Var);
    }

    public static MutationPayload$RestoreToCountCommandPayload parseFrom(ByteString byteString) {
        return (MutationPayload$RestoreToCountCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MutationPayload$RestoreToCountCommandPayload parseFrom(ByteString byteString, h72 h72Var) {
        return (MutationPayload$RestoreToCountCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString, h72Var);
    }

    public static MutationPayload$RestoreToCountCommandPayload parseFrom(byte[] bArr) {
        return (MutationPayload$RestoreToCountCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MutationPayload$RestoreToCountCommandPayload parseFrom(byte[] bArr, h72 h72Var) {
        return (MutationPayload$RestoreToCountCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr, h72Var);
    }

    public static MutationPayload$RestoreToCountCommandPayload parseFrom(InputStream inputStream) {
        return (MutationPayload$RestoreToCountCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$RestoreToCountCommandPayload parseFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$RestoreToCountCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$RestoreToCountCommandPayload parseFrom(lu0 lu0Var) {
        return (MutationPayload$RestoreToCountCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var);
    }

    public static MutationPayload$RestoreToCountCommandPayload parseFrom(lu0 lu0Var, h72 h72Var) {
        return (MutationPayload$RestoreToCountCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var, h72Var);
    }
}
