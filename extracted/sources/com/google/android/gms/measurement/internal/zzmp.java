package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import defpackage.gn9;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class zzmp implements Runnable {
    final /* synthetic */ zzbg zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ gn9 zzc;
    final /* synthetic */ zznl zzd;

    public zzmp(zznl zznlVar, zzbg zzbgVar, String str, gn9 gn9Var) {
        this.zza = zzbgVar;
        this.zzb = str;
        this.zzc = gn9Var;
        Objects.requireNonNull(zznlVar);
        this.zzd = zznlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gn9 gn9Var;
        zzpp zzppVarZzk;
        zznl zznlVar;
        zzgb zzgbVarZzZ;
        byte[] bArrZzk = null;
        try {
            try {
                zznlVar = this.zzd;
                zzgbVarZzZ = zznlVar.zzZ();
            } catch (RemoteException e) {
                this.zzd.zzu.zzaV().zzb().zzb("Failed to send event to the service to bundle", e);
            }
            if (zzgbVarZzZ == null) {
                zzic zzicVar = zznlVar.zzu;
                zzicVar.zzaV().zzb().zza("Discarding data. Failed to send event to service to bundle");
                zzppVarZzk = zzicVar.zzk();
                gn9Var = this.zzc;
                zzppVarZzk.zzao(gn9Var, bArrZzk);
            }
            bArrZzk = zzgbVarZzZ.zzk(this.zza, this.zzb);
            zznlVar.zzV();
            zznl zznlVar2 = this.zzd;
            gn9Var = this.zzc;
            zzppVarZzk = zznlVar2.zzu.zzk();
            zzppVarZzk.zzao(gn9Var, bArrZzk);
        } catch (Throwable th) {
            zznl zznlVar3 = this.zzd;
            zznlVar3.zzu.zzk().zzao(this.zzc, null);
            throw th;
        }
    }
}
