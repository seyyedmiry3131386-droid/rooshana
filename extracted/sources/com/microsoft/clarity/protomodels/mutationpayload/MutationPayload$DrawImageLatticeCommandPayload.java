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
public final class MutationPayload$DrawImageLatticeCommandPayload extends com.google.protobuf.o implements fv4 {
    private static final MutationPayload$DrawImageLatticeCommandPayload DEFAULT_INSTANCE;
    public static final int DST_FIELD_NUMBER = 2;
    public static final int FILTER_MODE_FIELD_NUMBER = 4;
    public static final int IMAGE_INDEX_FIELD_NUMBER = 3;
    public static final int LATTICE_FIELD_NUMBER = 1;
    public static final int MASKED_COLOR_FIELD_NUMBER = 7;
    public static final int MASKED_HEIGHT_FIELD_NUMBER = 6;
    public static final int MASKED_WIDTH_FIELD_NUMBER = 5;
    public static final int PAINT_INDEX_FIELD_NUMBER = 8;
    private static volatile j26 PARSER;
    private int bitField0_;
    private MutationPayload$Rect dst_;
    private double filterMode_;
    private int imageIndex_;
    private MutationPayload$Lattice lattice_;
    private MutationPayload$Color4f maskedColor_;
    private int maskedHeight_;
    private int maskedWidth_;
    private int paintIndex_;

    static {
        MutationPayload$DrawImageLatticeCommandPayload mutationPayload$DrawImageLatticeCommandPayload = new MutationPayload$DrawImageLatticeCommandPayload();
        DEFAULT_INSTANCE = mutationPayload$DrawImageLatticeCommandPayload;
        com.google.protobuf.o.registerDefaultInstance(MutationPayload$DrawImageLatticeCommandPayload.class, mutationPayload$DrawImageLatticeCommandPayload);
    }

    private MutationPayload$DrawImageLatticeCommandPayload() {
    }

    private void clearDst() {
        this.dst_ = null;
        this.bitField0_ &= -3;
    }

    private void clearFilterMode() {
        this.bitField0_ &= -9;
        this.filterMode_ = 0.0d;
    }

    private void clearImageIndex() {
        this.bitField0_ &= -5;
        this.imageIndex_ = 0;
    }

    private void clearLattice() {
        this.lattice_ = null;
        this.bitField0_ &= -2;
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

    public static MutationPayload$DrawImageLatticeCommandPayload getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeDst(MutationPayload$Rect mutationPayload$Rect) {
        mutationPayload$Rect.getClass();
        MutationPayload$Rect mutationPayload$Rect2 = this.dst_;
        if (mutationPayload$Rect2 == null || mutationPayload$Rect2 == MutationPayload$Rect.getDefaultInstance()) {
            this.dst_ = mutationPayload$Rect;
        } else {
            this.dst_ = (MutationPayload$Rect) ((P0) MutationPayload$Rect.newBuilder(this.dst_).mergeFrom((com.google.protobuf.o) mutationPayload$Rect)).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    private void mergeLattice(MutationPayload$Lattice mutationPayload$Lattice) {
        mutationPayload$Lattice.getClass();
        MutationPayload$Lattice mutationPayload$Lattice2 = this.lattice_;
        if (mutationPayload$Lattice2 == null || mutationPayload$Lattice2 == MutationPayload$Lattice.getDefaultInstance()) {
            this.lattice_ = mutationPayload$Lattice;
        } else {
            this.lattice_ = (MutationPayload$Lattice) ((C0129m0) MutationPayload$Lattice.newBuilder(this.lattice_).mergeFrom((com.google.protobuf.o) mutationPayload$Lattice)).buildPartial();
        }
        this.bitField0_ |= 1;
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

    public static G newBuilder() {
        return (G) DEFAULT_INSTANCE.createBuilder();
    }

    public static MutationPayload$DrawImageLatticeCommandPayload parseDelimitedFrom(InputStream inputStream) {
        return (MutationPayload$DrawImageLatticeCommandPayload) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$DrawImageLatticeCommandPayload parseFrom(ByteBuffer byteBuffer) {
        return (MutationPayload$DrawImageLatticeCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static j26 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDst(MutationPayload$Rect mutationPayload$Rect) {
        mutationPayload$Rect.getClass();
        this.dst_ = mutationPayload$Rect;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFilterMode(double d) {
        this.bitField0_ |= 8;
        this.filterMode_ = d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImageIndex(int i) {
        this.bitField0_ |= 4;
        this.imageIndex_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLattice(MutationPayload$Lattice mutationPayload$Lattice) {
        mutationPayload$Lattice.getClass();
        this.lattice_ = mutationPayload$Lattice;
        this.bitField0_ |= 1;
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

    @Override // com.google.protobuf.o
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, Object obj, Object obj2) {
        j26 fr2Var;
        switch (AbstractC0103a.a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new MutationPayload$DrawImageLatticeCommandPayload();
            case 2:
                return new G();
            case 3:
                return com.google.protobuf.o.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004က\u0003\u0005င\u0004\u0006င\u0005\u0007ဉ\u0006\bင\u0007", new Object[]{"bitField0_", "lattice_", "dst_", "imageIndex_", "filterMode_", "maskedWidth_", "maskedHeight_", "maskedColor_", "paintIndex_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                j26 j26Var = PARSER;
                if (j26Var != null) {
                    return j26Var;
                }
                synchronized (MutationPayload$DrawImageLatticeCommandPayload.class) {
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

    public MutationPayload$Rect getDst() {
        MutationPayload$Rect mutationPayload$Rect = this.dst_;
        return mutationPayload$Rect == null ? MutationPayload$Rect.getDefaultInstance() : mutationPayload$Rect;
    }

    public double getFilterMode() {
        return this.filterMode_;
    }

    public int getImageIndex() {
        return this.imageIndex_;
    }

    public MutationPayload$Lattice getLattice() {
        MutationPayload$Lattice mutationPayload$Lattice = this.lattice_;
        return mutationPayload$Lattice == null ? MutationPayload$Lattice.getDefaultInstance() : mutationPayload$Lattice;
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

    public boolean hasDst() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasFilterMode() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasImageIndex() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasLattice() {
        return (this.bitField0_ & 1) != 0;
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

    public static G newBuilder(MutationPayload$DrawImageLatticeCommandPayload mutationPayload$DrawImageLatticeCommandPayload) {
        return (G) DEFAULT_INSTANCE.createBuilder(mutationPayload$DrawImageLatticeCommandPayload);
    }

    public static MutationPayload$DrawImageLatticeCommandPayload parseDelimitedFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$DrawImageLatticeCommandPayload) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$DrawImageLatticeCommandPayload parseFrom(ByteBuffer byteBuffer, h72 h72Var) {
        return (MutationPayload$DrawImageLatticeCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer, h72Var);
    }

    public static MutationPayload$DrawImageLatticeCommandPayload parseFrom(ByteString byteString) {
        return (MutationPayload$DrawImageLatticeCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MutationPayload$DrawImageLatticeCommandPayload parseFrom(ByteString byteString, h72 h72Var) {
        return (MutationPayload$DrawImageLatticeCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString, h72Var);
    }

    public static MutationPayload$DrawImageLatticeCommandPayload parseFrom(byte[] bArr) {
        return (MutationPayload$DrawImageLatticeCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MutationPayload$DrawImageLatticeCommandPayload parseFrom(byte[] bArr, h72 h72Var) {
        return (MutationPayload$DrawImageLatticeCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr, h72Var);
    }

    public static MutationPayload$DrawImageLatticeCommandPayload parseFrom(InputStream inputStream) {
        return (MutationPayload$DrawImageLatticeCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$DrawImageLatticeCommandPayload parseFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$DrawImageLatticeCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$DrawImageLatticeCommandPayload parseFrom(lu0 lu0Var) {
        return (MutationPayload$DrawImageLatticeCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var);
    }

    public static MutationPayload$DrawImageLatticeCommandPayload parseFrom(lu0 lu0Var, h72 h72Var) {
        return (MutationPayload$DrawImageLatticeCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var, h72Var);
    }
}
