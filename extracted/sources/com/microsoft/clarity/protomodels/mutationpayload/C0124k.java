package com.microsoft.clarity.protomodels.mutationpayload;

import defpackage.fv4;

/* JADX INFO: renamed from: com.microsoft.clarity.protomodels.mutationpayload.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0124k extends com.google.protobuf.m implements fv4 {
    public C0124k() {
        super(MutationPayload$Concat44CommandPayload.DEFAULT_INSTANCE);
    }

    public final C0124k a(Iterable iterable) {
        copyOnWrite();
        ((MutationPayload$Concat44CommandPayload) this.instance).addAllMatrix(iterable);
        return this;
    }
}
