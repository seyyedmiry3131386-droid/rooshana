package com.microsoft.clarity.models.display.paths;

import com.google.protobuf.o;
import com.microsoft.clarity.j.a;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$PathVerb;
import defpackage.js3;
import defpackage.t61;

/* JADX INFO: loaded from: classes3.dex */
public final class ConicPathVerb extends PathVerb {
    private final PathVerbType type = PathVerbType.ConicPathVerb;
    private final float weight;
    private final float x1;
    private final float x2;
    private final float y1;
    private final float y2;

    public ConicPathVerb(float f, float f2, float f3, float f4, float f5) {
        this.x1 = f;
        this.y1 = f2;
        this.x2 = f3;
        this.y2 = f4;
        this.weight = f5;
    }

    public static /* synthetic */ ConicPathVerb copy$default(ConicPathVerb conicPathVerb, float f, float f2, float f3, float f4, float f5, int i, Object obj) {
        if ((i & 1) != 0) {
            f = conicPathVerb.x1;
        }
        if ((i & 2) != 0) {
            f2 = conicPathVerb.y1;
        }
        if ((i & 4) != 0) {
            f3 = conicPathVerb.x2;
        }
        if ((i & 8) != 0) {
            f4 = conicPathVerb.y2;
        }
        if ((i & 16) != 0) {
            f5 = conicPathVerb.weight;
        }
        float f6 = f5;
        float f7 = f3;
        return conicPathVerb.copy(f, f2, f7, f4, f6);
    }

    public final float component1() {
        return this.x1;
    }

    public final float component2() {
        return this.y1;
    }

    public final float component3() {
        return this.x2;
    }

    public final float component4() {
        return this.y2;
    }

    public final float component5() {
        return this.weight;
    }

    public final ConicPathVerb copy(float f, float f2, float f3, float f4, float f5) {
        return new ConicPathVerb(f, f2, f3, f4, f5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConicPathVerb)) {
            return false;
        }
        ConicPathVerb conicPathVerb = (ConicPathVerb) obj;
        return Float.compare(this.x1, conicPathVerb.x1) == 0 && Float.compare(this.y1, conicPathVerb.y1) == 0 && Float.compare(this.x2, conicPathVerb.x2) == 0 && Float.compare(this.y2, conicPathVerb.y2) == 0 && Float.compare(this.weight, conicPathVerb.weight) == 0;
    }

    @Override // com.microsoft.clarity.models.display.paths.PathVerb
    public PathVerbType getType() {
        return this.type;
    }

    public final float getWeight() {
        return this.weight;
    }

    public final float getX1() {
        return this.x1;
    }

    public final float getX2() {
        return this.x2;
    }

    public final float getY1() {
        return this.y1;
    }

    public final float getY2() {
        return this.y2;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.weight) + a.a(this.y2, a.a(this.x2, a.a(this.y1, Float.floatToIntBits(this.x1) * 31, 31), 31), 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ConicPathVerb(x1=");
        sb.append(this.x1);
        sb.append(", y1=");
        sb.append(this.y1);
        sb.append(", x2=");
        sb.append(this.x2);
        sb.append(", y2=");
        sb.append(this.y2);
        sb.append(", weight=");
        return t61.k(sb, this.weight, ')');
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.microsoft.clarity.models.IProtoModel
    public MutationPayload$PathVerb toProtobufInstance() {
        o oVarBuild = MutationPayload$PathVerb.newBuilder().a(getType().toProtobufType()).g(this.x1).j(this.y1).h(this.x2).k(this.y2).e(this.weight).build();
        js3.o(oVarBuild, "newBuilder()\n           …ght)\n            .build()");
        return (MutationPayload$PathVerb) oVarBuild;
    }
}
