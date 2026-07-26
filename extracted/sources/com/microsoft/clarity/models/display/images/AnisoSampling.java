package com.microsoft.clarity.models.display.images;

import com.google.protobuf.o;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$Sampling;
import defpackage.dw1;
import defpackage.js3;

/* JADX INFO: loaded from: classes3.dex */
public final class AnisoSampling extends Sampling {
    private final int maxAniso;
    private final SamplingType type = SamplingType.AnisoSampling;

    public AnisoSampling(int i) {
        this.maxAniso = i;
    }

    public static /* synthetic */ AnisoSampling copy$default(AnisoSampling anisoSampling, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = anisoSampling.maxAniso;
        }
        return anisoSampling.copy(i);
    }

    public final int component1() {
        return this.maxAniso;
    }

    public final AnisoSampling copy(int i) {
        return new AnisoSampling(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AnisoSampling) && this.maxAniso == ((AnisoSampling) obj).maxAniso;
    }

    public final int getMaxAniso() {
        return this.maxAniso;
    }

    @Override // com.microsoft.clarity.models.display.images.Sampling
    public SamplingType getType() {
        return this.type;
    }

    public int hashCode() {
        return this.maxAniso;
    }

    public String toString() {
        return dw1.q(new StringBuilder("AnisoSampling(maxAniso="), this.maxAniso, ')');
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.microsoft.clarity.models.IProtoModel
    public MutationPayload$Sampling toProtobufInstance() {
        o oVarBuild = MutationPayload$Sampling.newBuilder().a(getType().toProtobufType()).b(this.maxAniso).build();
        js3.o(oVarBuild, "newBuilder()\n           …iso)\n            .build()");
        return (MutationPayload$Sampling) oVarBuild;
    }
}
