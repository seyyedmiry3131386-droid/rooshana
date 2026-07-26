package com.microsoft.clarity.models.display.commands;

import com.google.protobuf.o;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$ClipPathCommandPayload;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$DisplayCommandV2;
import defpackage.js3;

/* JADX INFO: loaded from: classes3.dex */
public final class ClipPath extends ClipCommand {
    private final int pathIndex;
    private final DisplayCommandType type;

    public ClipPath(int i, int i2, boolean z) {
        super(i2, z);
        this.pathIndex = i;
        this.type = DisplayCommandType.ClipPath;
    }

    public final int getPathIndex() {
        return this.pathIndex;
    }

    @Override // com.microsoft.clarity.models.display.commands.DisplayCommand
    public DisplayCommandType getType() {
        return this.type;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.microsoft.clarity.models.IProtoModel
    public MutationPayload$DisplayCommandV2 toProtobufInstance() {
        o oVarBuild = MutationPayload$DisplayCommandV2.newBuilder().a(getType().toProtobufType()).a((MutationPayload$ClipPathCommandPayload) MutationPayload$ClipPathCommandPayload.newBuilder().b(this.pathIndex).a(getOp()).a(getAntiAlias()).build()).build();
        js3.o(oVarBuild, "newBuilder()\n           …oad)\n            .build()");
        return (MutationPayload$DisplayCommandV2) oVarBuild;
    }
}
