package defpackage;

import androidx.compose.ui.unit.LayoutDirection;

/* JADX INFO: loaded from: classes.dex */
public final class o87 implements qj1 {
    public int a;
    public float b = 1.0f;
    public float c = 1.0f;
    public float d = 1.0f;
    public float e;
    public long f;
    public long g;
    public float h;
    public float i;
    public long j;
    public xr7 k;
    public boolean l;
    public int m;
    public long n;
    public qj1 o;
    public LayoutDirection p;
    public id0 q;
    public int r;
    public rq4 s;

    public o87() {
        long j = gv2.a;
        this.f = j;
        this.g = j;
        this.i = 8.0f;
        this.j = lq8.b;
        this.k = tt3.d;
        this.m = 0;
        this.n = 9205357640488583168L;
        this.o = yh0.c();
        this.p = LayoutDirection.a;
        this.r = 3;
    }

    @Override // defpackage.qj1
    public final long F(float f) {
        return dw1.d(this, L(f));
    }

    @Override // defpackage.qj1
    public final float J(int i) {
        return i / getDensity();
    }

    @Override // defpackage.qj1
    public final float L(float f) {
        return f / getDensity();
    }

    @Override // defpackage.qj1
    public final float O() {
        return this.o.O();
    }

    @Override // defpackage.qj1
    public final float S(float f) {
        return getDensity() * f;
    }

    public final void a() {
        i(1.0f);
        j(1.0f);
        b(1.0f);
        k(0.0f);
        long j = gv2.a;
        c(j);
        m(j);
        h(0.0f);
        if (this.i != 8.0f) {
            this.a |= 2048;
            this.i = 8.0f;
        }
        n(lq8.b);
        l(tt3.d);
        e(false);
        g(null);
        if (this.r != 3) {
            this.a |= 524288;
            this.r = 3;
        }
        f(0);
        this.n = 9205357640488583168L;
        this.s = null;
        this.a = 0;
    }

    public final void b(float f) {
        if (this.d == f) {
            return;
        }
        this.a |= 4;
        this.d = f;
    }

    @Override // defpackage.qj1
    public final /* synthetic */ int b0(float f) {
        return o40.a(this, f);
    }

    public final void c(long j) {
        if (zu0.c(this.f, j)) {
            return;
        }
        this.a |= 64;
        this.f = j;
    }

    public final void e(boolean z) {
        if (this.l != z) {
            this.a |= 16384;
            this.l = z;
        }
    }

    public final void f(int i) {
        if (this.m == i) {
            return;
        }
        this.a |= 32768;
        this.m = i;
    }

    public final void g(id0 id0Var) {
        if (js3.i(this.q, id0Var)) {
            return;
        }
        this.a |= 131072;
        this.q = id0Var;
    }

    @Override // defpackage.qj1
    public final float getDensity() {
        return this.o.getDensity();
    }

    public final void h(float f) {
        if (this.h == f) {
            return;
        }
        this.a |= 1024;
        this.h = f;
    }

    @Override // defpackage.qj1
    public final /* synthetic */ long h0(long j) {
        return o40.d(j, this);
    }

    public final void i(float f) {
        if (this.b == f) {
            return;
        }
        this.a |= 1;
        this.b = f;
    }

    public final void j(float f) {
        if (this.c == f) {
            return;
        }
        this.a |= 2;
        this.c = f;
    }

    @Override // defpackage.qj1
    public final /* synthetic */ float j0(long j) {
        return o40.c(j, this);
    }

    public final void k(float f) {
        if (this.e == f) {
            return;
        }
        this.a |= 32;
        this.e = f;
    }

    public final void l(xr7 xr7Var) {
        if (js3.i(this.k, xr7Var)) {
            return;
        }
        this.a |= 8192;
        this.k = xr7Var;
    }

    public final void m(long j) {
        if (zu0.c(this.g, j)) {
            return;
        }
        this.a |= 128;
        this.g = j;
    }

    public final void n(long j) {
        if (lq8.a(this.j, j)) {
            return;
        }
        this.a |= 4096;
        this.j = j;
    }

    @Override // defpackage.qj1
    public final /* synthetic */ long o(long j) {
        return o40.b(j, this);
    }

    @Override // defpackage.qj1
    public final /* synthetic */ float s(long j) {
        return dw1.b(j, this);
    }
}
