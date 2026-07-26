package androidx.compose.ui.scrollcapture;

import androidx.compose.ui.node.m;
import defpackage.c26;
import defpackage.dp2;
import defpackage.en7;
import defpackage.gg7;
import defpackage.hg7;
import defpackage.js3;
import defpackage.qp2;
import defpackage.s7;
import defpackage.t61;
import defpackage.vq3;
import defpackage.zb5;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static final void a(androidx.compose.ui.semantics.c cVar, int i, dp2 dp2Var) {
        androidx.compose.ui.semantics.c cVar2;
        zb5 zb5Var = new zb5(0, new androidx.compose.ui.semantics.c[16]);
        List listI = cVar.i(false, false);
        while (true) {
            zb5Var.d(zb5Var.c, listI);
            while (true) {
                int i2 = zb5Var.c;
                if (i2 == 0) {
                    return;
                }
                cVar2 = (androidx.compose.ui.semantics.c) zb5Var.l(i2 - 1);
                boolean zE = s7.E(cVar2);
                en7 en7Var = cVar2.d;
                if (!zE) {
                    if (en7Var.a.c(androidx.compose.ui.semantics.d.i)) {
                        continue;
                    } else {
                        m mVarD = cVar2.d();
                        if (mVarD == null) {
                            throw t61.r("Expected semantics node to have a coordinator.");
                        }
                        vq3 vq3VarR = js3.R(c26.n(mVarD, true));
                        if (vq3VarR.a < vq3VarR.c && vq3VarR.b < vq3VarR.d) {
                            qp2 qp2Var = (qp2) androidx.compose.ui.semantics.b.a(en7Var, androidx.compose.ui.semantics.a.e);
                            gg7 gg7Var = (gg7) androidx.compose.ui.semantics.b.a(en7Var, androidx.compose.ui.semantics.d.v);
                            if (qp2Var == null || gg7Var == null || ((Number) gg7Var.b.invoke()).floatValue() <= 0.0f) {
                                break;
                            }
                            int i3 = 1 + i;
                            ((ScrollCapture$onScrollCaptureSearch$1) dp2Var).invoke(new hg7(cVar2, i3, vq3VarR, mVarD));
                            a(cVar2, i3, dp2Var);
                        }
                    }
                }
            }
            listI = cVar2.i(false, false);
        }
    }
}
