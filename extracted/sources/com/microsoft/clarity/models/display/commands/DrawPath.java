package com.microsoft.clarity.models.display.commands;

import com.google.protobuf.o;
import com.microsoft.clarity.protomodels.mutationpayload.M;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$DisplayCommandV2;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$DrawPathCommandPayload;
import defpackage.js3;

/* JADX INFO: loaded from: classes3.dex */
public final class DrawPath extends PaintableCommand {
    private int pathIndex;
    private final DisplayCommandType type;

    public DrawPath(int i, Integer num) {
        super(num);
        this.pathIndex = i;
        this.type = DisplayCommandType.DrawPath;
    }

    public final int getPathIndex() {
        return this.pathIndex;
    }

    @Override // com.microsoft.clarity.models.display.commands.DisplayCommand
    public DisplayCommandType getType() {
        return this.type;
    }

    public final void setPathIndex(int i) {
        this.pathIndex = i;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.microsoft.clarity.models.IProtoModel
    public MutationPayload$DisplayCommandV2 toProtobufInstance() {
        M mB = MutationPayload$DrawPathCommandPayload.newBuilder().b(this.pathIndex);
        Integer paintIndex = getPaintIndex();
        if (paintIndex != null) {
            mB.a(paintIndex.intValue());
        }
        o oVarBuild = MutationPayload$DisplayCommandV2.newBuilder().a(getType().toProtobufType()).a((MutationPayload$DrawPathCommandPayload) mB.build()).build();
        js3.o(oVarBuild, "newBuilder()\n           …d())\n            .build()");
        return (MutationPayload$DisplayCommandV2) oVarBuild;
    }
}
