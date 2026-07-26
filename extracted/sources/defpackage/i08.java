package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class i08 extends g58 {
    public double c;

    public i08(long j, double d) {
        super(j);
        this.c = d;
    }

    @Override // defpackage.g58
    public final void a(g58 g58Var) {
        js3.n(g58Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableDoubleStateImpl.DoubleStateStateRecord");
        this.c = ((i08) g58Var).c;
    }

    @Override // defpackage.g58
    public final g58 b(long j) {
        return new i08(j, this.c);
    }
}
