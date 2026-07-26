package com.google.protobuf;

import defpackage.fr2;
import defpackage.fv4;
import defpackage.h72;
import defpackage.j26;
import defpackage.lu0;
import defpackage.w02;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class Empty extends o implements fv4 {
    private static final Empty DEFAULT_INSTANCE;
    private static volatile j26 PARSER;

    static {
        Empty empty = new Empty();
        DEFAULT_INSTANCE = empty;
        o.registerDefaultInstance(Empty.class, empty);
    }

    private Empty() {
    }

    public static Empty getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static w02 newBuilder() {
        return (w02) DEFAULT_INSTANCE.createBuilder();
    }

    public static Empty parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Empty) o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Empty parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Empty) o.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static j26 parser() {
        return DEFAULT_INSTANCE.getParserForType();
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
                return o.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 3:
                return new Empty();
            case 4:
                return new w02(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                j26 j26Var = PARSER;
                if (j26Var != null) {
                    return j26Var;
                }
                synchronized (Empty.class) {
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

    public static w02 newBuilder(Empty empty) {
        return (w02) DEFAULT_INSTANCE.createBuilder(empty);
    }

    public static Empty parseDelimitedFrom(InputStream inputStream, h72 h72Var) throws IOException {
        return (Empty) o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static Empty parseFrom(ByteBuffer byteBuffer, h72 h72Var) throws InvalidProtocolBufferException {
        return (Empty) o.parseFrom(DEFAULT_INSTANCE, byteBuffer, h72Var);
    }

    public static Empty parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Empty) o.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Empty parseFrom(ByteString byteString, h72 h72Var) throws InvalidProtocolBufferException {
        return (Empty) o.parseFrom(DEFAULT_INSTANCE, byteString, h72Var);
    }

    public static Empty parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Empty) o.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Empty parseFrom(byte[] bArr, h72 h72Var) throws InvalidProtocolBufferException {
        return (Empty) o.parseFrom(DEFAULT_INSTANCE, bArr, h72Var);
    }

    public static Empty parseFrom(InputStream inputStream) throws IOException {
        return (Empty) o.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Empty parseFrom(InputStream inputStream, h72 h72Var) throws IOException {
        return (Empty) o.parseFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static Empty parseFrom(lu0 lu0Var) throws IOException {
        return (Empty) o.parseFrom(DEFAULT_INSTANCE, lu0Var);
    }

    public static Empty parseFrom(lu0 lu0Var, h72 h72Var) throws IOException {
        return (Empty) o.parseFrom(DEFAULT_INSTANCE, lu0Var, h72Var);
    }
}
