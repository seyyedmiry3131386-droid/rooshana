package com.google.android.gms.measurement.internal;

import android.os.SystemClock;
import defpackage.eq;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class zznz extends zzay {
    final /* synthetic */ zzoa zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zznz(zzoa zzoaVar, zzjg zzjgVar) {
        super(zzjgVar);
        Objects.requireNonNull(zzoaVar);
        this.zza = zzoaVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzay
    public final void zza() {
        zzoa zzoaVar = this.zza;
        zzoc zzocVar = zzoaVar.zzc;
        zzocVar.zzg();
        zzic zzicVar = zzocVar.zzu;
        ((eq) zzicVar.zzaZ()).getClass();
        zzoaVar.zzd(false, false, SystemClock.elapsedRealtime());
        zzd zzdVarZzw = zzocVar.zzu.zzw();
        ((eq) zzicVar.zzaZ()).getClass();
        zzdVarZzw.zzc(SystemClock.elapsedRealtime());
    }
}
