package com.google.protobuf;

import defpackage.fr2;
import defpackage.fv4;
import defpackage.h72;
import defpackage.j26;
import defpackage.lu0;
import defpackage.wj0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class BytesValue extends o implements fv4 {
    private static final BytesValue DEFAULT_INSTANCE;
    private static volatile j26 PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private ByteString value_ = ByteString.b;

    static {
        BytesValue bytesValue = new BytesValue();
        DEFAULT_INSTANCE = bytesValue;
        o.registerDefaultInstance(BytesValue.class, bytesValue);
    }

    private BytesValue() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = getDefaultInstance().getValue();
    }

    public static BytesValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static wj0 newBuilder() {
        return (wj0) DEFAULT_INSTANCE.createBuilder();
    }

    public static BytesValue of(ByteString byteString) {
        wj0 wj0VarNewBuilder = newBuilder();
        wj0VarNewBuilder.copyOnWrite();
        ((BytesValue) wj0VarNewBuilder.instance).setValue(byteString);
        return (BytesValue) wj0VarNewBuilder.build();
    }

    public static BytesValue parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BytesValue) o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BytesValue parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (BytesValue) o.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static j26 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(ByteString byteString) {
        byteString.getClass();
        this.value_ = byteString;
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
                return o.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"value_"});
            case 3:
                return new BytesValue();
            case 4:
                return new wj0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                j26 j26Var = PARSER;
                if (j26Var != null) {
                    return j26Var;
                }
                synchronized (BytesValue.class) {
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

    public ByteString getValue() {
        return this.value_;
    }

    public static wj0 newBuilder(BytesValue bytesValue) {
        return (wj0) DEFAULT_INSTANCE.createBuilder(bytesValue);
    }

    public static BytesValue parseDelimitedFrom(InputStream inputStream, h72 h72Var) throws IOException {
        return (BytesValue) o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static BytesValue parseFrom(ByteBuffer byteBuffer, h72 h72Var) throws InvalidProtocolBufferException {
        return (BytesValue) o.parseFrom(DEFAULT_INSTANCE, byteBuffer, h72Var);
    }

    public static BytesValue parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (BytesValue) o.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static BytesValue parseFrom(ByteString byteString, h72 h72Var) throws InvalidProtocolBufferException {
        return (BytesValue) o.parseFrom(DEFAULT_INSTANCE, byteString, h72Var);
    }

    public static BytesValue parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (BytesValue) o.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static BytesValue parseFrom(byte[] bArr, h72 h72Var) throws InvalidProtocolBufferException {
        return (BytesValue) o.parseFrom(DEFAULT_INSTANCE, bArr, h72Var);
    }

    public static BytesValue parseFrom(InputStream inputStream) throws IOException {
        return (BytesValue) o.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BytesValue parseFrom(InputStream inputStream, h72 h72Var) throws IOException {
        return (BytesValue) o.parseFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static BytesValue parseFrom(lu0 lu0Var) throws IOException {
        return (BytesValue) o.parseFrom(DEFAULT_INSTANCE, lu0Var);
    }

    public static BytesValue parseFrom(lu0 lu0Var, h72 h72Var) throws IOException {
        return (BytesValue) o.parseFrom(DEFAULT_INSTANCE, lu0Var, h72Var);
    }
}
