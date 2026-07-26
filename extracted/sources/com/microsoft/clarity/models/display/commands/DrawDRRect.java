package com.microsoft.clarity.models.display.commands;

import com.google.protobuf.o;
import com.microsoft.clarity.models.display.common.RRect;
import com.microsoft.clarity.protomodels.mutationpayload.E;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$DisplayCommandV2;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$DrawDRRectCommandPayload;
import defpackage.js3;

/* JADX INFO: loaded from: classes3.dex */
public final class DrawDRRect extends PaintableCommand {
    private final RRect inner;
    private final RRect outer;
    private final DisplayCommandType type;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawDRRect(RRect rRect, RRect rRect2, Integer num) {
        super(num);
        js3.p(rRect, "outer");
        js3.p(rRect2, "inner");
        this.outer = rRect;
        this.inner = rRect2;
        this.type = DisplayCommandType.DrawDRRect;
    }

    public final RRect getInner() {
        return this.inner;
    }

    public final RRect getOuter() {
        return this.outer;
    }

    @Override // com.microsoft.clarity.models.display.commands.DisplayCommand
    public DisplayCommandType getType() {
        return this.type;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.microsoft.clarity.models.IProtoModel
    public MutationPayload$DisplayCommandV2 toProtobufInstance() {
        E eA = MutationPayload$DrawDRRectCommandPayload.newBuilder().b(this.outer.toProtobufInstance()).a(this.inner.toProtobufInstance());
        Integer paintIndex = getPaintIndex();
        if (paintIndex != null) {
            eA.a(paintIndex.intValue());
        }
        o oVarBuild = MutationPayload$DisplayCommandV2.newBuilder().a(getType().toProtobufType()).a((MutationPayload$DrawDRRectCommandPayload) eA.build()).build();
        js3.o(oVarBuild, "newBuilder()\n           …d())\n            .build()");
        return (MutationPayload$DisplayCommandV2) oVarBuild;
    }
}
