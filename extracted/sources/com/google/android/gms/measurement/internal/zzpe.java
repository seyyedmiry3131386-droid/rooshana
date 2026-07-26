package com.google.android.gms.measurement.internal;

import defpackage.eq;
import defpackage.rq4;

/* JADX INFO: loaded from: classes.dex */
final class zzpe {
    private final zzpg zza;
    private int zzb = 1;
    private long zzc = zzd();

    public zzpe(zzpg zzpgVar) {
        this.zza = zzpgVar;
    }

    private final long zzd() {
        zzpg zzpgVar = this.zza;
        rq4.n(zzpgVar);
        long jLongValue = ((Long) zzfy.zzu.zzb(null)).longValue();
        long jLongValue2 = ((Long) zzfy.zzv.zzb(null)).longValue();
        for (int i = 1; i < this.zzb; i++) {
            jLongValue += jLongValue;
            if (jLongValue >= jLongValue2) {
                break;
            }
        }
        ((eq) zzpgVar.zzaZ()).getClass();
        return Math.min(jLongValue, jLongValue2) + System.currentTimeMillis();
    }

    public final void zza() {
        this.zzb++;
        this.zzc = zzd();
    }

    public final boolean zzb() {
        ((eq) this.zza.zzaZ()).getClass();
        return System.currentTimeMillis() >= this.zzc;
    }

    public final /* synthetic */ long zzc() {
        return this.zzc;
    }
}
