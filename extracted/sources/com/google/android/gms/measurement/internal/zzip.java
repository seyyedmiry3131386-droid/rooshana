package com.google.android.gms.measurement.internal;

import defpackage.rq4;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class zzip implements Runnable {
    final /* synthetic */ zzr zza;
    final /* synthetic */ zzjd zzb;

    public zzip(zzjd zzjdVar, zzr zzrVar) {
        this.zza = zzrVar;
        Objects.requireNonNull(zzjdVar);
        this.zzb = zzjdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjd zzjdVar = this.zzb;
        zzjdVar.zzL().zzZ();
        zzpg zzpgVarZzL = zzjdVar.zzL();
        zzpgVarZzL.zzaW().zzg();
        zzpgVarZzL.zzu();
        zzr zzrVar = this.zza;
        rq4.k(zzrVar.zza);
        zzpgVarZzL.zzv(zzrVar);
        zzpgVarZzL.zzw(zzrVar);
    }
}
