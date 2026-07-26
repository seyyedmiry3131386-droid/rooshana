package com.google.android.gms.measurement.internal;

import defpackage.gn9;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class zzk implements Runnable {
    final /* synthetic */ gn9 zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ AppMeasurementDynamiteService zze;

    public zzk(AppMeasurementDynamiteService appMeasurementDynamiteService, gn9 gn9Var, String str, String str2, boolean z) {
        this.zza = gn9Var;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = z;
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.zze = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zze.zza.zzt().zzu(this.zza, this.zzb, this.zzc, this.zzd);
    }
}
