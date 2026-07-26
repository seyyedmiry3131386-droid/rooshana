package com.google.android.gms.measurement.internal;

import defpackage.gn9;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class zzi implements Runnable {
    final /* synthetic */ gn9 zza;
    final /* synthetic */ AppMeasurementDynamiteService zzb;

    public zzi(AppMeasurementDynamiteService appMeasurementDynamiteService, gn9 gn9Var) {
        this.zza = gn9Var;
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.zzb = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zza.zzt().zzD(this.zza);
    }
}
