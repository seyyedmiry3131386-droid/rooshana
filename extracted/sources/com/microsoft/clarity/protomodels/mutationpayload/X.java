package com.microsoft.clarity.protomodels.mutationpayload;

import defpackage.fv4;

/* JADX INFO: loaded from: classes3.dex */
public final class X extends com.google.protobuf.m implements fv4 {
    public X() {
        super(MutationPayload$DrawViewEndAnnotationCommandPayload.DEFAULT_INSTANCE);
    }

    public final X a(int i) {
        copyOnWrite();
        ((MutationPayload$DrawViewEndAnnotationCommandPayload) this.instance).setId(i);
        return this;
    }
}
