package com.microsoft.clarity.protomodels.mutationpayload;

/* JADX INFO: loaded from: classes3.dex */
public final class P0 extends com.google.protobuf.m implements Q0 {
    public P0() {
        super(MutationPayload$Rect.DEFAULT_INSTANCE);
    }

    public final P0 a(float f) {
        copyOnWrite();
        ((MutationPayload$Rect) this.instance).setBottom(f);
        return this;
    }

    public final P0 b(float f) {
        copyOnWrite();
        ((MutationPayload$Rect) this.instance).setLeft(f);
        return this;
    }

    public final P0 c(float f) {
        copyOnWrite();
        ((MutationPayload$Rect) this.instance).setRight(f);
        return this;
    }

    public final P0 d(float f) {
        copyOnWrite();
        ((MutationPayload$Rect) this.instance).setTop(f);
        return this;
    }

    public final void a(MutationPayload$FloatList mutationPayload$FloatList) {
        copyOnWrite();
        ((MutationPayload$Rect) this.instance).addRadii(mutationPayload$FloatList);
    }
}
