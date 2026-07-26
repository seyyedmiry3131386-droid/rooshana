package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vt2 extends vb5 {
    @Override // defpackage.vb5
    public final vb5 D(dp2 dp2Var, dp2 dp2Var2) {
        return (vb5) ((c08) g08.e(new y8(8, new wb(dp2Var, dp2Var2, 4))));
    }

    @Override // defpackage.vb5, defpackage.c08
    public final void c() {
        synchronized (g08.c) {
            o();
        }
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
        g08.a();
    }

    @Override // defpackage.vb5, defpackage.c08
    public final c08 u(dp2 dp2Var) {
        return (qv6) ((c08) g08.e(new y8(8, new ut2(0, dp2Var))));
    }

    @Override // defpackage.vb5
    public final t17 w() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }
}
