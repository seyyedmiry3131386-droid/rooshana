package com.google.android.gms.internal.measurement;

import defpackage.gp9;
import defpackage.ht9;

/* JADX INFO: loaded from: classes.dex */
public final class t extends q0 {
    private static final t zzk;
    private int zzb;
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";

    static {
        t tVar = new t();
        zzk = tVar;
        q0.m(t.class, tVar);
    }

    @Override // com.google.android.gms.internal.measurement.q0
    public final Object o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new ht9(zzk, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new t();
        }
        if (i2 == 4) {
            return new gp9(zzk);
        }
        if (i2 == 5) {
            return zzk;
        }
        throw null;
    }
}
