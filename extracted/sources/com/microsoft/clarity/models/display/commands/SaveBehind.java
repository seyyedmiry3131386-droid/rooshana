package com.microsoft.clarity.models.display.commands;

import com.google.protobuf.o;
import com.microsoft.clarity.models.display.common.Rect;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$DisplayCommandV2;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$SaveBehindCommandPayload;
import com.microsoft.clarity.protomodels.mutationpayload.Y0;
import defpackage.js3;

/* JADX INFO: loaded from: classes3.dex */
public final class SaveBehind extends DisplayCommand {
    private final int flags;
    private final Rect subset;
    private final DisplayCommandType type = DisplayCommandType.SaveBehind;

    public SaveBehind(int i, Rect rect) {
        this.flags = i;
        this.subset = rect;
    }

    public final int getFlags() {
        return this.flags;
    }

    public final Rect getSubset() {
        return this.subset;
    }

    @Override // com.microsoft.clarity.models.display.commands.DisplayCommand
    public DisplayCommandType getType() {
        return this.type;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.microsoft.clarity.models.IProtoModel
    public MutationPayload$DisplayCommandV2 toProtobufInstance() {
        Y0 y0A = MutationPayload$SaveBehindCommandPayload.newBuilder().a(this.flags);
        Rect rect = this.subset;
        if (rect != null) {
            y0A.a(rect.toProtobufInstance());
        }
        o oVarBuild = MutationPayload$DisplayCommandV2.newBuilder().a(getType().toProtobufType()).a((MutationPayload$SaveBehindCommandPayload) y0A.build()).build();
        js3.o(oVarBuild, "newBuilder()\n           …oad)\n            .build()");
        return (MutationPayload$DisplayCommandV2) oVarBuild;
    }
}
