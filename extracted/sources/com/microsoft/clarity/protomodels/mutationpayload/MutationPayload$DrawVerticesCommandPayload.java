package com.microsoft.clarity.protomodels.mutationpayload;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import defpackage.fr2;
import defpackage.fv4;
import defpackage.h72;
import defpackage.j26;
import defpackage.lu0;
import defpackage.rr3;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class MutationPayload$DrawVerticesCommandPayload extends com.google.protobuf.o implements fv4 {
    public static final int BONES_FIELD_NUMBER = 3;
    private static final MutationPayload$DrawVerticesCommandPayload DEFAULT_INSTANCE;
    public static final int MODE_FIELD_NUMBER = 2;
    public static final int PAINT_INDEX_FIELD_NUMBER = 4;
    private static volatile j26 PARSER = null;
    public static final int VERTICES_INDEX_FIELD_NUMBER = 1;
    private int bitField0_;
    private rr3 bones_ = com.google.protobuf.o.emptyProtobufList();
    private double mode_;
    private int paintIndex_;
    private int verticesIndex_;

    static {
        MutationPayload$DrawVerticesCommandPayload mutationPayload$DrawVerticesCommandPayload = new MutationPayload$DrawVerticesCommandPayload();
        DEFAULT_INSTANCE = mutationPayload$DrawVerticesCommandPayload;
        com.google.protobuf.o.registerDefaultInstance(MutationPayload$DrawVerticesCommandPayload.class, mutationPayload$DrawVerticesCommandPayload);
    }

    private MutationPayload$DrawVerticesCommandPayload() {
    }

    private void addAllBones(Iterable<? extends MutationPayload$FloatList> iterable) {
        ensureBonesIsMutable();
        com.google.protobuf.a.addAll((Iterable) iterable, (List) this.bones_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addBones(MutationPayload$FloatList mutationPayload$FloatList) {
        mutationPayload$FloatList.getClass();
        ensureBonesIsMutable();
        this.bones_.add(mutationPayload$FloatList);
    }

    private void clearBones() {
        this.bones_ = com.google.protobuf.o.emptyProtobufList();
    }

    private void clearMode() {
        this.bitField0_ &= -3;
        this.mode_ = 0.0d;
    }

    private void clearPaintIndex() {
        this.bitField0_ &= -5;
        this.paintIndex_ = 0;
    }

    private void clearVerticesIndex() {
        this.bitField0_ &= -2;
        this.verticesIndex_ = 0;
    }

    private void ensureBonesIsMutable() {
        rr3 rr3Var = this.bones_;
        if (((defpackage.z1) rr3Var).a) {
            return;
        }
        this.bones_ = com.google.protobuf.o.mutableCopy(rr3Var);
    }

    public static MutationPayload$DrawVerticesCommandPayload getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static U newBuilder() {
        return (U) DEFAULT_INSTANCE.createBuilder();
    }

    public static MutationPayload$DrawVerticesCommandPayload parseDelimitedFrom(InputStream inputStream) {
        return (MutationPayload$DrawVerticesCommandPayload) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$DrawVerticesCommandPayload parseFrom(ByteBuffer byteBuffer) {
        return (MutationPayload$DrawVerticesCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static j26 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeBones(int i) {
        ensureBonesIsMutable();
        this.bones_.remove(i);
    }

    private void setBones(int i, MutationPayload$FloatList mutationPayload$FloatList) {
        mutationPayload$FloatList.getClass();
        ensureBonesIsMutable();
        this.bones_.set(i, mutationPayload$FloatList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMode(double d) {
        this.bitField0_ |= 2;
        this.mode_ = d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPaintIndex(int i) {
        this.bitField0_ |= 4;
        this.paintIndex_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVerticesIndex(int i) {
        this.bitField0_ |= 1;
        this.verticesIndex_ = i;
    }

    @Override // com.google.protobuf.o
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, Object obj, Object obj2) {
        j26 fr2Var;
        switch (AbstractC0103a.a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new MutationPayload$DrawVerticesCommandPayload();
            case 2:
                return new U();
            case 3:
                return com.google.protobuf.o.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001င\u0000\u0002က\u0001\u0003\u001b\u0004င\u0002", new Object[]{"bitField0_", "verticesIndex_", "mode_", "bones_", MutationPayload$FloatList.class, "paintIndex_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                j26 j26Var = PARSER;
                if (j26Var != null) {
                    return j26Var;
                }
                synchronized (MutationPayload$DrawVerticesCommandPayload.class) {
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

    public MutationPayload$FloatList getBones(int i) {
        return (MutationPayload$FloatList) this.bones_.get(i);
    }

    public int getBonesCount() {
        return this.bones_.size();
    }

    public List<MutationPayload$FloatList> getBonesList() {
        return this.bones_;
    }

    public InterfaceC0109c0 getBonesOrBuilder(int i) {
        return (InterfaceC0109c0) this.bones_.get(i);
    }

    public List<? extends InterfaceC0109c0> getBonesOrBuilderList() {
        return this.bones_;
    }

    public double getMode() {
        return this.mode_;
    }

    public int getPaintIndex() {
        return this.paintIndex_;
    }

    public int getVerticesIndex() {
        return this.verticesIndex_;
    }

    public boolean hasMode() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasPaintIndex() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasVerticesIndex() {
        return (this.bitField0_ & 1) != 0;
    }

    public static U newBuilder(MutationPayload$DrawVerticesCommandPayload mutationPayload$DrawVerticesCommandPayload) {
        return (U) DEFAULT_INSTANCE.createBuilder(mutationPayload$DrawVerticesCommandPayload);
    }

    public static MutationPayload$DrawVerticesCommandPayload parseDelimitedFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$DrawVerticesCommandPayload) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$DrawVerticesCommandPayload parseFrom(ByteBuffer byteBuffer, h72 h72Var) {
        return (MutationPayload$DrawVerticesCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer, h72Var);
    }

    public static MutationPayload$DrawVerticesCommandPayload parseFrom(ByteString byteString) {
        return (MutationPayload$DrawVerticesCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    private void addBones(int i, MutationPayload$FloatList mutationPayload$FloatList) {
        mutationPayload$FloatList.getClass();
        ensureBonesIsMutable();
        this.bones_.add(i, mutationPayload$FloatList);
    }

    public static MutationPayload$DrawVerticesCommandPayload parseFrom(ByteString byteString, h72 h72Var) {
        return (MutationPayload$DrawVerticesCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString, h72Var);
    }

    public static MutationPayload$DrawVerticesCommandPayload parseFrom(byte[] bArr) {
        return (MutationPayload$DrawVerticesCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MutationPayload$DrawVerticesCommandPayload parseFrom(byte[] bArr, h72 h72Var) {
        return (MutationPayload$DrawVerticesCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr, h72Var);
    }

    public static MutationPayload$DrawVerticesCommandPayload parseFrom(InputStream inputStream) {
        return (MutationPayload$DrawVerticesCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$DrawVerticesCommandPayload parseFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$DrawVerticesCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$DrawVerticesCommandPayload parseFrom(lu0 lu0Var) {
        return (MutationPayload$DrawVerticesCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var);
    }

    public static MutationPayload$DrawVerticesCommandPayload parseFrom(lu0 lu0Var, h72 h72Var) {
        return (MutationPayload$DrawVerticesCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var, h72Var);
    }
}
