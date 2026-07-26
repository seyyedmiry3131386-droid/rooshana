package com.microsoft.clarity.models.display.commands;

import com.google.protobuf.o;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$DisplayCommandV2;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$DrawViewStartAnnotationCommandPayload;
import defpackage.js3;
import defpackage.yd1;

/* JADX INFO: loaded from: classes3.dex */
public final class DrawViewStartAnnotation extends DrawViewAnnotation {
    private final DisplayCommandType type;

    public /* synthetic */ DrawViewStartAnnotation(int i, boolean z, int i2, yd1 yd1Var) {
        this(i, (i2 & 2) != 0 ? true : z);
    }

    @Override // com.microsoft.clarity.models.display.commands.DisplayCommand
    public DisplayCommandType getType() {
        return this.type;
    }

    public DrawViewStartAnnotation(int i, boolean z) {
        super(i, z);
        this.type = DisplayCommandType.DrawViewStartAnnotation;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.microsoft.clarity.models.IProtoModel
    public MutationPayload$DisplayCommandV2 toProtobufInstance() {
        o oVarBuild = MutationPayload$DisplayCommandV2.newBuilder().a(getType().toProtobufType()).a((MutationPayload$DrawViewStartAnnotationCommandPayload) MutationPayload$DrawViewStartAnnotationCommandPayload.newBuilder().a(getId()).build()).build();
        js3.o(oVarBuild, "newBuilder()\n           …oad)\n            .build()");
        return (MutationPayload$DisplayCommandV2) oVarBuild;
    }
}
