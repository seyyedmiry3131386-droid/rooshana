package com.google.android.gms.internal.measurement;

import defpackage.gp9;
import defpackage.gt9;
import defpackage.ht9;
import defpackage.ps9;

/* JADX INFO: loaded from: classes.dex */
public final class n extends q0 {
    private static final n zzd;
    private ps9 zzb = gt9.e;

    static {
        n nVar = new n();
        zzd = nVar;
        q0.m(n.class, nVar);
    }

    @Override // com.google.android.gms.internal.measurement.q0
    public final Object o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new ht9(zzd, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zzb"});
        }
        if (i2 == 3) {
            return new n();
        }
        if (i2 == 4) {
            return new gp9(zzd);
        }
        if (i2 == 5) {
            return zzd;
        }
        throw null;
    }
}
