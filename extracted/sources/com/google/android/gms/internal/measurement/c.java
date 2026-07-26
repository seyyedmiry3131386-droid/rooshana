package com.google.android.gms.internal.measurement;

import defpackage.ep9;
import defpackage.ht9;

/* JADX INFO: loaded from: classes.dex */
public final class c extends q0 {
    private static final c zzh;
    private int zzb;
    private f zzd;
    private d zze;
    private boolean zzf;
    private String zzg = "";

    static {
        c cVar = new c();
        zzh = cVar;
        q0.m(c.class, cVar);
    }

    public static c x() {
        return zzh;
    }

    @Override // com.google.android.gms.internal.measurement.q0
    public final Object o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new ht9(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new c();
        }
        if (i2 == 4) {
            return new ep9(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        throw null;
    }

    public final boolean p() {
        return (this.zzb & 1) != 0;
    }

    public final f q() {
        f fVar = this.zzd;
        return fVar == null ? f.w() : fVar;
    }

    public final boolean r() {
        return (this.zzb & 2) != 0;
    }

    public final d s() {
        d dVar = this.zze;
        return dVar == null ? d.y() : dVar;
    }

    public final boolean t() {
        return (this.zzb & 4) != 0;
    }

    public final boolean u() {
        return this.zzf;
    }

    public final boolean v() {
        return (this.zzb & 8) != 0;
    }

    public final String w() {
        return this.zzg;
    }

    public final /* synthetic */ void y(String str) {
        this.zzb |= 8;
        this.zzg = str;
    }
}
