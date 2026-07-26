package defpackage;

import androidx.compose.runtime.snapshots.a;

/* JADX INFO: loaded from: classes.dex */
public final class zr8 extends c08 {
    public final c08 e;
    public final boolean f;
    public final boolean g;
    public dp2 h;
    public final long i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zr8(c08 c08Var, dp2 dp2Var, boolean z, boolean z2) {
        dp2 dp2VarE;
        super(0L, a.e);
        vd7 vd7Var = g08.a;
        this.e = c08Var;
        this.f = z;
        this.g = z2;
        this.h = g08.k(dp2Var, (c08Var == null || (dp2VarE = c08Var.e()) == null) ? g08.j.e : dp2VarE, z);
        this.i = o37.c();
    }

    @Override // defpackage.c08
    public final void c() {
        c08 c08Var;
        this.c = true;
        if (!this.g || (c08Var = this.e) == null) {
            return;
        }
        c08Var.c();
    }

    @Override // defpackage.c08
    public final a d() {
        return v().d();
    }

    @Override // defpackage.c08
    public final dp2 e() {
        return this.h;
    }

    @Override // defpackage.c08
    public final boolean f() {
        return v().f();
    }

    @Override // defpackage.c08
    public final long g() {
        return v().g();
    }

    @Override // defpackage.c08
    public final dp2 i() {
        return null;
    }

    @Override // defpackage.c08
    public final void k() {
        gu9.G();
        throw null;
    }

    @Override // defpackage.c08
    public final void l() {
        gu9.G();
        throw null;
    }

    @Override // defpackage.c08
    public final void m() {
        v().m();
    }

    @Override // defpackage.c08
    public final void n(e58 e58Var) {
        v().n(e58Var);
    }

    @Override // defpackage.c08
    public final c08 u(dp2 dp2Var) {
        dp2 dp2VarK = g08.k(dp2Var, this.h, true);
        return !this.f ? g08.g(v().u(null), dp2VarK, true) : v().u(dp2VarK);
    }

    public final c08 v() {
        c08 c08Var = this.e;
        return c08Var == null ? g08.j : c08Var;
    }
}
