package com.microsoft.clarity.protomodels.mutationpayload;

import defpackage.fv4;

/* JADX INFO: loaded from: classes3.dex */
public final class d1 extends com.google.protobuf.m implements fv4 {
    public d1() {
        super(MutationPayload$SetMatrixCommandPayload.DEFAULT_INSTANCE);
    }

    public final d1 a(Iterable iterable) {
        copyOnWrite();
        ((MutationPayload$SetMatrixCommandPayload) this.instance).addAllMatrix(iterable);
        return this;
    }
}
