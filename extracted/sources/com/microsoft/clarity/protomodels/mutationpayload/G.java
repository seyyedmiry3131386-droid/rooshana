package com.microsoft.clarity.protomodels.mutationpayload;

import defpackage.fv4;

/* JADX INFO: loaded from: classes3.dex */
public final class G extends com.google.protobuf.m implements fv4 {
    public G() {
        super(MutationPayload$DrawImageLatticeCommandPayload.DEFAULT_INSTANCE);
    }

    public final G a(MutationPayload$Lattice mutationPayload$Lattice) {
        copyOnWrite();
        ((MutationPayload$DrawImageLatticeCommandPayload) this.instance).setLattice(mutationPayload$Lattice);
        return this;
    }

    public final void b(int i) {
        copyOnWrite();
        ((MutationPayload$DrawImageLatticeCommandPayload) this.instance).setMaskedHeight(i);
    }

    public final void c(int i) {
        copyOnWrite();
        ((MutationPayload$DrawImageLatticeCommandPayload) this.instance).setMaskedWidth(i);
    }

    public final void d(int i) {
        copyOnWrite();
        ((MutationPayload$DrawImageLatticeCommandPayload) this.instance).setPaintIndex(i);
    }

    public final G a(MutationPayload$Rect mutationPayload$Rect) {
        copyOnWrite();
        ((MutationPayload$DrawImageLatticeCommandPayload) this.instance).setDst(mutationPayload$Rect);
        return this;
    }

    public final void a(int i) {
        copyOnWrite();
        ((MutationPayload$DrawImageLatticeCommandPayload) this.instance).setImageIndex(i);
    }

    public final void a(double d) {
        copyOnWrite();
        ((MutationPayload$DrawImageLatticeCommandPayload) this.instance).setFilterMode(d);
    }

    public final void a(MutationPayload$Color4f mutationPayload$Color4f) {
        copyOnWrite();
        ((MutationPayload$DrawImageLatticeCommandPayload) this.instance).setMaskedColor(mutationPayload$Color4f);
    }
}
