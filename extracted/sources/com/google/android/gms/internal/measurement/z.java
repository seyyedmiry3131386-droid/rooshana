package com.google.android.gms.internal.measurement;

import defpackage.gt9;
import defpackage.ht9;
import defpackage.lq9;
import defpackage.ps9;
import defpackage.tr9;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class z extends q0 {
    private static final z zzj;
    private int zzb;
    private ps9 zzd = gt9.e;
    private String zze = "";
    private long zzf;
    private long zzg;
    private int zzh;
    private long zzi;

    static {
        z zVar = new z();
        zzj = zVar;
        q0.m(z.class, zVar);
    }

    public static lq9 z() {
        return (lq9) zzj.h();
    }

    public final /* synthetic */ void A(int i, b0 b0Var) {
        J();
        this.zzd.set(i, b0Var);
    }

    public final /* synthetic */ void B(b0 b0Var) {
        b0Var.getClass();
        J();
        this.zzd.add(b0Var);
    }

    public final /* synthetic */ void C(Iterable iterable) {
        J();
        o0.c(iterable, this.zzd);
    }

    public final void D() {
        this.zzd = gt9.e;
    }

    public final /* synthetic */ void E(int i) {
        J();
        this.zzd.remove(i);
    }

    public final /* synthetic */ void F(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void G(long j) {
        this.zzb |= 2;
        this.zzf = j;
    }

    public final /* synthetic */ void H(long j) {
        this.zzb |= 4;
        this.zzg = j;
    }

    public final /* synthetic */ void I(long j) {
        this.zzb |= 16;
        this.zzi = j;
    }

    public final void J() {
        ps9 ps9Var = this.zzd;
        if (((tr9) ps9Var).a) {
            return;
        }
        int size = ps9Var.size();
        this.zzd = ps9Var.Y0(size + size);
    }

    @Override // com.google.android.gms.internal.measurement.q0
    public final Object o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new ht9(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003\u0006ဂ\u0004", new Object[]{"zzb", "zzd", b0.class, "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new z();
        }
        if (i2 == 4) {
            return new lq9(zzj);
        }
        if (i2 == 5) {
            return zzj;
        }
        throw null;
    }

    public final List p() {
        return this.zzd;
    }

    public final int q() {
        return this.zzd.size();
    }

    public final b0 r(int i) {
        return (b0) this.zzd.get(i);
    }

    public final String s() {
        return this.zze;
    }

    public final boolean t() {
        return (this.zzb & 2) != 0;
    }

    public final long u() {
        return this.zzf;
    }

    public final boolean v() {
        return (this.zzb & 4) != 0;
    }

    public final long w() {
        return this.zzg;
    }

    public final boolean x() {
        return (this.zzb & 8) != 0;
    }

    public final int y() {
        return this.zzh;
    }
}
