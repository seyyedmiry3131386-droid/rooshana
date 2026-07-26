package androidx.compose.ui.window;

import android.view.View;
import androidx.compose.ui.platform.l;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.bp2;
import defpackage.cl4;
import defpackage.dp2;
import defpackage.eu;
import defpackage.hs9;
import defpackage.hx4;
import defpackage.hz0;
import defpackage.ia7;
import defpackage.j56;
import defpackage.jz0;
import defpackage.my6;
import defpackage.nn7;
import defpackage.o37;
import defpackage.ok4;
import defpackage.ox3;
import defpackage.pf;
import defpackage.qj1;
import defpackage.qp2;
import defpackage.qz0;
import defpackage.s08;
import defpackage.tx8;
import defpackage.wb5;
import defpackage.zk8;
import defpackage.zn1;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final void a(final bp2 bp2Var, final zn1 zn1Var, final androidx.compose.runtime.internal.a aVar, qz0 qz0Var, final int i) {
        qz0Var.c0(826668973);
        int i2 = (qz0Var.h(bp2Var) ? 4 : 2) | i | (qz0Var.f(zn1Var) ? 32 : 16);
        if (qz0Var.R(i2 & 1, (i2 & 147) != 146)) {
            View view = (View) qz0Var.j(androidx.compose.ui.platform.e.f);
            qj1 qj1Var = (qj1) qz0Var.j(l.h);
            final LayoutDirection layoutDirection = (LayoutDirection) qz0Var.j(l.n);
            androidx.compose.runtime.a aVarS = ok4.S(qz0Var);
            final wb5 wb5VarK = androidx.compose.runtime.g.k(aVar, qz0Var);
            Object[] objArr = new Object[0];
            Object objM = qz0Var.M();
            Object obj = jz0.a;
            if (objM == obj) {
                objM = new bp2() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$dialogId$1$1
                    @Override // defpackage.bp2
                    public final Object invoke() {
                        return UUID.randomUUID();
                    }
                };
                qz0Var.l0(objM);
            }
            UUID uuid = (UUID) o37.A(objArr, (bp2) objM, qz0Var);
            boolean zF = qz0Var.f(view) | qz0Var.f(qj1Var);
            Object objM2 = qz0Var.M();
            if (zF || objM2 == obj) {
                h hVar = new h(bp2Var, zn1Var, view, layoutDirection, qj1Var, uuid);
                androidx.compose.runtime.internal.a aVar2 = new androidx.compose.runtime.internal.a(346960332, new qp2() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$dialog$1$1$1
                    {
                        super(2);
                    }

                    @Override // defpackage.qp2
                    public final Object invoke(Object obj2, Object obj3) {
                        qz0 qz0Var2 = (qz0) obj2;
                        int iIntValue = ((Number) obj3).intValue();
                        if (qz0Var2.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                            Object objM3 = qz0Var2.M();
                            if (objM3 == jz0.a) {
                                objM3 = new dp2() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$dialog$1$1$1$1$1
                                    @Override // defpackage.dp2
                                    public final Object invoke(Object obj4) {
                                        ox3[] ox3VarArr = androidx.compose.ui.semantics.f.a;
                                        androidx.compose.ui.semantics.g gVar = androidx.compose.ui.semantics.d.x;
                                        tx8 tx8Var = tx8.a;
                                        ((nn7) obj4).a(gVar, tx8Var);
                                        return tx8Var;
                                    }
                                };
                                qz0Var2.l0(objM3);
                            }
                            b.b(new eu((dp2) objM3, false), (qp2) wb5VarK.getValue(), qz0Var2, 0);
                        } else {
                            qz0Var2.U();
                        }
                        return tx8.a;
                    }
                }, true);
                g gVar = hVar.h;
                gVar.setParentCompositionContext(aVarS);
                ((s08) gVar.j).setValue(aVar2);
                gVar.n = true;
                gVar.c();
                qz0Var.l0(hVar);
                objM2 = hVar;
            }
            final h hVar2 = (h) objM2;
            boolean zH = qz0Var.h(hVar2);
            Object objM3 = qz0Var.M();
            if (zH || objM3 == obj) {
                objM3 = new dp2() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$1$1
                    {
                        super(1);
                    }

                    @Override // defpackage.dp2
                    public final Object invoke(Object obj2) {
                        h hVar3 = hVar2;
                        hVar3.show();
                        return new pf(1, hVar3);
                    }
                };
                qz0Var.l0(objM3);
            }
            zk8.d(hVar2, (dp2) objM3, qz0Var);
            boolean zH2 = qz0Var.h(hVar2) | ((i2 & 14) == 4) | ((i2 & 112) == 32) | qz0Var.d(layoutDirection.ordinal());
            Object objM4 = qz0Var.M();
            if (zH2 || objM4 == obj) {
                objM4 = new bp2() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // defpackage.bp2
                    public final Object invoke() {
                        hVar2.f(bp2Var, zn1Var, layoutDirection);
                        return tx8.a;
                    }
                };
                qz0Var.l0(objM4);
            }
            zk8.k((bp2) objM4, qz0Var);
        } else {
            qz0Var.U();
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new qp2(zn1Var, aVar, i) { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$3
                public final /* synthetic */ zn1 h;
                public final /* synthetic */ androidx.compose.runtime.internal.a i;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.qp2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Number) obj3).intValue();
                    int iW = hs9.W(385);
                    b.a(this.g, this.h, this.i, (qz0) obj2, iW);
                    return tx8.a;
                }
            };
        }
    }

    public static final void b(final hx4 hx4Var, final qp2 qp2Var, qz0 qz0Var, final int i) {
        int i2;
        qz0Var.c0(1090521195);
        if ((i & 6) == 0) {
            i2 = (qz0Var.f(hx4Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= qz0Var.h(qp2Var) ? 32 : 16;
        }
        if (qz0Var.R(i2 & 1, (i2 & 19) != 18)) {
            Object objM = qz0Var.M();
            if (objM == jz0.a) {
                objM = a.a;
                qz0Var.l0(objM);
            }
            cl4 cl4Var = (cl4) objM;
            long j = qz0Var.T;
            int i3 = (int) ((j >>> 32) ^ j);
            j56 j56VarL = qz0Var.l();
            hx4 hx4VarC = androidx.compose.ui.b.c(qz0Var, hx4Var);
            hz0.d0.getClass();
            bp2 bp2Var = androidx.compose.ui.node.d.b;
            int i4 = (((((i2 << 3) & 112) | (((i2 >> 3) & 14) | 384)) << 6) & 896) | 6;
            qz0Var.e0();
            if (qz0Var.S) {
                qz0Var.k(bp2Var);
            } else {
                qz0Var.o0();
            }
            ia7.o(qz0Var, androidx.compose.ui.node.d.f, cl4Var);
            ia7.o(qz0Var, androidx.compose.ui.node.d.e, j56VarL);
            ia7.g(qz0Var, Integer.valueOf(i3), androidx.compose.ui.node.d.g);
            ia7.n(qz0Var, androidx.compose.ui.node.d.h);
            ia7.o(qz0Var, androidx.compose.ui.node.d.d, hx4VarC);
            qp2Var.invoke(qz0Var, Integer.valueOf((i4 >> 6) & 14));
            qz0Var.q(true);
        } else {
            qz0Var.U();
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new qp2() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$DialogLayout$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.qp2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iW = hs9.W(i | 1);
                    b.b(hx4Var, qp2Var, (qz0) obj, iW);
                    return tx8.a;
                }
            };
        }
    }
}
