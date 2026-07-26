package com.microsoft.clarity.models.display.paths;

import com.google.protobuf.o;
import com.microsoft.clarity.j.a;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$PathVerb;
import defpackage.js3;
import defpackage.t61;

/* JADX INFO: loaded from: classes3.dex */
public final class CubicPathVerb extends PathVerb {
    private final float cpx1;
    private final float cpx2;
    private final float cpy1;
    private final float cpy2;
    private final PathVerbType type = PathVerbType.CubicPathVerb;
    private final float x;
    private final float y;

    public CubicPathVerb(float f, float f2, float f3, float f4, float f5, float f6) {
        this.cpx1 = f;
        this.cpy1 = f2;
        this.cpx2 = f3;
        this.cpy2 = f4;
        this.x = f5;
        this.y = f6;
    }

    public static /* synthetic */ CubicPathVerb copy$default(CubicPathVerb cubicPathVerb, float f, float f2, float f3, float f4, float f5, float f6, int i, Object obj) {
        if ((i & 1) != 0) {
            f = cubicPathVerb.cpx1;
        }
        if ((i & 2) != 0) {
            f2 = cubicPathVerb.cpy1;
        }
        if ((i & 4) != 0) {
            f3 = cubicPathVerb.cpx2;
        }
        if ((i & 8) != 0) {
            f4 = cubicPathVerb.cpy2;
        }
        if ((i & 16) != 0) {
            f5 = cubicPathVerb.x;
        }
        if ((i & 32) != 0) {
            f6 = cubicPathVerb.y;
        }
        float f7 = f5;
        float f8 = f6;
        return cubicPathVerb.copy(f, f2, f3, f4, f7, f8);
    }

    public final float component1() {
        return this.cpx1;
    }

    public final float component2() {
        return this.cpy1;
    }

    public final float component3() {
        return this.cpx2;
    }

    public final float component4() {
        return this.cpy2;
    }

    public final float component5() {
        return this.x;
    }

    public final float component6() {
        return this.y;
    }

    public final CubicPathVerb copy(float f, float f2, float f3, float f4, float f5, float f6) {
        return new CubicPathVerb(f, f2, f3, f4, f5, f6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CubicPathVerb)) {
            return false;
        }
        CubicPathVerb cubicPathVerb = (CubicPathVerb) obj;
        return Float.compare(this.cpx1, cubicPathVerb.cpx1) == 0 && Float.compare(this.cpy1, cubicPathVerb.cpy1) == 0 && Float.compare(this.cpx2, cubicPathVerb.cpx2) == 0 && Float.compare(this.cpy2, cubicPathVerb.cpy2) == 0 && Float.compare(this.x, cubicPathVerb.x) == 0 && Float.compare(this.y, cubicPathVerb.y) == 0;
    }

    public final float getCpx1() {
        return this.cpx1;
    }

    public final float getCpx2() {
        return this.cpx2;
    }

    public final float getCpy1() {
        return this.cpy1;
    }

    public final float getCpy2() {
        return this.cpy2;
    }

    @Override // com.microsoft.clarity.models.display.paths.PathVerb
    public PathVerbType getType() {
        return this.type;
    }

    public final float getX() {
        return this.x;
    }

    public final float getY() {
        return this.y;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.y) + a.a(this.x, a.a(this.cpy2, a.a(this.cpx2, a.a(this.cpy1, Float.floatToIntBits(this.cpx1) * 31, 31), 31), 31), 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CubicPathVerb(cpx1=");
        sb.append(this.cpx1);
        sb.append(", cpy1=");
        sb.append(this.cpy1);
        sb.append(", cpx2=");
        sb.append(this.cpx2);
        sb.append(", cpy2=");
        sb.append(this.cpy2);
        sb.append(", x=");
        sb.append(this.x);
        sb.append(", y=");
        return t61.k(sb, this.y, ')');
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.microsoft.clarity.models.IProtoModel
    public MutationPayload$PathVerb toProtobufInstance() {
        o oVarBuild = MutationPayload$PathVerb.newBuilder().a(getType().toProtobufType()).a(this.cpx1).c(this.cpy1).b(this.cpx2).d(this.cpy2).f(this.x).i(this.y).build();
        js3.o(oVarBuild, "newBuilder()\n           …Y(y)\n            .build()");
        return (MutationPayload$PathVerb) oVarBuild;
    }
}
