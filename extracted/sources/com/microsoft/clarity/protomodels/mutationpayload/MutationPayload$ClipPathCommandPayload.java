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
public final class MutationPayload$ClipPathCommandPayload extends com.google.protobuf.o implements fv4 {
    public static final int ANTI_ALIAS_FIELD_NUMBER = 2;
    private static final MutationPayload$ClipPathCommandPayload DEFAULT_INSTANCE;
    public static final int OP_FIELD_NUMBER = 1;
    private static volatile j26 PARSER = null;
    public static final int PATH_INDEX_FIELD_NUMBER = 3;
    private boolean antiAlias_;
    private int bitField0_;
    private int op_;
    private int pathIndex_;

    static {
        MutationPayload$ClipPathCommandPayload mutationPayload$ClipPathCommandPayload = new MutationPayload$ClipPathCommandPayload();
        DEFAULT_INSTANCE = mutationPayload$ClipPathCommandPayload;
        com.google.protobuf.o.registerDefaultInstance(MutationPayload$ClipPathCommandPayload.class, mutationPayload$ClipPathCommandPayload);
    }

    private MutationPayload$ClipPathCommandPayload() {
    }

    private void clearAntiAlias() {
        this.bitField0_ &= -3;
        this.antiAlias_ = false;
    }

    private void clearOp() {
        this.bitField0_ &= -2;
        this.op_ = 0;
    }

    private void clearPathIndex() {
        this.bitField0_ &= -5;
        this.pathIndex_ = 0;
    }

    public static MutationPayload$ClipPathCommandPayload getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C0108c newBuilder() {
        return (C0108c) DEFAULT_INSTANCE.createBuilder();
    }

    public static MutationPayload$ClipPathCommandPayload parseDelimitedFrom(InputStream inputStream) {
        return (MutationPayload$ClipPathCommandPayload) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$ClipPathCommandPayload parseFrom(ByteBuffer byteBuffer) {
        return (MutationPayload$ClipPathCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static j26 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAntiAlias(boolean z) {
        this.bitField0_ |= 2;
        this.antiAlias_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOp(int i) {
        this.bitField0_ |= 1;
        this.op_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPathIndex(int i) {
        this.bitField0_ |= 4;
        this.pathIndex_ = i;
    }

    @Override // com.google.protobuf.o
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, Object obj, Object obj2) {
        j26 fr2Var;
        switch (AbstractC0103a.a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new MutationPayload$ClipPathCommandPayload();
            case 2:
                return new C0108c();
            case 3:
                return com.google.protobuf.o.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003င\u0002", new Object[]{"bitField0_", "op_", "antiAlias_", "pathIndex_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                j26 j26Var = PARSER;
                if (j26Var != null) {
                    return j26Var;
                }
                synchronized (MutationPayload$ClipPathCommandPayload.class) {
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

    public boolean getAntiAlias() {
        return this.antiAlias_;
    }

    public int getOp() {
        return this.op_;
    }

    public int getPathIndex() {
        return this.pathIndex_;
    }

    public boolean hasAntiAlias() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasOp() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasPathIndex() {
        return (this.bitField0_ & 4) != 0;
    }

    public static C0108c newBuilder(MutationPayload$ClipPathCommandPayload mutationPayload$ClipPathCommandPayload) {
        return (C0108c) DEFAULT_INSTANCE.createBuilder(mutationPayload$ClipPathCommandPayload);
    }

    public static MutationPayload$ClipPathCommandPayload parseDelimitedFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$ClipPathCommandPayload) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$ClipPathCommandPayload parseFrom(ByteBuffer byteBuffer, h72 h72Var) {
        return (MutationPayload$ClipPathCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer, h72Var);
    }

    public static MutationPayload$ClipPathCommandPayload parseFrom(ByteString byteString) {
        return (MutationPayload$ClipPathCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MutationPayload$ClipPathCommandPayload parseFrom(ByteString byteString, h72 h72Var) {
        return (MutationPayload$ClipPathCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString, h72Var);
    }

    public static MutationPayload$ClipPathCommandPayload parseFrom(byte[] bArr) {
        return (MutationPayload$ClipPathCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MutationPayload$ClipPathCommandPayload parseFrom(byte[] bArr, h72 h72Var) {
        return (MutationPayload$ClipPathCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr, h72Var);
    }

    public static MutationPayload$ClipPathCommandPayload parseFrom(InputStream inputStream) {
        return (MutationPayload$ClipPathCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$ClipPathCommandPayload parseFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$ClipPathCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$ClipPathCommandPayload parseFrom(lu0 lu0Var) {
        return (MutationPayload$ClipPathCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var);
    }

    public static MutationPayload$ClipPathCommandPayload parseFrom(lu0 lu0Var, h72 h72Var) {
        return (MutationPayload$ClipPathCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var, h72Var);
    }
}
