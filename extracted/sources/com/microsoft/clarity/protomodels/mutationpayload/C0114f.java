package com.microsoft.clarity.protomodels.mutationpayload;

/* JADX INFO: renamed from: com.microsoft.clarity.protomodels.mutationpayload.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0114f extends com.google.protobuf.m implements InterfaceC0116g {
    public C0114f() {
        super(MutationPayload$Color4f.DEFAULT_INSTANCE);
    }

    public final C0114f a(float f) {
        copyOnWrite();
        ((MutationPayload$Color4f) this.instance).setA(f);
        return this;
    }

    public final C0114f b(float f) {
        copyOnWrite();
        ((MutationPayload$Color4f) this.instance).setB(f);
        return this;
    }

    public final C0114f c(float f) {
        copyOnWrite();
        ((MutationPayload$Color4f) this.instance).setG(f);
        return this;
    }

    public final C0114f d(float f) {
        copyOnWrite();
        ((MutationPayload$Color4f) this.instance).setR(f);
        return this;
    }
}
