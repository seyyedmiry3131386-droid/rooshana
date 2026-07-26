package com.google.android.gms.internal.measurement;

import defpackage.cp9;
import defpackage.gt9;
import defpackage.ht9;
import defpackage.ps9;
import defpackage.tr9;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class b extends q0 {
    private static final b zzl;
    private int zzb;
    private int zzd;
    private String zze = "";
    private ps9 zzf = gt9.e;
    private boolean zzg;
    private d zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    static {
        b bVar = new b();
        zzl = bVar;
        q0.m(b.class, bVar);
    }

    public static cp9 B() {
        return (cp9) zzl.h();
    }

    public final boolean A() {
        return this.zzk;
    }

    public final /* synthetic */ void C(String str) {
        this.zzb |= 2;
        this.zze = str;
    }

    public final void D(int i, c cVar) {
        ps9 ps9Var = this.zzf;
        if (!((tr9) ps9Var).a) {
            int size = ps9Var.size();
            this.zzf = ps9Var.Y0(size + size);
        }
        this.zzf.set(i, cVar);
    }

    @Override // com.google.android.gms.internal.measurement.q0
    public final Object o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new ht9(zzl, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zzb", "zzd", "zze", "zzf", c.class, "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new b();
        }
        if (i2 == 4) {
            return new cp9(zzl);
        }
        if (i2 == 5) {
            return zzl;
        }
        throw null;
    }

    public final boolean p() {
        return (this.zzb & 1) != 0;
    }

    public final int q() {
        return this.zzd;
    }

    public final String r() {
        return this.zze;
    }

    public final List s() {
        return this.zzf;
    }

    public final int t() {
        return this.zzf.size();
    }

    public final c u(int i) {
        return (c) this.zzf.get(i);
    }

    public final boolean v() {
        return (this.zzb & 8) != 0;
    }

    public final d w() {
        d dVar = this.zzh;
        return dVar == null ? d.y() : dVar;
    }

    public final boolean x() {
        return this.zzi;
    }

    public final boolean y() {
        return this.zzj;
    }

    public final boolean z() {
        return (this.zzb & 64) != 0;
    }
}
