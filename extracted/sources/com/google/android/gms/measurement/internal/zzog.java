package com.google.android.gms.measurement.internal;

import android.os.SystemClock;
import defpackage.eq;
import defpackage.rq4;
import defpackage.xt0;

/* JADX INFO: loaded from: classes.dex */
final class zzog {
    private final xt0 zza;
    private long zzb;

    public zzog(xt0 xt0Var) {
        rq4.n(xt0Var);
        this.zza = xt0Var;
    }

    public final void zza() {
        ((eq) this.zza).getClass();
        this.zzb = SystemClock.elapsedRealtime();
    }

    public final void zzb() {
        this.zzb = 0L;
    }

    public final boolean zzc(long j) {
        if (this.zzb == 0) {
            return true;
        }
        ((eq) this.zza).getClass();
        return SystemClock.elapsedRealtime() - this.zzb >= 3600000;
    }
}
