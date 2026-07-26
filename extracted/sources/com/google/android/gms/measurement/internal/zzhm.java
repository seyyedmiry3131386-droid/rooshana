package com.google.android.gms.measurement.internal;

import defpackage.lg4;
import defpackage.rq4;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class zzhm extends lg4 {
    final /* synthetic */ zzht zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzhm(zzht zzhtVar, int i) {
        super(20);
        Objects.requireNonNull(zzhtVar);
        this.zza = zzhtVar;
    }

    @Override // defpackage.lg4
    public final /* bridge */ /* synthetic */ Object create(Object obj) {
        String str = (String) obj;
        rq4.k(str);
        return this.zza.zzC(str);
    }
}
