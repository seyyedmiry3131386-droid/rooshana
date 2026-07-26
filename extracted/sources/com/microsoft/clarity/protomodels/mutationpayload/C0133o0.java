package com.microsoft.clarity.protomodels.mutationpayload;

import defpackage.fv4;

/* JADX INFO: renamed from: com.microsoft.clarity.protomodels.mutationpayload.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0133o0 extends com.google.protobuf.m implements fv4 {
    public C0133o0() {
        super(MutationPayload$LayerInfo.DEFAULT_INSTANCE);
    }

    public final C0133o0 a(int i) {
        copyOnWrite();
        ((MutationPayload$LayerInfo) this.instance).setColorMode(i);
        return this;
    }

    public final C0133o0 b(int i) {
        copyOnWrite();
        ((MutationPayload$LayerInfo) this.instance).setPaintBits(i);
        return this;
    }

    public final C0133o0 a(Iterable iterable) {
        copyOnWrite();
        ((MutationPayload$LayerInfo) this.instance).addAllOffset(iterable);
        return this;
    }

    public final C0133o0 a(boolean z) {
        copyOnWrite();
        ((MutationPayload$LayerInfo) this.instance).setPostTranslate(z);
        return this;
    }
}
