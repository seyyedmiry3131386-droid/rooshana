package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class r08 extends g58 {
    public Object c;

    public r08(long j, Object obj) {
        super(j);
        this.c = obj;
    }

    @Override // defpackage.g58
    public final void a(g58 g58Var) {
        js3.n(g58Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord>");
        this.c = ((r08) g58Var).c;
    }

    @Override // defpackage.g58
    public final g58 b(long j) {
        return new r08(g08.j().g(), this.c);
    }
}
