package com.microsoft.clarity.protomodels.mutationpayload;

/* JADX INFO: renamed from: com.microsoft.clarity.protomodels.mutationpayload.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0107b0 extends com.google.protobuf.m implements InterfaceC0109c0 {
    public C0107b0() {
        super(MutationPayload$FloatList.DEFAULT_INSTANCE);
    }

    public final C0107b0 a(Iterable iterable) {
        copyOnWrite();
        ((MutationPayload$FloatList) this.instance).addAllValue(iterable);
        return this;
    }
}
