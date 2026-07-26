package com.microsoft.clarity.models.display.paints.patheffects;

import com.google.protobuf.o;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$PathEffect;
import defpackage.dw1;
import defpackage.js3;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class DashPathEffect extends PathEffect {
    private final List<Float> intervals;
    private final float phase;
    private final PathEffectType type;

    public DashPathEffect(float f, List<Float> list) {
        js3.p(list, "intervals");
        this.phase = f;
        this.intervals = list;
        this.type = PathEffectType.DashPathEffect;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DashPathEffect copy$default(DashPathEffect dashPathEffect, float f, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            f = dashPathEffect.phase;
        }
        if ((i & 2) != 0) {
            list = dashPathEffect.intervals;
        }
        return dashPathEffect.copy(f, list);
    }

    public final float component1() {
        return this.phase;
    }

    public final List<Float> component2() {
        return this.intervals;
    }

    public final DashPathEffect copy(float f, List<Float> list) {
        js3.p(list, "intervals");
        return new DashPathEffect(f, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DashPathEffect)) {
            return false;
        }
        DashPathEffect dashPathEffect = (DashPathEffect) obj;
        return Float.compare(this.phase, dashPathEffect.phase) == 0 && js3.i(this.intervals, dashPathEffect.intervals);
    }

    public final List<Float> getIntervals() {
        return this.intervals;
    }

    public final float getPhase() {
        return this.phase;
    }

    @Override // com.microsoft.clarity.models.display.paints.patheffects.PathEffect
    public PathEffectType getType() {
        return this.type;
    }

    public int hashCode() {
        return this.intervals.hashCode() + (Float.floatToIntBits(this.phase) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DashPathEffect(phase=");
        sb.append(this.phase);
        sb.append(", intervals=");
        return dw1.t(sb, this.intervals, ')');
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.microsoft.clarity.models.IProtoModel
    public MutationPayload$PathEffect toProtobufInstance() {
        o oVarBuild = MutationPayload$PathEffect.newBuilder().a(getType().toProtobufType()).b(this.phase).a(this.intervals).build();
        js3.o(oVarBuild, "newBuilder()\n           …als)\n            .build()");
        return (MutationPayload$PathEffect) oVarBuild;
    }
}
