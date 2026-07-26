package com.google.protobuf;

import defpackage.fr2;
import defpackage.fv4;
import defpackage.h72;
import defpackage.j26;
import defpackage.lu0;
import defpackage.ol;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class Any extends o implements fv4 {
    private static final Any DEFAULT_INSTANCE;
    private static volatile j26 PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private String typeUrl_ = "";
    private ByteString value_ = ByteString.b;

    static {
        Any any = new Any();
        DEFAULT_INSTANCE = any;
        o.registerDefaultInstance(Any.class, any);
    }

    private Any() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTypeUrl() {
        this.typeUrl_ = getDefaultInstance().getTypeUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = getDefaultInstance().getValue();
    }

    public static Any getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ol newBuilder() {
        return (ol) DEFAULT_INSTANCE.createBuilder();
    }

    public static Any parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Any) o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Any parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Any) o.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static j26 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeUrl(String str) {
        str.getClass();
        this.typeUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeUrlBytes(ByteString byteString) {
        a.checkByteStringIsUtf8(byteString);
        this.typeUrl_ = byteString.w();
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
                return o.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\n", new Object[]{"typeUrl_", "value_"});
            case 3:
                return new Any();
            case 4:
                return new ol(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                j26 j26Var = PARSER;
                if (j26Var != null) {
                    return j26Var;
                }
                synchronized (Any.class) {
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

    public String getTypeUrl() {
        return this.typeUrl_;
    }

    public ByteString getTypeUrlBytes() {
        return ByteString.i(this.typeUrl_);
    }

    public ByteString getValue() {
        return this.value_;
    }

    public static ol newBuilder(Any any) {
        return (ol) DEFAULT_INSTANCE.createBuilder(any);
    }

    public static Any parseDelimitedFrom(InputStream inputStream, h72 h72Var) throws IOException {
        return (Any) o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static Any parseFrom(ByteBuffer byteBuffer, h72 h72Var) throws InvalidProtocolBufferException {
        return (Any) o.parseFrom(DEFAULT_INSTANCE, byteBuffer, h72Var);
    }

    public static Any parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Any) o.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Any parseFrom(ByteString byteString, h72 h72Var) throws InvalidProtocolBufferException {
        return (Any) o.parseFrom(DEFAULT_INSTANCE, byteString, h72Var);
    }

    public static Any parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Any) o.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Any parseFrom(byte[] bArr, h72 h72Var) throws InvalidProtocolBufferException {
        return (Any) o.parseFrom(DEFAULT_INSTANCE, bArr, h72Var);
    }

    public static Any parseFrom(InputStream inputStream) throws IOException {
        return (Any) o.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Any parseFrom(InputStream inputStream, h72 h72Var) throws IOException {
        return (Any) o.parseFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static Any parseFrom(lu0 lu0Var) throws IOException {
        return (Any) o.parseFrom(DEFAULT_INSTANCE, lu0Var);
    }

    public static Any parseFrom(lu0 lu0Var, h72 h72Var) throws IOException {
        return (Any) o.parseFrom(DEFAULT_INSTANCE, lu0Var, h72Var);
    }
}
