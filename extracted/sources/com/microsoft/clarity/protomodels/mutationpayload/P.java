package com.microsoft.clarity.protomodels.mutationpayload;

import defpackage.fv4;

/* JADX INFO: loaded from: classes3.dex */
public final class P extends com.google.protobuf.m implements fv4 {
    public P() {
        super(MutationPayload$DrawRectCommandPayload.DEFAULT_INSTANCE);
    }

    public final P a(MutationPayload$Rect mutationPayload$Rect) {
        copyOnWrite();
        ((MutationPayload$DrawRectCommandPayload) this.instance).setRect(mutationPayload$Rect);
        return this;
    }

    public final void a(int i) {
        copyOnWrite();
        ((MutationPayload$DrawRectCommandPayload) this.instance).setPaintIndex(i);
    }
}
