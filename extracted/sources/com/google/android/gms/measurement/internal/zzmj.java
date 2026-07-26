package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import defpackage.gn9;
import defpackage.rq4;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class zzmj implements Runnable {
    final /* synthetic */ zzr zza;
    final /* synthetic */ gn9 zzb;
    final /* synthetic */ zznl zzc;

    public zzmj(zznl zznlVar, zzr zzrVar, gn9 gn9Var) {
        this.zza = zzrVar;
        this.zzb = gn9Var;
        Objects.requireNonNull(zznlVar);
        this.zzc = zznlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gn9 gn9Var;
        zzpp zzppVarZzk;
        zznl zznlVar;
        zzic zzicVar;
        String strZzm = null;
        try {
            try {
                zznlVar = this.zzc;
                zzicVar = zznlVar.zzu;
            } catch (RemoteException e) {
                this.zzc.zzu.zzaV().zzb().zzb("Failed to get app instance id", e);
            }
            if (zzicVar.zzd().zzl().zzo(zzjk.ANALYTICS_STORAGE)) {
                zzgb zzgbVarZzZ = zznlVar.zzZ();
                if (zzgbVarZzZ != null) {
                    zzr zzrVar = this.zza;
                    rq4.n(zzrVar);
                    strZzm = zzgbVarZzZ.zzm(zzrVar);
                    if (strZzm != null) {
                        zznlVar.zzu.zzj().zzR(strZzm);
                        zzicVar.zzd().zze.zzb(strZzm);
                    }
                    zznlVar.zzV();
                    zznl zznlVar2 = this.zzc;
                    gn9Var = this.zzb;
                    zzppVarZzk = zznlVar2.zzu.zzk();
                    zzppVarZzk.zzal(gn9Var, strZzm);
                }
                zzicVar.zzaV().zzb().zza("Failed to get app instance id");
            } else {
                zzicVar.zzaV().zzh().zza("Analytics storage consent denied; will not get app instance id");
                zznlVar.zzu.zzj().zzR(null);
                zzicVar.zzd().zze.zzb(null);
            }
            zzppVarZzk = zzicVar.zzk();
            gn9Var = this.zzb;
            zzppVarZzk.zzal(gn9Var, strZzm);
        } catch (Throwable th) {
            zznl zznlVar3 = this.zzc;
            zznlVar3.zzu.zzk().zzal(this.zzb, null);
            throw th;
        }
    }
}
