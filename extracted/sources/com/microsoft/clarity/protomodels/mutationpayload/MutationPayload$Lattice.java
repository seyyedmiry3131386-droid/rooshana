package com.microsoft.clarity.protomodels.mutationpayload;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import defpackage.ar1;
import defpackage.fr2;
import defpackage.fv4;
import defpackage.h72;
import defpackage.hq3;
import defpackage.j26;
import defpackage.kr3;
import defpackage.lu0;
import defpackage.pr3;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class MutationPayload$Lattice extends com.google.protobuf.o implements fv4 {
    public static final int BOUNDS_FIELD_NUMBER = 1;
    public static final int COLORS_FIELD_NUMBER = 2;
    private static final MutationPayload$Lattice DEFAULT_INSTANCE;
    private static volatile j26 PARSER = null;
    public static final int RECT_TYPE_FIELD_NUMBER = 3;
    public static final int X_DIVS_FIELD_NUMBER = 4;
    public static final int Y_DIVS_FIELD_NUMBER = 5;
    private int bitField0_;
    private MutationPayload$Rect bounds_;
    private int colorsMemoizedSerializedSize = -1;
    private int rectTypeMemoizedSerializedSize = -1;
    private int xDivsMemoizedSerializedSize = -1;
    private int yDivsMemoizedSerializedSize = -1;
    private kr3 colors_ = com.google.protobuf.o.emptyDoubleList();
    private pr3 rectType_ = com.google.protobuf.o.emptyIntList();
    private pr3 xDivs_ = com.google.protobuf.o.emptyIntList();
    private pr3 yDivs_ = com.google.protobuf.o.emptyIntList();

    static {
        MutationPayload$Lattice mutationPayload$Lattice = new MutationPayload$Lattice();
        DEFAULT_INSTANCE = mutationPayload$Lattice;
        com.google.protobuf.o.registerDefaultInstance(MutationPayload$Lattice.class, mutationPayload$Lattice);
    }

    private MutationPayload$Lattice() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllColors(Iterable<? extends Double> iterable) {
        ensureColorsIsMutable();
        com.google.protobuf.a.addAll((Iterable) iterable, (List) this.colors_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRectType(Iterable<? extends Integer> iterable) {
        ensureRectTypeIsMutable();
        com.google.protobuf.a.addAll((Iterable) iterable, (List) this.rectType_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllXDivs(Iterable<? extends Integer> iterable) {
        ensureXDivsIsMutable();
        com.google.protobuf.a.addAll((Iterable) iterable, (List) this.xDivs_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllYDivs(Iterable<? extends Integer> iterable) {
        ensureYDivsIsMutable();
        com.google.protobuf.a.addAll((Iterable) iterable, (List) this.yDivs_);
    }

    private void addColors(double d) {
        ensureColorsIsMutable();
        ((ar1) this.colors_).c(d);
    }

    private void addRectType(int i) {
        ensureRectTypeIsMutable();
        ((hq3) this.rectType_).c(i);
    }

    private void addXDivs(int i) {
        ensureXDivsIsMutable();
        ((hq3) this.xDivs_).c(i);
    }

    private void addYDivs(int i) {
        ensureYDivsIsMutable();
        ((hq3) this.yDivs_).c(i);
    }

    private void clearBounds() {
        this.bounds_ = null;
        this.bitField0_ &= -2;
    }

    private void clearColors() {
        this.colors_ = com.google.protobuf.o.emptyDoubleList();
    }

    private void clearRectType() {
        this.rectType_ = com.google.protobuf.o.emptyIntList();
    }

    private void clearXDivs() {
        this.xDivs_ = com.google.protobuf.o.emptyIntList();
    }

    private void clearYDivs() {
        this.yDivs_ = com.google.protobuf.o.emptyIntList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void ensureColorsIsMutable() {
        kr3 kr3Var = this.colors_;
        if (((defpackage.z1) kr3Var).a) {
            return;
        }
        this.colors_ = com.google.protobuf.o.mutableCopy(kr3Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void ensureRectTypeIsMutable() {
        pr3 pr3Var = this.rectType_;
        if (((defpackage.z1) pr3Var).a) {
            return;
        }
        this.rectType_ = com.google.protobuf.o.mutableCopy(pr3Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void ensureXDivsIsMutable() {
        pr3 pr3Var = this.xDivs_;
        if (((defpackage.z1) pr3Var).a) {
            return;
        }
        this.xDivs_ = com.google.protobuf.o.mutableCopy(pr3Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void ensureYDivsIsMutable() {
        pr3 pr3Var = this.yDivs_;
        if (((defpackage.z1) pr3Var).a) {
            return;
        }
        this.yDivs_ = com.google.protobuf.o.mutableCopy(pr3Var);
    }

    public static MutationPayload$Lattice getDefaultInstance() {
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

    public static C0129m0 newBuilder() {
        return (C0129m0) DEFAULT_INSTANCE.createBuilder();
    }

    public static MutationPayload$Lattice parseDelimitedFrom(InputStream inputStream) {
        return (MutationPayload$Lattice) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$Lattice parseFrom(ByteBuffer byteBuffer) {
        return (MutationPayload$Lattice) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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

    private void setColors(int i, double d) {
        ensureColorsIsMutable();
        ((ar1) this.colors_).f(i, d);
    }

    private void setRectType(int i, int i2) {
        ensureRectTypeIsMutable();
        ((hq3) this.rectType_).f(i, i2);
    }

    private void setXDivs(int i, int i2) {
        ensureXDivsIsMutable();
        ((hq3) this.xDivs_).f(i, i2);
    }

    private void setYDivs(int i, int i2) {
        ensureYDivsIsMutable();
        ((hq3) this.yDivs_).f(i, i2);
    }

    @Override // com.google.protobuf.o
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, Object obj, Object obj2) {
        j26 fr2Var;
        switch (AbstractC0103a.a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new MutationPayload$Lattice();
            case 2:
                return new C0129m0();
            case 3:
                return com.google.protobuf.o.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001ဉ\u0000\u0002#\u0003'\u0004'\u0005'", new Object[]{"bitField0_", "bounds_", "colors_", "rectType_", "xDivs_", "yDivs_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                j26 j26Var = PARSER;
                if (j26Var != null) {
                    return j26Var;
                }
                synchronized (MutationPayload$Lattice.class) {
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

    public double getColors(int i) {
        return ((ar1) this.colors_).e(i);
    }

    public int getColorsCount() {
        return ((ar1) this.colors_).size();
    }

    public List<Double> getColorsList() {
        return this.colors_;
    }

    public int getRectType(int i) {
        return ((hq3) this.rectType_).e(i);
    }

    public int getRectTypeCount() {
        return ((hq3) this.rectType_).size();
    }

    public List<Integer> getRectTypeList() {
        return this.rectType_;
    }

    public int getXDivs(int i) {
        return ((hq3) this.xDivs_).e(i);
    }

    public int getXDivsCount() {
        return ((hq3) this.xDivs_).size();
    }

    public List<Integer> getXDivsList() {
        return this.xDivs_;
    }

    public int getYDivs(int i) {
        return ((hq3) this.yDivs_).e(i);
    }

    public int getYDivsCount() {
        return ((hq3) this.yDivs_).size();
    }

    public List<Integer> getYDivsList() {
        return this.yDivs_;
    }

    public boolean hasBounds() {
        return (this.bitField0_ & 1) != 0;
    }

    public static C0129m0 newBuilder(MutationPayload$Lattice mutationPayload$Lattice) {
        return (C0129m0) DEFAULT_INSTANCE.createBuilder(mutationPayload$Lattice);
    }

    public static MutationPayload$Lattice parseDelimitedFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$Lattice) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$Lattice parseFrom(ByteBuffer byteBuffer, h72 h72Var) {
        return (MutationPayload$Lattice) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer, h72Var);
    }

    public static MutationPayload$Lattice parseFrom(ByteString byteString) {
        return (MutationPayload$Lattice) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MutationPayload$Lattice parseFrom(ByteString byteString, h72 h72Var) {
        return (MutationPayload$Lattice) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString, h72Var);
    }

    public static MutationPayload$Lattice parseFrom(byte[] bArr) {
        return (MutationPayload$Lattice) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MutationPayload$Lattice parseFrom(byte[] bArr, h72 h72Var) {
        return (MutationPayload$Lattice) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr, h72Var);
    }

    public static MutationPayload$Lattice parseFrom(InputStream inputStream) {
        return (MutationPayload$Lattice) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$Lattice parseFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$Lattice) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$Lattice parseFrom(lu0 lu0Var) {
        return (MutationPayload$Lattice) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var);
    }

    public static MutationPayload$Lattice parseFrom(lu0 lu0Var, h72 h72Var) {
        return (MutationPayload$Lattice) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var, h72Var);
    }
}
