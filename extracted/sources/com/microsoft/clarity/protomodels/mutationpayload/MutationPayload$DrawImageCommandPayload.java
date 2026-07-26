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
public final class MutationPayload$DrawImageCommandPayload extends com.google.protobuf.o implements fv4 {
    private static final MutationPayload$DrawImageCommandPayload DEFAULT_INSTANCE;
    public static final int IMAGE_INDEX_FIELD_NUMBER = 3;
    public static final int MASKED_COLOR_FIELD_NUMBER = 7;
    public static final int MASKED_HEIGHT_FIELD_NUMBER = 6;
    public static final int MASKED_WIDTH_FIELD_NUMBER = 5;
    public static final int PAINT_INDEX_FIELD_NUMBER = 8;
    private static volatile j26 PARSER = null;
    public static final int SAMPLING_FIELD_NUMBER = 4;
    public static final int X_FIELD_NUMBER = 1;
    public static final int Y_FIELD_NUMBER = 2;
    private int bitField0_;
    private int imageIndex_;
    private MutationPayload$Color4f maskedColor_;
    private int maskedHeight_;
    private int maskedWidth_;
    private int paintIndex_;
    private MutationPayload$Sampling sampling_;
    private float x_;
    private float y_;

    static {
        MutationPayload$DrawImageCommandPayload mutationPayload$DrawImageCommandPayload = new MutationPayload$DrawImageCommandPayload();
        DEFAULT_INSTANCE = mutationPayload$DrawImageCommandPayload;
        com.google.protobuf.o.registerDefaultInstance(MutationPayload$DrawImageCommandPayload.class, mutationPayload$DrawImageCommandPayload);
    }

    private MutationPayload$DrawImageCommandPayload() {
    }

    private void clearImageIndex() {
        this.bitField0_ &= -5;
        this.imageIndex_ = 0;
    }

    private void clearMaskedColor() {
        this.maskedColor_ = null;
        this.bitField0_ &= -65;
    }

    private void clearMaskedHeight() {
        this.bitField0_ &= -33;
        this.maskedHeight_ = 0;
    }

    private void clearMaskedWidth() {
        this.bitField0_ &= -17;
        this.maskedWidth_ = 0;
    }

    private void clearPaintIndex() {
        this.bitField0_ &= -129;
        this.paintIndex_ = 0;
    }

    private void clearSampling() {
        this.sampling_ = null;
        this.bitField0_ &= -9;
    }

    private void clearX() {
        this.bitField0_ &= -2;
        this.x_ = 0.0f;
    }

    private void clearY() {
        this.bitField0_ &= -3;
        this.y_ = 0.0f;
    }

    public static MutationPayload$DrawImageCommandPayload getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeMaskedColor(MutationPayload$Color4f mutationPayload$Color4f) {
        mutationPayload$Color4f.getClass();
        MutationPayload$Color4f mutationPayload$Color4f2 = this.maskedColor_;
        if (mutationPayload$Color4f2 == null || mutationPayload$Color4f2 == MutationPayload$Color4f.getDefaultInstance()) {
            this.maskedColor_ = mutationPayload$Color4f;
        } else {
            this.maskedColor_ = (MutationPayload$Color4f) ((C0114f) MutationPayload$Color4f.newBuilder(this.maskedColor_).mergeFrom((com.google.protobuf.o) mutationPayload$Color4f)).buildPartial();
        }
        this.bitField0_ |= 64;
    }

    private void mergeSampling(MutationPayload$Sampling mutationPayload$Sampling) {
        mutationPayload$Sampling.getClass();
        MutationPayload$Sampling mutationPayload$Sampling2 = this.sampling_;
        if (mutationPayload$Sampling2 == null || mutationPayload$Sampling2 == MutationPayload$Sampling.getDefaultInstance()) {
            this.sampling_ = mutationPayload$Sampling;
        } else {
            this.sampling_ = (MutationPayload$Sampling) ((V0) MutationPayload$Sampling.newBuilder(this.sampling_).mergeFrom((com.google.protobuf.o) mutationPayload$Sampling)).buildPartial();
        }
        this.bitField0_ |= 8;
    }

    public static F newBuilder() {
        return (F) DEFAULT_INSTANCE.createBuilder();
    }

    public static MutationPayload$DrawImageCommandPayload parseDelimitedFrom(InputStream inputStream) {
        return (MutationPayload$DrawImageCommandPayload) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$DrawImageCommandPayload parseFrom(ByteBuffer byteBuffer) {
        return (MutationPayload$DrawImageCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static j26 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImageIndex(int i) {
        this.bitField0_ |= 4;
        this.imageIndex_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaskedColor(MutationPayload$Color4f mutationPayload$Color4f) {
        mutationPayload$Color4f.getClass();
        this.maskedColor_ = mutationPayload$Color4f;
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaskedHeight(int i) {
        this.bitField0_ |= 32;
        this.maskedHeight_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaskedWidth(int i) {
        this.bitField0_ |= 16;
        this.maskedWidth_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPaintIndex(int i) {
        this.bitField0_ |= 128;
        this.paintIndex_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSampling(MutationPayload$Sampling mutationPayload$Sampling) {
        mutationPayload$Sampling.getClass();
        this.sampling_ = mutationPayload$Sampling;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setX(float f) {
        this.bitField0_ |= 1;
        this.x_ = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setY(float f) {
        this.bitField0_ |= 2;
        this.y_ = f;
    }

    @Override // com.google.protobuf.o
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, Object obj, Object obj2) {
        j26 fr2Var;
        switch (AbstractC0103a.a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new MutationPayload$DrawImageCommandPayload();
            case 2:
                return new F();
            case 3:
                return com.google.protobuf.o.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003င\u0002\u0004ဉ\u0003\u0005င\u0004\u0006င\u0005\u0007ဉ\u0006\bင\u0007", new Object[]{"bitField0_", "x_", "y_", "imageIndex_", "sampling_", "maskedWidth_", "maskedHeight_", "maskedColor_", "paintIndex_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                j26 j26Var = PARSER;
                if (j26Var != null) {
                    return j26Var;
                }
                synchronized (MutationPayload$DrawImageCommandPayload.class) {
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

    public int getImageIndex() {
        return this.imageIndex_;
    }

    public MutationPayload$Color4f getMaskedColor() {
        MutationPayload$Color4f mutationPayload$Color4f = this.maskedColor_;
        return mutationPayload$Color4f == null ? MutationPayload$Color4f.getDefaultInstance() : mutationPayload$Color4f;
    }

    public int getMaskedHeight() {
        return this.maskedHeight_;
    }

    public int getMaskedWidth() {
        return this.maskedWidth_;
    }

    public int getPaintIndex() {
        return this.paintIndex_;
    }

    public MutationPayload$Sampling getSampling() {
        MutationPayload$Sampling mutationPayload$Sampling = this.sampling_;
        return mutationPayload$Sampling == null ? MutationPayload$Sampling.getDefaultInstance() : mutationPayload$Sampling;
    }

    public float getX() {
        return this.x_;
    }

    public float getY() {
        return this.y_;
    }

    public boolean hasImageIndex() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasMaskedColor() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasMaskedHeight() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasMaskedWidth() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasPaintIndex() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasSampling() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasX() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasY() {
        return (this.bitField0_ & 2) != 0;
    }

    public static F newBuilder(MutationPayload$DrawImageCommandPayload mutationPayload$DrawImageCommandPayload) {
        return (F) DEFAULT_INSTANCE.createBuilder(mutationPayload$DrawImageCommandPayload);
    }

    public static MutationPayload$DrawImageCommandPayload parseDelimitedFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$DrawImageCommandPayload) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$DrawImageCommandPayload parseFrom(ByteBuffer byteBuffer, h72 h72Var) {
        return (MutationPayload$DrawImageCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer, h72Var);
    }

    public static MutationPayload$DrawImageCommandPayload parseFrom(ByteString byteString) {
        return (MutationPayload$DrawImageCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MutationPayload$DrawImageCommandPayload parseFrom(ByteString byteString, h72 h72Var) {
        return (MutationPayload$DrawImageCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString, h72Var);
    }

    public static MutationPayload$DrawImageCommandPayload parseFrom(byte[] bArr) {
        return (MutationPayload$DrawImageCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MutationPayload$DrawImageCommandPayload parseFrom(byte[] bArr, h72 h72Var) {
        return (MutationPayload$DrawImageCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr, h72Var);
    }

    public static MutationPayload$DrawImageCommandPayload parseFrom(InputStream inputStream) {
        return (MutationPayload$DrawImageCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$DrawImageCommandPayload parseFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$DrawImageCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$DrawImageCommandPayload parseFrom(lu0 lu0Var) {
        return (MutationPayload$DrawImageCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var);
    }

    public static MutationPayload$DrawImageCommandPayload parseFrom(lu0 lu0Var, h72 h72Var) {
        return (MutationPayload$DrawImageCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var, h72Var);
    }
}
