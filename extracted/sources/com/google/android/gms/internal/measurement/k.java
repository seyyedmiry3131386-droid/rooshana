package com.google.android.gms.internal.measurement;

import defpackage.gp9;
import defpackage.gt9;
import defpackage.ht9;
import defpackage.ps9;

/* JADX INFO: loaded from: classes.dex */
public final class k extends q0 {
    private static final k zzg;
    private int zzb;
    private String zzd = "";
    private ps9 zze = gt9.e;
    private boolean zzf;

    static {
        k kVar = new k();
        zzg = kVar;
        q0.m(k.class, kVar);
    }

    @Override // com.google.android.gms.internal.measurement.q0
    public final Object o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new ht9(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"zzb", "zzd", "zze", p.class, "zzf"});
        }
        if (i2 == 3) {
            return new k();
        }
        if (i2 == 4) {
            return new gp9(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        throw null;
    }

    public final String p() {
        return this.zzd;
    }
}
