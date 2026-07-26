package com.microsoft.clarity.models.display.images;

import com.google.protobuf.o;
import com.microsoft.clarity.models.IProtoModel;
import com.microsoft.clarity.models.display.common.IRect;
import com.microsoft.clarity.protomodels.mutationpayload.C0129m0;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$Lattice;
import defpackage.js3;
import defpackage.wu0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class Lattice implements IProtoModel<MutationPayload$Lattice> {
    private final IRect bounds;
    private final List<Long> colors;
    private final List<Integer> rectType;
    private final List<Integer> xDivs;
    private final List<Integer> yDivs;

    public Lattice(List<Integer> list, List<Integer> list2, List<Integer> list3, IRect iRect, List<Long> list4) {
        js3.p(list, "xDivs");
        js3.p(list2, "yDivs");
        js3.p(list3, "rectType");
        js3.p(iRect, "bounds");
        js3.p(list4, "colors");
        this.xDivs = list;
        this.yDivs = list2;
        this.rectType = list3;
        this.bounds = iRect;
        this.colors = list4;
    }

    public final IRect getBounds() {
        return this.bounds;
    }

    public final List<Long> getColors() {
        return this.colors;
    }

    public final List<Integer> getRectType() {
        return this.rectType;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.microsoft.clarity.models.IProtoModel
    public MutationPayload$Lattice toProtobufInstance() {
        C0129m0 c0129m0A = MutationPayload$Lattice.newBuilder().a(this.bounds.toProtobufInstance());
        List<Long> list = this.colors;
        ArrayList arrayList = new ArrayList(wu0.V(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Double.valueOf(((Number) it.next()).longValue()));
        }
        o oVarBuild = c0129m0A.a(arrayList).a(this.rectType).c(this.yDivs).b(this.xDivs).build();
        js3.o(oVarBuild, "newBuilder()\n           …ivs)\n            .build()");
        return (MutationPayload$Lattice) oVarBuild;
    }
}
