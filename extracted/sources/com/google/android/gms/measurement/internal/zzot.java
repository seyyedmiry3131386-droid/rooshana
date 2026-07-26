package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.i0;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zzot {
    private final String zza;
    private final Map zzb;
    private final zzls zzc;
    private final i0 zzd;

    public zzot(String str, Map map, zzls zzlsVar, i0 i0Var) {
        this.zza = str;
        this.zzb = map;
        this.zzc = zzlsVar;
        this.zzd = i0Var;
    }

    public final String zza() {
        return this.zza;
    }

    public final Map zzb() {
        Map map = this.zzb;
        return map == null ? Collections.EMPTY_MAP : map;
    }

    public final zzls zzc() {
        return this.zzc;
    }

    public final i0 zzd() {
        return this.zzd;
    }
}
