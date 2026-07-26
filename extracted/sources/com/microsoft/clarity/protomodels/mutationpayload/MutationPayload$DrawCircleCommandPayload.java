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
public final class MutationPayload$DrawCircleCommandPayload extends com.google.protobuf.o implements fv4 {
    private static final MutationPayload$DrawCircleCommandPayload DEFAULT_INSTANCE;
    public static final int PAINTINDEX_FIELD_NUMBER = 1;
    private static volatile j26 PARSER = null;
    public static final int POINT_FIELD_NUMBER = 2;
    public static final int RADIUS_FIELD_NUMBER = 3;
    private int bitField0_;
    private int paintIndex_;
    private MutationPayload$Point point_;
    private double radius_;

    static {
        MutationPayload$DrawCircleCommandPayload mutationPayload$DrawCircleCommandPayload = new MutationPayload$DrawCircleCommandPayload();
        DEFAULT_INSTANCE = mutationPayload$DrawCircleCommandPayload;
        com.google.protobuf.o.registerDefaultInstance(MutationPayload$DrawCircleCommandPayload.class, mutationPayload$DrawCircleCommandPayload);
    }

    private MutationPayload$DrawCircleCommandPayload() {
    }

    private void clearPaintIndex() {
        this.bitField0_ &= -2;
        this.paintIndex_ = 0;
    }

    private void clearPoint() {
        this.point_ = null;
        this.bitField0_ &= -3;
    }

    private void clearRadius() {
        this.bitField0_ &= -5;
        this.radius_ = 0.0d;
    }

    public static MutationPayload$DrawCircleCommandPayload getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergePoint(MutationPayload$Point mutationPayload$Point) {
        mutationPayload$Point.getClass();
        MutationPayload$Point mutationPayload$Point2 = this.point_;
        if (mutationPayload$Point2 == null || mutationPayload$Point2 == MutationPayload$Point.getDefaultInstance()) {
            this.point_ = mutationPayload$Point;
        } else {
            this.point_ = (MutationPayload$Point) ((L0) MutationPayload$Point.newBuilder(this.point_).mergeFrom((com.google.protobuf.o) mutationPayload$Point)).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    public static C newBuilder() {
        return (C) DEFAULT_INSTANCE.createBuilder();
    }

    public static MutationPayload$DrawCircleCommandPayload parseDelimitedFrom(InputStream inputStream) {
        return (MutationPayload$DrawCircleCommandPayload) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$DrawCircleCommandPayload parseFrom(ByteBuffer byteBuffer) {
        return (MutationPayload$DrawCircleCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static j26 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setPaintIndex(int i) {
        this.bitField0_ |= 1;
        this.paintIndex_ = i;
    }

    private void setPoint(MutationPayload$Point mutationPayload$Point) {
        mutationPayload$Point.getClass();
        this.point_ = mutationPayload$Point;
        this.bitField0_ |= 2;
    }

    private void setRadius(double d) {
        this.bitField0_ |= 4;
        this.radius_ = d;
    }

    @Override // com.google.protobuf.o
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, Object obj, Object obj2) {
        j26 fr2Var;
        switch (AbstractC0103a.a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new MutationPayload$DrawCircleCommandPayload();
            case 2:
                return new C();
            case 3:
                return com.google.protobuf.o.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003က\u0002", new Object[]{"bitField0_", "paintIndex_", "point_", "radius_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                j26 j26Var = PARSER;
                if (j26Var != null) {
                    return j26Var;
                }
                synchronized (MutationPayload$DrawCircleCommandPayload.class) {
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

    public MutationPayload$Point getPoint() {
        MutationPayload$Point mutationPayload$Point = this.point_;
        return mutationPayload$Point == null ? MutationPayload$Point.getDefaultInstance() : mutationPayload$Point;
    }

    public double getRadius() {
        return this.radius_;
    }

    public boolean hasPaintIndex() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasPoint() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasRadius() {
        return (this.bitField0_ & 4) != 0;
    }

    public static C newBuilder(MutationPayload$DrawCircleCommandPayload mutationPayload$DrawCircleCommandPayload) {
        return (C) DEFAULT_INSTANCE.createBuilder(mutationPayload$DrawCircleCommandPayload);
    }

    public static MutationPayload$DrawCircleCommandPayload parseDelimitedFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$DrawCircleCommandPayload) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$DrawCircleCommandPayload parseFrom(ByteBuffer byteBuffer, h72 h72Var) {
        return (MutationPayload$DrawCircleCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer, h72Var);
    }

    public static MutationPayload$DrawCircleCommandPayload parseFrom(ByteString byteString) {
        return (MutationPayload$DrawCircleCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MutationPayload$DrawCircleCommandPayload parseFrom(ByteString byteString, h72 h72Var) {
        return (MutationPayload$DrawCircleCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString, h72Var);
    }

    public static MutationPayload$DrawCircleCommandPayload parseFrom(byte[] bArr) {
        return (MutationPayload$DrawCircleCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MutationPayload$DrawCircleCommandPayload parseFrom(byte[] bArr, h72 h72Var) {
        return (MutationPayload$DrawCircleCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr, h72Var);
    }

    public static MutationPayload$DrawCircleCommandPayload parseFrom(InputStream inputStream) {
        return (MutationPayload$DrawCircleCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$DrawCircleCommandPayload parseFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$DrawCircleCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$DrawCircleCommandPayload parseFrom(lu0 lu0Var) {
        return (MutationPayload$DrawCircleCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var);
    }

    public static MutationPayload$DrawCircleCommandPayload parseFrom(lu0 lu0Var, h72 h72Var) {
        return (MutationPayload$DrawCircleCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var, h72Var);
    }
}
