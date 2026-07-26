package com.microsoft.clarity.protomodels.mutationpayload;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import defpackage.ar1;
import defpackage.fr2;
import defpackage.fv4;
import defpackage.h72;
import defpackage.j26;
import defpackage.kr3;
import defpackage.lu0;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class MutationPayload$TransformCommandPayload extends com.google.protobuf.o implements fv4 {
    private static final MutationPayload$TransformCommandPayload DEFAULT_INSTANCE;
    public static final int MATRIX_FIELD_NUMBER = 1;
    private static volatile j26 PARSER;
    private int matrixMemoizedSerializedSize = -1;
    private kr3 matrix_ = com.google.protobuf.o.emptyDoubleList();

    static {
        MutationPayload$TransformCommandPayload mutationPayload$TransformCommandPayload = new MutationPayload$TransformCommandPayload();
        DEFAULT_INSTANCE = mutationPayload$TransformCommandPayload;
        com.google.protobuf.o.registerDefaultInstance(MutationPayload$TransformCommandPayload.class, mutationPayload$TransformCommandPayload);
    }

    private MutationPayload$TransformCommandPayload() {
    }

    private void addAllMatrix(Iterable<? extends Double> iterable) {
        ensureMatrixIsMutable();
        com.google.protobuf.a.addAll((Iterable) iterable, (List) this.matrix_);
    }

    private void addMatrix(double d) {
        ensureMatrixIsMutable();
        ((ar1) this.matrix_).c(d);
    }

    private void clearMatrix() {
        this.matrix_ = com.google.protobuf.o.emptyDoubleList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void ensureMatrixIsMutable() {
        kr3 kr3Var = this.matrix_;
        if (((defpackage.z1) kr3Var).a) {
            return;
        }
        this.matrix_ = com.google.protobuf.o.mutableCopy(kr3Var);
    }

    public static MutationPayload$TransformCommandPayload getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static q1 newBuilder() {
        return (q1) DEFAULT_INSTANCE.createBuilder();
    }

    public static MutationPayload$TransformCommandPayload parseDelimitedFrom(InputStream inputStream) {
        return (MutationPayload$TransformCommandPayload) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$TransformCommandPayload parseFrom(ByteBuffer byteBuffer) {
        return (MutationPayload$TransformCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static j26 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setMatrix(int i, double d) {
        ensureMatrixIsMutable();
        ((ar1) this.matrix_).f(i, d);
    }

    @Override // com.google.protobuf.o
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, Object obj, Object obj2) {
        j26 fr2Var;
        switch (AbstractC0103a.a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new MutationPayload$TransformCommandPayload();
            case 2:
                return new q1();
            case 3:
                return com.google.protobuf.o.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001#", new Object[]{"matrix_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                j26 j26Var = PARSER;
                if (j26Var != null) {
                    return j26Var;
                }
                synchronized (MutationPayload$TransformCommandPayload.class) {
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

    public double getMatrix(int i) {
        return ((ar1) this.matrix_).e(i);
    }

    public int getMatrixCount() {
        return ((ar1) this.matrix_).size();
    }

    public List<Double> getMatrixList() {
        return this.matrix_;
    }

    public static q1 newBuilder(MutationPayload$TransformCommandPayload mutationPayload$TransformCommandPayload) {
        return (q1) DEFAULT_INSTANCE.createBuilder(mutationPayload$TransformCommandPayload);
    }

    public static MutationPayload$TransformCommandPayload parseDelimitedFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$TransformCommandPayload) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$TransformCommandPayload parseFrom(ByteBuffer byteBuffer, h72 h72Var) {
        return (MutationPayload$TransformCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer, h72Var);
    }

    public static MutationPayload$TransformCommandPayload parseFrom(ByteString byteString) {
        return (MutationPayload$TransformCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MutationPayload$TransformCommandPayload parseFrom(ByteString byteString, h72 h72Var) {
        return (MutationPayload$TransformCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString, h72Var);
    }

    public static MutationPayload$TransformCommandPayload parseFrom(byte[] bArr) {
        return (MutationPayload$TransformCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MutationPayload$TransformCommandPayload parseFrom(byte[] bArr, h72 h72Var) {
        return (MutationPayload$TransformCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr, h72Var);
    }

    public static MutationPayload$TransformCommandPayload parseFrom(InputStream inputStream) {
        return (MutationPayload$TransformCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$TransformCommandPayload parseFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$TransformCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$TransformCommandPayload parseFrom(lu0 lu0Var) {
        return (MutationPayload$TransformCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var);
    }

    public static MutationPayload$TransformCommandPayload parseFrom(lu0 lu0Var, h72 h72Var) {
        return (MutationPayload$TransformCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var, h72Var);
    }
}
