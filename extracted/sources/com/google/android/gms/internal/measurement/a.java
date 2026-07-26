package com.google.android.gms.internal.measurement;

import defpackage.ap9;
import defpackage.gt9;
import defpackage.ht9;
import defpackage.ps9;
import defpackage.tr9;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a extends q0 {
    private static final a zzi;
    private int zzb;
    private int zzd;
    private ps9 zze;
    private ps9 zzf;
    private boolean zzg;
    private boolean zzh;

    static {
        a aVar = new a();
        zzi = aVar;
        q0.m(a.class, aVar);
    }

    public a() {
        gt9 gt9Var = gt9.e;
        this.zze = gt9Var;
        this.zzf = gt9Var;
    }

    @Override // com.google.android.gms.internal.measurement.q0
    public final Object o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new ht9(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzb", "zzd", "zze", e.class, "zzf", b.class, "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new a();
        }
        if (i2 == 4) {
            return new ap9(zzi);
        }
        if (i2 == 5) {
            return zzi;
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
        return this.zze.size();
    }

    public final e t(int i) {
        return (e) this.zze.get(i);
    }

    public final ps9 u() {
        return this.zzf;
    }

    public final int v() {
        return this.zzf.size();
    }

    public final b w(int i) {
        return (b) this.zzf.get(i);
    }

    public final void x(int i, e eVar) {
        ps9 ps9Var = this.zze;
        if (!((tr9) ps9Var).a) {
            int size = ps9Var.size();
            this.zze = ps9Var.Y0(size + size);
        }
        this.zze.set(i, eVar);
    }

    public final void y(int i, b bVar) {
        ps9 ps9Var = this.zzf;
        if (!((tr9) ps9Var).a) {
            int size = ps9Var.size();
            this.zzf = ps9Var.Y0(size + size);
        }
        this.zzf.set(i, bVar);
    }
}
