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
public final class MutationPayload$ColorFilter extends com.google.protobuf.o implements fv4 {
    public static final int COLOR4F_FIELD_NUMBER = 4;
    public static final int COLOR_FIELD_NUMBER = 2;
    private static final MutationPayload$ColorFilter DEFAULT_INSTANCE;
    public static final int IS_RGBA_FIELD_NUMBER = 7;
    public static final int IS_ROW_MAJOR_FIELD_NUMBER = 8;
    public static final int MATRIX_FIELD_NUMBER = 6;
    public static final int MODE_FIELD_NUMBER = 3;
    private static volatile j26 PARSER = null;
    public static final int TYPEENUM_FIELD_NUMBER = 5;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int bitField0_;
    private MutationPayload$Color4f color4F_;
    private double color_;
    private boolean isRgba_;
    private boolean isRowMajor_;
    private MutationPayload$FloatList matrix_;
    private double mode_;
    private int typeOneOfCase_ = 0;
    private Object typeOneOf_;

    static {
        MutationPayload$ColorFilter mutationPayload$ColorFilter = new MutationPayload$ColorFilter();
        DEFAULT_INSTANCE = mutationPayload$ColorFilter;
        com.google.protobuf.o.registerDefaultInstance(MutationPayload$ColorFilter.class, mutationPayload$ColorFilter);
    }

    private MutationPayload$ColorFilter() {
    }

    private void clearColor() {
        this.bitField0_ &= -2;
        this.color_ = 0.0d;
    }

    private void clearColor4F() {
        this.color4F_ = null;
        this.bitField0_ &= -5;
    }

    private void clearIsRgba() {
        this.bitField0_ &= -17;
        this.isRgba_ = false;
    }

    private void clearIsRowMajor() {
        this.bitField0_ &= -33;
        this.isRowMajor_ = false;
    }

    private void clearMatrix() {
        this.matrix_ = null;
        this.bitField0_ &= -9;
    }

    private void clearMode() {
        this.bitField0_ &= -3;
        this.mode_ = 0.0d;
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

    public static MutationPayload$ColorFilter getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeColor4F(MutationPayload$Color4f mutationPayload$Color4f) {
        mutationPayload$Color4f.getClass();
        MutationPayload$Color4f mutationPayload$Color4f2 = this.color4F_;
        if (mutationPayload$Color4f2 == null || mutationPayload$Color4f2 == MutationPayload$Color4f.getDefaultInstance()) {
            this.color4F_ = mutationPayload$Color4f;
        } else {
            this.color4F_ = (MutationPayload$Color4f) ((C0114f) MutationPayload$Color4f.newBuilder(this.color4F_).mergeFrom((com.google.protobuf.o) mutationPayload$Color4f)).buildPartial();
        }
        this.bitField0_ |= 4;
    }

    private void mergeMatrix(MutationPayload$FloatList mutationPayload$FloatList) {
        mutationPayload$FloatList.getClass();
        MutationPayload$FloatList mutationPayload$FloatList2 = this.matrix_;
        if (mutationPayload$FloatList2 == null || mutationPayload$FloatList2 == MutationPayload$FloatList.getDefaultInstance()) {
            this.matrix_ = mutationPayload$FloatList;
        } else {
            this.matrix_ = (MutationPayload$FloatList) ((C0107b0) MutationPayload$FloatList.newBuilder(this.matrix_).mergeFrom((com.google.protobuf.o) mutationPayload$FloatList)).buildPartial();
        }
        this.bitField0_ |= 8;
    }

    public static C0118h newBuilder() {
        return (C0118h) DEFAULT_INSTANCE.createBuilder();
    }

    public static MutationPayload$ColorFilter parseDelimitedFrom(InputStream inputStream) {
        return (MutationPayload$ColorFilter) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$ColorFilter parseFrom(ByteBuffer byteBuffer) {
        return (MutationPayload$ColorFilter) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static j26 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setColor(double d) {
        this.bitField0_ |= 1;
        this.color_ = d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setColor4F(MutationPayload$Color4f mutationPayload$Color4f) {
        mutationPayload$Color4f.getClass();
        this.color4F_ = mutationPayload$Color4f;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsRgba(boolean z) {
        this.bitField0_ |= 16;
        this.isRgba_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsRowMajor(boolean z) {
        this.bitField0_ |= 32;
        this.isRowMajor_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMatrix(MutationPayload$FloatList mutationPayload$FloatList) {
        mutationPayload$FloatList.getClass();
        this.matrix_ = mutationPayload$FloatList;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMode(double d) {
        this.bitField0_ |= 2;
        this.mode_ = d;
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
    public void setTypeEnum(EnumC0122j enumC0122j) {
        this.typeOneOf_ = Integer.valueOf(enumC0122j.getNumber());
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
                return new MutationPayload$ColorFilter();
            case 2:
                return new C0118h();
            case 3:
                return com.google.protobuf.o.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001Ȼ\u0000\u0002က\u0000\u0003က\u0001\u0004ဉ\u0002\u0005?\u0000\u0006ဉ\u0003\u0007ဇ\u0004\bဇ\u0005", new Object[]{"typeOneOf_", "typeOneOfCase_", "bitField0_", "color_", "mode_", "color4F_", "matrix_", "isRgba_", "isRowMajor_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                j26 j26Var = PARSER;
                if (j26Var != null) {
                    return j26Var;
                }
                synchronized (MutationPayload$ColorFilter.class) {
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

    public double getColor() {
        return this.color_;
    }

    public MutationPayload$Color4f getColor4F() {
        MutationPayload$Color4f mutationPayload$Color4f = this.color4F_;
        return mutationPayload$Color4f == null ? MutationPayload$Color4f.getDefaultInstance() : mutationPayload$Color4f;
    }

    public boolean getIsRgba() {
        return this.isRgba_;
    }

    public boolean getIsRowMajor() {
        return this.isRowMajor_;
    }

    public MutationPayload$FloatList getMatrix() {
        MutationPayload$FloatList mutationPayload$FloatList = this.matrix_;
        return mutationPayload$FloatList == null ? MutationPayload$FloatList.getDefaultInstance() : mutationPayload$FloatList;
    }

    public double getMode() {
        return this.mode_;
    }

    @Deprecated
    public String getType() {
        return this.typeOneOfCase_ == 1 ? (String) this.typeOneOf_ : "";
    }

    @Deprecated
    public ByteString getTypeBytes() {
        return ByteString.i(this.typeOneOfCase_ == 1 ? (String) this.typeOneOf_ : "");
    }

    public EnumC0122j getTypeEnum() {
        if (this.typeOneOfCase_ != 5) {
            return EnumC0122j.ModeColorFilter;
        }
        int iIntValue = ((Integer) this.typeOneOf_).intValue();
        EnumC0122j enumC0122j = iIntValue != 0 ? iIntValue != 1 ? null : EnumC0122j.MatrixColorFilter : EnumC0122j.ModeColorFilter;
        return enumC0122j == null ? EnumC0122j.UNRECOGNIZED : enumC0122j;
    }

    public int getTypeEnumValue() {
        if (this.typeOneOfCase_ == 5) {
            return ((Integer) this.typeOneOf_).intValue();
        }
        return 0;
    }

    public EnumC0120i getTypeOneOfCase() {
        int i = this.typeOneOfCase_;
        if (i == 0) {
            return EnumC0120i.TYPEONEOF_NOT_SET;
        }
        if (i == 1) {
            return EnumC0120i.TYPE;
        }
        if (i != 5) {
            return null;
        }
        return EnumC0120i.TYPEENUM;
    }

    public boolean hasColor() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasColor4F() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasIsRgba() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasIsRowMajor() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasMatrix() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasMode() {
        return (this.bitField0_ & 2) != 0;
    }

    @Deprecated
    public boolean hasType() {
        return this.typeOneOfCase_ == 1;
    }

    public boolean hasTypeEnum() {
        return this.typeOneOfCase_ == 5;
    }

    public static C0118h newBuilder(MutationPayload$ColorFilter mutationPayload$ColorFilter) {
        return (C0118h) DEFAULT_INSTANCE.createBuilder(mutationPayload$ColorFilter);
    }

    public static MutationPayload$ColorFilter parseDelimitedFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$ColorFilter) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$ColorFilter parseFrom(ByteBuffer byteBuffer, h72 h72Var) {
        return (MutationPayload$ColorFilter) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer, h72Var);
    }

    public static MutationPayload$ColorFilter parseFrom(ByteString byteString) {
        return (MutationPayload$ColorFilter) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MutationPayload$ColorFilter parseFrom(ByteString byteString, h72 h72Var) {
        return (MutationPayload$ColorFilter) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString, h72Var);
    }

    public static MutationPayload$ColorFilter parseFrom(byte[] bArr) {
        return (MutationPayload$ColorFilter) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MutationPayload$ColorFilter parseFrom(byte[] bArr, h72 h72Var) {
        return (MutationPayload$ColorFilter) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr, h72Var);
    }

    public static MutationPayload$ColorFilter parseFrom(InputStream inputStream) {
        return (MutationPayload$ColorFilter) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$ColorFilter parseFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$ColorFilter) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$ColorFilter parseFrom(lu0 lu0Var) {
        return (MutationPayload$ColorFilter) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var);
    }

    public static MutationPayload$ColorFilter parseFrom(lu0 lu0Var, h72 h72Var) {
        return (MutationPayload$ColorFilter) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var, h72Var);
    }
}
