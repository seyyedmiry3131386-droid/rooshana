package com.microsoft.clarity.protomodels.mutationpayload;

import defpackage.fv4;

/* JADX INFO: loaded from: classes3.dex */
public final class E extends com.google.protobuf.m implements fv4 {
    public E() {
        super(MutationPayload$DrawDRRectCommandPayload.DEFAULT_INSTANCE);
    }

    public final E a(MutationPayload$Rect mutationPayload$Rect) {
        copyOnWrite();
        ((MutationPayload$DrawDRRectCommandPayload) this.instance).setInner(mutationPayload$Rect);
        return this;
    }

    public final E b(MutationPayload$Rect mutationPayload$Rect) {
        copyOnWrite();
        ((MutationPayload$DrawDRRectCommandPayload) this.instance).setOuter(mutationPayload$Rect);
        return this;
    }

    public final void a(int i) {
        copyOnWrite();
        ((MutationPayload$DrawDRRectCommandPayload) this.instance).setPaintIndex(i);
    }
}
