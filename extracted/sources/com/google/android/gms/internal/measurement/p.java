package com.google.android.gms.internal.measurement;

import defpackage.gp9;
import defpackage.ht9;

/* JADX INFO: loaded from: classes.dex */
public final class p extends q0 {
    private static final p zzf;
    private int zzb;
    private String zzd = "";
    private String zze = "";

    static {
        p pVar = new p();
        zzf = pVar;
        q0.m(p.class, pVar);
    }

    @Override // com.google.android.gms.internal.measurement.q0
    public final Object o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new ht9(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i2 == 3) {
            return new p();
        }
        if (i2 == 4) {
            return new gp9(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        throw null;
    }
}
