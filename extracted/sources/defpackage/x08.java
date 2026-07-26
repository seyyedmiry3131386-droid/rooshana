package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class x08 extends g58 {
    public f66 c;
    public int d;

    public x08(long j, f66 f66Var) {
        super(j);
        this.c = f66Var;
    }

    @Override // defpackage.g58
    public final void a(g58 g58Var) {
        js3.n(g58Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord, V of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord>");
        x08 x08Var = (x08) g58Var;
        synchronized (gu9.c) {
            this.c = x08Var.c;
            this.d = x08Var.d;
        }
    }

    @Override // defpackage.g58
    public final g58 b(long j) {
        return new x08(j, this.c);
    }
}
