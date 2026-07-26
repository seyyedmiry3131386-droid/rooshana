package com.microsoft.clarity.models.display.commands;

import com.google.protobuf.o;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$DisplayCommandV2;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$DrawViewContentStartAnnotationCommandPayload;
import defpackage.js3;

/* JADX INFO: loaded from: classes3.dex */
public final class DrawViewContentStartAnnotation extends DrawViewAnnotation {
    private final DisplayCommandType type;

    public DrawViewContentStartAnnotation(int i) {
        super(i, false, 2, null);
        this.type = DisplayCommandType.DrawViewContentStartAnnotation;
    }

    @Override // com.microsoft.clarity.models.display.commands.DisplayCommand
    public DisplayCommandType getType() {
        return this.type;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.microsoft.clarity.models.IProtoModel
    public MutationPayload$DisplayCommandV2 toProtobufInstance() {
        o oVarBuild = MutationPayload$DisplayCommandV2.newBuilder().a(getType().toProtobufType()).a((MutationPayload$DrawViewContentStartAnnotationCommandPayload) MutationPayload$DrawViewContentStartAnnotationCommandPayload.newBuilder().a(getId()).build()).build();
        js3.o(oVarBuild, "newBuilder()\n           …oad)\n            .build()");
        return (MutationPayload$DisplayCommandV2) oVarBuild;
    }
}
