package defpackage;

import android.os.Bundle;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.primitives.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public class hp8 {
    public static final hp8 F = new hp8(new gp8());
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
    public static final String m0;
    public static final String n0;
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final ImmutableMap D;
    public final ImmutableSet E;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final boolean k;
    public final boolean l;
    public final ImmutableList m;
    public final ImmutableList n;
    public final int o;
    public final ImmutableList p;
    public final int q;
    public final int r;
    public final int s;
    public final ImmutableList t;
    public final fp8 u;
    public final ImmutableList v;
    public final int w;
    public final boolean x;
    public final int y;
    public final boolean z;

    static {
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
        m0 = Integer.toString(33, 36);
        n0 = Integer.toString(34, 36);
    }

    public hp8(gp8 gp8Var) {
        this.a = gp8Var.a;
        this.b = gp8Var.b;
        this.c = gp8Var.c;
        this.d = gp8Var.d;
        this.e = gp8Var.e;
        this.f = gp8Var.f;
        this.g = gp8Var.g;
        this.h = gp8Var.h;
        this.i = gp8Var.i;
        this.j = gp8Var.j;
        this.k = gp8Var.k;
        this.l = gp8Var.l;
        this.m = gp8Var.m;
        this.n = gp8Var.n;
        this.o = gp8Var.o;
        this.p = gp8Var.p;
        this.q = gp8Var.q;
        this.r = gp8Var.r;
        this.s = gp8Var.s;
        this.t = gp8Var.t;
        this.u = gp8Var.u;
        this.v = gp8Var.v;
        this.w = gp8Var.w;
        this.x = gp8Var.x;
        this.y = gp8Var.y;
        this.z = gp8Var.z;
        this.A = gp8Var.A;
        this.B = gp8Var.B;
        this.C = gp8Var.C;
        this.D = ImmutableMap.b(gp8Var.D);
        this.E = ImmutableSet.n(gp8Var.E);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static hp8 b(Bundle bundle) {
        fp8 fp8Var;
        ImmutableList immutableListS;
        gp8 gp8Var = new gp8();
        hp8 hp8Var = F;
        gp8Var.a = bundle.getInt(L, hp8Var.a);
        gp8Var.b = bundle.getInt(M, hp8Var.b);
        gp8Var.c = bundle.getInt(N, hp8Var.c);
        gp8Var.d = bundle.getInt(O, hp8Var.d);
        gp8Var.e = bundle.getInt(P, hp8Var.e);
        gp8Var.f = bundle.getInt(Q, hp8Var.f);
        gp8Var.g = bundle.getInt(R, hp8Var.g);
        gp8Var.h = bundle.getInt(S, hp8Var.h);
        gp8Var.i = bundle.getInt(T, hp8Var.i);
        int i = bundle.getInt(U, hp8Var.j);
        gp8Var.j = i;
        gp8Var.k = gp8Var.i == Integer.MAX_VALUE && i == Integer.MAX_VALUE && bundle.getBoolean(m0, hp8Var.k);
        gp8Var.l = bundle.getBoolean(V, hp8Var.l);
        gp8Var.m = ImmutableList.o((String[]) gu9.p(bundle.getStringArray(W), new String[0]));
        gp8Var.n = ImmutableList.o((String[]) gu9.p(bundle.getStringArray(l0), new String[0]));
        gp8Var.o = bundle.getInt(e0, hp8Var.o);
        gp8Var.p = gp8.f((String[]) gu9.p(bundle.getStringArray(G), new String[0]));
        gp8Var.q = bundle.getInt(H, hp8Var.q);
        gp8Var.r = bundle.getInt(X, hp8Var.r);
        gp8Var.s = bundle.getInt(Y, hp8Var.s);
        gp8Var.t = ImmutableList.o((String[]) gu9.p(bundle.getStringArray(Z), new String[0]));
        Bundle bundle2 = bundle.getBundle(j0);
        if (bundle2 != null) {
            wn3 wn3Var = new wn3();
            String str = fp8.e;
            fp8 fp8Var2 = fp8.d;
            wn3Var.a = bundle2.getInt(str, fp8Var2.a);
            wn3Var.b = bundle2.getBoolean(fp8.f, fp8Var2.b);
            wn3Var.c = bundle2.getBoolean(fp8.g, fp8Var2.c);
            fp8Var = new fp8(wn3Var);
        } else {
            wn3 wn3Var2 = new wn3();
            fp8 fp8Var3 = fp8.d;
            wn3Var2.a = bundle.getInt(g0, fp8Var3.a);
            wn3Var2.b = bundle.getBoolean(h0, fp8Var3.b);
            wn3Var2.c = bundle.getBoolean(i0, fp8Var3.c);
            fp8Var = new fp8(wn3Var2);
        }
        gp8Var.u = fp8Var;
        gp8Var.v = gp8.f((String[]) gu9.p(bundle.getStringArray(I), new String[0]));
        gp8Var.w = bundle.getInt(J, hp8Var.w);
        gp8Var.x = gp8Var.v.isEmpty() && gp8Var.w == 0 && bundle.getBoolean(n0, hp8Var.x);
        gp8Var.y = bundle.getInt(f0, hp8Var.y);
        gp8Var.z = bundle.getBoolean(K, hp8Var.z);
        gp8Var.A = bundle.getBoolean(k0, hp8Var.A);
        gp8Var.B = bundle.getBoolean(a0, hp8Var.B);
        gp8Var.C = bundle.getBoolean(b0, hp8Var.C);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(c0);
        if (parcelableArrayList == null) {
            immutableListS = ImmutableList.q();
        } else {
            lj3 lj3VarM = ImmutableList.m();
            for (int i2 = 0; i2 < parcelableArrayList.size(); i2++) {
                Bundle bundle3 = (Bundle) parcelableArrayList.get(i2);
                bundle3.getClass();
                Bundle bundle4 = bundle3.getBundle(ep8.c);
                bundle4.getClass();
                yo8 yo8VarA = yo8.a(bundle4);
                int[] intArray = bundle3.getIntArray(ep8.d);
                intArray.getClass();
                lj3VarM.O(new ep8(yo8VarA, a.a(intArray)));
            }
            immutableListS = lj3VarM.S();
        }
        gp8Var.D = new HashMap();
        for (int i3 = 0; i3 < immutableListS.size(); i3++) {
            ep8 ep8Var = (ep8) immutableListS.get(i3);
            gp8Var.D.put(ep8Var.a, ep8Var);
        }
        int[] iArr = (int[]) gu9.p(bundle.getIntArray(d0), new int[0]);
        gp8Var.E = new HashSet();
        for (int i4 : iArr) {
            gp8Var.E.add(Integer.valueOf(i4));
        }
        return new hp8(gp8Var);
    }

    public gp8 a() {
        gp8 gp8Var = new gp8();
        gp8Var.e(this);
        return gp8Var;
    }

    public Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(L, this.a);
        bundle.putInt(M, this.b);
        bundle.putInt(N, this.c);
        bundle.putInt(O, this.d);
        bundle.putInt(P, this.e);
        bundle.putInt(Q, this.f);
        bundle.putInt(R, this.g);
        bundle.putInt(S, this.h);
        bundle.putInt(T, this.i);
        bundle.putInt(U, this.j);
        bundle.putBoolean(m0, this.k);
        bundle.putBoolean(V, this.l);
        bundle.putStringArray(W, (String[]) this.m.toArray(new String[0]));
        bundle.putStringArray(l0, (String[]) this.n.toArray(new String[0]));
        bundle.putInt(e0, this.o);
        bundle.putStringArray(G, (String[]) this.p.toArray(new String[0]));
        bundle.putInt(H, this.q);
        bundle.putInt(X, this.r);
        bundle.putInt(Y, this.s);
        bundle.putStringArray(Z, (String[]) this.t.toArray(new String[0]));
        bundle.putStringArray(I, (String[]) this.v.toArray(new String[0]));
        bundle.putInt(J, this.w);
        bundle.putBoolean(n0, this.x);
        bundle.putInt(f0, this.y);
        bundle.putBoolean(K, this.z);
        fp8 fp8Var = this.u;
        bundle.putInt(g0, fp8Var.a);
        bundle.putBoolean(h0, fp8Var.b);
        bundle.putBoolean(i0, fp8Var.c);
        fp8Var.getClass();
        Bundle bundle2 = new Bundle();
        bundle2.putInt(fp8.e, fp8Var.a);
        bundle2.putBoolean(fp8.f, fp8Var.b);
        bundle2.putBoolean(fp8.g, fp8Var.c);
        bundle.putBundle(j0, bundle2);
        bundle.putBoolean(k0, this.A);
        bundle.putBoolean(a0, this.B);
        bundle.putBoolean(b0, this.C);
        bundle.putParcelableArrayList(c0, yh0.O(this.D.values(), new p58(10)));
        bundle.putIntArray(d0, a.g(this.E));
        return bundle;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        hp8 hp8Var = (hp8) obj;
        return this.a == hp8Var.a && this.b == hp8Var.b && this.c == hp8Var.c && this.d == hp8Var.d && this.e == hp8Var.e && this.f == hp8Var.f && this.g == hp8Var.g && this.h == hp8Var.h && this.l == hp8Var.l && this.i == hp8Var.i && this.j == hp8Var.j && this.k == hp8Var.k && this.m.equals(hp8Var.m) && this.n.equals(hp8Var.n) && this.o == hp8Var.o && this.p.equals(hp8Var.p) && this.q == hp8Var.q && this.r == hp8Var.r && this.s == hp8Var.s && this.t.equals(hp8Var.t) && this.u.equals(hp8Var.u) && this.v.equals(hp8Var.v) && this.w == hp8Var.w && this.x == hp8Var.x && this.y == hp8Var.y && this.z == hp8Var.z && this.A == hp8Var.A && this.B == hp8Var.B && this.C == hp8Var.C && this.D.equals(hp8Var.D) && this.E.equals(hp8Var.E);
    }

    public int hashCode() {
        return this.E.hashCode() + ((this.D.hashCode() + ((((((((((((((((this.v.hashCode() + ((this.u.hashCode() + ((this.t.hashCode() + ((((((((this.p.hashCode() + ((((this.n.hashCode() + ((this.m.hashCode() + ((((((((((((((((((((((((this.a + 31) * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + (this.l ? 1 : 0)) * 31) + this.i) * 31) + this.j) * 31) + (this.k ? 1 : 0)) * 31)) * 31)) * 31) + this.o) * 31)) * 31) + this.q) * 31) + this.r) * 31) + this.s) * 31)) * 31)) * 31)) * 31) + this.w) * 31) + (this.x ? 1 : 0)) * 31) + this.y) * 31) + (this.z ? 1 : 0)) * 31) + (this.A ? 1 : 0)) * 31) + (this.B ? 1 : 0)) * 31) + (this.C ? 1 : 0)) * 31)) * 31);
    }
}
