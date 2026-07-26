package com.microsoft.clarity.protomodels.mutationpayload;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import defpackage.ar1;
import defpackage.fr2;
import defpackage.h72;
import defpackage.j26;
import defpackage.kr3;
import defpackage.lu0;
import defpackage.rr3;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class MutationPayload$TextBlobRun extends com.google.protobuf.o implements m1 {
    public static final int CLUSTERS_FIELD_NUMBER = 8;
    private static final MutationPayload$TextBlobRun DEFAULT_INSTANCE;
    public static final int FONT_SCALE_X_FIELD_NUMBER = 3;
    public static final int FONT_SIZE_FIELD_NUMBER = 2;
    public static final int FONT_SKEW_X_FIELD_NUMBER = 4;
    public static final int GLYPHS_FIELD_NUMBER = 6;
    private static volatile j26 PARSER = null;
    public static final int POINT_FIELD_NUMBER = 1;
    public static final int POSITIONS_FIELD_NUMBER = 7;
    public static final int TEXT_FIELD_NUMBER = 9;
    public static final int TYPEFACE_INDEX_FIELD_NUMBER = 5;
    private int bitField0_;
    private float fontScaleX_;
    private float fontSize_;
    private float fontSkewX_;
    private MutationPayload$Point point_;
    private int typefaceIndex_;
    private int glyphsMemoizedSerializedSize = -1;
    private int clustersMemoizedSerializedSize = -1;
    private kr3 glyphs_ = com.google.protobuf.o.emptyDoubleList();
    private rr3 positions_ = com.google.protobuf.o.emptyProtobufList();
    private kr3 clusters_ = com.google.protobuf.o.emptyDoubleList();
    private String text_ = "";

    static {
        MutationPayload$TextBlobRun mutationPayload$TextBlobRun = new MutationPayload$TextBlobRun();
        DEFAULT_INSTANCE = mutationPayload$TextBlobRun;
        com.google.protobuf.o.registerDefaultInstance(MutationPayload$TextBlobRun.class, mutationPayload$TextBlobRun);
    }

    private MutationPayload$TextBlobRun() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllClusters(Iterable<? extends Double> iterable) {
        ensureClustersIsMutable();
        com.google.protobuf.a.addAll((Iterable) iterable, (List) this.clusters_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllGlyphs(Iterable<? extends Double> iterable) {
        ensureGlyphsIsMutable();
        com.google.protobuf.a.addAll((Iterable) iterable, (List) this.glyphs_);
    }

    private void addAllPositions(Iterable<? extends MutationPayload$FloatList> iterable) {
        ensurePositionsIsMutable();
        com.google.protobuf.a.addAll((Iterable) iterable, (List) this.positions_);
    }

    private void addClusters(double d) {
        ensureClustersIsMutable();
        ((ar1) this.clusters_).c(d);
    }

    private void addGlyphs(double d) {
        ensureGlyphsIsMutable();
        ((ar1) this.glyphs_).c(d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPositions(MutationPayload$FloatList mutationPayload$FloatList) {
        mutationPayload$FloatList.getClass();
        ensurePositionsIsMutable();
        this.positions_.add(mutationPayload$FloatList);
    }

    private void clearClusters() {
        this.clusters_ = com.google.protobuf.o.emptyDoubleList();
    }

    private void clearFontScaleX() {
        this.bitField0_ &= -5;
        this.fontScaleX_ = 0.0f;
    }

    private void clearFontSize() {
        this.bitField0_ &= -3;
        this.fontSize_ = 0.0f;
    }

    private void clearFontSkewX() {
        this.bitField0_ &= -9;
        this.fontSkewX_ = 0.0f;
    }

    private void clearGlyphs() {
        this.glyphs_ = com.google.protobuf.o.emptyDoubleList();
    }

    private void clearPoint() {
        this.point_ = null;
        this.bitField0_ &= -2;
    }

    private void clearPositions() {
        this.positions_ = com.google.protobuf.o.emptyProtobufList();
    }

    private void clearText() {
        this.bitField0_ &= -33;
        this.text_ = getDefaultInstance().getText();
    }

    private void clearTypefaceIndex() {
        this.bitField0_ &= -17;
        this.typefaceIndex_ = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void ensureClustersIsMutable() {
        kr3 kr3Var = this.clusters_;
        if (((defpackage.z1) kr3Var).a) {
            return;
        }
        this.clusters_ = com.google.protobuf.o.mutableCopy(kr3Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void ensureGlyphsIsMutable() {
        kr3 kr3Var = this.glyphs_;
        if (((defpackage.z1) kr3Var).a) {
            return;
        }
        this.glyphs_ = com.google.protobuf.o.mutableCopy(kr3Var);
    }

    private void ensurePositionsIsMutable() {
        rr3 rr3Var = this.positions_;
        if (((defpackage.z1) rr3Var).a) {
            return;
        }
        this.positions_ = com.google.protobuf.o.mutableCopy(rr3Var);
    }

    public static MutationPayload$TextBlobRun getDefaultInstance() {
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
        this.bitField0_ |= 1;
    }

    public static l1 newBuilder() {
        return (l1) DEFAULT_INSTANCE.createBuilder();
    }

    public static MutationPayload$TextBlobRun parseDelimitedFrom(InputStream inputStream) {
        return (MutationPayload$TextBlobRun) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$TextBlobRun parseFrom(ByteBuffer byteBuffer) {
        return (MutationPayload$TextBlobRun) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static j26 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removePositions(int i) {
        ensurePositionsIsMutable();
        this.positions_.remove(i);
    }

    private void setClusters(int i, double d) {
        ensureClustersIsMutable();
        ((ar1) this.clusters_).f(i, d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFontScaleX(float f) {
        this.bitField0_ |= 4;
        this.fontScaleX_ = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFontSize(float f) {
        this.bitField0_ |= 2;
        this.fontSize_ = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFontSkewX(float f) {
        this.bitField0_ |= 8;
        this.fontSkewX_ = f;
    }

    private void setGlyphs(int i, double d) {
        ensureGlyphsIsMutable();
        ((ar1) this.glyphs_).f(i, d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPoint(MutationPayload$Point mutationPayload$Point) {
        mutationPayload$Point.getClass();
        this.point_ = mutationPayload$Point;
        this.bitField0_ |= 1;
    }

    private void setPositions(int i, MutationPayload$FloatList mutationPayload$FloatList) {
        mutationPayload$FloatList.getClass();
        ensurePositionsIsMutable();
        this.positions_.set(i, mutationPayload$FloatList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setText(String str) {
        str.getClass();
        this.bitField0_ |= 32;
        this.text_ = str;
    }

    private void setTextBytes(ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.text_ = byteString.w();
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypefaceIndex(int i) {
        this.bitField0_ |= 16;
        this.typefaceIndex_ = i;
    }

    @Override // com.google.protobuf.o
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, Object obj, Object obj2) {
        j26 fr2Var;
        switch (AbstractC0103a.a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new MutationPayload$TextBlobRun();
            case 2:
                return new l1();
            case 3:
                return com.google.protobuf.o.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0003\u0000\u0001ဉ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005င\u0004\u0006#\u0007\u001b\b#\tለ\u0005", new Object[]{"bitField0_", "point_", "fontSize_", "fontScaleX_", "fontSkewX_", "typefaceIndex_", "glyphs_", "positions_", MutationPayload$FloatList.class, "clusters_", "text_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                j26 j26Var = PARSER;
                if (j26Var != null) {
                    return j26Var;
                }
                synchronized (MutationPayload$TextBlobRun.class) {
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

    public double getClusters(int i) {
        return ((ar1) this.clusters_).e(i);
    }

    public int getClustersCount() {
        return ((ar1) this.clusters_).size();
    }

    public List<Double> getClustersList() {
        return this.clusters_;
    }

    public float getFontScaleX() {
        return this.fontScaleX_;
    }

    public float getFontSize() {
        return this.fontSize_;
    }

    public float getFontSkewX() {
        return this.fontSkewX_;
    }

    public double getGlyphs(int i) {
        return ((ar1) this.glyphs_).e(i);
    }

    public int getGlyphsCount() {
        return ((ar1) this.glyphs_).size();
    }

    public List<Double> getGlyphsList() {
        return this.glyphs_;
    }

    public MutationPayload$Point getPoint() {
        MutationPayload$Point mutationPayload$Point = this.point_;
        return mutationPayload$Point == null ? MutationPayload$Point.getDefaultInstance() : mutationPayload$Point;
    }

    public MutationPayload$FloatList getPositions(int i) {
        return (MutationPayload$FloatList) this.positions_.get(i);
    }

    public int getPositionsCount() {
        return this.positions_.size();
    }

    public List<MutationPayload$FloatList> getPositionsList() {
        return this.positions_;
    }

    public InterfaceC0109c0 getPositionsOrBuilder(int i) {
        return (InterfaceC0109c0) this.positions_.get(i);
    }

    public List<? extends InterfaceC0109c0> getPositionsOrBuilderList() {
        return this.positions_;
    }

    public String getText() {
        return this.text_;
    }

    public ByteString getTextBytes() {
        return ByteString.i(this.text_);
    }

    public int getTypefaceIndex() {
        return this.typefaceIndex_;
    }

    public boolean hasFontScaleX() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasFontSize() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasFontSkewX() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasPoint() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasText() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasTypefaceIndex() {
        return (this.bitField0_ & 16) != 0;
    }

    public static l1 newBuilder(MutationPayload$TextBlobRun mutationPayload$TextBlobRun) {
        return (l1) DEFAULT_INSTANCE.createBuilder(mutationPayload$TextBlobRun);
    }

    public static MutationPayload$TextBlobRun parseDelimitedFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$TextBlobRun) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$TextBlobRun parseFrom(ByteBuffer byteBuffer, h72 h72Var) {
        return (MutationPayload$TextBlobRun) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer, h72Var);
    }

    public static MutationPayload$TextBlobRun parseFrom(ByteString byteString) {
        return (MutationPayload$TextBlobRun) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    private void addPositions(int i, MutationPayload$FloatList mutationPayload$FloatList) {
        mutationPayload$FloatList.getClass();
        ensurePositionsIsMutable();
        this.positions_.add(i, mutationPayload$FloatList);
    }

    public static MutationPayload$TextBlobRun parseFrom(ByteString byteString, h72 h72Var) {
        return (MutationPayload$TextBlobRun) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString, h72Var);
    }

    public static MutationPayload$TextBlobRun parseFrom(byte[] bArr) {
        return (MutationPayload$TextBlobRun) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MutationPayload$TextBlobRun parseFrom(byte[] bArr, h72 h72Var) {
        return (MutationPayload$TextBlobRun) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr, h72Var);
    }

    public static MutationPayload$TextBlobRun parseFrom(InputStream inputStream) {
        return (MutationPayload$TextBlobRun) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$TextBlobRun parseFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$TextBlobRun) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$TextBlobRun parseFrom(lu0 lu0Var) {
        return (MutationPayload$TextBlobRun) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var);
    }

    public static MutationPayload$TextBlobRun parseFrom(lu0 lu0Var, h72 h72Var) {
        return (MutationPayload$TextBlobRun) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var, h72Var);
    }
}
