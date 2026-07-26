package com.microsoft.clarity.protomodels.mutationpayload;

import defpackage.fv4;

/* JADX INFO: loaded from: classes3.dex */
public final class Y extends com.google.protobuf.m implements fv4 {
    public Y() {
        super(MutationPayload$DrawViewStartAnnotationCommandPayload.DEFAULT_INSTANCE);
    }

    public final Y a(int i) {
        copyOnWrite();
        ((MutationPayload$DrawViewStartAnnotationCommandPayload) this.instance).setId(i);
        return this;
    }
}
