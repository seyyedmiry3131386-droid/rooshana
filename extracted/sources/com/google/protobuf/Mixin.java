package com.google.protobuf;

import defpackage.fr2;
import defpackage.gw4;
import defpackage.h72;
import defpackage.hw4;
import defpackage.j26;
import defpackage.lu0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class Mixin extends o implements hw4 {
    private static final Mixin DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile j26 PARSER = null;
    public static final int ROOT_FIELD_NUMBER = 2;
    private String name_ = "";
    private String root_ = "";

    static {
        Mixin mixin = new Mixin();
        DEFAULT_INSTANCE = mixin;
        o.registerDefaultInstance(Mixin.class, mixin);
    }

    private Mixin() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoot() {
        this.root_ = getDefaultInstance().getRoot();
    }

    public static Mixin getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static gw4 newBuilder() {
        return (gw4) DEFAULT_INSTANCE.createBuilder();
    }

    public static Mixin parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Mixin) o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Mixin parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Mixin) o.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static j26 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(ByteString byteString) {
        a.checkByteStringIsUtf8(byteString);
        this.name_ = byteString.w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoot(String str) {
        str.getClass();
        this.root_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRootBytes(ByteString byteString) {
        a.checkByteStringIsUtf8(byteString);
        this.root_ = byteString.w();
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
                return o.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"name_", "root_"});
            case 3:
                return new Mixin();
            case 4:
                return new gw4(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                j26 j26Var = PARSER;
                if (j26Var != null) {
                    return j26Var;
                }
                synchronized (Mixin.class) {
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

    public String getName() {
        return this.name_;
    }

    public ByteString getNameBytes() {
        return ByteString.i(this.name_);
    }

    public String getRoot() {
        return this.root_;
    }

    public ByteString getRootBytes() {
        return ByteString.i(this.root_);
    }

    public static gw4 newBuilder(Mixin mixin) {
        return (gw4) DEFAULT_INSTANCE.createBuilder(mixin);
    }

    public static Mixin parseDelimitedFrom(InputStream inputStream, h72 h72Var) throws IOException {
        return (Mixin) o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static Mixin parseFrom(ByteBuffer byteBuffer, h72 h72Var) throws InvalidProtocolBufferException {
        return (Mixin) o.parseFrom(DEFAULT_INSTANCE, byteBuffer, h72Var);
    }

    public static Mixin parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Mixin) o.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Mixin parseFrom(ByteString byteString, h72 h72Var) throws InvalidProtocolBufferException {
        return (Mixin) o.parseFrom(DEFAULT_INSTANCE, byteString, h72Var);
    }

    public static Mixin parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Mixin) o.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Mixin parseFrom(byte[] bArr, h72 h72Var) throws InvalidProtocolBufferException {
        return (Mixin) o.parseFrom(DEFAULT_INSTANCE, bArr, h72Var);
    }

    public static Mixin parseFrom(InputStream inputStream) throws IOException {
        return (Mixin) o.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Mixin parseFrom(InputStream inputStream, h72 h72Var) throws IOException {
        return (Mixin) o.parseFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static Mixin parseFrom(lu0 lu0Var) throws IOException {
        return (Mixin) o.parseFrom(DEFAULT_INSTANCE, lu0Var);
    }

    public static Mixin parseFrom(lu0 lu0Var, h72 h72Var) throws IOException {
        return (Mixin) o.parseFrom(DEFAULT_INSTANCE, lu0Var, h72Var);
    }
}
