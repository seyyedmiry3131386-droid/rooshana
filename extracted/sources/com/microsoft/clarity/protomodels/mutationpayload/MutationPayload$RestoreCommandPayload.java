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
public final class MutationPayload$RestoreCommandPayload extends com.google.protobuf.o implements fv4 {
    private static final MutationPayload$RestoreCommandPayload DEFAULT_INSTANCE;
    private static volatile j26 PARSER;

    static {
        MutationPayload$RestoreCommandPayload mutationPayload$RestoreCommandPayload = new MutationPayload$RestoreCommandPayload();
        DEFAULT_INSTANCE = mutationPayload$RestoreCommandPayload;
        com.google.protobuf.o.registerDefaultInstance(MutationPayload$RestoreCommandPayload.class, mutationPayload$RestoreCommandPayload);
    }

    private MutationPayload$RestoreCommandPayload() {
    }

    public static MutationPayload$RestoreCommandPayload getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static S0 newBuilder() {
        return (S0) DEFAULT_INSTANCE.createBuilder();
    }

    public static MutationPayload$RestoreCommandPayload parseDelimitedFrom(InputStream inputStream) {
        return (MutationPayload$RestoreCommandPayload) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$RestoreCommandPayload parseFrom(ByteBuffer byteBuffer) {
        return (MutationPayload$RestoreCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static j26 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.o
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, Object obj, Object obj2) {
        j26 fr2Var;
        switch (AbstractC0103a.a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new MutationPayload$RestoreCommandPayload();
            case 2:
                return new S0();
            case 3:
                return com.google.protobuf.o.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                j26 j26Var = PARSER;
                if (j26Var != null) {
                    return j26Var;
                }
                synchronized (MutationPayload$RestoreCommandPayload.class) {
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

    public static S0 newBuilder(MutationPayload$RestoreCommandPayload mutationPayload$RestoreCommandPayload) {
        return (S0) DEFAULT_INSTANCE.createBuilder(mutationPayload$RestoreCommandPayload);
    }

    public static MutationPayload$RestoreCommandPayload parseDelimitedFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$RestoreCommandPayload) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$RestoreCommandPayload parseFrom(ByteBuffer byteBuffer, h72 h72Var) {
        return (MutationPayload$RestoreCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer, h72Var);
    }

    public static MutationPayload$RestoreCommandPayload parseFrom(ByteString byteString) {
        return (MutationPayload$RestoreCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MutationPayload$RestoreCommandPayload parseFrom(ByteString byteString, h72 h72Var) {
        return (MutationPayload$RestoreCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString, h72Var);
    }

    public static MutationPayload$RestoreCommandPayload parseFrom(byte[] bArr) {
        return (MutationPayload$RestoreCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MutationPayload$RestoreCommandPayload parseFrom(byte[] bArr, h72 h72Var) {
        return (MutationPayload$RestoreCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr, h72Var);
    }

    public static MutationPayload$RestoreCommandPayload parseFrom(InputStream inputStream) {
        return (MutationPayload$RestoreCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$RestoreCommandPayload parseFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$RestoreCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$RestoreCommandPayload parseFrom(lu0 lu0Var) {
        return (MutationPayload$RestoreCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var);
    }

    public static MutationPayload$RestoreCommandPayload parseFrom(lu0 lu0Var, h72 h72Var) {
        return (MutationPayload$RestoreCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var, h72Var);
    }
}
