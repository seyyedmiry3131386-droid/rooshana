package com.microsoft.clarity.protomodels.mutationpayload;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import defpackage.fr2;
import defpackage.h72;
import defpackage.j26;
import defpackage.lu0;
import defpackage.rr3;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class MutationPayload$Path extends com.google.protobuf.o implements E0 {
    private static final MutationPayload$Path DEFAULT_INSTANCE;
    public static final int FILL_TYPE_FIELD_NUMBER = 1;
    private static volatile j26 PARSER = null;
    public static final int VERBS_FIELD_NUMBER = 2;
    private int bitField0_;
    private int fillType_;
    private rr3 verbs_ = com.google.protobuf.o.emptyProtobufList();

    static {
        MutationPayload$Path mutationPayload$Path = new MutationPayload$Path();
        DEFAULT_INSTANCE = mutationPayload$Path;
        com.google.protobuf.o.registerDefaultInstance(MutationPayload$Path.class, mutationPayload$Path);
    }

    private MutationPayload$Path() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllVerbs(Iterable<? extends MutationPayload$PathVerb> iterable) {
        ensureVerbsIsMutable();
        com.google.protobuf.a.addAll((Iterable) iterable, (List) this.verbs_);
    }

    private void addVerbs(MutationPayload$PathVerb mutationPayload$PathVerb) {
        mutationPayload$PathVerb.getClass();
        ensureVerbsIsMutable();
        this.verbs_.add(mutationPayload$PathVerb);
    }

    private void clearFillType() {
        this.bitField0_ &= -2;
        this.fillType_ = 0;
    }

    private void clearVerbs() {
        this.verbs_ = com.google.protobuf.o.emptyProtobufList();
    }

    private void ensureVerbsIsMutable() {
        rr3 rr3Var = this.verbs_;
        if (((defpackage.z1) rr3Var).a) {
            return;
        }
        this.verbs_ = com.google.protobuf.o.mutableCopy(rr3Var);
    }

    public static MutationPayload$Path getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static A0 newBuilder() {
        return (A0) DEFAULT_INSTANCE.createBuilder();
    }

    public static MutationPayload$Path parseDelimitedFrom(InputStream inputStream) {
        return (MutationPayload$Path) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$Path parseFrom(ByteBuffer byteBuffer) {
        return (MutationPayload$Path) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static j26 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeVerbs(int i) {
        ensureVerbsIsMutable();
        this.verbs_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFillType(int i) {
        this.bitField0_ |= 1;
        this.fillType_ = i;
    }

    private void setVerbs(int i, MutationPayload$PathVerb mutationPayload$PathVerb) {
        mutationPayload$PathVerb.getClass();
        ensureVerbsIsMutable();
        this.verbs_.set(i, mutationPayload$PathVerb);
    }

    @Override // com.google.protobuf.o
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, Object obj, Object obj2) {
        j26 fr2Var;
        switch (AbstractC0103a.a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new MutationPayload$Path();
            case 2:
                return new A0();
            case 3:
                return com.google.protobuf.o.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u001b", new Object[]{"bitField0_", "fillType_", "verbs_", MutationPayload$PathVerb.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                j26 j26Var = PARSER;
                if (j26Var != null) {
                    return j26Var;
                }
                synchronized (MutationPayload$Path.class) {
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

    public int getFillType() {
        return this.fillType_;
    }

    public MutationPayload$PathVerb getVerbs(int i) {
        return (MutationPayload$PathVerb) this.verbs_.get(i);
    }

    public int getVerbsCount() {
        return this.verbs_.size();
    }

    public List<MutationPayload$PathVerb> getVerbsList() {
        return this.verbs_;
    }

    public H0 getVerbsOrBuilder(int i) {
        return (H0) this.verbs_.get(i);
    }

    public List<? extends H0> getVerbsOrBuilderList() {
        return this.verbs_;
    }

    public boolean hasFillType() {
        return (this.bitField0_ & 1) != 0;
    }

    public static A0 newBuilder(MutationPayload$Path mutationPayload$Path) {
        return (A0) DEFAULT_INSTANCE.createBuilder(mutationPayload$Path);
    }

    public static MutationPayload$Path parseDelimitedFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$Path) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$Path parseFrom(ByteBuffer byteBuffer, h72 h72Var) {
        return (MutationPayload$Path) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer, h72Var);
    }

    public static MutationPayload$Path parseFrom(ByteString byteString) {
        return (MutationPayload$Path) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    private void addVerbs(int i, MutationPayload$PathVerb mutationPayload$PathVerb) {
        mutationPayload$PathVerb.getClass();
        ensureVerbsIsMutable();
        this.verbs_.add(i, mutationPayload$PathVerb);
    }

    public static MutationPayload$Path parseFrom(ByteString byteString, h72 h72Var) {
        return (MutationPayload$Path) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString, h72Var);
    }

    public static MutationPayload$Path parseFrom(byte[] bArr) {
        return (MutationPayload$Path) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MutationPayload$Path parseFrom(byte[] bArr, h72 h72Var) {
        return (MutationPayload$Path) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr, h72Var);
    }

    public static MutationPayload$Path parseFrom(InputStream inputStream) {
        return (MutationPayload$Path) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$Path parseFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$Path) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$Path parseFrom(lu0 lu0Var) {
        return (MutationPayload$Path) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var);
    }

    public static MutationPayload$Path parseFrom(lu0 lu0Var, h72 h72Var) {
        return (MutationPayload$Path) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var, h72Var);
    }
}
