package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import defpackage.rq4;
import defpackage.t61;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class zzml implements Runnable {
    final /* synthetic */ zzr zza;
    final /* synthetic */ zznl zzb;

    public zzml(zznl zznlVar, zzr zzrVar) {
        this.zza = zzrVar;
        Objects.requireNonNull(zznlVar);
        this.zzb = zznlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zznl zznlVar = this.zzb;
        zzgb zzgbVarZzZ = zznlVar.zzZ();
        if (zzgbVarZzZ == null) {
            t61.C(zznlVar.zzu, "Failed to send app backgrounded");
            return;
        }
        try {
            zzr zzrVar = this.zza;
            rq4.n(zzrVar);
            zzgbVarZzZ.zzA(zzrVar);
            zznlVar.zzV();
        } catch (RemoteException e) {
            this.zzb.zzu.zzaV().zzb().zzb("Failed to send app backgrounded to the service", e);
        }
    }
}
