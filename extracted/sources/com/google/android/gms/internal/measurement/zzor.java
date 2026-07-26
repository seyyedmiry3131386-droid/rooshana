package com.google.android.gms.internal.measurement;

import defpackage.wr9;

/* JADX INFO: loaded from: classes.dex */
final class zzor extends IllegalArgumentException {
    public zzor(int i, int i2) {
        super(wr9.a(i2, i, (byte) 32, "Unpaired surrogate at index ", " of "));
    }
}
