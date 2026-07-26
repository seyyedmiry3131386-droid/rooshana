package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class m08 extends g58 {
    public int c;

    public m08(int i, long j) {
        super(j);
        this.c = i;
    }

    @Override // defpackage.g58
    public final void a(g58 g58Var) {
        js3.n(g58Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        this.c = ((m08) g58Var).c;
    }

    @Override // defpackage.g58
    public final g58 b(long j) {
        return new m08(this.c, j);
    }
}
