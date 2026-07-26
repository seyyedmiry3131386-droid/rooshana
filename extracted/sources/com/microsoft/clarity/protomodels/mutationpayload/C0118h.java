package com.microsoft.clarity.protomodels.mutationpayload;

import defpackage.fv4;

/* JADX INFO: renamed from: com.microsoft.clarity.protomodels.mutationpayload.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0118h extends com.google.protobuf.m implements fv4 {
    public C0118h() {
        super(MutationPayload$ColorFilter.DEFAULT_INSTANCE);
    }

    public final void a(double d) {
        copyOnWrite();
        ((MutationPayload$ColorFilter) this.instance).setColor(d);
    }

    public final C0118h b(double d) {
        copyOnWrite();
        ((MutationPayload$ColorFilter) this.instance).setMode(d);
        return this;
    }

    public final void a(MutationPayload$Color4f mutationPayload$Color4f) {
        copyOnWrite();
        ((MutationPayload$ColorFilter) this.instance).setColor4F(mutationPayload$Color4f);
    }

    public final void b(boolean z) {
        copyOnWrite();
        ((MutationPayload$ColorFilter) this.instance).setIsRowMajor(z);
    }

    public final C0118h a(MutationPayload$FloatList mutationPayload$FloatList) {
        copyOnWrite();
        ((MutationPayload$ColorFilter) this.instance).setMatrix(mutationPayload$FloatList);
        return this;
    }

    public final void a(boolean z) {
        copyOnWrite();
        ((MutationPayload$ColorFilter) this.instance).setIsRgba(z);
    }

    public final C0118h a(EnumC0122j enumC0122j) {
        copyOnWrite();
        ((MutationPayload$ColorFilter) this.instance).setTypeEnum(enumC0122j);
        return this;
    }
}
