package com.microsoft.clarity.protomodels.mutationpayload;

import defpackage.fv4;

/* JADX INFO: renamed from: com.microsoft.clarity.protomodels.mutationpayload.a1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0105a1 extends com.google.protobuf.m implements fv4 {
    public C0105a1() {
        super(MutationPayload$SaveLayerCommandPayload.DEFAULT_INSTANCE);
    }

    public final void a(MutationPayload$Rect mutationPayload$Rect) {
        copyOnWrite();
        ((MutationPayload$SaveLayerCommandPayload) this.instance).setBounds(mutationPayload$Rect);
    }

    public final void b(int i) {
        copyOnWrite();
        ((MutationPayload$SaveLayerCommandPayload) this.instance).setImageFilterPaint(i);
    }

    public final void c(int i) {
        copyOnWrite();
        ((MutationPayload$SaveLayerCommandPayload) this.instance).setPaintIndex(i);
    }

    public final void a(int i) {
        copyOnWrite();
        ((MutationPayload$SaveLayerCommandPayload) this.instance).setFlags(i);
    }
}
