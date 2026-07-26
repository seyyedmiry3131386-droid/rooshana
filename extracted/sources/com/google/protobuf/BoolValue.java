package com.google.protobuf;

import defpackage.fr2;
import defpackage.fv4;
import defpackage.h72;
import defpackage.j26;
import defpackage.lu0;
import defpackage.zd0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class BoolValue extends o implements fv4 {
    private static final BoolValue DEFAULT_INSTANCE;
    private static volatile j26 PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private boolean value_;

    static {
        BoolValue boolValue = new BoolValue();
        DEFAULT_INSTANCE = boolValue;
        o.registerDefaultInstance(BoolValue.class, boolValue);
    }

    private BoolValue() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = false;
    }

    public static BoolValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static zd0 newBuilder() {
        return (zd0) DEFAULT_INSTANCE.createBuilder();
    }

    public static BoolValue of(boolean z) {
        zd0 zd0VarNewBuilder = newBuilder();
        zd0VarNewBuilder.copyOnWrite();
        ((BoolValue) zd0VarNewBuilder.instance).setValue(z);
        return (BoolValue) zd0VarNewBuilder.build();
    }

    public static BoolValue parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BoolValue) o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BoolValue parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (BoolValue) o.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static j26 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(boolean z) {
        this.value_ = z;
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
                return o.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"value_"});
            case 3:
                return new BoolValue();
            case 4:
                return new zd0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                j26 j26Var = PARSER;
                if (j26Var != null) {
                    return j26Var;
                }
                synchronized (BoolValue.class) {
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

    public boolean getValue() {
        return this.value_;
    }

    public static zd0 newBuilder(BoolValue boolValue) {
        return (zd0) DEFAULT_INSTANCE.createBuilder(boolValue);
    }

    public static BoolValue parseDelimitedFrom(InputStream inputStream, h72 h72Var) throws IOException {
        return (BoolValue) o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static BoolValue parseFrom(ByteBuffer byteBuffer, h72 h72Var) throws InvalidProtocolBufferException {
        return (BoolValue) o.parseFrom(DEFAULT_INSTANCE, byteBuffer, h72Var);
    }

    public static BoolValue parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (BoolValue) o.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static BoolValue parseFrom(ByteString byteString, h72 h72Var) throws InvalidProtocolBufferException {
        return (BoolValue) o.parseFrom(DEFAULT_INSTANCE, byteString, h72Var);
    }

    public static BoolValue parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (BoolValue) o.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static BoolValue parseFrom(byte[] bArr, h72 h72Var) throws InvalidProtocolBufferException {
        return (BoolValue) o.parseFrom(DEFAULT_INSTANCE, bArr, h72Var);
    }

    public static BoolValue parseFrom(InputStream inputStream) throws IOException {
        return (BoolValue) o.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BoolValue parseFrom(InputStream inputStream, h72 h72Var) throws IOException {
        return (BoolValue) o.parseFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static BoolValue parseFrom(lu0 lu0Var) throws IOException {
        return (BoolValue) o.parseFrom(DEFAULT_INSTANCE, lu0Var);
    }

    public static BoolValue parseFrom(lu0 lu0Var, h72 h72Var) throws IOException {
        return (BoolValue) o.parseFrom(DEFAULT_INSTANCE, lu0Var, h72Var);
    }
}
