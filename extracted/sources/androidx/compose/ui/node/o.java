package androidx.compose.ui.node;

import defpackage.dp2;
import defpackage.gx4;
import defpackage.hy5;
import defpackage.jr5;
import defpackage.tx8;

/* JADX INFO: loaded from: classes.dex */
public final class o implements hy5 {
    public static final dp2 b = new dp2() { // from class: androidx.compose.ui.node.ObserverNodeOwnerScope$Companion$OnObserveReadsChanged$1
        @Override // defpackage.dp2
        public final Object invoke(Object obj) {
            o oVar = (o) obj;
            if (oVar.p()) {
                oVar.a.Y();
            }
            return tx8.a;
        }
    };
    public final jr5 a;

    public o(jr5 jr5Var) {
        this.a = jr5Var;
    }

    @Override // defpackage.hy5
    public final boolean p() {
        return ((gx4) this.a).a.n;
    }
}
