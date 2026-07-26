package com.microsoft.clarity.models.display.paints.loopers;

import com.google.protobuf.o;
import com.microsoft.clarity.protomodels.mutationpayload.C0138r0;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$Looper;
import defpackage.dw1;
import defpackage.js3;
import defpackage.wu0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes3.dex */
public final class LayerDrawLooper extends Looper {
    private final List<Layer> layers;
    private final LooperType type;

    public LayerDrawLooper(List<Layer> list) {
        js3.p(list, "layers");
        this.layers = list;
        this.type = LooperType.LayerDrawLooper;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LayerDrawLooper copy$default(LayerDrawLooper layerDrawLooper, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = layerDrawLooper.layers;
        }
        return layerDrawLooper.copy(list);
    }

    public final List<Layer> component1() {
        return this.layers;
    }

    public final LayerDrawLooper copy(List<Layer> list) {
        js3.p(list, "layers");
        return new LayerDrawLooper(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayerDrawLooper) && js3.i(this.layers, ((LayerDrawLooper) obj).layers);
    }

    public final List<Layer> getLayers() {
        return this.layers;
    }

    @Override // com.microsoft.clarity.models.display.paints.loopers.Looper
    public LooperType getType() {
        return this.type;
    }

    public int hashCode() {
        return this.layers.hashCode();
    }

    public String toString() {
        return dw1.t(new StringBuilder("LayerDrawLooper(layers="), this.layers, ')');
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.microsoft.clarity.models.IProtoModel
    public MutationPayload$Looper toProtobufInstance() {
        C0138r0 c0138r0A = MutationPayload$Looper.newBuilder().a(getType().toProtobufType());
        List<Layer> list = this.layers;
        ArrayList arrayList = new ArrayList(wu0.V(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Layer) it.next()).toProtobufInstance());
        }
        o oVarBuild = c0138r0A.a(a.P0(arrayList)).build();
        js3.o(oVarBuild, "builder.build()");
        return (MutationPayload$Looper) oVarBuild;
    }
}
