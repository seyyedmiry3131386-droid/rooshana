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
public final class MutationPayload$SaveLayerCommandPayload extends com.google.protobuf.o implements fv4 {
    public static final int BOUNDS_FIELD_NUMBER = 1;
    private static final MutationPayload$SaveLayerCommandPayload DEFAULT_INSTANCE;
    public static final int FLAGS_FIELD_NUMBER = 2;
    public static final int IMAGE_FILTER_PAINT_FIELD_NUMBER = 3;
    public static final int PAINT_INDEX_FIELD_NUMBER = 4;
    private static volatile j26 PARSER;
    private int bitField0_;
    private MutationPayload$Rect bounds_;
    private int flags_;
    private int imageFilterPaint_;
    private int paintIndex_;

    static {
        MutationPayload$SaveLayerCommandPayload mutationPayload$SaveLayerCommandPayload = new MutationPayload$SaveLayerCommandPayload();
        DEFAULT_INSTANCE = mutationPayload$SaveLayerCommandPayload;
        com.google.protobuf.o.registerDefaultInstance(MutationPayload$SaveLayerCommandPayload.class, mutationPayload$SaveLayerCommandPayload);
    }

    private MutationPayload$SaveLayerCommandPayload() {
    }

    private void clearBounds() {
        this.bounds_ = null;
        this.bitField0_ &= -2;
    }

    private void clearFlags() {
        this.bitField0_ &= -3;
        this.flags_ = 0;
    }

    private void clearImageFilterPaint() {
        this.bitField0_ &= -5;
        this.imageFilterPaint_ = 0;
    }

    private void clearPaintIndex() {
        this.bitField0_ &= -9;
        this.paintIndex_ = 0;
    }

    public static MutationPayload$SaveLayerCommandPayload getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeBounds(MutationPayload$Rect mutationPayload$Rect) {
        mutationPayload$Rect.getClass();
        MutationPayload$Rect mutationPayload$Rect2 = this.bounds_;
        if (mutationPayload$Rect2 == null || mutationPayload$Rect2 == MutationPayload$Rect.getDefaultInstance()) {
            this.bounds_ = mutationPayload$Rect;
        } else {
            this.bounds_ = (MutationPayload$Rect) ((P0) MutationPayload$Rect.newBuilder(this.bounds_).mergeFrom((com.google.protobuf.o) mutationPayload$Rect)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static C0105a1 newBuilder() {
        return (C0105a1) DEFAULT_INSTANCE.createBuilder();
    }

    public static MutationPayload$SaveLayerCommandPayload parseDelimitedFrom(InputStream inputStream) {
        return (MutationPayload$SaveLayerCommandPayload) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$SaveLayerCommandPayload parseFrom(ByteBuffer byteBuffer) {
        return (MutationPayload$SaveLayerCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static j26 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBounds(MutationPayload$Rect mutationPayload$Rect) {
        mutationPayload$Rect.getClass();
        this.bounds_ = mutationPayload$Rect;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFlags(int i) {
        this.bitField0_ |= 2;
        this.flags_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImageFilterPaint(int i) {
        this.bitField0_ |= 4;
        this.imageFilterPaint_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPaintIndex(int i) {
        this.bitField0_ |= 8;
        this.paintIndex_ = i;
    }

    @Override // com.google.protobuf.o
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, Object obj, Object obj2) {
        j26 fr2Var;
        switch (AbstractC0103a.a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new MutationPayload$SaveLayerCommandPayload();
            case 2:
                return new C0105a1();
            case 3:
                return com.google.protobuf.o.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"bitField0_", "bounds_", "flags_", "imageFilterPaint_", "paintIndex_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                j26 j26Var = PARSER;
                if (j26Var != null) {
                    return j26Var;
                }
                synchronized (MutationPayload$SaveLayerCommandPayload.class) {
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

    public MutationPayload$Rect getBounds() {
        MutationPayload$Rect mutationPayload$Rect = this.bounds_;
        return mutationPayload$Rect == null ? MutationPayload$Rect.getDefaultInstance() : mutationPayload$Rect;
    }

    public int getFlags() {
        return this.flags_;
    }

    public int getImageFilterPaint() {
        return this.imageFilterPaint_;
    }

    public int getPaintIndex() {
        return this.paintIndex_;
    }

    public boolean hasBounds() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasFlags() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasImageFilterPaint() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasPaintIndex() {
        return (this.bitField0_ & 8) != 0;
    }

    public static C0105a1 newBuilder(MutationPayload$SaveLayerCommandPayload mutationPayload$SaveLayerCommandPayload) {
        return (C0105a1) DEFAULT_INSTANCE.createBuilder(mutationPayload$SaveLayerCommandPayload);
    }

    public static MutationPayload$SaveLayerCommandPayload parseDelimitedFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$SaveLayerCommandPayload) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$SaveLayerCommandPayload parseFrom(ByteBuffer byteBuffer, h72 h72Var) {
        return (MutationPayload$SaveLayerCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer, h72Var);
    }

    public static MutationPayload$SaveLayerCommandPayload parseFrom(ByteString byteString) {
        return (MutationPayload$SaveLayerCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MutationPayload$SaveLayerCommandPayload parseFrom(ByteString byteString, h72 h72Var) {
        return (MutationPayload$SaveLayerCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString, h72Var);
    }

    public static MutationPayload$SaveLayerCommandPayload parseFrom(byte[] bArr) {
        return (MutationPayload$SaveLayerCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MutationPayload$SaveLayerCommandPayload parseFrom(byte[] bArr, h72 h72Var) {
        return (MutationPayload$SaveLayerCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr, h72Var);
    }

    public static MutationPayload$SaveLayerCommandPayload parseFrom(InputStream inputStream) {
        return (MutationPayload$SaveLayerCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$SaveLayerCommandPayload parseFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$SaveLayerCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$SaveLayerCommandPayload parseFrom(lu0 lu0Var) {
        return (MutationPayload$SaveLayerCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var);
    }

    public static MutationPayload$SaveLayerCommandPayload parseFrom(lu0 lu0Var, h72 h72Var) {
        return (MutationPayload$SaveLayerCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var, h72Var);
    }
}
