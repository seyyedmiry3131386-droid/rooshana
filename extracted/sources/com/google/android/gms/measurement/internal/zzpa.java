package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import defpackage.eq;
import defpackage.rq4;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class zzpa implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ Bundle zzc;
    final /* synthetic */ zzpb zzd;

    public zzpa(zzpb zzpbVar, String str, String str2, Bundle bundle) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = bundle;
        Objects.requireNonNull(zzpbVar);
        this.zzd = zzpbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzpg zzpgVar = this.zzd.zza;
        zzpp zzppVarZzt = zzpgVar.zzt();
        ((eq) zzpgVar.zzaZ()).getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        String str = this.zza;
        zzbg zzbgVarZzac = zzppVarZzt.zzac(str, this.zzb, this.zzc, "auto", jCurrentTimeMillis, false, true);
        rq4.n(zzbgVarZzac);
        zzpgVar.zzD(zzbgVarZzac, str);
    }
}
