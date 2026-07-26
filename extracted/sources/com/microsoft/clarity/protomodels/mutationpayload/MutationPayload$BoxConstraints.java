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
public final class MutationPayload$BoxConstraints extends com.google.protobuf.o implements fv4 {
    private static final MutationPayload$BoxConstraints DEFAULT_INSTANCE;
    public static final int MAXHEIGHT_FIELD_NUMBER = 4;
    public static final int MAXWIDTH_FIELD_NUMBER = 2;
    public static final int MINHEIGHT_FIELD_NUMBER = 3;
    public static final int MINWIDTH_FIELD_NUMBER = 1;
    private static volatile j26 PARSER;
    private int bitField0_;
    private double maxHeight_;
    private double maxWidth_;
    private double minHeight_;
    private double minWidth_;

    static {
        MutationPayload$BoxConstraints mutationPayload$BoxConstraints = new MutationPayload$BoxConstraints();
        DEFAULT_INSTANCE = mutationPayload$BoxConstraints;
        com.google.protobuf.o.registerDefaultInstance(MutationPayload$BoxConstraints.class, mutationPayload$BoxConstraints);
    }

    private MutationPayload$BoxConstraints() {
    }

    private void clearMaxHeight() {
        this.bitField0_ &= -9;
        this.maxHeight_ = 0.0d;
    }

    private void clearMaxWidth() {
        this.bitField0_ &= -3;
        this.maxWidth_ = 0.0d;
    }

    private void clearMinHeight() {
        this.bitField0_ &= -5;
        this.minHeight_ = 0.0d;
    }

    private void clearMinWidth() {
        this.bitField0_ &= -2;
        this.minWidth_ = 0.0d;
    }

    public static MutationPayload$BoxConstraints getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C0106b newBuilder() {
        return (C0106b) DEFAULT_INSTANCE.createBuilder();
    }

    public static MutationPayload$BoxConstraints parseDelimitedFrom(InputStream inputStream) {
        return (MutationPayload$BoxConstraints) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$BoxConstraints parseFrom(ByteBuffer byteBuffer) {
        return (MutationPayload$BoxConstraints) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static j26 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setMaxHeight(double d) {
        this.bitField0_ |= 8;
        this.maxHeight_ = d;
    }

    private void setMaxWidth(double d) {
        this.bitField0_ |= 2;
        this.maxWidth_ = d;
    }

    private void setMinHeight(double d) {
        this.bitField0_ |= 4;
        this.minHeight_ = d;
    }

    private void setMinWidth(double d) {
        this.bitField0_ |= 1;
        this.minWidth_ = d;
    }

    @Override // com.google.protobuf.o
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, Object obj, Object obj2) {
        j26 fr2Var;
        switch (AbstractC0103a.a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new MutationPayload$BoxConstraints();
            case 2:
                return new C0106b();
            case 3:
                return com.google.protobuf.o.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001\u0003က\u0002\u0004က\u0003", new Object[]{"bitField0_", "minWidth_", "maxWidth_", "minHeight_", "maxHeight_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                j26 j26Var = PARSER;
                if (j26Var != null) {
                    return j26Var;
                }
                synchronized (MutationPayload$BoxConstraints.class) {
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

    public double getMaxHeight() {
        return this.maxHeight_;
    }

    public double getMaxWidth() {
        return this.maxWidth_;
    }

    public double getMinHeight() {
        return this.minHeight_;
    }

    public double getMinWidth() {
        return this.minWidth_;
    }

    public boolean hasMaxHeight() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasMaxWidth() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasMinHeight() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasMinWidth() {
        return (this.bitField0_ & 1) != 0;
    }

    public static C0106b newBuilder(MutationPayload$BoxConstraints mutationPayload$BoxConstraints) {
        return (C0106b) DEFAULT_INSTANCE.createBuilder(mutationPayload$BoxConstraints);
    }

    public static MutationPayload$BoxConstraints parseDelimitedFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$BoxConstraints) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$BoxConstraints parseFrom(ByteBuffer byteBuffer, h72 h72Var) {
        return (MutationPayload$BoxConstraints) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer, h72Var);
    }

    public static MutationPayload$BoxConstraints parseFrom(ByteString byteString) {
        return (MutationPayload$BoxConstraints) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MutationPayload$BoxConstraints parseFrom(ByteString byteString, h72 h72Var) {
        return (MutationPayload$BoxConstraints) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString, h72Var);
    }

    public static MutationPayload$BoxConstraints parseFrom(byte[] bArr) {
        return (MutationPayload$BoxConstraints) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MutationPayload$BoxConstraints parseFrom(byte[] bArr, h72 h72Var) {
        return (MutationPayload$BoxConstraints) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr, h72Var);
    }

    public static MutationPayload$BoxConstraints parseFrom(InputStream inputStream) {
        return (MutationPayload$BoxConstraints) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$BoxConstraints parseFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$BoxConstraints) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$BoxConstraints parseFrom(lu0 lu0Var) {
        return (MutationPayload$BoxConstraints) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var);
    }

    public static MutationPayload$BoxConstraints parseFrom(lu0 lu0Var, h72 h72Var) {
        return (MutationPayload$BoxConstraints) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var, h72Var);
    }
}
