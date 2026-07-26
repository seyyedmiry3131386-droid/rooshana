package com.microsoft.clarity.models.display.commands;

import com.google.protobuf.o;
import com.microsoft.clarity.models.display.common.Rect;
import com.microsoft.clarity.protomodels.mutationpayload.C0105a1;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$DisplayCommandV2;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$SaveLayerCommandPayload;
import defpackage.js3;

/* JADX INFO: loaded from: classes3.dex */
public final class SaveLayer extends PaintableCommand {
    private final Rect bounds;
    private final Integer flags;
    private final Integer imageFilterPaint;
    private final DisplayCommandType type;

    public SaveLayer(Rect rect, Integer num, Integer num2, Integer num3) {
        super(num3);
        this.bounds = rect;
        this.flags = num;
        this.imageFilterPaint = num2;
        this.type = DisplayCommandType.SaveLayer;
    }

    public final Rect getBounds() {
        return this.bounds;
    }

    public final Integer getFlags() {
        return this.flags;
    }

    public final Integer getImageFilterPaint() {
        return this.imageFilterPaint;
    }

    @Override // com.microsoft.clarity.models.display.commands.DisplayCommand
    public DisplayCommandType getType() {
        return this.type;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.microsoft.clarity.models.IProtoModel
    public MutationPayload$DisplayCommandV2 toProtobufInstance() {
        C0105a1 c0105a1NewBuilder = MutationPayload$SaveLayerCommandPayload.newBuilder();
        Rect rect = this.bounds;
        if (rect != null) {
            c0105a1NewBuilder.a(rect.toProtobufInstance());
        }
        Integer num = this.flags;
        if (num != null) {
            c0105a1NewBuilder.a(num.intValue());
        }
        Integer num2 = this.imageFilterPaint;
        if (num2 != null) {
            c0105a1NewBuilder.b(num2.intValue());
        }
        Integer paintIndex = getPaintIndex();
        if (paintIndex != null) {
            c0105a1NewBuilder.c(paintIndex.intValue());
        }
        o oVarBuild = MutationPayload$DisplayCommandV2.newBuilder().a(getType().toProtobufType()).a((MutationPayload$SaveLayerCommandPayload) c0105a1NewBuilder.build()).build();
        js3.o(oVarBuild, "newBuilder()\n           …oad)\n            .build()");
        return (MutationPayload$DisplayCommandV2) oVarBuild;
    }
}
