package com.microsoft.clarity.protomodels.mutationpayload;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import defpackage.fr2;
import defpackage.h72;
import defpackage.j26;
import defpackage.lu0;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class MutationPayload$PlaceholderDimensions extends com.google.protobuf.o implements K0 {
    public static final int ALIGNMENT_FIELD_NUMBER = 2;
    public static final int BASELINEOFFSET_FIELD_NUMBER = 4;
    public static final int BASELINE_FIELD_NUMBER = 3;
    private static final MutationPayload$PlaceholderDimensions DEFAULT_INSTANCE;
    private static volatile j26 PARSER = null;
    public static final int SIZE_FIELD_NUMBER = 1;
    private int alignment_;
    private double baselineOffset_;
    private int baseline_;
    private int bitField0_;
    private MutationPayload$Offset size_;

    static {
        MutationPayload$PlaceholderDimensions mutationPayload$PlaceholderDimensions = new MutationPayload$PlaceholderDimensions();
        DEFAULT_INSTANCE = mutationPayload$PlaceholderDimensions;
        com.google.protobuf.o.registerDefaultInstance(MutationPayload$PlaceholderDimensions.class, mutationPayload$PlaceholderDimensions);
    }

    private MutationPayload$PlaceholderDimensions() {
    }

    private void clearAlignment() {
        this.bitField0_ &= -3;
        this.alignment_ = 0;
    }

    private void clearBaseline() {
        this.bitField0_ &= -5;
        this.baseline_ = 0;
    }

    private void clearBaselineOffset() {
        this.bitField0_ &= -9;
        this.baselineOffset_ = 0.0d;
    }

    private void clearSize() {
        this.size_ = null;
        this.bitField0_ &= -2;
    }

    public static MutationPayload$PlaceholderDimensions getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeSize(MutationPayload$Offset mutationPayload$Offset) {
        mutationPayload$Offset.getClass();
        MutationPayload$Offset mutationPayload$Offset2 = this.size_;
        if (mutationPayload$Offset2 == null || mutationPayload$Offset2 == MutationPayload$Offset.getDefaultInstance()) {
            this.size_ = mutationPayload$Offset;
        } else {
            this.size_ = (MutationPayload$Offset) ((C0150x0) MutationPayload$Offset.newBuilder(this.size_).mergeFrom((com.google.protobuf.o) mutationPayload$Offset)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static J0 newBuilder() {
        return (J0) DEFAULT_INSTANCE.createBuilder();
    }

    public static MutationPayload$PlaceholderDimensions parseDelimitedFrom(InputStream inputStream) {
        return (MutationPayload$PlaceholderDimensions) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$PlaceholderDimensions parseFrom(ByteBuffer byteBuffer) {
        return (MutationPayload$PlaceholderDimensions) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static j26 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setAlignment(int i) {
        this.bitField0_ |= 2;
        this.alignment_ = i;
    }

    private void setBaseline(int i) {
        this.bitField0_ |= 4;
        this.baseline_ = i;
    }

    private void setBaselineOffset(double d) {
        this.bitField0_ |= 8;
        this.baselineOffset_ = d;
    }

    private void setSize(MutationPayload$Offset mutationPayload$Offset) {
        mutationPayload$Offset.getClass();
        this.size_ = mutationPayload$Offset;
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.o
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, Object obj, Object obj2) {
        j26 fr2Var;
        switch (AbstractC0103a.a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new MutationPayload$PlaceholderDimensions();
            case 2:
                return new J0();
            case 3:
                return com.google.protobuf.o.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001\u0003င\u0002\u0004က\u0003", new Object[]{"bitField0_", "size_", "alignment_", "baseline_", "baselineOffset_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                j26 j26Var = PARSER;
                if (j26Var != null) {
                    return j26Var;
                }
                synchronized (MutationPayload$PlaceholderDimensions.class) {
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

    public int getAlignment() {
        return this.alignment_;
    }

    public int getBaseline() {
        return this.baseline_;
    }

    public double getBaselineOffset() {
        return this.baselineOffset_;
    }

    public MutationPayload$Offset getSize() {
        MutationPayload$Offset mutationPayload$Offset = this.size_;
        return mutationPayload$Offset == null ? MutationPayload$Offset.getDefaultInstance() : mutationPayload$Offset;
    }

    public boolean hasAlignment() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasBaseline() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasBaselineOffset() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasSize() {
        return (this.bitField0_ & 1) != 0;
    }

    public static J0 newBuilder(MutationPayload$PlaceholderDimensions mutationPayload$PlaceholderDimensions) {
        return (J0) DEFAULT_INSTANCE.createBuilder(mutationPayload$PlaceholderDimensions);
    }

    public static MutationPayload$PlaceholderDimensions parseDelimitedFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$PlaceholderDimensions) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$PlaceholderDimensions parseFrom(ByteBuffer byteBuffer, h72 h72Var) {
        return (MutationPayload$PlaceholderDimensions) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer, h72Var);
    }

    public static MutationPayload$PlaceholderDimensions parseFrom(ByteString byteString) {
        return (MutationPayload$PlaceholderDimensions) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MutationPayload$PlaceholderDimensions parseFrom(ByteString byteString, h72 h72Var) {
        return (MutationPayload$PlaceholderDimensions) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString, h72Var);
    }

    public static MutationPayload$PlaceholderDimensions parseFrom(byte[] bArr) {
        return (MutationPayload$PlaceholderDimensions) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MutationPayload$PlaceholderDimensions parseFrom(byte[] bArr, h72 h72Var) {
        return (MutationPayload$PlaceholderDimensions) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr, h72Var);
    }

    public static MutationPayload$PlaceholderDimensions parseFrom(InputStream inputStream) {
        return (MutationPayload$PlaceholderDimensions) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$PlaceholderDimensions parseFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$PlaceholderDimensions) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$PlaceholderDimensions parseFrom(lu0 lu0Var) {
        return (MutationPayload$PlaceholderDimensions) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var);
    }

    public static MutationPayload$PlaceholderDimensions parseFrom(lu0 lu0Var, h72 h72Var) {
        return (MutationPayload$PlaceholderDimensions) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var, h72Var);
    }
}
