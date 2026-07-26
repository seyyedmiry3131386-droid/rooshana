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
public final class MutationPayload$Vertices extends com.google.protobuf.o implements v1 {
    public static final int BONE_INDICES_FIELD_NUMBER = 6;
    public static final int BONE_WEIGHTS_FIELD_NUMBER = 7;
    public static final int COLORS_FIELD_NUMBER = 5;
    private static final MutationPayload$Vertices DEFAULT_INSTANCE;
    public static final int INDICES_FIELD_NUMBER = 8;
    public static final int IS_VOLATILE_FIELD_NUMBER = 2;
    public static final int MODE_FIELD_NUMBER = 1;
    private static volatile j26 PARSER = null;
    public static final int POSITIONS_FIELD_NUMBER = 3;
    public static final int TEX_COORDS_FIELD_NUMBER = 4;
    private int bitField0_;
    private boolean isVolatile_;
    private double mode_;
    private int colorsMemoizedSerializedSize = -1;
    private int indicesMemoizedSerializedSize = -1;
    private rr3 positions_ = com.google.protobuf.o.emptyProtobufList();
    private rr3 texCoords_ = com.google.protobuf.o.emptyProtobufList();
    private kr3 colors_ = com.google.protobuf.o.emptyDoubleList();
    private rr3 boneIndices_ = com.google.protobuf.o.emptyProtobufList();
    private rr3 boneWeights_ = com.google.protobuf.o.emptyProtobufList();
    private kr3 indices_ = com.google.protobuf.o.emptyDoubleList();

    static {
        MutationPayload$Vertices mutationPayload$Vertices = new MutationPayload$Vertices();
        DEFAULT_INSTANCE = mutationPayload$Vertices;
        com.google.protobuf.o.registerDefaultInstance(MutationPayload$Vertices.class, mutationPayload$Vertices);
    }

    private MutationPayload$Vertices() {
    }

    private void addAllBoneIndices(Iterable<? extends MutationPayload$DoubleList> iterable) {
        ensureBoneIndicesIsMutable();
        com.google.protobuf.a.addAll((Iterable) iterable, (List) this.boneIndices_);
    }

    private void addAllBoneWeights(Iterable<? extends MutationPayload$FloatList> iterable) {
        ensureBoneWeightsIsMutable();
        com.google.protobuf.a.addAll((Iterable) iterable, (List) this.boneWeights_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllColors(Iterable<? extends Double> iterable) {
        ensureColorsIsMutable();
        com.google.protobuf.a.addAll((Iterable) iterable, (List) this.colors_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllIndices(Iterable<? extends Double> iterable) {
        ensureIndicesIsMutable();
        com.google.protobuf.a.addAll((Iterable) iterable, (List) this.indices_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPositions(Iterable<? extends MutationPayload$Point> iterable) {
        ensurePositionsIsMutable();
        com.google.protobuf.a.addAll((Iterable) iterable, (List) this.positions_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTexCoords(Iterable<? extends MutationPayload$Point> iterable) {
        ensureTexCoordsIsMutable();
        com.google.protobuf.a.addAll((Iterable) iterable, (List) this.texCoords_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addBoneIndices(MutationPayload$DoubleList mutationPayload$DoubleList) {
        mutationPayload$DoubleList.getClass();
        ensureBoneIndicesIsMutable();
        this.boneIndices_.add(mutationPayload$DoubleList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addBoneWeights(MutationPayload$FloatList mutationPayload$FloatList) {
        mutationPayload$FloatList.getClass();
        ensureBoneWeightsIsMutable();
        this.boneWeights_.add(mutationPayload$FloatList);
    }

    private void addColors(double d) {
        ensureColorsIsMutable();
        ((ar1) this.colors_).c(d);
    }

    private void addIndices(double d) {
        ensureIndicesIsMutable();
        ((ar1) this.indices_).c(d);
    }

    private void addPositions(MutationPayload$Point mutationPayload$Point) {
        mutationPayload$Point.getClass();
        ensurePositionsIsMutable();
        this.positions_.add(mutationPayload$Point);
    }

    private void addTexCoords(MutationPayload$Point mutationPayload$Point) {
        mutationPayload$Point.getClass();
        ensureTexCoordsIsMutable();
        this.texCoords_.add(mutationPayload$Point);
    }

    private void clearBoneIndices() {
        this.boneIndices_ = com.google.protobuf.o.emptyProtobufList();
    }

    private void clearBoneWeights() {
        this.boneWeights_ = com.google.protobuf.o.emptyProtobufList();
    }

    private void clearColors() {
        this.colors_ = com.google.protobuf.o.emptyDoubleList();
    }

    private void clearIndices() {
        this.indices_ = com.google.protobuf.o.emptyDoubleList();
    }

    private void clearIsVolatile() {
        this.bitField0_ &= -3;
        this.isVolatile_ = false;
    }

    private void clearMode() {
        this.bitField0_ &= -2;
        this.mode_ = 0.0d;
    }

    private void clearPositions() {
        this.positions_ = com.google.protobuf.o.emptyProtobufList();
    }

    private void clearTexCoords() {
        this.texCoords_ = com.google.protobuf.o.emptyProtobufList();
    }

    private void ensureBoneIndicesIsMutable() {
        rr3 rr3Var = this.boneIndices_;
        if (((defpackage.z1) rr3Var).a) {
            return;
        }
        this.boneIndices_ = com.google.protobuf.o.mutableCopy(rr3Var);
    }

    private void ensureBoneWeightsIsMutable() {
        rr3 rr3Var = this.boneWeights_;
        if (((defpackage.z1) rr3Var).a) {
            return;
        }
        this.boneWeights_ = com.google.protobuf.o.mutableCopy(rr3Var);
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
    private void ensureIndicesIsMutable() {
        kr3 kr3Var = this.indices_;
        if (((defpackage.z1) kr3Var).a) {
            return;
        }
        this.indices_ = com.google.protobuf.o.mutableCopy(kr3Var);
    }

    private void ensurePositionsIsMutable() {
        rr3 rr3Var = this.positions_;
        if (((defpackage.z1) rr3Var).a) {
            return;
        }
        this.positions_ = com.google.protobuf.o.mutableCopy(rr3Var);
    }

    private void ensureTexCoordsIsMutable() {
        rr3 rr3Var = this.texCoords_;
        if (((defpackage.z1) rr3Var).a) {
            return;
        }
        this.texCoords_ = com.google.protobuf.o.mutableCopy(rr3Var);
    }

    public static MutationPayload$Vertices getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static u1 newBuilder() {
        return (u1) DEFAULT_INSTANCE.createBuilder();
    }

    public static MutationPayload$Vertices parseDelimitedFrom(InputStream inputStream) {
        return (MutationPayload$Vertices) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$Vertices parseFrom(ByteBuffer byteBuffer) {
        return (MutationPayload$Vertices) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static j26 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeBoneIndices(int i) {
        ensureBoneIndicesIsMutable();
        this.boneIndices_.remove(i);
    }

    private void removeBoneWeights(int i) {
        ensureBoneWeightsIsMutable();
        this.boneWeights_.remove(i);
    }

    private void removePositions(int i) {
        ensurePositionsIsMutable();
        this.positions_.remove(i);
    }

    private void removeTexCoords(int i) {
        ensureTexCoordsIsMutable();
        this.texCoords_.remove(i);
    }

    private void setBoneIndices(int i, MutationPayload$DoubleList mutationPayload$DoubleList) {
        mutationPayload$DoubleList.getClass();
        ensureBoneIndicesIsMutable();
        this.boneIndices_.set(i, mutationPayload$DoubleList);
    }

    private void setBoneWeights(int i, MutationPayload$FloatList mutationPayload$FloatList) {
        mutationPayload$FloatList.getClass();
        ensureBoneWeightsIsMutable();
        this.boneWeights_.set(i, mutationPayload$FloatList);
    }

    private void setColors(int i, double d) {
        ensureColorsIsMutable();
        ((ar1) this.colors_).f(i, d);
    }

    private void setIndices(int i, double d) {
        ensureIndicesIsMutable();
        ((ar1) this.indices_).f(i, d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsVolatile(boolean z) {
        this.bitField0_ |= 2;
        this.isVolatile_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMode(double d) {
        this.bitField0_ |= 1;
        this.mode_ = d;
    }

    private void setPositions(int i, MutationPayload$Point mutationPayload$Point) {
        mutationPayload$Point.getClass();
        ensurePositionsIsMutable();
        this.positions_.set(i, mutationPayload$Point);
    }

    private void setTexCoords(int i, MutationPayload$Point mutationPayload$Point) {
        mutationPayload$Point.getClass();
        ensureTexCoordsIsMutable();
        this.texCoords_.set(i, mutationPayload$Point);
    }

    @Override // com.google.protobuf.o
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, Object obj, Object obj2) {
        j26 fr2Var;
        switch (AbstractC0103a.a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new MutationPayload$Vertices();
            case 2:
                return new u1();
            case 3:
                return com.google.protobuf.o.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0006\u0000\u0001က\u0000\u0002ဇ\u0001\u0003\u001b\u0004\u001b\u0005#\u0006\u001b\u0007\u001b\b#", new Object[]{"bitField0_", "mode_", "isVolatile_", "positions_", MutationPayload$Point.class, "texCoords_", MutationPayload$Point.class, "colors_", "boneIndices_", MutationPayload$DoubleList.class, "boneWeights_", MutationPayload$FloatList.class, "indices_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                j26 j26Var = PARSER;
                if (j26Var != null) {
                    return j26Var;
                }
                synchronized (MutationPayload$Vertices.class) {
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

    public MutationPayload$DoubleList getBoneIndices(int i) {
        return (MutationPayload$DoubleList) this.boneIndices_.get(i);
    }

    public int getBoneIndicesCount() {
        return this.boneIndices_.size();
    }

    public List<MutationPayload$DoubleList> getBoneIndicesList() {
        return this.boneIndices_;
    }

    public InterfaceC0151y getBoneIndicesOrBuilder(int i) {
        return (InterfaceC0151y) this.boneIndices_.get(i);
    }

    public List<? extends InterfaceC0151y> getBoneIndicesOrBuilderList() {
        return this.boneIndices_;
    }

    public MutationPayload$FloatList getBoneWeights(int i) {
        return (MutationPayload$FloatList) this.boneWeights_.get(i);
    }

    public int getBoneWeightsCount() {
        return this.boneWeights_.size();
    }

    public List<MutationPayload$FloatList> getBoneWeightsList() {
        return this.boneWeights_;
    }

    public InterfaceC0109c0 getBoneWeightsOrBuilder(int i) {
        return (InterfaceC0109c0) this.boneWeights_.get(i);
    }

    public List<? extends InterfaceC0109c0> getBoneWeightsOrBuilderList() {
        return this.boneWeights_;
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

    public double getIndices(int i) {
        return ((ar1) this.indices_).e(i);
    }

    public int getIndicesCount() {
        return ((ar1) this.indices_).size();
    }

    public List<Double> getIndicesList() {
        return this.indices_;
    }

    public boolean getIsVolatile() {
        return this.isVolatile_;
    }

    public double getMode() {
        return this.mode_;
    }

    public MutationPayload$Point getPositions(int i) {
        return (MutationPayload$Point) this.positions_.get(i);
    }

    public int getPositionsCount() {
        return this.positions_.size();
    }

    public List<MutationPayload$Point> getPositionsList() {
        return this.positions_;
    }

    public M0 getPositionsOrBuilder(int i) {
        return (M0) this.positions_.get(i);
    }

    public List<? extends M0> getPositionsOrBuilderList() {
        return this.positions_;
    }

    public MutationPayload$Point getTexCoords(int i) {
        return (MutationPayload$Point) this.texCoords_.get(i);
    }

    public int getTexCoordsCount() {
        return this.texCoords_.size();
    }

    public List<MutationPayload$Point> getTexCoordsList() {
        return this.texCoords_;
    }

    public M0 getTexCoordsOrBuilder(int i) {
        return (M0) this.texCoords_.get(i);
    }

    public List<? extends M0> getTexCoordsOrBuilderList() {
        return this.texCoords_;
    }

    public boolean hasIsVolatile() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasMode() {
        return (this.bitField0_ & 1) != 0;
    }

    public static u1 newBuilder(MutationPayload$Vertices mutationPayload$Vertices) {
        return (u1) DEFAULT_INSTANCE.createBuilder(mutationPayload$Vertices);
    }

    public static MutationPayload$Vertices parseDelimitedFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$Vertices) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$Vertices parseFrom(ByteBuffer byteBuffer, h72 h72Var) {
        return (MutationPayload$Vertices) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer, h72Var);
    }

    public static MutationPayload$Vertices parseFrom(ByteString byteString) {
        return (MutationPayload$Vertices) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    private void addBoneIndices(int i, MutationPayload$DoubleList mutationPayload$DoubleList) {
        mutationPayload$DoubleList.getClass();
        ensureBoneIndicesIsMutable();
        this.boneIndices_.add(i, mutationPayload$DoubleList);
    }

    private void addBoneWeights(int i, MutationPayload$FloatList mutationPayload$FloatList) {
        mutationPayload$FloatList.getClass();
        ensureBoneWeightsIsMutable();
        this.boneWeights_.add(i, mutationPayload$FloatList);
    }

    private void addPositions(int i, MutationPayload$Point mutationPayload$Point) {
        mutationPayload$Point.getClass();
        ensurePositionsIsMutable();
        this.positions_.add(i, mutationPayload$Point);
    }

    private void addTexCoords(int i, MutationPayload$Point mutationPayload$Point) {
        mutationPayload$Point.getClass();
        ensureTexCoordsIsMutable();
        this.texCoords_.add(i, mutationPayload$Point);
    }

    public static MutationPayload$Vertices parseFrom(ByteString byteString, h72 h72Var) {
        return (MutationPayload$Vertices) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString, h72Var);
    }

    public static MutationPayload$Vertices parseFrom(byte[] bArr) {
        return (MutationPayload$Vertices) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MutationPayload$Vertices parseFrom(byte[] bArr, h72 h72Var) {
        return (MutationPayload$Vertices) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr, h72Var);
    }

    public static MutationPayload$Vertices parseFrom(InputStream inputStream) {
        return (MutationPayload$Vertices) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$Vertices parseFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$Vertices) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$Vertices parseFrom(lu0 lu0Var) {
        return (MutationPayload$Vertices) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var);
    }

    public static MutationPayload$Vertices parseFrom(lu0 lu0Var, h72 h72Var) {
        return (MutationPayload$Vertices) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var, h72Var);
    }
}
