package com.microsoft.clarity.protomodels.mutationpayload;

import defpackage.fv4;

/* JADX INFO: renamed from: com.microsoft.clarity.protomodels.mutationpayload.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0144u0 extends com.google.protobuf.m implements fv4 {
    public C0144u0() {
        super(MutationPayload$MaskFilter.DEFAULT_INSTANCE);
    }

    public final C0144u0 a(float f) {
        copyOnWrite();
        ((MutationPayload$MaskFilter) this.instance).setSigma(f);
        return this;
    }

    public final C0144u0 a(int i) {
        copyOnWrite();
        ((MutationPayload$MaskFilter) this.instance).setStyle(i);
        return this;
    }

    public final C0144u0 a(boolean z) {
        copyOnWrite();
        ((MutationPayload$MaskFilter) this.instance).setRespectCTM(z);
        return this;
    }

    public final C0144u0 a(EnumC0148w0 enumC0148w0) {
        copyOnWrite();
        ((MutationPayload$MaskFilter) this.instance).setTypeEnum(enumC0148w0);
        return this;
    }
}
