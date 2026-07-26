package com.microsoft.clarity.protomodels.mutationpayload;

/* JADX INFO: renamed from: com.microsoft.clarity.protomodels.mutationpayload.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0131n0 extends com.google.protobuf.m implements InterfaceC0135p0 {
    public C0131n0() {
        super(MutationPayload$Layer.DEFAULT_INSTANCE);
    }

    public final C0131n0 a(MutationPayload$LayerInfo mutationPayload$LayerInfo) {
        copyOnWrite();
        ((MutationPayload$Layer) this.instance).setLayerInfo(mutationPayload$LayerInfo);
        return this;
    }

    public final C0131n0 a(MutationPayload$Paint mutationPayload$Paint) {
        copyOnWrite();
        ((MutationPayload$Layer) this.instance).setPaint(mutationPayload$Paint);
        return this;
    }
}
