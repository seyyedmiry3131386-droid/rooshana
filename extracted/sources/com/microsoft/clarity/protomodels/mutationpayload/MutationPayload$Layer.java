package com.microsoft.clarity.protomodels.mutationpayload;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import defpackage.fr2;
import defpackage.h72;
import defpackage.j26;
import defpackage.lu0;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class MutationPayload$Layer extends com.google.protobuf.o implements InterfaceC0135p0 {
    private static final MutationPayload$Layer DEFAULT_INSTANCE;
    public static final int LAYER_INFO_FIELD_NUMBER = 1;
    public static final int PAINT_FIELD_NUMBER = 2;
    private static volatile j26 PARSER;
    private int bitField0_;
    private MutationPayload$LayerInfo layerInfo_;
    private MutationPayload$Paint paint_;

    static {
        MutationPayload$Layer mutationPayload$Layer = new MutationPayload$Layer();
        DEFAULT_INSTANCE = mutationPayload$Layer;
        com.google.protobuf.o.registerDefaultInstance(MutationPayload$Layer.class, mutationPayload$Layer);
    }

    private MutationPayload$Layer() {
    }

    private void clearLayerInfo() {
        this.layerInfo_ = null;
        this.bitField0_ &= -2;
    }

    private void clearPaint() {
        this.paint_ = null;
        this.bitField0_ &= -3;
    }

    public static MutationPayload$Layer getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeLayerInfo(MutationPayload$LayerInfo mutationPayload$LayerInfo) {
        mutationPayload$LayerInfo.getClass();
        MutationPayload$LayerInfo mutationPayload$LayerInfo2 = this.layerInfo_;
        if (mutationPayload$LayerInfo2 == null || mutationPayload$LayerInfo2 == MutationPayload$LayerInfo.getDefaultInstance()) {
            this.layerInfo_ = mutationPayload$LayerInfo;
        } else {
            this.layerInfo_ = (MutationPayload$LayerInfo) ((C0133o0) MutationPayload$LayerInfo.newBuilder(this.layerInfo_).mergeFrom((com.google.protobuf.o) mutationPayload$LayerInfo)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    private void mergePaint(MutationPayload$Paint mutationPayload$Paint) {
        mutationPayload$Paint.getClass();
        MutationPayload$Paint mutationPayload$Paint2 = this.paint_;
        if (mutationPayload$Paint2 == null || mutationPayload$Paint2 == MutationPayload$Paint.getDefaultInstance()) {
            this.paint_ = mutationPayload$Paint;
        } else {
            this.paint_ = (MutationPayload$Paint) ((C0152y0) MutationPayload$Paint.newBuilder(this.paint_).mergeFrom((com.google.protobuf.o) mutationPayload$Paint)).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    public static C0131n0 newBuilder() {
        return (C0131n0) DEFAULT_INSTANCE.createBuilder();
    }

    public static MutationPayload$Layer parseDelimitedFrom(InputStream inputStream) {
        return (MutationPayload$Layer) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$Layer parseFrom(ByteBuffer byteBuffer) {
        return (MutationPayload$Layer) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static j26 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLayerInfo(MutationPayload$LayerInfo mutationPayload$LayerInfo) {
        mutationPayload$LayerInfo.getClass();
        this.layerInfo_ = mutationPayload$LayerInfo;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPaint(MutationPayload$Paint mutationPayload$Paint) {
        mutationPayload$Paint.getClass();
        this.paint_ = mutationPayload$Paint;
        this.bitField0_ |= 2;
    }

    @Override // com.google.protobuf.o
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, Object obj, Object obj2) {
        j26 fr2Var;
        switch (AbstractC0103a.a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new MutationPayload$Layer();
            case 2:
                return new C0131n0();
            case 3:
                return com.google.protobuf.o.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "layerInfo_", "paint_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                j26 j26Var = PARSER;
                if (j26Var != null) {
                    return j26Var;
                }
                synchronized (MutationPayload$Layer.class) {
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

    public MutationPayload$LayerInfo getLayerInfo() {
        MutationPayload$LayerInfo mutationPayload$LayerInfo = this.layerInfo_;
        return mutationPayload$LayerInfo == null ? MutationPayload$LayerInfo.getDefaultInstance() : mutationPayload$LayerInfo;
    }

    public MutationPayload$Paint getPaint() {
        MutationPayload$Paint mutationPayload$Paint = this.paint_;
        return mutationPayload$Paint == null ? MutationPayload$Paint.getDefaultInstance() : mutationPayload$Paint;
    }

    public boolean hasLayerInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasPaint() {
        return (this.bitField0_ & 2) != 0;
    }

    public static C0131n0 newBuilder(MutationPayload$Layer mutationPayload$Layer) {
        return (C0131n0) DEFAULT_INSTANCE.createBuilder(mutationPayload$Layer);
    }

    public static MutationPayload$Layer parseDelimitedFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$Layer) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$Layer parseFrom(ByteBuffer byteBuffer, h72 h72Var) {
        return (MutationPayload$Layer) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer, h72Var);
    }

    public static MutationPayload$Layer parseFrom(ByteString byteString) {
        return (MutationPayload$Layer) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MutationPayload$Layer parseFrom(ByteString byteString, h72 h72Var) {
        return (MutationPayload$Layer) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString, h72Var);
    }

    public static MutationPayload$Layer parseFrom(byte[] bArr) {
        return (MutationPayload$Layer) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MutationPayload$Layer parseFrom(byte[] bArr, h72 h72Var) {
        return (MutationPayload$Layer) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr, h72Var);
    }

    public static MutationPayload$Layer parseFrom(InputStream inputStream) {
        return (MutationPayload$Layer) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$Layer parseFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$Layer) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$Layer parseFrom(lu0 lu0Var) {
        return (MutationPayload$Layer) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var);
    }

    public static MutationPayload$Layer parseFrom(lu0 lu0Var, h72 h72Var) {
        return (MutationPayload$Layer) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var, h72Var);
    }
}
