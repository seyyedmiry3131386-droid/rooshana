package com.microsoft.clarity.protomodels.mutationpayload;

import defpackage.fv4;

/* JADX INFO: loaded from: classes3.dex */
public final class r1 extends com.google.protobuf.m implements fv4 {
    public r1() {
        super(MutationPayload$TranslateCommandPayload.DEFAULT_INSTANCE);
    }

    public final r1 a(float f) {
        copyOnWrite();
        ((MutationPayload$TranslateCommandPayload) this.instance).setLeft(f);
        return this;
    }

    public final r1 b(float f) {
        copyOnWrite();
        ((MutationPayload$TranslateCommandPayload) this.instance).setTop(f);
        return this;
    }
}
