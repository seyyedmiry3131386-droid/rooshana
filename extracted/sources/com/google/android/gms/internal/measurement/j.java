package com.google.android.gms.internal.measurement;

import defpackage.gp9;
import defpackage.gt9;
import defpackage.ht9;
import defpackage.ps9;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class j extends q0 {
    private static final j zzi;
    private int zzb;
    private ps9 zzd;
    private ps9 zze;
    private ps9 zzf;
    private boolean zzg;
    private ps9 zzh;

    static {
        j jVar = new j();
        zzi = jVar;
        q0.m(j.class, jVar);
    }

    public j() {
        gt9 gt9Var = gt9.e;
        this.zzd = gt9Var;
        this.zze = gt9Var;
        this.zzf = gt9Var;
        this.zzh = gt9Var;
    }

    public static j v() {
        return zzi;
    }

    @Override // com.google.android.gms.internal.measurement.q0
    public final Object o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new ht9(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဇ\u0000\u0005\u001b", new Object[]{"zzb", "zzd", g.class, "zze", h.class, "zzf", i.class, "zzg", "zzh", g.class});
        }
        if (i2 == 3) {
            return new j();
        }
        if (i2 == 4) {
            return new gp9(zzi);
        }
        if (i2 == 5) {
            return zzi;
        }
        throw null;
    }

    public final List p() {
        return this.zzd;
    }

    public final List q() {
        return this.zze;
    }

    public final List r() {
        return this.zzf;
    }

    public final boolean s() {
        return (this.zzb & 1) != 0;
    }

    public final boolean t() {
        return this.zzg;
    }

    public final ps9 u() {
        return this.zzh;
    }
}
