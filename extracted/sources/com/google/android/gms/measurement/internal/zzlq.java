package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.os.Build;
import android.os.PersistableBundle;
import defpackage.rq4;
import ir.mservices.market.version2.webapi.responsedto.PackageListMetaDataDTO;

/* JADX INFO: loaded from: classes.dex */
public final class zzlq extends zzg {
    private JobScheduler zza;

    public zzlq(zzic zzicVar) {
        super(zzicVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    public final boolean zze() {
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    @TargetApi(24)
    public final void zzf() {
        this.zza = (JobScheduler) this.zzu.zzaY().getSystemService("jobscheduler");
    }

    @TargetApi(24)
    public final void zzh(long j) {
        zzb();
        zzg();
        JobScheduler jobScheduler = this.zza;
        if (jobScheduler != null && jobScheduler.getPendingJob(zzi()) != null) {
            this.zzu.zzaV().zzk().zza("[sgtm] There's an existing pending job, skip this schedule.");
            return;
        }
        com.google.android.gms.internal.measurement.zzin zzinVarZzj = zzj();
        if (zzinVarZzj != com.google.android.gms.internal.measurement.zzin.CLIENT_UPLOAD_ELIGIBLE) {
            this.zzu.zzaV().zzk().zzb("[sgtm] Not eligible for Scion upload", zzinVarZzj.name());
            return;
        }
        zzic zzicVar = this.zzu;
        zzicVar.zzaV().zzk().zzb("[sgtm] Scheduling Scion upload, millis", Long.valueOf(j));
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString(PackageListMetaDataDTO.KEY_ACTION, "com.google.android.gms.measurement.SCION_UPLOAD");
        JobInfo jobInfoBuild = new JobInfo.Builder(zzi(), new ComponentName(zzicVar.zzaY(), "com.google.android.gms.measurement.AppMeasurementJobService")).setRequiredNetworkType(1).setMinimumLatency(j).setOverrideDeadline(j + j).setExtras(persistableBundle).build();
        JobScheduler jobScheduler2 = this.zza;
        rq4.n(jobScheduler2);
        zzicVar.zzaV().zzk().zzb("[sgtm] Scion upload job scheduled with result", jobScheduler2.schedule(jobInfoBuild) == 1 ? "SUCCESS" : "FAILURE");
    }

    public final int zzi() {
        return "measurement-client".concat(String.valueOf(this.zzu.zzaY().getPackageName())).hashCode();
    }

    public final com.google.android.gms.internal.measurement.zzin zzj() {
        zzb();
        zzg();
        if (this.zza == null) {
            return com.google.android.gms.internal.measurement.zzin.MISSING_JOB_SCHEDULER;
        }
        zzic zzicVar = this.zzu;
        if (!zzicVar.zzc().zzx()) {
            return com.google.android.gms.internal.measurement.zzin.NOT_ENABLED_IN_MANIFEST;
        }
        zzic zzicVar2 = this.zzu;
        return zzicVar2.zzv().zzn() >= 119000 ? !zzpp.zzR(zzicVar.zzaY(), "com.google.android.gms.measurement.AppMeasurementJobService") ? com.google.android.gms.internal.measurement.zzin.MEASUREMENT_SERVICE_NOT_ENABLED : Build.VERSION.SDK_INT >= 24 ? !zzicVar2.zzt().zzK() ? com.google.android.gms.internal.measurement.zzin.NON_PLAY_MODE : com.google.android.gms.internal.measurement.zzin.CLIENT_UPLOAD_ELIGIBLE : com.google.android.gms.internal.measurement.zzin.ANDROID_TOO_OLD : com.google.android.gms.internal.measurement.zzin.SDK_TOO_OLD;
    }
}
