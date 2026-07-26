package com.google.android.gms.internal.measurement;

import defpackage.ht9;
import defpackage.ip9;
import defpackage.jq9;

/* JADX INFO: loaded from: classes.dex */
public final class w extends q0 {
    private static final w zzf;
    private int zzb;
    private int zzd;
    private int zze;

    static {
        w wVar = new w();
        zzf = wVar;
        q0.m(w.class, wVar);
    }

    public static jq9 p() {
        return (jq9) zzf.h();
    }

    @Override // com.google.android.gms.internal.measurement.q0
    public final Object o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new ht9(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzb", "zzd", ip9.h, "zze", ip9.i});
        }
        if (i2 == 3) {
            return new w();
        }
        if (i2 == 4) {
            return new jq9(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        throw null;
    }

    public final int q() {
        int i;
        int i2 = this.zzd;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                if (i2 != 2) {
                    i = 4;
                    if (i2 != 3) {
                        i = i2 != 4 ? 0 : 5;
                    }
                } else {
                    i = 3;
                }
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

    public final /* synthetic */ void s(int i) {
        this.zzd = i - 1;
        this.zzb |= 1;
    }

    public final /* synthetic */ void t(int i) {
        this.zze = i - 1;
        this.zzb |= 2;
    }
}
