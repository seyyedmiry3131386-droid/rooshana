package com.microsoft.clarity.protomodels.mutationpayload;

import defpackage.fv4;

/* JADX INFO: loaded from: classes3.dex */
public final class I extends com.google.protobuf.m implements fv4 {
    public I() {
        super(MutationPayload$DrawImageRectCommandPayload.DEFAULT_INSTANCE);
    }

    public final I a(MutationPayload$Rect mutationPayload$Rect) {
        copyOnWrite();
        ((MutationPayload$DrawImageRectCommandPayload) this.instance).setDst(mutationPayload$Rect);
        return this;
    }

    public final void b(MutationPayload$Rect mutationPayload$Rect) {
        copyOnWrite();
        ((MutationPayload$DrawImageRectCommandPayload) this.instance).setSrc(mutationPayload$Rect);
    }

    public final void c(int i) {
        copyOnWrite();
        ((MutationPayload$DrawImageRectCommandPayload) this.instance).setMaskedHeight(i);
    }

    public final void d(int i) {
        copyOnWrite();
        ((MutationPayload$DrawImageRectCommandPayload) this.instance).setMaskedWidth(i);
    }

    public final void e(int i) {
        copyOnWrite();
        ((MutationPayload$DrawImageRectCommandPayload) this.instance).setPaintIndex(i);
    }

    public final I a(int i) {
        copyOnWrite();
        ((MutationPayload$DrawImageRectCommandPayload) this.instance).setConstraint(i);
        return this;
    }

    public final void b(int i) {
        copyOnWrite();
        ((MutationPayload$DrawImageRectCommandPayload) this.instance).setImageIndex(i);
    }

    public final void a(MutationPayload$Sampling mutationPayload$Sampling) {
        copyOnWrite();
        ((MutationPayload$DrawImageRectCommandPayload) this.instance).setSampling(mutationPayload$Sampling);
    }

    public final void a(MutationPayload$Color4f mutationPayload$Color4f) {
        copyOnWrite();
        ((MutationPayload$DrawImageRectCommandPayload) this.instance).setMaskedColor(mutationPayload$Color4f);
    }
}
