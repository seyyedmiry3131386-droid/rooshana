package defpackage;

import androidx.compose.runtime.snapshots.a;

/* JADX INFO: loaded from: classes.dex */
public final class yr8 extends vb5 {
    public final vb5 o;
    public final boolean p;
    public final boolean q;
    public dp2 r;
    public dp2 s;
    public final long t;

    /* JADX WARN: Illegal instructions before constructor call */
    public yr8(vb5 vb5Var, dp2 dp2Var, dp2 dp2Var2, boolean z, boolean z2) {
        dp2 dp2VarI;
        dp2 dp2VarE;
        vd7 vd7Var = g08.a;
        super(0L, a.e, g08.k(dp2Var, (vb5Var == null || (dp2VarE = vb5Var.e()) == null) ? g08.j.e : dp2VarE, z), g08.l(dp2Var2, (vb5Var == null || (dp2VarI = vb5Var.i()) == null) ? g08.j.f : dp2VarI));
        this.o = vb5Var;
        this.p = z;
        this.q = z2;
        this.r = this.e;
        this.s = this.f;
        this.t = o37.c();
    }

    @Override // defpackage.vb5
    public final void C(sb5 sb5Var) {
        gu9.G();
        throw null;
    }

    @Override // defpackage.vb5
    public final vb5 D(dp2 dp2Var, dp2 dp2Var2) {
        dp2 dp2VarK = g08.k(dp2Var, this.r, true);
        dp2 dp2VarL = g08.l(dp2Var2, this.s);
        return !this.p ? new yr8(E().D(null, dp2VarL), dp2VarK, dp2VarL, false, true) : E().D(dp2VarK, dp2VarL);
    }

    public final vb5 E() {
        vb5 vb5Var = this.o;
        return vb5Var == null ? g08.j : vb5Var;
    }

    @Override // defpackage.vb5, defpackage.c08
    public final void c() {
        vb5 vb5Var;
        this.c = true;
        if (!this.q || (vb5Var = this.o) == null) {
            return;
        }
        vb5Var.c();
    }

    @Override // defpackage.c08
    public final a d() {
        return E().d();
    }

    @Override // defpackage.vb5, defpackage.c08
    public final dp2 e() {
        return this.r;
    }

    @Override // defpackage.vb5, defpackage.c08
    public final boolean f() {
        return E().f();
    }

    @Override // defpackage.c08
    public final long g() {
        return E().g();
    }

    @Override // defpackage.vb5, defpackage.c08
    public final int h() {
        return E().h();
    }

    @Override // defpackage.vb5, defpackage.c08
    public final dp2 i() {
        return this.s;
    }

    @Override // defpackage.vb5, defpackage.c08
    public final void k() {
        gu9.G();
        throw null;
    }

    @Override // defpackage.vb5, defpackage.c08
    public final void l() {
        gu9.G();
        throw null;
    }

    @Override // defpackage.vb5, defpackage.c08
    public final void m() {
        E().m();
    }

    @Override // defpackage.vb5, defpackage.c08
    public final void n(e58 e58Var) {
        E().n(e58Var);
    }

    @Override // defpackage.c08
    public final void r(a aVar) {
        gu9.G();
        throw null;
    }

    @Override // defpackage.c08
    public final void s(long j) {
        gu9.G();
        throw null;
    }

    @Override // defpackage.vb5, defpackage.c08
    public final void t(int i) {
        E().t(i);
    }

    @Override // defpackage.vb5, defpackage.c08
    public final c08 u(dp2 dp2Var) {
        dp2 dp2VarK = g08.k(dp2Var, this.r, true);
        return !this.p ? g08.g(E().u(null), dp2VarK, true) : E().u(dp2VarK);
    }

    @Override // defpackage.vb5
    public final t17 w() {
        return E().w();
    }

    @Override // defpackage.vb5
    public final sb5 x() {
        return E().x();
    }

    @Override // defpackage.vb5
    /* JADX INFO: renamed from: y */
    public final dp2 e() {
        return this.r;
    }
}
