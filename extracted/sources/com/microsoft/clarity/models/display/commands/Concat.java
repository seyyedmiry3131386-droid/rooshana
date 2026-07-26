package com.microsoft.clarity.models.display.commands;

import com.google.protobuf.o;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$ConcatCommandPayload;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$DisplayCommandV2;
import defpackage.js3;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class Concat extends DisplayCommand {
    private final List<Float> matrix;
    private final DisplayCommandType type;

    public Concat(List<Float> list) {
        js3.p(list, "matrix");
        this.matrix = list;
        this.type = DisplayCommandType.Concat;
    }

    public final List<Float> getMatrix() {
        return this.matrix;
    }

    @Override // com.microsoft.clarity.models.display.commands.DisplayCommand
    public DisplayCommandType getType() {
        return this.type;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.microsoft.clarity.models.IProtoModel
    public MutationPayload$DisplayCommandV2 toProtobufInstance() {
        o oVarBuild = MutationPayload$DisplayCommandV2.newBuilder().a(getType().toProtobufType()).a((MutationPayload$ConcatCommandPayload) MutationPayload$ConcatCommandPayload.newBuilder().a(this.matrix).build()).build();
        js3.o(oVarBuild, "newBuilder()\n           …oad)\n            .build()");
        return (MutationPayload$DisplayCommandV2) oVarBuild;
    }
}
