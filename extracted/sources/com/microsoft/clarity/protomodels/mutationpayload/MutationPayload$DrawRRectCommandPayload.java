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
public final class MutationPayload$DrawRRectCommandPayload extends com.google.protobuf.o implements fv4 {
    private static final MutationPayload$DrawRRectCommandPayload DEFAULT_INSTANCE;
    public static final int PAINT_INDEX_FIELD_NUMBER = 2;
    private static volatile j26 PARSER = null;
    public static final int RRECT_FIELD_NUMBER = 1;
    private int bitField0_;
    private int paintIndex_;
    private MutationPayload$Rect rrect_;

    static {
        MutationPayload$DrawRRectCommandPayload mutationPayload$DrawRRectCommandPayload = new MutationPayload$DrawRRectCommandPayload();
        DEFAULT_INSTANCE = mutationPayload$DrawRRectCommandPayload;
        com.google.protobuf.o.registerDefaultInstance(MutationPayload$DrawRRectCommandPayload.class, mutationPayload$DrawRRectCommandPayload);
    }

    private MutationPayload$DrawRRectCommandPayload() {
    }

    private void clearPaintIndex() {
        this.bitField0_ &= -3;
        this.paintIndex_ = 0;
    }

    private void clearRrect() {
        this.rrect_ = null;
        this.bitField0_ &= -2;
    }

    public static MutationPayload$DrawRRectCommandPayload getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeRrect(MutationPayload$Rect mutationPayload$Rect) {
        mutationPayload$Rect.getClass();
        MutationPayload$Rect mutationPayload$Rect2 = this.rrect_;
        if (mutationPayload$Rect2 == null || mutationPayload$Rect2 == MutationPayload$Rect.getDefaultInstance()) {
            this.rrect_ = mutationPayload$Rect;
        } else {
            this.rrect_ = (MutationPayload$Rect) ((P0) MutationPayload$Rect.newBuilder(this.rrect_).mergeFrom((com.google.protobuf.o) mutationPayload$Rect)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static O newBuilder() {
        return (O) DEFAULT_INSTANCE.createBuilder();
    }

    public static MutationPayload$DrawRRectCommandPayload parseDelimitedFrom(InputStream inputStream) {
        return (MutationPayload$DrawRRectCommandPayload) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$DrawRRectCommandPayload parseFrom(ByteBuffer byteBuffer) {
        return (MutationPayload$DrawRRectCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static j26 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPaintIndex(int i) {
        this.bitField0_ |= 2;
        this.paintIndex_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRrect(MutationPayload$Rect mutationPayload$Rect) {
        mutationPayload$Rect.getClass();
        this.rrect_ = mutationPayload$Rect;
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.o
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, Object obj, Object obj2) {
        j26 fr2Var;
        switch (AbstractC0103a.a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new MutationPayload$DrawRRectCommandPayload();
            case 2:
                return new O();
            case 3:
                return com.google.protobuf.o.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001", new Object[]{"bitField0_", "rrect_", "paintIndex_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                j26 j26Var = PARSER;
                if (j26Var != null) {
                    return j26Var;
                }
                synchronized (MutationPayload$DrawRRectCommandPayload.class) {
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

    public int getPaintIndex() {
        return this.paintIndex_;
    }

    public MutationPayload$Rect getRrect() {
        MutationPayload$Rect mutationPayload$Rect = this.rrect_;
        return mutationPayload$Rect == null ? MutationPayload$Rect.getDefaultInstance() : mutationPayload$Rect;
    }

    public boolean hasPaintIndex() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasRrect() {
        return (this.bitField0_ & 1) != 0;
    }

    public static O newBuilder(MutationPayload$DrawRRectCommandPayload mutationPayload$DrawRRectCommandPayload) {
        return (O) DEFAULT_INSTANCE.createBuilder(mutationPayload$DrawRRectCommandPayload);
    }

    public static MutationPayload$DrawRRectCommandPayload parseDelimitedFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$DrawRRectCommandPayload) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$DrawRRectCommandPayload parseFrom(ByteBuffer byteBuffer, h72 h72Var) {
        return (MutationPayload$DrawRRectCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer, h72Var);
    }

    public static MutationPayload$DrawRRectCommandPayload parseFrom(ByteString byteString) {
        return (MutationPayload$DrawRRectCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MutationPayload$DrawRRectCommandPayload parseFrom(ByteString byteString, h72 h72Var) {
        return (MutationPayload$DrawRRectCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString, h72Var);
    }

    public static MutationPayload$DrawRRectCommandPayload parseFrom(byte[] bArr) {
        return (MutationPayload$DrawRRectCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MutationPayload$DrawRRectCommandPayload parseFrom(byte[] bArr, h72 h72Var) {
        return (MutationPayload$DrawRRectCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr, h72Var);
    }

    public static MutationPayload$DrawRRectCommandPayload parseFrom(InputStream inputStream) {
        return (MutationPayload$DrawRRectCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$DrawRRectCommandPayload parseFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$DrawRRectCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$DrawRRectCommandPayload parseFrom(lu0 lu0Var) {
        return (MutationPayload$DrawRRectCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var);
    }

    public static MutationPayload$DrawRRectCommandPayload parseFrom(lu0 lu0Var, h72 h72Var) {
        return (MutationPayload$DrawRRectCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var, h72Var);
    }
}
