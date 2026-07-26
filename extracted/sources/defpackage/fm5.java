package defpackage;

import androidx.compose.runtime.snapshots.a;

/* JADX INFO: loaded from: classes.dex */
public final class fm5 extends c08 {
    public final dp2 e;
    public final c08 f;

    public fm5(long j, a aVar, dp2 dp2Var, c08 c08Var) {
        super(j, aVar);
        this.e = dp2Var;
        this.f = c08Var;
        c08Var.k();
    }

    @Override // defpackage.c08
    public final void c() {
        c08 c08Var = this.f;
        if (this.c) {
            return;
        }
        if (this.b != c08Var.g()) {
            a();
        }
        c08Var.l();
        this.c = true;
        synchronized (g08.c) {
            o();
        }
    }

    @Override // defpackage.c08
    public final dp2 e() {
        return this.e;
    }

    @Override // defpackage.c08
    public final boolean f() {
        return true;
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
    public final void n(e58 e58Var) {
        vd7 vd7Var = g08.a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // defpackage.c08
    public final c08 u(dp2 dp2Var) {
        return new fm5(this.b, this.a, g08.k(dp2Var, this.e, true), this.f);
    }

    @Override // defpackage.c08
    public final void m() {
    }
}
