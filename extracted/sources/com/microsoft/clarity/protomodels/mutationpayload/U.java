package com.microsoft.clarity.protomodels.mutationpayload;

import defpackage.fv4;

/* JADX INFO: loaded from: classes3.dex */
public final class U extends com.google.protobuf.m implements fv4 {
    public U() {
        super(MutationPayload$DrawVerticesCommandPayload.DEFAULT_INSTANCE);
    }

    public final U a(double d) {
        copyOnWrite();
        ((MutationPayload$DrawVerticesCommandPayload) this.instance).setMode(d);
        return this;
    }

    public final U b(int i) {
        copyOnWrite();
        ((MutationPayload$DrawVerticesCommandPayload) this.instance).setVerticesIndex(i);
        return this;
    }

    public final void a(MutationPayload$FloatList mutationPayload$FloatList) {
        copyOnWrite();
        ((MutationPayload$DrawVerticesCommandPayload) this.instance).addBones(mutationPayload$FloatList);
    }

    public final void a(int i) {
        copyOnWrite();
        ((MutationPayload$DrawVerticesCommandPayload) this.instance).setPaintIndex(i);
    }
}
