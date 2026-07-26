package com.google.android.gms.internal.measurement;

import defpackage.gp9;
import defpackage.ht9;

/* JADX INFO: loaded from: classes.dex */
public final class c0 extends q0 {
    private static final c0 zzg;
    private int zzb;
    private String zzd = "";
    private String zze = "";
    private t zzf;

    static {
        c0 c0Var = new c0();
        zzg = c0Var;
        q0.m(c0.class, c0Var);
    }

    @Override // com.google.android.gms.internal.measurement.q0
    public final Object o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new ht9(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"zzb", "zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new c0();
        }
        if (i2 == 4) {
            return new gp9(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        throw null;
    }
}
