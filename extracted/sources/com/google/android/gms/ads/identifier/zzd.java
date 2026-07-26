package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import defpackage.dt5;
import defpackage.eu2;
import defpackage.kf8;
import defpackage.lf8;
import defpackage.yi9;
import j$.time.Duration;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class zzd {
    private static volatile zzd zza;
    private static final Object zzb = new Object();
    private static final Duration zzc = Duration.ofMinutes(30);
    private final kf8 zzd;
    private final AtomicLong zze = new AtomicLong(-1);

    private zzd(Context context, String str) {
        this.zzd = new yi9(context, yi9.m, new lf8("ads_identifier:api"), eu2.c);
    }

    public static zzd zza(Context context) {
        if (zza == null) {
            synchronized (zzb) {
                try {
                    if (zza == null) {
                        zza = new zzd(context, "ads_identifier:api");
                    }
                } finally {
                }
            }
        }
        return zza;
    }

    public static void zzb(zzd zzdVar, long j, Exception exc) {
        ConnectionResult connectionResult;
        "getting error as ".concat(String.valueOf(exc.getMessage()));
        if ((exc instanceof ApiException) && (connectionResult = ((ApiException) exc).a.d) != null && connectionResult.b == 24) {
            zzdVar.zze.set(j);
        }
    }

    public final synchronized void zzc(int i, int i2, long j, long j2, int i3) {
        AtomicLong atomicLong = this.zze;
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        atomicLong.get();
        if (this.zze.get() == -1 || jElapsedRealtime - this.zze.get() > zzc.toMillis()) {
            kf8 kf8Var = this.zzd;
            if (kf8Var != null) {
                ((yi9) kf8Var).g(new TelemetryData(0, Arrays.asList(new MethodInvocation(35401, i2, 0, j, j2, null, null, 0, i3)))).i(new dt5() { // from class: com.google.android.gms.ads.identifier.zzc
                    @Override // defpackage.dt5
                    public final void onFailure(Exception exc) {
                        zzd.zzb(this.zza, jElapsedRealtime, exc);
                    }
                });
            }
        }
    }
}
