package com.microsoft.clarity.protomodels.mutationpayload;

import defpackage.fv4;

/* JADX INFO: loaded from: classes3.dex */
public final class M extends com.google.protobuf.m implements fv4 {
    public M() {
        super(MutationPayload$DrawPathCommandPayload.DEFAULT_INSTANCE);
    }

    public final void a(int i) {
        copyOnWrite();
        ((MutationPayload$DrawPathCommandPayload) this.instance).setPaintIndex(i);
    }

    public final M b(int i) {
        copyOnWrite();
        ((MutationPayload$DrawPathCommandPayload) this.instance).setPathIndex(i);
        return this;
    }
}
