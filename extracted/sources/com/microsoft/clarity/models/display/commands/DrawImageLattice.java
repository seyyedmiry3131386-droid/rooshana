package com.microsoft.clarity.models.display.commands;

import com.google.protobuf.o;
import com.microsoft.clarity.models.display.common.Rect;
import com.microsoft.clarity.models.display.images.Lattice;
import com.microsoft.clarity.models.display.paints.Color4f;
import com.microsoft.clarity.protomodels.mutationpayload.G;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$DisplayCommandV2;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$DrawImageLatticeCommandPayload;
import defpackage.js3;

/* JADX INFO: loaded from: classes3.dex */
public final class DrawImageLattice extends DrawImageBase {
    private final Rect dst;
    private final Long filterMode;
    private final Lattice lattice;
    private final DisplayCommandType type;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawImageLattice(Lattice lattice, Rect rect, Integer num, Long l, Integer num2) {
        super(num, num2);
        js3.p(lattice, "lattice");
        js3.p(rect, "dst");
        this.lattice = lattice;
        this.dst = rect;
        this.filterMode = l;
        this.type = DisplayCommandType.DrawImageLattice;
    }

    public final Rect getDst() {
        return this.dst;
    }

    public final Long getFilterMode() {
        return this.filterMode;
    }

    public final Lattice getLattice() {
        return this.lattice;
    }

    @Override // com.microsoft.clarity.models.display.commands.DisplayCommand
    public DisplayCommandType getType() {
        return this.type;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.microsoft.clarity.models.IProtoModel
    public MutationPayload$DisplayCommandV2 toProtobufInstance() {
        G gA = MutationPayload$DrawImageLatticeCommandPayload.newBuilder().a(this.lattice.toProtobufInstance()).a(this.dst.toProtobufInstance());
        Integer paintIndex = getPaintIndex();
        if (paintIndex != null) {
            gA.d(paintIndex.intValue());
        }
        if (getImageIndex() != null) {
            Integer imageIndex = getImageIndex();
            gA.a(imageIndex != null ? imageIndex.intValue() : 0);
        }
        if (this.filterMode != null) {
            gA.a(r1.longValue());
        }
        if (getMaskedWidth() != null) {
            Integer maskedWidth = getMaskedWidth();
            gA.c(maskedWidth != null ? maskedWidth.intValue() : 0);
        }
        if (getMaskedHeight() != null) {
            Integer maskedWidth2 = getMaskedWidth();
            gA.b(maskedWidth2 != null ? maskedWidth2.intValue() : 0);
        }
        if (getMaskedColor() != null) {
            Color4f maskedColor = getMaskedColor();
            gA.a(maskedColor != null ? maskedColor.toProtobufInstance() : null);
        }
        o oVarBuild = MutationPayload$DisplayCommandV2.newBuilder().a(getType().toProtobufType()).a((MutationPayload$DrawImageLatticeCommandPayload) gA.build()).build();
        js3.o(oVarBuild, "newBuilder()\n           …oad)\n            .build()");
        return (MutationPayload$DisplayCommandV2) oVarBuild;
    }
}
