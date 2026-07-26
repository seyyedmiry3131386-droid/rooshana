package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import defpackage.rq4;
import defpackage.vn9;
import defpackage.yo9;
import io.sentry.android.core.t0;
import ir.mservices.market.version2.webapi.responsedto.PackageListMetaDataDTO;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class zznt {
    private final Context zza;

    public zznt(Context context) {
        rq4.n(context);
        this.zza = context;
    }

    public static final void zzi(Intent intent) {
        if (intent == null) {
            t0.d("FA", "onRebind called with null intent");
        } else {
            "onRebind called. action: ".concat(String.valueOf(intent.getAction()));
        }
    }

    public static final boolean zzj(Intent intent) {
        if (intent == null) {
            t0.d("FA", "onUnbind called with null intent");
            return true;
        }
        "onUnbind called for intent. action: ".concat(String.valueOf(intent.getAction()));
        return true;
    }

    private final void zzk(zzpg zzpgVar, Runnable runnable) {
        zzpgVar.zzaW().zzj(new zzno(this, zzpgVar, runnable));
    }

    public final void zza() {
        this.zza.getClass().getSimpleName().concat(" is starting up.");
    }

    public final void zzb() {
        this.zza.getClass().getSimpleName().concat(" is shutting down.");
    }

    public final int zzc(final Intent intent, int i, final int i2) {
        if (intent == null) {
            t0.m("FA", "AppMeasurementService started with null intent");
            return 2;
        }
        Context context = this.zza;
        zzic zzicVarZzy = zzic.zzy(context, null, null);
        final zzgu zzguVarZzaV = zzicVarZzy.zzaV();
        String action = intent.getAction();
        zzicVarZzy.zzaU();
        zzguVarZzaV.zzk().zzc("Local AppMeasurementService called. startId, action", Integer.valueOf(i2), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            zzk(zzpg.zza(context), new Runnable() { // from class: com.google.android.gms.measurement.internal.zzns
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzf(i2, zzguVarZzaV, intent);
                }
            });
        }
        return 2;
    }

    public final IBinder zzd(Intent intent) {
        if (intent == null) {
            t0.d("FA", "onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new zzjd(zzpg.zza(this.zza), null);
        }
        t0.m("FA", "onBind received unknown action: ".concat(String.valueOf(action)));
        return null;
    }

    @TargetApi(24)
    public final boolean zze(final JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString(PackageListMetaDataDTO.KEY_ACTION);
        "onStartJob received action: ".concat(String.valueOf(string));
        if (Objects.equals(string, "com.google.android.gms.measurement.UPLOAD")) {
            rq4.n(string);
            zzpg zzpgVarZza = zzpg.zza(this.zza);
            final zzgu zzguVarZzaV = zzpgVarZza.zzaV();
            zzpgVarZza.zzaU();
            zzguVarZzaV.zzk().zzb("Local AppMeasurementJobService called. action", string);
            zzk(zzpgVarZza, new Runnable() { // from class: com.google.android.gms.measurement.internal.zznq
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzg(zzguVarZzaV, jobParameters);
                }
            });
        }
        if (!Objects.equals(string, "com.google.android.gms.measurement.SCION_UPLOAD")) {
            return true;
        }
        rq4.n(string);
        yo9 yo9VarE = yo9.e(this.zza, null);
        Runnable runnable = new Runnable() { // from class: com.google.android.gms.measurement.internal.zznr
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzh(jobParameters);
            }
        };
        yo9VarE.getClass();
        yo9VarE.c(new vn9(yo9VarE, runnable, 1));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ void zzf(int i, zzgu zzguVar, Intent intent) {
        Context context = this.zza;
        zznp zznpVar = (zznp) context;
        if (zznpVar.zza(i)) {
            zzguVar.zzk().zzb("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i));
            zzic.zzy(context, null, null).zzaV().zzk().zza("Completed wakeful intent.");
            zznpVar.zzc(intent);
        }
    }

    public final /* synthetic */ void zzg(zzgu zzguVar, JobParameters jobParameters) {
        zzguVar.zzk().zza("AppMeasurementJobService processed last upload request.");
        ((zznp) this.zza).zzb(jobParameters, false);
    }

    public final /* synthetic */ void zzh(JobParameters jobParameters) {
        ((zznp) this.zza).zzb(jobParameters, false);
    }
}
