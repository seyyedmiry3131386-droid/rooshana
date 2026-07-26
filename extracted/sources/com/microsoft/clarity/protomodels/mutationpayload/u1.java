package com.microsoft.clarity.protomodels.mutationpayload;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class u1 extends com.google.protobuf.m implements v1 {
    public u1() {
        super(MutationPayload$Vertices.DEFAULT_INSTANCE);
    }

    public final u1 a(double d) {
        copyOnWrite();
        ((MutationPayload$Vertices) this.instance).setMode(d);
        return this;
    }

    public final void b(List list) {
        copyOnWrite();
        ((MutationPayload$Vertices) this.instance).addAllTexCoords(list);
    }

    public final u1 a(boolean z) {
        copyOnWrite();
        ((MutationPayload$Vertices) this.instance).setIsVolatile(z);
        return this;
    }

    public final u1 b(ArrayList arrayList) {
        copyOnWrite();
        ((MutationPayload$Vertices) this.instance).addAllIndices(arrayList);
        return this;
    }

    public final u1 a(List list) {
        copyOnWrite();
        ((MutationPayload$Vertices) this.instance).addAllPositions(list);
        return this;
    }

    public final void a(ArrayList arrayList) {
        copyOnWrite();
        ((MutationPayload$Vertices) this.instance).addAllColors(arrayList);
    }

    public final void a(MutationPayload$DoubleList mutationPayload$DoubleList) {
        copyOnWrite();
        ((MutationPayload$Vertices) this.instance).addBoneIndices(mutationPayload$DoubleList);
    }

    public final void a(MutationPayload$FloatList mutationPayload$FloatList) {
        copyOnWrite();
        ((MutationPayload$Vertices) this.instance).addBoneWeights(mutationPayload$FloatList);
    }
}
