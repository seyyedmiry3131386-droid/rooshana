package com.microsoft.clarity.protomodels.mutationpayload;

import defpackage.fv4;

/* JADX INFO: loaded from: classes3.dex */
public final class L extends com.google.protobuf.m implements fv4 {
    public L() {
        super(MutationPayload$DrawPaintCommandPayload.DEFAULT_INSTANCE);
    }

    public final void a(int i) {
        copyOnWrite();
        ((MutationPayload$DrawPaintCommandPayload) this.instance).setPaintIndex(i);
    }
}
