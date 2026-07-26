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
public final class MutationPayload$DrawDRRectCommandPayload extends com.google.protobuf.o implements fv4 {
    private static final MutationPayload$DrawDRRectCommandPayload DEFAULT_INSTANCE;
    public static final int INNER_FIELD_NUMBER = 2;
    public static final int OUTER_FIELD_NUMBER = 1;
    public static final int PAINT_INDEX_FIELD_NUMBER = 3;
    private static volatile j26 PARSER;
    private int bitField0_;
    private MutationPayload$Rect inner_;
    private MutationPayload$Rect outer_;
    private int paintIndex_;

    static {
        MutationPayload$DrawDRRectCommandPayload mutationPayload$DrawDRRectCommandPayload = new MutationPayload$DrawDRRectCommandPayload();
        DEFAULT_INSTANCE = mutationPayload$DrawDRRectCommandPayload;
        com.google.protobuf.o.registerDefaultInstance(MutationPayload$DrawDRRectCommandPayload.class, mutationPayload$DrawDRRectCommandPayload);
    }

    private MutationPayload$DrawDRRectCommandPayload() {
    }

    private void clearInner() {
        this.inner_ = null;
        this.bitField0_ &= -3;
    }

    private void clearOuter() {
        this.outer_ = null;
        this.bitField0_ &= -2;
    }

    private void clearPaintIndex() {
        this.bitField0_ &= -5;
        this.paintIndex_ = 0;
    }

    public static MutationPayload$DrawDRRectCommandPayload getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeInner(MutationPayload$Rect mutationPayload$Rect) {
        mutationPayload$Rect.getClass();
        MutationPayload$Rect mutationPayload$Rect2 = this.inner_;
        if (mutationPayload$Rect2 == null || mutationPayload$Rect2 == MutationPayload$Rect.getDefaultInstance()) {
            this.inner_ = mutationPayload$Rect;
        } else {
            this.inner_ = (MutationPayload$Rect) ((P0) MutationPayload$Rect.newBuilder(this.inner_).mergeFrom((com.google.protobuf.o) mutationPayload$Rect)).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    private void mergeOuter(MutationPayload$Rect mutationPayload$Rect) {
        mutationPayload$Rect.getClass();
        MutationPayload$Rect mutationPayload$Rect2 = this.outer_;
        if (mutationPayload$Rect2 == null || mutationPayload$Rect2 == MutationPayload$Rect.getDefaultInstance()) {
            this.outer_ = mutationPayload$Rect;
        } else {
            this.outer_ = (MutationPayload$Rect) ((P0) MutationPayload$Rect.newBuilder(this.outer_).mergeFrom((com.google.protobuf.o) mutationPayload$Rect)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static E newBuilder() {
        return (E) DEFAULT_INSTANCE.createBuilder();
    }

    public static MutationPayload$DrawDRRectCommandPayload parseDelimitedFrom(InputStream inputStream) {
        return (MutationPayload$DrawDRRectCommandPayload) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$DrawDRRectCommandPayload parseFrom(ByteBuffer byteBuffer) {
        return (MutationPayload$DrawDRRectCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static j26 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInner(MutationPayload$Rect mutationPayload$Rect) {
        mutationPayload$Rect.getClass();
        this.inner_ = mutationPayload$Rect;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOuter(MutationPayload$Rect mutationPayload$Rect) {
        mutationPayload$Rect.getClass();
        this.outer_ = mutationPayload$Rect;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPaintIndex(int i) {
        this.bitField0_ |= 4;
        this.paintIndex_ = i;
    }

    @Override // com.google.protobuf.o
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, Object obj, Object obj2) {
        j26 fr2Var;
        switch (AbstractC0103a.a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new MutationPayload$DrawDRRectCommandPayload();
            case 2:
                return new E();
            case 3:
                return com.google.protobuf.o.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003င\u0002", new Object[]{"bitField0_", "outer_", "inner_", "paintIndex_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                j26 j26Var = PARSER;
                if (j26Var != null) {
                    return j26Var;
                }
                synchronized (MutationPayload$DrawDRRectCommandPayload.class) {
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

    public MutationPayload$Rect getInner() {
        MutationPayload$Rect mutationPayload$Rect = this.inner_;
        return mutationPayload$Rect == null ? MutationPayload$Rect.getDefaultInstance() : mutationPayload$Rect;
    }

    public MutationPayload$Rect getOuter() {
        MutationPayload$Rect mutationPayload$Rect = this.outer_;
        return mutationPayload$Rect == null ? MutationPayload$Rect.getDefaultInstance() : mutationPayload$Rect;
    }

    public int getPaintIndex() {
        return this.paintIndex_;
    }

    public boolean hasInner() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasOuter() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasPaintIndex() {
        return (this.bitField0_ & 4) != 0;
    }

    public static E newBuilder(MutationPayload$DrawDRRectCommandPayload mutationPayload$DrawDRRectCommandPayload) {
        return (E) DEFAULT_INSTANCE.createBuilder(mutationPayload$DrawDRRectCommandPayload);
    }

    public static MutationPayload$DrawDRRectCommandPayload parseDelimitedFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$DrawDRRectCommandPayload) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$DrawDRRectCommandPayload parseFrom(ByteBuffer byteBuffer, h72 h72Var) {
        return (MutationPayload$DrawDRRectCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer, h72Var);
    }

    public static MutationPayload$DrawDRRectCommandPayload parseFrom(ByteString byteString) {
        return (MutationPayload$DrawDRRectCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MutationPayload$DrawDRRectCommandPayload parseFrom(ByteString byteString, h72 h72Var) {
        return (MutationPayload$DrawDRRectCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString, h72Var);
    }

    public static MutationPayload$DrawDRRectCommandPayload parseFrom(byte[] bArr) {
        return (MutationPayload$DrawDRRectCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MutationPayload$DrawDRRectCommandPayload parseFrom(byte[] bArr, h72 h72Var) {
        return (MutationPayload$DrawDRRectCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr, h72Var);
    }

    public static MutationPayload$DrawDRRectCommandPayload parseFrom(InputStream inputStream) {
        return (MutationPayload$DrawDRRectCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$DrawDRRectCommandPayload parseFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$DrawDRRectCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$DrawDRRectCommandPayload parseFrom(lu0 lu0Var) {
        return (MutationPayload$DrawDRRectCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var);
    }

    public static MutationPayload$DrawDRRectCommandPayload parseFrom(lu0 lu0Var, h72 h72Var) {
        return (MutationPayload$DrawDRRectCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var, h72Var);
    }
}
