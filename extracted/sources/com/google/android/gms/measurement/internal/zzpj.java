package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.d0;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zzpj {
    private final long zza;
    private final d0 zzb;
    private final String zzc;
    private final Map zzd;
    private final zzls zze;
    private final long zzf;
    private final long zzg;
    private final long zzh;
    private final int zzi;

    public /* synthetic */ zzpj(long j, d0 d0Var, String str, Map map, zzls zzlsVar, long j2, long j3, long j4, int i, byte[] bArr) {
        this.zza = j;
        this.zzb = d0Var;
        this.zzc = str;
        this.zzd = map;
        this.zze = zzlsVar;
        this.zzf = j2;
        this.zzg = j3;
        this.zzh = j4;
        this.zzi = i;
    }

    public final zzot zza() {
        return new zzot(this.zzc, this.zzd, this.zze, null);
    }

    public final zzom zzb() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.zzd.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        long j = this.zza;
        d0 d0Var = this.zzb;
        String str = this.zzc;
        zzls zzlsVar = this.zze;
        return new zzom(j, d0Var.a(), str, bundle, zzlsVar.zza(), this.zzg, "");
    }

    public final long zzc() {
        return this.zza;
    }

    public final d0 zzd() {
        return this.zzb;
    }

    public final String zze() {
        return this.zzc;
    }

    public final zzls zzf() {
        return this.zze;
    }

    public final long zzg() {
        return this.zzf;
    }

    public final long zzh() {
        return this.zzh;
    }

    public final int zzi() {
        return this.zzi;
    }
}
