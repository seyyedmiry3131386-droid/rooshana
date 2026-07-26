package defpackage;

import android.content.Context;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class n52 {
    public final Context a;
    public final td8 b;
    public vb8 c;
    public vb8 d;
    public vb8 e;
    public vb8 f;
    public final vb8 g;
    public final yp2 h;
    public final Looper i;
    public final int j;
    public final ly k;
    public final int l;
    public final boolean m;
    public final ll7 n;
    public final gh7 o;
    public final long p;
    public final long q;
    public final long r;
    public final wf1 s;
    public final long t;
    public final long u;
    public final boolean v;
    public boolean w;
    public final String x;

    public n52(Context context) {
        this(context, new bz(context, 1), new bz(context, 2), new bz(context, 3), new ya1(2), new bz(context, 4), new vv1(10));
    }

    public final e62 a() {
        vy2.s(!this.w);
        this.w = true;
        return new e62(this);
    }

    public final void b(ig1 ig1Var) {
        vy2.s(!this.w);
        this.d = new fg1(1, ig1Var);
    }

    public final void c(qg1 qg1Var) {
        vy2.s(!this.w);
        this.c = new fg1(3, qg1Var);
    }

    public final void d(ci1 ci1Var) {
        vy2.s(!this.w);
        this.e = new fg1(4, ci1Var);
    }

    public n52(Context context, vb8 vb8Var, vb8 vb8Var2, vb8 vb8Var3, vb8 vb8Var4, vb8 vb8Var5, yp2 yp2Var) {
        context.getClass();
        this.a = context;
        this.c = vb8Var;
        this.d = vb8Var2;
        this.e = vb8Var3;
        this.f = vb8Var4;
        this.g = vb8Var5;
        this.h = yp2Var;
        this.i = j29.x();
        this.k = ly.h;
        this.l = 1;
        this.m = true;
        this.n = ll7.c;
        this.p = 5000L;
        this.q = 15000L;
        this.r = 3000L;
        this.o = gh7.b;
        this.s = new wf1(j29.V(20L), j29.V(500L));
        this.b = td8.a;
        this.t = 500L;
        this.u = 2000L;
        this.v = true;
        this.x = "";
        this.j = -1000;
        new fv();
    }
}
