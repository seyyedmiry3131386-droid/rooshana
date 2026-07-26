package com.microsoft.clarity.protomodels.mutationpayload;

import defpackage.fv4;
import java.util.List;

/* JADX INFO: renamed from: com.microsoft.clarity.protomodels.mutationpayload.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0138r0 extends com.google.protobuf.m implements fv4 {
    public C0138r0() {
        super(MutationPayload$Looper.DEFAULT_INSTANCE);
    }

    public final C0138r0 a(List list) {
        copyOnWrite();
        ((MutationPayload$Looper) this.instance).addAllLayers(list);
        return this;
    }

    public final C0138r0 a(EnumC0142t0 enumC0142t0) {
        copyOnWrite();
        ((MutationPayload$Looper) this.instance).setTypeEnum(enumC0142t0);
        return this;
    }
}
