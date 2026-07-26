package com.google.android.gms.internal.measurement;

import defpackage.gp9;
import defpackage.gt9;
import defpackage.ht9;
import defpackage.ps9;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class m0 extends q0 {
    private static final m0 zzf;
    private int zzb;
    private ps9 zzd = gt9.e;
    private k0 zze;

    static {
        m0 m0Var = new m0();
        zzf = m0Var;
        q0.m(m0.class, m0Var);
    }

    @Override // com.google.android.gms.internal.measurement.q0
    public final Object o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new ht9(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zzb", "zzd", n0.class, "zze"});
        }
        if (i2 == 3) {
            return new m0();
        }
        if (i2 == 4) {
            return new gp9(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        throw null;
    }

    public final List p() {
        return this.zzd;
    }

    public final k0 q() {
        k0 k0Var = this.zze;
        return k0Var == null ? k0.r() : k0Var;
    }
}
