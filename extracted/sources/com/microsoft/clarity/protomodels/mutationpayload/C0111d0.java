package com.microsoft.clarity.protomodels.mutationpayload;

/* JADX INFO: renamed from: com.microsoft.clarity.protomodels.mutationpayload.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0111d0 extends com.google.protobuf.m implements InterfaceC0113e0 {
    public C0111d0() {
        super(MutationPayload$FontCoordinate.DEFAULT_INSTANCE);
    }

    public final C0111d0 a(String str) {
        copyOnWrite();
        ((MutationPayload$FontCoordinate) this.instance).setAxis(str);
        return this;
    }

    public final C0111d0 a(float f) {
        copyOnWrite();
        ((MutationPayload$FontCoordinate) this.instance).setValue(f);
        return this;
    }
}
