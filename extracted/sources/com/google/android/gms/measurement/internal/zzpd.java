package com.google.android.gms.measurement.internal;

import android.os.SystemClock;
import defpackage.eq;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class zzpd {
    final String zza;
    long zzb;

    public /* synthetic */ zzpd(zzpg zzpgVar, String str, byte[] bArr) {
        this(zzpgVar, str);
    }

    private zzpd(zzpg zzpgVar, String str) {
        Objects.requireNonNull(zzpgVar);
        this.zza = str;
        ((eq) zzpgVar.zzaZ()).getClass();
        this.zzb = SystemClock.elapsedRealtime();
    }

    public /* synthetic */ zzpd(zzpg zzpgVar, byte[] bArr) {
        this(zzpgVar, zzpgVar.zzt().zzaw());
    }
}
