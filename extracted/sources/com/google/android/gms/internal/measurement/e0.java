package com.google.android.gms.internal.measurement;

import android.os.Build;
import defpackage.gt9;
import defpackage.ht9;
import defpackage.ip9;
import defpackage.js9;
import defpackage.ks9;
import defpackage.ns9;
import defpackage.pq9;
import defpackage.ps9;
import defpackage.tr9;
import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class e0 extends q0 {
    private static final e0 zzat;
    private int zzA;
    private String zzB;
    private String zzC;
    private boolean zzD;
    private ps9 zzE;
    private String zzF;
    private int zzG;
    private int zzH;
    private int zzI;
    private String zzJ;
    private long zzK;
    private long zzL;
    private String zzM;
    private String zzN;
    private int zzO;
    private String zzP;
    private f0 zzQ;
    private ns9 zzR;
    private long zzS;
    private long zzT;
    private String zzU;
    private String zzV;
    private int zzW;
    private boolean zzX;
    private String zzY;
    private boolean zzZ;
    private c0 zzaa;
    private String zzab;
    private ps9 zzac;
    private String zzad;
    private long zzae;
    private boolean zzaf;
    private String zzag;
    private boolean zzah;
    private String zzai;
    private int zzaj;
    private String zzak;
    private u zzal;
    private int zzam;
    private s zzan;
    private String zzao;
    private i0 zzap;
    private long zzaq;
    private String zzar;
    private x zzas;
    private int zzb;
    private int zzd;
    private int zze;
    private ps9 zzf;
    private ps9 zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private String zzm;
    private String zzn;
    private String zzo;
    private String zzp;
    private int zzq;
    private String zzr;
    private String zzs;
    private String zzt;
    private long zzu;
    private long zzv;
    private String zzw;
    private boolean zzx;
    private String zzy;
    private long zzz;

    static {
        e0 e0Var = new e0();
        zzat = e0Var;
        q0.m(e0.class, e0Var);
    }

    public e0() {
        gt9 gt9Var = gt9.e;
        this.zzf = gt9Var;
        this.zzg = gt9Var;
        this.zzm = "";
        this.zzn = "";
        this.zzo = "";
        this.zzp = "";
        this.zzr = "";
        this.zzs = "";
        this.zzt = "";
        this.zzw = "";
        this.zzy = "";
        this.zzB = "";
        this.zzC = "";
        this.zzE = gt9Var;
        this.zzF = "";
        this.zzJ = "";
        this.zzM = "";
        this.zzN = "";
        this.zzP = "";
        this.zzR = ks9.e;
        this.zzU = "";
        this.zzV = "";
        this.zzY = "";
        this.zzab = "";
        this.zzac = gt9Var;
        this.zzad = "";
        this.zzag = "";
        this.zzai = "";
        this.zzak = "";
        this.zzao = "";
        this.zzar = "";
    }

    public static pq9 U() {
        return (pq9) zzat.h();
    }

    public static pq9 V(e0 e0Var) {
        js9 js9VarH = zzat.h();
        js9VarH.f(e0Var);
        return (pq9) js9VarH;
    }

    public final long A() {
        return this.zzz;
    }

    public final boolean A0() {
        return this.zzaf;
    }

    public final /* synthetic */ void A1(String str) {
        str.getClass();
        this.zzb |= 65536;
        this.zzw = str;
    }

    public final boolean B() {
        return (this.zzb & 1048576) != 0;
    }

    public final boolean B0() {
        return (this.zzd & 131072) != 0;
    }

    public final /* synthetic */ void B1() {
        this.zzb &= -65537;
        this.zzw = zzat.zzw;
    }

    public final int C() {
        return this.zzA;
    }

    public final String C0() {
        return this.zzag;
    }

    public final /* synthetic */ void C1(boolean z) {
        this.zzb |= 131072;
        this.zzx = z;
    }

    public final String D() {
        return this.zzB;
    }

    public final boolean D0() {
        return (this.zzd & 262144) != 0;
    }

    public final /* synthetic */ void D1() {
        this.zzb &= -131073;
        this.zzx = false;
    }

    public final String E() {
        return this.zzC;
    }

    public final boolean E0() {
        return this.zzah;
    }

    public final /* synthetic */ void E1(String str) {
        str.getClass();
        this.zzb |= 262144;
        this.zzy = str;
    }

    public final boolean F() {
        return (this.zzb & 8388608) != 0;
    }

    public final boolean F0() {
        return (this.zzd & 524288) != 0;
    }

    public final /* synthetic */ void F1() {
        this.zzb &= -262145;
        this.zzy = zzat.zzy;
    }

    public final boolean G() {
        return this.zzD;
    }

    public final String G0() {
        return this.zzai;
    }

    public final /* synthetic */ void G1(long j) {
        this.zzb |= 524288;
        this.zzz = j;
    }

    public final ps9 H() {
        return this.zzE;
    }

    public final int H0() {
        return this.zzaj;
    }

    public final /* synthetic */ void H1(int i) {
        this.zzb |= 1048576;
        this.zzA = i;
    }

    public final String I() {
        return this.zzF;
    }

    public final boolean I0() {
        return (this.zzd & 4194304) != 0;
    }

    public final /* synthetic */ void I1(String str) {
        this.zzb |= 2097152;
        this.zzB = str;
    }

    public final boolean J() {
        return (this.zzb & 33554432) != 0;
    }

    public final u J0() {
        u uVar = this.zzal;
        return uVar == null ? u.x() : uVar;
    }

    public final /* synthetic */ void J1() {
        this.zzb &= -2097153;
        this.zzB = zzat.zzB;
    }

    public final int K() {
        return this.zzG;
    }

    public final boolean K0() {
        return (this.zzd & 8388608) != 0;
    }

    public final /* synthetic */ void K1(String str) {
        str.getClass();
        this.zzb |= 4194304;
        this.zzC = str;
    }

    public final boolean L() {
        return (this.zzb & 536870912) != 0;
    }

    public final int L0() {
        return this.zzam;
    }

    public final /* synthetic */ void L1(boolean z) {
        this.zzb |= 8388608;
        this.zzD = z;
    }

    public final long M() {
        return this.zzK;
    }

    public final boolean M0() {
        return (this.zzd & 16777216) != 0;
    }

    public final void M1(Iterable iterable) {
        ps9 ps9Var = this.zzE;
        if (!((tr9) ps9Var).a) {
            int size = ps9Var.size();
            this.zzE = ps9Var.Y0(size + size);
        }
        o0.c(iterable, this.zzE);
    }

    public final boolean N() {
        return (this.zzb & Integer.MIN_VALUE) != 0;
    }

    public final s N0() {
        s sVar = this.zzan;
        return sVar == null ? s.P() : sVar;
    }

    public final void N1() {
        this.zzE = gt9.e;
    }

    public final String O() {
        return this.zzM;
    }

    public final boolean O0() {
        return (this.zzd & 67108864) != 0;
    }

    public final /* synthetic */ void O1(String str) {
        this.zzb |= 16777216;
        this.zzF = str;
    }

    public final boolean P() {
        return (this.zzb & 1) != 0;
    }

    public final i0 P0() {
        i0 i0Var = this.zzap;
        return i0Var == null ? i0.r() : i0Var;
    }

    public final /* synthetic */ void P1(int i) {
        this.zzb |= 33554432;
        this.zzG = i;
    }

    public final boolean Q() {
        return (this.zzd & 134217728) != 0;
    }

    public final int Q0() {
        return this.zze;
    }

    public final /* synthetic */ void Q1() {
        this.zzb &= -268435457;
        this.zzJ = zzat.zzJ;
    }

    public final long R() {
        return this.zzaq;
    }

    public final /* synthetic */ void R0(long j) {
        this.zzb |= 536870912;
        this.zzK = j;
    }

    public final List R1() {
        return this.zzf;
    }

    public final boolean S() {
        return (this.zzd & 536870912) != 0;
    }

    public final /* synthetic */ void S0(String str) {
        str.getClass();
        this.zzb |= Integer.MIN_VALUE;
        this.zzM = str;
    }

    public final void S1() {
        ps9 ps9Var = this.zzf;
        if (((tr9) ps9Var).a) {
            return;
        }
        int size = ps9Var.size();
        this.zzf = ps9Var.Y0(size + size);
    }

    public final x T() {
        x xVar = this.zzas;
        return xVar == null ? x.r() : xVar;
    }

    public final /* synthetic */ void T0() {
        this.zzb &= Integer.MAX_VALUE;
        this.zzM = zzat.zzM;
    }

    public final void T1() {
        ps9 ps9Var = this.zzg;
        if (((tr9) ps9Var).a) {
            return;
        }
        int size = ps9Var.size();
        this.zzg = ps9Var.Y0(size + size);
    }

    public final /* synthetic */ void U0(int i) {
        this.zzd |= 2;
        this.zzO = i;
    }

    public final int U1() {
        return this.zzf.size();
    }

    public final /* synthetic */ void V0(f0 f0Var) {
        this.zzQ = f0Var;
        this.zzd |= 8;
    }

    public final z V1(int i) {
        return (z) this.zzf.get(i);
    }

    public final /* synthetic */ void W() {
        this.zzb |= 1;
        this.zze = 1;
    }

    public final void W0(ArrayList arrayList) {
        RandomAccess randomAccess = this.zzR;
        if (!((tr9) randomAccess).a) {
            ks9 ks9Var = (ks9) randomAccess;
            int i = ks9Var.c;
            this.zzR = ks9Var.Y0(i + i);
        }
        o0.c(arrayList, this.zzR);
    }

    public final ps9 W1() {
        return this.zzg;
    }

    public final /* synthetic */ void X(int i, z zVar) {
        S1();
        this.zzf.set(i, zVar);
    }

    public final /* synthetic */ void X0(long j) {
        this.zzd |= 16;
        this.zzS = j;
    }

    public final int X1() {
        return this.zzg.size();
    }

    public final /* synthetic */ void Y(z zVar) {
        S1();
        this.zzf.add(zVar);
    }

    public final /* synthetic */ void Y0(long j) {
        this.zzd |= 32;
        this.zzT = j;
    }

    public final j0 Y1(int i) {
        return (j0) this.zzg.get(i);
    }

    public final /* synthetic */ void Z(Iterable iterable) {
        S1();
        o0.c(iterable, this.zzf);
    }

    public final /* synthetic */ void Z0(String str) {
        this.zzd |= 128;
        this.zzV = str;
    }

    public final boolean Z1() {
        return (this.zzb & 2) != 0;
    }

    public final void a0() {
        this.zzf = gt9.e;
    }

    public final /* synthetic */ void a1(String str) {
        str.getClass();
        this.zzd |= 8192;
        this.zzab = str;
    }

    public final long a2() {
        return this.zzh;
    }

    public final /* synthetic */ void b0(int i) {
        S1();
        this.zzf.remove(i);
    }

    public final /* synthetic */ void b1() {
        this.zzd &= -8193;
        this.zzab = zzat.zzab;
    }

    public final boolean b2() {
        return (this.zzb & 4) != 0;
    }

    public final /* synthetic */ void c0(int i, j0 j0Var) {
        T1();
        this.zzg.set(i, j0Var);
    }

    public final void c1(Set set) {
        ps9 ps9Var = this.zzac;
        if (!((tr9) ps9Var).a) {
            int size = ps9Var.size();
            this.zzac = ps9Var.Y0(size + size);
        }
        o0.c(set, this.zzac);
    }

    public final long c2() {
        return this.zzi;
    }

    public final /* synthetic */ void d0(j0 j0Var) {
        T1();
        this.zzg.add(j0Var);
    }

    public final /* synthetic */ void d1(String str) {
        str.getClass();
        this.zzd |= 16384;
        this.zzad = str;
    }

    public final boolean d2() {
        return (this.zzb & 8) != 0;
    }

    public final /* synthetic */ void e0(List list) {
        T1();
        o0.c(list, this.zzg);
    }

    public final /* synthetic */ void e1(long j) {
        this.zzd |= 32768;
        this.zzae = j;
    }

    public final long e2() {
        return this.zzj;
    }

    public final /* synthetic */ void f0(int i) {
        T1();
        this.zzg.remove(i);
    }

    public final /* synthetic */ void f1(boolean z) {
        this.zzd |= 65536;
        this.zzaf = z;
    }

    public final boolean f2() {
        return (this.zzb & 16) != 0;
    }

    public final /* synthetic */ void g0(long j) {
        this.zzb |= 2;
        this.zzh = j;
    }

    public final /* synthetic */ void g1(String str) {
        this.zzd |= 131072;
        this.zzag = str;
    }

    public final long g2() {
        return this.zzk;
    }

    public final /* synthetic */ void h0() {
        this.zzb &= -3;
        this.zzh = 0L;
    }

    public final /* synthetic */ void h1(boolean z) {
        this.zzd |= 262144;
        this.zzah = z;
    }

    public final boolean h2() {
        return (this.zzb & 32) != 0;
    }

    public final /* synthetic */ void i0(long j) {
        this.zzb |= 4;
        this.zzi = j;
    }

    public final /* synthetic */ void i1(String str) {
        str.getClass();
        this.zzd |= 524288;
        this.zzai = str;
    }

    public final long i2() {
        return this.zzl;
    }

    public final /* synthetic */ void j0(long j) {
        this.zzb |= 8;
        this.zzj = j;
    }

    public final /* synthetic */ void j1(int i) {
        this.zzd |= 1048576;
        this.zzaj = i;
    }

    public final String j2() {
        return this.zzm;
    }

    public final /* synthetic */ void k0(long j) {
        this.zzb |= 16;
        this.zzk = j;
    }

    public final /* synthetic */ void k1(u uVar) {
        this.zzal = uVar;
        this.zzd |= 4194304;
    }

    public final String k2() {
        return this.zzn;
    }

    public final /* synthetic */ void l0() {
        this.zzb &= -17;
        this.zzk = 0L;
    }

    public final /* synthetic */ void l1(int i) {
        this.zzd |= 8388608;
        this.zzam = i;
    }

    public final String l2() {
        return this.zzo;
    }

    public final /* synthetic */ void m0(long j) {
        this.zzb |= 32;
        this.zzl = j;
    }

    public final /* synthetic */ void m1(s sVar) {
        this.zzan = sVar;
        this.zzd |= 16777216;
    }

    public final String m2() {
        return this.zzp;
    }

    public final /* synthetic */ void n0() {
        this.zzb &= -33;
        this.zzl = 0L;
    }

    public final /* synthetic */ void n1(i0 i0Var) {
        this.zzap = i0Var;
        this.zzd |= 67108864;
    }

    public final boolean n2() {
        return (this.zzb & 1024) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.q0
    public final Object o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new ht9(zzat, "\u0004C\u0000\u0002\u0001VC\u0000\u0005\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'5᠌(7ဇ)9ဈ*:ဇ+;ဉ,?ဈ-@\u001aAဈ.Cဂ/Dဇ0Gဈ1Hဇ2Iဈ3Jင4Kဈ5Lဉ6Mင7Oဉ8Pဈ9Qဉ:Rဂ;Sဈ<Vဉ=", new Object[]{"zzb", "zzd", "zze", "zzf", z.class, "zzg", j0.class, "zzh", "zzi", "zzj", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzk", "zzD", "zzE", v.class, "zzF", "zzG", "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzU", "zzV", "zzW", ip9.g, "zzX", "zzY", "zzZ", "zzaa", "zzab", "zzac", "zzad", "zzae", "zzaf", "zzag", "zzah", "zzai", "zzaj", "zzak", "zzal", "zzam", "zzan", "zzao", "zzap", "zzaq", "zzar", "zzas"});
        }
        if (i2 == 3) {
            return new e0();
        }
        if (i2 == 4) {
            return new pq9(zzat);
        }
        if (i2 == 5) {
            return zzat;
        }
        throw null;
    }

    public final /* synthetic */ void o0() {
        this.zzb |= 64;
        this.zzm = "android";
    }

    public final /* synthetic */ void o1(long j) {
        this.zzd |= 134217728;
        this.zzaq = j;
    }

    public final int o2() {
        return this.zzq;
    }

    public final String p() {
        return this.zzs;
    }

    public final /* synthetic */ void p0(String str) {
        str.getClass();
        this.zzb |= 128;
        this.zzn = str;
    }

    public final /* synthetic */ void p1() {
        this.zzd |= 268435456;
        this.zzar = "";
    }

    public final String p2() {
        return this.zzr;
    }

    public final String q() {
        return this.zzt;
    }

    public final boolean q0() {
        return (this.zzd & 2) != 0;
    }

    public final /* synthetic */ void q1(x xVar) {
        this.zzas = xVar;
        this.zzd |= 536870912;
    }

    public final boolean r() {
        return (this.zzb & 16384) != 0;
    }

    public final int r0() {
        return this.zzO;
    }

    public final /* synthetic */ void r1() {
        String str = Build.MODEL;
        str.getClass();
        this.zzb |= 256;
        this.zzo = str;
    }

    public final long s() {
        return this.zzu;
    }

    public final boolean s0() {
        return (this.zzd & 16) != 0;
    }

    public final /* synthetic */ void s1() {
        this.zzb &= -257;
        this.zzo = zzat.zzo;
    }

    public final boolean t() {
        return (this.zzb & 32768) != 0;
    }

    public final long t0() {
        return this.zzS;
    }

    public final /* synthetic */ void t1(String str) {
        str.getClass();
        this.zzb |= 512;
        this.zzp = str;
    }

    public final long u() {
        return this.zzv;
    }

    public final boolean u0() {
        return (this.zzd & 128) != 0;
    }

    public final /* synthetic */ void u1(int i) {
        this.zzb |= 1024;
        this.zzq = i;
    }

    public final String v() {
        return this.zzw;
    }

    public final String v0() {
        return this.zzV;
    }

    public final /* synthetic */ void v1(String str) {
        str.getClass();
        this.zzb |= 2048;
        this.zzr = str;
    }

    public final boolean w() {
        return (this.zzb & 131072) != 0;
    }

    public final boolean w0() {
        return (this.zzd & 8192) != 0;
    }

    public final /* synthetic */ void w1(String str) {
        str.getClass();
        this.zzb |= 4096;
        this.zzs = str;
    }

    public final boolean x() {
        return this.zzx;
    }

    public final String x0() {
        return this.zzab;
    }

    public final /* synthetic */ void x1(String str) {
        str.getClass();
        this.zzb |= 8192;
        this.zzt = str;
    }

    public final String y() {
        return this.zzy;
    }

    public final boolean y0() {
        return (this.zzd & 32768) != 0;
    }

    public final /* synthetic */ void y1(long j) {
        this.zzb |= 16384;
        this.zzu = j;
    }

    public final boolean z() {
        return (this.zzb & 524288) != 0;
    }

    public final long z0() {
        return this.zzae;
    }

    public final /* synthetic */ void z1() {
        this.zzb |= 32768;
        this.zzv = 133005L;
    }
}
