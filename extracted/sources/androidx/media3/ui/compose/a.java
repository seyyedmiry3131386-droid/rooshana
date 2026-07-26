package androidx.media3.ui.compose;

import android.view.View;
import androidx.compose.runtime.g;
import androidx.compose.ui.viewinterop.b;
import androidx.media3.ui.compose.a;
import defpackage.av;
import defpackage.cx3;
import defpackage.dp2;
import defpackage.ex4;
import defpackage.gb6;
import defpackage.hx4;
import defpackage.jz0;
import defpackage.my6;
import defpackage.qp2;
import defpackage.qz0;
import defpackage.sm5;
import defpackage.u8;
import defpackage.wb5;
import defpackage.y5;
import defpackage.y8;
import defpackage.zk8;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final void a(gb6 gb6Var, hx4 hx4Var, int i, qz0 qz0Var, final int i2, final int i3) {
        int i4;
        qz0 qz0Var2;
        final gb6 gb6Var2;
        final int i5;
        final hx4 hx4Var2;
        qz0Var.c0(12998269);
        if ((i2 & 6) == 0) {
            i4 = (qz0Var.h(gb6Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i6 = i3 & 2;
        if (i6 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= qz0Var.f(hx4Var) ? 32 : 16;
        }
        int i7 = i4 | 384;
        if ((i7 & 147) == 146 && qz0Var.B()) {
            qz0Var.U();
            qz0Var2 = qz0Var;
            i5 = i;
            hx4Var2 = hx4Var;
            gb6Var2 = gb6Var;
        } else {
            if (i6 != 0) {
                hx4Var = ex4.b;
            }
            hx4 hx4Var3 = hx4Var;
            qz0Var.a0(-316862560);
            qz0Var.a0(-316860259);
            Object objM = qz0Var.M();
            av avVar = jz0.a;
            if (objM == avVar) {
                objM = PlayerSurfaceKt$PlayerSurface$1$1.a;
                qz0Var.l0(objM);
            }
            qz0Var.q(false);
            dp2 dp2Var = (dp2) ((cx3) objM);
            qz0Var.a0(-316859029);
            Object objM2 = qz0Var.M();
            if (objM2 == avVar) {
                objM2 = PlayerSurfaceKt$PlayerSurface$2$1.a;
                qz0Var.l0(objM2);
            }
            qz0Var.q(false);
            qp2 qp2Var = (qp2) ((cx3) objM2);
            qz0Var.a0(-316857299);
            Object objM3 = qz0Var.M();
            if (objM3 == avVar) {
                objM3 = PlayerSurfaceKt$PlayerSurface$3$1.a;
                qz0Var.l0(objM3);
            }
            qz0Var.q(false);
            qz0Var2 = qz0Var;
            b(gb6Var, hx4Var3, dp2Var, qp2Var, (qp2) ((cx3) objM3), qz0Var2, (i7 & 14) | 28032 | (i7 & 112));
            gb6Var2 = gb6Var;
            qz0Var2.q(false);
            i5 = 1;
            hx4Var2 = hx4Var3;
        }
        my6 my6VarS = qz0Var2.s();
        if (my6VarS != null) {
            my6VarS.d = new qp2() { // from class: bg6
                @Override // defpackage.qp2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    a.a(gb6Var2, hx4Var2, i5, (qz0) obj, hs9.W(i2 | 1), i3);
                    return tx8.a;
                }
            };
        }
    }

    public static final void b(gb6 gb6Var, hx4 hx4Var, dp2 dp2Var, qp2 qp2Var, qp2 qp2Var2, qz0 qz0Var, int i) {
        int i2;
        hx4 hx4Var2;
        qp2 qp2Var3;
        boolean z;
        qz0Var.c0(921581664);
        if ((i & 6) == 0) {
            i2 = (qz0Var.h(gb6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            hx4Var2 = hx4Var;
            i2 |= qz0Var.f(hx4Var2) ? 32 : 16;
        } else {
            hx4Var2 = hx4Var;
        }
        if ((i & 384) == 0) {
            i2 |= qz0Var.h(dp2Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            qp2Var3 = qp2Var;
            i2 |= qz0Var.h(qp2Var3) ? 2048 : 1024;
        } else {
            qp2Var3 = qp2Var;
        }
        if ((i & 24576) == 0) {
            i2 |= qz0Var.h(qp2Var2) ? 16384 : 8192;
        }
        if ((i2 & 9363) == 9362 && qz0Var.B()) {
            qz0Var.U();
        } else {
            qz0Var.a0(-1838684430);
            Object objM = qz0Var.M();
            Object obj = jz0.a;
            if (objM == obj) {
                objM = g.h(null);
                qz0Var.l0(objM);
            }
            wb5 wb5Var = (wb5) objM;
            qz0Var.q(false);
            qz0Var.a0(-1838681473);
            boolean z2 = (i2 & 896) == 256;
            Object objM2 = qz0Var.M();
            if (z2 || objM2 == obj) {
                objM2 = new y8(6, dp2Var);
                qz0Var.l0(objM2);
            }
            dp2 dp2Var2 = (dp2) objM2;
            qz0Var.q(false);
            qz0Var.a0(-1838680401);
            Object objM3 = qz0Var.M();
            if (objM3 == obj) {
                objM3 = new sm5(21);
                qz0Var.l0(objM3);
            }
            dp2 dp2Var3 = (dp2) objM3;
            qz0Var.q(false);
            qz0Var.a0(-1838679846);
            Object objM4 = qz0Var.M();
            if (objM4 == obj) {
                objM4 = new u8(wb5Var, 6);
                qz0Var.l0(objM4);
            }
            qz0Var.q(false);
            b.a(dp2Var2, hx4Var2, dp2Var3, null, (dp2) objM4, qz0Var, (i2 & 112) | 24960, 8);
            View view = (View) wb5Var.getValue();
            if (view != null) {
                qz0Var.a0(-898425590);
                boolean zH = qz0Var.h(gb6Var) | qz0Var.h(view) | ((57344 & i2) == 16384) | ((i2 & 7168) == 2048);
                Object objM5 = qz0Var.M();
                if (zH || objM5 == obj) {
                    z = false;
                    Object playerSurfaceKt$PlayerSurfaceInternal$4$1$1 = new PlayerSurfaceKt$PlayerSurfaceInternal$4$1$1(gb6Var, view, qp2Var3, qp2Var2, null);
                    qz0Var.l0(playerSurfaceKt$PlayerSurfaceInternal$4$1$1);
                    objM5 = playerSurfaceKt$PlayerSurfaceInternal$4$1$1;
                } else {
                    z = false;
                }
                qz0Var.q(z);
                zk8.i(view, gb6Var, (qp2) objM5, qz0Var);
            }
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new y5((Object) gb6Var, hx4Var, (Object) dp2Var, (Object) qp2Var, (Object) qp2Var2, i, 5);
        }
    }
}
