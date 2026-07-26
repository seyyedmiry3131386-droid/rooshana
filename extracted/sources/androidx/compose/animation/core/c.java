package androidx.compose.animation.core;

import defpackage.av;
import defpackage.g8;
import defpackage.jn3;
import defpackage.jz0;
import defpackage.my6;
import defpackage.qp2;
import defpackage.qz0;
import defpackage.s08;
import defpackage.wb5;
import defpackage.zb5;
import defpackage.zk8;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public final zb5 a = new zb5(0, new jn3[16]);
    public final wb5 b = androidx.compose.runtime.g.h(Boolean.FALSE);
    public long c = Long.MIN_VALUE;
    public final wb5 d = androidx.compose.runtime.g.h(Boolean.TRUE);

    public final void a(int i, qz0 qz0Var) {
        qz0Var.c0(-318043801);
        int i2 = (qz0Var.h(this) ? 4 : 2) | i;
        if (qz0Var.R(i2 & 1, (i2 & 3) != 2)) {
            Object objM = qz0Var.M();
            av avVar = jz0.a;
            if (objM == avVar) {
                objM = androidx.compose.runtime.g.h(null);
                qz0Var.l0(objM);
            }
            wb5 wb5Var = (wb5) objM;
            if (((Boolean) ((s08) this.d).getValue()).booleanValue() || ((Boolean) ((s08) this.b).getValue()).booleanValue()) {
                qz0Var.a0(-144841960);
                boolean zH = qz0Var.h(this);
                Object objM2 = qz0Var.M();
                if (zH || objM2 == avVar) {
                    objM2 = new InfiniteTransition$run$1$1(wb5Var, this, null);
                    qz0Var.l0(objM2);
                }
                zk8.h(qz0Var, (qp2) objM2, this);
            } else {
                qz0Var.a0(-151918981);
            }
            qz0Var.q(false);
        } else {
            qz0Var.U();
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new g8(i, 8, this);
        }
    }
}
