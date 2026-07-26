package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import defpackage.rq4;

/* JADX INFO: loaded from: classes.dex */
public final class zzjs {
    final Context zza;
    Boolean zzb;
    long zzc;
    com.google.android.gms.internal.measurement.zzdd zzd;
    boolean zze;
    final Long zzf;
    String zzg;

    public zzjs(Context context, com.google.android.gms.internal.measurement.zzdd zzddVar, Long l) {
        this.zze = true;
        rq4.n(context);
        Context applicationContext = context.getApplicationContext();
        rq4.n(applicationContext);
        this.zza = applicationContext;
        this.zzf = l;
        if (zzddVar != null) {
            this.zzd = zzddVar;
            this.zze = zzddVar.c;
            this.zzc = zzddVar.b;
            this.zzg = zzddVar.e;
            Bundle bundle = zzddVar.d;
            if (bundle != null) {
                this.zzb = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
