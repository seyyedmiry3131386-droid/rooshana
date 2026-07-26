package defpackage;

import androidx.compose.runtime.g;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes3.dex */
public final class dl5 implements qf7 {
    public final SnapshotStateList a = new SnapshotStateList();

    public dl5() {
        g.c(new pz(this, 11));
    }

    public final void a(fr frVar) {
        boolean z = frVar instanceof cr;
        SnapshotStateList snapshotStateList = this.a;
        if (z) {
            snapshotStateList.add(((cr) frVar).a);
            return;
        }
        if (frVar instanceof dr) {
            a.G0(snapshotStateList);
        } else {
            if (!(frVar instanceof er)) {
                throw new NoWhenBranchMatchedException();
            }
            a.G0(snapshotStateList);
            snapshotStateList.add(((er) frVar).a);
        }
    }
}
