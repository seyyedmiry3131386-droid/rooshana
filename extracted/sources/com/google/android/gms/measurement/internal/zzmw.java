package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import defpackage.gn9;
import defpackage.rq4;
import j$.util.Objects;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
final class zzmw implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzr zzc;
    final /* synthetic */ gn9 zzd;
    final /* synthetic */ zznl zze;

    public zzmw(zznl zznlVar, String str, String str2, zzr zzrVar, gn9 gn9Var) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzrVar;
        this.zzd = gn9Var;
        Objects.requireNonNull(zznlVar);
        this.zze = zznlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gn9 gn9Var;
        zzpp zzppVarZzk;
        zznl zznlVar;
        zzgb zzgbVarZzZ;
        ArrayList arrayList = new ArrayList();
        try {
            try {
                zznlVar = this.zze;
                zzgbVarZzZ = zznlVar.zzZ();
            } catch (RemoteException e) {
                this.zze.zzu.zzaV().zzb().zzd("Failed to get conditional properties; remote exception", this.zza, this.zzb, e);
            }
            if (zzgbVarZzZ == null) {
                zzic zzicVar = zznlVar.zzu;
                zzicVar.zzaV().zzb().zzc("Failed to get conditional properties; not connected to service", this.zza, this.zzb);
                zzppVarZzk = zzicVar.zzk();
                gn9Var = this.zzd;
                zzppVarZzk.zzar(gn9Var, arrayList);
            }
            zzr zzrVar = this.zzc;
            rq4.n(zzrVar);
            arrayList = zzpp.zzas(zzgbVarZzZ.zzr(this.zza, this.zzb, zzrVar));
            zznlVar.zzV();
            zznl zznlVar2 = this.zze;
            gn9Var = this.zzd;
            zzppVarZzk = zznlVar2.zzu.zzk();
            zzppVarZzk.zzar(gn9Var, arrayList);
        } catch (Throwable th) {
            zznl zznlVar3 = this.zze;
            zznlVar3.zzu.zzk().zzar(this.zzd, arrayList);
            throw th;
        }
    }
}
