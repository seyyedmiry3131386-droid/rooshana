package com.google.android.gms.internal.measurement;

import defpackage.gp9;
import defpackage.gt9;
import defpackage.ht9;
import defpackage.ip9;
import defpackage.ps9;

/* JADX INFO: loaded from: classes.dex */
public final class f extends q0 {
    private static final f zzh;
    private int zzb;
    private int zzd;
    private boolean zzf;
    private String zze = "";
    private ps9 zzg = gt9.e;

    static {
        f fVar = new f();
        zzh = fVar;
        q0.m(f.class, fVar);
    }

    public static f w() {
        return zzh;
    }

    @Override // com.google.android.gms.internal.measurement.q0
    public final Object o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new ht9(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zzb", "zzd", ip9.c, "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new f();
        }
        if (i2 == 4) {
            return new gp9(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        throw null;
    }

    public final boolean p() {
        return (this.zzb & 1) != 0;
    }

    public final boolean q() {
        return (this.zzb & 2) != 0;
    }

    public final String r() {
        return this.zze;
    }

    public final boolean s() {
        return (this.zzb & 4) != 0;
    }

    public final boolean t() {
        return this.zzf;
    }

    public final ps9 u() {
        return this.zzg;
    }

    public final int v() {
        return this.zzg.size();
    }

    public final int x() {
        int i;
        switch (this.zzd) {
            case 0:
                i = 1;
                break;
            case 1:
                i = 2;
                break;
            case 2:
                i = 3;
                break;
            case 3:
                i = 4;
                break;
            case 4:
                i = 5;
                break;
            case 5:
                i = 6;
                break;
            case 6:
                i = 7;
                break;
            default:
                i = 0;
                break;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }
}
