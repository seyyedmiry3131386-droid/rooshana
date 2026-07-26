package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class o08 extends g58 {
    public long c;

    public o08(long j, long j2) {
        super(j);
        this.c = j2;
    }

    @Override // defpackage.g58
    public final void a(g58 g58Var) {
        js3.n(g58Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        this.c = ((o08) g58Var).c;
    }

    @Override // defpackage.g58
    public final g58 b(long j) {
        return new o08(j, this.c);
    }
}
