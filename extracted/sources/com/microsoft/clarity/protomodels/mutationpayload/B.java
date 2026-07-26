package com.microsoft.clarity.protomodels.mutationpayload;

import defpackage.fv4;

/* JADX INFO: loaded from: classes3.dex */
public final class B extends com.google.protobuf.m implements fv4 {
    public B() {
        super(MutationPayload$DrawBehindPaintCommandPayload.DEFAULT_INSTANCE);
    }

    public final void a(int i) {
        copyOnWrite();
        ((MutationPayload$DrawBehindPaintCommandPayload) this.instance).setPaintIndex(i);
    }
}
