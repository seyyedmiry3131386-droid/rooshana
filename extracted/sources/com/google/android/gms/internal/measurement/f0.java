package com.google.android.gms.internal.measurement;

import defpackage.gt9;
import defpackage.ht9;
import defpackage.ip9;
import defpackage.ps9;
import defpackage.qq9;
import defpackage.tr9;

/* JADX INFO: loaded from: classes.dex */
public final class f0 extends q0 {
    private static final f0 zzf;
    private int zzb;
    private int zzd = 1;
    private ps9 zze = gt9.e;

    static {
        f0 f0Var = new f0();
        zzf = f0Var;
        q0.m(f0.class, f0Var);
    }

    public static qq9 p() {
        return (qq9) zzf.h();
    }

    @Override // com.google.android.gms.internal.measurement.q0
    public final Object o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new ht9(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b", new Object[]{"zzb", "zzd", ip9.k, "zze", a0.class});
        }
        if (i2 == 3) {
            return new f0();
        }
        if (i2 == 4) {
            return new qq9(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        throw null;
    }

    public final void q(a0 a0Var) {
        ps9 ps9Var = this.zze;
        if (!((tr9) ps9Var).a) {
            int size = ps9Var.size();
            this.zze = ps9Var.Y0(size + size);
        }
        this.zze.add(a0Var);
    }
}
