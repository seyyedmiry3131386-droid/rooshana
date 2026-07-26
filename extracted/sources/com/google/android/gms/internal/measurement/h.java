package com.google.android.gms.internal.measurement;

import defpackage.b47;
import defpackage.gp9;
import defpackage.ht9;
import defpackage.ip9;

/* JADX INFO: loaded from: classes.dex */
public final class h extends q0 {
    private static final h zzf;
    private int zzb;
    private int zzd;
    private int zze;

    static {
        h hVar = new h();
        zzf = hVar;
        q0.m(h.class, hVar);
    }

    @Override // com.google.android.gms.internal.measurement.q0
    public final Object o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            ip9 ip9Var = ip9.e;
            return new ht9(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzb", "zzd", ip9Var, "zze", ip9Var});
        }
        if (i2 == 3) {
            return new h();
        }
        if (i2 == 4) {
            return new gp9(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        throw null;
    }

    public final int p() {
        int iZ = b47.z(this.zzd);
        if (iZ == 0) {
            return 1;
        }
        return iZ;
    }

    public final int q() {
        int iZ = b47.z(this.zze);
        if (iZ == 0) {
            return 1;
        }
        return iZ;
    }
}
