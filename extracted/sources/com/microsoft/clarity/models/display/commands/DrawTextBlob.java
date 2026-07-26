package com.microsoft.clarity.models.display.commands;

import com.google.protobuf.o;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$DisplayCommandV2;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$DrawTextBlobCommandPayload;
import com.microsoft.clarity.protomodels.mutationpayload.T;
import defpackage.js3;

/* JADX INFO: loaded from: classes3.dex */
public final class DrawTextBlob extends PaintableCommand {
    private int blobIndex;
    private final DisplayCommandType type;
    private final float x;
    private final float y;

    public DrawTextBlob(Integer num, int i, float f, float f2) {
        super(num);
        this.blobIndex = i;
        this.x = f;
        this.y = f2;
        this.type = DisplayCommandType.DrawTextBlob;
    }

    public final int getBlobIndex() {
        return this.blobIndex;
    }

    @Override // com.microsoft.clarity.models.display.commands.DisplayCommand
    public DisplayCommandType getType() {
        return this.type;
    }

    public final float getX() {
        return this.x;
    }

    public final float getY() {
        return this.y;
    }

    public final void setBlobIndex(int i) {
        this.blobIndex = i;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.microsoft.clarity.models.IProtoModel
    public MutationPayload$DisplayCommandV2 toProtobufInstance() {
        T tB = MutationPayload$DrawTextBlobCommandPayload.newBuilder().a(this.blobIndex).a(this.x).b(this.y);
        Integer paintIndex = getPaintIndex();
        if (paintIndex != null) {
            tB.b(paintIndex.intValue());
        }
        o oVarBuild = MutationPayload$DisplayCommandV2.newBuilder().a(getType().toProtobufType()).a((MutationPayload$DrawTextBlobCommandPayload) tB.build()).build();
        js3.o(oVarBuild, "newBuilder()\n           …d())\n            .build()");
        return (MutationPayload$DisplayCommandV2) oVarBuild;
    }
}
