package androidx.tv.material3;

import defpackage.bb0;
import defpackage.bb7;
import defpackage.bp2;
import defpackage.cb7;
import defpackage.eq;
import defpackage.ex4;
import defpackage.fv;
import defpackage.hs9;
import defpackage.hx4;
import defpackage.hz0;
import defpackage.ia7;
import defpackage.j56;
import defpackage.js3;
import defpackage.jv;
import defpackage.my6;
import defpackage.o40;
import defpackage.ok4;
import defpackage.qp2;
import defpackage.qy7;
import defpackage.qz0;
import defpackage.s7;
import defpackage.tx8;
import defpackage.yh0;
import defpackage.zk8;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static final float a = 8;

    public static final void a(final int i, qz0 qz0Var) {
        int i2;
        qz0 qz0Var2;
        qz0Var.c0(1778933019);
        if ((i & 6) == 0) {
            i2 = (qz0Var.h(null) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= qz0Var.f(null) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= qz0Var.h(null) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= qz0Var.h(null) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= qz0Var.h(null) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= qz0Var.c(0.0f) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= qz0Var.f(null) ? 1048576 : 524288;
        }
        int i3 = i2;
        if ((599187 & i3) == 599186 && qz0Var.B()) {
            qz0Var.U();
            qz0Var2 = qz0Var;
        } else {
            hx4 hx4VarY = yh0.y(androidx.compose.foundation.layout.b.b(ex4.b, 0.0f, 0.0f, 1), null);
            fv fvVar = jv.a;
            bb0 bb0Var = eq.m;
            qz0Var.b0(693286680);
            cb7 cb7VarA = bb7.a(fvVar, bb0Var, qz0Var, 54);
            qz0Var.b0(-1323940314);
            int iB = ok4.B(qz0Var);
            j56 j56VarL = qz0Var.l();
            hz0.d0.getClass();
            bp2 bp2Var = androidx.compose.ui.node.d.b;
            androidx.compose.runtime.internal.a aVarE = androidx.compose.ui.layout.e.e(hx4VarY);
            qz0Var.e0();
            if (qz0Var.S) {
                qz0Var.k(bp2Var);
            } else {
                qz0Var.o0();
            }
            ia7.o(qz0Var, androidx.compose.ui.node.d.f, cb7VarA);
            ia7.o(qz0Var, androidx.compose.ui.node.d.e, j56VarL);
            qp2 qp2Var = androidx.compose.ui.node.d.g;
            if (qz0Var.S || !js3.i(qz0Var.M(), Integer.valueOf(iB))) {
                o40.C(iB, qz0Var, iB, qp2Var);
            }
            aVarE.a(new qy7(qz0Var), qz0Var, 0);
            qz0Var.b0(2058660585);
            qz0Var2 = qz0Var;
            androidx.compose.animation.f.c(false, null, null, null, null, s7.h(qz0Var, -775567521, new ChipKt$ChipContent$1$1(3)), qz0Var2, 196608, 30);
            androidx.compose.animation.f.c(false, null, null, null, null, s7.h(qz0Var2, 1201881928, new ChipKt$ChipContent$1$2(3)), qz0Var2, 196608, 30);
            zk8.b(m.a.a(null), null, qz0Var2, ((i3 << 3) & 112) | 8);
            qz0Var2.b0(1568571999);
            qz0Var2.q(false);
            qz0Var2.q(false);
            qz0Var2.q(true);
            qz0Var2.q(false);
            qz0Var2.q(false);
        }
        my6 my6VarS = qz0Var2.s();
        if (my6VarS != null) {
            my6VarS.d = new qp2() { // from class: androidx.tv.material3.ChipKt$ChipContent$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.qp2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    c.a(hs9.W(i | 1), (qz0) obj);
                    return tx8.a;
                }
            };
        }
    }
}
