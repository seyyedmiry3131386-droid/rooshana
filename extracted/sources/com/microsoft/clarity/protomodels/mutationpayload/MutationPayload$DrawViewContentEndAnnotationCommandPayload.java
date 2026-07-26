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
public final class MutationPayload$DrawViewContentEndAnnotationCommandPayload extends com.google.protobuf.o implements fv4 {
    private static final MutationPayload$DrawViewContentEndAnnotationCommandPayload DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile j26 PARSER;
    private int bitField0_;
    private int id_;

    static {
        MutationPayload$DrawViewContentEndAnnotationCommandPayload mutationPayload$DrawViewContentEndAnnotationCommandPayload = new MutationPayload$DrawViewContentEndAnnotationCommandPayload();
        DEFAULT_INSTANCE = mutationPayload$DrawViewContentEndAnnotationCommandPayload;
        com.google.protobuf.o.registerDefaultInstance(MutationPayload$DrawViewContentEndAnnotationCommandPayload.class, mutationPayload$DrawViewContentEndAnnotationCommandPayload);
    }

    private MutationPayload$DrawViewContentEndAnnotationCommandPayload() {
    }

    private void clearId() {
        this.bitField0_ &= -2;
        this.id_ = 0;
    }

    public static MutationPayload$DrawViewContentEndAnnotationCommandPayload getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static V newBuilder() {
        return (V) DEFAULT_INSTANCE.createBuilder();
    }

    public static MutationPayload$DrawViewContentEndAnnotationCommandPayload parseDelimitedFrom(InputStream inputStream) {
        return (MutationPayload$DrawViewContentEndAnnotationCommandPayload) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$DrawViewContentEndAnnotationCommandPayload parseFrom(ByteBuffer byteBuffer) {
        return (MutationPayload$DrawViewContentEndAnnotationCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static j26 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(int i) {
        this.bitField0_ |= 1;
        this.id_ = i;
    }

    @Override // com.google.protobuf.o
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, Object obj, Object obj2) {
        j26 fr2Var;
        switch (AbstractC0103a.a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new MutationPayload$DrawViewContentEndAnnotationCommandPayload();
            case 2:
                return new V();
            case 3:
                return com.google.protobuf.o.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"bitField0_", "id_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                j26 j26Var = PARSER;
                if (j26Var != null) {
                    return j26Var;
                }
                synchronized (MutationPayload$DrawViewContentEndAnnotationCommandPayload.class) {
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

    public int getId() {
        return this.id_;
    }

    public boolean hasId() {
        return (this.bitField0_ & 1) != 0;
    }

    public static V newBuilder(MutationPayload$DrawViewContentEndAnnotationCommandPayload mutationPayload$DrawViewContentEndAnnotationCommandPayload) {
        return (V) DEFAULT_INSTANCE.createBuilder(mutationPayload$DrawViewContentEndAnnotationCommandPayload);
    }

    public static MutationPayload$DrawViewContentEndAnnotationCommandPayload parseDelimitedFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$DrawViewContentEndAnnotationCommandPayload) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$DrawViewContentEndAnnotationCommandPayload parseFrom(ByteBuffer byteBuffer, h72 h72Var) {
        return (MutationPayload$DrawViewContentEndAnnotationCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer, h72Var);
    }

    public static MutationPayload$DrawViewContentEndAnnotationCommandPayload parseFrom(ByteString byteString) {
        return (MutationPayload$DrawViewContentEndAnnotationCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MutationPayload$DrawViewContentEndAnnotationCommandPayload parseFrom(ByteString byteString, h72 h72Var) {
        return (MutationPayload$DrawViewContentEndAnnotationCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString, h72Var);
    }

    public static MutationPayload$DrawViewContentEndAnnotationCommandPayload parseFrom(byte[] bArr) {
        return (MutationPayload$DrawViewContentEndAnnotationCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MutationPayload$DrawViewContentEndAnnotationCommandPayload parseFrom(byte[] bArr, h72 h72Var) {
        return (MutationPayload$DrawViewContentEndAnnotationCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr, h72Var);
    }

    public static MutationPayload$DrawViewContentEndAnnotationCommandPayload parseFrom(InputStream inputStream) {
        return (MutationPayload$DrawViewContentEndAnnotationCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$DrawViewContentEndAnnotationCommandPayload parseFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$DrawViewContentEndAnnotationCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$DrawViewContentEndAnnotationCommandPayload parseFrom(lu0 lu0Var) {
        return (MutationPayload$DrawViewContentEndAnnotationCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var);
    }

    public static MutationPayload$DrawViewContentEndAnnotationCommandPayload parseFrom(lu0 lu0Var, h72 h72Var) {
        return (MutationPayload$DrawViewContentEndAnnotationCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var, h72Var);
    }
}
