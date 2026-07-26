package com.google.android.gms.internal.measurement;

import defpackage.hq9;
import defpackage.ht9;

/* JADX INFO: loaded from: classes.dex */
public final class v extends q0 {
    private static final v zzh;
    private int zzb;
    private int zzd;
    private g0 zze;
    private g0 zzf;
    private boolean zzg;

    static {
        v vVar = new v();
        zzh = vVar;
        q0.m(v.class, vVar);
    }

    public static hq9 w() {
        return (hq9) zzh.h();
    }

    public final /* synthetic */ void A(boolean z) {
        this.zzb |= 8;
        this.zzg = z;
    }

    @Override // com.google.android.gms.internal.measurement.q0
    public final Object o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new ht9(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new v();
        }
        if (i2 == 4) {
            return new hq9(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        throw null;
    }

    public final boolean p() {
        return (this.zzb & 1) != 0;
    }

    public final int q() {
        return this.zzd;
    }

    public final g0 r() {
        g0 g0Var = this.zze;
        return g0Var == null ? g0.y() : g0Var;
    }

    public final boolean s() {
        return (this.zzb & 4) != 0;
    }

    public final g0 t() {
        g0 g0Var = this.zzf;
        return g0Var == null ? g0.y() : g0Var;
    }

    public final boolean u() {
        return (this.zzb & 8) != 0;
    }

    public final boolean v() {
        return this.zzg;
    }

    public final /* synthetic */ void x(int i) {
        this.zzb |= 1;
        this.zzd = i;
    }

    public final /* synthetic */ void y(g0 g0Var) {
        this.zze = g0Var;
        this.zzb |= 2;
    }

    public final /* synthetic */ void z(g0 g0Var) {
        this.zzf = g0Var;
        this.zzb |= 4;
    }
}
