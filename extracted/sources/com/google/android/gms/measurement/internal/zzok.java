package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import defpackage.ym9;

/* JADX INFO: loaded from: classes.dex */
public final class zzok extends zzos {
    private final AlarmManager zza;
    private zzay zzb;
    private Integer zzc;

    public zzok(zzpg zzpgVar) {
        super(zzpgVar);
        this.zza = (AlarmManager) this.zzu.zzaY().getSystemService("alarm");
    }

    private final zzay zzf() {
        if (this.zzb == null) {
            this.zzb = new zzoj(this, this.zzg.zzag());
        }
        return this.zzb;
    }

    @TargetApi(24)
    private final void zzh() {
        JobScheduler jobScheduler = (JobScheduler) this.zzu.zzaY().getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(zzi());
        }
    }

    private final int zzi() {
        if (this.zzc == null) {
            this.zzc = Integer.valueOf("measurement".concat(String.valueOf(this.zzu.zzaY().getPackageName())).hashCode());
        }
        return this.zzc.intValue();
    }

    private final PendingIntent zzj() {
        Context contextZzaY = this.zzu.zzaY();
        return PendingIntent.getBroadcast(contextZzaY, 0, new Intent().setClassName(contextZzaY, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), ym9.a);
    }

    @Override // com.google.android.gms.measurement.internal.zzos
    public final boolean zzbb() {
        AlarmManager alarmManager = this.zza;
        if (alarmManager != null) {
            alarmManager.cancel(zzj());
        }
        if (Build.VERSION.SDK_INT < 24) {
            return false;
        }
        zzh();
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzc(long r13) {
        /*
            Method dump skipped, instruction units count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzok.zzc(long):void");
    }

    public final void zzd() {
        zzaw();
        this.zzu.zzaV().zzk().zza("Unscheduling upload");
        AlarmManager alarmManager = this.zza;
        if (alarmManager != null) {
            alarmManager.cancel(zzj());
        }
        zzf().zzd();
        if (Build.VERSION.SDK_INT >= 24) {
            zzh();
        }
    }
}
