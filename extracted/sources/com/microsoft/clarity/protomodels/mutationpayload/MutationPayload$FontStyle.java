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
public final class MutationPayload$FontStyle extends com.google.protobuf.o implements fv4 {
    private static final MutationPayload$FontStyle DEFAULT_INSTANCE;
    private static volatile j26 PARSER = null;
    public static final int SLANT_FIELD_NUMBER = 3;
    public static final int WEIGHT_FIELD_NUMBER = 2;
    public static final int WIDTH_FIELD_NUMBER = 1;
    private int bitField0_;
    private double slant_;
    private double weight_;
    private double width_;

    static {
        MutationPayload$FontStyle mutationPayload$FontStyle = new MutationPayload$FontStyle();
        DEFAULT_INSTANCE = mutationPayload$FontStyle;
        com.google.protobuf.o.registerDefaultInstance(MutationPayload$FontStyle.class, mutationPayload$FontStyle);
    }

    private MutationPayload$FontStyle() {
    }

    private void clearSlant() {
        this.bitField0_ &= -5;
        this.slant_ = 0.0d;
    }

    private void clearWeight() {
        this.bitField0_ &= -3;
        this.weight_ = 0.0d;
    }

    private void clearWidth() {
        this.bitField0_ &= -2;
        this.width_ = 0.0d;
    }

    public static MutationPayload$FontStyle getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C0115f0 newBuilder() {
        return (C0115f0) DEFAULT_INSTANCE.createBuilder();
    }

    public static MutationPayload$FontStyle parseDelimitedFrom(InputStream inputStream) {
        return (MutationPayload$FontStyle) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$FontStyle parseFrom(ByteBuffer byteBuffer) {
        return (MutationPayload$FontStyle) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static j26 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSlant(double d) {
        this.bitField0_ |= 4;
        this.slant_ = d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWeight(double d) {
        this.bitField0_ |= 2;
        this.weight_ = d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWidth(double d) {
        this.bitField0_ |= 1;
        this.width_ = d;
    }

    @Override // com.google.protobuf.o
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, Object obj, Object obj2) {
        j26 fr2Var;
        switch (AbstractC0103a.a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new MutationPayload$FontStyle();
            case 2:
                return new C0115f0();
            case 3:
                return com.google.protobuf.o.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001\u0003က\u0002", new Object[]{"bitField0_", "width_", "weight_", "slant_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                j26 j26Var = PARSER;
                if (j26Var != null) {
                    return j26Var;
                }
                synchronized (MutationPayload$FontStyle.class) {
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

    public double getSlant() {
        return this.slant_;
    }

    public double getWeight() {
        return this.weight_;
    }

    public double getWidth() {
        return this.width_;
    }

    public boolean hasSlant() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasWeight() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasWidth() {
        return (this.bitField0_ & 1) != 0;
    }

    public static C0115f0 newBuilder(MutationPayload$FontStyle mutationPayload$FontStyle) {
        return (C0115f0) DEFAULT_INSTANCE.createBuilder(mutationPayload$FontStyle);
    }

    public static MutationPayload$FontStyle parseDelimitedFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$FontStyle) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$FontStyle parseFrom(ByteBuffer byteBuffer, h72 h72Var) {
        return (MutationPayload$FontStyle) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer, h72Var);
    }

    public static MutationPayload$FontStyle parseFrom(ByteString byteString) {
        return (MutationPayload$FontStyle) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MutationPayload$FontStyle parseFrom(ByteString byteString, h72 h72Var) {
        return (MutationPayload$FontStyle) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString, h72Var);
    }

    public static MutationPayload$FontStyle parseFrom(byte[] bArr) {
        return (MutationPayload$FontStyle) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MutationPayload$FontStyle parseFrom(byte[] bArr, h72 h72Var) {
        return (MutationPayload$FontStyle) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr, h72Var);
    }

    public static MutationPayload$FontStyle parseFrom(InputStream inputStream) {
        return (MutationPayload$FontStyle) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$FontStyle parseFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$FontStyle) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$FontStyle parseFrom(lu0 lu0Var) {
        return (MutationPayload$FontStyle) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var);
    }

    public static MutationPayload$FontStyle parseFrom(lu0 lu0Var, h72 h72Var) {
        return (MutationPayload$FontStyle) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var, h72Var);
    }
}
