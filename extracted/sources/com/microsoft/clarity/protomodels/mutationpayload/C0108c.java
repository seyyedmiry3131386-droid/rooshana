package com.microsoft.clarity.protomodels.mutationpayload;

import defpackage.fv4;

/* JADX INFO: renamed from: com.microsoft.clarity.protomodels.mutationpayload.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0108c extends com.google.protobuf.m implements fv4 {
    public C0108c() {
        super(MutationPayload$ClipPathCommandPayload.DEFAULT_INSTANCE);
    }

    public final C0108c a(int i) {
        copyOnWrite();
        ((MutationPayload$ClipPathCommandPayload) this.instance).setOp(i);
        return this;
    }

    public final C0108c b(int i) {
        copyOnWrite();
        ((MutationPayload$ClipPathCommandPayload) this.instance).setPathIndex(i);
        return this;
    }

    public final C0108c a(boolean z) {
        copyOnWrite();
        ((MutationPayload$ClipPathCommandPayload) this.instance).setAntiAlias(z);
        return this;
    }
}
