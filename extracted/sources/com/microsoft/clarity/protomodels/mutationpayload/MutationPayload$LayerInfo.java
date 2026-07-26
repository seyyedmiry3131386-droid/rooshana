package com.microsoft.clarity.protomodels.mutationpayload;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import defpackage.de2;
import defpackage.fr2;
import defpackage.fv4;
import defpackage.h72;
import defpackage.j26;
import defpackage.lu0;
import defpackage.or3;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class MutationPayload$LayerInfo extends com.google.protobuf.o implements fv4 {
    public static final int COLOR_MODE_FIELD_NUMBER = 2;
    private static final MutationPayload$LayerInfo DEFAULT_INSTANCE;
    public static final int OFFSET_FIELD_NUMBER = 3;
    public static final int PAINT_BITS_FIELD_NUMBER = 1;
    private static volatile j26 PARSER = null;
    public static final int POST_TRANSLATE_FIELD_NUMBER = 4;
    private int bitField0_;
    private int colorMode_;
    private int offsetMemoizedSerializedSize = -1;
    private or3 offset_ = com.google.protobuf.o.emptyFloatList();
    private int paintBits_;
    private boolean postTranslate_;

    static {
        MutationPayload$LayerInfo mutationPayload$LayerInfo = new MutationPayload$LayerInfo();
        DEFAULT_INSTANCE = mutationPayload$LayerInfo;
        com.google.protobuf.o.registerDefaultInstance(MutationPayload$LayerInfo.class, mutationPayload$LayerInfo);
    }

    private MutationPayload$LayerInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllOffset(Iterable<? extends Float> iterable) {
        ensureOffsetIsMutable();
        com.google.protobuf.a.addAll((Iterable) iterable, (List) this.offset_);
    }

    private void addOffset(float f) {
        ensureOffsetIsMutable();
        ((de2) this.offset_).c(f);
    }

    private void clearColorMode() {
        this.bitField0_ &= -3;
        this.colorMode_ = 0;
    }

    private void clearOffset() {
        this.offset_ = com.google.protobuf.o.emptyFloatList();
    }

    private void clearPaintBits() {
        this.bitField0_ &= -2;
        this.paintBits_ = 0;
    }

    private void clearPostTranslate() {
        this.bitField0_ &= -5;
        this.postTranslate_ = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void ensureOffsetIsMutable() {
        or3 or3Var = this.offset_;
        if (((defpackage.z1) or3Var).a) {
            return;
        }
        this.offset_ = com.google.protobuf.o.mutableCopy(or3Var);
    }

    public static MutationPayload$LayerInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C0133o0 newBuilder() {
        return (C0133o0) DEFAULT_INSTANCE.createBuilder();
    }

    public static MutationPayload$LayerInfo parseDelimitedFrom(InputStream inputStream) {
        return (MutationPayload$LayerInfo) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$LayerInfo parseFrom(ByteBuffer byteBuffer) {
        return (MutationPayload$LayerInfo) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static j26 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setColorMode(int i) {
        this.bitField0_ |= 2;
        this.colorMode_ = i;
    }

    private void setOffset(int i, float f) {
        ensureOffsetIsMutable();
        ((de2) this.offset_).f(i, f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPaintBits(int i) {
        this.bitField0_ |= 1;
        this.paintBits_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPostTranslate(boolean z) {
        this.bitField0_ |= 4;
        this.postTranslate_ = z;
    }

    @Override // com.google.protobuf.o
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, Object obj, Object obj2) {
        j26 fr2Var;
        switch (AbstractC0103a.a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new MutationPayload$LayerInfo();
            case 2:
                return new C0133o0();
            case 3:
                return com.google.protobuf.o.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003$\u0004ဇ\u0002", new Object[]{"bitField0_", "paintBits_", "colorMode_", "offset_", "postTranslate_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                j26 j26Var = PARSER;
                if (j26Var != null) {
                    return j26Var;
                }
                synchronized (MutationPayload$LayerInfo.class) {
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

    public int getColorMode() {
        return this.colorMode_;
    }

    public float getOffset(int i) {
        return ((de2) this.offset_).e(i);
    }

    public int getOffsetCount() {
        return ((de2) this.offset_).size();
    }

    public List<Float> getOffsetList() {
        return this.offset_;
    }

    public int getPaintBits() {
        return this.paintBits_;
    }

    public boolean getPostTranslate() {
        return this.postTranslate_;
    }

    public boolean hasColorMode() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasPaintBits() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasPostTranslate() {
        return (this.bitField0_ & 4) != 0;
    }

    public static C0133o0 newBuilder(MutationPayload$LayerInfo mutationPayload$LayerInfo) {
        return (C0133o0) DEFAULT_INSTANCE.createBuilder(mutationPayload$LayerInfo);
    }

    public static MutationPayload$LayerInfo parseDelimitedFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$LayerInfo) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$LayerInfo parseFrom(ByteBuffer byteBuffer, h72 h72Var) {
        return (MutationPayload$LayerInfo) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer, h72Var);
    }

    public static MutationPayload$LayerInfo parseFrom(ByteString byteString) {
        return (MutationPayload$LayerInfo) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MutationPayload$LayerInfo parseFrom(ByteString byteString, h72 h72Var) {
        return (MutationPayload$LayerInfo) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString, h72Var);
    }

    public static MutationPayload$LayerInfo parseFrom(byte[] bArr) {
        return (MutationPayload$LayerInfo) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MutationPayload$LayerInfo parseFrom(byte[] bArr, h72 h72Var) {
        return (MutationPayload$LayerInfo) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr, h72Var);
    }

    public static MutationPayload$LayerInfo parseFrom(InputStream inputStream) {
        return (MutationPayload$LayerInfo) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$LayerInfo parseFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$LayerInfo) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$LayerInfo parseFrom(lu0 lu0Var) {
        return (MutationPayload$LayerInfo) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var);
    }

    public static MutationPayload$LayerInfo parseFrom(lu0 lu0Var, h72 h72Var) {
        return (MutationPayload$LayerInfo) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var, h72Var);
    }
}
