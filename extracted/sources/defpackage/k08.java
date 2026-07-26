package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class k08 extends g58 {
    public float c;

    public k08(float f, long j) {
        super(j);
        this.c = f;
    }

    @Override // defpackage.g58
    public final void a(g58 g58Var) {
        js3.n(g58Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        this.c = ((k08) g58Var).c;
    }

    @Override // defpackage.g58
    public final g58 b(long j) {
        return new k08(this.c, j);
    }
}
