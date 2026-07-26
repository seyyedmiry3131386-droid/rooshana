package com.microsoft.clarity.models.display.commands;

import com.google.protobuf.o;
import com.microsoft.clarity.models.display.common.RRect;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$DisplayCommandV2;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$DrawRRectCommandPayload;
import com.microsoft.clarity.protomodels.mutationpayload.O;
import defpackage.js3;

/* JADX INFO: loaded from: classes3.dex */
public final class DrawRRect extends PaintableCommand {
    private final RRect rrect;
    private final DisplayCommandType type;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawRRect(RRect rRect, Integer num) {
        super(num);
        js3.p(rRect, "rrect");
        this.rrect = rRect;
        this.type = DisplayCommandType.DrawRRect;
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
        O oA = MutationPayload$DrawRRectCommandPayload.newBuilder().a(this.rrect.toProtobufInstance());
        Integer paintIndex = getPaintIndex();
        if (paintIndex != null) {
            oA.a(paintIndex.intValue());
        }
        o oVarBuild = MutationPayload$DisplayCommandV2.newBuilder().a(getType().toProtobufType()).a((MutationPayload$DrawRRectCommandPayload) oA.build()).build();
        js3.o(oVarBuild, "newBuilder()\n           …d())\n            .build()");
        return (MutationPayload$DisplayCommandV2) oVarBuild;
    }
}
