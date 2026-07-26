package com.google.android.gms.internal.auth;

import defpackage.dw1;
import defpackage.rm7;

/* JADX INFO: loaded from: classes.dex */
final class zzdz extends zzec {
    public final int d;

    public zzdz(byte[] bArr, int i) {
        super(bArr);
        zzef.i(i, bArr.length);
        this.d = i;
    }

    @Override // com.google.android.gms.internal.auth.zzec, com.google.android.gms.internal.auth.zzef
    public final byte a(int i) {
        int i2 = this.d;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.c[i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(rm7.n(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(dw1.j(i, i2, "Index > length: ", ", "));
    }

    @Override // com.google.android.gms.internal.auth.zzec, com.google.android.gms.internal.auth.zzef
    public final byte c(int i) {
        return this.c[i];
    }

    @Override // com.google.android.gms.internal.auth.zzec, com.google.android.gms.internal.auth.zzef
    public final int e() {
        return this.d;
    }
}
