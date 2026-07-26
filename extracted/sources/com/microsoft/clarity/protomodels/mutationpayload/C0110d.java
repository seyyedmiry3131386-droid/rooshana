package com.microsoft.clarity.protomodels.mutationpayload;

import defpackage.fv4;

/* JADX INFO: renamed from: com.microsoft.clarity.protomodels.mutationpayload.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0110d extends com.google.protobuf.m implements fv4 {
    public C0110d() {
        super(MutationPayload$ClipRRectCommandPayload.DEFAULT_INSTANCE);
    }

    public final C0110d a(int i) {
        copyOnWrite();
        ((MutationPayload$ClipRRectCommandPayload) this.instance).setOp(i);
        return this;
    }

    public final C0110d a(boolean z) {
        copyOnWrite();
        ((MutationPayload$ClipRRectCommandPayload) this.instance).setAntiAlias(z);
        return this;
    }

    public final C0110d a(MutationPayload$Rect mutationPayload$Rect) {
        copyOnWrite();
        ((MutationPayload$ClipRRectCommandPayload) this.instance).setRrect(mutationPayload$Rect);
        return this;
    }
}
