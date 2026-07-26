package com.microsoft.clarity.protomodels.mutationpayload;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import defpackage.fr2;
import defpackage.fv4;
import defpackage.h72;
import defpackage.hq3;
import defpackage.j26;
import defpackage.lu0;
import defpackage.pr3;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class MutationPayload$IntList extends com.google.protobuf.o implements fv4 {
    private static final MutationPayload$IntList DEFAULT_INSTANCE;
    private static volatile j26 PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private int valueMemoizedSerializedSize = -1;
    private pr3 value_ = com.google.protobuf.o.emptyIntList();

    static {
        MutationPayload$IntList mutationPayload$IntList = new MutationPayload$IntList();
        DEFAULT_INSTANCE = mutationPayload$IntList;
        com.google.protobuf.o.registerDefaultInstance(MutationPayload$IntList.class, mutationPayload$IntList);
    }

    private MutationPayload$IntList() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllValue(Iterable<? extends Integer> iterable) {
        ensureValueIsMutable();
        com.google.protobuf.a.addAll((Iterable) iterable, (List) this.value_);
    }

    private void addValue(int i) {
        ensureValueIsMutable();
        ((hq3) this.value_).c(i);
    }

    private void clearValue() {
        this.value_ = com.google.protobuf.o.emptyIntList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void ensureValueIsMutable() {
        pr3 pr3Var = this.value_;
        if (((defpackage.z1) pr3Var).a) {
            return;
        }
        this.value_ = com.google.protobuf.o.mutableCopy(pr3Var);
    }

    public static MutationPayload$IntList getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C0127l0 newBuilder() {
        return (C0127l0) DEFAULT_INSTANCE.createBuilder();
    }

    public static MutationPayload$IntList parseDelimitedFrom(InputStream inputStream) {
        return (MutationPayload$IntList) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$IntList parseFrom(ByteBuffer byteBuffer) {
        return (MutationPayload$IntList) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static j26 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setValue(int i, int i2) {
        ensureValueIsMutable();
        ((hq3) this.value_).f(i, i2);
    }

    @Override // com.google.protobuf.o
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, Object obj, Object obj2) {
        j26 fr2Var;
        switch (AbstractC0103a.a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new MutationPayload$IntList();
            case 2:
                return new C0127l0();
            case 3:
                return com.google.protobuf.o.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001'", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                j26 j26Var = PARSER;
                if (j26Var != null) {
                    return j26Var;
                }
                synchronized (MutationPayload$IntList.class) {
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

    public int getValue(int i) {
        return ((hq3) this.value_).e(i);
    }

    public int getValueCount() {
        return ((hq3) this.value_).size();
    }

    public List<Integer> getValueList() {
        return this.value_;
    }

    public static C0127l0 newBuilder(MutationPayload$IntList mutationPayload$IntList) {
        return (C0127l0) DEFAULT_INSTANCE.createBuilder(mutationPayload$IntList);
    }

    public static MutationPayload$IntList parseDelimitedFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$IntList) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$IntList parseFrom(ByteBuffer byteBuffer, h72 h72Var) {
        return (MutationPayload$IntList) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer, h72Var);
    }

    public static MutationPayload$IntList parseFrom(ByteString byteString) {
        return (MutationPayload$IntList) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MutationPayload$IntList parseFrom(ByteString byteString, h72 h72Var) {
        return (MutationPayload$IntList) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString, h72Var);
    }

    public static MutationPayload$IntList parseFrom(byte[] bArr) {
        return (MutationPayload$IntList) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MutationPayload$IntList parseFrom(byte[] bArr, h72 h72Var) {
        return (MutationPayload$IntList) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr, h72Var);
    }

    public static MutationPayload$IntList parseFrom(InputStream inputStream) {
        return (MutationPayload$IntList) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$IntList parseFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$IntList) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$IntList parseFrom(lu0 lu0Var) {
        return (MutationPayload$IntList) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var);
    }

    public static MutationPayload$IntList parseFrom(lu0 lu0Var, h72 h72Var) {
        return (MutationPayload$IntList) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var, h72Var);
    }
}
