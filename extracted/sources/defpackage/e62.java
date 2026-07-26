package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.ExoTimeoutException;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public final class e62 extends o80 implements ExoPlayer {
    public final ry A;
    public final pv1 B;
    public final pv1 C;
    public final long D;
    public final yb E;
    public int F;
    public boolean G;
    public int H;
    public int I;
    public boolean J;
    public boolean K;
    public ImmutableSet L;
    public final gh7 M;
    public nv7 N;
    public cb6 O;
    public qp4 P;
    public qp4 Q;
    public Object R;
    public Surface S;
    public SurfaceHolder T;
    public SphericalGLSurfaceView U;
    public boolean V;
    public TextureView W;
    public final int X;
    public cy7 Y;
    public ly Z;
    public float a0;
    public final jp8 b;
    public boolean b0;
    public final cb6 c;
    public m81 c0;
    public final b11 d = new b11();
    public final boolean d0;
    public final Context e;
    public boolean e0;
    public final e62 f;
    public final int f0;
    public final v80[] g;
    public boolean g0;
    public final v80[] h;
    public final wl1 h0;
    public final fi4 i;
    public w59 i0;
    public final wd8 j;
    public qp4 j0;
    public final v52 k;
    public ta6 k0;
    public final n62 l;
    public int l0;
    public final t94 m;
    public long m0;
    public final CopyOnWriteArraySet n;
    public final yl8 o;
    public final ArrayList p;
    public final boolean q;
    public final js4 r;
    public final hd1 s;
    public final Looper t;
    public final j50 u;
    public final long v;
    public final long w;
    public final long x;
    public final b62 y;
    public final c62 z;

    static {
        lp4.a("media3.exoplayer");
    }

    public e62(n52 n52Var) throws Throwable {
        e62 e62Var;
        Context context;
        td8 td8Var;
        int i;
        e62 e62Var2;
        int i2 = 0;
        try {
            wn5.Q("Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.8.0] [" + j29.a + "]");
            context = n52Var.a;
            td8Var = n52Var.b;
            this.e = context.getApplicationContext();
            this.s = (hd1) n52Var.h.apply(td8Var);
            this.f0 = n52Var.j;
            this.Z = n52Var.k;
            this.X = n52Var.l;
            this.b0 = false;
            this.D = n52Var.u;
            b62 b62Var = new b62(this);
            this.y = b62Var;
            this.z = new c62();
            v80[] v80VarArrA = ((qg1) n52Var.c.get()).a(new Handler(n52Var.i), b62Var, b62Var, b62Var, b62Var);
            this.g = v80VarArrA;
            vy2.s(v80VarArrA.length > 0);
            this.h = new v80[v80VarArrA.length];
            i = 0;
        } catch (Throwable th) {
            th = th;
            e62Var = this;
        }
        while (true) {
            v80[] v80VarArr = this.h;
            if (i >= v80VarArr.length) {
                break;
            }
            int i3 = this.g[i].b;
            v80VarArr[i] = null;
            i++;
            e62Var.d.d();
            throw th;
        }
        fi4 fi4Var = (fi4) n52Var.e.get();
        this.i = fi4Var;
        this.r = (js4) n52Var.d.get();
        j50 j50Var = (j50) n52Var.g.get();
        this.u = j50Var;
        this.q = n52Var.m;
        ll7 ll7Var = n52Var.n;
        this.v = n52Var.p;
        this.w = n52Var.q;
        this.x = n52Var.r;
        this.M = n52Var.o;
        Looper looper = n52Var.i;
        this.t = looper;
        this.f = this;
        this.m = new t94(looper, td8Var, new v52(this, i2));
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        this.n = copyOnWriteArraySet;
        this.p = new ArrayList();
        this.N = new nv7();
        v80[] v80VarArr2 = this.g;
        jp8 jp8Var = new jp8(new x37[v80VarArr2.length], new p62[v80VarArr2.length], rp8.b, null);
        this.b = jp8Var;
        this.o = new yl8();
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32};
        int length = iArr.length;
        int i4 = 0;
        while (i4 < length) {
            int i5 = iArr[i4];
            vy2.s(!false);
            sparseBooleanArray.append(i5, true);
            i4++;
            j50Var = j50Var;
        }
        j50 j50Var2 = j50Var;
        fi4Var.getClass();
        vy2.s(!false);
        sparseBooleanArray.append(29, true);
        vy2.s(!false);
        vd2 vd2Var = new vd2(sparseBooleanArray);
        this.c = new cb6(vd2Var);
        SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
        for (int i6 = 0; i6 < vd2Var.a.size(); i6++) {
            int iB = vd2Var.b(i6);
            vy2.s(!false);
            sparseBooleanArray2.append(iB, true);
        }
        vy2.s(!false);
        sparseBooleanArray2.append(4, true);
        vy2.s(!false);
        sparseBooleanArray2.append(10, true);
        vy2.s(!false);
        this.O = new cb6(new vd2(sparseBooleanArray2));
        this.j = td8Var.a(looper, null);
        v52 v52Var = new v52(this, 1);
        this.k = v52Var;
        this.k0 = ta6.k(jp8Var);
        this.s.c0(this, looper);
        ee6 ee6Var = new ee6(n52Var.x);
        n62 n62Var = new n62(this.e, this.g, this.h, fi4Var, jp8Var, (yf1) n52Var.f.get(), j50Var2, this.F, this.G, this.s, ll7Var, n52Var.s, n52Var.t, looper, td8Var, v52Var, ee6Var, this.z);
        wd8 wd8Var = n62Var.h;
        this.l = n62Var;
        Looper looper2 = n62Var.j;
        this.a0 = 1.0f;
        this.F = 0;
        qp4 qp4Var = qp4.K;
        this.P = qp4Var;
        this.Q = qp4Var;
        this.j0 = qp4Var;
        this.l0 = -1;
        this.c0 = m81.d;
        this.d0 = true;
        n(this.s);
        Handler handler = new Handler(looper);
        hd1 hd1Var = this.s;
        td1 td1Var = (td1) j50Var2;
        td1Var.getClass();
        hd1Var.getClass();
        i50 i50Var = td1Var.c;
        i50Var.getClass();
        CopyOnWriteArrayList<h50> copyOnWriteArrayList = i50Var.a;
        for (h50 h50Var : copyOnWriteArrayList) {
            if (h50Var.b == hd1Var) {
                h50Var.c = true;
                copyOnWriteArrayList.remove(h50Var);
            }
        }
        copyOnWriteArrayList.add(new h50(handler, hd1Var));
        copyOnWriteArraySet.add(this.y);
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                e62Var2 = this;
            } catch (Throwable th2) {
                th = th2;
                e62Var2 = this;
                e62Var = e62Var2;
            }
            try {
                td8Var.a(n62Var.j, null).c(new z52(this.e, n52Var.v, this, ee6Var, 0));
            } catch (Throwable th3) {
                th = th3;
                e62Var = e62Var2;
            }
        } else {
            e62Var2 = this;
        }
        v52 v52Var2 = new v52(e62Var2, 2);
        yb ybVar = new yb();
        ybVar.b = td8Var.a(looper2, null);
        ybVar.c = td8Var.a(looper, null);
        ybVar.e = 0;
        ybVar.f = 0;
        ybVar.d = v52Var2;
        e62Var2.E = ybVar;
        ybVar.u(new b7(23, e62Var2));
        e62Var = e62Var2;
        try {
            ry ryVar = new ry(n52Var.a, looper2, n52Var.i, e62Var2.y, td8Var);
            e62Var.A = ryVar;
            ryVar.r();
            e62Var.B = new pv1(context, looper2, td8Var, 6);
            e62Var.C = new pv1(context, looper2, td8Var, 7);
            e62Var.h0 = wl1.e;
            e62Var.i0 = w59.d;
            e62Var.Y = cy7.c;
            wd8Var.a(38, e62Var.M).b();
            ly lyVar = e62Var.Z;
            vd8 vd8VarB = wd8.b();
            vd8VarB.a = wd8Var.a.obtainMessage(31, 0, 0, lyVar);
            vd8VarB.b();
            e62Var.S0(1, 3, e62Var.Z);
            e62Var.S0(2, 4, Integer.valueOf(e62Var.X));
            e62Var.S0(2, 5, 0);
            e62Var.S0(1, 9, Boolean.valueOf(e62Var.b0));
            e62Var.S0(6, 8, e62Var.z);
            e62Var.S0(-1, 16, Integer.valueOf(e62Var.f0));
            e62Var.d.d();
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public static long H0(ta6 ta6Var) {
        am8 am8Var = new am8();
        yl8 yl8Var = new yl8();
        ta6Var.a.g(ta6Var.b.a, yl8Var);
        long j = ta6Var.c;
        return j == -9223372036854775807L ? ta6Var.a.m(yl8Var.c, am8Var, 0L).l : yl8Var.e + j;
    }

    public static ta6 I0(ta6 ta6Var, int i) {
        ta6 ta6VarH = ta6Var.h(i);
        return (i == 1 || i == 4) ? ta6VarH.b(false) : ta6VarH;
    }

    @Override // defpackage.gb6
    public final void A(List list, int i, long j) {
        c1();
        ArrayList arrayListA0 = A0(list);
        c1();
        U0(arrayListA0, i, j, false);
    }

    public final ArrayList A0(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(this.r.d((jp4) list.get(i)));
        }
        return arrayList;
    }

    @Override // defpackage.gb6
    public final PlaybackException B() {
        c1();
        return this.k0.f;
    }

    public final le6 B0(ke6 ke6Var) {
        int iF0 = F0(this.k0);
        bm8 bm8Var = this.k0.a;
        if (iF0 == -1) {
            iF0 = 0;
        }
        n62 n62Var = this.l;
        return new le6(n62Var, ke6Var, bm8Var, iF0, n62Var.j);
    }

    @Override // defpackage.gb6
    public final void C(boolean z) {
        c1();
        Z0(1, z);
    }

    public final long C0() {
        c1();
        if (!h()) {
            return W();
        }
        ta6 ta6Var = this.k0;
        return ta6Var.k.equals(ta6Var.b) ? j29.k0(this.k0.q) : getDuration();
    }

    @Override // defpackage.gb6
    public final long D() {
        c1();
        return this.w;
    }

    public final long D0(ta6 ta6Var) {
        ks4 ks4Var = ta6Var.b;
        long j = ta6Var.c;
        bm8 bm8Var = ta6Var.a;
        if (!ks4Var.b()) {
            return j29.k0(E0(ta6Var));
        }
        Object obj = ta6Var.b.a;
        yl8 yl8Var = this.o;
        bm8Var.g(obj, yl8Var);
        if (j == -9223372036854775807L) {
            return j29.k0(bm8Var.m(F0(ta6Var), this.a, 0L).l);
        }
        return j29.k0(j) + j29.k0(yl8Var.e);
    }

    public final long E0(ta6 ta6Var) {
        if (ta6Var.a.p()) {
            return j29.V(this.m0);
        }
        long jL = ta6Var.p ? ta6Var.l() : ta6Var.s;
        if (ta6Var.b.b()) {
            return jL;
        }
        bm8 bm8Var = ta6Var.a;
        Object obj = ta6Var.b.a;
        yl8 yl8Var = this.o;
        bm8Var.g(obj, yl8Var);
        return jL + yl8Var.e;
    }

    @Override // defpackage.gb6
    public final long F() {
        c1();
        return D0(this.k0);
    }

    public final int F0(ta6 ta6Var) {
        return ta6Var.a.p() ? this.l0 : ta6Var.a.g(ta6Var.b.a, this.o).c;
    }

    @Override // defpackage.gb6
    public final rp8 G() {
        c1();
        return (rp8) this.k0.i.e;
    }

    public final Pair G0(bm8 bm8Var, sg6 sg6Var, int i, long j) {
        if (bm8Var.p() || sg6Var.p()) {
            boolean z = !bm8Var.p() && sg6Var.p();
            return K0(sg6Var, z ? -1 : i, z ? -9223372036854775807L : j);
        }
        Pair pairI = bm8Var.i(this.a, this.o, i, j29.V(j));
        Object obj = pairI.first;
        if (sg6Var.b(obj) != -1) {
            return pairI;
        }
        int iT = n62.T(this.a, this.o, this.F, this.G, obj, bm8Var, sg6Var);
        if (iT == -1) {
            return K0(sg6Var, -1, -9223372036854775807L);
        }
        am8 am8Var = this.a;
        sg6Var.m(iT, am8Var, 0L);
        return K0(sg6Var, iT, j29.k0(am8Var.l));
    }

    @Override // defpackage.gb6
    public final m81 I() {
        c1();
        return this.c0;
    }

    public final ta6 J0(ta6 ta6Var, bm8 bm8Var, Pair pair) {
        vy2.j(bm8Var.p() || pair != null);
        bm8 bm8Var2 = ta6Var.a;
        long jD0 = D0(ta6Var);
        ta6 ta6VarJ = ta6Var.j(bm8Var);
        if (bm8Var.p()) {
            ks4 ks4Var = ta6.u;
            long jV = j29.V(this.m0);
            ta6 ta6VarC = ta6VarJ.d(ks4Var, jV, jV, jV, 0L, zo8.d, this.b, ImmutableList.q()).c(ks4Var);
            ta6VarC.q = ta6VarC.s;
            return ta6VarC;
        }
        Object obj = ta6VarJ.b.a;
        String str = j29.a;
        boolean zEquals = obj.equals(pair.first);
        ks4 ks4Var2 = !zEquals ? new ks4(pair.first) : ta6VarJ.b;
        long jLongValue = ((Long) pair.second).longValue();
        long jV2 = j29.V(jD0);
        if (!bm8Var2.p()) {
            jV2 -= bm8Var2.g(obj, this.o).e;
        }
        if (!zEquals || jLongValue < jV2) {
            ks4 ks4Var3 = ks4Var2;
            vy2.s(!ks4Var3.b());
            ta6 ta6VarC2 = ta6VarJ.d(ks4Var3, jLongValue, jLongValue, jLongValue, 0L, !zEquals ? zo8.d : ta6VarJ.h, !zEquals ? this.b : ta6VarJ.i, !zEquals ? ImmutableList.q() : ta6VarJ.j).c(ks4Var3);
            ta6VarC2.q = jLongValue;
            return ta6VarC2;
        }
        if (jLongValue != jV2) {
            ks4 ks4Var4 = ks4Var2;
            vy2.s(!ks4Var4.b());
            long jMax = Math.max(0L, ta6VarJ.r - (jLongValue - jV2));
            long j = ta6VarJ.q;
            if (ta6VarJ.k.equals(ta6VarJ.b)) {
                j = jLongValue + jMax;
            }
            ta6 ta6VarD = ta6VarJ.d(ks4Var4, jLongValue, jLongValue, jLongValue, jMax, ta6VarJ.h, ta6VarJ.i, ta6VarJ.j);
            ta6VarD.q = j;
            return ta6VarD;
        }
        int iB = bm8Var.b(ta6VarJ.k.a);
        if (iB != -1 && bm8Var.f(iB, this.o, false).c == bm8Var.g(ks4Var2.a, this.o).c) {
            return ta6VarJ;
        }
        bm8Var.g(ks4Var2.a, this.o);
        long jA = ks4Var2.b() ? this.o.a(ks4Var2.b, ks4Var2.c) : this.o.d;
        ks4 ks4Var5 = ks4Var2;
        ta6 ta6VarC3 = ta6VarJ.d(ks4Var5, ta6VarJ.s, ta6VarJ.s, ta6VarJ.d, jA - ta6VarJ.s, ta6VarJ.h, ta6VarJ.i, ta6VarJ.j).c(ks4Var5);
        ta6VarC3.q = jA;
        return ta6VarC3;
    }

    public final Pair K0(bm8 bm8Var, int i, long j) {
        if (bm8Var.p()) {
            this.l0 = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.m0 = j;
            return null;
        }
        if (i == -1 || i >= bm8Var.o()) {
            i = bm8Var.a(this.G);
            j = j29.k0(bm8Var.m(i, this.a, 0L).l);
        }
        return bm8Var.i(this.a, this.o, i, j29.V(j));
    }

    @Override // defpackage.gb6
    public final int L() {
        c1();
        if (h()) {
            return this.k0.b.b;
        }
        return -1;
    }

    public final void L0(int i, int i2) {
        cy7 cy7Var = this.Y;
        if (i == cy7Var.a && i2 == cy7Var.b) {
            return;
        }
        this.Y = new cy7(i, i2);
        this.m.f(24, new t52(i, i2, 0));
        S0(2, 14, new cy7(i, i2));
    }

    @Override // defpackage.gb6
    public final int M() {
        c1();
        int iF0 = F0(this.k0);
        if (iF0 == -1) {
            return 0;
        }
        return iF0;
    }

    public final void M0(int i, int i2, int i3) {
        c1();
        vy2.j(i >= 0 && i <= i2 && i3 >= 0);
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        int iMin = Math.min(i2, size);
        int iMin2 = Math.min(i3, size - (iMin - i));
        if (i >= size || i == iMin || i == iMin2) {
            return;
        }
        bm8 bm8VarS = S();
        this.H++;
        j29.U(i, iMin, iMin2, arrayList);
        nv7 nv7Var = this.N;
        nv7Var.getClass();
        this.N = nv7Var;
        sg6 sg6Var = new sg6(arrayList, this.N);
        ta6 ta6Var = this.k0;
        ta6 ta6VarJ0 = J0(ta6Var, sg6Var, G0(bm8VarS, sg6Var, F0(ta6Var), D0(this.k0)));
        nv7 nv7Var2 = this.N;
        n62 n62Var = this.l;
        n62Var.getClass();
        n62Var.h.a(19, new j62(i, iMin, iMin2, nv7Var2)).b();
        a1(ta6VarJ0, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // defpackage.gb6
    public final void N(int i) {
        c1();
        if (this.F != i) {
            this.F = i;
            wd8 wd8Var = this.l.h;
            wd8Var.getClass();
            vd8 vd8VarB = wd8.b();
            vd8VarB.a = wd8Var.a.obtainMessage(11, i, 0);
            vd8VarB.b();
            u52 u52Var = new u52(i, 0);
            t94 t94Var = this.m;
            t94Var.c(8, u52Var);
            Y0();
            t94Var.b();
        }
    }

    public final void N0(int i, int i2) {
        c1();
        vy2.j(i >= 0 && i2 >= i);
        int size = this.p.size();
        int iMin = Math.min(i2, size);
        if (i >= size || i == iMin) {
            return;
        }
        ta6 ta6VarO0 = O0(this.k0, i, iMin);
        a1(ta6VarO0, 0, !ta6VarO0.b.a.equals(this.k0.b.a), 4, E0(ta6VarO0), -1, false);
    }

    @Override // defpackage.gb6
    public final void O(eb6 eb6Var) {
        c1();
        eb6Var.getClass();
        this.m.e(eb6Var);
    }

    public final ta6 O0(ta6 ta6Var, int i, int i2) {
        int iF0 = F0(ta6Var);
        long jD0 = D0(ta6Var);
        bm8 bm8Var = ta6Var.a;
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        this.H++;
        P0(i, i2);
        sg6 sg6Var = new sg6(arrayList, this.N);
        ta6 ta6VarJ0 = J0(ta6Var, sg6Var, G0(bm8Var, sg6Var, iF0, jD0));
        int i3 = ta6VarJ0.e;
        if (i3 != 1 && i3 != 4 && i < i2 && i2 == size && iF0 >= ta6VarJ0.a.o()) {
            ta6VarJ0 = I0(ta6VarJ0, 4);
        }
        nv7 nv7Var = this.N;
        wd8 wd8Var = this.l.h;
        wd8Var.getClass();
        vd8 vd8VarB = wd8.b();
        vd8VarB.a = wd8Var.a.obtainMessage(20, i, i2, nv7Var);
        vd8VarB.b();
        return ta6VarJ0;
    }

    public final void P0(int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            this.p.remove(i3);
        }
        nv7 nv7Var = this.N;
        int i4 = i2 - i;
        int[] iArr = nv7Var.b;
        int[] iArr2 = new int[iArr.length - i4];
        int i5 = 0;
        for (int i6 = 0; i6 < iArr.length; i6++) {
            int i7 = iArr[i6];
            if (i7 < i || i7 >= i2) {
                int i8 = i6 - i5;
                if (i7 >= i) {
                    i7 -= i4;
                }
                iArr2[i8] = i7;
            } else {
                i5++;
            }
        }
        this.N = new nv7(iArr2, new Random(nv7Var.a.nextLong()));
    }

    @Override // defpackage.gb6
    public final void Q(SurfaceView surfaceView) {
        c1();
        SurfaceHolder holder = surfaceView == null ? null : surfaceView.getHolder();
        c1();
        if (holder == null || holder != this.T) {
            return;
        }
        z0();
    }

    public final void Q0() {
        SphericalGLSurfaceView sphericalGLSurfaceView = this.U;
        b62 b62Var = this.y;
        if (sphericalGLSurfaceView != null) {
            le6 le6VarB0 = B0(this.z);
            vy2.s(!le6VarB0.f);
            le6VarB0.c = 10000;
            vy2.s(!le6VarB0.f);
            le6VarB0.d = null;
            le6VarB0.b();
            this.U.a.remove(b62Var);
            this.U = null;
        }
        TextureView textureView = this.W;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != b62Var) {
                wn5.k0("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.W.setSurfaceTextureListener(null);
            }
            this.W = null;
        }
        SurfaceHolder surfaceHolder = this.T;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(b62Var);
            this.T = null;
        }
    }

    @Override // defpackage.gb6
    public final int R() {
        c1();
        return this.k0.n;
    }

    public final void R0(int i, int i2, List list) {
        c1();
        vy2.j(i >= 0 && i2 >= i);
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        if (i > size) {
            return;
        }
        int iMin = Math.min(i2, size);
        if (iMin - i == list.size()) {
            for (int i3 = i; i3 < iMin; i3++) {
                if (((d62) arrayList.get(i3)).b.k.a((jp4) list.get(i3 - i))) {
                }
            }
            this.H++;
            wd8 wd8Var = this.l.h;
            wd8Var.getClass();
            vd8 vd8VarB = wd8.b();
            vd8VarB.a = wd8Var.a.obtainMessage(27, i, iMin, list);
            vd8VarB.b();
            for (int i4 = i; i4 < iMin; i4++) {
                d62 d62Var = (d62) arrayList.get(i4);
                d62Var.c = new rg6(d62Var.c, (jp4) list.get(i4 - i));
            }
            a1(this.k0.j(new sg6(arrayList, this.N)), 0, false, 4, -9223372036854775807L, -1, false);
            return;
        }
        ArrayList arrayListA0 = A0(list);
        if (!arrayList.isEmpty()) {
            ta6 ta6VarO0 = O0(x0(this.k0, iMin, arrayListA0), i, iMin);
            a1(ta6VarO0, 0, !ta6VarO0.b.a.equals(this.k0.b.a), 4, E0(ta6VarO0), -1, false);
        } else {
            boolean z = this.l0 == -1;
            c1();
            U0(arrayListA0, -1, -9223372036854775807L, z);
        }
    }

    @Override // defpackage.gb6
    public final bm8 S() {
        c1();
        return this.k0.a;
    }

    public final void S0(int i, int i2, Object obj) {
        for (v80 v80Var : this.g) {
            if (i == -1 || v80Var.b == i) {
                le6 le6VarB0 = B0(v80Var);
                vy2.s(!le6VarB0.f);
                le6VarB0.c = i2;
                vy2.s(!le6VarB0.f);
                le6VarB0.d = obj;
                le6VarB0.b();
            }
        }
        for (v80 v80Var2 : this.h) {
            if (v80Var2 != null && (i == -1 || v80Var2.b == i)) {
                le6 le6VarB02 = B0(v80Var2);
                vy2.s(!le6VarB02.f);
                le6VarB02.c = i2;
                vy2.s(!le6VarB02.f);
                le6VarB02.d = obj;
                le6VarB02.b();
            }
        }
    }

    public final void T0(ly lyVar, boolean z) {
        c1();
        if (this.g0) {
            return;
        }
        boolean zEquals = Objects.equals(this.Z, lyVar);
        t94 t94Var = this.m;
        if (!zEquals) {
            this.Z = lyVar;
            S0(1, 3, lyVar);
            t94Var.c(20, new v4(19, lyVar));
        }
        ly lyVar2 = this.Z;
        wd8 wd8Var = this.l.h;
        wd8Var.getClass();
        vd8 vd8VarB = wd8.b();
        vd8VarB.a = wd8Var.a.obtainMessage(31, z ? 1 : 0, 0, lyVar2);
        vd8VarB.b();
        t94Var.b();
    }

    @Override // defpackage.gb6
    public final boolean U() {
        c1();
        return this.G;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void U0(java.util.List r16, int r17, long r18, boolean r20) {
        /*
            r15 = this;
            r1 = r17
            ta6 r2 = r15.k0
            int r2 = r15.F0(r2)
            long r3 = r15.d0()
            int r5 = r15.H
            r6 = 1
            int r5 = r5 + r6
            r15.H = r5
            java.util.ArrayList r5 = r15.p
            boolean r7 = r5.isEmpty()
            r8 = 0
            if (r7 != 0) goto L22
            int r7 = r5.size()
            r15.P0(r8, r7)
        L22:
            r7 = r16
            java.util.ArrayList r10 = r15.w0(r8, r7)
            sg6 r7 = new sg6
            nv7 r9 = r15.N
            r7.<init>(r5, r9)
            boolean r5 = r7.p()
            int r9 = r7.g
            if (r5 != 0) goto L40
            if (r1 >= r9) goto L3a
            goto L40
        L3a:
            androidx.media3.common.IllegalSeekPositionException r1 = new androidx.media3.common.IllegalSeekPositionException
            r1.<init>()
            throw r1
        L40:
            r5 = -1
            if (r20 == 0) goto L50
            boolean r1 = r15.G
            int r1 = r7.a(r1)
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L4e:
            r12 = r1
            goto L58
        L50:
            if (r1 != r5) goto L55
            r12 = r2
            r2 = r3
            goto L58
        L55:
            r2 = r18
            goto L4e
        L58:
            ta6 r1 = r15.k0
            android.util.Pair r4 = r15.K0(r7, r12, r2)
            ta6 r1 = r15.J0(r1, r7, r4)
            int r4 = r1.e
            if (r12 == r5) goto L74
            if (r4 == r6) goto L74
            boolean r4 = r7.p()
            if (r4 != 0) goto L73
            if (r12 < r9) goto L71
            goto L73
        L71:
            r4 = 2
            goto L74
        L73:
            r4 = 4
        L74:
            ta6 r1 = I0(r1, r4)
            long r13 = defpackage.j29.V(r2)
            nv7 r11 = r15.N
            n62 r2 = r15.l
            wd8 r2 = r2.h
            i62 r9 = new i62
            r9.<init>(r10, r11, r12, r13)
            r3 = 17
            vd8 r2 = r2.a(r3, r9)
            r2.b()
            ta6 r2 = r15.k0
            ks4 r2 = r2.b
            java.lang.Object r2 = r2.a
            ks4 r3 = r1.b
            java.lang.Object r3 = r3.a
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto Lac
            ta6 r2 = r15.k0
            bm8 r2 = r2.a
            boolean r2 = r2.p()
            if (r2 != 0) goto Lac
            r3 = r6
            goto Lad
        Lac:
            r3 = r8
        Lad:
            long r5 = r15.E0(r1)
            r7 = -1
            r8 = 0
            r2 = 0
            r4 = 4
            r0 = r15
            r0.a1(r1, r2, r3, r4, r5, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e62.U0(java.util.List, int, long, boolean):void");
    }

    @Override // defpackage.gb6
    public final hp8 V() {
        c1();
        vh1 vh1VarE = ((ci1) this.i).e();
        if (!this.K) {
            return vh1VarE;
        }
        vh1VarE.getClass();
        uh1 uh1Var = new uh1(vh1VarE);
        uh1Var.n(this.L);
        return new vh1(uh1Var);
    }

    public final void V0(SurfaceHolder surfaceHolder) {
        this.V = false;
        this.T = surfaceHolder;
        surfaceHolder.addCallback(this.y);
        Surface surface = this.T.getSurface();
        if (surface == null || !surface.isValid()) {
            L0(0, 0);
        } else {
            Rect surfaceFrame = this.T.getSurfaceFrame();
            L0(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    @Override // defpackage.gb6
    public final long W() {
        c1();
        if (this.k0.a.p()) {
            return this.m0;
        }
        ta6 ta6Var = this.k0;
        if (ta6Var.k.d != ta6Var.b.d) {
            return j29.k0(ta6Var.a.m(M(), this.a, 0L).m);
        }
        long j = ta6Var.q;
        if (this.k0.k.b()) {
            ta6 ta6Var2 = this.k0;
            yl8 yl8VarG = ta6Var2.a.g(ta6Var2.k.a, this.o);
            long jD = yl8VarG.d(this.k0.k.b);
            j = jD == Long.MIN_VALUE ? yl8VarG.d : jD;
        }
        ta6 ta6Var3 = this.k0;
        bm8 bm8Var = ta6Var3.a;
        Object obj = ta6Var3.k.a;
        yl8 yl8Var = this.o;
        bm8Var.g(obj, yl8Var);
        return j29.k0(j + yl8Var.e);
    }

    public final void W0(Object obj) {
        Object obj2 = this.R;
        boolean zC = true;
        boolean z = (obj2 == null || obj2 == obj) ? false : true;
        long j = z ? this.D : -9223372036854775807L;
        n62 n62Var = this.l;
        if (!n62Var.I && n62Var.j.getThread().isAlive()) {
            b11 b11Var = new b11(n62Var.q);
            n62Var.h.a(30, new Pair(obj, b11Var)).b();
            if (j != -9223372036854775807L) {
                zC = b11Var.c(j);
            }
        }
        if (z) {
            Object obj3 = this.R;
            Surface surface = this.S;
            if (obj3 == surface) {
                surface.release();
                this.S = null;
            }
        }
        this.R = obj;
        if (zC) {
            return;
        }
        X0(new ExoPlaybackException(2, new ExoTimeoutException("Detaching surface timed out."), 1003));
    }

    public final void X0(ExoPlaybackException exoPlaybackException) {
        ta6 ta6Var = this.k0;
        ta6 ta6VarC = ta6Var.c(ta6Var.b);
        ta6VarC.q = ta6VarC.s;
        ta6VarC.r = 0L;
        ta6 ta6VarI0 = I0(ta6VarC, 1);
        if (exoPlaybackException != null) {
            ta6VarI0 = ta6VarI0.f(exoPlaybackException);
        }
        ta6 ta6Var2 = ta6VarI0;
        this.H++;
        wd8 wd8Var = this.l.h;
        wd8Var.getClass();
        vd8 vd8VarB = wd8.b();
        vd8VarB.a = wd8Var.a.obtainMessage(6);
        vd8VarB.b();
        a1(ta6Var2, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final void Y0() {
        cb6 cb6Var = this.O;
        String str = j29.a;
        e62 e62Var = this.f;
        boolean zH = e62Var.h();
        boolean zO0 = e62Var.o0();
        boolean zK0 = e62Var.k0();
        boolean zJ0 = e62Var.j0();
        boolean zN0 = e62Var.n0();
        boolean zM0 = e62Var.m0();
        boolean zP = e62Var.S().p();
        ql4 ql4Var = new ql4(1);
        ((xe1) ql4Var.b).b(this.c.a);
        boolean z = !zH;
        ql4Var.v(4, z);
        ql4Var.v(5, zO0 && !zH);
        ql4Var.v(6, zK0 && !zH);
        ql4Var.v(7, !zP && (zK0 || !zN0 || zO0) && !zH);
        ql4Var.v(8, zJ0 && !zH);
        ql4Var.v(9, !zP && (zJ0 || (zN0 && zM0)) && !zH);
        ql4Var.v(10, z);
        ql4Var.v(11, zO0 && !zH);
        ql4Var.v(12, zO0 && !zH);
        cb6 cb6VarW = ql4Var.w();
        this.O = cb6VarW;
        if (cb6VarW.equals(cb6Var)) {
            return;
        }
        this.m.c(13, new v52(this, 3));
    }

    @Override // defpackage.gb6
    public final void Z(TextureView textureView) {
        c1();
        if (textureView == null) {
            z0();
            return;
        }
        Q0();
        this.W = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            wn5.k0("ExoPlayerImpl", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.y);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            W0(null);
            L0(0, 0);
        } else {
            Surface surface = new Surface(surfaceTexture);
            W0(surface);
            this.S = surface;
            L0(textureView.getWidth(), textureView.getHeight());
        }
    }

    public final void Z0(int i, boolean z) {
        int i2 = this.K ? 4 : (this.k0.n != 1 || z) ? 0 : 1;
        ta6 ta6VarA = this.k0;
        if (ta6VarA.l == z && ta6VarA.n == i2 && ta6VarA.m == i) {
            return;
        }
        this.H++;
        if (ta6VarA.p) {
            ta6VarA = ta6VarA.a();
        }
        ta6 ta6VarE = ta6VarA.e(i, i2, z);
        int i3 = i | (i2 << 4);
        wd8 wd8Var = this.l.h;
        wd8Var.getClass();
        vd8 vd8VarB = wd8.b();
        vd8VarB.a = wd8Var.a.obtainMessage(1, z ? 1 : 0, i3);
        vd8VarB.b();
        a1(ta6VarE, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // defpackage.gb6
    public final void a() {
        boolean zC;
        wn5.Q("Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.8.0] [" + j29.a + "] [" + lp4.b() + "]");
        c1();
        this.A.r();
        this.B.c(false);
        this.C.c(false);
        n62 n62Var = this.l;
        if (n62Var.I || !n62Var.j.getThread().isAlive()) {
            zC = true;
        } else {
            n62Var.I = true;
            b11 b11Var = new b11(n62Var.q);
            n62Var.h.a(7, b11Var).b();
            zC = b11Var.c(n62Var.v);
        }
        if (!zC) {
            this.m.f(10, new vv1(11));
        }
        this.m.d();
        this.j.a.removeCallbacksAndMessages(null);
        j50 j50Var = this.u;
        hd1 hd1Var = this.s;
        CopyOnWriteArrayList<h50> copyOnWriteArrayList = ((td1) j50Var).c.a;
        for (h50 h50Var : copyOnWriteArrayList) {
            if (h50Var.b == hd1Var) {
                h50Var.c = true;
                copyOnWriteArrayList.remove(h50Var);
            }
        }
        ta6 ta6Var = this.k0;
        if (ta6Var.p) {
            this.k0 = ta6Var.a();
        }
        ta6 ta6VarI0 = I0(this.k0, 1);
        this.k0 = ta6VarI0;
        ta6 ta6VarC = ta6VarI0.c(ta6VarI0.b);
        this.k0 = ta6VarC;
        ta6VarC.q = ta6VarC.s;
        this.k0.r = 0L;
        hd1 hd1Var2 = this.s;
        wd8 wd8Var = hd1Var2.h;
        vy2.t(wd8Var);
        wd8Var.c(new b7(12, hd1Var2));
        Q0();
        Surface surface = this.S;
        if (surface != null) {
            surface.release();
            this.S = null;
        }
        this.c0 = m81.d;
        this.g0 = true;
    }

    public final void a1(final ta6 ta6Var, int i, boolean z, int i2, long j, int i3, boolean z2) {
        Pair pair;
        int i4;
        jp4 jp4Var;
        boolean z3;
        boolean z4;
        boolean z5;
        int i5;
        Object obj;
        jp4 jp4Var2;
        Object obj2;
        int i6;
        long j2;
        long j3;
        long jH0;
        long jH02;
        Object obj3;
        jp4 jp4Var3;
        Object obj4;
        int i7;
        ta6 ta6Var2 = this.k0;
        this.k0 = ta6Var;
        boolean zEquals = ta6Var2.a.equals(ta6Var.a);
        am8 am8Var = this.a;
        yl8 yl8Var = this.o;
        bm8 bm8Var = ta6Var2.a;
        ks4 ks4Var = ta6Var2.b;
        bm8 bm8Var2 = ta6Var.a;
        ks4 ks4Var2 = ta6Var.b;
        if (bm8Var2.p() && bm8Var.p()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (bm8Var2.p() != bm8Var.p()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else if (bm8Var.m(bm8Var.g(ks4Var.a, yl8Var).c, am8Var, 0L).a.equals(bm8Var2.m(bm8Var2.g(ks4Var2.a, yl8Var).c, am8Var, 0L).a)) {
            pair = (z && i2 == 0 && ks4Var.d < ks4Var2.d) ? new Pair(Boolean.TRUE, 0) : (z && i2 == 1 && z2) ? new Pair(Boolean.TRUE, 2) : new Pair(Boolean.FALSE, -1);
        } else {
            if (z && i2 == 0) {
                i4 = 1;
            } else if (z && i2 == 1) {
                i4 = 2;
            } else {
                if (zEquals) {
                    throw new IllegalStateException();
                }
                i4 = 3;
            }
            pair = new Pair(Boolean.TRUE, Integer.valueOf(i4));
        }
        boolean zBooleanValue = ((Boolean) pair.first).booleanValue();
        int iIntValue = ((Integer) pair.second).intValue();
        if (zBooleanValue) {
            jp4Var = !ta6Var.a.p() ? ta6Var.a.m(ta6Var.a.g(ta6Var.b.a, this.o).c, this.a, 0L).c : null;
            this.j0 = qp4.K;
        } else {
            jp4Var = null;
        }
        if (zBooleanValue || !ta6Var2.j.equals(ta6Var.j)) {
            pp4 pp4VarA = this.j0.a();
            List list = ta6Var.j;
            for (int i8 = 0; i8 < list.size(); i8++) {
                jv4 jv4Var = (jv4) list.get(i8);
                int i9 = 0;
                while (true) {
                    iv4[] iv4VarArr = jv4Var.a;
                    if (i9 < iv4VarArr.length) {
                        iv4VarArr[i9].b(pp4VarA);
                        i9++;
                    }
                }
            }
            this.j0 = new qp4(pp4VarA);
        }
        qp4 qp4VarY0 = y0();
        boolean zEquals2 = qp4VarY0.equals(this.P);
        this.P = qp4VarY0;
        boolean z6 = ta6Var2.l != ta6Var.l;
        boolean z7 = ta6Var2.e != ta6Var.e;
        if (z7 || z6) {
            b1();
        }
        boolean z8 = ta6Var2.g != ta6Var.g;
        if (!zEquals) {
            this.m.c(0, new p52(i, 0, ta6Var));
        }
        if (z) {
            yl8 yl8Var2 = new yl8();
            if (ta6Var2.a.p()) {
                z3 = zBooleanValue;
                z4 = zEquals2;
                z5 = z7;
                i5 = i3;
                obj = null;
                jp4Var2 = null;
                obj2 = null;
                i6 = -1;
            } else {
                Object obj5 = ta6Var2.b.a;
                ta6Var2.a.g(obj5, yl8Var2);
                int i10 = yl8Var2.c;
                int iB = ta6Var2.a.b(obj5);
                z3 = zBooleanValue;
                z4 = zEquals2;
                z5 = z7;
                obj = ta6Var2.a.m(i10, this.a, 0L).a;
                jp4Var2 = this.a.c;
                obj2 = obj5;
                i5 = i10;
                i6 = iB;
            }
            if (i2 == 0) {
                if (ta6Var2.b.b()) {
                    ks4 ks4Var3 = ta6Var2.b;
                    jH0 = yl8Var2.a(ks4Var3.b, ks4Var3.c);
                    jH02 = H0(ta6Var2);
                } else if (ta6Var2.b.e != -1) {
                    jH0 = H0(this.k0);
                    jH02 = jH0;
                } else {
                    j2 = yl8Var2.e;
                    j3 = yl8Var2.d;
                    jH0 = j2 + j3;
                    jH02 = jH0;
                }
            } else if (ta6Var2.b.b()) {
                jH0 = ta6Var2.s;
                jH02 = H0(ta6Var2);
            } else {
                j2 = yl8Var2.e;
                j3 = ta6Var2.s;
                jH0 = j2 + j3;
                jH02 = jH0;
            }
            long jK0 = j29.k0(jH0);
            long jK02 = j29.k0(jH02);
            ks4 ks4Var4 = ta6Var2.b;
            fb6 fb6Var = new fb6(obj, i5, jp4Var2, obj2, i6, jK0, jK02, ks4Var4.b, ks4Var4.c);
            am8 am8Var2 = this.a;
            int iM = M();
            if (this.k0.a.p()) {
                obj3 = null;
                jp4Var3 = null;
                obj4 = null;
                i7 = -1;
            } else {
                ta6 ta6Var3 = this.k0;
                Object obj6 = ta6Var3.b.a;
                ta6Var3.a.g(obj6, this.o);
                int iB2 = this.k0.a.b(obj6);
                Object obj7 = this.k0.a.m(iM, am8Var2, 0L).a;
                jp4Var3 = am8Var2.c;
                i7 = iB2;
                obj4 = obj6;
                obj3 = obj7;
            }
            long jK03 = j29.k0(j);
            long jK04 = this.k0.b.b() ? j29.k0(H0(this.k0)) : jK03;
            ks4 ks4Var5 = this.k0.b;
            this.m.c(11, new y52(i2, fb6Var, new fb6(obj3, iM, jp4Var3, obj4, i7, jK03, jK04, ks4Var5.b, ks4Var5.c)));
        } else {
            z3 = zBooleanValue;
            z4 = zEquals2;
            z5 = z7;
        }
        if (z3) {
            this.m.c(1, new p52(iIntValue, 1, jp4Var));
        }
        if (ta6Var2.f != ta6Var.f) {
            final int i11 = 7;
            this.m.c(10, new q94() { // from class: r52
                @Override // defpackage.q94
                public final void invoke(Object obj8) {
                    eb6 eb6Var = (eb6) obj8;
                    switch (i11) {
                        case 0:
                            ta6 ta6Var4 = ta6Var;
                            eb6Var.d(ta6Var4.g);
                            eb6Var.l(ta6Var4.g);
                            break;
                        case 1:
                            ta6 ta6Var5 = ta6Var;
                            eb6Var.K(ta6Var5.e, ta6Var5.l);
                            break;
                        case 2:
                            eb6Var.r(ta6Var.e);
                            break;
                        case 3:
                            ta6 ta6Var6 = ta6Var;
                            eb6Var.m(ta6Var6.m, ta6Var6.l);
                            break;
                        case 4:
                            eb6Var.c(ta6Var.n);
                            break;
                        case 5:
                            eb6Var.V(ta6Var.m());
                            break;
                        case 6:
                            eb6Var.M(ta6Var.o);
                            break;
                        case 7:
                            eb6Var.O(ta6Var.f);
                            break;
                        case 8:
                            eb6Var.S(ta6Var.f);
                            break;
                        default:
                            eb6Var.x((rp8) ta6Var.i.e);
                            break;
                    }
                }
            });
            if (ta6Var.f != null) {
                final int i12 = 8;
                this.m.c(10, new q94() { // from class: r52
                    @Override // defpackage.q94
                    public final void invoke(Object obj8) {
                        eb6 eb6Var = (eb6) obj8;
                        switch (i12) {
                            case 0:
                                ta6 ta6Var4 = ta6Var;
                                eb6Var.d(ta6Var4.g);
                                eb6Var.l(ta6Var4.g);
                                break;
                            case 1:
                                ta6 ta6Var5 = ta6Var;
                                eb6Var.K(ta6Var5.e, ta6Var5.l);
                                break;
                            case 2:
                                eb6Var.r(ta6Var.e);
                                break;
                            case 3:
                                ta6 ta6Var6 = ta6Var;
                                eb6Var.m(ta6Var6.m, ta6Var6.l);
                                break;
                            case 4:
                                eb6Var.c(ta6Var.n);
                                break;
                            case 5:
                                eb6Var.V(ta6Var.m());
                                break;
                            case 6:
                                eb6Var.M(ta6Var.o);
                                break;
                            case 7:
                                eb6Var.O(ta6Var.f);
                                break;
                            case 8:
                                eb6Var.S(ta6Var.f);
                                break;
                            default:
                                eb6Var.x((rp8) ta6Var.i.e);
                                break;
                        }
                    }
                });
            }
        }
        jp8 jp8Var = ta6Var2.i;
        jp8 jp8Var2 = ta6Var.i;
        if (jp8Var != jp8Var2) {
            fi4 fi4Var = this.i;
            Object obj8 = jp8Var2.f;
            fi4Var.getClass();
            fi4Var.c = (ei4) obj8;
            final int i13 = 9;
            this.m.c(2, new q94() { // from class: r52
                @Override // defpackage.q94
                public final void invoke(Object obj82) {
                    eb6 eb6Var = (eb6) obj82;
                    switch (i13) {
                        case 0:
                            ta6 ta6Var4 = ta6Var;
                            eb6Var.d(ta6Var4.g);
                            eb6Var.l(ta6Var4.g);
                            break;
                        case 1:
                            ta6 ta6Var5 = ta6Var;
                            eb6Var.K(ta6Var5.e, ta6Var5.l);
                            break;
                        case 2:
                            eb6Var.r(ta6Var.e);
                            break;
                        case 3:
                            ta6 ta6Var6 = ta6Var;
                            eb6Var.m(ta6Var6.m, ta6Var6.l);
                            break;
                        case 4:
                            eb6Var.c(ta6Var.n);
                            break;
                        case 5:
                            eb6Var.V(ta6Var.m());
                            break;
                        case 6:
                            eb6Var.M(ta6Var.o);
                            break;
                        case 7:
                            eb6Var.O(ta6Var.f);
                            break;
                        case 8:
                            eb6Var.S(ta6Var.f);
                            break;
                        default:
                            eb6Var.x((rp8) ta6Var.i.e);
                            break;
                    }
                }
            });
        }
        if (!z4) {
            this.m.c(14, new q52(this.P));
        }
        if (z8) {
            final int i14 = 0;
            this.m.c(3, new q94() { // from class: r52
                @Override // defpackage.q94
                public final void invoke(Object obj82) {
                    eb6 eb6Var = (eb6) obj82;
                    switch (i14) {
                        case 0:
                            ta6 ta6Var4 = ta6Var;
                            eb6Var.d(ta6Var4.g);
                            eb6Var.l(ta6Var4.g);
                            break;
                        case 1:
                            ta6 ta6Var5 = ta6Var;
                            eb6Var.K(ta6Var5.e, ta6Var5.l);
                            break;
                        case 2:
                            eb6Var.r(ta6Var.e);
                            break;
                        case 3:
                            ta6 ta6Var6 = ta6Var;
                            eb6Var.m(ta6Var6.m, ta6Var6.l);
                            break;
                        case 4:
                            eb6Var.c(ta6Var.n);
                            break;
                        case 5:
                            eb6Var.V(ta6Var.m());
                            break;
                        case 6:
                            eb6Var.M(ta6Var.o);
                            break;
                        case 7:
                            eb6Var.O(ta6Var.f);
                            break;
                        case 8:
                            eb6Var.S(ta6Var.f);
                            break;
                        default:
                            eb6Var.x((rp8) ta6Var.i.e);
                            break;
                    }
                }
            });
        }
        if (z5 || z6) {
            final int i15 = 1;
            this.m.c(-1, new q94() { // from class: r52
                @Override // defpackage.q94
                public final void invoke(Object obj82) {
                    eb6 eb6Var = (eb6) obj82;
                    switch (i15) {
                        case 0:
                            ta6 ta6Var4 = ta6Var;
                            eb6Var.d(ta6Var4.g);
                            eb6Var.l(ta6Var4.g);
                            break;
                        case 1:
                            ta6 ta6Var5 = ta6Var;
                            eb6Var.K(ta6Var5.e, ta6Var5.l);
                            break;
                        case 2:
                            eb6Var.r(ta6Var.e);
                            break;
                        case 3:
                            ta6 ta6Var6 = ta6Var;
                            eb6Var.m(ta6Var6.m, ta6Var6.l);
                            break;
                        case 4:
                            eb6Var.c(ta6Var.n);
                            break;
                        case 5:
                            eb6Var.V(ta6Var.m());
                            break;
                        case 6:
                            eb6Var.M(ta6Var.o);
                            break;
                        case 7:
                            eb6Var.O(ta6Var.f);
                            break;
                        case 8:
                            eb6Var.S(ta6Var.f);
                            break;
                        default:
                            eb6Var.x((rp8) ta6Var.i.e);
                            break;
                    }
                }
            });
        }
        if (z5) {
            final int i16 = 2;
            this.m.c(4, new q94() { // from class: r52
                @Override // defpackage.q94
                public final void invoke(Object obj82) {
                    eb6 eb6Var = (eb6) obj82;
                    switch (i16) {
                        case 0:
                            ta6 ta6Var4 = ta6Var;
                            eb6Var.d(ta6Var4.g);
                            eb6Var.l(ta6Var4.g);
                            break;
                        case 1:
                            ta6 ta6Var5 = ta6Var;
                            eb6Var.K(ta6Var5.e, ta6Var5.l);
                            break;
                        case 2:
                            eb6Var.r(ta6Var.e);
                            break;
                        case 3:
                            ta6 ta6Var6 = ta6Var;
                            eb6Var.m(ta6Var6.m, ta6Var6.l);
                            break;
                        case 4:
                            eb6Var.c(ta6Var.n);
                            break;
                        case 5:
                            eb6Var.V(ta6Var.m());
                            break;
                        case 6:
                            eb6Var.M(ta6Var.o);
                            break;
                        case 7:
                            eb6Var.O(ta6Var.f);
                            break;
                        case 8:
                            eb6Var.S(ta6Var.f);
                            break;
                        default:
                            eb6Var.x((rp8) ta6Var.i.e);
                            break;
                    }
                }
            });
        }
        if (z6 || ta6Var2.m != ta6Var.m) {
            final int i17 = 3;
            this.m.c(5, new q94() { // from class: r52
                @Override // defpackage.q94
                public final void invoke(Object obj82) {
                    eb6 eb6Var = (eb6) obj82;
                    switch (i17) {
                        case 0:
                            ta6 ta6Var4 = ta6Var;
                            eb6Var.d(ta6Var4.g);
                            eb6Var.l(ta6Var4.g);
                            break;
                        case 1:
                            ta6 ta6Var5 = ta6Var;
                            eb6Var.K(ta6Var5.e, ta6Var5.l);
                            break;
                        case 2:
                            eb6Var.r(ta6Var.e);
                            break;
                        case 3:
                            ta6 ta6Var6 = ta6Var;
                            eb6Var.m(ta6Var6.m, ta6Var6.l);
                            break;
                        case 4:
                            eb6Var.c(ta6Var.n);
                            break;
                        case 5:
                            eb6Var.V(ta6Var.m());
                            break;
                        case 6:
                            eb6Var.M(ta6Var.o);
                            break;
                        case 7:
                            eb6Var.O(ta6Var.f);
                            break;
                        case 8:
                            eb6Var.S(ta6Var.f);
                            break;
                        default:
                            eb6Var.x((rp8) ta6Var.i.e);
                            break;
                    }
                }
            });
        }
        if (ta6Var2.n != ta6Var.n) {
            final int i18 = 4;
            this.m.c(6, new q94() { // from class: r52
                @Override // defpackage.q94
                public final void invoke(Object obj82) {
                    eb6 eb6Var = (eb6) obj82;
                    switch (i18) {
                        case 0:
                            ta6 ta6Var4 = ta6Var;
                            eb6Var.d(ta6Var4.g);
                            eb6Var.l(ta6Var4.g);
                            break;
                        case 1:
                            ta6 ta6Var5 = ta6Var;
                            eb6Var.K(ta6Var5.e, ta6Var5.l);
                            break;
                        case 2:
                            eb6Var.r(ta6Var.e);
                            break;
                        case 3:
                            ta6 ta6Var6 = ta6Var;
                            eb6Var.m(ta6Var6.m, ta6Var6.l);
                            break;
                        case 4:
                            eb6Var.c(ta6Var.n);
                            break;
                        case 5:
                            eb6Var.V(ta6Var.m());
                            break;
                        case 6:
                            eb6Var.M(ta6Var.o);
                            break;
                        case 7:
                            eb6Var.O(ta6Var.f);
                            break;
                        case 8:
                            eb6Var.S(ta6Var.f);
                            break;
                        default:
                            eb6Var.x((rp8) ta6Var.i.e);
                            break;
                    }
                }
            });
        }
        if (ta6Var2.m() != ta6Var.m()) {
            final int i19 = 5;
            this.m.c(7, new q94() { // from class: r52
                @Override // defpackage.q94
                public final void invoke(Object obj82) {
                    eb6 eb6Var = (eb6) obj82;
                    switch (i19) {
                        case 0:
                            ta6 ta6Var4 = ta6Var;
                            eb6Var.d(ta6Var4.g);
                            eb6Var.l(ta6Var4.g);
                            break;
                        case 1:
                            ta6 ta6Var5 = ta6Var;
                            eb6Var.K(ta6Var5.e, ta6Var5.l);
                            break;
                        case 2:
                            eb6Var.r(ta6Var.e);
                            break;
                        case 3:
                            ta6 ta6Var6 = ta6Var;
                            eb6Var.m(ta6Var6.m, ta6Var6.l);
                            break;
                        case 4:
                            eb6Var.c(ta6Var.n);
                            break;
                        case 5:
                            eb6Var.V(ta6Var.m());
                            break;
                        case 6:
                            eb6Var.M(ta6Var.o);
                            break;
                        case 7:
                            eb6Var.O(ta6Var.f);
                            break;
                        case 8:
                            eb6Var.S(ta6Var.f);
                            break;
                        default:
                            eb6Var.x((rp8) ta6Var.i.e);
                            break;
                    }
                }
            });
        }
        if (!ta6Var2.o.equals(ta6Var.o)) {
            final int i20 = 6;
            this.m.c(12, new q94() { // from class: r52
                @Override // defpackage.q94
                public final void invoke(Object obj82) {
                    eb6 eb6Var = (eb6) obj82;
                    switch (i20) {
                        case 0:
                            ta6 ta6Var4 = ta6Var;
                            eb6Var.d(ta6Var4.g);
                            eb6Var.l(ta6Var4.g);
                            break;
                        case 1:
                            ta6 ta6Var5 = ta6Var;
                            eb6Var.K(ta6Var5.e, ta6Var5.l);
                            break;
                        case 2:
                            eb6Var.r(ta6Var.e);
                            break;
                        case 3:
                            ta6 ta6Var6 = ta6Var;
                            eb6Var.m(ta6Var6.m, ta6Var6.l);
                            break;
                        case 4:
                            eb6Var.c(ta6Var.n);
                            break;
                        case 5:
                            eb6Var.V(ta6Var.m());
                            break;
                        case 6:
                            eb6Var.M(ta6Var.o);
                            break;
                        case 7:
                            eb6Var.O(ta6Var.f);
                            break;
                        case 8:
                            eb6Var.S(ta6Var.f);
                            break;
                        default:
                            eb6Var.x((rp8) ta6Var.i.e);
                            break;
                    }
                }
            });
        }
        Y0();
        this.m.b();
        if (ta6Var2.p != ta6Var.p) {
            Iterator it = this.n.iterator();
            while (it.hasNext()) {
                ((b62) it.next()).a.b1();
            }
        }
    }

    @Override // defpackage.gb6
    public final qp4 b0() {
        c1();
        return this.P;
    }

    public final void b1() {
        int iE = e();
        pv1 pv1Var = this.C;
        pv1 pv1Var2 = this.B;
        boolean z = false;
        if (iE != 1) {
            if (iE == 2 || iE == 3) {
                c1();
                boolean z2 = this.k0.p;
                if (l() && !z2) {
                    z = true;
                }
                pv1Var2.c(z);
                pv1Var.c(l());
                return;
            }
            if (iE != 4) {
                throw new IllegalStateException();
            }
        }
        pv1Var2.c(false);
        pv1Var.c(false);
    }

    @Override // defpackage.gb6
    public final void c() {
        c1();
        ta6 ta6Var = this.k0;
        if (ta6Var.e != 1) {
            return;
        }
        ta6 ta6VarF = ta6Var.f(null);
        ta6 ta6VarI0 = I0(ta6VarF, ta6VarF.a.p() ? 4 : 2);
        this.H++;
        wd8 wd8Var = this.l.h;
        wd8Var.getClass();
        vd8 vd8VarB = wd8.b();
        vd8VarB.a = wd8Var.a.obtainMessage(29);
        vd8VarB.b();
        a1(ta6VarI0, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // defpackage.gb6
    public final void c0(List list) {
        c1();
        ArrayList arrayListA0 = A0(list);
        c1();
        U0(arrayListA0, -1, -9223372036854775807L, true);
    }

    public final void c1() {
        this.d.b();
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.t;
        if (threadCurrentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            String str = j29.a;
            Locale locale = Locale.US;
            String strW = bl4.w("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (this.d0) {
                throw new IllegalStateException(strW);
            }
            wn5.l0("ExoPlayerImpl", strW, this.e0 ? null : new IllegalStateException());
            this.e0 = true;
        }
    }

    @Override // defpackage.gb6
    public final void d(ua6 ua6Var) {
        c1();
        if (this.k0.o.equals(ua6Var)) {
            return;
        }
        ta6 ta6VarG = this.k0.g(ua6Var);
        this.H++;
        this.l.h.a(4, ua6Var).b();
        a1(ta6VarG, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // defpackage.gb6
    public final long d0() {
        c1();
        return j29.k0(E0(this.k0));
    }

    @Override // defpackage.gb6
    public final int e() {
        c1();
        return this.k0.e;
    }

    @Override // defpackage.gb6
    public final long e0() {
        c1();
        return this.v;
    }

    @Override // defpackage.gb6
    public final int f() {
        c1();
        return this.F;
    }

    @Override // defpackage.gb6
    public final ua6 g() {
        c1();
        return this.k0.o;
    }

    @Override // defpackage.gb6
    public final Looper g0() {
        return this.t;
    }

    @Override // defpackage.gb6
    public final long getDuration() {
        c1();
        if (!h()) {
            return o();
        }
        ta6 ta6Var = this.k0;
        ks4 ks4Var = ta6Var.b;
        bm8 bm8Var = ta6Var.a;
        Object obj = ks4Var.a;
        yl8 yl8Var = this.o;
        bm8Var.g(obj, yl8Var);
        return j29.k0(yl8Var.a(ks4Var.b, ks4Var.c));
    }

    @Override // defpackage.gb6
    public final boolean h() {
        c1();
        return this.k0.b.b();
    }

    @Override // defpackage.gb6
    public final long i() {
        c1();
        return j29.k0(this.k0.r);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final boolean isScrubbingModeEnabled() {
        c1();
        return this.K;
    }

    @Override // defpackage.gb6
    public final boolean l() {
        c1();
        return this.k0.l;
    }

    @Override // defpackage.gb6
    public final void m(boolean z) {
        c1();
        if (this.G != z) {
            this.G = z;
            wd8 wd8Var = this.l.h;
            wd8Var.getClass();
            vd8 vd8VarB = wd8.b();
            vd8VarB.a = wd8Var.a.obtainMessage(12, z ? 1 : 0, 0);
            vd8VarB.b();
            x52 x52Var = new x52(0, z);
            t94 t94Var = this.m;
            t94Var.c(9, x52Var);
            Y0();
            t94Var.b();
        }
    }

    @Override // defpackage.gb6
    public final void n(eb6 eb6Var) {
        eb6Var.getClass();
        this.m.a(eb6Var);
    }

    @Override // defpackage.gb6
    public final int p() {
        c1();
        if (this.k0.a.p()) {
            return 0;
        }
        ta6 ta6Var = this.k0;
        return ta6Var.a.b(ta6Var.b.a);
    }

    @Override // defpackage.o80
    public final void p0(int i, long j, boolean z) {
        c1();
        if (i == -1) {
            return;
        }
        vy2.j(i >= 0);
        bm8 bm8Var = this.k0.a;
        if (bm8Var.p() || i < bm8Var.o()) {
            hd1 hd1Var = this.s;
            if (!hd1Var.i) {
                be beVarW = hd1Var.W();
                hd1Var.i = true;
                hd1Var.b0(beVarW, -1, new l31(beVarW));
            }
            this.H++;
            if (h()) {
                wn5.k0("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                k62 k62Var = new k62(this.k0);
                k62Var.c(1);
                e62 e62Var = this.k.b;
                e62Var.j.c(new g7(e62Var, k62Var, 20));
                return;
            }
            ta6 ta6VarH = this.k0;
            int i2 = ta6VarH.e;
            if (i2 == 3 || (i2 == 4 && !bm8Var.p())) {
                ta6VarH = this.k0.h(2);
            }
            int iM = M();
            ta6 ta6VarJ0 = J0(ta6VarH, bm8Var, K0(bm8Var, i, j));
            this.l.h.a(3, new m62(bm8Var, i, j29.V(j))).b();
            a1(ta6VarJ0, 0, true, 1, E0(ta6VarJ0), iM, z);
        }
    }

    @Override // defpackage.gb6
    public final void q(TextureView textureView) {
        c1();
        if (textureView == null || textureView != this.W) {
            return;
        }
        z0();
    }

    @Override // defpackage.gb6
    public final w59 r() {
        c1();
        return this.i0;
    }

    @Override // defpackage.gb6
    public final float s() {
        c1();
        return this.a0;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setImageOutput(ImageOutput imageOutput) {
        c1();
        S0(4, 15, imageOutput);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setScrubbingModeEnabled(boolean z) {
        hp8 hp8VarB;
        c1();
        if (z == this.K) {
            return;
        }
        this.K = z;
        gh7 gh7Var = this.M;
        if (!gh7Var.a.isEmpty()) {
            fi4 fi4Var = this.i;
            fi4Var.getClass();
            vh1 vh1VarE = ((ci1) fi4Var).e();
            if (z) {
                this.L = vh1VarE.E;
                ImmutableSet immutableSet = gh7Var.a;
                gp8 gp8VarA = vh1VarE.a();
                zx8 it = immutableSet.iterator();
                while (it.hasNext()) {
                    gp8VarA.m(((Integer) it.next()).intValue(), true);
                }
                hp8VarB = gp8VarA.b();
            } else {
                vh1VarE.getClass();
                uh1 uh1Var = new uh1(vh1VarE);
                uh1Var.n(this.L);
                vh1 vh1Var = new vh1(uh1Var);
                this.L = null;
                hp8VarB = vh1Var;
            }
            if (!hp8VarB.equals(vh1VarE)) {
                fi4Var.b(hp8VarB);
            }
        }
        this.l.h.a(36, Boolean.valueOf(z)).b();
        ta6 ta6Var = this.k0;
        Z0(ta6Var.m, ta6Var.l);
    }

    @Override // defpackage.gb6
    public final void stop() {
        c1();
        X0(null);
        this.c0 = new m81(this.k0.s, ImmutableList.q());
    }

    @Override // defpackage.gb6
    public final int u() {
        c1();
        if (h()) {
            return this.k0.b.c;
        }
        return -1;
    }

    public final void u0(ce ceVar) {
        hd1 hd1Var = this.s;
        hd1Var.getClass();
        hd1Var.f.a(ceVar);
    }

    @Override // defpackage.gb6
    public final void v(SurfaceView surfaceView) {
        c1();
        if (surfaceView instanceof e59) {
            Q0();
            W0(surfaceView);
            V0(surfaceView.getHolder());
            return;
        }
        boolean z = surfaceView instanceof SphericalGLSurfaceView;
        b62 b62Var = this.y;
        if (z) {
            Q0();
            this.U = (SphericalGLSurfaceView) surfaceView;
            le6 le6VarB0 = B0(this.z);
            vy2.s(!le6VarB0.f);
            le6VarB0.c = 10000;
            SphericalGLSurfaceView sphericalGLSurfaceView = this.U;
            vy2.s(true ^ le6VarB0.f);
            le6VarB0.d = sphericalGLSurfaceView;
            le6VarB0.b();
            this.U.a.add(b62Var);
            W0(this.U.getVideoSurface());
            V0(surfaceView.getHolder());
            return;
        }
        SurfaceHolder holder = surfaceView == null ? null : surfaceView.getHolder();
        c1();
        if (holder == null) {
            z0();
            return;
        }
        Q0();
        this.V = true;
        this.T = holder;
        holder.addCallback(b62Var);
        Surface surface = holder.getSurface();
        if (surface == null || !surface.isValid()) {
            W0(null);
            L0(0, 0);
        } else {
            W0(surface);
            Rect surfaceFrame = holder.getSurfaceFrame();
            L0(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    public final void v0(int i, List list) {
        c1();
        ArrayList arrayListA0 = A0(list);
        c1();
        vy2.j(i >= 0);
        ArrayList arrayList = this.p;
        int iMin = Math.min(i, arrayList.size());
        if (!arrayList.isEmpty()) {
            a1(x0(this.k0, iMin, arrayListA0), 0, false, 5, -9223372036854775807L, -1, false);
            return;
        }
        boolean z = this.l0 == -1;
        c1();
        U0(arrayListA0, -1, -9223372036854775807L, z);
    }

    @Override // defpackage.gb6
    public final void w(hp8 hp8Var) {
        hp8 hp8VarB;
        c1();
        fi4 fi4Var = this.i;
        fi4Var.getClass();
        hp8 hp8VarV = V();
        if (this.K) {
            this.L = hp8Var.E;
            ImmutableSet immutableSet = this.M.a;
            gp8 gp8VarA = hp8Var.a();
            zx8 it = immutableSet.iterator();
            while (it.hasNext()) {
                gp8VarA.m(((Integer) it.next()).intValue(), true);
            }
            hp8VarB = gp8VarA.b();
        } else {
            hp8VarB = hp8Var;
        }
        if (!hp8VarB.equals(((ci1) fi4Var).e())) {
            fi4Var.b(hp8VarB);
        }
        if (hp8VarV.equals(hp8Var)) {
            return;
        }
        this.m.f(19, new w52(hp8Var, 0));
    }

    public final ArrayList w0(int i, List list) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            ys4 ys4Var = new ys4((x70) list.get(i2), this.q);
            arrayList.add(ys4Var);
            d62 d62Var = new d62(ys4Var.b, ys4Var.a);
            this.p.add(i2 + i, d62Var);
        }
        this.N = this.N.a(i, arrayList.size());
        return arrayList;
    }

    public final ta6 x0(ta6 ta6Var, int i, ArrayList arrayList) {
        bm8 bm8Var = ta6Var.a;
        this.H++;
        ArrayList arrayListW0 = w0(i, arrayList);
        sg6 sg6Var = new sg6(this.p, this.N);
        ta6 ta6VarJ0 = J0(ta6Var, sg6Var, G0(bm8Var, sg6Var, F0(ta6Var), D0(ta6Var)));
        nv7 nv7Var = this.N;
        wd8 wd8Var = this.l.h;
        i62 i62Var = new i62(arrayListW0, nv7Var, -1, -9223372036854775807L);
        wd8Var.getClass();
        vd8 vd8VarB = wd8.b();
        vd8VarB.a = wd8Var.a.obtainMessage(18, i, 0, i62Var);
        vd8VarB.b();
        return ta6VarJ0;
    }

    @Override // defpackage.gb6
    public final void y(float f) {
        c1();
        float fH = j29.h(f, 0.0f, 1.0f);
        if (this.a0 == fH) {
            return;
        }
        this.a0 = fH;
        this.l.h.a(32, Float.valueOf(fH)).b();
        this.m.f(22, new s52(0, fH));
    }

    public final qp4 y0() {
        bm8 bm8VarS = S();
        if (bm8VarS.p()) {
            return this.j0;
        }
        jp4 jp4Var = bm8VarS.m(M(), this.a, 0L).c;
        pp4 pp4VarA = this.j0.a();
        qp4 qp4Var = jp4Var.d;
        if (qp4Var != null) {
            ImmutableList immutableList = qp4Var.J;
            byte[] bArr = qp4Var.k;
            CharSequence charSequence = qp4Var.a;
            if (charSequence != null) {
                pp4VarA.a = charSequence;
            }
            CharSequence charSequence2 = qp4Var.b;
            if (charSequence2 != null) {
                pp4VarA.b = charSequence2;
            }
            CharSequence charSequence3 = qp4Var.c;
            if (charSequence3 != null) {
                pp4VarA.c = charSequence3;
            }
            CharSequence charSequence4 = qp4Var.d;
            if (charSequence4 != null) {
                pp4VarA.d = charSequence4;
            }
            CharSequence charSequence5 = qp4Var.e;
            if (charSequence5 != null) {
                pp4VarA.e = charSequence5;
            }
            CharSequence charSequence6 = qp4Var.f;
            if (charSequence6 != null) {
                pp4VarA.f = charSequence6;
            }
            CharSequence charSequence7 = qp4Var.g;
            if (charSequence7 != null) {
                pp4VarA.g = charSequence7;
            }
            Long l = qp4Var.h;
            if (l != null) {
                pp4VarA.c(l);
            }
            fv6 fv6Var = qp4Var.i;
            if (fv6Var != null) {
                pp4VarA.i = fv6Var;
            }
            fv6 fv6Var2 = qp4Var.j;
            if (fv6Var2 != null) {
                pp4VarA.j = fv6Var2;
            }
            Uri uri = qp4Var.m;
            if (uri != null || bArr != null) {
                pp4VarA.m = uri;
                pp4VarA.b(bArr, qp4Var.l);
            }
            Integer num = qp4Var.n;
            if (num != null) {
                pp4VarA.n = num;
            }
            Integer num2 = qp4Var.o;
            if (num2 != null) {
                pp4VarA.o = num2;
            }
            Integer num3 = qp4Var.p;
            if (num3 != null) {
                pp4VarA.p = num3;
            }
            Boolean bool = qp4Var.q;
            if (bool != null) {
                pp4VarA.q = bool;
            }
            Boolean bool2 = qp4Var.r;
            if (bool2 != null) {
                pp4VarA.r = bool2;
            }
            Integer num4 = qp4Var.s;
            if (num4 != null) {
                pp4VarA.s = num4;
            }
            Integer num5 = qp4Var.t;
            if (num5 != null) {
                pp4VarA.s = num5;
            }
            Integer num6 = qp4Var.u;
            if (num6 != null) {
                pp4VarA.t = num6;
            }
            Integer num7 = qp4Var.v;
            if (num7 != null) {
                pp4VarA.u = num7;
            }
            Integer num8 = qp4Var.w;
            if (num8 != null) {
                pp4VarA.v = num8;
            }
            Integer num9 = qp4Var.x;
            if (num9 != null) {
                pp4VarA.w = num9;
            }
            Integer num10 = qp4Var.y;
            if (num10 != null) {
                pp4VarA.x = num10;
            }
            CharSequence charSequence8 = qp4Var.z;
            if (charSequence8 != null) {
                pp4VarA.y = charSequence8;
            }
            CharSequence charSequence9 = qp4Var.A;
            if (charSequence9 != null) {
                pp4VarA.z = charSequence9;
            }
            CharSequence charSequence10 = qp4Var.B;
            if (charSequence10 != null) {
                pp4VarA.A = charSequence10;
            }
            Integer num11 = qp4Var.C;
            if (num11 != null) {
                pp4VarA.B = num11;
            }
            Integer num12 = qp4Var.D;
            if (num12 != null) {
                pp4VarA.C = num12;
            }
            CharSequence charSequence11 = qp4Var.E;
            if (charSequence11 != null) {
                pp4VarA.D = charSequence11;
            }
            CharSequence charSequence12 = qp4Var.F;
            if (charSequence12 != null) {
                pp4VarA.E = charSequence12;
            }
            CharSequence charSequence13 = qp4Var.G;
            if (charSequence13 != null) {
                pp4VarA.F = charSequence13;
            }
            Integer num13 = qp4Var.H;
            if (num13 != null) {
                pp4VarA.G = num13;
            }
            Bundle bundle = qp4Var.I;
            if (bundle != null) {
                pp4VarA.H = bundle;
            }
            if (!immutableList.isEmpty()) {
                pp4VarA.I = ImmutableList.n(immutableList);
            }
        }
        return new qp4(pp4VarA);
    }

    public final void z0() {
        c1();
        Q0();
        W0(null);
        L0(0, 0);
    }
}
