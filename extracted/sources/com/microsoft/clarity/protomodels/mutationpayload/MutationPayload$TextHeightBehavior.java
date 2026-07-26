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
public final class MutationPayload$TextHeightBehavior extends com.google.protobuf.o implements fv4 {
    public static final int APPLYHEIGHTTOFIRSTASCENT_FIELD_NUMBER = 1;
    public static final int APPLYHEIGHTTOLASTDESCENT_FIELD_NUMBER = 2;
    private static final MutationPayload$TextHeightBehavior DEFAULT_INSTANCE;
    public static final int LEADINGDISTRIBUTION_FIELD_NUMBER = 3;
    private static volatile j26 PARSER;
    private boolean applyHeightToFirstAscent_;
    private boolean applyHeightToLastDescent_;
    private int bitField0_;
    private int leadingDistribution_;

    static {
        MutationPayload$TextHeightBehavior mutationPayload$TextHeightBehavior = new MutationPayload$TextHeightBehavior();
        DEFAULT_INSTANCE = mutationPayload$TextHeightBehavior;
        com.google.protobuf.o.registerDefaultInstance(MutationPayload$TextHeightBehavior.class, mutationPayload$TextHeightBehavior);
    }

    private MutationPayload$TextHeightBehavior() {
    }

    private void clearApplyHeightToFirstAscent() {
        this.bitField0_ &= -2;
        this.applyHeightToFirstAscent_ = false;
    }

    private void clearApplyHeightToLastDescent() {
        this.bitField0_ &= -3;
        this.applyHeightToLastDescent_ = false;
    }

    private void clearLeadingDistribution() {
        this.bitField0_ &= -5;
        this.leadingDistribution_ = 0;
    }

    public static MutationPayload$TextHeightBehavior getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static o1 newBuilder() {
        return (o1) DEFAULT_INSTANCE.createBuilder();
    }

    public static MutationPayload$TextHeightBehavior parseDelimitedFrom(InputStream inputStream) {
        return (MutationPayload$TextHeightBehavior) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$TextHeightBehavior parseFrom(ByteBuffer byteBuffer) {
        return (MutationPayload$TextHeightBehavior) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static j26 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setApplyHeightToFirstAscent(boolean z) {
        this.bitField0_ |= 1;
        this.applyHeightToFirstAscent_ = z;
    }

    private void setApplyHeightToLastDescent(boolean z) {
        this.bitField0_ |= 2;
        this.applyHeightToLastDescent_ = z;
    }

    private void setLeadingDistribution(int i) {
        this.bitField0_ |= 4;
        this.leadingDistribution_ = i;
    }

    @Override // com.google.protobuf.o
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, Object obj, Object obj2) {
        j26 fr2Var;
        switch (AbstractC0103a.a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new MutationPayload$TextHeightBehavior();
            case 2:
                return new o1();
            case 3:
                return com.google.protobuf.o.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003င\u0002", new Object[]{"bitField0_", "applyHeightToFirstAscent_", "applyHeightToLastDescent_", "leadingDistribution_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                j26 j26Var = PARSER;
                if (j26Var != null) {
                    return j26Var;
                }
                synchronized (MutationPayload$TextHeightBehavior.class) {
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

    public boolean getApplyHeightToFirstAscent() {
        return this.applyHeightToFirstAscent_;
    }

    public boolean getApplyHeightToLastDescent() {
        return this.applyHeightToLastDescent_;
    }

    public int getLeadingDistribution() {
        return this.leadingDistribution_;
    }

    public boolean hasApplyHeightToFirstAscent() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasApplyHeightToLastDescent() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasLeadingDistribution() {
        return (this.bitField0_ & 4) != 0;
    }

    public static o1 newBuilder(MutationPayload$TextHeightBehavior mutationPayload$TextHeightBehavior) {
        return (o1) DEFAULT_INSTANCE.createBuilder(mutationPayload$TextHeightBehavior);
    }

    public static MutationPayload$TextHeightBehavior parseDelimitedFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$TextHeightBehavior) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$TextHeightBehavior parseFrom(ByteBuffer byteBuffer, h72 h72Var) {
        return (MutationPayload$TextHeightBehavior) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer, h72Var);
    }

    public static MutationPayload$TextHeightBehavior parseFrom(ByteString byteString) {
        return (MutationPayload$TextHeightBehavior) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MutationPayload$TextHeightBehavior parseFrom(ByteString byteString, h72 h72Var) {
        return (MutationPayload$TextHeightBehavior) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString, h72Var);
    }

    public static MutationPayload$TextHeightBehavior parseFrom(byte[] bArr) {
        return (MutationPayload$TextHeightBehavior) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MutationPayload$TextHeightBehavior parseFrom(byte[] bArr, h72 h72Var) {
        return (MutationPayload$TextHeightBehavior) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr, h72Var);
    }

    public static MutationPayload$TextHeightBehavior parseFrom(InputStream inputStream) {
        return (MutationPayload$TextHeightBehavior) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$TextHeightBehavior parseFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$TextHeightBehavior) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$TextHeightBehavior parseFrom(lu0 lu0Var) {
        return (MutationPayload$TextHeightBehavior) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var);
    }

    public static MutationPayload$TextHeightBehavior parseFrom(lu0 lu0Var, h72 h72Var) {
        return (MutationPayload$TextHeightBehavior) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var, h72Var);
    }
}
