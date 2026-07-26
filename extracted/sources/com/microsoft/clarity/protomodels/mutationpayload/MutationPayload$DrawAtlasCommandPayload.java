package com.microsoft.clarity.protomodels.mutationpayload;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import defpackage.fr2;
import defpackage.fv4;
import defpackage.h72;
import defpackage.hq3;
import defpackage.j26;
import defpackage.lu0;
import defpackage.pr3;
import defpackage.rr3;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class MutationPayload$DrawAtlasCommandPayload extends com.google.protobuf.o implements fv4 {
    public static final int BLENDMODE_FIELD_NUMBER = 5;
    public static final int COLORS_FIELD_NUMBER = 6;
    private static final MutationPayload$DrawAtlasCommandPayload DEFAULT_INSTANCE;
    public static final int DSTXFORMS_FIELD_NUMBER = 4;
    public static final int IMAGEINDEX_FIELD_NUMBER = 2;
    public static final int PAINTINDEX_FIELD_NUMBER = 1;
    private static volatile j26 PARSER = null;
    public static final int SRCRECTS_FIELD_NUMBER = 3;
    private int bitField0_;
    private int blendMode_;
    private int imageIndex_;
    private int paintIndex_;
    private int colorsMemoizedSerializedSize = -1;
    private rr3 srcRects_ = com.google.protobuf.o.emptyProtobufList();
    private rr3 dstXforms_ = com.google.protobuf.o.emptyProtobufList();
    private pr3 colors_ = com.google.protobuf.o.emptyIntList();

    static {
        MutationPayload$DrawAtlasCommandPayload mutationPayload$DrawAtlasCommandPayload = new MutationPayload$DrawAtlasCommandPayload();
        DEFAULT_INSTANCE = mutationPayload$DrawAtlasCommandPayload;
        com.google.protobuf.o.registerDefaultInstance(MutationPayload$DrawAtlasCommandPayload.class, mutationPayload$DrawAtlasCommandPayload);
    }

    private MutationPayload$DrawAtlasCommandPayload() {
    }

    private void addAllColors(Iterable<? extends Integer> iterable) {
        ensureColorsIsMutable();
        com.google.protobuf.a.addAll((Iterable) iterable, (List) this.colors_);
    }

    private void addAllDstXforms(Iterable<? extends MutationPayload$RSXform> iterable) {
        ensureDstXformsIsMutable();
        com.google.protobuf.a.addAll((Iterable) iterable, (List) this.dstXforms_);
    }

    private void addAllSrcRects(Iterable<? extends MutationPayload$Rect> iterable) {
        ensureSrcRectsIsMutable();
        com.google.protobuf.a.addAll((Iterable) iterable, (List) this.srcRects_);
    }

    private void addColors(int i) {
        ensureColorsIsMutable();
        ((hq3) this.colors_).c(i);
    }

    private void addDstXforms(MutationPayload$RSXform mutationPayload$RSXform) {
        mutationPayload$RSXform.getClass();
        ensureDstXformsIsMutable();
        this.dstXforms_.add(mutationPayload$RSXform);
    }

    private void addSrcRects(MutationPayload$Rect mutationPayload$Rect) {
        mutationPayload$Rect.getClass();
        ensureSrcRectsIsMutable();
        this.srcRects_.add(mutationPayload$Rect);
    }

    private void clearBlendMode() {
        this.bitField0_ &= -5;
        this.blendMode_ = 0;
    }

    private void clearColors() {
        this.colors_ = com.google.protobuf.o.emptyIntList();
    }

    private void clearDstXforms() {
        this.dstXforms_ = com.google.protobuf.o.emptyProtobufList();
    }

    private void clearImageIndex() {
        this.bitField0_ &= -3;
        this.imageIndex_ = 0;
    }

    private void clearPaintIndex() {
        this.bitField0_ &= -2;
        this.paintIndex_ = 0;
    }

    private void clearSrcRects() {
        this.srcRects_ = com.google.protobuf.o.emptyProtobufList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void ensureColorsIsMutable() {
        pr3 pr3Var = this.colors_;
        if (((defpackage.z1) pr3Var).a) {
            return;
        }
        this.colors_ = com.google.protobuf.o.mutableCopy(pr3Var);
    }

    private void ensureDstXformsIsMutable() {
        rr3 rr3Var = this.dstXforms_;
        if (((defpackage.z1) rr3Var).a) {
            return;
        }
        this.dstXforms_ = com.google.protobuf.o.mutableCopy(rr3Var);
    }

    private void ensureSrcRectsIsMutable() {
        rr3 rr3Var = this.srcRects_;
        if (((defpackage.z1) rr3Var).a) {
            return;
        }
        this.srcRects_ = com.google.protobuf.o.mutableCopy(rr3Var);
    }

    public static MutationPayload$DrawAtlasCommandPayload getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static A newBuilder() {
        return (A) DEFAULT_INSTANCE.createBuilder();
    }

    public static MutationPayload$DrawAtlasCommandPayload parseDelimitedFrom(InputStream inputStream) {
        return (MutationPayload$DrawAtlasCommandPayload) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$DrawAtlasCommandPayload parseFrom(ByteBuffer byteBuffer) {
        return (MutationPayload$DrawAtlasCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static j26 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeDstXforms(int i) {
        ensureDstXformsIsMutable();
        this.dstXforms_.remove(i);
    }

    private void removeSrcRects(int i) {
        ensureSrcRectsIsMutable();
        this.srcRects_.remove(i);
    }

    private void setBlendMode(int i) {
        this.bitField0_ |= 4;
        this.blendMode_ = i;
    }

    private void setColors(int i, int i2) {
        ensureColorsIsMutable();
        ((hq3) this.colors_).f(i, i2);
    }

    private void setDstXforms(int i, MutationPayload$RSXform mutationPayload$RSXform) {
        mutationPayload$RSXform.getClass();
        ensureDstXformsIsMutable();
        this.dstXforms_.set(i, mutationPayload$RSXform);
    }

    private void setImageIndex(int i) {
        this.bitField0_ |= 2;
        this.imageIndex_ = i;
    }

    private void setPaintIndex(int i) {
        this.bitField0_ |= 1;
        this.paintIndex_ = i;
    }

    private void setSrcRects(int i, MutationPayload$Rect mutationPayload$Rect) {
        mutationPayload$Rect.getClass();
        ensureSrcRectsIsMutable();
        this.srcRects_.set(i, mutationPayload$Rect);
    }

    @Override // com.google.protobuf.o
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, Object obj, Object obj2) {
        j26 fr2Var;
        switch (AbstractC0103a.a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new MutationPayload$DrawAtlasCommandPayload();
            case 2:
                return new A();
            case 3:
                return com.google.protobuf.o.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0003\u0000\u0001င\u0000\u0002င\u0001\u0003\u001b\u0004\u001b\u0005င\u0002\u0006'", new Object[]{"bitField0_", "paintIndex_", "imageIndex_", "srcRects_", MutationPayload$Rect.class, "dstXforms_", MutationPayload$RSXform.class, "blendMode_", "colors_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                j26 j26Var = PARSER;
                if (j26Var != null) {
                    return j26Var;
                }
                synchronized (MutationPayload$DrawAtlasCommandPayload.class) {
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

    public int getBlendMode() {
        return this.blendMode_;
    }

    public int getColors(int i) {
        return ((hq3) this.colors_).e(i);
    }

    public int getColorsCount() {
        return ((hq3) this.colors_).size();
    }

    public List<Integer> getColorsList() {
        return this.colors_;
    }

    public MutationPayload$RSXform getDstXforms(int i) {
        return (MutationPayload$RSXform) this.dstXforms_.get(i);
    }

    public int getDstXformsCount() {
        return this.dstXforms_.size();
    }

    public List<MutationPayload$RSXform> getDstXformsList() {
        return this.dstXforms_;
    }

    public O0 getDstXformsOrBuilder(int i) {
        return (O0) this.dstXforms_.get(i);
    }

    public List<? extends O0> getDstXformsOrBuilderList() {
        return this.dstXforms_;
    }

    public int getImageIndex() {
        return this.imageIndex_;
    }

    public int getPaintIndex() {
        return this.paintIndex_;
    }

    public MutationPayload$Rect getSrcRects(int i) {
        return (MutationPayload$Rect) this.srcRects_.get(i);
    }

    public int getSrcRectsCount() {
        return this.srcRects_.size();
    }

    public List<MutationPayload$Rect> getSrcRectsList() {
        return this.srcRects_;
    }

    public Q0 getSrcRectsOrBuilder(int i) {
        return (Q0) this.srcRects_.get(i);
    }

    public List<? extends Q0> getSrcRectsOrBuilderList() {
        return this.srcRects_;
    }

    public boolean hasBlendMode() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasImageIndex() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasPaintIndex() {
        return (this.bitField0_ & 1) != 0;
    }

    public static A newBuilder(MutationPayload$DrawAtlasCommandPayload mutationPayload$DrawAtlasCommandPayload) {
        return (A) DEFAULT_INSTANCE.createBuilder(mutationPayload$DrawAtlasCommandPayload);
    }

    public static MutationPayload$DrawAtlasCommandPayload parseDelimitedFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$DrawAtlasCommandPayload) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$DrawAtlasCommandPayload parseFrom(ByteBuffer byteBuffer, h72 h72Var) {
        return (MutationPayload$DrawAtlasCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer, h72Var);
    }

    public static MutationPayload$DrawAtlasCommandPayload parseFrom(ByteString byteString) {
        return (MutationPayload$DrawAtlasCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    private void addDstXforms(int i, MutationPayload$RSXform mutationPayload$RSXform) {
        mutationPayload$RSXform.getClass();
        ensureDstXformsIsMutable();
        this.dstXforms_.add(i, mutationPayload$RSXform);
    }

    private void addSrcRects(int i, MutationPayload$Rect mutationPayload$Rect) {
        mutationPayload$Rect.getClass();
        ensureSrcRectsIsMutable();
        this.srcRects_.add(i, mutationPayload$Rect);
    }

    public static MutationPayload$DrawAtlasCommandPayload parseFrom(ByteString byteString, h72 h72Var) {
        return (MutationPayload$DrawAtlasCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString, h72Var);
    }

    public static MutationPayload$DrawAtlasCommandPayload parseFrom(byte[] bArr) {
        return (MutationPayload$DrawAtlasCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MutationPayload$DrawAtlasCommandPayload parseFrom(byte[] bArr, h72 h72Var) {
        return (MutationPayload$DrawAtlasCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr, h72Var);
    }

    public static MutationPayload$DrawAtlasCommandPayload parseFrom(InputStream inputStream) {
        return (MutationPayload$DrawAtlasCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$DrawAtlasCommandPayload parseFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$DrawAtlasCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$DrawAtlasCommandPayload parseFrom(lu0 lu0Var) {
        return (MutationPayload$DrawAtlasCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var);
    }

    public static MutationPayload$DrawAtlasCommandPayload parseFrom(lu0 lu0Var, h72 h72Var) {
        return (MutationPayload$DrawAtlasCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var, h72Var);
    }
}
