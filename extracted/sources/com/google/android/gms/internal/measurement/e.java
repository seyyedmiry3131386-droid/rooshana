package com.google.android.gms.internal.measurement;

import defpackage.ht9;
import defpackage.lp9;

/* JADX INFO: loaded from: classes.dex */
public final class e extends q0 {
    private static final e zzj;
    private int zzb;
    private int zzd;
    private String zze = "";
    private c zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    static {
        e eVar = new e();
        zzj = eVar;
        q0.m(e.class, eVar);
    }

    public static lp9 x() {
        return (lp9) zzj.h();
    }

    @Override // com.google.android.gms.internal.measurement.q0
    public final Object o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new ht9(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new e();
        }
        if (i2 == 4) {
            return new lp9(zzj);
        }
        if (i2 == 5) {
            return zzj;
        }
        throw null;
    }

    public final boolean p() {
        return (this.zzb & 1) != 0;
    }

    public final int q() {
        return this.zzd;
    }

    public final String r() {
        return this.zze;
    }

    public final c s() {
        c cVar = this.zzf;
        return cVar == null ? c.x() : cVar;
    }

    public final boolean t() {
        return this.zzg;
    }

    public final boolean u() {
        return this.zzh;
    }

    public final boolean v() {
        return (this.zzb & 32) != 0;
    }

    public final boolean w() {
        return this.zzi;
    }

    public final /* synthetic */ void y(String str) {
        this.zzb |= 2;
        this.zze = str;
    }
}
