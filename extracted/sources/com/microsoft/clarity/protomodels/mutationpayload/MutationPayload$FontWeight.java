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
public final class MutationPayload$FontWeight extends com.google.protobuf.o implements fv4 {
    private static final MutationPayload$FontWeight DEFAULT_INSTANCE;
    public static final int INDEX_FIELD_NUMBER = 1;
    private static volatile j26 PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int bitField0_;
    private int index_;
    private int value_;

    static {
        MutationPayload$FontWeight mutationPayload$FontWeight = new MutationPayload$FontWeight();
        DEFAULT_INSTANCE = mutationPayload$FontWeight;
        com.google.protobuf.o.registerDefaultInstance(MutationPayload$FontWeight.class, mutationPayload$FontWeight);
    }

    private MutationPayload$FontWeight() {
    }

    private void clearIndex() {
        this.bitField0_ &= -2;
        this.index_ = 0;
    }

    private void clearValue() {
        this.bitField0_ &= -3;
        this.value_ = 0;
    }

    public static MutationPayload$FontWeight getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C0117g0 newBuilder() {
        return (C0117g0) DEFAULT_INSTANCE.createBuilder();
    }

    public static MutationPayload$FontWeight parseDelimitedFrom(InputStream inputStream) {
        return (MutationPayload$FontWeight) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$FontWeight parseFrom(ByteBuffer byteBuffer) {
        return (MutationPayload$FontWeight) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static j26 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setIndex(int i) {
        this.bitField0_ |= 1;
        this.index_ = i;
    }

    private void setValue(int i) {
        this.bitField0_ |= 2;
        this.value_ = i;
    }

    @Override // com.google.protobuf.o
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, Object obj, Object obj2) {
        j26 fr2Var;
        switch (AbstractC0103a.a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new MutationPayload$FontWeight();
            case 2:
                return new C0117g0();
            case 3:
                return com.google.protobuf.o.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"bitField0_", "index_", "value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                j26 j26Var = PARSER;
                if (j26Var != null) {
                    return j26Var;
                }
                synchronized (MutationPayload$FontWeight.class) {
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

    public int getIndex() {
        return this.index_;
    }

    public int getValue() {
        return this.value_;
    }

    public boolean hasIndex() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasValue() {
        return (this.bitField0_ & 2) != 0;
    }

    public static C0117g0 newBuilder(MutationPayload$FontWeight mutationPayload$FontWeight) {
        return (C0117g0) DEFAULT_INSTANCE.createBuilder(mutationPayload$FontWeight);
    }

    public static MutationPayload$FontWeight parseDelimitedFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$FontWeight) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$FontWeight parseFrom(ByteBuffer byteBuffer, h72 h72Var) {
        return (MutationPayload$FontWeight) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer, h72Var);
    }

    public static MutationPayload$FontWeight parseFrom(ByteString byteString) {
        return (MutationPayload$FontWeight) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MutationPayload$FontWeight parseFrom(ByteString byteString, h72 h72Var) {
        return (MutationPayload$FontWeight) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString, h72Var);
    }

    public static MutationPayload$FontWeight parseFrom(byte[] bArr) {
        return (MutationPayload$FontWeight) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MutationPayload$FontWeight parseFrom(byte[] bArr, h72 h72Var) {
        return (MutationPayload$FontWeight) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr, h72Var);
    }

    public static MutationPayload$FontWeight parseFrom(InputStream inputStream) {
        return (MutationPayload$FontWeight) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$FontWeight parseFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$FontWeight) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$FontWeight parseFrom(lu0 lu0Var) {
        return (MutationPayload$FontWeight) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var);
    }

    public static MutationPayload$FontWeight parseFrom(lu0 lu0Var, h72 h72Var) {
        return (MutationPayload$FontWeight) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var, h72Var);
    }
}
