package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class l58 extends g58 {
    public r66 c;
    public int d;

    public l58(long j, r66 r66Var) {
        super(j);
        this.c = r66Var;
    }

    @Override // defpackage.g58
    public final void a(g58 g58Var) {
        synchronized (y40.d) {
            js3.n(g58Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.StateSetStateRecord>");
            this.c = ((l58) g58Var).c;
            this.d = ((l58) g58Var).d;
        }
    }

    @Override // defpackage.g58
    public final g58 b(long j) {
        return new l58(j, this.c);
    }
}
