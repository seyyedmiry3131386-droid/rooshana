package com.microsoft.clarity.models.display.commands;

import com.google.protobuf.o;
import com.microsoft.clarity.protomodels.mutationpayload.B;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$DisplayCommandV2;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$DrawBehindPaintCommandPayload;
import defpackage.js3;

/* JADX INFO: loaded from: classes3.dex */
public final class DrawBehindPaint extends PaintableCommand {
    private final DisplayCommandType type;

    public DrawBehindPaint(Integer num) {
        super(num);
        this.type = DisplayCommandType.DrawBehindPaint;
    }

    @Override // com.microsoft.clarity.models.display.commands.DisplayCommand
    public DisplayCommandType getType() {
        return this.type;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.microsoft.clarity.models.IProtoModel
    public MutationPayload$DisplayCommandV2 toProtobufInstance() {
        B bNewBuilder = MutationPayload$DrawBehindPaintCommandPayload.newBuilder();
        Integer paintIndex = getPaintIndex();
        if (paintIndex != null) {
            bNewBuilder.a(paintIndex.intValue());
        }
        o oVarBuild = MutationPayload$DisplayCommandV2.newBuilder().a(getType().toProtobufType()).a((MutationPayload$DrawBehindPaintCommandPayload) bNewBuilder.build()).build();
        js3.o(oVarBuild, "newBuilder()\n           …d())\n            .build()");
        return (MutationPayload$DisplayCommandV2) oVarBuild;
    }
}
