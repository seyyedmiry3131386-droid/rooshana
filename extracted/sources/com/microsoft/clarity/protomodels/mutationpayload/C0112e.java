package com.microsoft.clarity.protomodels.mutationpayload;

import defpackage.fv4;

/* JADX INFO: renamed from: com.microsoft.clarity.protomodels.mutationpayload.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0112e extends com.google.protobuf.m implements fv4 {
    public C0112e() {
        super(MutationPayload$ClipRectCommandPayload.DEFAULT_INSTANCE);
    }

    public final C0112e a(int i) {
        copyOnWrite();
        ((MutationPayload$ClipRectCommandPayload) this.instance).setOp(i);
        return this;
    }

    public final C0112e a(boolean z) {
        copyOnWrite();
        ((MutationPayload$ClipRectCommandPayload) this.instance).setAntiAlias(z);
        return this;
    }

    public final C0112e a(MutationPayload$Rect mutationPayload$Rect) {
        copyOnWrite();
        ((MutationPayload$ClipRectCommandPayload) this.instance).setRect(mutationPayload$Rect);
        return this;
    }
}
