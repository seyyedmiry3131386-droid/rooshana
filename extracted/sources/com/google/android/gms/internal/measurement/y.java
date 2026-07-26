package com.google.android.gms.internal.measurement;

import defpackage.ht9;
import defpackage.kq9;

/* JADX INFO: loaded from: classes.dex */
public final class y extends q0 {
    private static final y zzf;
    private int zzb;
    private int zzd;
    private long zze;

    static {
        y yVar = new y();
        zzf = yVar;
        q0.m(y.class, yVar);
    }

    public static kq9 t() {
        return (kq9) zzf.h();
    }

    @Override // com.google.android.gms.internal.measurement.q0
    public final Object o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new ht9(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i2 == 3) {
            return new y();
        }
        if (i2 == 4) {
            return new kq9(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        throw null;
    }

    public final boolean p() {
        return (this.zzb & 1) != 0;
    }

    public final int q() {
        return this.zzd;
    }

    public final boolean r() {
        return (this.zzb & 2) != 0;
    }

    public final long s() {
        return this.zze;
    }

    public final /* synthetic */ void u(int i) {
        this.zzb |= 1;
        this.zzd = i;
    }

    public final /* synthetic */ void v(long j) {
        this.zzb |= 2;
        this.zze = j;
    }
}
