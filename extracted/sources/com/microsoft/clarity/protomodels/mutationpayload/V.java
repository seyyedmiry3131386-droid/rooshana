package com.microsoft.clarity.protomodels.mutationpayload;

import defpackage.fv4;

/* JADX INFO: loaded from: classes3.dex */
public final class V extends com.google.protobuf.m implements fv4 {
    public V() {
        super(MutationPayload$DrawViewContentEndAnnotationCommandPayload.DEFAULT_INSTANCE);
    }

    public final V a(int i) {
        copyOnWrite();
        ((MutationPayload$DrawViewContentEndAnnotationCommandPayload) this.instance).setId(i);
        return this;
    }
}
