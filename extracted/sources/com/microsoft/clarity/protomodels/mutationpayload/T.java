package com.microsoft.clarity.protomodels.mutationpayload;

import defpackage.fv4;

/* JADX INFO: loaded from: classes3.dex */
public final class T extends com.google.protobuf.m implements fv4 {
    public T() {
        super(MutationPayload$DrawTextBlobCommandPayload.DEFAULT_INSTANCE);
    }

    public final T a(int i) {
        copyOnWrite();
        ((MutationPayload$DrawTextBlobCommandPayload) this.instance).setBlobIndex(i);
        return this;
    }

    public final T b(float f) {
        copyOnWrite();
        ((MutationPayload$DrawTextBlobCommandPayload) this.instance).setY(f);
        return this;
    }

    public final T a(float f) {
        copyOnWrite();
        ((MutationPayload$DrawTextBlobCommandPayload) this.instance).setX(f);
        return this;
    }

    public final void b(int i) {
        copyOnWrite();
        ((MutationPayload$DrawTextBlobCommandPayload) this.instance).setPaintIndex(i);
    }
}
