package com.microsoft.clarity.protomodels.mutationpayload;

import defpackage.fv4;

/* JADX INFO: loaded from: classes3.dex */
public final class w1 extends com.google.protobuf.m implements fv4 {
    public w1() {
        super(MutationPayload$ViewHierarchy.DEFAULT_INSTANCE);
    }

    public final w1 a(double d) {
        copyOnWrite();
        ((MutationPayload$ViewHierarchy) this.instance).setTimestamp(d);
        return this;
    }

    public final w1 a(Iterable iterable) {
        copyOnWrite();
        ((MutationPayload$ViewHierarchy) this.instance).addAllVisibleFragments(iterable);
        return this;
    }

    public final w1 a(MutationPayload$ViewNodeDelta mutationPayload$ViewNodeDelta) {
        copyOnWrite();
        ((MutationPayload$ViewHierarchy) this.instance).setRootDelta(mutationPayload$ViewNodeDelta);
        return this;
    }
}
