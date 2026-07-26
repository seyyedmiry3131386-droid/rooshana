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
public final class MutationPayload$ClipRectCommandPayload extends com.google.protobuf.o implements fv4 {
    public static final int ANTI_ALIAS_FIELD_NUMBER = 2;
    private static final MutationPayload$ClipRectCommandPayload DEFAULT_INSTANCE;
    public static final int OP_FIELD_NUMBER = 1;
    private static volatile j26 PARSER = null;
    public static final int RECT_FIELD_NUMBER = 3;
    private boolean antiAlias_;
    private int bitField0_;
    private int op_;
    private MutationPayload$Rect rect_;

    static {
        MutationPayload$ClipRectCommandPayload mutationPayload$ClipRectCommandPayload = new MutationPayload$ClipRectCommandPayload();
        DEFAULT_INSTANCE = mutationPayload$ClipRectCommandPayload;
        com.google.protobuf.o.registerDefaultInstance(MutationPayload$ClipRectCommandPayload.class, mutationPayload$ClipRectCommandPayload);
    }

    private MutationPayload$ClipRectCommandPayload() {
    }

    private void clearAntiAlias() {
        this.bitField0_ &= -3;
        this.antiAlias_ = false;
    }

    private void clearOp() {
        this.bitField0_ &= -2;
        this.op_ = 0;
    }

    private void clearRect() {
        this.rect_ = null;
        this.bitField0_ &= -5;
    }

    public static MutationPayload$ClipRectCommandPayload getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeRect(MutationPayload$Rect mutationPayload$Rect) {
        mutationPayload$Rect.getClass();
        MutationPayload$Rect mutationPayload$Rect2 = this.rect_;
        if (mutationPayload$Rect2 == null || mutationPayload$Rect2 == MutationPayload$Rect.getDefaultInstance()) {
            this.rect_ = mutationPayload$Rect;
        } else {
            this.rect_ = (MutationPayload$Rect) ((P0) MutationPayload$Rect.newBuilder(this.rect_).mergeFrom((com.google.protobuf.o) mutationPayload$Rect)).buildPartial();
        }
        this.bitField0_ |= 4;
    }

    public static C0112e newBuilder() {
        return (C0112e) DEFAULT_INSTANCE.createBuilder();
    }

    public static MutationPayload$ClipRectCommandPayload parseDelimitedFrom(InputStream inputStream) {
        return (MutationPayload$ClipRectCommandPayload) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$ClipRectCommandPayload parseFrom(ByteBuffer byteBuffer) {
        return (MutationPayload$ClipRectCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static j26 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAntiAlias(boolean z) {
        this.bitField0_ |= 2;
        this.antiAlias_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOp(int i) {
        this.bitField0_ |= 1;
        this.op_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRect(MutationPayload$Rect mutationPayload$Rect) {
        mutationPayload$Rect.getClass();
        this.rect_ = mutationPayload$Rect;
        this.bitField0_ |= 4;
    }

    @Override // com.google.protobuf.o
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, Object obj, Object obj2) {
        j26 fr2Var;
        switch (AbstractC0103a.a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new MutationPayload$ClipRectCommandPayload();
            case 2:
                return new C0112e();
            case 3:
                return com.google.protobuf.o.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003ဉ\u0002", new Object[]{"bitField0_", "op_", "antiAlias_", "rect_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                j26 j26Var = PARSER;
                if (j26Var != null) {
                    return j26Var;
                }
                synchronized (MutationPayload$ClipRectCommandPayload.class) {
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

    public boolean getAntiAlias() {
        return this.antiAlias_;
    }

    public int getOp() {
        return this.op_;
    }

    public MutationPayload$Rect getRect() {
        MutationPayload$Rect mutationPayload$Rect = this.rect_;
        return mutationPayload$Rect == null ? MutationPayload$Rect.getDefaultInstance() : mutationPayload$Rect;
    }

    public boolean hasAntiAlias() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasOp() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasRect() {
        return (this.bitField0_ & 4) != 0;
    }

    public static C0112e newBuilder(MutationPayload$ClipRectCommandPayload mutationPayload$ClipRectCommandPayload) {
        return (C0112e) DEFAULT_INSTANCE.createBuilder(mutationPayload$ClipRectCommandPayload);
    }

    public static MutationPayload$ClipRectCommandPayload parseDelimitedFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$ClipRectCommandPayload) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$ClipRectCommandPayload parseFrom(ByteBuffer byteBuffer, h72 h72Var) {
        return (MutationPayload$ClipRectCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer, h72Var);
    }

    public static MutationPayload$ClipRectCommandPayload parseFrom(ByteString byteString) {
        return (MutationPayload$ClipRectCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MutationPayload$ClipRectCommandPayload parseFrom(ByteString byteString, h72 h72Var) {
        return (MutationPayload$ClipRectCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString, h72Var);
    }

    public static MutationPayload$ClipRectCommandPayload parseFrom(byte[] bArr) {
        return (MutationPayload$ClipRectCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MutationPayload$ClipRectCommandPayload parseFrom(byte[] bArr, h72 h72Var) {
        return (MutationPayload$ClipRectCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr, h72Var);
    }

    public static MutationPayload$ClipRectCommandPayload parseFrom(InputStream inputStream) {
        return (MutationPayload$ClipRectCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$ClipRectCommandPayload parseFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$ClipRectCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$ClipRectCommandPayload parseFrom(lu0 lu0Var) {
        return (MutationPayload$ClipRectCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var);
    }

    public static MutationPayload$ClipRectCommandPayload parseFrom(lu0 lu0Var, h72 h72Var) {
        return (MutationPayload$ClipRectCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var, h72Var);
    }
}
