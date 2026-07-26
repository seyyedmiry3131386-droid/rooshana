package com.microsoft.clarity.models.display.common;

import com.google.protobuf.o;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$FloatList;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$Rect;
import com.microsoft.clarity.protomodels.mutationpayload.P0;
import defpackage.js3;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class RRect extends Rect {
    private final List<List<Float>> radii;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RRect(float f, float f2, float f3, float f4, List<? extends List<Float>> list) {
        super(f, f2, f3, f4);
        js3.p(list, "radii");
        this.radii = list;
    }

    @Override // com.microsoft.clarity.models.display.common.Rect
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!RRect.class.equals(obj != null ? obj.getClass() : null) || !super.equals(obj)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type com.microsoft.clarity.models.display.common.RRect");
        return js3.i(this.radii, ((RRect) obj).radii);
    }

    public final List<List<Float>> getRadii() {
        return this.radii;
    }

    @Override // com.microsoft.clarity.models.display.common.Rect
    public int hashCode() {
        int iHashCode = super.hashCode();
        Iterator<List<Float>> it = this.radii.iterator();
        while (it.hasNext()) {
            Iterator<Float> it2 = it.next().iterator();
            while (it2.hasNext()) {
                iHashCode = (iHashCode * 31) + Float.floatToIntBits(it2.next().floatValue());
            }
        }
        return iHashCode;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.microsoft.clarity.models.display.common.Rect, com.microsoft.clarity.models.IProtoModel
    public MutationPayload$Rect toProtobufInstance() {
        P0 p0C = MutationPayload$Rect.newBuilder().a(getBottom()).d(getTop()).b(getLeft()).c(getRight());
        Iterator<List<Float>> it = this.radii.iterator();
        while (it.hasNext()) {
            p0C.a((MutationPayload$FloatList) MutationPayload$FloatList.newBuilder().a(it.next()).build());
        }
        o oVarBuild = p0C.build();
        js3.o(oVarBuild, "builder.build()");
        return (MutationPayload$Rect) oVarBuild;
    }
}
