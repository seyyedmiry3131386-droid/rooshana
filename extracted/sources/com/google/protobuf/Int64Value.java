package com.google.protobuf;

import defpackage.fq3;
import defpackage.fr2;
import defpackage.fv4;
import defpackage.h72;
import defpackage.j26;
import defpackage.lu0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class Int64Value extends o implements fv4 {
    private static final Int64Value DEFAULT_INSTANCE;
    private static volatile j26 PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private long value_;

    static {
        Int64Value int64Value = new Int64Value();
        DEFAULT_INSTANCE = int64Value;
        o.registerDefaultInstance(Int64Value.class, int64Value);
    }

    private Int64Value() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = 0L;
    }

    public static Int64Value getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static fq3 newBuilder() {
        return (fq3) DEFAULT_INSTANCE.createBuilder();
    }

    public static Int64Value of(long j) {
        fq3 fq3VarNewBuilder = newBuilder();
        fq3VarNewBuilder.copyOnWrite();
        ((Int64Value) fq3VarNewBuilder.instance).setValue(j);
        return (Int64Value) fq3VarNewBuilder.build();
    }

    public static Int64Value parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Int64Value) o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Int64Value parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Int64Value) o.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static j26 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(long j) {
        this.value_ = j;
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
                return o.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", new Object[]{"value_"});
            case 3:
                return new Int64Value();
            case 4:
                return new fq3(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                j26 j26Var = PARSER;
                if (j26Var != null) {
                    return j26Var;
                }
                synchronized (Int64Value.class) {
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

    public long getValue() {
        return this.value_;
    }

    public static fq3 newBuilder(Int64Value int64Value) {
        return (fq3) DEFAULT_INSTANCE.createBuilder(int64Value);
    }

    public static Int64Value parseDelimitedFrom(InputStream inputStream, h72 h72Var) throws IOException {
        return (Int64Value) o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static Int64Value parseFrom(ByteBuffer byteBuffer, h72 h72Var) throws InvalidProtocolBufferException {
        return (Int64Value) o.parseFrom(DEFAULT_INSTANCE, byteBuffer, h72Var);
    }

    public static Int64Value parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Int64Value) o.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Int64Value parseFrom(ByteString byteString, h72 h72Var) throws InvalidProtocolBufferException {
        return (Int64Value) o.parseFrom(DEFAULT_INSTANCE, byteString, h72Var);
    }

    public static Int64Value parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Int64Value) o.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Int64Value parseFrom(byte[] bArr, h72 h72Var) throws InvalidProtocolBufferException {
        return (Int64Value) o.parseFrom(DEFAULT_INSTANCE, bArr, h72Var);
    }

    public static Int64Value parseFrom(InputStream inputStream) throws IOException {
        return (Int64Value) o.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Int64Value parseFrom(InputStream inputStream, h72 h72Var) throws IOException {
        return (Int64Value) o.parseFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static Int64Value parseFrom(lu0 lu0Var) throws IOException {
        return (Int64Value) o.parseFrom(DEFAULT_INSTANCE, lu0Var);
    }

    public static Int64Value parseFrom(lu0 lu0Var, h72 h72Var) throws IOException {
        return (Int64Value) o.parseFrom(DEFAULT_INSTANCE, lu0Var, h72Var);
    }
}
