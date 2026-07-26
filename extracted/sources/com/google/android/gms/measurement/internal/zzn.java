package com.google.android.gms.measurement.internal;

import defpackage.gn9;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class zzn implements Runnable {
    final /* synthetic */ gn9 zza;
    final /* synthetic */ AppMeasurementDynamiteService zzb;

    public zzn(AppMeasurementDynamiteService appMeasurementDynamiteService, gn9 gn9Var) {
        this.zza = gn9Var;
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.zzb = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AppMeasurementDynamiteService appMeasurementDynamiteService = this.zzb;
        appMeasurementDynamiteService.zza.zzk().zzap(this.zza, appMeasurementDynamiteService.zza.zzA());
    }
}
