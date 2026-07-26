package com.microsoft.clarity.models.display.commands;

import com.google.protobuf.o;
import com.microsoft.clarity.models.display.common.IRect;
import com.microsoft.clarity.models.display.common.Rect;
import com.microsoft.clarity.models.display.paints.Color4f;
import com.microsoft.clarity.protomodels.mutationpayload.H;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$DisplayCommandV2;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$DrawImageNineCommandPayload;
import defpackage.js3;

/* JADX INFO: loaded from: classes3.dex */
public final class DrawImageNine extends DrawImageBase {
    private final IRect center;
    private final Rect dst;
    private final DisplayCommandType type;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawImageNine(IRect iRect, Rect rect, Integer num, Integer num2) {
        super(num, num2);
        js3.p(iRect, "center");
        js3.p(rect, "dst");
        this.center = iRect;
        this.dst = rect;
        this.type = DisplayCommandType.DrawImageNine;
    }

    public final IRect getCenter() {
        return this.center;
    }

    public final Rect getDst() {
        return this.dst;
    }

    @Override // com.microsoft.clarity.models.display.commands.DisplayCommand
    public DisplayCommandType getType() {
        return this.type;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.microsoft.clarity.models.IProtoModel
    public MutationPayload$DisplayCommandV2 toProtobufInstance() {
        H hB = MutationPayload$DrawImageNineCommandPayload.newBuilder().a(this.center.toProtobufInstance()).b(this.dst.toProtobufInstance());
        Integer paintIndex = getPaintIndex();
        if (paintIndex != null) {
            hB.d(paintIndex.intValue());
        }
        if (getImageIndex() != null) {
            Integer imageIndex = getImageIndex();
            hB.a(imageIndex != null ? imageIndex.intValue() : 0);
        }
        if (getMaskedWidth() != null) {
            Integer maskedWidth = getMaskedWidth();
            hB.c(maskedWidth != null ? maskedWidth.intValue() : 0);
        }
        if (getMaskedHeight() != null) {
            Integer maskedWidth2 = getMaskedWidth();
            hB.b(maskedWidth2 != null ? maskedWidth2.intValue() : 0);
        }
        if (getMaskedColor() != null) {
            Color4f maskedColor = getMaskedColor();
            hB.a(maskedColor != null ? maskedColor.toProtobufInstance() : null);
        }
        o oVarBuild = MutationPayload$DisplayCommandV2.newBuilder().a(getType().toProtobufType()).a((MutationPayload$DrawImageNineCommandPayload) hB.build()).build();
        js3.o(oVarBuild, "newBuilder()\n           …oad)\n            .build()");
        return (MutationPayload$DisplayCommandV2) oVarBuild;
    }
}
