package com.microsoft.clarity.models.display.commands;

import com.google.protobuf.o;
import com.microsoft.clarity.models.display.common.Rect;
import com.microsoft.clarity.protomodels.mutationpayload.C0153z;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$DisplayCommandV2;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$DrawArcCommandPayload;
import defpackage.js3;

/* JADX INFO: loaded from: classes3.dex */
public final class DrawArc extends PaintableCommand {
    private final Rect rect;
    private final float startAngle;
    private final float sweepAngle;
    private final DisplayCommandType type;
    private final boolean useCenter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawArc(Rect rect, float f, float f2, boolean z, Integer num) {
        super(num);
        js3.p(rect, "rect");
        this.rect = rect;
        this.startAngle = f;
        this.sweepAngle = f2;
        this.useCenter = z;
        this.type = DisplayCommandType.DrawArc;
    }

    public final Rect getRect() {
        return this.rect;
    }

    public final float getStartAngle() {
        return this.startAngle;
    }

    public final float getSweepAngle() {
        return this.sweepAngle;
    }

    @Override // com.microsoft.clarity.models.display.commands.DisplayCommand
    public DisplayCommandType getType() {
        return this.type;
    }

    public final boolean getUseCenter() {
        return this.useCenter;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.microsoft.clarity.models.IProtoModel
    public MutationPayload$DisplayCommandV2 toProtobufInstance() {
        C0153z c0153zA = MutationPayload$DrawArcCommandPayload.newBuilder().a(this.rect.toProtobufInstance()).a(this.startAngle).b(this.sweepAngle).a(this.useCenter);
        Integer paintIndex = getPaintIndex();
        if (paintIndex != null) {
            c0153zA.a(paintIndex.intValue());
        }
        o oVarBuild = MutationPayload$DisplayCommandV2.newBuilder().a(getType().toProtobufType()).a((MutationPayload$DrawArcCommandPayload) c0153zA.build()).build();
        js3.o(oVarBuild, "newBuilder()\n           …d())\n            .build()");
        return (MutationPayload$DisplayCommandV2) oVarBuild;
    }
}
