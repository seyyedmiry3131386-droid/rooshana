package com.microsoft.clarity.models.display.commands;

import com.google.protobuf.o;
import com.microsoft.clarity.models.display.images.Sampling;
import com.microsoft.clarity.models.display.paints.Color4f;
import com.microsoft.clarity.protomodels.mutationpayload.F;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$DisplayCommandV2;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$DrawImageCommandPayload;
import defpackage.js3;

/* JADX INFO: loaded from: classes3.dex */
public final class DrawImage extends DrawImageBase {
    private final Sampling sampling;
    private final DisplayCommandType type;
    private final float x;
    private final float y;

    public DrawImage(float f, float f2, Integer num, Sampling sampling, Integer num2) {
        super(num, num2);
        this.x = f;
        this.y = f2;
        this.sampling = sampling;
        this.type = DisplayCommandType.DrawImage;
    }

    public final Sampling getSampling() {
        return this.sampling;
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

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.microsoft.clarity.models.IProtoModel
    public MutationPayload$DisplayCommandV2 toProtobufInstance() {
        F fB = MutationPayload$DrawImageCommandPayload.newBuilder().a(this.x).b(this.y);
        Integer paintIndex = getPaintIndex();
        if (paintIndex != null) {
            fB.d(paintIndex.intValue());
        }
        Sampling sampling = this.sampling;
        if (sampling != null) {
            fB.a(sampling.toProtobufInstance());
        }
        if (getImageIndex() != null) {
            Integer imageIndex = getImageIndex();
            fB.a(imageIndex != null ? imageIndex.intValue() : 0);
        }
        if (getMaskedWidth() != null) {
            Integer maskedWidth = getMaskedWidth();
            fB.c(maskedWidth != null ? maskedWidth.intValue() : 0);
        }
        if (getMaskedHeight() != null) {
            Integer maskedWidth2 = getMaskedWidth();
            fB.b(maskedWidth2 != null ? maskedWidth2.intValue() : 0);
        }
        if (getMaskedColor() != null) {
            Color4f maskedColor = getMaskedColor();
            fB.a(maskedColor != null ? maskedColor.toProtobufInstance() : null);
        }
        o oVarBuild = MutationPayload$DisplayCommandV2.newBuilder().a(getType().toProtobufType()).a((MutationPayload$DrawImageCommandPayload) fB.build()).build();
        js3.o(oVarBuild, "newBuilder()\n           …oad)\n            .build()");
        return (MutationPayload$DisplayCommandV2) oVarBuild;
    }
}
