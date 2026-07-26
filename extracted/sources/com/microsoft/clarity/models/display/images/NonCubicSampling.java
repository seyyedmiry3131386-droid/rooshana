package com.microsoft.clarity.models.display.images;

import com.google.protobuf.o;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$Sampling;
import defpackage.dw1;
import defpackage.js3;

/* JADX INFO: loaded from: classes3.dex */
public final class NonCubicSampling extends Sampling {
    private final int filter;
    private final int mipmap;
    private final SamplingType type = SamplingType.NonCubicSampling;

    public NonCubicSampling(int i, int i2) {
        this.filter = i;
        this.mipmap = i2;
    }

    public static /* synthetic */ NonCubicSampling copy$default(NonCubicSampling nonCubicSampling, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = nonCubicSampling.filter;
        }
        if ((i3 & 2) != 0) {
            i2 = nonCubicSampling.mipmap;
        }
        return nonCubicSampling.copy(i, i2);
    }

    public final int component1() {
        return this.filter;
    }

    public final int component2() {
        return this.mipmap;
    }

    public final NonCubicSampling copy(int i, int i2) {
        return new NonCubicSampling(i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NonCubicSampling)) {
            return false;
        }
        NonCubicSampling nonCubicSampling = (NonCubicSampling) obj;
        return this.filter == nonCubicSampling.filter && this.mipmap == nonCubicSampling.mipmap;
    }

    public final int getFilter() {
        return this.filter;
    }

    public final int getMipmap() {
        return this.mipmap;
    }

    @Override // com.microsoft.clarity.models.display.images.Sampling
    public SamplingType getType() {
        return this.type;
    }

    public int hashCode() {
        return this.mipmap + (this.filter * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NonCubicSampling(filter=");
        sb.append(this.filter);
        sb.append(", mipmap=");
        return dw1.q(sb, this.mipmap, ')');
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.microsoft.clarity.models.IProtoModel
    public MutationPayload$Sampling toProtobufInstance() {
        o oVarBuild = MutationPayload$Sampling.newBuilder().a(getType().toProtobufType()).a(this.filter).c(this.mipmap).build();
        js3.o(oVarBuild, "newBuilder()\n           …map)\n            .build()");
        return (MutationPayload$Sampling) oVarBuild;
    }
}
