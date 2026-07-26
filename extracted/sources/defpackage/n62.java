package defpackage;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.common.ParserException;
import androidx.media3.common.b;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import com.google.common.collect.ImmutableList;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public final class n62 implements Handler.Callback, yp4, je6, f59 {
    public static final long C0 = j29.k0(10000);
    public final cz A;
    public boolean A0;
    public ll7 B;
    public float B0;
    public gh7 C;
    public boolean D;
    public boolean E;
    public m62 F;
    public ta6 G;
    public k62 H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public long M;
    public boolean N;
    public int O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public int T;
    public m62 U;
    public long V;
    public long W;
    public int X;
    public boolean Y;
    public ExoPlaybackException Z;
    public final y37[] a;
    public final v80[] b;
    public final boolean[] c;
    public final fi4 d;
    public final jp8 e;
    public final yf1 f;
    public final j50 g;
    public final wd8 h;
    public final jx9 i;
    public final Looper j;
    public final am8 k;
    public final yl8 l;
    public final long m;
    public final boolean n;
    public final ag1 o;
    public final ArrayList p;
    public final td8 q;
    public final v52 r;
    public final cq4 s;
    public final zs4 t;
    public final wf1 u;
    public final long v;
    public final ee6 w;
    public final hd1 x;
    public long x0;
    public final wd8 y;
    public o52 y0;
    public final boolean z;
    public long z0;

    public n62(Context context, v80[] v80VarArr, v80[] v80VarArr2, fi4 fi4Var, jp8 jp8Var, yf1 yf1Var, j50 j50Var, int i, boolean z, hd1 hd1Var, ll7 ll7Var, wf1 wf1Var, long j, Looper looper, td8 td8Var, v52 v52Var, ee6 ee6Var, final f59 f59Var) {
        o52 o52Var = o52.a;
        this.z0 = -9223372036854775807L;
        this.r = v52Var;
        this.d = fi4Var;
        this.e = jp8Var;
        this.f = yf1Var;
        this.g = j50Var;
        this.O = i;
        this.P = z;
        this.B = ll7Var;
        this.u = wf1Var;
        this.v = j;
        this.J = false;
        this.q = td8Var;
        this.w = ee6Var;
        this.y0 = o52Var;
        this.x = hd1Var;
        this.B0 = 1.0f;
        this.C = gh7.b;
        this.x0 = -9223372036854775807L;
        this.M = -9223372036854775807L;
        this.m = yf1Var.h;
        this.n = yf1Var.i;
        xl8 xl8Var = bm8.a;
        ta6 ta6VarK = ta6.k(jp8Var);
        this.G = ta6VarK;
        this.H = new k62(ta6VarK);
        this.b = new v80[v80VarArr.length];
        this.c = new boolean[v80VarArr.length];
        ci1 ci1Var = (ci1) fi4Var;
        ci1Var.getClass();
        this.a = new y37[v80VarArr.length];
        boolean z2 = false;
        for (int i2 = 0; i2 < v80VarArr.length; i2++) {
            v80 v80Var = v80VarArr[i2];
            v80Var.e = i2;
            v80Var.f = ee6Var;
            v80Var.g = td8Var;
            this.b[i2] = v80Var;
            v80 v80Var2 = this.b[i2];
            synchronized (v80Var2.a) {
                v80Var2.r = ci1Var;
            }
            v80 v80Var3 = v80VarArr2[i2];
            if (v80Var3 != null) {
                v80Var3.e = i2;
                v80Var3.f = ee6Var;
                v80Var3.g = td8Var;
                z2 = true;
            }
            y37[] y37VarArr = this.a;
            v80 v80Var4 = v80VarArr[i2];
            y37 y37Var = new y37();
            y37Var.e = v80Var4;
            y37Var.c = i2;
            y37Var.f = v80Var3;
            y37Var.d = 0;
            y37Var.a = false;
            y37Var.b = false;
            y37VarArr[i2] = y37Var;
        }
        this.z = z2;
        this.o = new ag1(this, td8Var);
        this.p = new ArrayList();
        this.k = new am8();
        this.l = new yl8();
        vy2.s(fi4Var.a == null);
        fi4Var.a = this;
        fi4Var.b = j50Var;
        this.Y = true;
        wd8 wd8VarA = td8Var.a(looper, null);
        this.y = wd8VarA;
        this.s = new cq4(hd1Var, wd8VarA, new v4(24, this));
        this.t = new zs4(this, hd1Var, wd8VarA, ee6Var);
        jx9 jx9Var = new jx9();
        jx9Var.b = new Object();
        jx9Var.c = null;
        jx9Var.d = null;
        jx9Var.a = 0;
        this.i = jx9Var;
        Looper looperL = jx9Var.l();
        this.j = looperL;
        wd8 wd8VarA2 = td8Var.a(looperL, this);
        this.h = wd8VarA2;
        this.A = new cz(context, looperL, this);
        wd8VarA2.a(35, new f59() { // from class: g62
            @Override // defpackage.f59
            public final void c(long j2, long j3, b bVar, MediaFormat mediaFormat) {
                n62 n62Var = this.a;
                n62Var.getClass();
                f59Var.c(j2, j3, bVar, mediaFormat);
                n62Var.c(j2, j3, bVar, mediaFormat);
            }
        }).b();
    }

    public static Pair S(bm8 bm8Var, m62 m62Var, boolean z, int i, boolean z2, am8 am8Var, yl8 yl8Var) {
        int iT;
        bm8 bm8Var2 = m62Var.a;
        if (bm8Var.p()) {
            return null;
        }
        bm8 bm8Var3 = bm8Var2.p() ? bm8Var : bm8Var2;
        try {
            Pair pairI = bm8Var3.i(am8Var, yl8Var, m62Var.b, m62Var.c);
            if (!bm8Var.equals(bm8Var3)) {
                if (bm8Var.b(pairI.first) == -1) {
                    if (!z || (iT = T(am8Var, yl8Var, i, z2, pairI.first, bm8Var3, bm8Var)) == -1) {
                        return null;
                    }
                    return bm8Var.i(am8Var, yl8Var, iT, -9223372036854775807L);
                }
                if (bm8Var3.g(pairI.first, yl8Var).f && bm8Var3.m(yl8Var.c, am8Var, 0L).n == bm8Var3.b(pairI.first)) {
                    return bm8Var.i(am8Var, yl8Var, bm8Var.g(pairI.first, yl8Var).c, m62Var.c);
                }
            }
            return pairI;
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    public static int T(am8 am8Var, yl8 yl8Var, int i, boolean z, Object obj, bm8 bm8Var, bm8 bm8Var2) {
        am8 am8Var2 = am8Var;
        bm8 bm8Var3 = bm8Var;
        Object obj2 = bm8Var3.m(bm8Var3.g(obj, yl8Var).c, am8Var, 0L).a;
        for (int i2 = 0; i2 < bm8Var2.o(); i2++) {
            if (bm8Var2.m(i2, am8Var, 0L).a.equals(obj2)) {
                return i2;
            }
        }
        int iB = bm8Var3.b(obj);
        int iH = bm8Var3.h();
        int iB2 = -1;
        int i3 = 0;
        while (i3 < iH && iB2 == -1) {
            bm8 bm8Var4 = bm8Var3;
            int iD = bm8Var4.d(iB, yl8Var, am8Var2, i, z);
            if (iD == -1) {
                break;
            }
            iB2 = bm8Var2.b(bm8Var4.l(iD));
            i3++;
            bm8Var3 = bm8Var4;
            iB = iD;
            am8Var2 = am8Var;
        }
        if (iB2 == -1) {
            return -1;
        }
        return bm8Var2.f(iB2, yl8Var, false).c;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, ko7, zp4] */
    public static boolean z(aq4 aq4Var) {
        if (aq4Var != null) {
            try {
                ?? r1 = aq4Var.a;
                if (aq4Var.e) {
                    for (pc7 pc7Var : aq4Var.c) {
                        if (pc7Var != null) {
                            pc7Var.f();
                        }
                    }
                } else {
                    r1.h();
                }
                if ((!aq4Var.e ? 0L : r1.f()) != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    public final boolean A(int i, ks4 ks4Var) {
        cq4 cq4Var = this.s;
        aq4 aq4Var = cq4Var.k;
        if (aq4Var != null && aq4Var.g.a.equals(ks4Var)) {
            y37 y37Var = this.a[i];
            aq4 aq4Var2 = cq4Var.k;
            int i2 = y37Var.d;
            boolean z = (i2 == 2 || i2 == 4) && y37Var.d(aq4Var2) == ((v80) y37Var.e);
            boolean z2 = y37Var.d == 3 && y37Var.d(aq4Var2) == ((v80) y37Var.f);
            if (z || z2) {
                return true;
            }
        }
        return false;
    }

    public final void A0(bm8 bm8Var, ks4 ks4Var, bm8 bm8Var2, ks4 ks4Var2, long j, boolean z) {
        boolean zR0 = r0(bm8Var, ks4Var);
        Object obj = ks4Var.a;
        if (!zR0) {
            ua6 ua6Var = ks4Var.b() ? ua6.d : this.G.o;
            ag1 ag1Var = this.o;
            if (ag1Var.g().equals(ua6Var)) {
                return;
            }
            this.h.d(16);
            ag1Var.d(ua6Var);
            x(this.G.o, ua6Var.a, false, false);
            return;
        }
        yl8 yl8Var = this.l;
        int i = bm8Var.g(obj, yl8Var).c;
        am8 am8Var = this.k;
        bm8Var.n(i, am8Var);
        ep4 ep4Var = am8Var.j;
        wf1 wf1Var = this.u;
        wf1Var.getClass();
        wf1Var.c = j29.V(ep4Var.a);
        wf1Var.f = j29.V(ep4Var.b);
        wf1Var.g = j29.V(ep4Var.c);
        float f = ep4Var.d;
        if (f == -3.4028235E38f) {
            f = 0.97f;
        }
        wf1Var.j = f;
        float f2 = ep4Var.e;
        if (f2 == -3.4028235E38f) {
            f2 = 1.03f;
        }
        wf1Var.i = f2;
        if (f == 1.0f && f2 == 1.0f) {
            wf1Var.c = -9223372036854775807L;
        }
        wf1Var.a();
        if (j != -9223372036854775807L) {
            wf1Var.d = m(bm8Var, obj, j);
            wf1Var.a();
            return;
        }
        if (!Objects.equals(!bm8Var2.p() ? bm8Var2.m(bm8Var2.g(ks4Var2.a, yl8Var).c, am8Var, 0L).a : null, am8Var.a) || z) {
            wf1Var.d = -9223372036854775807L;
            wf1Var.a();
        }
    }

    public final boolean B() {
        aq4 aq4Var = this.s.i;
        long j = aq4Var.g.e;
        if (aq4Var.e) {
            return j == -9223372036854775807L || this.G.s < j || !q0();
        }
        return false;
    }

    public final void B0(boolean z, boolean z2) {
        long jElapsedRealtime;
        this.L = z;
        if (!z || z2) {
            jElapsedRealtime = -9223372036854775807L;
        } else {
            this.q.getClass();
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        this.M = jElapsedRealtime;
    }

    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, zp4] */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object, ko7] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, ko7] */
    public final void C() {
        boolean zC;
        if (z(this.s.l)) {
            aq4 aq4Var = this.s.l;
            long jP = p(!aq4Var.e ? 0L : aq4Var.a.f());
            aq4 aq4Var2 = this.s.i;
            long j = r0(this.G.a, aq4Var.g.a) ? this.u.h : -9223372036854775807L;
            ee6 ee6Var = this.w;
            bm8 bm8Var = this.G.a;
            float f = this.o.g().a;
            boolean z = this.G.l;
            aa4 aa4Var = new aa4(ee6Var, jP, f, this.L, j);
            zC = this.f.c(aa4Var);
            aq4 aq4Var3 = this.s.i;
            if (!zC && aq4Var3.e && jP < 500000 && (this.m > 0 || this.n)) {
                aq4Var3.a.s(this.G.s, false);
                zC = this.f.c(aa4Var);
            }
        } else {
            zC = false;
        }
        this.N = zC;
        if (zC) {
            aq4 aq4Var4 = this.s.l;
            aq4Var4.getClass();
            ab4 ab4Var = new ab4();
            ab4Var.a = this.V - aq4Var4.p;
            float f2 = this.o.g().a;
            vy2.j(f2 > 0.0f || f2 == -3.4028235E38f);
            ab4Var.b = f2;
            long j2 = this.M;
            vy2.j(j2 >= 0 || j2 == -9223372036854775807L);
            ab4Var.c = j2;
            bb4 bb4Var = new bb4(ab4Var);
            vy2.s(aq4Var4.m == null);
            aq4Var4.a.p(bb4Var);
        }
        v0();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, ko7, zp4] */
    public final void D() {
        cq4 cq4Var = this.s;
        cq4Var.l();
        aq4 aq4Var = cq4Var.m;
        if (aq4Var != null) {
            ?? r1 = aq4Var.a;
            if ((!aq4Var.d || aq4Var.e) && !r1.a()) {
                bm8 bm8Var = this.G.a;
                if (aq4Var.e) {
                    r1.q();
                }
                Iterator it = this.f.j.values().iterator();
                while (it.hasNext()) {
                    if (((xf1) it.next()).a) {
                        return;
                    }
                }
                if (!aq4Var.d) {
                    long j = aq4Var.g.b;
                    aq4Var.d = true;
                    r1.m(this, j);
                    return;
                }
                ab4 ab4Var = new ab4();
                ab4Var.a = this.V - aq4Var.p;
                float f = this.o.g().a;
                vy2.j(f > 0.0f || f == -3.4028235E38f);
                ab4Var.b = f;
                long j2 = this.M;
                vy2.j(j2 >= 0 || j2 == -9223372036854775807L);
                ab4Var.c = j2;
                bb4 bb4Var = new bb4(ab4Var);
                vy2.s(aq4Var.m == null);
                r1.p(bb4Var);
            }
        }
    }

    public final void E() {
        k62 k62Var = this.H;
        ta6 ta6Var = this.G;
        boolean z = k62Var.b | (((ta6) k62Var.e) != ta6Var);
        k62Var.b = z;
        k62Var.e = ta6Var;
        if (z) {
            e62 e62Var = this.r.b;
            e62Var.j.c(new g7(e62Var, k62Var, 20));
            this.H = new k62(this.G);
        }
    }

    public final void F(int i) {
        y37 y37Var = this.a[i];
        try {
            aq4 aq4Var = this.s.i;
            aq4Var.getClass();
            v80 v80VarD = y37Var.d(aq4Var);
            v80VarD.getClass();
            pc7 pc7Var = v80VarD.i;
            pc7Var.getClass();
            pc7Var.f();
        } catch (IOException | RuntimeException e) {
            int i2 = ((v80) y37Var.e).b;
            if (i2 != 3 && i2 != 5) {
                throw e;
            }
            jp8 jp8Var = this.s.i.o;
            wn5.H("ExoPlayerImplInternal", "Disabling track due to error: " + b.c(((p62[]) jp8Var.d)[i].m()), e);
            jp8 jp8Var2 = new jp8((x37[]) ((x37[]) jp8Var.c).clone(), (p62[]) ((p62[]) jp8Var.d).clone(), (rp8) jp8Var.e, jp8Var.f);
            ((x37[]) jp8Var2.c)[i] = null;
            ((p62[]) jp8Var2.d)[i] = null;
            h(i);
            aq4 aq4Var2 = this.s.i;
            aq4Var2.a(jp8Var2, this.G.s, false, new boolean[aq4Var2.j.length]);
        }
    }

    public final void G(final int i, final boolean z) {
        boolean[] zArr = this.c;
        if (zArr[i] != z) {
            zArr[i] = z;
            this.y.c(new Runnable() { // from class: f62
                @Override // java.lang.Runnable
                public final void run() {
                    n62 n62Var = this.a;
                    hd1 hd1Var = n62Var.x;
                    y37[] y37VarArr = n62Var.a;
                    final int i2 = i;
                    final int i3 = ((v80) y37VarArr[i2].e).b;
                    final be beVarA0 = hd1Var.a0();
                    final boolean z2 = z;
                    hd1Var.b0(beVarA0, 1033, new q94() { // from class: wc1
                        @Override // defpackage.q94
                        public final void invoke(Object obj) {
                            ((ce) obj).x(beVarA0, i2, i3, z2);
                        }
                    });
                }
            });
        }
    }

    public final void H() throws Throwable {
        v(this.t.c(), true);
    }

    public final void I(j62 j62Var) throws Throwable {
        bm8 bm8VarC;
        this.H.c(1);
        int i = j62Var.a;
        int i2 = j62Var.b;
        int i3 = j62Var.c;
        nv7 nv7Var = j62Var.d;
        zs4 zs4Var = this.t;
        ArrayList arrayList = (ArrayList) zs4Var.c;
        vy2.j(i >= 0 && i <= i2 && i2 <= arrayList.size() && i3 >= 0);
        zs4Var.k = nv7Var;
        if (i == i2 || i == i3) {
            bm8VarC = zs4Var.c();
        } else {
            int iMin = Math.min(i, i3);
            int iMax = Math.max(((i2 - i) + i3) - 1, i2 - 1);
            int iO = ((ys4) arrayList.get(iMin)).d;
            j29.U(i, i2, i3, arrayList);
            while (iMin <= iMax) {
                ys4 ys4Var = (ys4) arrayList.get(iMin);
                ys4Var.d = iO;
                iO += ys4Var.a.o.e.o();
                iMin++;
            }
            bm8VarC = zs4Var.c();
        }
        v(bm8VarC, false);
    }

    public final void J() {
        this.H.c(1);
        O(false, false, false, true);
        yf1 yf1Var = this.f;
        HashMap map = yf1Var.j;
        long id = Thread.currentThread().getId();
        long j = yf1Var.k;
        vy2.r("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", j == -1 || j == id);
        yf1Var.k = id;
        ee6 ee6Var = this.w;
        if (!map.containsKey(ee6Var)) {
            map.put(ee6Var, new xf1());
        }
        xf1 xf1Var = (xf1) map.get(ee6Var);
        xf1Var.getClass();
        int i = yf1Var.f;
        if (i == -1) {
            i = 13107200;
        }
        xf1Var.b = i;
        xf1Var.a = false;
        m0(this.G.a.p() ? 4 : 2);
        ta6 ta6Var = this.G;
        boolean z = ta6Var.l;
        y0(this.A.d(ta6Var.e, z), ta6Var.n, z, ta6Var.m);
        td1 td1Var = (td1) this.g;
        td1Var.getClass();
        zs4 zs4Var = this.t;
        ArrayList arrayList = (ArrayList) zs4Var.c;
        vy2.s(!zs4Var.a);
        zs4Var.l = td1Var;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ys4 ys4Var = (ys4) arrayList.get(i2);
            zs4Var.g(ys4Var);
            ((HashSet) zs4Var.h).add(ys4Var);
        }
        zs4Var.a = true;
        this.h.e(2);
    }

    public final void K(b11 b11Var) {
        jx9 jx9Var = this.i;
        wd8 wd8Var = this.h;
        try {
            O(true, false, true, false);
            L();
            yf1 yf1Var = this.f;
            if (yf1Var.j.remove(this.w) != null) {
                yf1Var.d();
            }
            if (yf1Var.j.isEmpty()) {
                yf1Var.k = -1L;
            }
            cz czVar = this.A;
            czVar.c = null;
            czVar.a();
            czVar.c(0);
            this.d.a();
            m0(1);
        } finally {
            wd8Var.a.removeCallbacksAndMessages(null);
            jx9Var.m();
            b11Var.d();
        }
    }

    public final void L() {
        for (int i = 0; i < this.a.length; i++) {
            v80 v80Var = this.b[i];
            synchronized (v80Var.a) {
                v80Var.r = null;
            }
            y37 y37Var = this.a[i];
            v80 v80Var2 = (v80) y37Var.e;
            vy2.s(v80Var2.h == 0);
            v80Var2.q();
            y37Var.a = false;
            v80 v80Var3 = (v80) y37Var.f;
            if (v80Var3 != null) {
                vy2.s(v80Var3.h == 0);
                v80Var3.q();
                y37Var.b = false;
            }
        }
    }

    public final void M(int i, int i2, nv7 nv7Var) throws Throwable {
        this.H.c(1);
        zs4 zs4Var = this.t;
        zs4Var.getClass();
        vy2.j(i >= 0 && i <= i2 && i2 <= ((ArrayList) zs4Var.c).size());
        zs4Var.k = nv7Var;
        zs4Var.i(i, i2);
        v(zs4Var.c(), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void N() {
        /*
            Method dump skipped, instruction units count: 389
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n62.N():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x017b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void O(boolean r36, boolean r37, boolean r38, boolean r39) {
        /*
            Method dump skipped, instruction units count: 494
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n62.O(boolean, boolean, boolean, boolean):void");
    }

    public final void P() {
        aq4 aq4Var = this.s.i;
        this.K = aq4Var != null && aq4Var.g.i && this.J;
    }

    public final void Q(long j) {
        aq4 aq4Var = this.s.i;
        long j2 = j + (aq4Var == null ? 1000000000000L : aq4Var.p);
        this.V = j2;
        ((i48) this.o.c).a(j2);
        for (y37 y37Var : this.a) {
            long j3 = this.V;
            v80 v80VarD = y37Var.d(aq4Var);
            if (v80VarD != null) {
                v80VarD.n = false;
                v80VarD.l = j3;
                v80VarD.m = j3;
                v80VarD.p(j3, false);
            }
        }
        for (aq4 aq4Var2 = r0.i; aq4Var2 != null; aq4Var2 = aq4Var2.m) {
            for (p62 p62Var : (p62[]) aq4Var2.o.d) {
                if (p62Var != null) {
                    p62Var.r();
                }
            }
        }
    }

    public final void R(bm8 bm8Var, bm8 bm8Var2) {
        if (bm8Var.p() && bm8Var2.p()) {
            return;
        }
        ArrayList arrayList = this.p;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            dw1.x(arrayList.get(size));
            throw null;
        }
    }

    public final void U(long j) {
        boolean z = this.D;
        long j2 = C0;
        if (z) {
            this.C.getClass();
            jMin = this.G.e != 3 ? j2 : 1000L;
            for (y37 y37Var : this.a) {
                long j3 = this.V;
                long j4 = this.W;
                v80 v80Var = (v80) y37Var.f;
                v80 v80Var2 = (v80) y37Var.e;
                long jC = y37.h(v80Var2) ? v80Var2.c(j3, j4) : Long.MAX_VALUE;
                if (v80Var != null && v80Var.h != 0) {
                    jC = Math.min(jC, v80Var.c(j3, j4));
                }
                jMin = Math.min(jMin, j29.k0(jC));
            }
            if (this.G.m()) {
                aq4 aq4Var = this.s.i;
                if ((aq4Var != null ? aq4Var.m : null) != null) {
                    if ((j29.V(jMin) * this.G.o.a) + this.V >= r1.e()) {
                        jMin = Math.min(jMin, j2);
                    }
                }
            }
        } else if (this.G.e != 3 || q0()) {
            jMin = j2;
        }
        this.h.a.sendEmptyMessageAtTime(2, j + jMin);
    }

    public final void V(boolean z) {
        ks4 ks4Var = this.s.i.g.a;
        long jX = X(ks4Var, this.G.s, true, false);
        if (jX != this.G.s) {
            ta6 ta6Var = this.G;
            this.G = y(ks4Var, jX, ta6Var.c, ta6Var.d, z, 5);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:6|(1:8)(4:10|(1:12)(1:13)|14|(3:16|(1:18)(1:19)|20)(10:21|(1:23)(1:24)|107|25|111|(1:27)(6:30|(3:32|(1:34)|35)(24:37|(8:39|(1:51)(3:45|(1:49)|50)|52|(1:59)|60|61|62|63)(1:64)|103|65|(1:67)(1:68)|114|69|(1:71)(1:72)|73|74|(1:76)(1:77)|78|112|79|80|109|81|82|105|83|84|85|62|63)|98|96|101|102)|36|85|62|63))|9|107|25|111|(0)(0)|36|85|62|63) */
    /* JADX WARN: Can't wrap try/catch for region: R(5:37|(20:(8:39|(1:51)(3:45|(1:49)|50)|52|(1:59)|60|61|62|63)(1:64)|114|69|(1:71)(1:72)|73|74|(1:76)(1:77)|78|112|79|80|109|81|82|105|83|84|85|62|63)|103|65|(1:67)(1:68)) */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0177, code lost:
    
        r9 = r2;
        r2 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00aa, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ab, code lost:
    
        r9 = r2;
        r2 = r6;
        r3 = r11;
        r5 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0173, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0176, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a7 A[Catch: all -> 0x00aa, TRY_ENTER, TryCatch #4 {all -> 0x00aa, blocks: (B:27:0x00a7, B:32:0x00b4, B:34:0x00ba, B:35:0x00bd, B:39:0x00d0, B:41:0x00d6, B:45:0x00de, B:49:0x00ec, B:50:0x00f1, B:52:0x00f9, B:54:0x010a, B:60:0x0118), top: B:111:0x00a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b1  */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, zp4] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void W(defpackage.m62 r18, boolean r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 387
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n62.W(m62, boolean):void");
    }

    /* JADX WARN: Type inference failed for: r10v8, types: [java.lang.Object, zp4] */
    public final long X(ks4 ks4Var, long j, boolean z, boolean z2) {
        y37[] y37VarArr;
        u0();
        B0(false, true);
        if (z2 || this.G.e == 3) {
            m0(2);
        }
        cq4 cq4Var = this.s;
        aq4 aq4Var = cq4Var.i;
        aq4 aq4Var2 = aq4Var;
        while (aq4Var2 != null && !ks4Var.equals(aq4Var2.g.a)) {
            aq4Var2 = aq4Var2.m;
        }
        if (z || aq4Var != aq4Var2 || (aq4Var2 != null && aq4Var2.p + j < 0)) {
            int i = 0;
            while (true) {
                y37VarArr = this.a;
                if (i >= y37VarArr.length) {
                    break;
                }
                h(i);
                i++;
            }
            this.z0 = -9223372036854775807L;
            if (aq4Var2 != null) {
                while (cq4Var.i != aq4Var2) {
                    cq4Var.a();
                }
                cq4Var.o(aq4Var2);
                aq4Var2.p = 1000000000000L;
                k(new boolean[y37VarArr.length], cq4Var.j.e());
                aq4Var2.h = true;
            }
        }
        g();
        if (aq4Var2 != null) {
            ?? r10 = aq4Var2.a;
            cq4Var.o(aq4Var2);
            if (!aq4Var2.e) {
                aq4Var2.g = aq4Var2.g.b(j);
            } else if (aq4Var2.f) {
                j = r10.i(j);
                r10.s(j - this.m, this.n);
            }
            Q(j);
            C();
        } else {
            cq4Var.b();
            Q(j);
        }
        u(false);
        this.h.e(2);
        return j;
    }

    public final void Y(le6 le6Var) {
        le6Var.getClass();
        wd8 wd8Var = this.h;
        if (le6Var.e != this.j) {
            wd8Var.a(15, le6Var).b();
            return;
        }
        synchronized (le6Var) {
        }
        try {
            le6Var.a.e(le6Var.c, le6Var.d);
            le6Var.a(true);
            int i = this.G.e;
            if (i == 3 || i == 2) {
                wd8Var.e(2);
            }
        } catch (Throwable th) {
            le6Var.a(true);
            throw th;
        }
    }

    public final void Z(le6 le6Var) {
        Looper looper = le6Var.e;
        if (looper.getThread().isAlive()) {
            this.q.a(looper, null).c(new b7(this, le6Var));
        } else {
            wn5.k0("TAG", "Trying to send message on a dead thread.");
            le6Var.a(false);
        }
    }

    public final void a(i62 i62Var, int i) throws Throwable {
        this.H.c(1);
        zs4 zs4Var = this.t;
        if (i == -1) {
            i = ((ArrayList) zs4Var.c).size();
        }
        v(zs4Var.a(i, i62Var.a, i62Var.b), false);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a0(defpackage.ly r7, boolean r8) {
        /*
            r6 = this;
            fi4 r0 = r6.d
            ci1 r0 = (defpackage.ci1) r0
            ly r1 = r0.j
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto Ld
            goto L12
        Ld:
            r0.j = r7
            r0.f()
        L12:
            if (r8 == 0) goto L15
            goto L16
        L15:
            r7 = 0
        L16:
            cz r8 = r6.A
            ly r0 = r8.d
            boolean r0 = j$.util.Objects.equals(r0, r7)
            if (r0 != 0) goto L53
            r8.d = r7
            r0 = 0
            r1 = 1
            if (r7 != 0) goto L28
        L26:
            r3 = r0
            goto L47
        L28:
            int r2 = r7.c
            r3 = 3
            r4 = 2
            java.lang.String r5 = "AudioFocusManager"
            switch(r2) {
                case 0: goto L41;
                case 1: goto L3f;
                case 2: goto L3d;
                case 3: goto L26;
                case 4: goto L3d;
                case 5: goto L47;
                case 6: goto L47;
                case 7: goto L47;
                case 8: goto L47;
                case 9: goto L47;
                case 10: goto L47;
                case 11: goto L39;
                case 12: goto L47;
                case 13: goto L47;
                case 14: goto L3f;
                case 15: goto L31;
                case 16: goto L37;
                default: goto L31;
            }
        L31:
            java.lang.String r7 = "Unidentified audio usage: "
            defpackage.o40.E(r2, r7, r5)
            goto L26
        L37:
            r3 = 4
            goto L47
        L39:
            int r7 = r7.a
            if (r7 != r1) goto L47
        L3d:
            r3 = r4
            goto L47
        L3f:
            r3 = r1
            goto L47
        L41:
            java.lang.String r7 = "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default."
            defpackage.wn5.k0(r5, r7)
            goto L3f
        L47:
            r8.f = r3
            if (r3 == r1) goto L4d
            if (r3 != 0) goto L4e
        L4d:
            r0 = r1
        L4e:
            java.lang.String r7 = "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME."
            defpackage.vy2.i(r7, r0)
        L53:
            ta6 r7 = r6.G
            boolean r0 = r7.l
            int r1 = r7.n
            int r2 = r7.m
            int r7 = r7.e
            int r7 = r8.d(r7, r0)
            r6.y0(r7, r1, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n62.a0(ly, boolean):void");
    }

    public final void b() {
        for (y37 y37Var : this.a) {
            gh7 gh7Var = this.D ? this.C : null;
            ((v80) y37Var.e).e(18, gh7Var);
            v80 v80Var = (v80) y37Var.f;
            if (v80Var != null) {
                v80Var.e(18, gh7Var);
            }
        }
    }

    public final void b0(boolean z, b11 b11Var) {
        if (this.Q != z) {
            this.Q = z;
            if (!z) {
                for (y37 y37Var : this.a) {
                    y37Var.k();
                }
            }
        }
        if (b11Var != null) {
            b11Var.d();
        }
    }

    @Override // defpackage.f59
    public final void c(long j, long j2, b bVar, MediaFormat mediaFormat) {
        if (this.E) {
            wd8 wd8Var = this.h;
            wd8Var.getClass();
            vd8 vd8VarB = wd8.b();
            vd8VarB.a = wd8Var.a.obtainMessage(37);
            vd8VarB.b();
        }
    }

    public final void c0(i62 i62Var) throws Throwable {
        this.H.c(1);
        int i = i62Var.c;
        nv7 nv7Var = i62Var.b;
        ArrayList arrayList = i62Var.a;
        if (i != -1) {
            this.U = new m62(new sg6(arrayList, nv7Var), i62Var.c, i62Var.d);
        }
        zs4 zs4Var = this.t;
        ArrayList arrayList2 = (ArrayList) zs4Var.c;
        zs4Var.i(0, arrayList2.size());
        v(zs4Var.a(arrayList2.size(), arrayList, nv7Var), false);
    }

    @Override // defpackage.yp4
    public final void d(zp4 zp4Var) {
        this.h.a(8, zp4Var).b();
    }

    public final void d0(boolean z) {
        this.J = z;
        P();
        if (this.K) {
            cq4 cq4Var = this.s;
            if (cq4Var.j != cq4Var.i) {
                V(true);
                u(false);
            }
        }
    }

    public final boolean e() {
        if (!this.z) {
            return false;
        }
        for (y37 y37Var : this.a) {
            if (y37Var.f()) {
                return true;
            }
        }
        return false;
    }

    public final void e0(ua6 ua6Var) {
        this.h.d(16);
        ag1 ag1Var = this.o;
        ag1Var.d(ua6Var);
        ua6 ua6VarG = ag1Var.g();
        x(ua6VarG, ua6VarG.a, true, true);
    }

    public final void f() {
        N();
        V(true);
    }

    public final void f0(o52 o52Var) {
        this.y0 = o52Var;
        bm8 bm8Var = this.G.a;
        cq4 cq4Var = this.s;
        cq4Var.getClass();
        o52Var.getClass();
        if (cq4Var.q.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < cq4Var.q.size(); i++) {
            ((aq4) cq4Var.q.get(i)).i();
        }
        cq4Var.q = arrayList;
        cq4Var.m = null;
        cq4Var.l();
    }

    public final void g() {
        v80 v80Var;
        if (this.z && e()) {
            for (y37 y37Var : this.a) {
                int iC = y37Var.c();
                if (y37Var.f()) {
                    int i = y37Var.d;
                    boolean z = i == 4 || i == 2;
                    int i2 = i != 4 ? 0 : 1;
                    if (z) {
                        v80Var = (v80) y37Var.e;
                    } else {
                        v80Var = (v80) y37Var.f;
                        v80Var.getClass();
                    }
                    y37Var.a(v80Var, this.o);
                    y37Var.i(z);
                    y37Var.d = i2;
                }
                this.T -= iC - y37Var.c();
            }
            this.z0 = -9223372036854775807L;
        }
    }

    public final void g0(int i) {
        this.O = i;
        bm8 bm8Var = this.G.a;
        cq4 cq4Var = this.s;
        cq4Var.g = i;
        int iS = cq4Var.s(bm8Var);
        if ((iS & 1) != 0) {
            V(true);
        } else if ((iS & 2) != 0) {
            g();
        }
        u(false);
    }

    public final void h(int i) {
        y37[] y37VarArr = this.a;
        int iC = y37VarArr[i].c();
        y37 y37Var = y37VarArr[i];
        v80 v80Var = (v80) y37Var.e;
        ag1 ag1Var = this.o;
        y37Var.a(v80Var, ag1Var);
        v80 v80Var2 = (v80) y37Var.f;
        if (v80Var2 != null) {
            boolean z = (v80Var2.h == 0 || y37Var.d == 3) ? false : true;
            y37Var.a(v80Var2, ag1Var);
            y37Var.i(false);
            if (z) {
                v80 v80Var3 = (v80) y37Var.e;
                v80Var2.getClass();
                v80Var2.e(17, v80Var3);
            }
        }
        y37Var.d = 0;
        G(i, false);
        this.T -= iC;
    }

    public final void h0(boolean z) throws Throwable {
        if (!z) {
            this.E = false;
            this.h.d(37);
            m62 m62Var = this.F;
            if (m62Var != null) {
                W(m62Var, false);
                this.F = null;
            }
        }
        this.D = z;
        b();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws Throwable {
        int i;
        aq4 aq4Var;
        ks4 ks4Var;
        aq4 aq4Var2;
        int i2;
        try {
            switch (message.what) {
                case 1:
                    boolean z = message.arg1 != 0;
                    int i3 = message.arg2;
                    this.H.c(1);
                    y0(this.A.d(this.G.e, z), i3 >> 4, z, i3 & 15);
                    break;
                case 2:
                    i();
                    break;
                case 3:
                    W((m62) message.obj, true);
                    break;
                case 4:
                    e0((ua6) message.obj);
                    break;
                case 5:
                    j0((ll7) message.obj);
                    break;
                case 6:
                    t0(false, true);
                    break;
                case 7:
                    K((b11) message.obj);
                    return true;
                case 8:
                    w((zp4) message.obj);
                    break;
                case 9:
                    s((zp4) message.obj);
                    break;
                case 10:
                    N();
                    break;
                case 11:
                    g0(message.arg1);
                    break;
                case 12:
                    k0(message.arg1 != 0);
                    break;
                case 13:
                    b0(message.arg1 != 0, (b11) message.obj);
                    break;
                case 14:
                    Y((le6) message.obj);
                    break;
                case 15:
                    Z((le6) message.obj);
                    break;
                case 16:
                    ua6 ua6Var = (ua6) message.obj;
                    x(ua6Var, ua6Var.a, true, false);
                    break;
                case 17:
                    c0((i62) message.obj);
                    break;
                case 18:
                    a((i62) message.obj, message.arg1);
                    break;
                case 19:
                    I((j62) message.obj);
                    break;
                case 20:
                    M(message.arg1, message.arg2, (nv7) message.obj);
                    break;
                case 21:
                    l0((nv7) message.obj);
                    break;
                case 22:
                    H();
                    break;
                case 23:
                    d0(message.arg1 != 0);
                    break;
                case 24:
                default:
                    return false;
                case 25:
                    f();
                    break;
                case 26:
                    N();
                    V(true);
                    break;
                case 27:
                    x0(message.arg1, message.arg2, (List) message.obj);
                    break;
                case 28:
                    f0((o52) message.obj);
                    break;
                case 29:
                    J();
                    break;
                case 30:
                    Pair pair = (Pair) message.obj;
                    o0(pair.first, (b11) pair.second);
                    break;
                case 31:
                    a0((ly) message.obj, message.arg1 != 0);
                    break;
                case 32:
                    p0(((Float) message.obj).floatValue());
                    break;
                case 33:
                    q(message.arg1);
                    break;
                case 34:
                    r();
                    break;
                case 35:
                    n0((f59) message.obj);
                    break;
                case 36:
                    h0(((Boolean) message.obj).booleanValue());
                    break;
                case 37:
                    this.E = false;
                    m62 m62Var = this.F;
                    if (m62Var != null) {
                        W(m62Var, false);
                        this.F = null;
                    }
                    break;
                case 38:
                    i0((gh7) message.obj);
                    break;
            }
        } catch (ParserException e) {
            boolean z2 = e.a;
            int i4 = e.b;
            if (i4 == 1) {
                i2 = z2 ? 3001 : 3003;
            } else {
                if (i4 == 4) {
                    i2 = z2 ? 3002 : 3004;
                }
                t(e, i);
            }
            i = i2;
            t(e, i);
        } catch (DataSourceException e2) {
            t(e2, e2.a);
        } catch (ExoPlaybackException e3) {
            e = e3;
            int i5 = e.j;
            cq4 cq4Var = this.s;
            if (i5 == 1 && (aq4Var2 = cq4Var.j) != null && e.o == null) {
                e = e.c(aq4Var2.g.a);
            }
            int i6 = e.j;
            wd8 wd8Var = this.h;
            if (i6 == 1 && (ks4Var = e.o) != null && A(e.l, ks4Var)) {
                this.A0 = true;
                g();
                aq4 aq4VarH = cq4Var.h();
                aq4 aq4Var3 = cq4Var.i;
                if (aq4Var3 != aq4VarH) {
                    while (aq4Var3 != null) {
                        aq4 aq4Var4 = aq4Var3.m;
                        if (aq4Var4 == aq4VarH) {
                            break;
                        }
                        aq4Var3 = aq4Var4;
                    }
                }
                cq4Var.o(aq4Var3);
                if (this.G.e != 4) {
                    C();
                    wd8Var.e(2);
                }
            } else {
                ExoPlaybackException exoPlaybackException = this.Z;
                if (exoPlaybackException != null) {
                    exoPlaybackException.addSuppressed(e);
                    e = this.Z;
                }
                if (e.j == 1 && cq4Var.i != cq4Var.j) {
                    while (true) {
                        aq4Var = cq4Var.i;
                        if (aq4Var == cq4Var.j) {
                            break;
                        }
                        cq4Var.a();
                    }
                    vy2.n(aq4Var);
                    E();
                    bq4 bq4Var = aq4Var.g;
                    ks4 ks4Var2 = bq4Var.a;
                    long j = bq4Var.b;
                    this.G = y(ks4Var2, j, bq4Var.c, j, true, 0);
                }
                if (e.p && (this.Z == null || (i = e.a) == 5004 || i == 5003)) {
                    wn5.l0("ExoPlayerImplInternal", "Recoverable renderer error", e);
                    if (this.Z == null) {
                        this.Z = e;
                    }
                    vd8 vd8VarA = wd8Var.a(25, e);
                    Handler handler = wd8Var.a;
                    Message message2 = vd8VarA.a;
                    message2.getClass();
                    handler.sendMessageAtFrontOfQueue(message2);
                    vd8VarA.a();
                } else {
                    wn5.H("ExoPlayerImplInternal", "Playback error", e);
                    t0(true, false);
                    this.G = this.G.f(e);
                }
            }
        } catch (DrmSession$DrmSessionException e4) {
            t(e4, e4.a);
        } catch (BehindLiveWindowException e5) {
            t(e5, 1002);
        } catch (IOException e6) {
            t(e6, 2000);
        } catch (RuntimeException e7) {
            ExoPlaybackException exoPlaybackException2 = new ExoPlaybackException(2, e7, ((e7 instanceof IllegalStateException) || (e7 instanceof IllegalArgumentException)) ? 1004 : 1000);
            wn5.H("ExoPlayerImplInternal", "Playback error", exoPlaybackException2);
            t0(true, false);
            this.G = this.G.f(exoPlaybackException2);
        }
        E();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0560  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x0688  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x0714  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x071b  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x07e8  */
    /* JADX WARN: Removed duplicated region for block: B:537:0x084f  */
    /* JADX WARN: Removed duplicated region for block: B:556:0x0889  */
    /* JADX WARN: Removed duplicated region for block: B:558:0x088c  */
    /* JADX WARN: Removed duplicated region for block: B:559:0x088f  */
    /* JADX WARN: Removed duplicated region for block: B:566:0x08b9  */
    /* JADX WARN: Removed duplicated region for block: B:569:0x08c1  */
    /* JADX WARN: Removed duplicated region for block: B:572:0x08c6  */
    /* JADX WARN: Removed duplicated region for block: B:576:0x08cd  */
    /* JADX WARN: Removed duplicated region for block: B:579:0x08d4  */
    /* JADX WARN: Removed duplicated region for block: B:582:0x08df  */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, zp4] */
    /* JADX WARN: Type inference failed for: r2v57, types: [java.lang.Object, zp4] */
    /* JADX WARN: Type inference failed for: r2v96, types: [java.lang.Object, zp4] */
    /* JADX WARN: Type inference failed for: r3v29, types: [java.lang.Object, zp4] */
    /* JADX WARN: Type inference failed for: r3v88, types: [java.lang.Object, zp4] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i() {
        /*
            Method dump skipped, instruction units count: 2306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n62.i():void");
    }

    public final void i0(gh7 gh7Var) {
        this.C = gh7Var;
        b();
    }

    public final void j(aq4 aq4Var, int i, boolean z, long j) {
        y37 y37Var = this.a[i];
        boolean zG = y37Var.g();
        v80 v80Var = (v80) y37Var.e;
        if (zG) {
            return;
        }
        boolean z2 = aq4Var == this.s.i;
        jp8 jp8Var = aq4Var.o;
        x37 x37Var = ((x37[]) jp8Var.c)[i];
        p62 p62Var = ((p62[]) jp8Var.d)[i];
        boolean z3 = q0() && this.G.e == 3;
        boolean z4 = !z && z3;
        this.T++;
        pc7 pc7Var = aq4Var.c[i];
        long j2 = aq4Var.p;
        ks4 ks4Var = aq4Var.g.a;
        v80 v80Var2 = (v80) y37Var.f;
        int length = p62Var != null ? p62Var.length() : 0;
        b[] bVarArr = new b[length];
        for (int i2 = 0; i2 < length; i2++) {
            p62Var.getClass();
            bVarArr[i2] = p62Var.g(i2);
        }
        int i3 = y37Var.d;
        ag1 ag1Var = this.o;
        if (i3 == 0 || i3 == 2 || i3 == 4) {
            y37Var.a = true;
            vy2.s(v80Var.h == 0);
            v80Var.d = x37Var;
            v80Var.q = ks4Var;
            v80Var.h = 1;
            v80Var.o(z4, z2);
            v80Var.x(bVarArr, pc7Var, j, j2, ks4Var);
            v80Var.n = false;
            v80Var.l = j;
            v80Var.m = j;
            v80Var.p(j, z4);
            ag1Var.a(v80Var);
        } else {
            y37Var.b = true;
            v80Var2.getClass();
            vy2.s(v80Var2.h == 0);
            v80Var2.d = x37Var;
            v80Var2.q = ks4Var;
            v80Var2.h = 1;
            v80Var2.o(z4, z2);
            v80Var2.x(bVarArr, pc7Var, j, j2, ks4Var);
            v80Var2.n = false;
            v80Var2.l = j;
            v80Var2.m = j;
            v80Var2.p(j, z4);
            ag1Var.a(v80Var2);
        }
        h62 h62Var = new h62(this);
        v80 v80VarD = y37Var.d(aq4Var);
        v80VarD.getClass();
        v80VarD.e(11, h62Var);
        if (z3 && z2) {
            y37Var.m();
        }
    }

    public final void j0(ll7 ll7Var) {
        this.B = ll7Var;
    }

    public final void k(boolean[] zArr, long j) {
        y37[] y37VarArr;
        long j2;
        aq4 aq4Var = this.s.j;
        jp8 jp8Var = aq4Var.o;
        int i = 0;
        while (true) {
            y37VarArr = this.a;
            if (i >= y37VarArr.length) {
                break;
            }
            if (!jp8Var.s(i)) {
                y37VarArr[i].k();
            }
            i++;
        }
        int i2 = 0;
        while (i2 < y37VarArr.length) {
            if (jp8Var.s(i2) && y37VarArr[i2].d(aq4Var) == null) {
                j2 = j;
                j(aq4Var, i2, zArr[i2], j2);
            } else {
                j2 = j;
            }
            i2++;
            j = j2;
        }
    }

    public final void k0(boolean z) {
        this.P = z;
        bm8 bm8Var = this.G.a;
        cq4 cq4Var = this.s;
        cq4Var.h = z;
        int iS = cq4Var.s(bm8Var);
        if ((iS & 1) != 0) {
            V(true);
        } else if ((iS & 2) != 0) {
            g();
        }
        u(false);
    }

    @Override // defpackage.jo7
    public final void l(ko7 ko7Var) {
        this.h.a(9, (zp4) ko7Var).b();
    }

    public final void l0(nv7 nv7Var) throws Throwable {
        this.H.c(1);
        zs4 zs4Var = this.t;
        int size = ((ArrayList) zs4Var.c).size();
        if (nv7Var.b.length != size) {
            nv7Var = new nv7(new Random(nv7Var.a.nextLong())).a(0, size);
        }
        zs4Var.k = nv7Var;
        v(zs4Var.c(), false);
    }

    public final long m(bm8 bm8Var, Object obj, long j) {
        yl8 yl8Var = this.l;
        int i = bm8Var.g(obj, yl8Var).c;
        am8 am8Var = this.k;
        bm8Var.n(i, am8Var);
        if (am8Var.f != -9223372036854775807L && am8Var.a() && am8Var.i) {
            return j29.V(j29.D(am8Var.g) - am8Var.f) - (j + yl8Var.e);
        }
        return -9223372036854775807L;
    }

    public final void m0(int i) {
        ta6 ta6Var = this.G;
        if (ta6Var.e != i) {
            if (i != 2) {
                this.x0 = -9223372036854775807L;
            }
            if (i != 3 && ta6Var.p) {
                this.G = ta6Var.i(false);
            }
            this.G = this.G.h(i);
        }
    }

    public final long n(aq4 aq4Var) {
        if (aq4Var == null) {
            return 0L;
        }
        long jMax = aq4Var.p;
        if (!aq4Var.e) {
            return jMax;
        }
        int i = 0;
        while (true) {
            y37[] y37VarArr = this.a;
            if (i >= y37VarArr.length) {
                return jMax;
            }
            if (y37VarArr[i].d(aq4Var) != null) {
                v80 v80VarD = y37VarArr[i].d(aq4Var);
                Objects.requireNonNull(v80VarD);
                long j = v80VarD.m;
                if (j == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                jMax = Math.max(j, jMax);
            }
            i++;
        }
    }

    public final void n0(f59 f59Var) {
        for (y37 y37Var : this.a) {
            v80 v80Var = (v80) y37Var.e;
            if (v80Var.b == 2) {
                v80Var.e(7, f59Var);
                v80 v80Var2 = (v80) y37Var.f;
                if (v80Var2 != null) {
                    v80Var2.e(7, f59Var);
                }
            }
        }
    }

    public final Pair o(bm8 bm8Var) {
        if (bm8Var.p()) {
            return Pair.create(ta6.u, 0L);
        }
        Pair pairI = bm8Var.i(this.k, this.l, bm8Var.a(this.P), -9223372036854775807L);
        ks4 ks4VarQ = this.s.q(bm8Var, pairI.first, 0L);
        long jLongValue = ((Long) pairI.second).longValue();
        if (ks4VarQ.b()) {
            Object obj = ks4VarQ.a;
            yl8 yl8Var = this.l;
            bm8Var.g(obj, yl8Var);
            jLongValue = ks4VarQ.c == yl8Var.f(ks4VarQ.b) ? yl8Var.g.b : 0L;
        }
        return Pair.create(ks4VarQ, Long.valueOf(jLongValue));
    }

    public final void o0(Object obj, b11 b11Var) {
        for (y37 y37Var : this.a) {
            v80 v80Var = (v80) y37Var.e;
            if (v80Var.b == 2) {
                int i = y37Var.d;
                if (i == 4 || i == 1) {
                    v80 v80Var2 = (v80) y37Var.f;
                    v80Var2.getClass();
                    v80Var2.e(1, obj);
                } else {
                    v80Var.e(1, obj);
                }
            }
        }
        int i2 = this.G.e;
        if (i2 == 3 || i2 == 2) {
            this.h.e(2);
        }
        if (b11Var != null) {
            b11Var.d();
        }
    }

    public final long p(long j) {
        aq4 aq4Var = this.s.l;
        if (aq4Var == null) {
            return 0L;
        }
        return Math.max(0L, j - (this.V - aq4Var.p));
    }

    public final void p0(float f) {
        this.B0 = f;
        float f2 = f * this.A.g;
        for (y37 y37Var : this.a) {
            v80 v80Var = (v80) y37Var.e;
            if (v80Var.b == 1) {
                v80Var.e(2, Float.valueOf(f2));
                v80 v80Var2 = (v80) y37Var.f;
                if (v80Var2 != null) {
                    v80Var2.e(2, Float.valueOf(f2));
                }
            }
        }
    }

    public final void q(int i) {
        ta6 ta6Var = this.G;
        y0(i, ta6Var.n, ta6Var.l, ta6Var.m);
    }

    public final boolean q0() {
        ta6 ta6Var = this.G;
        return ta6Var.l && ta6Var.n == 0;
    }

    public final void r() {
        p0(this.B0);
    }

    public final boolean r0(bm8 bm8Var, ks4 ks4Var) {
        if (ks4Var.b() || bm8Var.p()) {
            return false;
        }
        int i = bm8Var.g(ks4Var.a, this.l).c;
        am8 am8Var = this.k;
        bm8Var.n(i, am8Var);
        return am8Var.a() && am8Var.i && am8Var.f != -9223372036854775807L;
    }

    public final void s(zp4 zp4Var) {
        cq4 cq4Var = this.s;
        aq4 aq4Var = cq4Var.l;
        if (aq4Var != null && aq4Var.a == zp4Var) {
            cq4Var.n(this.V);
            C();
            return;
        }
        aq4 aq4Var2 = cq4Var.m;
        if (aq4Var2 == null || aq4Var2.a != zp4Var) {
            return;
        }
        D();
    }

    public final void s0() {
        aq4 aq4Var = this.s.i;
        if (aq4Var == null) {
            return;
        }
        jp8 jp8Var = aq4Var.o;
        int i = 0;
        while (true) {
            y37[] y37VarArr = this.a;
            if (i >= y37VarArr.length) {
                return;
            }
            if (jp8Var.s(i)) {
                y37VarArr[i].m();
            }
            i++;
        }
    }

    public final void t(IOException iOException, int i) {
        ExoPlaybackException exoPlaybackException = new ExoPlaybackException(0, iOException, i);
        aq4 aq4Var = this.s.i;
        if (aq4Var != null) {
            exoPlaybackException = exoPlaybackException.c(aq4Var.g.a);
        }
        wn5.H("ExoPlayerImplInternal", "Playback error", exoPlaybackException);
        t0(false, false);
        this.G = this.G.f(exoPlaybackException);
    }

    public final void t0(boolean z, boolean z2) {
        O(z || !this.Q, false, true, false);
        this.H.c(z2 ? 1 : 0);
        yf1 yf1Var = this.f;
        if (yf1Var.j.remove(this.w) != null) {
            yf1Var.d();
        }
        this.A.d(1, this.G.l);
        m0(1);
    }

    public final void u(boolean z) {
        aq4 aq4Var = this.s.l;
        ks4 ks4Var = aq4Var == null ? this.G.b : aq4Var.g.a;
        boolean zEquals = this.G.k.equals(ks4Var);
        if (!zEquals) {
            this.G = this.G.c(ks4Var);
        }
        ta6 ta6Var = this.G;
        ta6Var.q = aq4Var == null ? ta6Var.s : aq4Var.d();
        ta6 ta6Var2 = this.G;
        ta6Var2.r = p(ta6Var2.q);
        if ((!zEquals || z) && aq4Var != null && aq4Var.e) {
            w0(aq4Var.o);
        }
    }

    public final void u0() {
        ag1 ag1Var = this.o;
        ag1Var.b = false;
        i48 i48Var = (i48) ag1Var.c;
        if (i48Var.c) {
            i48Var.a(i48Var.h());
            i48Var.c = false;
        }
        for (y37 y37Var : this.a) {
            v80 v80Var = (v80) y37Var.f;
            v80 v80Var2 = (v80) y37Var.e;
            if (y37.h(v80Var2)) {
                y37.b(v80Var2);
            }
            if (v80Var != null && v80Var.h != 0) {
                y37.b(v80Var);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0202  */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14, types: [bm8] */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [m62] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v13 */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r20v4 */
    /* JADX WARN: Type inference failed for: r20v8 */
    /* JADX WARN: Type inference failed for: r2v10, types: [bm8] */
    /* JADX WARN: Type inference failed for: r2v15, types: [ta6] */
    /* JADX WARN: Type inference failed for: r37v0, types: [n62] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v7, types: [int] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v(defpackage.bm8 r38, boolean r39) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1156
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n62.v(bm8, boolean):void");
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, ko7] */
    public final void v0() {
        aq4 aq4Var = this.s.l;
        boolean z = this.N || (aq4Var != null && aq4Var.a.a());
        ta6 ta6Var = this.G;
        if (z != ta6Var.g) {
            this.G = ta6Var.b(z);
        }
    }

    public final void w(zp4 zp4Var) {
        aq4 aq4Var;
        cq4 cq4Var = this.s;
        aq4 aq4Var2 = cq4Var.l;
        ag1 ag1Var = this.o;
        if (aq4Var2 != null && aq4Var2.a == zp4Var) {
            aq4Var2.getClass();
            if (!aq4Var2.e) {
                float f = ag1Var.g().a;
                ta6 ta6Var = this.G;
                aq4Var2.f(f, ta6Var.a, ta6Var.l);
            }
            w0(aq4Var2.o);
            if (aq4Var2 == cq4Var.i) {
                Q(aq4Var2.g.b);
                k(new boolean[this.a.length], cq4Var.j.e());
                aq4Var2.h = true;
                ta6 ta6Var2 = this.G;
                ks4 ks4Var = ta6Var2.b;
                long j = aq4Var2.g.b;
                this.G = y(ks4Var, j, ta6Var2.c, j, false, 5);
            }
            C();
            return;
        }
        int i = 0;
        while (true) {
            if (i >= cq4Var.q.size()) {
                aq4Var = null;
                break;
            }
            aq4Var = (aq4) cq4Var.q.get(i);
            if (aq4Var.a == zp4Var) {
                break;
            } else {
                i++;
            }
        }
        if (aq4Var != null) {
            vy2.s(true ^ aq4Var.e);
            float f2 = ag1Var.g().a;
            ta6 ta6Var3 = this.G;
            aq4Var.f(f2, ta6Var3.a, ta6Var3.l);
            aq4 aq4Var3 = cq4Var.m;
            if (aq4Var3 == null || aq4Var3.a != zp4Var) {
                return;
            }
            D();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void w0(jp8 jp8Var) {
        aq4 aq4Var = this.s.l;
        aq4Var.getClass();
        p(aq4Var.d());
        if (r0(this.G.a, aq4Var.g.a)) {
            long j = this.u.h;
        }
        bm8 bm8Var = this.G.a;
        float f = this.o.g().a;
        boolean z = this.G.l;
        p62[] p62VarArr = (p62[]) jp8Var.d;
        yf1 yf1Var = this.f;
        xf1 xf1Var = (xf1) yf1Var.j.get(this.w);
        xf1Var.getClass();
        int iMax = yf1Var.f;
        if (iMax == -1) {
            int length = p62VarArr.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                int i3 = 13107200;
                if (i < length) {
                    p62 p62Var = p62VarArr[i];
                    if (p62Var != null) {
                        switch (p62Var.c().c) {
                            case ErrorDTO.CODE_JSON_ERROR /* -2 */:
                                i3 = 0;
                                i2 += i3;
                                break;
                            case -1:
                            case 1:
                                i2 += i3;
                                break;
                            case 0:
                                i3 = 144310272;
                                i2 += i3;
                                break;
                            case 2:
                                i3 = 131072000;
                                i2 += i3;
                                break;
                            case 3:
                            case 5:
                            case 6:
                                i3 = 131072;
                                i2 += i3;
                                break;
                            case 4:
                                i3 = 26214400;
                                i2 += i3;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                    }
                    i++;
                } else {
                    iMax = Math.max(13107200, i2);
                }
            }
        }
        xf1Var.b = iMax;
        yf1Var.d();
    }

    public final void x(ua6 ua6Var, float f, boolean z, boolean z2) {
        int i;
        if (z) {
            if (z2) {
                this.H.c(1);
            }
            this.G = this.G.g(ua6Var);
        }
        float f2 = ua6Var.a;
        aq4 aq4Var = this.s.i;
        while (true) {
            i = 0;
            if (aq4Var == null) {
                break;
            }
            p62[] p62VarArr = (p62[]) aq4Var.o.d;
            int length = p62VarArr.length;
            while (i < length) {
                p62 p62Var = p62VarArr[i];
                if (p62Var != null) {
                    p62Var.p(f2);
                }
                i++;
            }
            aq4Var = aq4Var.m;
        }
        y37[] y37VarArr = this.a;
        int length2 = y37VarArr.length;
        while (i < length2) {
            y37 y37Var = y37VarArr[i];
            float f3 = ua6Var.a;
            ((v80) y37Var.e).y(f, f3);
            v80 v80Var = (v80) y37Var.f;
            if (v80Var != null) {
                v80Var.y(f, f3);
            }
            i++;
        }
    }

    public final void x0(int i, int i2, List list) throws Throwable {
        this.H.c(1);
        zs4 zs4Var = this.t;
        zs4Var.getClass();
        ArrayList arrayList = (ArrayList) zs4Var.c;
        vy2.j(i >= 0 && i <= i2 && i2 <= arrayList.size());
        vy2.j(list.size() == i2 - i);
        for (int i3 = i; i3 < i2; i3++) {
            ((ys4) arrayList.get(i3)).a.s((jp4) list.get(i3 - i));
        }
        v(zs4Var.c(), false);
    }

    public final ta6 y(ks4 ks4Var, long j, long j2, long j3, boolean z, int i) {
        boolean z2;
        this.Y = (!this.Y && j == this.G.s && ks4Var.equals(this.G.b)) ? false : true;
        P();
        ta6 ta6Var = this.G;
        zo8 zo8Var = ta6Var.h;
        jp8 jp8Var = ta6Var.i;
        List listQ = ta6Var.j;
        if (this.t.a) {
            aq4 aq4Var = this.s.i;
            zo8Var = aq4Var == null ? zo8.d : aq4Var.n;
            jp8Var = aq4Var == null ? this.e : aq4Var.o;
            p62[] p62VarArr = (p62[]) jp8Var.d;
            lj3 lj3Var = new lj3(4);
            boolean z3 = false;
            for (p62 p62Var : p62VarArr) {
                if (p62Var != null) {
                    jv4 jv4Var = p62Var.g(0).l;
                    if (jv4Var == null) {
                        lj3Var.O(new jv4(new iv4[0]));
                    } else {
                        lj3Var.O(jv4Var);
                        z3 = true;
                    }
                }
            }
            listQ = z3 ? lj3Var.S() : ImmutableList.q();
            if (aq4Var != null) {
                bq4 bq4Var = aq4Var.g;
                if (bq4Var.c != j2) {
                    aq4Var.g = bq4Var.a(j2);
                }
            }
            y37[] y37VarArr = this.a;
            cq4 cq4Var = this.s;
            aq4 aq4Var2 = cq4Var.i;
            if (aq4Var2 == cq4Var.j && aq4Var2 != null) {
                jp8 jp8Var2 = aq4Var2.o;
                int i2 = 0;
                boolean z4 = false;
                while (true) {
                    if (i2 >= y37VarArr.length) {
                        z2 = true;
                        break;
                    }
                    if (jp8Var2.s(i2)) {
                        if (((v80) y37VarArr[i2].e).b != 1) {
                            z2 = false;
                            break;
                        }
                        if (((x37[]) jp8Var2.c)[i2].a != 0) {
                            z4 = true;
                        }
                    }
                    i2++;
                }
                boolean z5 = z4 && z2;
                if (z5 != this.S) {
                    this.S = z5;
                    if (!z5 && this.G.p) {
                        this.h.e(2);
                    }
                }
            }
        } else if (!ks4Var.equals(ta6Var.b)) {
            zo8Var = zo8.d;
            jp8Var = this.e;
            listQ = ImmutableList.q();
        }
        zo8 zo8Var2 = zo8Var;
        jp8 jp8Var3 = jp8Var;
        List list = listQ;
        if (z) {
            k62 k62Var = this.H;
            if (!k62Var.c || k62Var.d == 5) {
                k62Var.b = true;
                k62Var.c = true;
                k62Var.d = i;
            } else {
                vy2.j(i == 5);
            }
        }
        ta6 ta6Var2 = this.G;
        return ta6Var2.d(ks4Var, j, j2, j3, p(ta6Var2.q), zo8Var2, jp8Var3, list);
    }

    public final void y0(int i, int i2, boolean z, int i3) {
        boolean z2 = z && i != -1;
        if (i == -1) {
            i3 = 2;
        } else if (i3 == 2) {
            i3 = 1;
        }
        if (i == 0) {
            i2 = 1;
        } else if (i2 == 1) {
            i2 = 0;
        }
        ta6 ta6Var = this.G;
        if (ta6Var.l == z2 && ta6Var.n == i2 && ta6Var.m == i3) {
            return;
        }
        this.G = ta6Var.e(i3, i2, z2);
        B0(false, false);
        cq4 cq4Var = this.s;
        for (aq4 aq4Var = cq4Var.i; aq4Var != null; aq4Var = aq4Var.m) {
            for (p62 p62Var : (p62[]) aq4Var.o.d) {
                if (p62Var != null) {
                    p62Var.f(z2);
                }
            }
        }
        if (!q0()) {
            u0();
            z0();
            ta6 ta6Var2 = this.G;
            if (ta6Var2.p) {
                this.G = ta6Var2.i(false);
            }
            cq4Var.n(this.V);
            return;
        }
        int i4 = this.G.e;
        wd8 wd8Var = this.h;
        if (i4 != 3) {
            if (i4 == 2) {
                wd8Var.e(2);
            }
        } else {
            ag1 ag1Var = this.o;
            ag1Var.b = true;
            ((i48) ag1Var.c).b();
            s0();
            wd8Var.e(2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ce  */
    /* JADX WARN: Type inference failed for: r2v21, types: [java.lang.Object, zp4] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z0() {
        /*
            Method dump skipped, instruction units count: 728
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n62.z0():void");
    }
}
