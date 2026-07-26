package com.microsoft.clarity.models.display.commands;

import com.google.protobuf.o;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$DisplayCommandV2;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$ScaleCommandPayload;
import defpackage.js3;

/* JADX INFO: loaded from: classes3.dex */
public final class Scale extends DisplayCommand {
    private final float sx;
    private final float sy;
    private final DisplayCommandType type = DisplayCommandType.Scale;

    public Scale(float f, float f2) {
        this.sx = f;
        this.sy = f2;
    }

    public final float getSx() {
        return this.sx;
    }

    public final float getSy() {
        return this.sy;
    }

    @Override // com.microsoft.clarity.models.display.commands.DisplayCommand
    public DisplayCommandType getType() {
        return this.type;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.microsoft.clarity.models.IProtoModel
    public MutationPayload$DisplayCommandV2 toProtobufInstance() {
        o oVarBuild = MutationPayload$DisplayCommandV2.newBuilder().a(getType().toProtobufType()).a((MutationPayload$ScaleCommandPayload) MutationPayload$ScaleCommandPayload.newBuilder().a(this.sx).b(this.sy).build()).build();
        js3.o(oVarBuild, "newBuilder()\n           …oad)\n            .build()");
        return (MutationPayload$DisplayCommandV2) oVarBuild;
    }
}
