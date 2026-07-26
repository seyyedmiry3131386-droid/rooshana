package com.microsoft.clarity.protomodels.mutationpayload;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import defpackage.fr2;
import defpackage.h72;
import defpackage.j26;
import defpackage.lu0;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class MutationPayload$RSXform extends com.google.protobuf.o implements O0 {
    private static final MutationPayload$RSXform DEFAULT_INSTANCE;
    private static volatile j26 PARSER = null;
    public static final int SCOS_FIELD_NUMBER = 1;
    public static final int SSIN_FIELD_NUMBER = 2;
    public static final int TX_FIELD_NUMBER = 3;
    public static final int TY_FIELD_NUMBER = 4;
    private int bitField0_;
    private double scos_;
    private double ssin_;
    private double tx_;
    private double ty_;

    static {
        MutationPayload$RSXform mutationPayload$RSXform = new MutationPayload$RSXform();
        DEFAULT_INSTANCE = mutationPayload$RSXform;
        com.google.protobuf.o.registerDefaultInstance(MutationPayload$RSXform.class, mutationPayload$RSXform);
    }

    private MutationPayload$RSXform() {
    }

    private void clearScos() {
        this.bitField0_ &= -2;
        this.scos_ = 0.0d;
    }

    private void clearSsin() {
        this.bitField0_ &= -3;
        this.ssin_ = 0.0d;
    }

    private void clearTx() {
        this.bitField0_ &= -5;
        this.tx_ = 0.0d;
    }

    private void clearTy() {
        this.bitField0_ &= -9;
        this.ty_ = 0.0d;
    }

    public static MutationPayload$RSXform getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static N0 newBuilder() {
        return (N0) DEFAULT_INSTANCE.createBuilder();
    }

    public static MutationPayload$RSXform parseDelimitedFrom(InputStream inputStream) {
        return (MutationPayload$RSXform) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$RSXform parseFrom(ByteBuffer byteBuffer) {
        return (MutationPayload$RSXform) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static j26 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setScos(double d) {
        this.bitField0_ |= 1;
        this.scos_ = d;
    }

    private void setSsin(double d) {
        this.bitField0_ |= 2;
        this.ssin_ = d;
    }

    private void setTx(double d) {
        this.bitField0_ |= 4;
        this.tx_ = d;
    }

    private void setTy(double d) {
        this.bitField0_ |= 8;
        this.ty_ = d;
    }

    @Override // com.google.protobuf.o
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, Object obj, Object obj2) {
        j26 fr2Var;
        switch (AbstractC0103a.a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new MutationPayload$RSXform();
            case 2:
                return new N0();
            case 3:
                return com.google.protobuf.o.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001\u0003က\u0002\u0004က\u0003", new Object[]{"bitField0_", "scos_", "ssin_", "tx_", "ty_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                j26 j26Var = PARSER;
                if (j26Var != null) {
                    return j26Var;
                }
                synchronized (MutationPayload$RSXform.class) {
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

    public double getScos() {
        return this.scos_;
    }

    public double getSsin() {
        return this.ssin_;
    }

    public double getTx() {
        return this.tx_;
    }

    public double getTy() {
        return this.ty_;
    }

    public boolean hasScos() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasSsin() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasTx() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasTy() {
        return (this.bitField0_ & 8) != 0;
    }

    public static N0 newBuilder(MutationPayload$RSXform mutationPayload$RSXform) {
        return (N0) DEFAULT_INSTANCE.createBuilder(mutationPayload$RSXform);
    }

    public static MutationPayload$RSXform parseDelimitedFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$RSXform) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$RSXform parseFrom(ByteBuffer byteBuffer, h72 h72Var) {
        return (MutationPayload$RSXform) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer, h72Var);
    }

    public static MutationPayload$RSXform parseFrom(ByteString byteString) {
        return (MutationPayload$RSXform) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MutationPayload$RSXform parseFrom(ByteString byteString, h72 h72Var) {
        return (MutationPayload$RSXform) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString, h72Var);
    }

    public static MutationPayload$RSXform parseFrom(byte[] bArr) {
        return (MutationPayload$RSXform) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MutationPayload$RSXform parseFrom(byte[] bArr, h72 h72Var) {
        return (MutationPayload$RSXform) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr, h72Var);
    }

    public static MutationPayload$RSXform parseFrom(InputStream inputStream) {
        return (MutationPayload$RSXform) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$RSXform parseFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$RSXform) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$RSXform parseFrom(lu0 lu0Var) {
        return (MutationPayload$RSXform) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var);
    }

    public static MutationPayload$RSXform parseFrom(lu0 lu0Var, h72 h72Var) {
        return (MutationPayload$RSXform) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var, h72Var);
    }
}
