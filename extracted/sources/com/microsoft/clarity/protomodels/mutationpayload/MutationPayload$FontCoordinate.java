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
public final class MutationPayload$FontCoordinate extends com.google.protobuf.o implements InterfaceC0113e0 {
    public static final int AXIS_FIELD_NUMBER = 1;
    private static final MutationPayload$FontCoordinate DEFAULT_INSTANCE;
    private static volatile j26 PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 2;
    private String axis_ = "";
    private int bitField0_;
    private float value_;

    static {
        MutationPayload$FontCoordinate mutationPayload$FontCoordinate = new MutationPayload$FontCoordinate();
        DEFAULT_INSTANCE = mutationPayload$FontCoordinate;
        com.google.protobuf.o.registerDefaultInstance(MutationPayload$FontCoordinate.class, mutationPayload$FontCoordinate);
    }

    private MutationPayload$FontCoordinate() {
    }

    private void clearAxis() {
        this.bitField0_ &= -2;
        this.axis_ = getDefaultInstance().getAxis();
    }

    private void clearValue() {
        this.bitField0_ &= -3;
        this.value_ = 0.0f;
    }

    public static MutationPayload$FontCoordinate getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C0111d0 newBuilder() {
        return (C0111d0) DEFAULT_INSTANCE.createBuilder();
    }

    public static MutationPayload$FontCoordinate parseDelimitedFrom(InputStream inputStream) {
        return (MutationPayload$FontCoordinate) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$FontCoordinate parseFrom(ByteBuffer byteBuffer) {
        return (MutationPayload$FontCoordinate) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static j26 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAxis(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.axis_ = str;
    }

    private void setAxisBytes(ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.axis_ = byteString.w();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(float f) {
        this.bitField0_ |= 2;
        this.value_ = f;
    }

    @Override // com.google.protobuf.o
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, Object obj, Object obj2) {
        j26 fr2Var;
        switch (AbstractC0103a.a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new MutationPayload$FontCoordinate();
            case 2:
                return new C0111d0();
            case 3:
                return com.google.protobuf.o.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ခ\u0001", new Object[]{"bitField0_", "axis_", "value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                j26 j26Var = PARSER;
                if (j26Var != null) {
                    return j26Var;
                }
                synchronized (MutationPayload$FontCoordinate.class) {
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

    public String getAxis() {
        return this.axis_;
    }

    public ByteString getAxisBytes() {
        return ByteString.i(this.axis_);
    }

    public float getValue() {
        return this.value_;
    }

    public boolean hasAxis() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasValue() {
        return (this.bitField0_ & 2) != 0;
    }

    public static C0111d0 newBuilder(MutationPayload$FontCoordinate mutationPayload$FontCoordinate) {
        return (C0111d0) DEFAULT_INSTANCE.createBuilder(mutationPayload$FontCoordinate);
    }

    public static MutationPayload$FontCoordinate parseDelimitedFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$FontCoordinate) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$FontCoordinate parseFrom(ByteBuffer byteBuffer, h72 h72Var) {
        return (MutationPayload$FontCoordinate) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer, h72Var);
    }

    public static MutationPayload$FontCoordinate parseFrom(ByteString byteString) {
        return (MutationPayload$FontCoordinate) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MutationPayload$FontCoordinate parseFrom(ByteString byteString, h72 h72Var) {
        return (MutationPayload$FontCoordinate) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString, h72Var);
    }

    public static MutationPayload$FontCoordinate parseFrom(byte[] bArr) {
        return (MutationPayload$FontCoordinate) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MutationPayload$FontCoordinate parseFrom(byte[] bArr, h72 h72Var) {
        return (MutationPayload$FontCoordinate) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr, h72Var);
    }

    public static MutationPayload$FontCoordinate parseFrom(InputStream inputStream) {
        return (MutationPayload$FontCoordinate) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$FontCoordinate parseFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$FontCoordinate) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$FontCoordinate parseFrom(lu0 lu0Var) {
        return (MutationPayload$FontCoordinate) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var);
    }

    public static MutationPayload$FontCoordinate parseFrom(lu0 lu0Var, h72 h72Var) {
        return (MutationPayload$FontCoordinate) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var, h72Var);
    }
}
