package com.google.android.gms.internal.measurement;

import defpackage.ht9;
import defpackage.os9;
import defpackage.sq9;
import defpackage.tr9;
import defpackage.ys9;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class h0 extends q0 {
    private static final h0 zzf;
    private int zzb;
    private int zzd;
    private os9 zze = ys9.e;

    static {
        h0 h0Var = new h0();
        zzf = h0Var;
        q0.m(h0.class, h0Var);
    }

    public static sq9 u() {
        return (sq9) zzf.h();
    }

    @Override // com.google.android.gms.internal.measurement.q0
    public final Object o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new ht9(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i2 == 3) {
            return new h0();
        }
        if (i2 == 4) {
            return new sq9(zzf);
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

    public final List r() {
        return this.zze;
    }

    public final int s() {
        return ((ys9) this.zze).size();
    }

    public final long t(int i) {
        return ((ys9) this.zze).c(i);
    }

    public final /* synthetic */ void v(int i) {
        this.zzb |= 1;
        this.zzd = i;
    }

    public final void w(List list) {
        RandomAccess randomAccess = this.zze;
        if (!((tr9) randomAccess).a) {
            ys9 ys9Var = (ys9) randomAccess;
            int i = ys9Var.c;
            this.zze = ys9Var.Y0(i + i);
        }
        o0.c(list, this.zze);
    }
}
