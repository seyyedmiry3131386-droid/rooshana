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
public final class MutationPayload$SaveBehindCommandPayload extends com.google.protobuf.o implements fv4 {
    private static final MutationPayload$SaveBehindCommandPayload DEFAULT_INSTANCE;
    public static final int FLAGS_FIELD_NUMBER = 1;
    private static volatile j26 PARSER = null;
    public static final int SUBSET_FIELD_NUMBER = 2;
    private int bitField0_;
    private int flags_;
    private MutationPayload$Rect subset_;

    static {
        MutationPayload$SaveBehindCommandPayload mutationPayload$SaveBehindCommandPayload = new MutationPayload$SaveBehindCommandPayload();
        DEFAULT_INSTANCE = mutationPayload$SaveBehindCommandPayload;
        com.google.protobuf.o.registerDefaultInstance(MutationPayload$SaveBehindCommandPayload.class, mutationPayload$SaveBehindCommandPayload);
    }

    private MutationPayload$SaveBehindCommandPayload() {
    }

    private void clearFlags() {
        this.bitField0_ &= -2;
        this.flags_ = 0;
    }

    private void clearSubset() {
        this.subset_ = null;
        this.bitField0_ &= -3;
    }

    public static MutationPayload$SaveBehindCommandPayload getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeSubset(MutationPayload$Rect mutationPayload$Rect) {
        mutationPayload$Rect.getClass();
        MutationPayload$Rect mutationPayload$Rect2 = this.subset_;
        if (mutationPayload$Rect2 == null || mutationPayload$Rect2 == MutationPayload$Rect.getDefaultInstance()) {
            this.subset_ = mutationPayload$Rect;
        } else {
            this.subset_ = (MutationPayload$Rect) ((P0) MutationPayload$Rect.newBuilder(this.subset_).mergeFrom((com.google.protobuf.o) mutationPayload$Rect)).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    public static Y0 newBuilder() {
        return (Y0) DEFAULT_INSTANCE.createBuilder();
    }

    public static MutationPayload$SaveBehindCommandPayload parseDelimitedFrom(InputStream inputStream) {
        return (MutationPayload$SaveBehindCommandPayload) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$SaveBehindCommandPayload parseFrom(ByteBuffer byteBuffer) {
        return (MutationPayload$SaveBehindCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static j26 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFlags(int i) {
        this.bitField0_ |= 1;
        this.flags_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubset(MutationPayload$Rect mutationPayload$Rect) {
        mutationPayload$Rect.getClass();
        this.subset_ = mutationPayload$Rect;
        this.bitField0_ |= 2;
    }

    @Override // com.google.protobuf.o
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, Object obj, Object obj2) {
        j26 fr2Var;
        switch (AbstractC0103a.a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new MutationPayload$SaveBehindCommandPayload();
            case 2:
                return new Y0();
            case 3:
                return com.google.protobuf.o.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "flags_", "subset_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                j26 j26Var = PARSER;
                if (j26Var != null) {
                    return j26Var;
                }
                synchronized (MutationPayload$SaveBehindCommandPayload.class) {
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

    public int getFlags() {
        return this.flags_;
    }

    public MutationPayload$Rect getSubset() {
        MutationPayload$Rect mutationPayload$Rect = this.subset_;
        return mutationPayload$Rect == null ? MutationPayload$Rect.getDefaultInstance() : mutationPayload$Rect;
    }

    public boolean hasFlags() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasSubset() {
        return (this.bitField0_ & 2) != 0;
    }

    public static Y0 newBuilder(MutationPayload$SaveBehindCommandPayload mutationPayload$SaveBehindCommandPayload) {
        return (Y0) DEFAULT_INSTANCE.createBuilder(mutationPayload$SaveBehindCommandPayload);
    }

    public static MutationPayload$SaveBehindCommandPayload parseDelimitedFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$SaveBehindCommandPayload) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$SaveBehindCommandPayload parseFrom(ByteBuffer byteBuffer, h72 h72Var) {
        return (MutationPayload$SaveBehindCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer, h72Var);
    }

    public static MutationPayload$SaveBehindCommandPayload parseFrom(ByteString byteString) {
        return (MutationPayload$SaveBehindCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MutationPayload$SaveBehindCommandPayload parseFrom(ByteString byteString, h72 h72Var) {
        return (MutationPayload$SaveBehindCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString, h72Var);
    }

    public static MutationPayload$SaveBehindCommandPayload parseFrom(byte[] bArr) {
        return (MutationPayload$SaveBehindCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MutationPayload$SaveBehindCommandPayload parseFrom(byte[] bArr, h72 h72Var) {
        return (MutationPayload$SaveBehindCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr, h72Var);
    }

    public static MutationPayload$SaveBehindCommandPayload parseFrom(InputStream inputStream) {
        return (MutationPayload$SaveBehindCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$SaveBehindCommandPayload parseFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$SaveBehindCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$SaveBehindCommandPayload parseFrom(lu0 lu0Var) {
        return (MutationPayload$SaveBehindCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var);
    }

    public static MutationPayload$SaveBehindCommandPayload parseFrom(lu0 lu0Var, h72 h72Var) {
        return (MutationPayload$SaveBehindCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var, h72Var);
    }
}
