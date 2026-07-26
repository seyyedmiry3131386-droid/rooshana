package com.microsoft.clarity.protomodels.mutationpayload;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import defpackage.fr2;
import defpackage.h72;
import defpackage.j26;
import defpackage.lu0;
import defpackage.rr3;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class MutationPayload$Rect extends com.google.protobuf.o implements Q0 {
    public static final int BOTTOM_FIELD_NUMBER = 3;
    private static final MutationPayload$Rect DEFAULT_INSTANCE;
    public static final int LEFT_FIELD_NUMBER = 2;
    private static volatile j26 PARSER = null;
    public static final int RADII_FIELD_NUMBER = 5;
    public static final int RIGHT_FIELD_NUMBER = 4;
    public static final int TOP_FIELD_NUMBER = 1;
    private int bitField0_;
    private float bottom_;
    private float left_;
    private rr3 radii_ = com.google.protobuf.o.emptyProtobufList();
    private float right_;
    private float top_;

    static {
        MutationPayload$Rect mutationPayload$Rect = new MutationPayload$Rect();
        DEFAULT_INSTANCE = mutationPayload$Rect;
        com.google.protobuf.o.registerDefaultInstance(MutationPayload$Rect.class, mutationPayload$Rect);
    }

    private MutationPayload$Rect() {
    }

    private void addAllRadii(Iterable<? extends MutationPayload$FloatList> iterable) {
        ensureRadiiIsMutable();
        com.google.protobuf.a.addAll((Iterable) iterable, (List) this.radii_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRadii(MutationPayload$FloatList mutationPayload$FloatList) {
        mutationPayload$FloatList.getClass();
        ensureRadiiIsMutable();
        this.radii_.add(mutationPayload$FloatList);
    }

    private void clearBottom() {
        this.bitField0_ &= -5;
        this.bottom_ = 0.0f;
    }

    private void clearLeft() {
        this.bitField0_ &= -3;
        this.left_ = 0.0f;
    }

    private void clearRadii() {
        this.radii_ = com.google.protobuf.o.emptyProtobufList();
    }

    private void clearRight() {
        this.bitField0_ &= -9;
        this.right_ = 0.0f;
    }

    private void clearTop() {
        this.bitField0_ &= -2;
        this.top_ = 0.0f;
    }

    private void ensureRadiiIsMutable() {
        rr3 rr3Var = this.radii_;
        if (((defpackage.z1) rr3Var).a) {
            return;
        }
        this.radii_ = com.google.protobuf.o.mutableCopy(rr3Var);
    }

    public static MutationPayload$Rect getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static P0 newBuilder() {
        return (P0) DEFAULT_INSTANCE.createBuilder();
    }

    public static MutationPayload$Rect parseDelimitedFrom(InputStream inputStream) {
        return (MutationPayload$Rect) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$Rect parseFrom(ByteBuffer byteBuffer) {
        return (MutationPayload$Rect) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static j26 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeRadii(int i) {
        ensureRadiiIsMutable();
        this.radii_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBottom(float f) {
        this.bitField0_ |= 4;
        this.bottom_ = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLeft(float f) {
        this.bitField0_ |= 2;
        this.left_ = f;
    }

    private void setRadii(int i, MutationPayload$FloatList mutationPayload$FloatList) {
        mutationPayload$FloatList.getClass();
        ensureRadiiIsMutable();
        this.radii_.set(i, mutationPayload$FloatList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRight(float f) {
        this.bitField0_ |= 8;
        this.right_ = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTop(float f) {
        this.bitField0_ |= 1;
        this.top_ = f;
    }

    @Override // com.google.protobuf.o
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, Object obj, Object obj2) {
        j26 fr2Var;
        switch (AbstractC0103a.a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new MutationPayload$Rect();
            case 2:
                return new P0();
            case 3:
                return com.google.protobuf.o.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005\u001b", new Object[]{"bitField0_", "top_", "left_", "bottom_", "right_", "radii_", MutationPayload$FloatList.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                j26 j26Var = PARSER;
                if (j26Var != null) {
                    return j26Var;
                }
                synchronized (MutationPayload$Rect.class) {
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

    public float getBottom() {
        return this.bottom_;
    }

    public float getLeft() {
        return this.left_;
    }

    public MutationPayload$FloatList getRadii(int i) {
        return (MutationPayload$FloatList) this.radii_.get(i);
    }

    public int getRadiiCount() {
        return this.radii_.size();
    }

    public List<MutationPayload$FloatList> getRadiiList() {
        return this.radii_;
    }

    public InterfaceC0109c0 getRadiiOrBuilder(int i) {
        return (InterfaceC0109c0) this.radii_.get(i);
    }

    public List<? extends InterfaceC0109c0> getRadiiOrBuilderList() {
        return this.radii_;
    }

    public float getRight() {
        return this.right_;
    }

    public float getTop() {
        return this.top_;
    }

    public boolean hasBottom() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasLeft() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasRight() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasTop() {
        return (this.bitField0_ & 1) != 0;
    }

    public static P0 newBuilder(MutationPayload$Rect mutationPayload$Rect) {
        return (P0) DEFAULT_INSTANCE.createBuilder(mutationPayload$Rect);
    }

    public static MutationPayload$Rect parseDelimitedFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$Rect) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$Rect parseFrom(ByteBuffer byteBuffer, h72 h72Var) {
        return (MutationPayload$Rect) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer, h72Var);
    }

    public static MutationPayload$Rect parseFrom(ByteString byteString) {
        return (MutationPayload$Rect) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    private void addRadii(int i, MutationPayload$FloatList mutationPayload$FloatList) {
        mutationPayload$FloatList.getClass();
        ensureRadiiIsMutable();
        this.radii_.add(i, mutationPayload$FloatList);
    }

    public static MutationPayload$Rect parseFrom(ByteString byteString, h72 h72Var) {
        return (MutationPayload$Rect) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString, h72Var);
    }

    public static MutationPayload$Rect parseFrom(byte[] bArr) {
        return (MutationPayload$Rect) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MutationPayload$Rect parseFrom(byte[] bArr, h72 h72Var) {
        return (MutationPayload$Rect) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr, h72Var);
    }

    public static MutationPayload$Rect parseFrom(InputStream inputStream) {
        return (MutationPayload$Rect) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$Rect parseFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$Rect) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$Rect parseFrom(lu0 lu0Var) {
        return (MutationPayload$Rect) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var);
    }

    public static MutationPayload$Rect parseFrom(lu0 lu0Var, h72 h72Var) {
        return (MutationPayload$Rect) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var, h72Var);
    }
}
