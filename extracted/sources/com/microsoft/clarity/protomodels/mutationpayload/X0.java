package com.microsoft.clarity.protomodels.mutationpayload;

import defpackage.lr3;

/* JADX INFO: loaded from: classes3.dex */
public enum X0 implements lr3 {
    CubicSampling(0),
    NonCubicSampling(1),
    AnisoSampling(2),
    UNRECOGNIZED(-1);

    public final int a;

    X0(int i) {
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
