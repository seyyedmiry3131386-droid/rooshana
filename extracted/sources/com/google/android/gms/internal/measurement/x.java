package com.google.android.gms.internal.measurement;

import defpackage.gt9;
import defpackage.ht9;
import defpackage.iq9;
import defpackage.ps9;
import defpackage.tr9;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class x extends q0 {
    private static final x zzd;
    private ps9 zzb = gt9.e;

    static {
        x xVar = new x();
        zzd = xVar;
        q0.m(x.class, xVar);
    }

    public static iq9 q() {
        return (iq9) zzd.h();
    }

    public static x r() {
        return zzd;
    }

    @Override // com.google.android.gms.internal.measurement.q0
    public final Object o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new ht9(zzd, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", w.class});
        }
        if (i2 == 3) {
            return new x();
        }
        if (i2 == 4) {
            return new iq9(zzd);
        }
        if (i2 == 5) {
            return zzd;
        }
        throw null;
    }

    public final List p() {
        return this.zzb;
    }

    public final void s(ArrayList arrayList) {
        ps9 ps9Var = this.zzb;
        if (!((tr9) ps9Var).a) {
            int size = ps9Var.size();
            this.zzb = ps9Var.Y0(size + size);
        }
        o0.c(arrayList, this.zzb);
    }
}
