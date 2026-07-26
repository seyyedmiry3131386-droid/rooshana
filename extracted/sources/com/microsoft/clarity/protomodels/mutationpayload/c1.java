package com.microsoft.clarity.protomodels.mutationpayload;

import defpackage.fv4;

/* JADX INFO: loaded from: classes3.dex */
public final class c1 extends com.google.protobuf.m implements fv4 {
    public c1() {
        super(MutationPayload$SetMatrix44CommandPayload.DEFAULT_INSTANCE);
    }

    public final c1 a(Iterable iterable) {
        copyOnWrite();
        ((MutationPayload$SetMatrix44CommandPayload) this.instance).addAllMatrix(iterable);
        return this;
    }
}
