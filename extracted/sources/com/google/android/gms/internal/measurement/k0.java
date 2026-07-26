package com.google.android.gms.internal.measurement;

import defpackage.gp9;
import defpackage.gt9;
import defpackage.ht9;
import defpackage.ps9;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class k0 extends q0 {
    private static final k0 zzd;
    private ps9 zzb = gt9.e;

    static {
        k0 k0Var = new k0();
        zzd = k0Var;
        q0.m(k0.class, k0Var);
    }

    public static k0 r() {
        return zzd;
    }

    @Override // com.google.android.gms.internal.measurement.q0
    public final Object o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new ht9(zzd, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", l0.class});
        }
        if (i2 == 3) {
            return new k0();
        }
        if (i2 == 4) {
            return new gp9(zzd);
        }
        if (i2 == 5) {
            return zzd;
        }
        throw null;
    }

    public final List p() {
        return this.zzb;
    }

    public final int q() {
        return this.zzb.size();
    }
}
