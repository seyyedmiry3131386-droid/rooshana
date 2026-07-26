package com.microsoft.clarity.protomodels.mutationpayload;

import defpackage.lr3;

/* JADX INFO: loaded from: classes3.dex */
public enum D0 implements lr3 {
    DashPathEffect(0),
    CornerPathEffect(1),
    Path1DPathEffect(2),
    UNRECOGNIZED(-1);

    public final int a;

    D0(int i) {
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
