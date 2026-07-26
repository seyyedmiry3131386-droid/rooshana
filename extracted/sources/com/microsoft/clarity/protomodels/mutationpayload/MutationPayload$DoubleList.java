package com.microsoft.clarity.protomodels.mutationpayload;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import defpackage.ar1;
import defpackage.fr2;
import defpackage.h72;
import defpackage.j26;
import defpackage.kr3;
import defpackage.lu0;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class MutationPayload$DoubleList extends com.google.protobuf.o implements InterfaceC0151y {
    private static final MutationPayload$DoubleList DEFAULT_INSTANCE;
    private static volatile j26 PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private int valueMemoizedSerializedSize = -1;
    private kr3 value_ = com.google.protobuf.o.emptyDoubleList();

    static {
        MutationPayload$DoubleList mutationPayload$DoubleList = new MutationPayload$DoubleList();
        DEFAULT_INSTANCE = mutationPayload$DoubleList;
        com.google.protobuf.o.registerDefaultInstance(MutationPayload$DoubleList.class, mutationPayload$DoubleList);
    }

    private MutationPayload$DoubleList() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllValue(Iterable<? extends Double> iterable) {
        ensureValueIsMutable();
        com.google.protobuf.a.addAll((Iterable) iterable, (List) this.value_);
    }

    private void addValue(double d) {
        ensureValueIsMutable();
        ((ar1) this.value_).c(d);
    }

    private void clearValue() {
        this.value_ = com.google.protobuf.o.emptyDoubleList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void ensureValueIsMutable() {
        kr3 kr3Var = this.value_;
        if (((defpackage.z1) kr3Var).a) {
            return;
        }
        this.value_ = com.google.protobuf.o.mutableCopy(kr3Var);
    }

    public static MutationPayload$DoubleList getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C0149x newBuilder() {
        return (C0149x) DEFAULT_INSTANCE.createBuilder();
    }

    public static MutationPayload$DoubleList parseDelimitedFrom(InputStream inputStream) {
        return (MutationPayload$DoubleList) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$DoubleList parseFrom(ByteBuffer byteBuffer) {
        return (MutationPayload$DoubleList) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static j26 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setValue(int i, double d) {
        ensureValueIsMutable();
        ((ar1) this.value_).f(i, d);
    }

    @Override // com.google.protobuf.o
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, Object obj, Object obj2) {
        j26 fr2Var;
        switch (AbstractC0103a.a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new MutationPayload$DoubleList();
            case 2:
                return new C0149x();
            case 3:
                return com.google.protobuf.o.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001#", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                j26 j26Var = PARSER;
                if (j26Var != null) {
                    return j26Var;
                }
                synchronized (MutationPayload$DoubleList.class) {
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

    public double getValue(int i) {
        return ((ar1) this.value_).e(i);
    }

    public int getValueCount() {
        return ((ar1) this.value_).size();
    }

    public List<Double> getValueList() {
        return this.value_;
    }

    public static C0149x newBuilder(MutationPayload$DoubleList mutationPayload$DoubleList) {
        return (C0149x) DEFAULT_INSTANCE.createBuilder(mutationPayload$DoubleList);
    }

    public static MutationPayload$DoubleList parseDelimitedFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$DoubleList) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$DoubleList parseFrom(ByteBuffer byteBuffer, h72 h72Var) {
        return (MutationPayload$DoubleList) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer, h72Var);
    }

    public static MutationPayload$DoubleList parseFrom(ByteString byteString) {
        return (MutationPayload$DoubleList) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MutationPayload$DoubleList parseFrom(ByteString byteString, h72 h72Var) {
        return (MutationPayload$DoubleList) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString, h72Var);
    }

    public static MutationPayload$DoubleList parseFrom(byte[] bArr) {
        return (MutationPayload$DoubleList) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MutationPayload$DoubleList parseFrom(byte[] bArr, h72 h72Var) {
        return (MutationPayload$DoubleList) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr, h72Var);
    }

    public static MutationPayload$DoubleList parseFrom(InputStream inputStream) {
        return (MutationPayload$DoubleList) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$DoubleList parseFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$DoubleList) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$DoubleList parseFrom(lu0 lu0Var) {
        return (MutationPayload$DoubleList) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var);
    }

    public static MutationPayload$DoubleList parseFrom(lu0 lu0Var, h72 h72Var) {
        return (MutationPayload$DoubleList) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var, h72Var);
    }
}
