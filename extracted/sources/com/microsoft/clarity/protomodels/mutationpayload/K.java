package com.microsoft.clarity.protomodels.mutationpayload;

import defpackage.fv4;

/* JADX INFO: loaded from: classes3.dex */
public final class K extends com.google.protobuf.m implements fv4 {
    public K() {
        super(MutationPayload$DrawOvalCommandPayload.DEFAULT_INSTANCE);
    }

    public final K a(MutationPayload$Rect mutationPayload$Rect) {
        copyOnWrite();
        ((MutationPayload$DrawOvalCommandPayload) this.instance).setRect(mutationPayload$Rect);
        return this;
    }

    public final void a(int i) {
        copyOnWrite();
        ((MutationPayload$DrawOvalCommandPayload) this.instance).setPaintIndex(i);
    }
}
