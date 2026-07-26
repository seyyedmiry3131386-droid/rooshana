package com.microsoft.clarity.protomodels.mutationpayload;

import defpackage.fv4;

/* JADX INFO: renamed from: com.microsoft.clarity.protomodels.mutationpayload.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0153z extends com.google.protobuf.m implements fv4 {
    public C0153z() {
        super(MutationPayload$DrawArcCommandPayload.DEFAULT_INSTANCE);
    }

    public final C0153z a(MutationPayload$Rect mutationPayload$Rect) {
        copyOnWrite();
        ((MutationPayload$DrawArcCommandPayload) this.instance).setRect(mutationPayload$Rect);
        return this;
    }

    public final C0153z b(float f) {
        copyOnWrite();
        ((MutationPayload$DrawArcCommandPayload) this.instance).setSweepAngle(f);
        return this;
    }

    public final C0153z a(float f) {
        copyOnWrite();
        ((MutationPayload$DrawArcCommandPayload) this.instance).setStartAngle(f);
        return this;
    }

    public final C0153z a(boolean z) {
        copyOnWrite();
        ((MutationPayload$DrawArcCommandPayload) this.instance).setUseCenter(z);
        return this;
    }

    public final void a(int i) {
        copyOnWrite();
        ((MutationPayload$DrawArcCommandPayload) this.instance).setPaintIndex(i);
    }
}
