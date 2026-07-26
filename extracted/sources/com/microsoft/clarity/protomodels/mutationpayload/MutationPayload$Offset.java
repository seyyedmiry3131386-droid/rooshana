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
public final class MutationPayload$Offset extends com.google.protobuf.o implements fv4 {
    private static final MutationPayload$Offset DEFAULT_INSTANCE;
    public static final int DX_FIELD_NUMBER = 1;
    public static final int DY_FIELD_NUMBER = 2;
    private static volatile j26 PARSER;
    private int bitField0_;
    private double dx_;
    private double dy_;

    static {
        MutationPayload$Offset mutationPayload$Offset = new MutationPayload$Offset();
        DEFAULT_INSTANCE = mutationPayload$Offset;
        com.google.protobuf.o.registerDefaultInstance(MutationPayload$Offset.class, mutationPayload$Offset);
    }

    private MutationPayload$Offset() {
    }

    private void clearDx() {
        this.bitField0_ &= -2;
        this.dx_ = 0.0d;
    }

    private void clearDy() {
        this.bitField0_ &= -3;
        this.dy_ = 0.0d;
    }

    public static MutationPayload$Offset getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C0150x0 newBuilder() {
        return (C0150x0) DEFAULT_INSTANCE.createBuilder();
    }

    public static MutationPayload$Offset parseDelimitedFrom(InputStream inputStream) {
        return (MutationPayload$Offset) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$Offset parseFrom(ByteBuffer byteBuffer) {
        return (MutationPayload$Offset) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static j26 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setDx(double d) {
        this.bitField0_ |= 1;
        this.dx_ = d;
    }

    private void setDy(double d) {
        this.bitField0_ |= 2;
        this.dy_ = d;
    }

    @Override // com.google.protobuf.o
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, Object obj, Object obj2) {
        j26 fr2Var;
        switch (AbstractC0103a.a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new MutationPayload$Offset();
            case 2:
                return new C0150x0();
            case 3:
                return com.google.protobuf.o.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001", new Object[]{"bitField0_", "dx_", "dy_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                j26 j26Var = PARSER;
                if (j26Var != null) {
                    return j26Var;
                }
                synchronized (MutationPayload$Offset.class) {
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

    public double getDx() {
        return this.dx_;
    }

    public double getDy() {
        return this.dy_;
    }

    public boolean hasDx() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasDy() {
        return (this.bitField0_ & 2) != 0;
    }

    public static C0150x0 newBuilder(MutationPayload$Offset mutationPayload$Offset) {
        return (C0150x0) DEFAULT_INSTANCE.createBuilder(mutationPayload$Offset);
    }

    public static MutationPayload$Offset parseDelimitedFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$Offset) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$Offset parseFrom(ByteBuffer byteBuffer, h72 h72Var) {
        return (MutationPayload$Offset) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer, h72Var);
    }

    public static MutationPayload$Offset parseFrom(ByteString byteString) {
        return (MutationPayload$Offset) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MutationPayload$Offset parseFrom(ByteString byteString, h72 h72Var) {
        return (MutationPayload$Offset) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString, h72Var);
    }

    public static MutationPayload$Offset parseFrom(byte[] bArr) {
        return (MutationPayload$Offset) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MutationPayload$Offset parseFrom(byte[] bArr, h72 h72Var) {
        return (MutationPayload$Offset) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr, h72Var);
    }

    public static MutationPayload$Offset parseFrom(InputStream inputStream) {
        return (MutationPayload$Offset) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$Offset parseFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$Offset) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$Offset parseFrom(lu0 lu0Var) {
        return (MutationPayload$Offset) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var);
    }

    public static MutationPayload$Offset parseFrom(lu0 lu0Var, h72 h72Var) {
        return (MutationPayload$Offset) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var, h72Var);
    }
}
