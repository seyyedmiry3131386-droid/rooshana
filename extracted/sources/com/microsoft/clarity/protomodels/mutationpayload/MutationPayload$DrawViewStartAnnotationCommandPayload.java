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
public final class MutationPayload$DrawViewStartAnnotationCommandPayload extends com.google.protobuf.o implements fv4 {
    private static final MutationPayload$DrawViewStartAnnotationCommandPayload DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile j26 PARSER;
    private int bitField0_;
    private int id_;

    static {
        MutationPayload$DrawViewStartAnnotationCommandPayload mutationPayload$DrawViewStartAnnotationCommandPayload = new MutationPayload$DrawViewStartAnnotationCommandPayload();
        DEFAULT_INSTANCE = mutationPayload$DrawViewStartAnnotationCommandPayload;
        com.google.protobuf.o.registerDefaultInstance(MutationPayload$DrawViewStartAnnotationCommandPayload.class, mutationPayload$DrawViewStartAnnotationCommandPayload);
    }

    private MutationPayload$DrawViewStartAnnotationCommandPayload() {
    }

    private void clearId() {
        this.bitField0_ &= -2;
        this.id_ = 0;
    }

    public static MutationPayload$DrawViewStartAnnotationCommandPayload getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Y newBuilder() {
        return (Y) DEFAULT_INSTANCE.createBuilder();
    }

    public static MutationPayload$DrawViewStartAnnotationCommandPayload parseDelimitedFrom(InputStream inputStream) {
        return (MutationPayload$DrawViewStartAnnotationCommandPayload) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$DrawViewStartAnnotationCommandPayload parseFrom(ByteBuffer byteBuffer) {
        return (MutationPayload$DrawViewStartAnnotationCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
                return new MutationPayload$DrawViewStartAnnotationCommandPayload();
            case 2:
                return new Y();
            case 3:
                return com.google.protobuf.o.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"bitField0_", "id_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                j26 j26Var = PARSER;
                if (j26Var != null) {
                    return j26Var;
                }
                synchronized (MutationPayload$DrawViewStartAnnotationCommandPayload.class) {
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

    public static Y newBuilder(MutationPayload$DrawViewStartAnnotationCommandPayload mutationPayload$DrawViewStartAnnotationCommandPayload) {
        return (Y) DEFAULT_INSTANCE.createBuilder(mutationPayload$DrawViewStartAnnotationCommandPayload);
    }

    public static MutationPayload$DrawViewStartAnnotationCommandPayload parseDelimitedFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$DrawViewStartAnnotationCommandPayload) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$DrawViewStartAnnotationCommandPayload parseFrom(ByteBuffer byteBuffer, h72 h72Var) {
        return (MutationPayload$DrawViewStartAnnotationCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer, h72Var);
    }

    public static MutationPayload$DrawViewStartAnnotationCommandPayload parseFrom(ByteString byteString) {
        return (MutationPayload$DrawViewStartAnnotationCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MutationPayload$DrawViewStartAnnotationCommandPayload parseFrom(ByteString byteString, h72 h72Var) {
        return (MutationPayload$DrawViewStartAnnotationCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString, h72Var);
    }

    public static MutationPayload$DrawViewStartAnnotationCommandPayload parseFrom(byte[] bArr) {
        return (MutationPayload$DrawViewStartAnnotationCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MutationPayload$DrawViewStartAnnotationCommandPayload parseFrom(byte[] bArr, h72 h72Var) {
        return (MutationPayload$DrawViewStartAnnotationCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr, h72Var);
    }

    public static MutationPayload$DrawViewStartAnnotationCommandPayload parseFrom(InputStream inputStream) {
        return (MutationPayload$DrawViewStartAnnotationCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$DrawViewStartAnnotationCommandPayload parseFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$DrawViewStartAnnotationCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$DrawViewStartAnnotationCommandPayload parseFrom(lu0 lu0Var) {
        return (MutationPayload$DrawViewStartAnnotationCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var);
    }

    public static MutationPayload$DrawViewStartAnnotationCommandPayload parseFrom(lu0 lu0Var, h72 h72Var) {
        return (MutationPayload$DrawViewStartAnnotationCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var, h72Var);
    }
}
