package com.google.protobuf;

import defpackage.lr3;

/* JADX INFO: loaded from: classes3.dex */
public enum NullValue implements lr3 {
    NULL_VALUE(0),
    UNRECOGNIZED(-1);

    public final int a;

    NullValue(int i) {
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
