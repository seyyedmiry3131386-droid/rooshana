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
public final class MutationPayload$Point extends com.google.protobuf.o implements M0 {
    private static final MutationPayload$Point DEFAULT_INSTANCE;
    private static volatile j26 PARSER = null;
    public static final int X_FIELD_NUMBER = 1;
    public static final int Y_FIELD_NUMBER = 2;
    private int bitField0_;
    private float x_;
    private float y_;

    static {
        MutationPayload$Point mutationPayload$Point = new MutationPayload$Point();
        DEFAULT_INSTANCE = mutationPayload$Point;
        com.google.protobuf.o.registerDefaultInstance(MutationPayload$Point.class, mutationPayload$Point);
    }

    private MutationPayload$Point() {
    }

    private void clearX() {
        this.bitField0_ &= -2;
        this.x_ = 0.0f;
    }

    private void clearY() {
        this.bitField0_ &= -3;
        this.y_ = 0.0f;
    }

    public static MutationPayload$Point getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static L0 newBuilder() {
        return (L0) DEFAULT_INSTANCE.createBuilder();
    }

    public static MutationPayload$Point parseDelimitedFrom(InputStream inputStream) {
        return (MutationPayload$Point) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$Point parseFrom(ByteBuffer byteBuffer) {
        return (MutationPayload$Point) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static j26 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setX(float f) {
        this.bitField0_ |= 1;
        this.x_ = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setY(float f) {
        this.bitField0_ |= 2;
        this.y_ = f;
    }

    @Override // com.google.protobuf.o
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, Object obj, Object obj2) {
        j26 fr2Var;
        switch (AbstractC0103a.a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new MutationPayload$Point();
            case 2:
                return new L0();
            case 3:
                return com.google.protobuf.o.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001", new Object[]{"bitField0_", "x_", "y_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                j26 j26Var = PARSER;
                if (j26Var != null) {
                    return j26Var;
                }
                synchronized (MutationPayload$Point.class) {
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

    public float getX() {
        return this.x_;
    }

    public float getY() {
        return this.y_;
    }

    public boolean hasX() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasY() {
        return (this.bitField0_ & 2) != 0;
    }

    public static L0 newBuilder(MutationPayload$Point mutationPayload$Point) {
        return (L0) DEFAULT_INSTANCE.createBuilder(mutationPayload$Point);
    }

    public static MutationPayload$Point parseDelimitedFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$Point) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$Point parseFrom(ByteBuffer byteBuffer, h72 h72Var) {
        return (MutationPayload$Point) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer, h72Var);
    }

    public static MutationPayload$Point parseFrom(ByteString byteString) {
        return (MutationPayload$Point) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MutationPayload$Point parseFrom(ByteString byteString, h72 h72Var) {
        return (MutationPayload$Point) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString, h72Var);
    }

    public static MutationPayload$Point parseFrom(byte[] bArr) {
        return (MutationPayload$Point) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MutationPayload$Point parseFrom(byte[] bArr, h72 h72Var) {
        return (MutationPayload$Point) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr, h72Var);
    }

    public static MutationPayload$Point parseFrom(InputStream inputStream) {
        return (MutationPayload$Point) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$Point parseFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$Point) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$Point parseFrom(lu0 lu0Var) {
        return (MutationPayload$Point) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var);
    }

    public static MutationPayload$Point parseFrom(lu0 lu0Var, h72 h72Var) {
        return (MutationPayload$Point) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var, h72Var);
    }
}
