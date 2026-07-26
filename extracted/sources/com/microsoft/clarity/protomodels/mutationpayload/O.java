package com.microsoft.clarity.protomodels.mutationpayload;

import defpackage.fv4;

/* JADX INFO: loaded from: classes3.dex */
public final class O extends com.google.protobuf.m implements fv4 {
    public O() {
        super(MutationPayload$DrawRRectCommandPayload.DEFAULT_INSTANCE);
    }

    public final O a(MutationPayload$Rect mutationPayload$Rect) {
        copyOnWrite();
        ((MutationPayload$DrawRRectCommandPayload) this.instance).setRrect(mutationPayload$Rect);
        return this;
    }

    public final void a(int i) {
        copyOnWrite();
        ((MutationPayload$DrawRRectCommandPayload) this.instance).setPaintIndex(i);
    }
}
