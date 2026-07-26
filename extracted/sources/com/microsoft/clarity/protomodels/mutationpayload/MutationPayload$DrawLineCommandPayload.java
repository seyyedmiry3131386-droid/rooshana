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
public final class MutationPayload$DrawLineCommandPayload extends com.google.protobuf.o implements fv4 {
    private static final MutationPayload$DrawLineCommandPayload DEFAULT_INSTANCE;
    public static final int PAINTINDEX_FIELD_NUMBER = 1;
    private static volatile j26 PARSER = null;
    public static final int POINT1_FIELD_NUMBER = 2;
    public static final int POINT2_FIELD_NUMBER = 3;
    private int bitField0_;
    private int paintIndex_;
    private MutationPayload$Point point1_;
    private MutationPayload$Point point2_;

    static {
        MutationPayload$DrawLineCommandPayload mutationPayload$DrawLineCommandPayload = new MutationPayload$DrawLineCommandPayload();
        DEFAULT_INSTANCE = mutationPayload$DrawLineCommandPayload;
        com.google.protobuf.o.registerDefaultInstance(MutationPayload$DrawLineCommandPayload.class, mutationPayload$DrawLineCommandPayload);
    }

    private MutationPayload$DrawLineCommandPayload() {
    }

    private void clearPaintIndex() {
        this.bitField0_ &= -2;
        this.paintIndex_ = 0;
    }

    private void clearPoint1() {
        this.point1_ = null;
        this.bitField0_ &= -3;
    }

    private void clearPoint2() {
        this.point2_ = null;
        this.bitField0_ &= -5;
    }

    public static MutationPayload$DrawLineCommandPayload getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergePoint1(MutationPayload$Point mutationPayload$Point) {
        mutationPayload$Point.getClass();
        MutationPayload$Point mutationPayload$Point2 = this.point1_;
        if (mutationPayload$Point2 == null || mutationPayload$Point2 == MutationPayload$Point.getDefaultInstance()) {
            this.point1_ = mutationPayload$Point;
        } else {
            this.point1_ = (MutationPayload$Point) ((L0) MutationPayload$Point.newBuilder(this.point1_).mergeFrom((com.google.protobuf.o) mutationPayload$Point)).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    private void mergePoint2(MutationPayload$Point mutationPayload$Point) {
        mutationPayload$Point.getClass();
        MutationPayload$Point mutationPayload$Point2 = this.point2_;
        if (mutationPayload$Point2 == null || mutationPayload$Point2 == MutationPayload$Point.getDefaultInstance()) {
            this.point2_ = mutationPayload$Point;
        } else {
            this.point2_ = (MutationPayload$Point) ((L0) MutationPayload$Point.newBuilder(this.point2_).mergeFrom((com.google.protobuf.o) mutationPayload$Point)).buildPartial();
        }
        this.bitField0_ |= 4;
    }

    public static J newBuilder() {
        return (J) DEFAULT_INSTANCE.createBuilder();
    }

    public static MutationPayload$DrawLineCommandPayload parseDelimitedFrom(InputStream inputStream) {
        return (MutationPayload$DrawLineCommandPayload) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$DrawLineCommandPayload parseFrom(ByteBuffer byteBuffer) {
        return (MutationPayload$DrawLineCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static j26 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setPaintIndex(int i) {
        this.bitField0_ |= 1;
        this.paintIndex_ = i;
    }

    private void setPoint1(MutationPayload$Point mutationPayload$Point) {
        mutationPayload$Point.getClass();
        this.point1_ = mutationPayload$Point;
        this.bitField0_ |= 2;
    }

    private void setPoint2(MutationPayload$Point mutationPayload$Point) {
        mutationPayload$Point.getClass();
        this.point2_ = mutationPayload$Point;
        this.bitField0_ |= 4;
    }

    @Override // com.google.protobuf.o
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, Object obj, Object obj2) {
        j26 fr2Var;
        switch (AbstractC0103a.a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new MutationPayload$DrawLineCommandPayload();
            case 2:
                return new J();
            case 3:
                return com.google.protobuf.o.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"bitField0_", "paintIndex_", "point1_", "point2_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                j26 j26Var = PARSER;
                if (j26Var != null) {
                    return j26Var;
                }
                synchronized (MutationPayload$DrawLineCommandPayload.class) {
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

    public MutationPayload$Point getPoint1() {
        MutationPayload$Point mutationPayload$Point = this.point1_;
        return mutationPayload$Point == null ? MutationPayload$Point.getDefaultInstance() : mutationPayload$Point;
    }

    public MutationPayload$Point getPoint2() {
        MutationPayload$Point mutationPayload$Point = this.point2_;
        return mutationPayload$Point == null ? MutationPayload$Point.getDefaultInstance() : mutationPayload$Point;
    }

    public boolean hasPaintIndex() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasPoint1() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasPoint2() {
        return (this.bitField0_ & 4) != 0;
    }

    public static J newBuilder(MutationPayload$DrawLineCommandPayload mutationPayload$DrawLineCommandPayload) {
        return (J) DEFAULT_INSTANCE.createBuilder(mutationPayload$DrawLineCommandPayload);
    }

    public static MutationPayload$DrawLineCommandPayload parseDelimitedFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$DrawLineCommandPayload) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$DrawLineCommandPayload parseFrom(ByteBuffer byteBuffer, h72 h72Var) {
        return (MutationPayload$DrawLineCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer, h72Var);
    }

    public static MutationPayload$DrawLineCommandPayload parseFrom(ByteString byteString) {
        return (MutationPayload$DrawLineCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MutationPayload$DrawLineCommandPayload parseFrom(ByteString byteString, h72 h72Var) {
        return (MutationPayload$DrawLineCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString, h72Var);
    }

    public static MutationPayload$DrawLineCommandPayload parseFrom(byte[] bArr) {
        return (MutationPayload$DrawLineCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MutationPayload$DrawLineCommandPayload parseFrom(byte[] bArr, h72 h72Var) {
        return (MutationPayload$DrawLineCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr, h72Var);
    }

    public static MutationPayload$DrawLineCommandPayload parseFrom(InputStream inputStream) {
        return (MutationPayload$DrawLineCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$DrawLineCommandPayload parseFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$DrawLineCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$DrawLineCommandPayload parseFrom(lu0 lu0Var) {
        return (MutationPayload$DrawLineCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var);
    }

    public static MutationPayload$DrawLineCommandPayload parseFrom(lu0 lu0Var, h72 h72Var) {
        return (MutationPayload$DrawLineCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var, h72Var);
    }
}
