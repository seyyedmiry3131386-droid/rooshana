package com.google.protobuf;

import defpackage.fr2;
import defpackage.fv4;
import defpackage.h72;
import defpackage.j26;
import defpackage.lu0;
import defpackage.ne2;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class FloatValue extends o implements fv4 {
    private static final FloatValue DEFAULT_INSTANCE;
    private static volatile j26 PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private float value_;

    static {
        FloatValue floatValue = new FloatValue();
        DEFAULT_INSTANCE = floatValue;
        o.registerDefaultInstance(FloatValue.class, floatValue);
    }

    private FloatValue() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = 0.0f;
    }

    public static FloatValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ne2 newBuilder() {
        return (ne2) DEFAULT_INSTANCE.createBuilder();
    }

    public static FloatValue of(float f) {
        ne2 ne2VarNewBuilder = newBuilder();
        ne2VarNewBuilder.copyOnWrite();
        ((FloatValue) ne2VarNewBuilder.instance).setValue(f);
        return (FloatValue) ne2VarNewBuilder.build();
    }

    public static FloatValue parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FloatValue) o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FloatValue parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FloatValue) o.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static j26 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(float f) {
        this.value_ = f;
    }

    @Override // com.google.protobuf.o
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, Object obj, Object obj2) {
        j26 fr2Var;
        switch (generatedMessageLite$MethodToInvoke.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return o.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001", new Object[]{"value_"});
            case 3:
                return new FloatValue();
            case 4:
                return new ne2(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                j26 j26Var = PARSER;
                if (j26Var != null) {
                    return j26Var;
                }
                synchronized (FloatValue.class) {
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
            default:
                throw new UnsupportedOperationException();
        }
    }

    public float getValue() {
        return this.value_;
    }

    public static ne2 newBuilder(FloatValue floatValue) {
        return (ne2) DEFAULT_INSTANCE.createBuilder(floatValue);
    }

    public static FloatValue parseDelimitedFrom(InputStream inputStream, h72 h72Var) throws IOException {
        return (FloatValue) o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static FloatValue parseFrom(ByteBuffer byteBuffer, h72 h72Var) throws InvalidProtocolBufferException {
        return (FloatValue) o.parseFrom(DEFAULT_INSTANCE, byteBuffer, h72Var);
    }

    public static FloatValue parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FloatValue) o.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FloatValue parseFrom(ByteString byteString, h72 h72Var) throws InvalidProtocolBufferException {
        return (FloatValue) o.parseFrom(DEFAULT_INSTANCE, byteString, h72Var);
    }

    public static FloatValue parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FloatValue) o.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FloatValue parseFrom(byte[] bArr, h72 h72Var) throws InvalidProtocolBufferException {
        return (FloatValue) o.parseFrom(DEFAULT_INSTANCE, bArr, h72Var);
    }

    public static FloatValue parseFrom(InputStream inputStream) throws IOException {
        return (FloatValue) o.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FloatValue parseFrom(InputStream inputStream, h72 h72Var) throws IOException {
        return (FloatValue) o.parseFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static FloatValue parseFrom(lu0 lu0Var) throws IOException {
        return (FloatValue) o.parseFrom(DEFAULT_INSTANCE, lu0Var);
    }

    public static FloatValue parseFrom(lu0 lu0Var, h72 h72Var) throws IOException {
        return (FloatValue) o.parseFrom(DEFAULT_INSTANCE, lu0Var, h72Var);
    }
}
