package com.google.android.gms.internal.measurement;

import defpackage.ht9;
import defpackage.mq9;

/* JADX INFO: loaded from: classes.dex */
public final class a0 extends q0 {
    private static final a0 zzf;
    private int zzb;
    private String zzd = "";
    private long zze;

    static {
        a0 a0Var = new a0();
        zzf = a0Var;
        q0.m(a0.class, a0Var);
    }

    public static mq9 p() {
        return (mq9) zzf.h();
    }

    @Override // com.google.android.gms.internal.measurement.q0
    public final Object o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new ht9(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i2 == 3) {
            return new a0();
        }
        if (i2 == 4) {
            return new mq9(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        throw null;
    }

    public final /* synthetic */ void q(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzd = str;
    }

    public final /* synthetic */ void r(long j) {
        this.zzb |= 2;
        this.zze = j;
    }
}
