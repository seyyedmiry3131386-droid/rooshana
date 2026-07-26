package com.microsoft.clarity.protomodels.mutationpayload;

import defpackage.fv4;

/* JADX INFO: loaded from: classes3.dex */
public final class B0 extends com.google.protobuf.m implements fv4 {
    public B0() {
        super(MutationPayload$PathEffect.DEFAULT_INSTANCE);
    }

    public final B0 a(Iterable iterable) {
        copyOnWrite();
        ((MutationPayload$PathEffect) this.instance).addAllIntervals(iterable);
        return this;
    }

    public final B0 b(float f) {
        copyOnWrite();
        ((MutationPayload$PathEffect) this.instance).setPhase(f);
        return this;
    }

    public final B0 c(float f) {
        copyOnWrite();
        ((MutationPayload$PathEffect) this.instance).setRadius(f);
        return this;
    }

    public final B0 a(float f) {
        copyOnWrite();
        ((MutationPayload$PathEffect) this.instance).setAdvance(f);
        return this;
    }

    public final B0 a(long j) {
        copyOnWrite();
        ((MutationPayload$PathEffect) this.instance).setStyle(j);
        return this;
    }

    public final B0 a(MutationPayload$Path mutationPayload$Path) {
        copyOnWrite();
        ((MutationPayload$PathEffect) this.instance).setPath(mutationPayload$Path);
        return this;
    }

    public final B0 a(D0 d0) {
        copyOnWrite();
        ((MutationPayload$PathEffect) this.instance).setTypeEnum(d0);
        return this;
    }
}
