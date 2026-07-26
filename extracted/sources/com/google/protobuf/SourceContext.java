package com.google.protobuf;

import defpackage.fr2;
import defpackage.fv4;
import defpackage.h72;
import defpackage.j26;
import defpackage.lu0;
import defpackage.u18;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class SourceContext extends o implements fv4 {
    private static final SourceContext DEFAULT_INSTANCE;
    public static final int FILE_NAME_FIELD_NUMBER = 1;
    private static volatile j26 PARSER;
    private String fileName_ = "";

    static {
        SourceContext sourceContext = new SourceContext();
        DEFAULT_INSTANCE = sourceContext;
        o.registerDefaultInstance(SourceContext.class, sourceContext);
    }

    private SourceContext() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFileName() {
        this.fileName_ = getDefaultInstance().getFileName();
    }

    public static SourceContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static u18 newBuilder() {
        return (u18) DEFAULT_INSTANCE.createBuilder();
    }

    public static SourceContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SourceContext) o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SourceContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SourceContext) o.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static j26 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFileName(String str) {
        str.getClass();
        this.fileName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFileNameBytes(ByteString byteString) {
        a.checkByteStringIsUtf8(byteString);
        this.fileName_ = byteString.w();
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
                return o.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"fileName_"});
            case 3:
                return new SourceContext();
            case 4:
                return new u18(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                j26 j26Var = PARSER;
                if (j26Var != null) {
                    return j26Var;
                }
                synchronized (SourceContext.class) {
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

    public String getFileName() {
        return this.fileName_;
    }

    public ByteString getFileNameBytes() {
        return ByteString.i(this.fileName_);
    }

    public static u18 newBuilder(SourceContext sourceContext) {
        return (u18) DEFAULT_INSTANCE.createBuilder(sourceContext);
    }

    public static SourceContext parseDelimitedFrom(InputStream inputStream, h72 h72Var) throws IOException {
        return (SourceContext) o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static SourceContext parseFrom(ByteBuffer byteBuffer, h72 h72Var) throws InvalidProtocolBufferException {
        return (SourceContext) o.parseFrom(DEFAULT_INSTANCE, byteBuffer, h72Var);
    }

    public static SourceContext parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SourceContext) o.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static SourceContext parseFrom(ByteString byteString, h72 h72Var) throws InvalidProtocolBufferException {
        return (SourceContext) o.parseFrom(DEFAULT_INSTANCE, byteString, h72Var);
    }

    public static SourceContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SourceContext) o.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SourceContext parseFrom(byte[] bArr, h72 h72Var) throws InvalidProtocolBufferException {
        return (SourceContext) o.parseFrom(DEFAULT_INSTANCE, bArr, h72Var);
    }

    public static SourceContext parseFrom(InputStream inputStream) throws IOException {
        return (SourceContext) o.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SourceContext parseFrom(InputStream inputStream, h72 h72Var) throws IOException {
        return (SourceContext) o.parseFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static SourceContext parseFrom(lu0 lu0Var) throws IOException {
        return (SourceContext) o.parseFrom(DEFAULT_INSTANCE, lu0Var);
    }

    public static SourceContext parseFrom(lu0 lu0Var, h72 h72Var) throws IOException {
        return (SourceContext) o.parseFrom(DEFAULT_INSTANCE, lu0Var, h72Var);
    }
}
