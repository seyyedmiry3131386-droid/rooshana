package com.microsoft.clarity.models.display.paths;

import com.google.protobuf.o;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$PathVerb;
import defpackage.js3;

/* JADX INFO: loaded from: classes3.dex */
public final class ClosePathVerb extends PathVerb {
    private final PathVerbType type = PathVerbType.ClosePathVerb;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ClosePathVerb.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type com.microsoft.clarity.models.display.paths.ClosePathVerb");
        return getType() == ((ClosePathVerb) obj).getType();
    }

    @Override // com.microsoft.clarity.models.display.paths.PathVerb
    public PathVerbType getType() {
        return this.type;
    }

    public int hashCode() {
        return getType().hashCode();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.microsoft.clarity.models.IProtoModel
    public MutationPayload$PathVerb toProtobufInstance() {
        o oVarBuild = MutationPayload$PathVerb.newBuilder().a(getType().toProtobufType()).build();
        js3.o(oVarBuild, "newBuilder()\n           …e())\n            .build()");
        return (MutationPayload$PathVerb) oVarBuild;
    }
}
