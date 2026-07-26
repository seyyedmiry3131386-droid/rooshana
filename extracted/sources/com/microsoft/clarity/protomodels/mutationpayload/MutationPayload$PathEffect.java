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
public final class MutationPayload$PathEffect extends com.google.protobuf.o implements fv4 {
    public static final int ADVANCE_FIELD_NUMBER = 6;
    private static final MutationPayload$PathEffect DEFAULT_INSTANCE;
    public static final int INTERVALS_FIELD_NUMBER = 3;
    private static volatile j26 PARSER = null;
    public static final int PATH_FIELD_NUMBER = 8;
    public static final int PHASE_FIELD_NUMBER = 2;
    public static final int RADIUS_FIELD_NUMBER = 5;
    public static final int STYLE_FIELD_NUMBER = 7;
    public static final int TYPEENUM_FIELD_NUMBER = 4;
    public static final int TYPE_FIELD_NUMBER = 1;
    private float advance_;
    private int bitField0_;
    private MutationPayload$Path path_;
    private float phase_;
    private float radius_;
    private long style_;
    private Object typeOneOf_;
    private int typeOneOfCase_ = 0;
    private int intervalsMemoizedSerializedSize = -1;
    private or3 intervals_ = com.google.protobuf.o.emptyFloatList();

    static {
        MutationPayload$PathEffect mutationPayload$PathEffect = new MutationPayload$PathEffect();
        DEFAULT_INSTANCE = mutationPayload$PathEffect;
        com.google.protobuf.o.registerDefaultInstance(MutationPayload$PathEffect.class, mutationPayload$PathEffect);
    }

    private MutationPayload$PathEffect() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllIntervals(Iterable<? extends Float> iterable) {
        ensureIntervalsIsMutable();
        com.google.protobuf.a.addAll((Iterable) iterable, (List) this.intervals_);
    }

    private void addIntervals(float f) {
        ensureIntervalsIsMutable();
        ((de2) this.intervals_).c(f);
    }

    private void clearAdvance() {
        this.bitField0_ &= -5;
        this.advance_ = 0.0f;
    }

    private void clearIntervals() {
        this.intervals_ = com.google.protobuf.o.emptyFloatList();
    }

    private void clearPath() {
        this.path_ = null;
        this.bitField0_ &= -17;
    }

    private void clearPhase() {
        this.bitField0_ &= -2;
        this.phase_ = 0.0f;
    }

    private void clearRadius() {
        this.bitField0_ &= -3;
        this.radius_ = 0.0f;
    }

    private void clearStyle() {
        this.bitField0_ &= -9;
        this.style_ = 0L;
    }

    private void clearType() {
        if (this.typeOneOfCase_ == 1) {
            this.typeOneOfCase_ = 0;
            this.typeOneOf_ = null;
        }
    }

    private void clearTypeEnum() {
        if (this.typeOneOfCase_ == 4) {
            this.typeOneOfCase_ = 0;
            this.typeOneOf_ = null;
        }
    }

    private void clearTypeOneOf() {
        this.typeOneOfCase_ = 0;
        this.typeOneOf_ = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void ensureIntervalsIsMutable() {
        or3 or3Var = this.intervals_;
        if (((defpackage.z1) or3Var).a) {
            return;
        }
        this.intervals_ = com.google.protobuf.o.mutableCopy(or3Var);
    }

    public static MutationPayload$PathEffect getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergePath(MutationPayload$Path mutationPayload$Path) {
        mutationPayload$Path.getClass();
        MutationPayload$Path mutationPayload$Path2 = this.path_;
        if (mutationPayload$Path2 == null || mutationPayload$Path2 == MutationPayload$Path.getDefaultInstance()) {
            this.path_ = mutationPayload$Path;
        } else {
            this.path_ = (MutationPayload$Path) ((A0) MutationPayload$Path.newBuilder(this.path_).mergeFrom((com.google.protobuf.o) mutationPayload$Path)).buildPartial();
        }
        this.bitField0_ |= 16;
    }

    public static B0 newBuilder() {
        return (B0) DEFAULT_INSTANCE.createBuilder();
    }

    public static MutationPayload$PathEffect parseDelimitedFrom(InputStream inputStream) {
        return (MutationPayload$PathEffect) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$PathEffect parseFrom(ByteBuffer byteBuffer) {
        return (MutationPayload$PathEffect) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static j26 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdvance(float f) {
        this.bitField0_ |= 4;
        this.advance_ = f;
    }

    private void setIntervals(int i, float f) {
        ensureIntervalsIsMutable();
        ((de2) this.intervals_).f(i, f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPath(MutationPayload$Path mutationPayload$Path) {
        mutationPayload$Path.getClass();
        this.path_ = mutationPayload$Path;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPhase(float f) {
        this.bitField0_ |= 1;
        this.phase_ = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRadius(float f) {
        this.bitField0_ |= 2;
        this.radius_ = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStyle(long j) {
        this.bitField0_ |= 8;
        this.style_ = j;
    }

    private void setType(String str) {
        str.getClass();
        this.typeOneOfCase_ = 1;
        this.typeOneOf_ = str;
    }

    private void setTypeBytes(ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.typeOneOf_ = byteString.w();
        this.typeOneOfCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeEnum(D0 d0) {
        this.typeOneOf_ = Integer.valueOf(d0.getNumber());
        this.typeOneOfCase_ = 4;
    }

    private void setTypeEnumValue(int i) {
        this.typeOneOfCase_ = 4;
        this.typeOneOf_ = Integer.valueOf(i);
    }

    @Override // com.google.protobuf.o
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, Object obj, Object obj2) {
        j26 fr2Var;
        switch (AbstractC0103a.a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new MutationPayload$PathEffect();
            case 2:
                return new B0();
            case 3:
                return com.google.protobuf.o.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0001\u0001\u0001\b\b\u0000\u0001\u0000\u0001Ȼ\u0000\u0002ခ\u0000\u0003$\u0004?\u0000\u0005ခ\u0001\u0006ခ\u0002\u0007ဂ\u0003\bဉ\u0004", new Object[]{"typeOneOf_", "typeOneOfCase_", "bitField0_", "phase_", "intervals_", "radius_", "advance_", "style_", "path_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                j26 j26Var = PARSER;
                if (j26Var != null) {
                    return j26Var;
                }
                synchronized (MutationPayload$PathEffect.class) {
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

    public float getAdvance() {
        return this.advance_;
    }

    public float getIntervals(int i) {
        return ((de2) this.intervals_).e(i);
    }

    public int getIntervalsCount() {
        return ((de2) this.intervals_).size();
    }

    public List<Float> getIntervalsList() {
        return this.intervals_;
    }

    public MutationPayload$Path getPath() {
        MutationPayload$Path mutationPayload$Path = this.path_;
        return mutationPayload$Path == null ? MutationPayload$Path.getDefaultInstance() : mutationPayload$Path;
    }

    public float getPhase() {
        return this.phase_;
    }

    public float getRadius() {
        return this.radius_;
    }

    public long getStyle() {
        return this.style_;
    }

    @Deprecated
    public String getType() {
        return this.typeOneOfCase_ == 1 ? (String) this.typeOneOf_ : "";
    }

    @Deprecated
    public ByteString getTypeBytes() {
        return ByteString.i(this.typeOneOfCase_ == 1 ? (String) this.typeOneOf_ : "");
    }

    public D0 getTypeEnum() {
        if (this.typeOneOfCase_ != 4) {
            return D0.DashPathEffect;
        }
        int iIntValue = ((Integer) this.typeOneOf_).intValue();
        D0 d0 = iIntValue != 0 ? iIntValue != 1 ? iIntValue != 2 ? null : D0.Path1DPathEffect : D0.CornerPathEffect : D0.DashPathEffect;
        return d0 == null ? D0.UNRECOGNIZED : d0;
    }

    public int getTypeEnumValue() {
        if (this.typeOneOfCase_ == 4) {
            return ((Integer) this.typeOneOf_).intValue();
        }
        return 0;
    }

    public C0 getTypeOneOfCase() {
        int i = this.typeOneOfCase_;
        if (i == 0) {
            return C0.TYPEONEOF_NOT_SET;
        }
        if (i == 1) {
            return C0.TYPE;
        }
        if (i != 4) {
            return null;
        }
        return C0.TYPEENUM;
    }

    public boolean hasAdvance() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasPath() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasPhase() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasRadius() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasStyle() {
        return (this.bitField0_ & 8) != 0;
    }

    @Deprecated
    public boolean hasType() {
        return this.typeOneOfCase_ == 1;
    }

    public boolean hasTypeEnum() {
        return this.typeOneOfCase_ == 4;
    }

    public static B0 newBuilder(MutationPayload$PathEffect mutationPayload$PathEffect) {
        return (B0) DEFAULT_INSTANCE.createBuilder(mutationPayload$PathEffect);
    }

    public static MutationPayload$PathEffect parseDelimitedFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$PathEffect) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$PathEffect parseFrom(ByteBuffer byteBuffer, h72 h72Var) {
        return (MutationPayload$PathEffect) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer, h72Var);
    }

    public static MutationPayload$PathEffect parseFrom(ByteString byteString) {
        return (MutationPayload$PathEffect) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MutationPayload$PathEffect parseFrom(ByteString byteString, h72 h72Var) {
        return (MutationPayload$PathEffect) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString, h72Var);
    }

    public static MutationPayload$PathEffect parseFrom(byte[] bArr) {
        return (MutationPayload$PathEffect) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MutationPayload$PathEffect parseFrom(byte[] bArr, h72 h72Var) {
        return (MutationPayload$PathEffect) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr, h72Var);
    }

    public static MutationPayload$PathEffect parseFrom(InputStream inputStream) {
        return (MutationPayload$PathEffect) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$PathEffect parseFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$PathEffect) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$PathEffect parseFrom(lu0 lu0Var) {
        return (MutationPayload$PathEffect) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var);
    }

    public static MutationPayload$PathEffect parseFrom(lu0 lu0Var, h72 h72Var) {
        return (MutationPayload$PathEffect) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var, h72Var);
    }
}
