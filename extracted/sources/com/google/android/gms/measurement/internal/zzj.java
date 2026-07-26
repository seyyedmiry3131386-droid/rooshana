package com.google.android.gms.measurement.internal;

import defpackage.gn9;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class zzj implements Runnable {
    final /* synthetic */ gn9 zza;
    final /* synthetic */ zzbg zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ AppMeasurementDynamiteService zzd;

    public zzj(AppMeasurementDynamiteService appMeasurementDynamiteService, gn9 gn9Var, zzbg zzbgVar, String str) {
        this.zza = gn9Var;
        this.zzb = zzbgVar;
        this.zzc = str;
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.zzd = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzd.zza.zzt().zzN(this.zza, this.zzb, this.zzc);
    }
}
