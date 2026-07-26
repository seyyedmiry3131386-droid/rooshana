package com.microsoft.clarity.models.display.commands;

import com.google.protobuf.o;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$DisplayCommandV2;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$FillViewCommandsAnnotationCommandPayload;
import defpackage.js3;

/* JADX INFO: loaded from: classes3.dex */
public final class FillViewContentCommandsAnnotation extends DrawViewAnnotation {
    private final DisplayCommandType type;

    public FillViewContentCommandsAnnotation(int i) {
        super(i, false, 2, null);
        this.type = DisplayCommandType.FillViewCommandsAnnotation;
    }

    @Override // com.microsoft.clarity.models.display.commands.DisplayCommand
    public DisplayCommandType getType() {
        return this.type;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.microsoft.clarity.models.IProtoModel
    public MutationPayload$DisplayCommandV2 toProtobufInstance() {
        o oVarBuild = MutationPayload$DisplayCommandV2.newBuilder().a(getType().toProtobufType()).a((MutationPayload$FillViewCommandsAnnotationCommandPayload) MutationPayload$FillViewCommandsAnnotationCommandPayload.newBuilder().a(getId()).build()).build();
        js3.o(oVarBuild, "newBuilder()\n           …oad)\n            .build()");
        return (MutationPayload$DisplayCommandV2) oVarBuild;
    }
}
