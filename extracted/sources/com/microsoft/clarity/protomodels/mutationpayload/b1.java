package com.microsoft.clarity.protomodels.mutationpayload;

import defpackage.fv4;

/* JADX INFO: loaded from: classes3.dex */
public final class b1 extends com.google.protobuf.m implements fv4 {
    public b1() {
        super(MutationPayload$ScaleCommandPayload.DEFAULT_INSTANCE);
    }

    public final b1 a(float f) {
        copyOnWrite();
        ((MutationPayload$ScaleCommandPayload) this.instance).setSx(f);
        return this;
    }

    public final b1 b(float f) {
        copyOnWrite();
        ((MutationPayload$ScaleCommandPayload) this.instance).setSy(f);
        return this;
    }
}
