package com.microsoft.clarity.models.display.commands;

import com.google.protobuf.o;
import com.microsoft.clarity.protomodels.mutationpayload.L;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$DisplayCommandV2;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$DrawPaintCommandPayload;
import defpackage.js3;

/* JADX INFO: loaded from: classes3.dex */
public final class DrawPaint extends PaintableCommand {
    private final DisplayCommandType type;

    public DrawPaint(Integer num) {
        super(num);
        this.type = DisplayCommandType.DrawPaint;
    }

    @Override // com.microsoft.clarity.models.display.commands.DisplayCommand
    public DisplayCommandType getType() {
        return this.type;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.microsoft.clarity.models.IProtoModel
    public MutationPayload$DisplayCommandV2 toProtobufInstance() {
        L lNewBuilder = MutationPayload$DrawPaintCommandPayload.newBuilder();
        Integer paintIndex = getPaintIndex();
        if (paintIndex != null) {
            lNewBuilder.a(paintIndex.intValue());
        }
        o oVarBuild = MutationPayload$DisplayCommandV2.newBuilder().a(getType().toProtobufType()).a((MutationPayload$DrawPaintCommandPayload) lNewBuilder.build()).build();
        js3.o(oVarBuild, "newBuilder()\n           …d())\n            .build()");
        return (MutationPayload$DisplayCommandV2) oVarBuild;
    }
}
