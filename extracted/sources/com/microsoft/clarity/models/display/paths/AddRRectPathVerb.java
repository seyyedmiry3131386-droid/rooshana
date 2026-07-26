package com.microsoft.clarity.models.display.paths;

import com.google.protobuf.o;
import com.microsoft.clarity.models.display.common.RRect;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$PathVerb;
import defpackage.bl4;
import defpackage.js3;

/* JADX INFO: loaded from: classes3.dex */
public final class AddRRectPathVerb extends PathVerb {
    private final boolean isCCW;
    private final RRect rRect;
    private final PathVerbType type;

    public AddRRectPathVerb(RRect rRect, boolean z) {
        js3.p(rRect, "rRect");
        this.rRect = rRect;
        this.isCCW = z;
        this.type = PathVerbType.AddRRectPathVerb;
    }

    public static /* synthetic */ AddRRectPathVerb copy$default(AddRRectPathVerb addRRectPathVerb, RRect rRect, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            rRect = addRRectPathVerb.rRect;
        }
        if ((i & 2) != 0) {
            z = addRRectPathVerb.isCCW;
        }
        return addRRectPathVerb.copy(rRect, z);
    }

    public final RRect component1() {
        return this.rRect;
    }

    public final boolean component2() {
        return this.isCCW;
    }

    public final AddRRectPathVerb copy(RRect rRect, boolean z) {
        js3.p(rRect, "rRect");
        return new AddRRectPathVerb(rRect, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddRRectPathVerb)) {
            return false;
        }
        AddRRectPathVerb addRRectPathVerb = (AddRRectPathVerb) obj;
        return js3.i(this.rRect, addRRectPathVerb.rRect) && this.isCCW == addRRectPathVerb.isCCW;
    }

    public final RRect getRRect() {
        return this.rRect;
    }

    @Override // com.microsoft.clarity.models.display.paths.PathVerb
    public PathVerbType getType() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public int hashCode() {
        int iHashCode = this.rRect.hashCode() * 31;
        boolean z = this.isCCW;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    public final boolean isCCW() {
        return this.isCCW;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AddRRectPathVerb(rRect=");
        sb.append(this.rRect);
        sb.append(", isCCW=");
        return bl4.A(sb, this.isCCW, ')');
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.microsoft.clarity.models.IProtoModel
    public MutationPayload$PathVerb toProtobufInstance() {
        o oVarBuild = MutationPayload$PathVerb.newBuilder().a(getType().toProtobufType()).a(this.rRect.toProtobufInstance()).a(this.isCCW).build();
        js3.o(oVarBuild, "newBuilder()\n           …CCW)\n            .build()");
        return (MutationPayload$PathVerb) oVarBuild;
    }
}
