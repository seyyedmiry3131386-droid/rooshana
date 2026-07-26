package com.microsoft.clarity.protomodels.mutationpayload;

import defpackage.fv4;

/* JADX INFO: loaded from: classes3.dex */
public final class H extends com.google.protobuf.m implements fv4 {
    public H() {
        super(MutationPayload$DrawImageNineCommandPayload.DEFAULT_INSTANCE);
    }

    public final H a(MutationPayload$Rect mutationPayload$Rect) {
        copyOnWrite();
        ((MutationPayload$DrawImageNineCommandPayload) this.instance).setCenter(mutationPayload$Rect);
        return this;
    }

    public final H b(MutationPayload$Rect mutationPayload$Rect) {
        copyOnWrite();
        ((MutationPayload$DrawImageNineCommandPayload) this.instance).setDst(mutationPayload$Rect);
        return this;
    }

    public final void c(int i) {
        copyOnWrite();
        ((MutationPayload$DrawImageNineCommandPayload) this.instance).setMaskedWidth(i);
    }

    public final void d(int i) {
        copyOnWrite();
        ((MutationPayload$DrawImageNineCommandPayload) this.instance).setPaintIndex(i);
    }

    public final void a(int i) {
        copyOnWrite();
        ((MutationPayload$DrawImageNineCommandPayload) this.instance).setImageIndex(i);
    }

    public final void b(int i) {
        copyOnWrite();
        ((MutationPayload$DrawImageNineCommandPayload) this.instance).setMaskedHeight(i);
    }

    public final void a(MutationPayload$Color4f mutationPayload$Color4f) {
        copyOnWrite();
        ((MutationPayload$DrawImageNineCommandPayload) this.instance).setMaskedColor(mutationPayload$Color4f);
    }
}
