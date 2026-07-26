package com.microsoft.clarity.models.display.paths;

import com.google.protobuf.o;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$PathVerb;
import defpackage.js3;
import defpackage.t61;

/* JADX INFO: loaded from: classes3.dex */
public final class LinePathVerb extends PathVerb {
    private final PathVerbType type = PathVerbType.LinePathVerb;
    private final float x;
    private final float y;

    public LinePathVerb(float f, float f2) {
        this.x = f;
        this.y = f2;
    }

    public static /* synthetic */ LinePathVerb copy$default(LinePathVerb linePathVerb, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = linePathVerb.x;
        }
        if ((i & 2) != 0) {
            f2 = linePathVerb.y;
        }
        return linePathVerb.copy(f, f2);
    }

    public final float component1() {
        return this.x;
    }

    public final float component2() {
        return this.y;
    }

    public final LinePathVerb copy(float f, float f2) {
        return new LinePathVerb(f, f2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinePathVerb)) {
            return false;
        }
        LinePathVerb linePathVerb = (LinePathVerb) obj;
        return Float.compare(this.x, linePathVerb.x) == 0 && Float.compare(this.y, linePathVerb.y) == 0;
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
        return Float.floatToIntBits(this.y) + (Float.floatToIntBits(this.x) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LinePathVerb(x=");
        sb.append(this.x);
        sb.append(", y=");
        return t61.k(sb, this.y, ')');
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.microsoft.clarity.models.IProtoModel
    public MutationPayload$PathVerb toProtobufInstance() {
        o oVarBuild = MutationPayload$PathVerb.newBuilder().a(getType().toProtobufType()).f(this.x).i(this.y).build();
        js3.o(oVarBuild, "newBuilder()\n           …Y(y)\n            .build()");
        return (MutationPayload$PathVerb) oVarBuild;
    }
}
