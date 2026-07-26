package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import defpackage.dt5;
import defpackage.eq;
import defpackage.eu2;
import defpackage.kf8;
import defpackage.lf8;
import defpackage.yi9;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class zzgq {
    private static zzgq zza;
    private final zzic zzb;
    private final kf8 zzc;
    private final AtomicLong zzd = new AtomicLong(-1);

    private zzgq(Context context, zzic zzicVar) {
        this.zzc = new yi9(context, yi9.m, new lf8("measurement:api"), eu2.c);
        this.zzb = zzicVar;
    }

    public static zzgq zza(zzic zzicVar) {
        if (zza == null) {
            zza = new zzgq(zzicVar.zzaY(), zzicVar);
        }
        return zza;
    }

    public final synchronized void zzb(int i, int i2, long j, long j2, int i3) {
        ((eq) this.zzb.zzaZ()).getClass();
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        AtomicLong atomicLong = this.zzd;
        if (atomicLong.get() != -1 && jElapsedRealtime - atomicLong.get() <= 1800000) {
            return;
        }
        ((yi9) this.zzc).g(new TelemetryData(0, Arrays.asList(new MethodInvocation(36301, i2, 0, j, j2, null, null, 0, i3)))).i(new dt5() { // from class: com.google.android.gms.measurement.internal.zzgp
            @Override // defpackage.dt5
            public final /* synthetic */ void onFailure(Exception exc) {
                this.zza.zzc(jElapsedRealtime, exc);
            }
        });
    }

    public final /* synthetic */ void zzc(long j, Exception exc) {
        this.zzd.set(j);
    }
}
