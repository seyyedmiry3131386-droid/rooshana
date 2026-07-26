package com.google.android.gms.internal.measurement;

import defpackage.gt9;
import defpackage.ht9;
import defpackage.ps9;
import defpackage.tr9;
import defpackage.wp9;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class m extends q0 {
    private static final m zzu;
    private int zzb;
    private long zzd;
    private String zze = "";
    private int zzf;
    private ps9 zzg;
    private ps9 zzh;
    private ps9 zzi;
    private String zzj;
    private boolean zzk;
    private ps9 zzl;
    private ps9 zzm;
    private String zzn;
    private String zzo;
    private j zzp;
    private o zzq;
    private r zzr;
    private p zzs;
    private n zzt;

    static {
        m mVar = new m();
        zzu = mVar;
        q0.m(m.class, mVar);
    }

    public m() {
        gt9 gt9Var = gt9.e;
        this.zzg = gt9Var;
        this.zzh = gt9Var;
        this.zzi = gt9Var;
        this.zzj = "";
        this.zzl = gt9Var;
        this.zzm = gt9Var;
        this.zzn = "";
        this.zzo = "";
    }

    public static wp9 F() {
        return (wp9) zzu.h();
    }

    public static m G() {
        return zzu;
    }

    public final String A() {
        return this.zzn;
    }

    public final boolean B() {
        return (this.zzb & 128) != 0;
    }

    public final j C() {
        j jVar = this.zzp;
        return jVar == null ? j.v() : jVar;
    }

    public final boolean D() {
        return (this.zzb & 512) != 0;
    }

    public final r E() {
        r rVar = this.zzr;
        return rVar == null ? r.r() : rVar;
    }

    public final void H(int i, l lVar) {
        ps9 ps9Var = this.zzh;
        if (!((tr9) ps9Var).a) {
            int size = ps9Var.size();
            this.zzh = ps9Var.Y0(size + size);
        }
        this.zzh.set(i, lVar);
    }

    public final void I() {
        this.zzi = gt9.e;
    }

    public final void J() {
        this.zzl = gt9.e;
    }

    @Override // com.google.android.gms.internal.measurement.q0
    public final Object o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new ht9(zzu, "\u0004\u0011\u0000\u0001\u0001\u0013\u0011\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\u000eဈ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011ဉ\t\u0012ဉ\n\u0013ဉ\u000b", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", q.class, "zzh", l.class, "zzi", a.class, "zzj", "zzk", "zzl", m0.class, "zzm", k.class, "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt"});
        }
        if (i2 == 3) {
            return new m();
        }
        if (i2 == 4) {
            return new wp9(zzu);
        }
        if (i2 == 5) {
            return zzu;
        }
        throw null;
    }

    public final boolean p() {
        return (this.zzb & 1) != 0;
    }

    public final long q() {
        return this.zzd;
    }

    public final boolean r() {
        return (this.zzb & 2) != 0;
    }

    public final String s() {
        return this.zze;
    }

    public final ps9 t() {
        return this.zzg;
    }

    public final int u() {
        return this.zzh.size();
    }

    public final l v(int i) {
        return (l) this.zzh.get(i);
    }

    public final ps9 w() {
        return this.zzi;
    }

    public final ps9 x() {
        return this.zzl;
    }

    public final int y() {
        return this.zzl.size();
    }

    public final List z() {
        return this.zzm;
    }
}
