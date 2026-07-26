package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class a58 extends g58 {
    public w1 c;
    public int d;
    public int e;

    public a58(long j, w1 w1Var) {
        super(j);
        this.c = w1Var;
    }

    @Override // defpackage.g58
    public final void a(g58 g58Var) {
        synchronized (hs9.f) {
            js3.n(g58Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.StateListStateRecord>");
            this.c = ((a58) g58Var).c;
            this.d = ((a58) g58Var).d;
            this.e = ((a58) g58Var).e;
        }
    }

    @Override // defpackage.g58
    public final g58 b(long j) {
        return new a58(j, this.c);
    }
}
