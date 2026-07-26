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
public final class MutationPayload$Image extends com.google.protobuf.o implements InterfaceC0121i0 {
    public static final int DATA_HASH_FIELD_NUMBER = 2;
    private static final MutationPayload$Image DEFAULT_INSTANCE;
    public static final int MIPMAP_FIELD_NUMBER = 3;
    private static volatile j26 PARSER = null;
    public static final int SUBSET_FIELD_NUMBER = 1;
    private int bitField0_;
    private String dataHash_ = "";
    private ByteString mipmap_ = ByteString.b;
    private MutationPayload$Rect subset_;

    static {
        MutationPayload$Image mutationPayload$Image = new MutationPayload$Image();
        DEFAULT_INSTANCE = mutationPayload$Image;
        com.google.protobuf.o.registerDefaultInstance(MutationPayload$Image.class, mutationPayload$Image);
    }

    private MutationPayload$Image() {
    }

    private void clearDataHash() {
        this.bitField0_ &= -3;
        this.dataHash_ = getDefaultInstance().getDataHash();
    }

    private void clearMipmap() {
        this.mipmap_ = getDefaultInstance().getMipmap();
    }

    private void clearSubset() {
        this.subset_ = null;
        this.bitField0_ &= -2;
    }

    public static MutationPayload$Image getDefaultInstance() {
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
        this.bitField0_ |= 1;
    }

    public static C0119h0 newBuilder() {
        return (C0119h0) DEFAULT_INSTANCE.createBuilder();
    }

    public static MutationPayload$Image parseDelimitedFrom(InputStream inputStream) {
        return (MutationPayload$Image) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$Image parseFrom(ByteBuffer byteBuffer) {
        return (MutationPayload$Image) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static j26 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDataHash(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.dataHash_ = str;
    }

    private void setDataHashBytes(ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.dataHash_ = byteString.w();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMipmap(ByteString byteString) {
        byteString.getClass();
        this.mipmap_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubset(MutationPayload$Rect mutationPayload$Rect) {
        mutationPayload$Rect.getClass();
        this.subset_ = mutationPayload$Rect;
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.o
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, Object obj, Object obj2) {
        j26 fr2Var;
        switch (AbstractC0103a.a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new MutationPayload$Image();
            case 2:
                return new C0119h0();
            case 3:
                return com.google.protobuf.o.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ለ\u0001\u0003\n", new Object[]{"bitField0_", "subset_", "dataHash_", "mipmap_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                j26 j26Var = PARSER;
                if (j26Var != null) {
                    return j26Var;
                }
                synchronized (MutationPayload$Image.class) {
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

    public String getDataHash() {
        return this.dataHash_;
    }

    public ByteString getDataHashBytes() {
        return ByteString.i(this.dataHash_);
    }

    public ByteString getMipmap() {
        return this.mipmap_;
    }

    public MutationPayload$Rect getSubset() {
        MutationPayload$Rect mutationPayload$Rect = this.subset_;
        return mutationPayload$Rect == null ? MutationPayload$Rect.getDefaultInstance() : mutationPayload$Rect;
    }

    public boolean hasDataHash() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasSubset() {
        return (this.bitField0_ & 1) != 0;
    }

    public static C0119h0 newBuilder(MutationPayload$Image mutationPayload$Image) {
        return (C0119h0) DEFAULT_INSTANCE.createBuilder(mutationPayload$Image);
    }

    public static MutationPayload$Image parseDelimitedFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$Image) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$Image parseFrom(ByteBuffer byteBuffer, h72 h72Var) {
        return (MutationPayload$Image) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer, h72Var);
    }

    public static MutationPayload$Image parseFrom(ByteString byteString) {
        return (MutationPayload$Image) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MutationPayload$Image parseFrom(ByteString byteString, h72 h72Var) {
        return (MutationPayload$Image) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString, h72Var);
    }

    public static MutationPayload$Image parseFrom(byte[] bArr) {
        return (MutationPayload$Image) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MutationPayload$Image parseFrom(byte[] bArr, h72 h72Var) {
        return (MutationPayload$Image) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr, h72Var);
    }

    public static MutationPayload$Image parseFrom(InputStream inputStream) {
        return (MutationPayload$Image) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$Image parseFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$Image) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$Image parseFrom(lu0 lu0Var) {
        return (MutationPayload$Image) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var);
    }

    public static MutationPayload$Image parseFrom(lu0 lu0Var, h72 h72Var) {
        return (MutationPayload$Image) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var, h72Var);
    }
}
