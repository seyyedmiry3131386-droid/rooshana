package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.common.PlaybackException;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class he6 {
    public static final he6 F;
    public static final String G;
    public static final String H;
    public static final String I;
    public static final String J;
    public static final String K;
    public static final String L;
    public static final String M;
    public static final String N;
    public static final String O;
    public static final String P;
    public static final String Q;
    public static final String R;
    public static final String S;
    public static final String T;
    public static final String U;
    public static final String V;
    public static final String W;
    public static final String X;
    public static final String Y;
    public static final String Z;
    public static final String a0;
    public static final String b0;
    public static final String c0;
    public static final String d0;
    public static final String e0;
    public static final String f0;
    public static final String g0;
    public static final String h0;
    public static final String i0;
    public static final String j0;
    public static final String k0;
    public static final String l0;
    public final long A;
    public final long B;
    public final long C;
    public final rp8 D;
    public final hp8 E;
    public final PlaybackException a;
    public final int b;
    public final aq7 c;
    public final fb6 d;
    public final fb6 e;
    public final int f;
    public final ua6 g;
    public final int h;
    public final boolean i;
    public final bm8 j;
    public final int k;
    public final w59 l;
    public final qp4 m;
    public final float n;
    public final ly o;
    public final m81 p;
    public final wl1 q;
    public final int r;
    public final boolean s;
    public final boolean t;
    public final int u;
    public final boolean v;
    public final boolean w;
    public final int x;
    public final int y;
    public final qp4 z;

    static {
        aq7 aq7Var = aq7.l;
        fb6 fb6Var = aq7.k;
        ua6 ua6Var = ua6.d;
        w59 w59Var = w59.d;
        xl8 xl8Var = bm8.a;
        qp4 qp4Var = qp4.K;
        F = new he6(null, 0, aq7Var, fb6Var, fb6Var, 0, ua6Var, 0, false, w59Var, xl8Var, 0, qp4Var, 1.0f, ly.h, m81.d, wl1.e, 0, false, false, 1, 0, 1, false, false, qp4Var, 5000L, 15000L, 3000L, rp8.b, hp8.F);
        String str = j29.a;
        G = Integer.toString(1, 36);
        H = Integer.toString(2, 36);
        I = Integer.toString(3, 36);
        J = Integer.toString(4, 36);
        K = Integer.toString(5, 36);
        L = Integer.toString(6, 36);
        M = Integer.toString(7, 36);
        N = Integer.toString(8, 36);
        O = Integer.toString(9, 36);
        P = Integer.toString(10, 36);
        Q = Integer.toString(11, 36);
        R = Integer.toString(12, 36);
        S = Integer.toString(13, 36);
        T = Integer.toString(14, 36);
        U = Integer.toString(15, 36);
        V = Integer.toString(16, 36);
        W = Integer.toString(17, 36);
        X = Integer.toString(18, 36);
        Y = Integer.toString(19, 36);
        Z = Integer.toString(20, 36);
        a0 = Integer.toString(21, 36);
        b0 = Integer.toString(22, 36);
        c0 = Integer.toString(23, 36);
        d0 = Integer.toString(24, 36);
        e0 = Integer.toString(25, 36);
        f0 = Integer.toString(26, 36);
        g0 = Integer.toString(27, 36);
        h0 = Integer.toString(28, 36);
        i0 = Integer.toString(29, 36);
        j0 = Integer.toString(30, 36);
        k0 = Integer.toString(31, 36);
        l0 = Integer.toString(32, 36);
    }

    public he6(PlaybackException playbackException, int i, aq7 aq7Var, fb6 fb6Var, fb6 fb6Var2, int i2, ua6 ua6Var, int i3, boolean z, w59 w59Var, bm8 bm8Var, int i4, qp4 qp4Var, float f, ly lyVar, m81 m81Var, wl1 wl1Var, int i5, boolean z2, boolean z3, int i6, int i7, int i8, boolean z4, boolean z5, qp4 qp4Var2, long j, long j2, long j3, rp8 rp8Var, hp8 hp8Var) {
        this.a = playbackException;
        this.b = i;
        this.c = aq7Var;
        this.d = fb6Var;
        this.e = fb6Var2;
        this.f = i2;
        this.g = ua6Var;
        this.h = i3;
        this.i = z;
        this.l = w59Var;
        this.j = bm8Var;
        this.k = i4;
        this.m = qp4Var;
        this.n = f;
        this.o = lyVar;
        this.p = m81Var;
        this.q = wl1Var;
        this.r = i5;
        this.s = z2;
        this.t = z3;
        this.u = i6;
        this.x = i7;
        this.y = i8;
        this.v = z4;
        this.w = z5;
        this.z = qp4Var2;
        this.A = j;
        this.B = j2;
        this.C = j3;
        this.D = rp8Var;
        this.E = hp8Var;
    }

    public static he6 o(int i, Bundle bundle) {
        PlaybackException playbackException;
        bm8 zl8Var;
        bm8 bm8Var;
        w59 w59Var;
        qp4 qp4Var;
        int i2;
        ImmutableList immutableListS;
        m81 m81Var;
        m81 m81Var2;
        wl1 wl1VarB;
        rp8 rp8Var;
        IBinder binder = bundle.getBinder(l0);
        if (binder instanceof ge6) {
            return ((ge6) binder).n;
        }
        Bundle bundle2 = bundle.getBundle(X);
        if (bundle2 == null) {
            playbackException = null;
        } else {
            String string = bundle2.getString(PlaybackException.f);
            String string2 = bundle2.getString(PlaybackException.g);
            String string3 = bundle2.getString(PlaybackException.h);
            if (!TextUtils.isEmpty(string2)) {
                try {
                    Class<?> cls = Class.forName(string2, true, PlaybackException.class.getClassLoader());
                    remoteException = Throwable.class.isAssignableFrom(cls) ? (Throwable) cls.getConstructor(String.class).newInstance(string3) : null;
                    if (remoteException == null) {
                        remoteException = new RemoteException(string3);
                    }
                } catch (Throwable unused) {
                    remoteException = new RemoteException(string3);
                }
            }
            Throwable th = remoteException;
            int i3 = bundle2.getInt(PlaybackException.d, 1000);
            Bundle bundle3 = bundle2.getBundle(PlaybackException.i);
            if (bundle3 == null) {
                bundle3 = Bundle.EMPTY;
            }
            playbackException = new PlaybackException(string, th, i3, bundle3, bundle2.getLong(PlaybackException.e, SystemClock.elapsedRealtime()));
        }
        int i4 = bundle.getInt(Z, 0);
        Bundle bundle4 = bundle.getBundle(Y);
        aq7 aq7VarB = bundle4 == null ? aq7.l : aq7.b(bundle4);
        Bundle bundle5 = bundle.getBundle(a0);
        fb6 fb6VarC = bundle5 == null ? aq7.k : fb6.c(bundle5);
        Bundle bundle6 = bundle.getBundle(b0);
        fb6 fb6VarC2 = bundle6 == null ? aq7.k : fb6.c(bundle6);
        int i5 = bundle.getInt(c0, 0);
        Bundle bundle7 = bundle.getBundle(G);
        ua6 ua6Var = bundle7 == null ? ua6.d : new ua6(bundle7.getFloat(ua6.e, 1.0f), bundle7.getFloat(ua6.f, 1.0f));
        int i6 = bundle.getInt(H, 0);
        boolean z = bundle.getBoolean(I, false);
        Bundle bundle8 = bundle.getBundle(J);
        if (bundle8 == null) {
            zl8Var = bm8.a;
        } else {
            p58 p58Var = new p58(5);
            IBinder binder2 = bundle8.getBinder(bm8.b);
            ImmutableList immutableListQ = binder2 == null ? ImmutableList.q() : yh0.s(p58Var, zh0.a(binder2));
            p58 p58Var2 = new p58(6);
            IBinder binder3 = bundle8.getBinder(bm8.c);
            ImmutableList immutableListQ2 = binder3 == null ? ImmutableList.q() : yh0.s(p58Var2, zh0.a(binder3));
            int[] intArray = bundle8.getIntArray(bm8.d);
            if (intArray == null) {
                int size = immutableListQ.size();
                int[] iArr = new int[size];
                for (int i7 = 0; i7 < size; i7++) {
                    iArr[i7] = i7;
                }
                intArray = iArr;
            }
            zl8Var = new zl8(immutableListQ, immutableListQ2, intArray);
        }
        int i8 = bundle.getInt(k0, 0);
        Bundle bundle9 = bundle.getBundle(K);
        if (bundle9 == null) {
            w59Var = w59.d;
            bm8Var = zl8Var;
        } else {
            bm8Var = zl8Var;
            w59Var = new w59(bundle9.getFloat(w59.g, 1.0f), bundle9.getInt(w59.e, 0), bundle9.getInt(w59.f, 0));
        }
        Bundle bundle10 = bundle.getBundle(L);
        qp4 qp4VarB = bundle10 == null ? qp4.K : qp4.b(bundle10);
        float f = bundle.getFloat(M, 1.0f);
        Bundle bundle11 = bundle.getBundle(N);
        ly lyVarA = bundle11 == null ? ly.h : ly.a(bundle11);
        Bundle bundle12 = bundle.getBundle(d0);
        if (bundle12 == null) {
            m81Var = m81.d;
            qp4Var = qp4VarB;
            i2 = i8;
        } else {
            ArrayList parcelableArrayList = bundle12.getParcelableArrayList(m81.e);
            if (parcelableArrayList == null) {
                immutableListS = ImmutableList.q();
                qp4Var = qp4VarB;
                i2 = i8;
            } else {
                lj3 lj3VarM = ImmutableList.m();
                qp4Var = qp4VarB;
                i2 = i8;
                for (int i9 = 0; i9 < parcelableArrayList.size(); i9++) {
                    Bundle bundle13 = (Bundle) parcelableArrayList.get(i9);
                    bundle13.getClass();
                    lj3VarM.O(l81.b(bundle13));
                }
                immutableListS = lj3VarM.S();
            }
            m81Var = new m81(bundle12.getLong(m81.f), immutableListS);
        }
        Bundle bundle14 = bundle.getBundle(O);
        if (bundle14 == null) {
            wl1VarB = wl1.e;
            m81Var2 = m81Var;
        } else {
            int i10 = bundle14.getInt(wl1.f, 0);
            int i11 = bundle14.getInt(wl1.g, 0);
            m81Var2 = m81Var;
            int i12 = bundle14.getInt(wl1.h, 0);
            String string4 = bundle14.getString(wl1.i);
            vl1 vl1Var = new vl1(i10);
            vl1Var.c = i11;
            vl1Var.d = i12;
            vy2.j(i10 != 0 || string4 == null);
            vl1Var.e = string4;
            wl1VarB = vl1Var.b();
        }
        int i13 = bundle.getInt(P, 0);
        boolean z2 = bundle.getBoolean(Q, false);
        boolean z3 = bundle.getBoolean(R, false);
        int i14 = bundle.getInt(S, 1);
        int i15 = bundle.getInt(T, 0);
        int i16 = bundle.getInt(U, 1);
        boolean z4 = bundle.getBoolean(V, false);
        boolean z5 = bundle.getBoolean(W, false);
        Bundle bundle15 = bundle.getBundle(e0);
        qp4 qp4VarB2 = bundle15 == null ? qp4.K : qp4.b(bundle15);
        long j = bundle.getLong(f0, i < 4 ? 0L : 5000L);
        long j2 = bundle.getLong(g0, i < 4 ? 0L : 15000L);
        long j3 = bundle.getLong(h0, i < 4 ? 0L : 3000L);
        Bundle bundle16 = bundle.getBundle(j0);
        if (bundle16 == null) {
            rp8Var = rp8.b;
        } else {
            ArrayList parcelableArrayList2 = bundle16.getParcelableArrayList(rp8.c);
            rp8Var = new rp8(parcelableArrayList2 == null ? ImmutableList.q() : yh0.s(new p58(12), parcelableArrayList2));
        }
        Bundle bundle17 = bundle.getBundle(i0);
        return new he6(playbackException, i4, aq7VarB, fb6VarC, fb6VarC2, i5, ua6Var, i6, z, w59Var, bm8Var, i2, qp4Var, f, lyVarA, m81Var2, wl1VarB, i13, z2, z3, i14, i15, i16, z4, z5, qp4VarB2, j, j2, j3, rp8Var, bundle17 == null ? hp8.F : hp8.b(bundle17));
    }

    public final he6 a(rp8 rp8Var) {
        bm8 bm8Var = this.j;
        boolean zP = bm8Var.p();
        aq7 aq7Var = this.c;
        vy2.s(zP || aq7Var.a.b < bm8Var.o());
        return new he6(this.a, this.b, aq7Var, this.d, this.e, this.f, this.g, this.h, this.i, this.l, bm8Var, this.k, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, rp8Var, this.E);
    }

    public final he6 b(int i, int i2, boolean z) {
        int i3 = this.y;
        boolean z2 = i3 == 3 && z && i2 == 0;
        bm8 bm8Var = this.j;
        boolean zP = bm8Var.p();
        aq7 aq7Var = this.c;
        vy2.s(zP || aq7Var.a.b < bm8Var.o());
        return new he6(this.a, this.b, aq7Var, this.d, this.e, this.f, this.g, this.h, this.i, this.l, bm8Var, this.k, this.m, this.n, this.o, this.p, this.q, this.r, this.s, z, i, i2, i3, z2, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
    }

    public final he6 c(ua6 ua6Var) {
        bm8 bm8Var = this.j;
        boolean zP = bm8Var.p();
        aq7 aq7Var = this.c;
        vy2.s(zP || aq7Var.a.b < bm8Var.o());
        return new he6(this.a, this.b, aq7Var, this.d, this.e, this.f, ua6Var, this.h, this.i, this.l, bm8Var, this.k, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
    }

    public final he6 d(int i, PlaybackException playbackException) {
        boolean z = this.t;
        int i2 = this.x;
        boolean z2 = i == 3 && z && i2 == 0;
        bm8 bm8Var = this.j;
        boolean zP = bm8Var.p();
        aq7 aq7Var = this.c;
        vy2.s(zP || aq7Var.a.b < bm8Var.o());
        return new he6(playbackException, this.b, aq7Var, this.d, this.e, this.f, this.g, this.h, this.i, this.l, bm8Var, this.k, this.m, this.n, this.o, this.p, this.q, this.r, this.s, z, this.u, i2, i, z2, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
    }

    public final he6 e(int i, fb6 fb6Var, fb6 fb6Var2) {
        bm8 bm8Var = this.j;
        boolean zP = bm8Var.p();
        aq7 aq7Var = this.c;
        vy2.s(zP || aq7Var.a.b < bm8Var.o());
        return new he6(this.a, this.b, aq7Var, fb6Var, fb6Var2, i, this.g, this.h, this.i, this.l, bm8Var, this.k, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
    }

    public final he6 f(int i) {
        bm8 bm8Var = this.j;
        boolean zP = bm8Var.p();
        aq7 aq7Var = this.c;
        vy2.s(zP || aq7Var.a.b < bm8Var.o());
        return new he6(this.a, this.b, aq7Var, this.d, this.e, this.f, this.g, i, this.i, this.l, bm8Var, this.k, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
    }

    public final he6 g(aq7 aq7Var) {
        bm8 bm8Var = this.j;
        vy2.s(bm8Var.p() || aq7Var.a.b < bm8Var.o());
        return new he6(this.a, this.b, aq7Var, this.d, this.e, this.f, this.g, this.h, this.i, this.l, bm8Var, this.k, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
    }

    public final he6 h(boolean z) {
        bm8 bm8Var = this.j;
        boolean zP = bm8Var.p();
        aq7 aq7Var = this.c;
        vy2.s(zP || aq7Var.a.b < bm8Var.o());
        return new he6(this.a, this.b, aq7Var, this.d, this.e, this.f, this.g, this.h, z, this.l, bm8Var, this.k, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
    }

    public final he6 i(bm8 bm8Var) {
        boolean zP = bm8Var.p();
        aq7 aq7Var = this.c;
        vy2.s(zP || aq7Var.a.b < bm8Var.o());
        return new he6(this.a, this.b, aq7Var, this.d, this.e, this.f, this.g, this.h, this.i, this.l, bm8Var, this.k, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
    }

    public final he6 j(dp6 dp6Var, int i) {
        aq7 aq7Var = this.c;
        fb6 fb6Var = aq7Var.a;
        aq7 aq7Var2 = new aq7(new fb6(fb6Var.a, i, fb6Var.c, fb6Var.d, fb6Var.e, fb6Var.f, fb6Var.g, fb6Var.h, fb6Var.i), aq7Var.b, aq7Var.c, aq7Var.d, aq7Var.e, aq7Var.f, aq7Var.g, aq7Var.h, aq7Var.i, aq7Var.j);
        vy2.s(dp6Var.p() || aq7Var2.a.b < dp6Var.o());
        return new he6(this.a, this.b, aq7Var2, this.d, this.e, this.f, this.g, this.h, this.i, this.l, dp6Var, 0, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
    }

    public final he6 k(bm8 bm8Var, aq7 aq7Var, int i) {
        vy2.s(bm8Var.p() || aq7Var.a.b < bm8Var.o());
        return new he6(this.a, this.b, aq7Var, this.d, this.e, this.f, this.g, this.h, this.i, this.l, bm8Var, i, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
    }

    public final he6 l(hp8 hp8Var) {
        bm8 bm8Var = this.j;
        boolean zP = bm8Var.p();
        aq7 aq7Var = this.c;
        vy2.s(zP || aq7Var.a.b < bm8Var.o());
        return new he6(this.a, this.b, aq7Var, this.d, this.e, this.f, this.g, this.h, this.i, this.l, bm8Var, this.k, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, this.D, hp8Var);
    }

    public final he6 m(float f) {
        bm8 bm8Var = this.j;
        boolean zP = bm8Var.p();
        aq7 aq7Var = this.c;
        vy2.s(zP || aq7Var.a.b < bm8Var.o());
        return new he6(this.a, this.b, aq7Var, this.d, this.e, this.f, this.g, this.h, this.i, this.l, bm8Var, this.k, this.m, f, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
    }

    public final he6 n(cb6 cb6Var, boolean z, boolean z2) {
        int i;
        boolean z3;
        int i2;
        boolean zA = cb6Var.a(16);
        boolean zA2 = cb6Var.a(17);
        aq7 aq7Var = this.c;
        aq7 aq7VarA = aq7Var.a(zA, zA2);
        fb6 fb6VarB = this.d.b(zA, zA2);
        fb6 fb6VarB2 = this.e.b(zA, zA2);
        boolean z4 = true;
        bm8 zl8Var = this.j;
        if (!zA2 && zA && !zl8Var.p()) {
            int i3 = aq7Var.a.b;
            if (zl8Var.o() != 1) {
                am8 am8VarM = zl8Var.m(i3, new am8(), 0L);
                lj3 lj3VarM = ImmutableList.m();
                int i4 = am8VarM.n;
                while (true) {
                    i2 = am8VarM.o;
                    if (i4 > i2) {
                        break;
                    }
                    yl8 yl8VarF = zl8Var.f(i4, new yl8(), true);
                    yl8VarF.c = 0;
                    lj3VarM.O(yl8VarF);
                    i4++;
                }
                am8VarM.o = i2 - am8VarM.n;
                am8VarM.n = 0;
                zl8Var = new zl8(ImmutableList.s(am8VarM), lj3VarM.S(), new int[]{0});
            }
        } else if (z || !zA2) {
            zl8Var = bm8.a;
        }
        bm8 bm8Var = zl8Var;
        qp4 qp4Var = !cb6Var.a(18) ? qp4.K : this.m;
        float f = !cb6Var.a(22) ? 1.0f : this.n;
        ly lyVar = !cb6Var.a(21) ? ly.h : this.o;
        m81 m81Var = !cb6Var.a(28) ? m81.d : this.p;
        if (cb6Var.a(23)) {
            i = this.r;
            z3 = this.s;
        } else {
            i = 0;
            z3 = false;
        }
        qp4 qp4Var2 = !cb6Var.a(18) ? qp4.K : this.z;
        rp8 rp8Var = (z2 || !cb6Var.a(30)) ? rp8.b : this.D;
        if (!bm8Var.p() && aq7VarA.a.b >= bm8Var.o()) {
            z4 = false;
        }
        vy2.s(z4);
        return new he6(this.a, this.b, aq7VarA, fb6VarB, fb6VarB2, this.f, this.g, this.h, this.i, this.l, bm8Var, this.k, qp4Var, f, lyVar, m81Var, this.q, i, z3, this.t, this.u, this.x, this.y, this.v, this.w, qp4Var2, this.A, this.B, this.C, rp8Var, this.E);
    }

    public final jp4 p() {
        bm8 bm8Var = this.j;
        if (bm8Var.p()) {
            return null;
        }
        return bm8Var.m(this.c.a.b, new am8(), 0L).c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r28v0 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Bundle q(int i) {
        long j;
        boolean z;
        int i2;
        yl8 yl8Var;
        int i3;
        int i4;
        Bundle bundleC;
        long j2;
        Bundle bundle = new Bundle();
        PlaybackException playbackException = this.a;
        if (playbackException != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt(PlaybackException.d, playbackException.a);
            bundle2.putLong(PlaybackException.e, playbackException.b);
            bundle2.putString(PlaybackException.f, playbackException.getMessage());
            bundle2.putBundle(PlaybackException.i, playbackException.c);
            Throwable cause = playbackException.getCause();
            if (cause != null) {
                bundle2.putString(PlaybackException.g, cause.getClass().getName());
                bundle2.putString(PlaybackException.h, cause.getMessage());
            }
            bundle.putBundle(X, bundle2);
        }
        int i5 = this.b;
        if (i5 != 0) {
            bundle.putInt(Z, i5);
        }
        aq7 aq7Var = this.c;
        if (i < 3 || !aq7Var.equals(aq7.l)) {
            bundle.putBundle(Y, aq7Var.c(i));
        }
        fb6 fb6Var = this.d;
        if (i < 3 || !aq7.k.a(fb6Var)) {
            bundle.putBundle(a0, fb6Var.d(i));
        }
        fb6 fb6Var2 = this.e;
        if (i < 3 || !aq7.k.a(fb6Var2)) {
            bundle.putBundle(b0, fb6Var2.d(i));
        }
        int i6 = this.f;
        if (i6 != 0) {
            bundle.putInt(c0, i6);
        }
        ua6 ua6Var = ua6.d;
        ua6 ua6Var2 = this.g;
        if (!ua6Var2.equals(ua6Var)) {
            Bundle bundle3 = new Bundle();
            bundle3.putFloat(ua6.e, ua6Var2.a);
            bundle3.putFloat(ua6.f, ua6Var2.b);
            bundle.putBundle(G, bundle3);
        }
        int i7 = this.h;
        if (i7 != 0) {
            bundle.putInt(H, i7);
        }
        boolean z2 = this.i;
        if (z2) {
            bundle.putBoolean(I, z2);
        }
        xl8 xl8Var = bm8.a;
        bm8 bm8Var = this.j;
        boolean z3 = false;
        long j3 = 0;
        if (bm8Var.equals(xl8Var)) {
            j = 0;
        } else {
            ArrayList arrayList = new ArrayList();
            int iO = bm8Var.o();
            am8 am8Var = new am8();
            int i8 = 0;
            while (i8 < iO) {
                am8 am8VarM = bm8Var.m(i8, am8Var, j3);
                am8VarM.getClass();
                Bundle bundle4 = new Bundle();
                long j4 = j3;
                if (!jp4.g.equals(am8VarM.c)) {
                    bundle4.putBundle(am8.t, am8VarM.c.c(false));
                }
                long j5 = am8VarM.e;
                if (j5 != -9223372036854775807L) {
                    j2 = -9223372036854775807L;
                    bundle4.putLong(am8.u, j5);
                } else {
                    j2 = -9223372036854775807L;
                }
                long j6 = am8VarM.f;
                if (j6 != j2) {
                    bundle4.putLong(am8.v, j6);
                }
                long j7 = am8VarM.g;
                if (j7 != j2) {
                    bundle4.putLong(am8.w, j7);
                }
                boolean z4 = am8VarM.h;
                if (z4) {
                    bundle4.putBoolean(am8.x, z4);
                }
                boolean z5 = am8VarM.i;
                if (z5) {
                    bundle4.putBoolean(am8.y, z5);
                }
                ep4 ep4Var = am8VarM.j;
                if (ep4Var != null) {
                    bundle4.putBundle(am8.z, ep4Var.c());
                }
                boolean z6 = am8VarM.k;
                if (z6) {
                    bundle4.putBoolean(am8.A, z6);
                }
                long j8 = am8VarM.l;
                if (j8 != j4) {
                    bundle4.putLong(am8.B, j8);
                }
                long j9 = am8VarM.m;
                if (j9 != j2) {
                    bundle4.putLong(am8.C, j9);
                }
                int i9 = am8VarM.n;
                if (i9 != 0) {
                    bundle4.putInt(am8.D, i9);
                }
                int i10 = am8VarM.o;
                if (i10 != 0) {
                    bundle4.putInt(am8.E, i10);
                }
                long j10 = am8VarM.p;
                if (j10 != j4) {
                    bundle4.putLong(am8.F, j10);
                }
                arrayList.add(bundle4);
                i8++;
                j3 = j4;
            }
            j = j3;
            ArrayList arrayList2 = new ArrayList();
            int iH = bm8Var.h();
            yl8 yl8Var2 = new yl8();
            int i11 = 0;
            while (i11 < iH) {
                yl8 yl8VarF = bm8Var.f(i11, yl8Var2, z3);
                yl8VarF.getClass();
                Bundle bundle5 = new Bundle();
                int i12 = yl8VarF.c;
                if (i12 != 0) {
                    bundle5.putInt(yl8.h, i12);
                }
                long j11 = yl8VarF.d;
                if (j11 != -9223372036854775807L) {
                    z = z3;
                    bundle5.putLong(yl8.i, j11);
                } else {
                    z = z3;
                }
                long j12 = yl8VarF.e;
                if (j12 != j) {
                    bundle5.putLong(yl8.j, j12);
                }
                boolean z7 = yl8VarF.f;
                if (z7) {
                    bundle5.putBoolean(yl8.k, z7);
                }
                if (yl8VarF.g.equals(bb.f)) {
                    i2 = iH;
                    yl8Var = yl8Var2;
                    i3 = i11;
                } else {
                    String str = yl8.l;
                    bb bbVar = yl8VarF.g;
                    bbVar.getClass();
                    Bundle bundle6 = new Bundle();
                    ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>();
                    ab[] abVarArr = bbVar.e;
                    i2 = iH;
                    int length = abVarArr.length;
                    ?? r6 = z;
                    while (r6 < length) {
                        ?? r23 = r6;
                        ab abVar = abVarArr[r23 == true ? 1 : 0];
                        abVar.getClass();
                        int i13 = length;
                        Bundle bundle7 = new Bundle();
                        yl8 yl8Var3 = yl8Var2;
                        bundle7.putLong(ab.l, abVar.a);
                        bundle7.putInt(ab.m, abVar.b);
                        bundle7.putInt(ab.s, abVar.c);
                        bundle7.putParcelableArrayList(ab.n, new ArrayList<>(Arrays.asList(abVar.d)));
                        String str2 = ab.t;
                        ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>();
                        jp4[] jp4VarArr = abVar.e;
                        int i14 = i11;
                        int length2 = jp4VarArr.length;
                        ?? r10 = z;
                        while (r10 < length2) {
                            ?? r28 = r10;
                            jp4 jp4Var = jp4VarArr[r28 == true ? 1 : 0];
                            if (jp4Var == null) {
                                bundleC = null;
                                i4 = length2;
                            } else {
                                i4 = length2;
                                bundleC = jp4Var.c(true);
                            }
                            arrayList4.add(bundleC);
                            length2 = i4;
                            r10 = (r28 == true ? 1 : 0) + 1;
                        }
                        bundle7.putParcelableArrayList(str2, arrayList4);
                        bundle7.putIntArray(ab.o, abVar.f);
                        bundle7.putLongArray(ab.p, abVar.g);
                        bundle7.putLong(ab.q, abVar.i);
                        bundle7.putBoolean(ab.r, abVar.j);
                        bundle7.putStringArrayList(ab.u, new ArrayList<>(Arrays.asList(abVar.h)));
                        bundle7.putBoolean(ab.v, abVar.k);
                        arrayList3.add(bundle7);
                        length = i13;
                        yl8Var2 = yl8Var3;
                        i11 = i14;
                        r6 = (r23 == true ? 1 : 0) + 1;
                    }
                    yl8Var = yl8Var2;
                    i3 = i11;
                    if (!arrayList3.isEmpty()) {
                        bundle6.putParcelableArrayList(bb.h, arrayList3);
                    }
                    long j13 = bbVar.b;
                    if (j13 != j) {
                        bundle6.putLong(bb.i, j13);
                    }
                    long j14 = bbVar.c;
                    if (j14 != -9223372036854775807L) {
                        bundle6.putLong(bb.j, j14);
                    }
                    int i15 = bbVar.d;
                    if (i15 != 0) {
                        bundle6.putInt(bb.k, i15);
                    }
                    bundle5.putBundle(str, bundle6);
                }
                arrayList2.add(bundle5);
                i11 = i3 + 1;
                z3 = z;
                iH = i2;
                yl8Var2 = yl8Var;
            }
            boolean z8 = z3;
            int[] iArr = new int[iO];
            boolean z9 = true;
            if (iO > 0) {
                iArr[z8 ? 1 : 0] = bm8Var.a(true);
            }
            int i16 = 1;
            while (i16 < iO) {
                iArr[i16] = bm8Var.e(iArr[i16 - 1], z8 ? 1 : 0, z9);
                i16++;
                z9 = true;
                z8 = false;
            }
            Bundle bundle8 = new Bundle();
            bundle8.putBinder(bm8.b, new zh0(arrayList));
            bundle8.putBinder(bm8.c, new zh0(arrayList2));
            bundle8.putIntArray(bm8.d, iArr);
            bundle.putBundle(J, bundle8);
        }
        int i17 = this.k;
        if (i17 != 0) {
            bundle.putInt(k0, i17);
        }
        w59 w59Var = w59.d;
        w59 w59Var2 = this.l;
        if (!w59Var2.equals(w59Var)) {
            Bundle bundle9 = new Bundle();
            int i18 = w59Var2.a;
            if (i18 != 0) {
                bundle9.putInt(w59.e, i18);
            }
            int i19 = w59Var2.b;
            if (i19 != 0) {
                bundle9.putInt(w59.f, i19);
            }
            float f = w59Var2.c;
            if (f != 1.0f) {
                bundle9.putFloat(w59.g, f);
            }
            bundle.putBundle(K, bundle9);
        }
        qp4 qp4Var = qp4.K;
        qp4 qp4Var2 = this.m;
        if (!qp4Var2.equals(qp4Var)) {
            bundle.putBundle(L, qp4Var2.c());
        }
        float f2 = this.n;
        if (f2 != 1.0f) {
            bundle.putFloat(M, f2);
        }
        ly lyVar = ly.h;
        ly lyVar2 = this.o;
        if (!lyVar2.equals(lyVar)) {
            lyVar2.getClass();
            Bundle bundle10 = new Bundle();
            bundle10.putInt(ly.i, lyVar2.a);
            bundle10.putInt(ly.j, lyVar2.b);
            bundle10.putInt(ly.k, lyVar2.c);
            bundle10.putInt(ly.l, lyVar2.d);
            bundle10.putInt(ly.m, lyVar2.e);
            bundle10.putBoolean(ly.n, lyVar2.f);
            bundle.putBundle(N, bundle10);
        }
        m81 m81Var = m81.d;
        m81 m81Var2 = this.p;
        if (!m81Var2.equals(m81Var)) {
            Bundle bundle11 = new Bundle();
            String str3 = m81.e;
            ImmutableList immutableList = m81Var2.a;
            lj3 lj3VarM = ImmutableList.m();
            for (int i20 = 0; i20 < immutableList.size(); i20++) {
                if (((l81) immutableList.get(i20)).d == null) {
                    lj3VarM.O((l81) immutableList.get(i20));
                }
            }
            ImmutableList immutableListS = lj3VarM.S();
            ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>(immutableListS.size());
            p0 p0VarListIterator = immutableListS.listIterator(0);
            while (p0VarListIterator.hasNext()) {
                l81 l81Var = (l81) p0VarListIterator.next();
                Bundle bundleC2 = l81Var.c();
                Bitmap bitmap = l81Var.d;
                if (bitmap != null) {
                    bundleC2.putParcelable(l81.w, bitmap);
                }
                arrayList5.add(bundleC2);
            }
            bundle11.putParcelableArrayList(str3, arrayList5);
            bundle11.putLong(m81.f, m81Var2.b);
            bundle.putBundle(d0, bundle11);
        }
        wl1 wl1Var = wl1.e;
        wl1 wl1Var2 = this.q;
        if (!wl1Var2.equals(wl1Var)) {
            Bundle bundle12 = new Bundle();
            int i21 = wl1Var2.a;
            if (i21 != 0) {
                bundle12.putInt(wl1.f, i21);
            }
            int i22 = wl1Var2.b;
            if (i22 != 0) {
                bundle12.putInt(wl1.g, i22);
            }
            int i23 = wl1Var2.c;
            if (i23 != 0) {
                bundle12.putInt(wl1.h, i23);
            }
            String str4 = wl1Var2.d;
            if (str4 != null) {
                bundle12.putString(wl1.i, str4);
            }
            bundle.putBundle(O, bundle12);
        }
        int i24 = this.r;
        if (i24 != 0) {
            bundle.putInt(P, i24);
        }
        boolean z10 = this.s;
        if (z10) {
            bundle.putBoolean(Q, z10);
        }
        boolean z11 = this.t;
        if (z11) {
            bundle.putBoolean(R, z11);
        }
        int i25 = this.u;
        if (i25 != 1) {
            bundle.putInt(S, i25);
        }
        int i26 = this.x;
        if (i26 != 0) {
            bundle.putInt(T, i26);
        }
        int i27 = this.y;
        if (i27 != 1) {
            bundle.putInt(U, i27);
        }
        boolean z12 = this.v;
        if (z12) {
            bundle.putBoolean(V, z12);
        }
        boolean z13 = this.w;
        if (z13) {
            bundle.putBoolean(W, z13);
        }
        qp4 qp4Var3 = qp4.K;
        qp4 qp4Var4 = this.z;
        if (!qp4Var4.equals(qp4Var3)) {
            bundle.putBundle(e0, qp4Var4.c());
        }
        long j15 = i < 6 ? j : 5000L;
        long j16 = this.A;
        if (j16 != j15) {
            bundle.putLong(f0, j16);
        }
        long j17 = i < 6 ? j : 15000L;
        long j18 = this.B;
        if (j18 != j17) {
            bundle.putLong(g0, j18);
        }
        long j19 = i < 6 ? j : 3000L;
        long j20 = this.C;
        if (j20 != j19) {
            bundle.putLong(h0, j20);
        }
        rp8 rp8Var = rp8.b;
        rp8 rp8Var2 = this.D;
        if (!rp8Var2.equals(rp8Var)) {
            Bundle bundle13 = new Bundle();
            bundle13.putParcelableArrayList(rp8.c, yh0.O(rp8Var2.a, new p58(11)));
            bundle.putBundle(j0, bundle13);
        }
        hp8 hp8Var = hp8.F;
        hp8 hp8Var2 = this.E;
        if (!hp8Var2.equals(hp8Var)) {
            bundle.putBundle(i0, hp8Var2.c());
        }
        return bundle;
    }
}
