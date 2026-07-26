package com.microsoft.clarity.protomodels.mutationpayload;

import defpackage.fv4;

/* JADX INFO: renamed from: com.microsoft.clarity.protomodels.mutationpayload.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0127l0 extends com.google.protobuf.m implements fv4 {
    public C0127l0() {
        super(MutationPayload$IntList.DEFAULT_INSTANCE);
    }

    public final C0127l0 a(Iterable iterable) {
        copyOnWrite();
        ((MutationPayload$IntList) this.instance).addAllValue(iterable);
        return this;
    }
}
