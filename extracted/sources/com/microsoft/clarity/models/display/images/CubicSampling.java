package com.microsoft.clarity.models.display.images;

import com.google.protobuf.o;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$Sampling;
import defpackage.js3;
import defpackage.t61;

/* JADX INFO: loaded from: classes3.dex */
public final class CubicSampling extends Sampling {
    private final float B;
    private final float C;
    private final SamplingType type = SamplingType.CubicSampling;

    public CubicSampling(float f, float f2) {
        this.B = f;
        this.C = f2;
    }

    public static /* synthetic */ CubicSampling copy$default(CubicSampling cubicSampling, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = cubicSampling.B;
        }
        if ((i & 2) != 0) {
            f2 = cubicSampling.C;
        }
        return cubicSampling.copy(f, f2);
    }

    public final float component1() {
        return this.B;
    }

    public final float component2() {
        return this.C;
    }

    public final CubicSampling copy(float f, float f2) {
        return new CubicSampling(f, f2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CubicSampling)) {
            return false;
        }
        CubicSampling cubicSampling = (CubicSampling) obj;
        return Float.compare(this.B, cubicSampling.B) == 0 && Float.compare(this.C, cubicSampling.C) == 0;
    }

    public final float getB() {
        return this.B;
    }

    public final float getC() {
        return this.C;
    }

    @Override // com.microsoft.clarity.models.display.images.Sampling
    public SamplingType getType() {
        return this.type;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.C) + (Float.floatToIntBits(this.B) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CubicSampling(B=");
        sb.append(this.B);
        sb.append(", C=");
        return t61.k(sb, this.C, ')');
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.microsoft.clarity.models.IProtoModel
    public MutationPayload$Sampling toProtobufInstance() {
        o oVarBuild = MutationPayload$Sampling.newBuilder().a(getType().toProtobufType()).a(this.B).b(this.C).build();
        js3.o(oVarBuild, "newBuilder()\n           …C(C)\n            .build()");
        return (MutationPayload$Sampling) oVarBuild;
    }
}
