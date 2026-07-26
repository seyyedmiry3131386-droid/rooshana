package com.microsoft.clarity.protomodels.mutationpayload;

import defpackage.lr3;

/* JADX INFO: renamed from: com.microsoft.clarity.protomodels.mutationpayload.w0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC0148w0 implements lr3 {
    BlurMaskFilter(0),
    UNRECOGNIZED(-1);

    public final int a;

    EnumC0148w0(int i) {
        this.a = i;
    }

    @Override // defpackage.lr3
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
