package com.microsoft.clarity.protomodels.mutationpayload;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import defpackage.fr2;
import defpackage.fv4;
import defpackage.h72;
import defpackage.j26;
import defpackage.lu0;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class MutationPayload$Locale extends com.google.protobuf.o implements fv4 {
    public static final int COUNTRYCODE_FIELD_NUMBER = 2;
    private static final MutationPayload$Locale DEFAULT_INSTANCE;
    public static final int LANGUAGECODE_FIELD_NUMBER = 1;
    private static volatile j26 PARSER;
    private int bitField0_;
    private String languageCode_ = "";
    private String countryCode_ = "";

    static {
        MutationPayload$Locale mutationPayload$Locale = new MutationPayload$Locale();
        DEFAULT_INSTANCE = mutationPayload$Locale;
        com.google.protobuf.o.registerDefaultInstance(MutationPayload$Locale.class, mutationPayload$Locale);
    }

    private MutationPayload$Locale() {
    }

    private void clearCountryCode() {
        this.bitField0_ &= -3;
        this.countryCode_ = getDefaultInstance().getCountryCode();
    }

    private void clearLanguageCode() {
        this.bitField0_ &= -2;
        this.languageCode_ = getDefaultInstance().getLanguageCode();
    }

    public static MutationPayload$Locale getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C0137q0 newBuilder() {
        return (C0137q0) DEFAULT_INSTANCE.createBuilder();
    }

    public static MutationPayload$Locale parseDelimitedFrom(InputStream inputStream) {
        return (MutationPayload$Locale) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$Locale parseFrom(ByteBuffer byteBuffer) {
        return (MutationPayload$Locale) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static j26 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setCountryCode(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.countryCode_ = str;
    }

    private void setCountryCodeBytes(ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.countryCode_ = byteString.w();
        this.bitField0_ |= 2;
    }

    private void setLanguageCode(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.languageCode_ = str;
    }

    private void setLanguageCodeBytes(ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.languageCode_ = byteString.w();
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.o
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, Object obj, Object obj2) {
        j26 fr2Var;
        switch (AbstractC0103a.a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new MutationPayload$Locale();
            case 2:
                return new C0137q0();
            case 3:
                return com.google.protobuf.o.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001", new Object[]{"bitField0_", "languageCode_", "countryCode_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                j26 j26Var = PARSER;
                if (j26Var != null) {
                    return j26Var;
                }
                synchronized (MutationPayload$Locale.class) {
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
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public String getCountryCode() {
        return this.countryCode_;
    }

    public ByteString getCountryCodeBytes() {
        return ByteString.i(this.countryCode_);
    }

    public String getLanguageCode() {
        return this.languageCode_;
    }

    public ByteString getLanguageCodeBytes() {
        return ByteString.i(this.languageCode_);
    }

    public boolean hasCountryCode() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasLanguageCode() {
        return (this.bitField0_ & 1) != 0;
    }

    public static C0137q0 newBuilder(MutationPayload$Locale mutationPayload$Locale) {
        return (C0137q0) DEFAULT_INSTANCE.createBuilder(mutationPayload$Locale);
    }

    public static MutationPayload$Locale parseDelimitedFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$Locale) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$Locale parseFrom(ByteBuffer byteBuffer, h72 h72Var) {
        return (MutationPayload$Locale) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer, h72Var);
    }

    public static MutationPayload$Locale parseFrom(ByteString byteString) {
        return (MutationPayload$Locale) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MutationPayload$Locale parseFrom(ByteString byteString, h72 h72Var) {
        return (MutationPayload$Locale) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString, h72Var);
    }

    public static MutationPayload$Locale parseFrom(byte[] bArr) {
        return (MutationPayload$Locale) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MutationPayload$Locale parseFrom(byte[] bArr, h72 h72Var) {
        return (MutationPayload$Locale) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr, h72Var);
    }

    public static MutationPayload$Locale parseFrom(InputStream inputStream) {
        return (MutationPayload$Locale) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$Locale parseFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$Locale) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$Locale parseFrom(lu0 lu0Var) {
        return (MutationPayload$Locale) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var);
    }

    public static MutationPayload$Locale parseFrom(lu0 lu0Var, h72 h72Var) {
        return (MutationPayload$Locale) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var, h72Var);
    }
}
