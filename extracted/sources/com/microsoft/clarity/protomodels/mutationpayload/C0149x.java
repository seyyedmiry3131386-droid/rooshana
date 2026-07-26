package com.microsoft.clarity.protomodels.mutationpayload;

import java.util.ArrayList;

/* JADX INFO: renamed from: com.microsoft.clarity.protomodels.mutationpayload.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0149x extends com.google.protobuf.m implements InterfaceC0151y {
    public C0149x() {
        super(MutationPayload$DoubleList.DEFAULT_INSTANCE);
    }

    public final C0149x a(ArrayList arrayList) {
        copyOnWrite();
        ((MutationPayload$DoubleList) this.instance).addAllValue(arrayList);
        return this;
    }
}
