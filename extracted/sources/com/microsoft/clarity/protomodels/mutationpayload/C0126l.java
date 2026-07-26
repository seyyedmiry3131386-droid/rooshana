package com.microsoft.clarity.protomodels.mutationpayload;

import defpackage.fv4;

/* JADX INFO: renamed from: com.microsoft.clarity.protomodels.mutationpayload.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0126l extends com.google.protobuf.m implements fv4 {
    public C0126l() {
        super(MutationPayload$ConcatCommandPayload.DEFAULT_INSTANCE);
    }

    public final C0126l a(Iterable iterable) {
        copyOnWrite();
        ((MutationPayload$ConcatCommandPayload) this.instance).addAllMatrix(iterable);
        return this;
    }
}
