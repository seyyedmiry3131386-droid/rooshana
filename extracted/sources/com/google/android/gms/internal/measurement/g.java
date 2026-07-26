package com.google.android.gms.internal.measurement;

import defpackage.b47;
import defpackage.gp9;
import defpackage.ht9;
import defpackage.ip9;

/* JADX INFO: loaded from: classes.dex */
public final class g extends q0 {
    private static final g zzg;
    private int zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        g gVar = new g();
        zzg = gVar;
        q0.m(g.class, gVar);
    }

    @Override // com.google.android.gms.internal.measurement.q0
    public final Object o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new ht9(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zzd", ip9.e, "zze", ip9.d, "zzf", ip9.f});
        }
        if (i2 == 3) {
            return new g();
        }
        if (i2 == 4) {
            return new gp9(zzg);
        }
        if (i2 == 5) {
            return zzg;
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
        int i;
        int i2 = this.zze;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                i = i2 != 2 ? 0 : 3;
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public final int r() {
        int i;
        int i2 = this.zzf;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                i = i2 != 2 ? 0 : 3;
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }
}
