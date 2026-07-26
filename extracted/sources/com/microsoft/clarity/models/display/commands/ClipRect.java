package com.microsoft.clarity.models.display.commands;

import com.google.protobuf.o;
import com.microsoft.clarity.models.display.common.Rect;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$ClipRectCommandPayload;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$DisplayCommandV2;
import defpackage.js3;

/* JADX INFO: loaded from: classes3.dex */
public final class ClipRect extends ClipCommand {
    private final Rect rect;
    private final DisplayCommandType type;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClipRect(Rect rect, int i, boolean z) {
        super(i, z);
        js3.p(rect, "rect");
        this.rect = rect;
        this.type = DisplayCommandType.ClipRect;
    }

    public final Rect getRect() {
        return this.rect;
    }

    @Override // com.microsoft.clarity.models.display.commands.DisplayCommand
    public DisplayCommandType getType() {
        return this.type;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.microsoft.clarity.models.IProtoModel
    public MutationPayload$DisplayCommandV2 toProtobufInstance() {
        o oVarBuild = MutationPayload$DisplayCommandV2.newBuilder().a(getType().toProtobufType()).a((MutationPayload$ClipRectCommandPayload) MutationPayload$ClipRectCommandPayload.newBuilder().a(this.rect.toProtobufInstance()).a(getOp()).a(getAntiAlias()).build()).build();
        js3.o(oVarBuild, "newBuilder()\n           …oad)\n            .build()");
        return (MutationPayload$DisplayCommandV2) oVarBuild;
    }
}
