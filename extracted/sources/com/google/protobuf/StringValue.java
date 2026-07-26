package com.google.protobuf;

import defpackage.d88;
import defpackage.fr2;
import defpackage.fv4;
import defpackage.h72;
import defpackage.j26;
import defpackage.lu0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class StringValue extends o implements fv4 {
    private static final StringValue DEFAULT_INSTANCE;
    private static volatile j26 PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private String value_ = "";

    static {
        StringValue stringValue = new StringValue();
        DEFAULT_INSTANCE = stringValue;
        o.registerDefaultInstance(StringValue.class, stringValue);
    }

    private StringValue() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = getDefaultInstance().getValue();
    }

    public static StringValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static d88 newBuilder() {
        return (d88) DEFAULT_INSTANCE.createBuilder();
    }

    public static StringValue of(String str) {
        d88 d88VarNewBuilder = newBuilder();
        d88VarNewBuilder.copyOnWrite();
        ((StringValue) d88VarNewBuilder.instance).setValue(str);
        return (StringValue) d88VarNewBuilder.build();
    }

    public static StringValue parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (StringValue) o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static StringValue parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (StringValue) o.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static j26 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(String str) {
        str.getClass();
        this.value_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValueBytes(ByteString byteString) {
        a.checkByteStringIsUtf8(byteString);
        this.value_ = byteString.w();
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
                return o.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"value_"});
            case 3:
                return new StringValue();
            case 4:
                return new d88(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                j26 j26Var = PARSER;
                if (j26Var != null) {
                    return j26Var;
                }
                synchronized (StringValue.class) {
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

    public String getValue() {
        return this.value_;
    }

    public ByteString getValueBytes() {
        return ByteString.i(this.value_);
    }

    public static d88 newBuilder(StringValue stringValue) {
        return (d88) DEFAULT_INSTANCE.createBuilder(stringValue);
    }

    public static StringValue parseDelimitedFrom(InputStream inputStream, h72 h72Var) throws IOException {
        return (StringValue) o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static StringValue parseFrom(ByteBuffer byteBuffer, h72 h72Var) throws InvalidProtocolBufferException {
        return (StringValue) o.parseFrom(DEFAULT_INSTANCE, byteBuffer, h72Var);
    }

    public static StringValue parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (StringValue) o.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static StringValue parseFrom(ByteString byteString, h72 h72Var) throws InvalidProtocolBufferException {
        return (StringValue) o.parseFrom(DEFAULT_INSTANCE, byteString, h72Var);
    }

    public static StringValue parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (StringValue) o.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static StringValue parseFrom(byte[] bArr, h72 h72Var) throws InvalidProtocolBufferException {
        return (StringValue) o.parseFrom(DEFAULT_INSTANCE, bArr, h72Var);
    }

    public static StringValue parseFrom(InputStream inputStream) throws IOException {
        return (StringValue) o.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static StringValue parseFrom(InputStream inputStream, h72 h72Var) throws IOException {
        return (StringValue) o.parseFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static StringValue parseFrom(lu0 lu0Var) throws IOException {
        return (StringValue) o.parseFrom(DEFAULT_INSTANCE, lu0Var);
    }

    public static StringValue parseFrom(lu0 lu0Var, h72 h72Var) throws IOException {
        return (StringValue) o.parseFrom(DEFAULT_INSTANCE, lu0Var, h72Var);
    }
}
