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
public final class MutationPayload$DrawTextBlobCommandPayload extends com.google.protobuf.o implements fv4 {
    public static final int BLOB_INDEX_FIELD_NUMBER = 1;
    private static final MutationPayload$DrawTextBlobCommandPayload DEFAULT_INSTANCE;
    public static final int PAINT_INDEX_FIELD_NUMBER = 4;
    private static volatile j26 PARSER = null;
    public static final int X_FIELD_NUMBER = 2;
    public static final int Y_FIELD_NUMBER = 3;
    private int bitField0_;
    private int blobIndex_;
    private int paintIndex_;
    private float x_;
    private float y_;

    static {
        MutationPayload$DrawTextBlobCommandPayload mutationPayload$DrawTextBlobCommandPayload = new MutationPayload$DrawTextBlobCommandPayload();
        DEFAULT_INSTANCE = mutationPayload$DrawTextBlobCommandPayload;
        com.google.protobuf.o.registerDefaultInstance(MutationPayload$DrawTextBlobCommandPayload.class, mutationPayload$DrawTextBlobCommandPayload);
    }

    private MutationPayload$DrawTextBlobCommandPayload() {
    }

    private void clearBlobIndex() {
        this.bitField0_ &= -2;
        this.blobIndex_ = 0;
    }

    private void clearPaintIndex() {
        this.bitField0_ &= -9;
        this.paintIndex_ = 0;
    }

    private void clearX() {
        this.bitField0_ &= -3;
        this.x_ = 0.0f;
    }

    private void clearY() {
        this.bitField0_ &= -5;
        this.y_ = 0.0f;
    }

    public static MutationPayload$DrawTextBlobCommandPayload getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static T newBuilder() {
        return (T) DEFAULT_INSTANCE.createBuilder();
    }

    public static MutationPayload$DrawTextBlobCommandPayload parseDelimitedFrom(InputStream inputStream) {
        return (MutationPayload$DrawTextBlobCommandPayload) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$DrawTextBlobCommandPayload parseFrom(ByteBuffer byteBuffer) {
        return (MutationPayload$DrawTextBlobCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static j26 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBlobIndex(int i) {
        this.bitField0_ |= 1;
        this.blobIndex_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPaintIndex(int i) {
        this.bitField0_ |= 8;
        this.paintIndex_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setX(float f) {
        this.bitField0_ |= 2;
        this.x_ = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setY(float f) {
        this.bitField0_ |= 4;
        this.y_ = f;
    }

    @Override // com.google.protobuf.o
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, Object obj, Object obj2) {
        j26 fr2Var;
        switch (AbstractC0103a.a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new MutationPayload$DrawTextBlobCommandPayload();
            case 2:
                return new T();
            case 3:
                return com.google.protobuf.o.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004င\u0003", new Object[]{"bitField0_", "blobIndex_", "x_", "y_", "paintIndex_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                j26 j26Var = PARSER;
                if (j26Var != null) {
                    return j26Var;
                }
                synchronized (MutationPayload$DrawTextBlobCommandPayload.class) {
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

    public int getBlobIndex() {
        return this.blobIndex_;
    }

    public int getPaintIndex() {
        return this.paintIndex_;
    }

    public float getX() {
        return this.x_;
    }

    public float getY() {
        return this.y_;
    }

    public boolean hasBlobIndex() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasPaintIndex() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasX() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasY() {
        return (this.bitField0_ & 4) != 0;
    }

    public static T newBuilder(MutationPayload$DrawTextBlobCommandPayload mutationPayload$DrawTextBlobCommandPayload) {
        return (T) DEFAULT_INSTANCE.createBuilder(mutationPayload$DrawTextBlobCommandPayload);
    }

    public static MutationPayload$DrawTextBlobCommandPayload parseDelimitedFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$DrawTextBlobCommandPayload) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$DrawTextBlobCommandPayload parseFrom(ByteBuffer byteBuffer, h72 h72Var) {
        return (MutationPayload$DrawTextBlobCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer, h72Var);
    }

    public static MutationPayload$DrawTextBlobCommandPayload parseFrom(ByteString byteString) {
        return (MutationPayload$DrawTextBlobCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MutationPayload$DrawTextBlobCommandPayload parseFrom(ByteString byteString, h72 h72Var) {
        return (MutationPayload$DrawTextBlobCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString, h72Var);
    }

    public static MutationPayload$DrawTextBlobCommandPayload parseFrom(byte[] bArr) {
        return (MutationPayload$DrawTextBlobCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MutationPayload$DrawTextBlobCommandPayload parseFrom(byte[] bArr, h72 h72Var) {
        return (MutationPayload$DrawTextBlobCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr, h72Var);
    }

    public static MutationPayload$DrawTextBlobCommandPayload parseFrom(InputStream inputStream) {
        return (MutationPayload$DrawTextBlobCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$DrawTextBlobCommandPayload parseFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$DrawTextBlobCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$DrawTextBlobCommandPayload parseFrom(lu0 lu0Var) {
        return (MutationPayload$DrawTextBlobCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var);
    }

    public static MutationPayload$DrawTextBlobCommandPayload parseFrom(lu0 lu0Var, h72 h72Var) {
        return (MutationPayload$DrawTextBlobCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var, h72Var);
    }
}
