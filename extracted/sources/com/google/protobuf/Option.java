package com.google.protobuf;

import defpackage.fr2;
import defpackage.h72;
import defpackage.j26;
import defpackage.lu0;
import defpackage.nv5;
import defpackage.ol;
import defpackage.qv5;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class Option extends o implements qv5 {
    private static final Option DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile j26 PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int bitField0_;
    private String name_ = "";
    private Any value_;

    static {
        Option option = new Option();
        DEFAULT_INSTANCE = option;
        o.registerDefaultInstance(Option.class, option);
    }

    private Option() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = null;
        this.bitField0_ &= -2;
    }

    public static Option getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeValue(Any any) {
        any.getClass();
        Any any2 = this.value_;
        if (any2 == null || any2 == Any.getDefaultInstance()) {
            this.value_ = any;
        } else {
            this.value_ = (Any) ((ol) Any.newBuilder(this.value_).mergeFrom((o) any)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static nv5 newBuilder() {
        return (nv5) DEFAULT_INSTANCE.createBuilder();
    }

    public static Option parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Option) o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Option parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Option) o.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
    public void setValue(Any any) {
        any.getClass();
        this.value_ = any;
        this.bitField0_ |= 1;
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
                return o.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "name_", "value_"});
            case 3:
                return new Option();
            case 4:
                return new nv5(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                j26 j26Var = PARSER;
                if (j26Var != null) {
                    return j26Var;
                }
                synchronized (Option.class) {
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

    public Any getValue() {
        Any any = this.value_;
        return any == null ? Any.getDefaultInstance() : any;
    }

    public boolean hasValue() {
        return (this.bitField0_ & 1) != 0;
    }

    public static nv5 newBuilder(Option option) {
        return (nv5) DEFAULT_INSTANCE.createBuilder(option);
    }

    public static Option parseDelimitedFrom(InputStream inputStream, h72 h72Var) throws IOException {
        return (Option) o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static Option parseFrom(ByteBuffer byteBuffer, h72 h72Var) throws InvalidProtocolBufferException {
        return (Option) o.parseFrom(DEFAULT_INSTANCE, byteBuffer, h72Var);
    }

    public static Option parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Option) o.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Option parseFrom(ByteString byteString, h72 h72Var) throws InvalidProtocolBufferException {
        return (Option) o.parseFrom(DEFAULT_INSTANCE, byteString, h72Var);
    }

    public static Option parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Option) o.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Option parseFrom(byte[] bArr, h72 h72Var) throws InvalidProtocolBufferException {
        return (Option) o.parseFrom(DEFAULT_INSTANCE, bArr, h72Var);
    }

    public static Option parseFrom(InputStream inputStream) throws IOException {
        return (Option) o.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Option parseFrom(InputStream inputStream, h72 h72Var) throws IOException {
        return (Option) o.parseFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static Option parseFrom(lu0 lu0Var) throws IOException {
        return (Option) o.parseFrom(DEFAULT_INSTANCE, lu0Var);
    }

    public static Option parseFrom(lu0 lu0Var, h72 h72Var) throws IOException {
        return (Option) o.parseFrom(DEFAULT_INSTANCE, lu0Var, h72Var);
    }
}
