package com.google.android.gms.internal.measurement;

import defpackage.gp9;
import defpackage.gt9;
import defpackage.ht9;
import defpackage.ps9;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class l0 extends q0 {
    private static final l0 zzf;
    private int zzb;
    private String zzd = "";
    private ps9 zze = gt9.e;

    static {
        l0 l0Var = new l0();
        zzf = l0Var;
        q0.m(l0.class, l0Var);
    }

    @Override // com.google.android.gms.internal.measurement.q0
    public final Object o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new ht9(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zzb", "zzd", "zze", n0.class});
        }
        if (i2 == 3) {
            return new l0();
        }
        if (i2 == 4) {
            return new gp9(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        throw null;
    }

    public final String p() {
        return this.zzd;
    }

    public final List q() {
        return this.zze;
    }
}
