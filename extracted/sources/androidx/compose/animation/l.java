package androidx.compose.animation;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import defpackage.af4;
import defpackage.bp2;
import defpackage.d58;
import defpackage.du7;
import defpackage.e71;
import defpackage.tx8;
import defpackage.wb5;
import defpackage.y08;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class l implements af4 {
    public final wb5 a = androidx.compose.runtime.g.h(Boolean.FALSE);
    public final bp2 b = new bp2() { // from class: androidx.compose.animation.SharedTransitionScopeImpl$observeAnimatingBlock$1
        {
            super(0);
        }

        @Override // defpackage.bp2
        public final Object invoke() {
            y08 y08Var = this.g.d;
            if (!y08Var.isEmpty()) {
                Iterator it = y08Var.b.iterator();
                if (((d58) it).hasNext()) {
                    ((du7) ((Map.Entry) ((d58) it).next()).getValue()).getClass();
                    throw null;
                }
            }
            return tx8.a;
        }
    };
    public final SnapshotStateList c = new SnapshotStateList();
    public final y08 d = new y08();

    public l(af4 af4Var, e71 e71Var) {
    }
}
