package com.google.android.gms.internal.measurement;

import defpackage.gt9;
import defpackage.ht9;
import defpackage.os9;
import defpackage.ps9;
import defpackage.rq9;
import defpackage.tr9;
import defpackage.ys9;
import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class g0 extends q0 {
    private static final g0 zzg;
    private os9 zzb;
    private os9 zzd;
    private ps9 zze;
    private ps9 zzf;

    static {
        g0 g0Var = new g0();
        zzg = g0Var;
        q0.m(g0.class, g0Var);
    }

    public g0() {
        ys9 ys9Var = ys9.e;
        this.zzb = ys9Var;
        this.zzd = ys9Var;
        gt9 gt9Var = gt9.e;
        this.zze = gt9Var;
        this.zzf = gt9Var;
    }

    public static rq9 x() {
        return (rq9) zzg.h();
    }

    public static g0 y() {
        return zzg;
    }

    public final void A() {
        this.zzb = ys9.e;
    }

    public final void B(Iterable iterable) {
        RandomAccess randomAccess = this.zzd;
        if (!((tr9) randomAccess).a) {
            ys9 ys9Var = (ys9) randomAccess;
            int i = ys9Var.c;
            this.zzd = ys9Var.Y0(i + i);
        }
        o0.c(iterable, this.zzd);
    }

    public final void C() {
        this.zzd = ys9.e;
    }

    public final void D(ArrayList arrayList) {
        ps9 ps9Var = this.zze;
        if (!((tr9) ps9Var).a) {
            int size = ps9Var.size();
            this.zze = ps9Var.Y0(size + size);
        }
        o0.c(arrayList, this.zze);
    }

    public final void E() {
        this.zze = gt9.e;
    }

    public final void F(Iterable iterable) {
        ps9 ps9Var = this.zzf;
        if (!((tr9) ps9Var).a) {
            int size = ps9Var.size();
            this.zzf = ps9Var.Y0(size + size);
        }
        o0.c(iterable, this.zzf);
    }

    public final void G() {
        this.zzf = gt9.e;
    }

    @Override // com.google.android.gms.internal.measurement.q0
    public final Object o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new ht9(zzg, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzb", "zzd", "zze", y.class, "zzf", h0.class});
        }
        if (i2 == 3) {
            return new g0();
        }
        if (i2 == 4) {
            return new rq9(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        throw null;
    }

    public final List p() {
        return this.zzb;
    }

    public final int q() {
        return ((ys9) this.zzb).size();
    }

    public final List r() {
        return this.zzd;
    }

    public final int s() {
        return ((ys9) this.zzd).size();
    }

    public final ps9 t() {
        return this.zze;
    }

    public final int u() {
        return this.zze.size();
    }

    public final List v() {
        return this.zzf;
    }

    public final int w() {
        return this.zzf.size();
    }

    public final void z(Iterable iterable) {
        RandomAccess randomAccess = this.zzb;
        if (!((tr9) randomAccess).a) {
            ys9 ys9Var = (ys9) randomAccess;
            int i = ys9Var.c;
            this.zzb = ys9Var.Y0(i + i);
        }
        o0.c(iterable, this.zzb);
    }
}
