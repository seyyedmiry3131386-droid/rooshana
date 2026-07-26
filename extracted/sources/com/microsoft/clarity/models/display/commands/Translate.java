package com.microsoft.clarity.models.display.commands;

import com.google.protobuf.o;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$DisplayCommandV2;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$TranslateCommandPayload;
import defpackage.js3;

/* JADX INFO: loaded from: classes3.dex */
public final class Translate extends DisplayCommand {
    private final float left;
    private final float top;
    private final DisplayCommandType type = DisplayCommandType.Translate;

    public Translate(float f, float f2) {
        this.left = f;
        this.top = f2;
    }

    public final float getLeft() {
        return this.left;
    }

    public final float getTop() {
        return this.top;
    }

    @Override // com.microsoft.clarity.models.display.commands.DisplayCommand
    public DisplayCommandType getType() {
        return this.type;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.microsoft.clarity.models.IProtoModel
    public MutationPayload$DisplayCommandV2 toProtobufInstance() {
        o oVarBuild = MutationPayload$DisplayCommandV2.newBuilder().a(getType().toProtobufType()).a((MutationPayload$TranslateCommandPayload) MutationPayload$TranslateCommandPayload.newBuilder().a(this.left).b(this.top).build()).build();
        js3.o(oVarBuild, "newBuilder()\n           …oad)\n            .build()");
        return (MutationPayload$DisplayCommandV2) oVarBuild;
    }
}
