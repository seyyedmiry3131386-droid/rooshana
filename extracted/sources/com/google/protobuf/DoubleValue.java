package com.google.protobuf;

import defpackage.fr2;
import defpackage.fv4;
import defpackage.h72;
import defpackage.j26;
import defpackage.lr1;
import defpackage.lu0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class DoubleValue extends o implements fv4 {
    private static final DoubleValue DEFAULT_INSTANCE;
    private static volatile j26 PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private double value_;

    static {
        DoubleValue doubleValue = new DoubleValue();
        DEFAULT_INSTANCE = doubleValue;
        o.registerDefaultInstance(DoubleValue.class, doubleValue);
    }

    private DoubleValue() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = 0.0d;
    }

    public static DoubleValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static lr1 newBuilder() {
        return (lr1) DEFAULT_INSTANCE.createBuilder();
    }

    public static DoubleValue of(double d) {
        lr1 lr1VarNewBuilder = newBuilder();
        lr1VarNewBuilder.copyOnWrite();
        ((DoubleValue) lr1VarNewBuilder.instance).setValue(d);
        return (DoubleValue) lr1VarNewBuilder.build();
    }

    public static DoubleValue parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DoubleValue) o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DoubleValue parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DoubleValue) o.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static j26 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(double d) {
        this.value_ = d;
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
                return o.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000", new Object[]{"value_"});
            case 3:
                return new DoubleValue();
            case 4:
                return new lr1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                j26 j26Var = PARSER;
                if (j26Var != null) {
                    return j26Var;
                }
                synchronized (DoubleValue.class) {
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

    public double getValue() {
        return this.value_;
    }

    public static lr1 newBuilder(DoubleValue doubleValue) {
        return (lr1) DEFAULT_INSTANCE.createBuilder(doubleValue);
    }

    public static DoubleValue parseDelimitedFrom(InputStream inputStream, h72 h72Var) throws IOException {
        return (DoubleValue) o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static DoubleValue parseFrom(ByteBuffer byteBuffer, h72 h72Var) throws InvalidProtocolBufferException {
        return (DoubleValue) o.parseFrom(DEFAULT_INSTANCE, byteBuffer, h72Var);
    }

    public static DoubleValue parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DoubleValue) o.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static DoubleValue parseFrom(ByteString byteString, h72 h72Var) throws InvalidProtocolBufferException {
        return (DoubleValue) o.parseFrom(DEFAULT_INSTANCE, byteString, h72Var);
    }

    public static DoubleValue parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DoubleValue) o.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DoubleValue parseFrom(byte[] bArr, h72 h72Var) throws InvalidProtocolBufferException {
        return (DoubleValue) o.parseFrom(DEFAULT_INSTANCE, bArr, h72Var);
    }

    public static DoubleValue parseFrom(InputStream inputStream) throws IOException {
        return (DoubleValue) o.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DoubleValue parseFrom(InputStream inputStream, h72 h72Var) throws IOException {
        return (DoubleValue) o.parseFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static DoubleValue parseFrom(lu0 lu0Var) throws IOException {
        return (DoubleValue) o.parseFrom(DEFAULT_INSTANCE, lu0Var);
    }

    public static DoubleValue parseFrom(lu0 lu0Var, h72 h72Var) throws IOException {
        return (DoubleValue) o.parseFrom(DEFAULT_INSTANCE, lu0Var, h72Var);
    }
}
