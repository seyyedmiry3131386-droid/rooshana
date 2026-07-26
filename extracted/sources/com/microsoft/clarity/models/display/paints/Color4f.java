package com.microsoft.clarity.models.display.paints;

import com.google.protobuf.o;
import com.microsoft.clarity.j.a;
import com.microsoft.clarity.models.IProtoModel;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$Color4f;
import defpackage.js3;
import defpackage.t61;

/* JADX INFO: loaded from: classes3.dex */
public final class Color4f implements IProtoModel<MutationPayload$Color4f> {
    private final float a;
    private final float b;
    private final float g;
    private final float r;

    public Color4f(float f, float f2, float f3, float f4) {
        this.r = f;
        this.g = f2;
        this.b = f3;
        this.a = f4;
    }

    public static /* synthetic */ Color4f copy$default(Color4f color4f, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = color4f.r;
        }
        if ((i & 2) != 0) {
            f2 = color4f.g;
        }
        if ((i & 4) != 0) {
            f3 = color4f.b;
        }
        if ((i & 8) != 0) {
            f4 = color4f.a;
        }
        return color4f.copy(f, f2, f3, f4);
    }

    public final float component1() {
        return this.r;
    }

    public final float component2() {
        return this.g;
    }

    public final float component3() {
        return this.b;
    }

    public final float component4() {
        return this.a;
    }

    public final Color4f copy(float f, float f2, float f3, float f4) {
        return new Color4f(f, f2, f3, f4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Color4f)) {
            return false;
        }
        Color4f color4f = (Color4f) obj;
        return Float.compare(this.r, color4f.r) == 0 && Float.compare(this.g, color4f.g) == 0 && Float.compare(this.b, color4f.b) == 0 && Float.compare(this.a, color4f.a) == 0;
    }

    public final float getA() {
        return this.a;
    }

    public final float getB() {
        return this.b;
    }

    public final float getG() {
        return this.g;
    }

    public final float getR() {
        return this.r;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.a) + a.a(this.b, a.a(this.g, Float.floatToIntBits(this.r) * 31, 31), 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Color4f(r=");
        sb.append(this.r);
        sb.append(", g=");
        sb.append(this.g);
        sb.append(", b=");
        sb.append(this.b);
        sb.append(", a=");
        return t61.k(sb, this.a, ')');
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.microsoft.clarity.models.IProtoModel
    public MutationPayload$Color4f toProtobufInstance() {
        o oVarBuild = MutationPayload$Color4f.newBuilder().a(this.a).b(this.b).c(this.g).d(this.r).build();
        js3.o(oVarBuild, "newBuilder()\n           …R(r)\n            .build()");
        return (MutationPayload$Color4f) oVarBuild;
    }
}
