package com.microsoft.clarity.protomodels.mutationpayload;

import defpackage.fv4;

/* JADX INFO: renamed from: com.microsoft.clarity.protomodels.mutationpayload.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0115f0 extends com.google.protobuf.m implements fv4 {
    public C0115f0() {
        super(MutationPayload$FontStyle.DEFAULT_INSTANCE);
    }

    public final C0115f0 a(double d) {
        copyOnWrite();
        ((MutationPayload$FontStyle) this.instance).setSlant(d);
        return this;
    }

    public final C0115f0 b(double d) {
        copyOnWrite();
        ((MutationPayload$FontStyle) this.instance).setWeight(d);
        return this;
    }

    public final C0115f0 c(double d) {
        copyOnWrite();
        ((MutationPayload$FontStyle) this.instance).setWidth(d);
        return this;
    }
}
