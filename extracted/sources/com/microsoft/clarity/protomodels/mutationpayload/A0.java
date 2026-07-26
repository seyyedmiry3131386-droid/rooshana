package com.microsoft.clarity.protomodels.mutationpayload;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class A0 extends com.google.protobuf.m implements E0 {
    public A0() {
        super(MutationPayload$Path.DEFAULT_INSTANCE);
    }

    public final A0 a(int i) {
        copyOnWrite();
        ((MutationPayload$Path) this.instance).setFillType(i);
        return this;
    }

    public final A0 a(List list) {
        copyOnWrite();
        ((MutationPayload$Path) this.instance).addAllVerbs(list);
        return this;
    }
}
