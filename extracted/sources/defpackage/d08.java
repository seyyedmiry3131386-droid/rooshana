package defpackage;

import androidx.compose.runtime.snapshots.SnapshotApplyConflictException;

/* JADX INFO: loaded from: classes.dex */
public final class d08 extends t17 {
    public final vb5 d;

    public d08(vb5 vb5Var) {
        this.d = vb5Var;
    }

    @Override // defpackage.t17
    public final void a() throws SnapshotApplyConflictException {
        this.d.c();
        throw new SnapshotApplyConflictException();
    }
}
