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
public final class MutationPayload$MaskFilter extends com.google.protobuf.o implements fv4 {
    private static final MutationPayload$MaskFilter DEFAULT_INSTANCE;
    private static volatile j26 PARSER = null;
    public static final int RESPECT_C_T_M_FIELD_NUMBER = 4;
    public static final int SIGMA_FIELD_NUMBER = 2;
    public static final int STYLE_FIELD_NUMBER = 3;
    public static final int TYPEENUM_FIELD_NUMBER = 5;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int bitField0_;
    private boolean respectCTM_;
    private float sigma_;
    private int style_;
    private int typeOneOfCase_ = 0;
    private Object typeOneOf_;

    static {
        MutationPayload$MaskFilter mutationPayload$MaskFilter = new MutationPayload$MaskFilter();
        DEFAULT_INSTANCE = mutationPayload$MaskFilter;
        com.google.protobuf.o.registerDefaultInstance(MutationPayload$MaskFilter.class, mutationPayload$MaskFilter);
    }

    private MutationPayload$MaskFilter() {
    }

    private void clearRespectCTM() {
        this.bitField0_ &= -5;
        this.respectCTM_ = false;
    }

    private void clearSigma() {
        this.bitField0_ &= -2;
        this.sigma_ = 0.0f;
    }

    private void clearStyle() {
        this.bitField0_ &= -3;
        this.style_ = 0;
    }

    private void clearType() {
        if (this.typeOneOfCase_ == 1) {
            this.typeOneOfCase_ = 0;
            this.typeOneOf_ = null;
        }
    }

    private void clearTypeEnum() {
        if (this.typeOneOfCase_ == 5) {
            this.typeOneOfCase_ = 0;
            this.typeOneOf_ = null;
        }
    }

    private void clearTypeOneOf() {
        this.typeOneOfCase_ = 0;
        this.typeOneOf_ = null;
    }

    public static MutationPayload$MaskFilter getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C0144u0 newBuilder() {
        return (C0144u0) DEFAULT_INSTANCE.createBuilder();
    }

    public static MutationPayload$MaskFilter parseDelimitedFrom(InputStream inputStream) {
        return (MutationPayload$MaskFilter) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$MaskFilter parseFrom(ByteBuffer byteBuffer) {
        return (MutationPayload$MaskFilter) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static j26 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRespectCTM(boolean z) {
        this.bitField0_ |= 4;
        this.respectCTM_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSigma(float f) {
        this.bitField0_ |= 1;
        this.sigma_ = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStyle(int i) {
        this.bitField0_ |= 2;
        this.style_ = i;
    }

    private void setType(String str) {
        str.getClass();
        this.typeOneOfCase_ = 1;
        this.typeOneOf_ = str;
    }

    private void setTypeBytes(ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.typeOneOf_ = byteString.w();
        this.typeOneOfCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeEnum(EnumC0148w0 enumC0148w0) {
        this.typeOneOf_ = Integer.valueOf(enumC0148w0.getNumber());
        this.typeOneOfCase_ = 5;
    }

    private void setTypeEnumValue(int i) {
        this.typeOneOfCase_ = 5;
        this.typeOneOf_ = Integer.valueOf(i);
    }

    @Override // com.google.protobuf.o
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, Object obj, Object obj2) {
        j26 fr2Var;
        switch (AbstractC0103a.a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new MutationPayload$MaskFilter();
            case 2:
                return new C0144u0();
            case 3:
                return com.google.protobuf.o.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȼ\u0000\u0002ခ\u0000\u0003င\u0001\u0004ဇ\u0002\u0005?\u0000", new Object[]{"typeOneOf_", "typeOneOfCase_", "bitField0_", "sigma_", "style_", "respectCTM_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                j26 j26Var = PARSER;
                if (j26Var != null) {
                    return j26Var;
                }
                synchronized (MutationPayload$MaskFilter.class) {
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

    public boolean getRespectCTM() {
        return this.respectCTM_;
    }

    public float getSigma() {
        return this.sigma_;
    }

    public int getStyle() {
        return this.style_;
    }

    @Deprecated
    public String getType() {
        return this.typeOneOfCase_ == 1 ? (String) this.typeOneOf_ : "";
    }

    @Deprecated
    public ByteString getTypeBytes() {
        return ByteString.i(this.typeOneOfCase_ == 1 ? (String) this.typeOneOf_ : "");
    }

    public EnumC0148w0 getTypeEnum() {
        if (this.typeOneOfCase_ != 5) {
            return EnumC0148w0.BlurMaskFilter;
        }
        EnumC0148w0 enumC0148w0 = ((Integer) this.typeOneOf_).intValue() != 0 ? null : EnumC0148w0.BlurMaskFilter;
        return enumC0148w0 == null ? EnumC0148w0.UNRECOGNIZED : enumC0148w0;
    }

    public int getTypeEnumValue() {
        if (this.typeOneOfCase_ == 5) {
            return ((Integer) this.typeOneOf_).intValue();
        }
        return 0;
    }

    public EnumC0146v0 getTypeOneOfCase() {
        int i = this.typeOneOfCase_;
        if (i == 0) {
            return EnumC0146v0.TYPEONEOF_NOT_SET;
        }
        if (i == 1) {
            return EnumC0146v0.TYPE;
        }
        if (i != 5) {
            return null;
        }
        return EnumC0146v0.TYPEENUM;
    }

    public boolean hasRespectCTM() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasSigma() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasStyle() {
        return (this.bitField0_ & 2) != 0;
    }

    @Deprecated
    public boolean hasType() {
        return this.typeOneOfCase_ == 1;
    }

    public boolean hasTypeEnum() {
        return this.typeOneOfCase_ == 5;
    }

    public static C0144u0 newBuilder(MutationPayload$MaskFilter mutationPayload$MaskFilter) {
        return (C0144u0) DEFAULT_INSTANCE.createBuilder(mutationPayload$MaskFilter);
    }

    public static MutationPayload$MaskFilter parseDelimitedFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$MaskFilter) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$MaskFilter parseFrom(ByteBuffer byteBuffer, h72 h72Var) {
        return (MutationPayload$MaskFilter) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer, h72Var);
    }

    public static MutationPayload$MaskFilter parseFrom(ByteString byteString) {
        return (MutationPayload$MaskFilter) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MutationPayload$MaskFilter parseFrom(ByteString byteString, h72 h72Var) {
        return (MutationPayload$MaskFilter) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString, h72Var);
    }

    public static MutationPayload$MaskFilter parseFrom(byte[] bArr) {
        return (MutationPayload$MaskFilter) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MutationPayload$MaskFilter parseFrom(byte[] bArr, h72 h72Var) {
        return (MutationPayload$MaskFilter) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr, h72Var);
    }

    public static MutationPayload$MaskFilter parseFrom(InputStream inputStream) {
        return (MutationPayload$MaskFilter) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$MaskFilter parseFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$MaskFilter) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$MaskFilter parseFrom(lu0 lu0Var) {
        return (MutationPayload$MaskFilter) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var);
    }

    public static MutationPayload$MaskFilter parseFrom(lu0 lu0Var, h72 h72Var) {
        return (MutationPayload$MaskFilter) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var, h72Var);
    }
}
