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
public final class MutationPayload$RotateCommandPayload extends com.google.protobuf.o implements fv4 {
    public static final int ANGLEINDEGREES_FIELD_NUMBER = 1;
    private static final MutationPayload$RotateCommandPayload DEFAULT_INSTANCE;
    private static volatile j26 PARSER = null;
    public static final int RX_FIELD_NUMBER = 2;
    public static final int RY_FIELD_NUMBER = 3;
    private double angleInDegrees_;
    private int bitField0_;
    private double rx_;
    private double ry_;

    static {
        MutationPayload$RotateCommandPayload mutationPayload$RotateCommandPayload = new MutationPayload$RotateCommandPayload();
        DEFAULT_INSTANCE = mutationPayload$RotateCommandPayload;
        com.google.protobuf.o.registerDefaultInstance(MutationPayload$RotateCommandPayload.class, mutationPayload$RotateCommandPayload);
    }

    private MutationPayload$RotateCommandPayload() {
    }

    private void clearAngleInDegrees() {
        this.bitField0_ &= -2;
        this.angleInDegrees_ = 0.0d;
    }

    private void clearRx() {
        this.bitField0_ &= -3;
        this.rx_ = 0.0d;
    }

    private void clearRy() {
        this.bitField0_ &= -5;
        this.ry_ = 0.0d;
    }

    public static MutationPayload$RotateCommandPayload getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static U0 newBuilder() {
        return (U0) DEFAULT_INSTANCE.createBuilder();
    }

    public static MutationPayload$RotateCommandPayload parseDelimitedFrom(InputStream inputStream) {
        return (MutationPayload$RotateCommandPayload) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$RotateCommandPayload parseFrom(ByteBuffer byteBuffer) {
        return (MutationPayload$RotateCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static j26 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setAngleInDegrees(double d) {
        this.bitField0_ |= 1;
        this.angleInDegrees_ = d;
    }

    private void setRx(double d) {
        this.bitField0_ |= 2;
        this.rx_ = d;
    }

    private void setRy(double d) {
        this.bitField0_ |= 4;
        this.ry_ = d;
    }

    @Override // com.google.protobuf.o
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, Object obj, Object obj2) {
        j26 fr2Var;
        switch (AbstractC0103a.a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new MutationPayload$RotateCommandPayload();
            case 2:
                return new U0();
            case 3:
                return com.google.protobuf.o.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001\u0003က\u0002", new Object[]{"bitField0_", "angleInDegrees_", "rx_", "ry_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                j26 j26Var = PARSER;
                if (j26Var != null) {
                    return j26Var;
                }
                synchronized (MutationPayload$RotateCommandPayload.class) {
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

    public double getAngleInDegrees() {
        return this.angleInDegrees_;
    }

    public double getRx() {
        return this.rx_;
    }

    public double getRy() {
        return this.ry_;
    }

    public boolean hasAngleInDegrees() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasRx() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasRy() {
        return (this.bitField0_ & 4) != 0;
    }

    public static U0 newBuilder(MutationPayload$RotateCommandPayload mutationPayload$RotateCommandPayload) {
        return (U0) DEFAULT_INSTANCE.createBuilder(mutationPayload$RotateCommandPayload);
    }

    public static MutationPayload$RotateCommandPayload parseDelimitedFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$RotateCommandPayload) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$RotateCommandPayload parseFrom(ByteBuffer byteBuffer, h72 h72Var) {
        return (MutationPayload$RotateCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer, h72Var);
    }

    public static MutationPayload$RotateCommandPayload parseFrom(ByteString byteString) {
        return (MutationPayload$RotateCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MutationPayload$RotateCommandPayload parseFrom(ByteString byteString, h72 h72Var) {
        return (MutationPayload$RotateCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString, h72Var);
    }

    public static MutationPayload$RotateCommandPayload parseFrom(byte[] bArr) {
        return (MutationPayload$RotateCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MutationPayload$RotateCommandPayload parseFrom(byte[] bArr, h72 h72Var) {
        return (MutationPayload$RotateCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr, h72Var);
    }

    public static MutationPayload$RotateCommandPayload parseFrom(InputStream inputStream) {
        return (MutationPayload$RotateCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$RotateCommandPayload parseFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$RotateCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$RotateCommandPayload parseFrom(lu0 lu0Var) {
        return (MutationPayload$RotateCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var);
    }

    public static MutationPayload$RotateCommandPayload parseFrom(lu0 lu0Var, h72 h72Var) {
        return (MutationPayload$RotateCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var, h72Var);
    }
}
