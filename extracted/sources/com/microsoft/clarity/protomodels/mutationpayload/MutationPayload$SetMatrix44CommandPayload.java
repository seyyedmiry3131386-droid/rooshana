package com.microsoft.clarity.protomodels.mutationpayload;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import defpackage.de2;
import defpackage.fr2;
import defpackage.fv4;
import defpackage.h72;
import defpackage.j26;
import defpackage.lu0;
import defpackage.or3;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class MutationPayload$SetMatrix44CommandPayload extends com.google.protobuf.o implements fv4 {
    private static final MutationPayload$SetMatrix44CommandPayload DEFAULT_INSTANCE;
    public static final int MATRIX_FIELD_NUMBER = 1;
    private static volatile j26 PARSER;
    private int matrixMemoizedSerializedSize = -1;
    private or3 matrix_ = com.google.protobuf.o.emptyFloatList();

    static {
        MutationPayload$SetMatrix44CommandPayload mutationPayload$SetMatrix44CommandPayload = new MutationPayload$SetMatrix44CommandPayload();
        DEFAULT_INSTANCE = mutationPayload$SetMatrix44CommandPayload;
        com.google.protobuf.o.registerDefaultInstance(MutationPayload$SetMatrix44CommandPayload.class, mutationPayload$SetMatrix44CommandPayload);
    }

    private MutationPayload$SetMatrix44CommandPayload() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMatrix(Iterable<? extends Float> iterable) {
        ensureMatrixIsMutable();
        com.google.protobuf.a.addAll((Iterable) iterable, (List) this.matrix_);
    }

    private void addMatrix(float f) {
        ensureMatrixIsMutable();
        ((de2) this.matrix_).c(f);
    }

    private void clearMatrix() {
        this.matrix_ = com.google.protobuf.o.emptyFloatList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void ensureMatrixIsMutable() {
        or3 or3Var = this.matrix_;
        if (((defpackage.z1) or3Var).a) {
            return;
        }
        this.matrix_ = com.google.protobuf.o.mutableCopy(or3Var);
    }

    public static MutationPayload$SetMatrix44CommandPayload getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static c1 newBuilder() {
        return (c1) DEFAULT_INSTANCE.createBuilder();
    }

    public static MutationPayload$SetMatrix44CommandPayload parseDelimitedFrom(InputStream inputStream) {
        return (MutationPayload$SetMatrix44CommandPayload) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$SetMatrix44CommandPayload parseFrom(ByteBuffer byteBuffer) {
        return (MutationPayload$SetMatrix44CommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static j26 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setMatrix(int i, float f) {
        ensureMatrixIsMutable();
        ((de2) this.matrix_).f(i, f);
    }

    @Override // com.google.protobuf.o
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, Object obj, Object obj2) {
        j26 fr2Var;
        switch (AbstractC0103a.a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new MutationPayload$SetMatrix44CommandPayload();
            case 2:
                return new c1();
            case 3:
                return com.google.protobuf.o.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001$", new Object[]{"matrix_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                j26 j26Var = PARSER;
                if (j26Var != null) {
                    return j26Var;
                }
                synchronized (MutationPayload$SetMatrix44CommandPayload.class) {
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

    public float getMatrix(int i) {
        return ((de2) this.matrix_).e(i);
    }

    public int getMatrixCount() {
        return ((de2) this.matrix_).size();
    }

    public List<Float> getMatrixList() {
        return this.matrix_;
    }

    public static c1 newBuilder(MutationPayload$SetMatrix44CommandPayload mutationPayload$SetMatrix44CommandPayload) {
        return (c1) DEFAULT_INSTANCE.createBuilder(mutationPayload$SetMatrix44CommandPayload);
    }

    public static MutationPayload$SetMatrix44CommandPayload parseDelimitedFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$SetMatrix44CommandPayload) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$SetMatrix44CommandPayload parseFrom(ByteBuffer byteBuffer, h72 h72Var) {
        return (MutationPayload$SetMatrix44CommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer, h72Var);
    }

    public static MutationPayload$SetMatrix44CommandPayload parseFrom(ByteString byteString) {
        return (MutationPayload$SetMatrix44CommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MutationPayload$SetMatrix44CommandPayload parseFrom(ByteString byteString, h72 h72Var) {
        return (MutationPayload$SetMatrix44CommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString, h72Var);
    }

    public static MutationPayload$SetMatrix44CommandPayload parseFrom(byte[] bArr) {
        return (MutationPayload$SetMatrix44CommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MutationPayload$SetMatrix44CommandPayload parseFrom(byte[] bArr, h72 h72Var) {
        return (MutationPayload$SetMatrix44CommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr, h72Var);
    }

    public static MutationPayload$SetMatrix44CommandPayload parseFrom(InputStream inputStream) {
        return (MutationPayload$SetMatrix44CommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$SetMatrix44CommandPayload parseFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$SetMatrix44CommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$SetMatrix44CommandPayload parseFrom(lu0 lu0Var) {
        return (MutationPayload$SetMatrix44CommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var);
    }

    public static MutationPayload$SetMatrix44CommandPayload parseFrom(lu0 lu0Var, h72 h72Var) {
        return (MutationPayload$SetMatrix44CommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var, h72Var);
    }
}
