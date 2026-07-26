package com.google.android.gms.internal.measurement;

import defpackage.rm7;

/* JADX INFO: loaded from: classes.dex */
final class zzlc extends zzlg {
    public final int d;

    public zzlc(byte[] bArr, int i) {
        super(bArr);
        zzlh.l(0, i, bArr.length);
        this.d = i;
    }

    @Override // com.google.android.gms.internal.measurement.zzlg, com.google.android.gms.internal.measurement.zzlh
    public final byte a(int i) {
        int i2 = this.d;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.c[i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(rm7.o(i, "Index < 0: ", new StringBuilder(String.valueOf(i).length() + 11)));
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 18 + String.valueOf(i2).length());
        sb.append("Index > length: ");
        sb.append(i);
        sb.append(", ");
        sb.append(i2);
        throw new ArrayIndexOutOfBoundsException(sb.toString());
    }

    @Override // com.google.android.gms.internal.measurement.zzlg, com.google.android.gms.internal.measurement.zzlh
    public final byte c(int i) {
        return this.c[i];
    }

    @Override // com.google.android.gms.internal.measurement.zzlg, com.google.android.gms.internal.measurement.zzlh
    public final int e() {
        return this.d;
    }
}
