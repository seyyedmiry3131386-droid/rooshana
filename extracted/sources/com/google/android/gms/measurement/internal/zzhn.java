package com.google.android.gms.measurement.internal;

import defpackage.jw9;
import j$.util.Objects;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class zzhn implements jw9 {
    final /* synthetic */ zzht zza;

    public zzhn(zzht zzhtVar) {
        Objects.requireNonNull(zzhtVar);
        this.zza = zzhtVar;
    }

    @Override // defpackage.jw9
    public final void zza(int i, String str, List list, boolean z, boolean z2) {
        int i2 = i - 1;
        zzgs zzgsVarZzi = i2 != 0 ? i2 != 1 ? i2 != 3 ? i2 != 4 ? this.zza.zzu.zzaV().zzi() : z ? this.zza.zzu.zzaV().zzf() : !z2 ? this.zza.zzu.zzaV().zzh() : this.zza.zzu.zzaV().zze() : this.zza.zzu.zzaV().zzk() : z ? this.zza.zzu.zzaV().zzc() : !z2 ? this.zza.zzu.zzaV().zzd() : this.zza.zzu.zzaV().zzb() : this.zza.zzu.zzaV().zzj();
        int size = list.size();
        if (size == 1) {
            zzgsVarZzi.zzb(str, list.get(0));
            return;
        }
        if (size == 2) {
            zzgsVarZzi.zzc(str, list.get(0), list.get(1));
        } else if (size != 3) {
            zzgsVarZzi.zza(str);
        } else {
            zzgsVarZzi.zzd(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
