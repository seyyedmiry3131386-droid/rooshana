package com.microsoft.clarity.models.display.commands;

import com.google.protobuf.o;
import com.microsoft.clarity.models.display.common.RRect;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$ClipRRectCommandPayload;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$DisplayCommandV2;
import defpackage.js3;

/* JADX INFO: loaded from: classes3.dex */
public final class ClipRRect extends ClipCommand {
    private final RRect rrect;
    private final DisplayCommandType type;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClipRRect(RRect rRect, int i, boolean z) {
        super(i, z);
        js3.p(rRect, "rrect");
        this.rrect = rRect;
        this.type = DisplayCommandType.ClipRRect;
    }

    public final RRect getRrect() {
        return this.rrect;
    }

    @Override // com.microsoft.clarity.models.display.commands.DisplayCommand
    public DisplayCommandType getType() {
        return this.type;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.microsoft.clarity.models.IProtoModel
    public MutationPayload$DisplayCommandV2 toProtobufInstance() {
        o oVarBuild = MutationPayload$DisplayCommandV2.newBuilder().a(getType().toProtobufType()).a((MutationPayload$ClipRRectCommandPayload) MutationPayload$ClipRRectCommandPayload.newBuilder().a(this.rrect.toProtobufInstance()).a(getOp()).a(getAntiAlias()).build()).build();
        js3.o(oVarBuild, "newBuilder()\n           …oad)\n            .build()");
        return (MutationPayload$DisplayCommandV2) oVarBuild;
    }
}
