package defpackage;

import androidx.compose.runtime.snapshots.a;

/* JADX INFO: loaded from: classes.dex */
public final class qv6 extends c08 {
    public final dp2 e;
    public int f;

    public qv6(long j, a aVar, dp2 dp2Var) {
        super(j, aVar);
        this.e = dp2Var;
        this.f = 1;
    }

    @Override // defpackage.c08
    public final void c() {
        if (this.c) {
            return;
        }
        l();
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
        this.f++;
    }

    @Override // defpackage.c08
    public final void l() {
        int i = this.f - 1;
        this.f = i;
        if (i == 0) {
            a();
        }
    }

    @Override // defpackage.c08
    public final void n(e58 e58Var) {
        vd7 vd7Var = g08.a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // defpackage.c08
    public final c08 u(dp2 dp2Var) {
        g08.c(this);
        return new fm5(this.b, this.a, g08.k(dp2Var, this.e, true), this);
    }

    @Override // defpackage.c08
    public final void m() {
    }
}
