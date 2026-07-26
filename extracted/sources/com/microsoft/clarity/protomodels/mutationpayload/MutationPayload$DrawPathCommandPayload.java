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
public final class MutationPayload$DrawPathCommandPayload extends com.google.protobuf.o implements fv4 {
    private static final MutationPayload$DrawPathCommandPayload DEFAULT_INSTANCE;
    public static final int PAINT_INDEX_FIELD_NUMBER = 2;
    private static volatile j26 PARSER = null;
    public static final int PATH_INDEX_FIELD_NUMBER = 1;
    private int bitField0_;
    private int paintIndex_;
    private int pathIndex_;

    static {
        MutationPayload$DrawPathCommandPayload mutationPayload$DrawPathCommandPayload = new MutationPayload$DrawPathCommandPayload();
        DEFAULT_INSTANCE = mutationPayload$DrawPathCommandPayload;
        com.google.protobuf.o.registerDefaultInstance(MutationPayload$DrawPathCommandPayload.class, mutationPayload$DrawPathCommandPayload);
    }

    private MutationPayload$DrawPathCommandPayload() {
    }

    private void clearPaintIndex() {
        this.bitField0_ &= -3;
        this.paintIndex_ = 0;
    }

    private void clearPathIndex() {
        this.bitField0_ &= -2;
        this.pathIndex_ = 0;
    }

    public static MutationPayload$DrawPathCommandPayload getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static M newBuilder() {
        return (M) DEFAULT_INSTANCE.createBuilder();
    }

    public static MutationPayload$DrawPathCommandPayload parseDelimitedFrom(InputStream inputStream) {
        return (MutationPayload$DrawPathCommandPayload) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$DrawPathCommandPayload parseFrom(ByteBuffer byteBuffer) {
        return (MutationPayload$DrawPathCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static j26 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPaintIndex(int i) {
        this.bitField0_ |= 2;
        this.paintIndex_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPathIndex(int i) {
        this.bitField0_ |= 1;
        this.pathIndex_ = i;
    }

    @Override // com.google.protobuf.o
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, Object obj, Object obj2) {
        j26 fr2Var;
        switch (AbstractC0103a.a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new MutationPayload$DrawPathCommandPayload();
            case 2:
                return new M();
            case 3:
                return com.google.protobuf.o.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"bitField0_", "pathIndex_", "paintIndex_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                j26 j26Var = PARSER;
                if (j26Var != null) {
                    return j26Var;
                }
                synchronized (MutationPayload$DrawPathCommandPayload.class) {
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

    public int getPaintIndex() {
        return this.paintIndex_;
    }

    public int getPathIndex() {
        return this.pathIndex_;
    }

    public boolean hasPaintIndex() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasPathIndex() {
        return (this.bitField0_ & 1) != 0;
    }

    public static M newBuilder(MutationPayload$DrawPathCommandPayload mutationPayload$DrawPathCommandPayload) {
        return (M) DEFAULT_INSTANCE.createBuilder(mutationPayload$DrawPathCommandPayload);
    }

    public static MutationPayload$DrawPathCommandPayload parseDelimitedFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$DrawPathCommandPayload) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$DrawPathCommandPayload parseFrom(ByteBuffer byteBuffer, h72 h72Var) {
        return (MutationPayload$DrawPathCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer, h72Var);
    }

    public static MutationPayload$DrawPathCommandPayload parseFrom(ByteString byteString) {
        return (MutationPayload$DrawPathCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MutationPayload$DrawPathCommandPayload parseFrom(ByteString byteString, h72 h72Var) {
        return (MutationPayload$DrawPathCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString, h72Var);
    }

    public static MutationPayload$DrawPathCommandPayload parseFrom(byte[] bArr) {
        return (MutationPayload$DrawPathCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MutationPayload$DrawPathCommandPayload parseFrom(byte[] bArr, h72 h72Var) {
        return (MutationPayload$DrawPathCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr, h72Var);
    }

    public static MutationPayload$DrawPathCommandPayload parseFrom(InputStream inputStream) {
        return (MutationPayload$DrawPathCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$DrawPathCommandPayload parseFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$DrawPathCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$DrawPathCommandPayload parseFrom(lu0 lu0Var) {
        return (MutationPayload$DrawPathCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var);
    }

    public static MutationPayload$DrawPathCommandPayload parseFrom(lu0 lu0Var, h72 h72Var) {
        return (MutationPayload$DrawPathCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var, h72Var);
    }
}
