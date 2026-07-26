package com.microsoft.clarity.protomodels.mutationpayload;

import defpackage.fv4;

/* JADX INFO: renamed from: com.microsoft.clarity.protomodels.mutationpayload.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0104a0 extends com.google.protobuf.m implements fv4 {
    public C0104a0() {
        super(MutationPayload$FillViewCommandsAnnotationCommandPayload.DEFAULT_INSTANCE);
    }

    public final C0104a0 a(int i) {
        copyOnWrite();
        ((MutationPayload$FillViewCommandsAnnotationCommandPayload) this.instance).setId(i);
        return this;
    }
}
