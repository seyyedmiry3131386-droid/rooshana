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
public final class MutationPayload$TextBlob extends com.google.protobuf.o implements k1 {
    public static final int BOUNDS_FIELD_NUMBER = 1;
    private static final MutationPayload$TextBlob DEFAULT_INSTANCE;
    private static volatile j26 PARSER = null;
    public static final int RUNS_FIELD_NUMBER = 2;
    private int bitField0_;
    private MutationPayload$Rect bounds_;
    private rr3 runs_ = com.google.protobuf.o.emptyProtobufList();

    static {
        MutationPayload$TextBlob mutationPayload$TextBlob = new MutationPayload$TextBlob();
        DEFAULT_INSTANCE = mutationPayload$TextBlob;
        com.google.protobuf.o.registerDefaultInstance(MutationPayload$TextBlob.class, mutationPayload$TextBlob);
    }

    private MutationPayload$TextBlob() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRuns(Iterable<? extends MutationPayload$TextBlobRun> iterable) {
        ensureRunsIsMutable();
        com.google.protobuf.a.addAll((Iterable) iterable, (List) this.runs_);
    }

    private void addRuns(MutationPayload$TextBlobRun mutationPayload$TextBlobRun) {
        mutationPayload$TextBlobRun.getClass();
        ensureRunsIsMutable();
        this.runs_.add(mutationPayload$TextBlobRun);
    }

    private void clearBounds() {
        this.bounds_ = null;
        this.bitField0_ &= -2;
    }

    private void clearRuns() {
        this.runs_ = com.google.protobuf.o.emptyProtobufList();
    }

    private void ensureRunsIsMutable() {
        rr3 rr3Var = this.runs_;
        if (((defpackage.z1) rr3Var).a) {
            return;
        }
        this.runs_ = com.google.protobuf.o.mutableCopy(rr3Var);
    }

    public static MutationPayload$TextBlob getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeBounds(MutationPayload$Rect mutationPayload$Rect) {
        mutationPayload$Rect.getClass();
        MutationPayload$Rect mutationPayload$Rect2 = this.bounds_;
        if (mutationPayload$Rect2 == null || mutationPayload$Rect2 == MutationPayload$Rect.getDefaultInstance()) {
            this.bounds_ = mutationPayload$Rect;
        } else {
            this.bounds_ = (MutationPayload$Rect) ((P0) MutationPayload$Rect.newBuilder(this.bounds_).mergeFrom((com.google.protobuf.o) mutationPayload$Rect)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static j1 newBuilder() {
        return (j1) DEFAULT_INSTANCE.createBuilder();
    }

    public static MutationPayload$TextBlob parseDelimitedFrom(InputStream inputStream) {
        return (MutationPayload$TextBlob) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$TextBlob parseFrom(ByteBuffer byteBuffer) {
        return (MutationPayload$TextBlob) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static j26 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeRuns(int i) {
        ensureRunsIsMutable();
        this.runs_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBounds(MutationPayload$Rect mutationPayload$Rect) {
        mutationPayload$Rect.getClass();
        this.bounds_ = mutationPayload$Rect;
        this.bitField0_ |= 1;
    }

    private void setRuns(int i, MutationPayload$TextBlobRun mutationPayload$TextBlobRun) {
        mutationPayload$TextBlobRun.getClass();
        ensureRunsIsMutable();
        this.runs_.set(i, mutationPayload$TextBlobRun);
    }

    @Override // com.google.protobuf.o
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, Object obj, Object obj2) {
        j26 fr2Var;
        switch (AbstractC0103a.a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new MutationPayload$TextBlob();
            case 2:
                return new j1();
            case 3:
                return com.google.protobuf.o.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"bitField0_", "bounds_", "runs_", MutationPayload$TextBlobRun.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                j26 j26Var = PARSER;
                if (j26Var != null) {
                    return j26Var;
                }
                synchronized (MutationPayload$TextBlob.class) {
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

    public MutationPayload$Rect getBounds() {
        MutationPayload$Rect mutationPayload$Rect = this.bounds_;
        return mutationPayload$Rect == null ? MutationPayload$Rect.getDefaultInstance() : mutationPayload$Rect;
    }

    public MutationPayload$TextBlobRun getRuns(int i) {
        return (MutationPayload$TextBlobRun) this.runs_.get(i);
    }

    public int getRunsCount() {
        return this.runs_.size();
    }

    public List<MutationPayload$TextBlobRun> getRunsList() {
        return this.runs_;
    }

    public m1 getRunsOrBuilder(int i) {
        return (m1) this.runs_.get(i);
    }

    public List<? extends m1> getRunsOrBuilderList() {
        return this.runs_;
    }

    public boolean hasBounds() {
        return (this.bitField0_ & 1) != 0;
    }

    public static j1 newBuilder(MutationPayload$TextBlob mutationPayload$TextBlob) {
        return (j1) DEFAULT_INSTANCE.createBuilder(mutationPayload$TextBlob);
    }

    public static MutationPayload$TextBlob parseDelimitedFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$TextBlob) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$TextBlob parseFrom(ByteBuffer byteBuffer, h72 h72Var) {
        return (MutationPayload$TextBlob) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer, h72Var);
    }

    public static MutationPayload$TextBlob parseFrom(ByteString byteString) {
        return (MutationPayload$TextBlob) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    private void addRuns(int i, MutationPayload$TextBlobRun mutationPayload$TextBlobRun) {
        mutationPayload$TextBlobRun.getClass();
        ensureRunsIsMutable();
        this.runs_.add(i, mutationPayload$TextBlobRun);
    }

    public static MutationPayload$TextBlob parseFrom(ByteString byteString, h72 h72Var) {
        return (MutationPayload$TextBlob) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString, h72Var);
    }

    public static MutationPayload$TextBlob parseFrom(byte[] bArr) {
        return (MutationPayload$TextBlob) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MutationPayload$TextBlob parseFrom(byte[] bArr, h72 h72Var) {
        return (MutationPayload$TextBlob) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr, h72Var);
    }

    public static MutationPayload$TextBlob parseFrom(InputStream inputStream) {
        return (MutationPayload$TextBlob) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$TextBlob parseFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$TextBlob) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$TextBlob parseFrom(lu0 lu0Var) {
        return (MutationPayload$TextBlob) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var);
    }

    public static MutationPayload$TextBlob parseFrom(lu0 lu0Var, h72 h72Var) {
        return (MutationPayload$TextBlob) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var, h72Var);
    }
}
