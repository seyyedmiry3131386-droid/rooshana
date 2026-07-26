package androidx.compose.ui.platform;

import android.view.View;
import androidx.lifecycle.Lifecycle$Event;
import androidx.lifecycle.Lifecycle$State;
import defpackage.av;
import defpackage.b64;
import defpackage.bf;
import defpackage.c01;
import defpackage.cz7;
import defpackage.dp2;
import defpackage.dx3;
import defpackage.fz7;
import defpackage.g64;
import defpackage.i64;
import defpackage.j01;
import defpackage.jz0;
import defpackage.kx3;
import defpackage.qp2;
import defpackage.qz0;
import defpackage.s7;
import defpackage.tx8;
import defpackage.um;
import defpackage.ur6;
import defpackage.xo3;
import defpackage.zk8;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class t implements c01, b64 {
    public final AndroidComposeView a;
    public final j01 b;
    public boolean c;
    public i64 d;
    public qp2 e = k.a;

    public t(AndroidComposeView androidComposeView, j01 j01Var) {
        this.a = androidComposeView;
        this.b = j01Var;
    }

    public final void a() {
        if (!this.c) {
            this.c = true;
            this.a.getView().setTag(ur6.wrapped_composition_tag, null);
            i64 i64Var = this.d;
            if (i64Var != null) {
                i64Var.f(this);
            }
        }
        this.b.p();
    }

    public final void b(final qp2 qp2Var) {
        this.a.setOnViewTreeOwnersAvailable(new dp2() { // from class: androidx.compose.ui.platform.WrappedComposition$setContent$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.dp2
            public final Object invoke(Object obj) {
                bf bfVar = (bf) obj;
                final t tVar = this.g;
                if (!tVar.c) {
                    i64 i64VarD = bfVar.a.D();
                    final qp2 qp2Var2 = qp2Var;
                    tVar.e = qp2Var2;
                    if (tVar.d == null) {
                        tVar.d = i64VarD;
                        i64VarD.a(tVar);
                    } else if (i64VarD.d.compareTo(Lifecycle$State.c) >= 0) {
                        tVar.b.C(new androidx.compose.runtime.internal.a(1330788943, new qp2() { // from class: androidx.compose.ui.platform.WrappedComposition$setContent$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // defpackage.qp2
                            public final Object invoke(Object obj2, Object obj3) {
                                qz0 qz0Var = (qz0) obj2;
                                int iIntValue = ((Number) obj3).intValue();
                                if (qz0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    final t tVar2 = tVar;
                                    AndroidComposeView androidComposeView = tVar2.a;
                                    Object tag = androidComposeView.getTag(ur6.inspection_slot_table_set);
                                    Set set = (!(tag instanceof Set) || ((tag instanceof dx3) && !(tag instanceof kx3))) ? null : (Set) tag;
                                    if (set == null) {
                                        Object parent = androidComposeView.getParent();
                                        View view = parent instanceof View ? (View) parent : null;
                                        Object tag2 = view != null ? view.getTag(ur6.inspection_slot_table_set) : null;
                                        set = (!(tag2 instanceof Set) || ((tag2 instanceof dx3) && !(tag2 instanceof kx3))) ? null : (Set) tag2;
                                    }
                                    if (set != null) {
                                        set.add(qz0Var.x());
                                        qz0Var.q = true;
                                        qz0Var.C = true;
                                        qz0Var.c.c();
                                        qz0Var.H.c();
                                        fz7 fz7Var = qz0Var.I;
                                        cz7 cz7Var = fz7Var.a;
                                        fz7Var.e = cz7Var.j;
                                        fz7Var.f = cz7Var.k;
                                    }
                                    boolean zH = qz0Var.h(tVar2);
                                    Object objM = qz0Var.M();
                                    av avVar = jz0.a;
                                    if (zH || objM == avVar) {
                                        objM = new WrappedComposition$setContent$1$1$1$1(tVar2, null);
                                        qz0Var.l0(objM);
                                    }
                                    zk8.h(qz0Var, (qp2) objM, androidComposeView);
                                    boolean zH2 = qz0Var.h(tVar2);
                                    Object objM2 = qz0Var.M();
                                    if (zH2 || objM2 == avVar) {
                                        objM2 = new WrappedComposition$setContent$1$1$2$1(tVar2, null);
                                        qz0Var.l0(objM2);
                                    }
                                    zk8.h(qz0Var, (qp2) objM2, androidComposeView);
                                    um umVarA = xo3.a.a(set);
                                    final qp2 qp2Var3 = qp2Var2;
                                    zk8.b(umVarA, s7.X(-280240369, new qp2() { // from class: androidx.compose.ui.platform.WrappedComposition.setContent.1.1.3
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // defpackage.qp2
                                        public final Object invoke(Object obj4, Object obj5) {
                                            qz0 qz0Var2 = (qz0) obj4;
                                            int iIntValue2 = ((Number) obj5).intValue();
                                            if (qz0Var2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                e.a(tVar2.a, qp2Var3, qz0Var2, 0);
                                            } else {
                                                qz0Var2.U();
                                            }
                                            return tx8.a;
                                        }
                                    }, qz0Var), qz0Var, 56);
                                } else {
                                    qz0Var.U();
                                }
                                return tx8.a;
                            }
                        }, true));
                    }
                }
                return tx8.a;
            }
        });
    }

    @Override // defpackage.b64
    public final void g(g64 g64Var, Lifecycle$Event lifecycle$Event) {
        if (lifecycle$Event == Lifecycle$Event.ON_DESTROY) {
            a();
        } else {
            if (lifecycle$Event != Lifecycle$Event.ON_CREATE || this.c) {
                return;
            }
            b(this.e);
        }
    }
}
