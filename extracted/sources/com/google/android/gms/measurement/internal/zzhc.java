package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import defpackage.rq4;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class zzhc {
    final /* synthetic */ zzhh zza;
    private final String zzb;
    private final boolean zzc;
    private boolean zzd;
    private boolean zze;

    public zzhc(zzhh zzhhVar, String str, boolean z) {
        Objects.requireNonNull(zzhhVar);
        this.zza = zzhhVar;
        rq4.k(str);
        this.zzb = str;
        this.zzc = z;
    }

    public final boolean zza() {
        if (!this.zzd) {
            this.zzd = true;
            zzhh zzhhVar = this.zza;
            this.zze = zzhhVar.zzd().getBoolean(this.zzb, this.zzc);
        }
        return this.zze;
    }

    public final void zzb(boolean z) {
        SharedPreferences.Editor editorEdit = this.zza.zzd().edit();
        editorEdit.putBoolean(this.zzb, z);
        editorEdit.apply();
        this.zze = z;
    }
}
