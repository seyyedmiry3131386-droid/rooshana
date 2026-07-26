package com.microsoft.clarity.protomodels.mutationpayload;

/* JADX INFO: loaded from: classes3.dex */
public final class L0 extends com.google.protobuf.m implements M0 {
    public L0() {
        super(MutationPayload$Point.DEFAULT_INSTANCE);
    }

    public final L0 a(float f) {
        copyOnWrite();
        ((MutationPayload$Point) this.instance).setX(f);
        return this;
    }

    public final L0 b(float f) {
        copyOnWrite();
        ((MutationPayload$Point) this.instance).setY(f);
        return this;
    }
}
