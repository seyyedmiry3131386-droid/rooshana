package com.microsoft.clarity.protomodels.mutationpayload;

import defpackage.fv4;

/* JADX INFO: loaded from: classes3.dex */
public final class Y0 extends com.google.protobuf.m implements fv4 {
    public Y0() {
        super(MutationPayload$SaveBehindCommandPayload.DEFAULT_INSTANCE);
    }

    public final Y0 a(int i) {
        copyOnWrite();
        ((MutationPayload$SaveBehindCommandPayload) this.instance).setFlags(i);
        return this;
    }

    public final void a(MutationPayload$Rect mutationPayload$Rect) {
        copyOnWrite();
        ((MutationPayload$SaveBehindCommandPayload) this.instance).setSubset(mutationPayload$Rect);
    }
}
