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
public final class MutationPayload$DrawArcCommandPayload extends com.google.protobuf.o implements fv4 {
    private static final MutationPayload$DrawArcCommandPayload DEFAULT_INSTANCE;
    public static final int PAINT_INDEX_FIELD_NUMBER = 5;
    private static volatile j26 PARSER = null;
    public static final int RECT_FIELD_NUMBER = 1;
    public static final int START_ANGLE_FIELD_NUMBER = 2;
    public static final int SWEEP_ANGLE_FIELD_NUMBER = 3;
    public static final int USE_CENTER_FIELD_NUMBER = 4;
    private int bitField0_;
    private int paintIndex_;
    private MutationPayload$Rect rect_;
    private float startAngle_;
    private float sweepAngle_;
    private boolean useCenter_;

    static {
        MutationPayload$DrawArcCommandPayload mutationPayload$DrawArcCommandPayload = new MutationPayload$DrawArcCommandPayload();
        DEFAULT_INSTANCE = mutationPayload$DrawArcCommandPayload;
        com.google.protobuf.o.registerDefaultInstance(MutationPayload$DrawArcCommandPayload.class, mutationPayload$DrawArcCommandPayload);
    }

    private MutationPayload$DrawArcCommandPayload() {
    }

    private void clearPaintIndex() {
        this.bitField0_ &= -17;
        this.paintIndex_ = 0;
    }

    private void clearRect() {
        this.rect_ = null;
        this.bitField0_ &= -2;
    }

    private void clearStartAngle() {
        this.bitField0_ &= -3;
        this.startAngle_ = 0.0f;
    }

    private void clearSweepAngle() {
        this.bitField0_ &= -5;
        this.sweepAngle_ = 0.0f;
    }

    private void clearUseCenter() {
        this.bitField0_ &= -9;
        this.useCenter_ = false;
    }

    public static MutationPayload$DrawArcCommandPayload getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeRect(MutationPayload$Rect mutationPayload$Rect) {
        mutationPayload$Rect.getClass();
        MutationPayload$Rect mutationPayload$Rect2 = this.rect_;
        if (mutationPayload$Rect2 == null || mutationPayload$Rect2 == MutationPayload$Rect.getDefaultInstance()) {
            this.rect_ = mutationPayload$Rect;
        } else {
            this.rect_ = (MutationPayload$Rect) ((P0) MutationPayload$Rect.newBuilder(this.rect_).mergeFrom((com.google.protobuf.o) mutationPayload$Rect)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static C0153z newBuilder() {
        return (C0153z) DEFAULT_INSTANCE.createBuilder();
    }

    public static MutationPayload$DrawArcCommandPayload parseDelimitedFrom(InputStream inputStream) {
        return (MutationPayload$DrawArcCommandPayload) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$DrawArcCommandPayload parseFrom(ByteBuffer byteBuffer) {
        return (MutationPayload$DrawArcCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static j26 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPaintIndex(int i) {
        this.bitField0_ |= 16;
        this.paintIndex_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRect(MutationPayload$Rect mutationPayload$Rect) {
        mutationPayload$Rect.getClass();
        this.rect_ = mutationPayload$Rect;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartAngle(float f) {
        this.bitField0_ |= 2;
        this.startAngle_ = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSweepAngle(float f) {
        this.bitField0_ |= 4;
        this.sweepAngle_ = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUseCenter(boolean z) {
        this.bitField0_ |= 8;
        this.useCenter_ = z;
    }

    @Override // com.google.protobuf.o
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, Object obj, Object obj2) {
        j26 fr2Var;
        switch (AbstractC0103a.a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new MutationPayload$DrawArcCommandPayload();
            case 2:
                return new C0153z();
            case 3:
                return com.google.protobuf.o.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ဇ\u0003\u0005င\u0004", new Object[]{"bitField0_", "rect_", "startAngle_", "sweepAngle_", "useCenter_", "paintIndex_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                j26 j26Var = PARSER;
                if (j26Var != null) {
                    return j26Var;
                }
                synchronized (MutationPayload$DrawArcCommandPayload.class) {
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

    public MutationPayload$Rect getRect() {
        MutationPayload$Rect mutationPayload$Rect = this.rect_;
        return mutationPayload$Rect == null ? MutationPayload$Rect.getDefaultInstance() : mutationPayload$Rect;
    }

    public float getStartAngle() {
        return this.startAngle_;
    }

    public float getSweepAngle() {
        return this.sweepAngle_;
    }

    public boolean getUseCenter() {
        return this.useCenter_;
    }

    public boolean hasPaintIndex() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasRect() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasStartAngle() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasSweepAngle() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasUseCenter() {
        return (this.bitField0_ & 8) != 0;
    }

    public static C0153z newBuilder(MutationPayload$DrawArcCommandPayload mutationPayload$DrawArcCommandPayload) {
        return (C0153z) DEFAULT_INSTANCE.createBuilder(mutationPayload$DrawArcCommandPayload);
    }

    public static MutationPayload$DrawArcCommandPayload parseDelimitedFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$DrawArcCommandPayload) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$DrawArcCommandPayload parseFrom(ByteBuffer byteBuffer, h72 h72Var) {
        return (MutationPayload$DrawArcCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer, h72Var);
    }

    public static MutationPayload$DrawArcCommandPayload parseFrom(ByteString byteString) {
        return (MutationPayload$DrawArcCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MutationPayload$DrawArcCommandPayload parseFrom(ByteString byteString, h72 h72Var) {
        return (MutationPayload$DrawArcCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString, h72Var);
    }

    public static MutationPayload$DrawArcCommandPayload parseFrom(byte[] bArr) {
        return (MutationPayload$DrawArcCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MutationPayload$DrawArcCommandPayload parseFrom(byte[] bArr, h72 h72Var) {
        return (MutationPayload$DrawArcCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr, h72Var);
    }

    public static MutationPayload$DrawArcCommandPayload parseFrom(InputStream inputStream) {
        return (MutationPayload$DrawArcCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$DrawArcCommandPayload parseFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$DrawArcCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$DrawArcCommandPayload parseFrom(lu0 lu0Var) {
        return (MutationPayload$DrawArcCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var);
    }

    public static MutationPayload$DrawArcCommandPayload parseFrom(lu0 lu0Var, h72 h72Var) {
        return (MutationPayload$DrawArcCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var, h72Var);
    }
}
