package com.microsoft.clarity.protomodels.mutationpayload;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import defpackage.de2;
import defpackage.fr2;
import defpackage.h72;
import defpackage.j26;
import defpackage.lu0;
import defpackage.or3;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class MutationPayload$FloatList extends com.google.protobuf.o implements InterfaceC0109c0 {
    private static final MutationPayload$FloatList DEFAULT_INSTANCE;
    private static volatile j26 PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private int valueMemoizedSerializedSize = -1;
    private or3 value_ = com.google.protobuf.o.emptyFloatList();

    static {
        MutationPayload$FloatList mutationPayload$FloatList = new MutationPayload$FloatList();
        DEFAULT_INSTANCE = mutationPayload$FloatList;
        com.google.protobuf.o.registerDefaultInstance(MutationPayload$FloatList.class, mutationPayload$FloatList);
    }

    private MutationPayload$FloatList() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllValue(Iterable<? extends Float> iterable) {
        ensureValueIsMutable();
        com.google.protobuf.a.addAll((Iterable) iterable, (List) this.value_);
    }

    private void addValue(float f) {
        ensureValueIsMutable();
        ((de2) this.value_).c(f);
    }

    private void clearValue() {
        this.value_ = com.google.protobuf.o.emptyFloatList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void ensureValueIsMutable() {
        or3 or3Var = this.value_;
        if (((defpackage.z1) or3Var).a) {
            return;
        }
        this.value_ = com.google.protobuf.o.mutableCopy(or3Var);
    }

    public static MutationPayload$FloatList getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C0107b0 newBuilder() {
        return (C0107b0) DEFAULT_INSTANCE.createBuilder();
    }

    public static MutationPayload$FloatList parseDelimitedFrom(InputStream inputStream) {
        return (MutationPayload$FloatList) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$FloatList parseFrom(ByteBuffer byteBuffer) {
        return (MutationPayload$FloatList) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static j26 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setValue(int i, float f) {
        ensureValueIsMutable();
        ((de2) this.value_).f(i, f);
    }

    @Override // com.google.protobuf.o
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, Object obj, Object obj2) {
        j26 fr2Var;
        switch (AbstractC0103a.a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new MutationPayload$FloatList();
            case 2:
                return new C0107b0();
            case 3:
                return com.google.protobuf.o.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001$", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                j26 j26Var = PARSER;
                if (j26Var != null) {
                    return j26Var;
                }
                synchronized (MutationPayload$FloatList.class) {
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

    public float getValue(int i) {
        return ((de2) this.value_).e(i);
    }

    public int getValueCount() {
        return ((de2) this.value_).size();
    }

    public List<Float> getValueList() {
        return this.value_;
    }

    public static C0107b0 newBuilder(MutationPayload$FloatList mutationPayload$FloatList) {
        return (C0107b0) DEFAULT_INSTANCE.createBuilder(mutationPayload$FloatList);
    }

    public static MutationPayload$FloatList parseDelimitedFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$FloatList) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$FloatList parseFrom(ByteBuffer byteBuffer, h72 h72Var) {
        return (MutationPayload$FloatList) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer, h72Var);
    }

    public static MutationPayload$FloatList parseFrom(ByteString byteString) {
        return (MutationPayload$FloatList) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MutationPayload$FloatList parseFrom(ByteString byteString, h72 h72Var) {
        return (MutationPayload$FloatList) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString, h72Var);
    }

    public static MutationPayload$FloatList parseFrom(byte[] bArr) {
        return (MutationPayload$FloatList) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MutationPayload$FloatList parseFrom(byte[] bArr, h72 h72Var) {
        return (MutationPayload$FloatList) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr, h72Var);
    }

    public static MutationPayload$FloatList parseFrom(InputStream inputStream) {
        return (MutationPayload$FloatList) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$FloatList parseFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$FloatList) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$FloatList parseFrom(lu0 lu0Var) {
        return (MutationPayload$FloatList) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var);
    }

    public static MutationPayload$FloatList parseFrom(lu0 lu0Var, h72 h72Var) {
        return (MutationPayload$FloatList) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var, h72Var);
    }
}
