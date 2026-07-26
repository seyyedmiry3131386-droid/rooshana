package com.microsoft.clarity.models.display.commands;

import com.google.protobuf.o;
import com.microsoft.clarity.models.display.common.Rect;
import com.microsoft.clarity.models.display.images.Sampling;
import com.microsoft.clarity.models.display.paints.Color4f;
import com.microsoft.clarity.protomodels.mutationpayload.I;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$DisplayCommandV2;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$DrawImageRectCommandPayload;
import defpackage.js3;

/* JADX INFO: loaded from: classes3.dex */
public final class DrawImageRect extends DrawImageBase {
    private final int constraint;
    private final Rect dst;
    private final Sampling sampling;
    private final Rect src;
    private final DisplayCommandType type;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawImageRect(Rect rect, Rect rect2, Integer num, int i, Sampling sampling, Integer num2) {
        super(num, num2);
        js3.p(rect2, "dst");
        this.src = rect;
        this.dst = rect2;
        this.constraint = i;
        this.sampling = sampling;
        this.type = DisplayCommandType.DrawImageRect;
    }

    public final int getConstraint() {
        return this.constraint;
    }

    public final Rect getDst() {
        return this.dst;
    }

    public final Sampling getSampling() {
        return this.sampling;
    }

    public final Rect getSrc() {
        return this.src;
    }

    @Override // com.microsoft.clarity.models.display.commands.DisplayCommand
    public DisplayCommandType getType() {
        return this.type;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.microsoft.clarity.models.IProtoModel
    public MutationPayload$DisplayCommandV2 toProtobufInstance() {
        I iA = MutationPayload$DrawImageRectCommandPayload.newBuilder().a(this.dst.toProtobufInstance()).a(this.constraint);
        Integer paintIndex = getPaintIndex();
        if (paintIndex != null) {
            iA.e(paintIndex.intValue());
        }
        Rect rect = this.src;
        if (rect != null) {
            iA.b(rect.toProtobufInstance());
        }
        if (getImageIndex() != null) {
            Integer imageIndex = getImageIndex();
            iA.b(imageIndex != null ? imageIndex.intValue() : 0);
        }
        Sampling sampling = this.sampling;
        if (sampling != null) {
            iA.a(sampling.toProtobufInstance());
        }
        if (getMaskedWidth() != null) {
            Integer maskedWidth = getMaskedWidth();
            iA.d(maskedWidth != null ? maskedWidth.intValue() : 0);
        }
        if (getMaskedHeight() != null) {
            Integer maskedWidth2 = getMaskedWidth();
            iA.c(maskedWidth2 != null ? maskedWidth2.intValue() : 0);
        }
        if (getMaskedColor() != null) {
            Color4f maskedColor = getMaskedColor();
            iA.a(maskedColor != null ? maskedColor.toProtobufInstance() : null);
        }
        o oVarBuild = MutationPayload$DisplayCommandV2.newBuilder().a(getType().toProtobufType()).a((MutationPayload$DrawImageRectCommandPayload) iA.build()).build();
        js3.o(oVarBuild, "newBuilder()\n           …oad)\n            .build()");
        return (MutationPayload$DisplayCommandV2) oVarBuild;
    }
}
