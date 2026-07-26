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
public final class MutationPayload$DrawPointsCommandPayload extends com.google.protobuf.o implements fv4 {
    private static final MutationPayload$DrawPointsCommandPayload DEFAULT_INSTANCE;
    public static final int PAINT_INDEX_FIELD_NUMBER = 3;
    private static volatile j26 PARSER = null;
    public static final int POINTS_FIELD_NUMBER = 2;
    public static final int POINT_MODE_FIELD_NUMBER = 1;
    private int bitField0_;
    private int paintIndex_;
    private int pointMode_;
    private rr3 points_ = com.google.protobuf.o.emptyProtobufList();

    static {
        MutationPayload$DrawPointsCommandPayload mutationPayload$DrawPointsCommandPayload = new MutationPayload$DrawPointsCommandPayload();
        DEFAULT_INSTANCE = mutationPayload$DrawPointsCommandPayload;
        com.google.protobuf.o.registerDefaultInstance(MutationPayload$DrawPointsCommandPayload.class, mutationPayload$DrawPointsCommandPayload);
    }

    private MutationPayload$DrawPointsCommandPayload() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPoints(Iterable<? extends MutationPayload$Point> iterable) {
        ensurePointsIsMutable();
        com.google.protobuf.a.addAll((Iterable) iterable, (List) this.points_);
    }

    private void addPoints(MutationPayload$Point mutationPayload$Point) {
        mutationPayload$Point.getClass();
        ensurePointsIsMutable();
        this.points_.add(mutationPayload$Point);
    }

    private void clearPaintIndex() {
        this.bitField0_ &= -3;
        this.paintIndex_ = 0;
    }

    private void clearPointMode() {
        this.bitField0_ &= -2;
        this.pointMode_ = 0;
    }

    private void clearPoints() {
        this.points_ = com.google.protobuf.o.emptyProtobufList();
    }

    private void ensurePointsIsMutable() {
        rr3 rr3Var = this.points_;
        if (((defpackage.z1) rr3Var).a) {
            return;
        }
        this.points_ = com.google.protobuf.o.mutableCopy(rr3Var);
    }

    public static MutationPayload$DrawPointsCommandPayload getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static N newBuilder() {
        return (N) DEFAULT_INSTANCE.createBuilder();
    }

    public static MutationPayload$DrawPointsCommandPayload parseDelimitedFrom(InputStream inputStream) {
        return (MutationPayload$DrawPointsCommandPayload) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$DrawPointsCommandPayload parseFrom(ByteBuffer byteBuffer) {
        return (MutationPayload$DrawPointsCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static j26 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removePoints(int i) {
        ensurePointsIsMutable();
        this.points_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPaintIndex(int i) {
        this.bitField0_ |= 2;
        this.paintIndex_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPointMode(int i) {
        this.bitField0_ |= 1;
        this.pointMode_ = i;
    }

    private void setPoints(int i, MutationPayload$Point mutationPayload$Point) {
        mutationPayload$Point.getClass();
        ensurePointsIsMutable();
        this.points_.set(i, mutationPayload$Point);
    }

    @Override // com.google.protobuf.o
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, Object obj, Object obj2) {
        j26 fr2Var;
        switch (AbstractC0103a.a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new MutationPayload$DrawPointsCommandPayload();
            case 2:
                return new N();
            case 3:
                return com.google.protobuf.o.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001င\u0000\u0002\u001b\u0003င\u0001", new Object[]{"bitField0_", "pointMode_", "points_", MutationPayload$Point.class, "paintIndex_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                j26 j26Var = PARSER;
                if (j26Var != null) {
                    return j26Var;
                }
                synchronized (MutationPayload$DrawPointsCommandPayload.class) {
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

    public int getPaintIndex() {
        return this.paintIndex_;
    }

    public int getPointMode() {
        return this.pointMode_;
    }

    public MutationPayload$Point getPoints(int i) {
        return (MutationPayload$Point) this.points_.get(i);
    }

    public int getPointsCount() {
        return this.points_.size();
    }

    public List<MutationPayload$Point> getPointsList() {
        return this.points_;
    }

    public M0 getPointsOrBuilder(int i) {
        return (M0) this.points_.get(i);
    }

    public List<? extends M0> getPointsOrBuilderList() {
        return this.points_;
    }

    public boolean hasPaintIndex() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasPointMode() {
        return (this.bitField0_ & 1) != 0;
    }

    public static N newBuilder(MutationPayload$DrawPointsCommandPayload mutationPayload$DrawPointsCommandPayload) {
        return (N) DEFAULT_INSTANCE.createBuilder(mutationPayload$DrawPointsCommandPayload);
    }

    public static MutationPayload$DrawPointsCommandPayload parseDelimitedFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$DrawPointsCommandPayload) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$DrawPointsCommandPayload parseFrom(ByteBuffer byteBuffer, h72 h72Var) {
        return (MutationPayload$DrawPointsCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer, h72Var);
    }

    public static MutationPayload$DrawPointsCommandPayload parseFrom(ByteString byteString) {
        return (MutationPayload$DrawPointsCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    private void addPoints(int i, MutationPayload$Point mutationPayload$Point) {
        mutationPayload$Point.getClass();
        ensurePointsIsMutable();
        this.points_.add(i, mutationPayload$Point);
    }

    public static MutationPayload$DrawPointsCommandPayload parseFrom(ByteString byteString, h72 h72Var) {
        return (MutationPayload$DrawPointsCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString, h72Var);
    }

    public static MutationPayload$DrawPointsCommandPayload parseFrom(byte[] bArr) {
        return (MutationPayload$DrawPointsCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MutationPayload$DrawPointsCommandPayload parseFrom(byte[] bArr, h72 h72Var) {
        return (MutationPayload$DrawPointsCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr, h72Var);
    }

    public static MutationPayload$DrawPointsCommandPayload parseFrom(InputStream inputStream) {
        return (MutationPayload$DrawPointsCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$DrawPointsCommandPayload parseFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$DrawPointsCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$DrawPointsCommandPayload parseFrom(lu0 lu0Var) {
        return (MutationPayload$DrawPointsCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var);
    }

    public static MutationPayload$DrawPointsCommandPayload parseFrom(lu0 lu0Var, h72 h72Var) {
        return (MutationPayload$DrawPointsCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var, h72Var);
    }
}
