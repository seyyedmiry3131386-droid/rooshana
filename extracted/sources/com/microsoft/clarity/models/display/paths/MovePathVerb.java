package com.microsoft.clarity.models.display.paths;

import com.google.protobuf.o;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$PathVerb;
import defpackage.js3;
import defpackage.t61;

/* JADX INFO: loaded from: classes3.dex */
public final class MovePathVerb extends PathVerb {
    private final PathVerbType type = PathVerbType.MovePathVerb;
    private final float x;
    private final float y;

    public MovePathVerb(float f, float f2) {
        this.x = f;
        this.y = f2;
    }

    public static /* synthetic */ MovePathVerb copy$default(MovePathVerb movePathVerb, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = movePathVerb.x;
        }
        if ((i & 2) != 0) {
            f2 = movePathVerb.y;
        }
        return movePathVerb.copy(f, f2);
    }

    public final float component1() {
        return this.x;
    }

    public final float component2() {
        return this.y;
    }

    public final MovePathVerb copy(float f, float f2) {
        return new MovePathVerb(f, f2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MovePathVerb)) {
            return false;
        }
        MovePathVerb movePathVerb = (MovePathVerb) obj;
        return Float.compare(this.x, movePathVerb.x) == 0 && Float.compare(this.y, movePathVerb.y) == 0;
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
        StringBuilder sb = new StringBuilder("MovePathVerb(x=");
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
