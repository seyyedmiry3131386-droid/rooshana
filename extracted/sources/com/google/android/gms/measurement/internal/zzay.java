package com.google.android.gms.measurement.internal;

import android.os.Handler;
import defpackage.eq;
import defpackage.jx;
import defpackage.rq4;

/* JADX INFO: loaded from: classes.dex */
abstract class zzay {
    private static volatile Handler zzb;
    private final zzjg zza;
    private final Runnable zzc;
    private volatile long zzd;

    public zzay(zzjg zzjgVar) {
        rq4.n(zzjgVar);
        this.zza = zzjgVar;
        this.zzc = new zzax(this, zzjgVar);
    }

    private final Handler zzf() {
        Handler handler;
        if (zzb != null) {
            return zzb;
        }
        synchronized (zzay.class) {
            try {
                if (zzb == null) {
                    zzb = new jx(this.zza.zzaY().getMainLooper(), 5);
                }
                handler = zzb;
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public abstract void zza();

    public final void zzb(long j) {
        zzd();
        if (j >= 0) {
            zzjg zzjgVar = this.zza;
            ((eq) zzjgVar.zzaZ()).getClass();
            this.zzd = System.currentTimeMillis();
            if (zzf().postDelayed(this.zzc, j)) {
                return;
            }
            zzjgVar.zzaV().zzb().zzb("Failed to schedule delayed post. time", Long.valueOf(j));
        }
    }

    public final boolean zzc() {
        return this.zzd != 0;
    }

    public final void zzd() {
        this.zzd = 0L;
        zzf().removeCallbacks(this.zzc);
    }

    public final /* synthetic */ void zze(long j) {
        this.zzd = 0L;
    }
}
