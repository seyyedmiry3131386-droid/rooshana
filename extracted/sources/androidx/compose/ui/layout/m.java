package androidx.compose.ui.layout;

import defpackage.d01;
import defpackage.qp2;
import defpackage.t14;
import defpackage.tx8;
import defpackage.y98;

/* JADX INFO: loaded from: classes.dex */
public final class m {
    public final y98 a;
    public g b;
    public final qp2 c = new qp2() { // from class: androidx.compose.ui.layout.SubcomposeLayoutState$setRoot$1
        {
            super(2);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            androidx.compose.ui.node.h hVar = (androidx.compose.ui.node.h) obj;
            m mVar = this.g;
            y98 y98Var = mVar.a;
            g gVar = hVar.I;
            if (gVar == null) {
                gVar = new g(hVar, y98Var);
                hVar.I = gVar;
            }
            mVar.b = gVar;
            mVar.a().h();
            g gVarA = mVar.a();
            if (gVarA.c != y98Var) {
                gVarA.c = y98Var;
                gVarA.i(false);
                androidx.compose.ui.node.h.s0(gVarA.a, false, 7);
            }
            return tx8.a;
        }
    };
    public final qp2 d = new qp2() { // from class: androidx.compose.ui.layout.SubcomposeLayoutState$setCompositionContext$1
        {
            super(2);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            this.g.a().b = (d01) obj2;
            return tx8.a;
        }
    };
    public final qp2 e = new qp2() { // from class: androidx.compose.ui.layout.SubcomposeLayoutState$setMeasurePolicy$1
        {
            super(2);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            g gVarA = this.g.a();
            ((androidx.compose.ui.node.h) obj).A0(new t14(gVarA, (qp2) obj2, gVarA.p));
            return tx8.a;
        }
    };

    public m(y98 y98Var) {
        this.a = y98Var;
    }

    public final g a() {
        g gVar = this.b;
        if (gVar != null) {
            return gVar;
        }
        throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout");
    }
}
