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
public final class MutationPayload$SaveCommandPayload extends com.google.protobuf.o implements fv4 {
    private static final MutationPayload$SaveCommandPayload DEFAULT_INSTANCE;
    private static volatile j26 PARSER;

    static {
        MutationPayload$SaveCommandPayload mutationPayload$SaveCommandPayload = new MutationPayload$SaveCommandPayload();
        DEFAULT_INSTANCE = mutationPayload$SaveCommandPayload;
        com.google.protobuf.o.registerDefaultInstance(MutationPayload$SaveCommandPayload.class, mutationPayload$SaveCommandPayload);
    }

    private MutationPayload$SaveCommandPayload() {
    }

    public static MutationPayload$SaveCommandPayload getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Z0 newBuilder() {
        return (Z0) DEFAULT_INSTANCE.createBuilder();
    }

    public static MutationPayload$SaveCommandPayload parseDelimitedFrom(InputStream inputStream) {
        return (MutationPayload$SaveCommandPayload) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$SaveCommandPayload parseFrom(ByteBuffer byteBuffer) {
        return (MutationPayload$SaveCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static j26 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.o
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, Object obj, Object obj2) {
        j26 fr2Var;
        switch (AbstractC0103a.a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new MutationPayload$SaveCommandPayload();
            case 2:
                return new Z0();
            case 3:
                return com.google.protobuf.o.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                j26 j26Var = PARSER;
                if (j26Var != null) {
                    return j26Var;
                }
                synchronized (MutationPayload$SaveCommandPayload.class) {
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

    public static Z0 newBuilder(MutationPayload$SaveCommandPayload mutationPayload$SaveCommandPayload) {
        return (Z0) DEFAULT_INSTANCE.createBuilder(mutationPayload$SaveCommandPayload);
    }

    public static MutationPayload$SaveCommandPayload parseDelimitedFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$SaveCommandPayload) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$SaveCommandPayload parseFrom(ByteBuffer byteBuffer, h72 h72Var) {
        return (MutationPayload$SaveCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer, h72Var);
    }

    public static MutationPayload$SaveCommandPayload parseFrom(ByteString byteString) {
        return (MutationPayload$SaveCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MutationPayload$SaveCommandPayload parseFrom(ByteString byteString, h72 h72Var) {
        return (MutationPayload$SaveCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString, h72Var);
    }

    public static MutationPayload$SaveCommandPayload parseFrom(byte[] bArr) {
        return (MutationPayload$SaveCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MutationPayload$SaveCommandPayload parseFrom(byte[] bArr, h72 h72Var) {
        return (MutationPayload$SaveCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr, h72Var);
    }

    public static MutationPayload$SaveCommandPayload parseFrom(InputStream inputStream) {
        return (MutationPayload$SaveCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$SaveCommandPayload parseFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$SaveCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$SaveCommandPayload parseFrom(lu0 lu0Var) {
        return (MutationPayload$SaveCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var);
    }

    public static MutationPayload$SaveCommandPayload parseFrom(lu0 lu0Var, h72 h72Var) {
        return (MutationPayload$SaveCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var, h72Var);
    }
}
