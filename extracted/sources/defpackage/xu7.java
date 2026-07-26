package defpackage;

import androidx.compose.material3.p;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.l;

/* JADX INFO: loaded from: classes.dex */
public abstract class xu7 {
    public static final lt8 a = y97.e0(300, 0, az1.a, 2);

    public static final void a(a aVar, qz0 qz0Var, int i) {
        qz0Var.c0(1033612924);
        int i2 = 2;
        if (qz0Var.R(i & 1, (i & 19) != 18)) {
            String strG = uy6.g(ys6.m3c_bottom_sheet_drag_handle_description, qz0Var);
            nc3 nc3Var = new nc3(eq.p);
            cl4 cl4VarD = bg0.d(eq.c, false);
            int iB = ok4.B(qz0Var);
            j56 j56VarL = qz0Var.l();
            hx4 hx4VarC = b.c(qz0Var, nc3Var);
            hz0.d0.getClass();
            bp2 bp2Var = d.b;
            qz0Var.e0();
            if (qz0Var.S) {
                qz0Var.k(bp2Var);
            } else {
                qz0Var.o0();
            }
            ia7.o(qz0Var, d.f, cl4VarD);
            ia7.o(qz0Var, d.e, j56VarL);
            qp2 qp2Var = d.g;
            if (qz0Var.S || !js3.i(qz0Var.M(), Integer.valueOf(iB))) {
                o40.C(iB, qz0Var, iB, qp2Var);
            }
            ia7.o(qz0Var, d.d, hx4VarC);
            float f = ao8.a;
            int iB0 = ((qj1) qz0Var.j(l.h)).b0(fo8.a);
            boolean zD = qz0Var.d(iB0);
            Object objM = qz0Var.M();
            Object obj = jz0.a;
            if (zD || objM == obj) {
                objM = new ho8(iB0);
                qz0Var.l0(objM);
            }
            ho8 ho8Var = (ho8) objM;
            a aVarX = s7.X(2059851063, new nh1(i2, strG), qz0Var);
            androidx.compose.foundation.l lVar = oa0.a;
            boolean zG = qz0Var.g(false) | qz0Var.f(lVar);
            Object objM2 = qz0Var.M();
            if (zG || objM2 == obj) {
                objM2 = new p(lVar);
                qz0Var.l0(objM2);
            }
            fo8.b(ho8Var, aVarX, (p) objM2, null, false, aVar, qz0Var, 100663344);
            qz0Var.q(true);
        } else {
            qz0Var.U();
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new qf2(aVar, i, i2);
        }
    }
}
