package defpackage;

import androidx.compose.runtime.internal.a;
import androidx.compose.runtime.snapshots.SnapshotStateList;

/* JADX INFO: loaded from: classes.dex */
public final class b51 {
    public final SnapshotStateList a = new SnapshotStateList();

    public static void b(b51 b51Var, qp2 qp2Var, a aVar, bp2 bp2Var, int i) {
        if ((i & 8) != 0) {
            aVar = null;
        }
        b51Var.a.add(new a(-1789283891, new z24(qp2Var, b51Var, aVar, bp2Var, 1), true));
    }

    public final void a(a51 a51Var, qz0 qz0Var, int i) {
        qz0Var.c0(-798501095);
        int i2 = (qz0Var.f(a51Var) ? 4 : 2) | i | (qz0Var.f(this) ? 32 : 16);
        if (qz0Var.R(i2 & 1, (i2 & 19) != 18)) {
            SnapshotStateList snapshotStateList = this.a;
            int size = snapshotStateList.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((rp2) snapshotStateList.get(i3)).a(a51Var, qz0Var, Integer.valueOf(i2 & 14));
            }
        } else {
            qz0Var.U();
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new iz(this, a51Var, i, 5);
        }
    }
}
