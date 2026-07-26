package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import defpackage.rn9;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class zzp implements zzjp {
    public final rn9 zza;
    final /* synthetic */ AppMeasurementDynamiteService zzb;

    public zzp(AppMeasurementDynamiteService appMeasurementDynamiteService, rn9 rn9Var) {
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.zzb = appMeasurementDynamiteService;
        this.zza = rn9Var;
    }

    @Override // com.google.android.gms.measurement.internal.zzjp
    public final void interceptEvent(String str, String str2, Bundle bundle, long j) {
        try {
            this.zza.m(str, str2, bundle, j);
        } catch (RemoteException e) {
            zzic zzicVar = this.zzb.zza;
            if (zzicVar != null) {
                zzicVar.zzaV().zze().zzb("Event interceptor threw exception", e);
            }
        }
    }
}
