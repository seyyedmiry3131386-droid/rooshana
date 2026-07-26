package com.microsoft.clarity.protomodels.mutationpayload;

import defpackage.fv4;

/* JADX INFO: loaded from: classes3.dex */
public final class V0 extends com.google.protobuf.m implements fv4 {
    public V0() {
        super(MutationPayload$Sampling.DEFAULT_INSTANCE);
    }

    public final V0 a(float f) {
        copyOnWrite();
        ((MutationPayload$Sampling) this.instance).setB(f);
        return this;
    }

    public final V0 b(float f) {
        copyOnWrite();
        ((MutationPayload$Sampling) this.instance).setC(f);
        return this;
    }

    public final V0 c(int i) {
        copyOnWrite();
        ((MutationPayload$Sampling) this.instance).setMipmap(i);
        return this;
    }

    public final V0 a(int i) {
        copyOnWrite();
        ((MutationPayload$Sampling) this.instance).setFilter(i);
        return this;
    }

    public final V0 b(int i) {
        copyOnWrite();
        ((MutationPayload$Sampling) this.instance).setMaxAniso(i);
        return this;
    }

    public final V0 a(X0 x0) {
        copyOnWrite();
        ((MutationPayload$Sampling) this.instance).setTypeEnum(x0);
        return this;
    }
}
