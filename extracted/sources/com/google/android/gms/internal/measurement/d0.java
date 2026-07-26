package com.google.android.gms.internal.measurement;

import defpackage.gt9;
import defpackage.ht9;
import defpackage.ip9;
import defpackage.js9;
import defpackage.oq9;
import defpackage.ps9;
import defpackage.tr9;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class d0 extends q0 {
    private static final d0 zzh;
    private int zzb;
    private ps9 zzd = gt9.e;
    private String zze = "";
    private String zzf = "";
    private int zzg;

    static {
        d0 d0Var = new d0();
        zzh = d0Var;
        q0.m(d0.class, d0Var);
    }

    public static oq9 w() {
        return (oq9) zzh.h();
    }

    public static oq9 x(d0 d0Var) {
        js9 js9VarH = zzh.h();
        js9VarH.f(d0Var);
        return (oq9) js9VarH;
    }

    public final /* synthetic */ void A(ArrayList arrayList) {
        E();
        o0.c(arrayList, this.zzd);
    }

    public final void B() {
        this.zzd = gt9.e;
    }

    public final /* synthetic */ void C(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void D(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzf = str;
    }

    public final void E() {
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
            return new ht9(zzh, "\u0004\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001\t᠌\u0002", new Object[]{"zzb", "zzd", e0.class, "zze", "zzf", "zzg", ip9.j});
        }
        if (i2 == 3) {
            return new d0();
        }
        if (i2 == 4) {
            return new oq9(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        throw null;
    }

    public final List p() {
        return this.zzd;
    }

    public final int q() {
        return this.zzd.size();
    }

    public final e0 r(int i) {
        return (e0) this.zzd.get(i);
    }

    public final boolean s() {
        return (this.zzb & 1) != 0;
    }

    public final String t() {
        return this.zze;
    }

    public final boolean u() {
        return (this.zzb & 2) != 0;
    }

    public final String v() {
        return this.zzf;
    }

    public final /* synthetic */ void y(int i, e0 e0Var) {
        E();
        this.zzd.set(i, e0Var);
    }

    public final /* synthetic */ void z(e0 e0Var) {
        E();
        this.zzd.add(e0Var);
    }
}
