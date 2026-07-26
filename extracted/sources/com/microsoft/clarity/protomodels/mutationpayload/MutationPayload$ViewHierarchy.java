package com.microsoft.clarity.protomodels.mutationpayload;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import defpackage.fr2;
import defpackage.fv4;
import defpackage.h72;
import defpackage.j26;
import defpackage.lu0;
import defpackage.rr3;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class MutationPayload$ViewHierarchy extends com.google.protobuf.o implements fv4 {
    private static final MutationPayload$ViewHierarchy DEFAULT_INSTANCE;
    private static volatile j26 PARSER = null;
    public static final int ROOTDELTA_FIELD_NUMBER = 4;
    public static final int ROOT_FIELD_NUMBER = 2;
    public static final int TIMESTAMP_FIELD_NUMBER = 1;
    public static final int VISIBLE_FRAGMENTS_FIELD_NUMBER = 3;
    private int bitField0_;
    private MutationPayload$ViewNodeDelta rootDelta_;
    private MutationPayload$ViewNode root_;
    private double timestamp_;
    private rr3 visibleFragments_ = com.google.protobuf.o.emptyProtobufList();

    static {
        MutationPayload$ViewHierarchy mutationPayload$ViewHierarchy = new MutationPayload$ViewHierarchy();
        DEFAULT_INSTANCE = mutationPayload$ViewHierarchy;
        com.google.protobuf.o.registerDefaultInstance(MutationPayload$ViewHierarchy.class, mutationPayload$ViewHierarchy);
    }

    private MutationPayload$ViewHierarchy() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllVisibleFragments(Iterable<String> iterable) {
        ensureVisibleFragmentsIsMutable();
        com.google.protobuf.a.addAll((Iterable) iterable, (List) this.visibleFragments_);
    }

    private void addVisibleFragments(String str) {
        str.getClass();
        ensureVisibleFragmentsIsMutable();
        this.visibleFragments_.add(str);
    }

    private void addVisibleFragmentsBytes(ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        ensureVisibleFragmentsIsMutable();
        this.visibleFragments_.add(byteString.w());
    }

    private void clearRoot() {
        this.root_ = null;
        this.bitField0_ &= -3;
    }

    private void clearRootDelta() {
        this.rootDelta_ = null;
        this.bitField0_ &= -5;
    }

    private void clearTimestamp() {
        this.bitField0_ &= -2;
        this.timestamp_ = 0.0d;
    }

    private void clearVisibleFragments() {
        this.visibleFragments_ = com.google.protobuf.o.emptyProtobufList();
    }

    private void ensureVisibleFragmentsIsMutable() {
        rr3 rr3Var = this.visibleFragments_;
        if (((defpackage.z1) rr3Var).a) {
            return;
        }
        this.visibleFragments_ = com.google.protobuf.o.mutableCopy(rr3Var);
    }

    public static MutationPayload$ViewHierarchy getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeRoot(MutationPayload$ViewNode mutationPayload$ViewNode) {
        mutationPayload$ViewNode.getClass();
        MutationPayload$ViewNode mutationPayload$ViewNode2 = this.root_;
        if (mutationPayload$ViewNode2 == null || mutationPayload$ViewNode2 == MutationPayload$ViewNode.getDefaultInstance()) {
            this.root_ = mutationPayload$ViewNode;
        } else {
            this.root_ = (MutationPayload$ViewNode) ((x1) MutationPayload$ViewNode.newBuilder(this.root_).mergeFrom((com.google.protobuf.o) mutationPayload$ViewNode)).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    private void mergeRootDelta(MutationPayload$ViewNodeDelta mutationPayload$ViewNodeDelta) {
        mutationPayload$ViewNodeDelta.getClass();
        MutationPayload$ViewNodeDelta mutationPayload$ViewNodeDelta2 = this.rootDelta_;
        if (mutationPayload$ViewNodeDelta2 == null || mutationPayload$ViewNodeDelta2 == MutationPayload$ViewNodeDelta.getDefaultInstance()) {
            this.rootDelta_ = mutationPayload$ViewNodeDelta;
        } else {
            this.rootDelta_ = (MutationPayload$ViewNodeDelta) ((y1) MutationPayload$ViewNodeDelta.newBuilder(this.rootDelta_).mergeFrom((com.google.protobuf.o) mutationPayload$ViewNodeDelta)).buildPartial();
        }
        this.bitField0_ |= 4;
    }

    public static w1 newBuilder() {
        return (w1) DEFAULT_INSTANCE.createBuilder();
    }

    public static MutationPayload$ViewHierarchy parseDelimitedFrom(InputStream inputStream) {
        return (MutationPayload$ViewHierarchy) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$ViewHierarchy parseFrom(ByteBuffer byteBuffer) {
        return (MutationPayload$ViewHierarchy) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static j26 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setRoot(MutationPayload$ViewNode mutationPayload$ViewNode) {
        mutationPayload$ViewNode.getClass();
        this.root_ = mutationPayload$ViewNode;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRootDelta(MutationPayload$ViewNodeDelta mutationPayload$ViewNodeDelta) {
        mutationPayload$ViewNodeDelta.getClass();
        this.rootDelta_ = mutationPayload$ViewNodeDelta;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimestamp(double d) {
        this.bitField0_ |= 1;
        this.timestamp_ = d;
    }

    private void setVisibleFragments(int i, String str) {
        str.getClass();
        ensureVisibleFragmentsIsMutable();
        this.visibleFragments_.set(i, str);
    }

    @Override // com.google.protobuf.o
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, Object obj, Object obj2) {
        j26 fr2Var;
        switch (AbstractC0103a.a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new MutationPayload$ViewHierarchy();
            case 2:
                return new w1();
            case 3:
                return com.google.protobuf.o.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001က\u0000\u0002ဉ\u0001\u0003Ț\u0004ဉ\u0002", new Object[]{"bitField0_", "timestamp_", "root_", "visibleFragments_", "rootDelta_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                j26 j26Var = PARSER;
                if (j26Var != null) {
                    return j26Var;
                }
                synchronized (MutationPayload$ViewHierarchy.class) {
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

    public MutationPayload$ViewNode getRoot() {
        MutationPayload$ViewNode mutationPayload$ViewNode = this.root_;
        return mutationPayload$ViewNode == null ? MutationPayload$ViewNode.getDefaultInstance() : mutationPayload$ViewNode;
    }

    public MutationPayload$ViewNodeDelta getRootDelta() {
        MutationPayload$ViewNodeDelta mutationPayload$ViewNodeDelta = this.rootDelta_;
        return mutationPayload$ViewNodeDelta == null ? MutationPayload$ViewNodeDelta.getDefaultInstance() : mutationPayload$ViewNodeDelta;
    }

    public double getTimestamp() {
        return this.timestamp_;
    }

    public String getVisibleFragments(int i) {
        return (String) this.visibleFragments_.get(i);
    }

    public ByteString getVisibleFragmentsBytes(int i) {
        return ByteString.i((String) this.visibleFragments_.get(i));
    }

    public int getVisibleFragmentsCount() {
        return this.visibleFragments_.size();
    }

    public List<String> getVisibleFragmentsList() {
        return this.visibleFragments_;
    }

    public boolean hasRoot() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasRootDelta() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasTimestamp() {
        return (this.bitField0_ & 1) != 0;
    }

    public static w1 newBuilder(MutationPayload$ViewHierarchy mutationPayload$ViewHierarchy) {
        return (w1) DEFAULT_INSTANCE.createBuilder(mutationPayload$ViewHierarchy);
    }

    public static MutationPayload$ViewHierarchy parseDelimitedFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$ViewHierarchy) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$ViewHierarchy parseFrom(ByteBuffer byteBuffer, h72 h72Var) {
        return (MutationPayload$ViewHierarchy) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer, h72Var);
    }

    public static MutationPayload$ViewHierarchy parseFrom(ByteString byteString) {
        return (MutationPayload$ViewHierarchy) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MutationPayload$ViewHierarchy parseFrom(ByteString byteString, h72 h72Var) {
        return (MutationPayload$ViewHierarchy) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString, h72Var);
    }

    public static MutationPayload$ViewHierarchy parseFrom(byte[] bArr) {
        return (MutationPayload$ViewHierarchy) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MutationPayload$ViewHierarchy parseFrom(byte[] bArr, h72 h72Var) {
        return (MutationPayload$ViewHierarchy) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr, h72Var);
    }

    public static MutationPayload$ViewHierarchy parseFrom(InputStream inputStream) {
        return (MutationPayload$ViewHierarchy) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$ViewHierarchy parseFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$ViewHierarchy) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$ViewHierarchy parseFrom(lu0 lu0Var) {
        return (MutationPayload$ViewHierarchy) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var);
    }

    public static MutationPayload$ViewHierarchy parseFrom(lu0 lu0Var, h72 h72Var) {
        return (MutationPayload$ViewHierarchy) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var, h72Var);
    }
}
