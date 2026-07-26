package com.microsoft.clarity.models.display.paints.patheffects;

import com.google.protobuf.o;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$PathEffect;
import defpackage.js3;
import defpackage.t61;

/* JADX INFO: loaded from: classes3.dex */
public final class CornerPathEffect extends PathEffect {
    private final float radius;
    private final PathEffectType type = PathEffectType.CornerPathEffect;

    public CornerPathEffect(float f) {
        this.radius = f;
    }

    public static /* synthetic */ CornerPathEffect copy$default(CornerPathEffect cornerPathEffect, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = cornerPathEffect.radius;
        }
        return cornerPathEffect.copy(f);
    }

    public final float component1() {
        return this.radius;
    }

    public final CornerPathEffect copy(float f) {
        return new CornerPathEffect(f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CornerPathEffect) && Float.compare(this.radius, ((CornerPathEffect) obj).radius) == 0;
    }

    public final float getRadius() {
        return this.radius;
    }

    @Override // com.microsoft.clarity.models.display.paints.patheffects.PathEffect
    public PathEffectType getType() {
        return this.type;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.radius);
    }

    public String toString() {
        return t61.k(new StringBuilder("CornerPathEffect(radius="), this.radius, ')');
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.microsoft.clarity.models.IProtoModel
    public MutationPayload$PathEffect toProtobufInstance() {
        o oVarBuild = MutationPayload$PathEffect.newBuilder().a(getType().toProtobufType()).c(this.radius).build();
        js3.o(oVarBuild, "newBuilder()\n           …ius)\n            .build()");
        return (MutationPayload$PathEffect) oVarBuild;
    }
}
