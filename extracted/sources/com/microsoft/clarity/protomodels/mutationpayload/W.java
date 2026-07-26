package com.microsoft.clarity.protomodels.mutationpayload;

import defpackage.fv4;

/* JADX INFO: loaded from: classes3.dex */
public final class W extends com.google.protobuf.m implements fv4 {
    public W() {
        super(MutationPayload$DrawViewContentStartAnnotationCommandPayload.DEFAULT_INSTANCE);
    }

    public final W a(int i) {
        copyOnWrite();
        ((MutationPayload$DrawViewContentStartAnnotationCommandPayload) this.instance).setId(i);
        return this;
    }
}
