package androidx.compose.ui.node;

import defpackage.a18;
import defpackage.dp2;
import defpackage.hy5;
import defpackage.js3;
import defpackage.tx8;
import defpackage.z08;
import defpackage.zb5;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class p {
    public final a18 a;
    public final dp2 b = new dp2() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLookaheadMeasure$1
        @Override // defpackage.dp2
        public final Object invoke(Object obj) {
            h hVar = (h) obj;
            if (hVar.U()) {
                h.q0(hVar, false, 7);
            }
            return tx8.a;
        }
    };
    public final dp2 c = new dp2() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingMeasure$1
        @Override // defpackage.dp2
        public final Object invoke(Object obj) {
            h hVar = (h) obj;
            if (hVar.U()) {
                h.s0(hVar, false, 7);
            }
            return tx8.a;
        }
    };
    public final dp2 d = new dp2() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingSemantics$1
        @Override // defpackage.dp2
        public final Object invoke(Object obj) {
            h hVar = (h) obj;
            if (hVar.U()) {
                hVar.S();
            }
            return tx8.a;
        }
    };
    public final dp2 e = new dp2() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1
        @Override // defpackage.dp2
        public final Object invoke(Object obj) {
            h hVar = (h) obj;
            if (hVar.U()) {
                hVar.r0(false);
            }
            return tx8.a;
        }
    };
    public final dp2 f = new dp2() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayoutModifier$1
        @Override // defpackage.dp2
        public final Object invoke(Object obj) {
            h hVar = (h) obj;
            if (hVar.U()) {
                hVar.r0(false);
            }
            return tx8.a;
        }
    };
    public final dp2 g = new dp2() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayoutModifierInLookahead$1
        @Override // defpackage.dp2
        public final Object invoke(Object obj) {
            h hVar = (h) obj;
            if (hVar.U()) {
                hVar.p0(false);
            }
            return tx8.a;
        }
    };
    public final dp2 h = new dp2() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLookahead$1
        @Override // defpackage.dp2
        public final Object invoke(Object obj) {
            h hVar = (h) obj;
            if (hVar.U()) {
                hVar.p0(false);
            }
            return tx8.a;
        }
    };

    public p(dp2 dp2Var) {
        this.a = new a18(dp2Var);
    }

    public final void a() {
        a18 a18Var = this.a;
        OwnerSnapshotObserver$clearInvalidObservations$1 ownerSnapshotObserver$clearInvalidObservations$1 = new dp2() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$clearInvalidObservations$1
            @Override // defpackage.dp2
            public final Object invoke(Object obj) {
                js3.n(obj, "null cannot be cast to non-null type androidx.compose.ui.node.OwnerScope");
                return Boolean.valueOf(!((hy5) obj).p());
            }
        };
        synchronized (a18Var.g) {
            try {
                zb5 zb5Var = a18Var.f;
                int i = zb5Var.c;
                int i2 = 0;
                for (int i3 = 0; i3 < i; i3++) {
                    z08 z08Var = (z08) zb5Var.a[i3];
                    z08Var.d(ownerSnapshotObserver$clearInvalidObservations$1);
                    if (!z08Var.f.j()) {
                        i2++;
                    } else if (i2 > 0) {
                        Object[] objArr = zb5Var.a;
                        objArr[i3 - i2] = objArr[i3];
                    }
                }
                int i4 = i - i2;
                Arrays.fill(zb5Var.a, i4, i, (Object) null);
                zb5Var.c = i4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
