package com.microsoft.clarity.models.display.commands;

import com.google.protobuf.o;
import com.microsoft.clarity.models.display.common.Rect;
import com.microsoft.clarity.protomodels.mutationpayload.K;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$DisplayCommandV2;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$DrawOvalCommandPayload;
import defpackage.js3;

/* JADX INFO: loaded from: classes3.dex */
public final class DrawOval extends PaintableCommand {
    private final Rect rect;
    private final DisplayCommandType type;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawOval(Rect rect, Integer num) {
        super(num);
        js3.p(rect, "rect");
        this.rect = rect;
        this.type = DisplayCommandType.DrawOval;
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
        K kA = MutationPayload$DrawOvalCommandPayload.newBuilder().a(this.rect.toProtobufInstance());
        Integer paintIndex = getPaintIndex();
        if (paintIndex != null) {
            kA.a(paintIndex.intValue());
        }
        o oVarBuild = MutationPayload$DisplayCommandV2.newBuilder().a(getType().toProtobufType()).a((MutationPayload$DrawOvalCommandPayload) kA.build()).build();
        js3.o(oVarBuild, "newBuilder()\n           …d())\n            .build()");
        return (MutationPayload$DisplayCommandV2) oVarBuild;
    }
}
