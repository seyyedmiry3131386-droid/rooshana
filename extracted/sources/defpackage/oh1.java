package defpackage;

import android.content.Context;
import android.os.Build;
import androidx.compose.foundation.layout.b;
import androidx.compose.runtime.g;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.draw.c;
import androidx.compose.ui.platform.e;
import androidx.compose.ui.window.d;
import defpackage.ag8;
import defpackage.jz0;
import defpackage.oh1;
import defpackage.qz0;
import defpackage.tx8;
import defpackage.u48;
import defpackage.zf8;

/* JADX INFO: loaded from: classes.dex */
public abstract class oh1 {
    public static final gi6 a = new gi6(14, true);

    public static final void a(mg8 mg8Var, zf8 zf8Var, qz0 qz0Var, int i) {
        qz0 qz0Var2;
        Context context;
        qz0Var.c0(1904307118);
        int i2 = (qz0Var.f(mg8Var) ? 4 : 2) | i | (qz0Var.h(zf8Var) ? 32 : 16);
        if (qz0Var.R(i2 & 1, (i2 & 19) != 18)) {
            if (Build.VERSION.SDK_INT >= 28) {
                qz0Var.a0(-1009482584);
                context = (Context) qz0Var.j(e.b);
                qz0Var.q(false);
            } else {
                qz0Var.a0(-1009433480);
                qz0Var.q(false);
                context = null;
            }
            boolean zH = qz0Var.h(zf8Var) | ((i2 & 14) == 4) | qz0Var.h(context);
            Object objM = qz0Var.M();
            if (zH || objM == jz0.a) {
                objM = new vt(zf8Var, context, mg8Var, 8);
                qz0Var.l0(objM);
            }
            qz0Var2 = qz0Var;
            d51.b(null, null, (dp2) objM, qz0Var2, 0, 3);
        } else {
            qz0Var2 = qz0Var;
            qz0Var2.U();
        }
        my6 my6VarS = qz0Var2.s();
        if (my6VarS != null) {
            my6VarS.d = new iz(mg8Var, zf8Var, i, 6);
        }
    }

    public static final void b(final int i, final long j, qz0 qz0Var, final int i2) {
        int i3;
        final int i4;
        final long j2;
        final int i5;
        qz0Var.c0(-1240244237);
        if ((i2 & 6) == 0) {
            i3 = (qz0Var.d(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= qz0Var.e(j) ? 32 : 16;
        }
        if (qz0Var.R(i3 & 1, (i3 & 19) != 18)) {
            Context context = (Context) qz0Var.j(e.b);
            boolean zF = ((i3 & 14) == 4) | qz0Var.f(context);
            Object objM = qz0Var.M();
            Object obj = jz0.a;
            if (zF || objM == obj) {
                objM = Integer.valueOf(context.obtainStyledAttributes(new int[]{i}).getResourceId(0, -1));
                qz0Var.l0(objM);
            }
            int iIntValue = ((Number) objM).intValue();
            if (iIntValue == -1) {
                my6 my6VarS = qz0Var.s();
                if (my6VarS != null) {
                    final int i6 = 1;
                    my6VarS.d = new qp2() { // from class: mh1
                        @Override // defpackage.qp2
                        public final Object invoke(Object obj2, Object obj3) {
                            int i7 = i6;
                            qz0 qz0Var2 = (qz0) obj2;
                            ((Integer) obj3).getClass();
                            switch (i7) {
                                case 0:
                                    oh1.b(i, j, qz0Var2, hs9.W(i2 | 1));
                                    break;
                                default:
                                    oh1.b(i, j, qz0Var2, hs9.W(i2 | 1));
                                    break;
                            }
                            return tx8.a;
                        }
                    };
                    return;
                }
                return;
            }
            i4 = i;
            i5 = i2;
            boolean z = true;
            j2 = j;
            g16 g16VarG = rf0.G(iIntValue, qz0Var);
            if ((i3 & 112) != 32) {
                z = false;
            }
            Object objM2 = qz0Var.M();
            if (z || objM2 == obj) {
                objM2 = j2 == 16 ? null : new tc0(5, j2);
                qz0Var.l0(objM2);
            }
            bg0.a(c.a(b.i(ex4.b, c51.j), g16VarG, (tc0) objM2), qz0Var, 0);
        } else {
            i4 = i;
            j2 = j;
            i5 = i2;
            qz0Var.U();
        }
        my6 my6VarS2 = qz0Var.s();
        if (my6VarS2 != null) {
            final int i7 = 0;
            my6VarS2.d = new qp2() { // from class: mh1
                @Override // defpackage.qp2
                public final Object invoke(Object obj2, Object obj3) {
                    int i72 = i7;
                    qz0 qz0Var2 = (qz0) obj2;
                    ((Integer) obj3).getClass();
                    switch (i72) {
                        case 0:
                            oh1.b(i4, j2, qz0Var2, hs9.W(i5 | 1));
                            break;
                        default:
                            oh1.b(i4, j2, qz0Var2, hs9.W(i5 | 1));
                            break;
                    }
                    return tx8.a;
                }
            };
        }
    }

    public static final void c(final mg8 mg8Var, final ag8 ag8Var, bp2 bp2Var, qz0 qz0Var, int i) {
        int i2;
        qz0Var.c0(-2040393164);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? qz0Var.f(mg8Var) : qz0Var.h(mg8Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? qz0Var.f(ag8Var) : qz0Var.h(ag8Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= qz0Var.h(bp2Var) ? 256 : 128;
        }
        boolean z = false;
        if (qz0Var.R(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = (i2 & 112) == 32 || ((i2 & 64) != 0 && qz0Var.f(ag8Var));
            Object objM = qz0Var.M();
            av avVar = jz0.a;
            if (z2 || objM == avVar) {
                objM = new vg4(new nm5(13, new d(ag8Var, bp2Var, 18)));
                qz0Var.l0(objM);
            }
            vg4 vg4Var = (vg4) objM;
            if ((i2 & 14) == 4 || ((i2 & 8) != 0 && qz0Var.h(mg8Var))) {
                z = true;
            }
            Object objM2 = qz0Var.M();
            if (z || objM2 == avVar) {
                objM2 = new x2(19, mg8Var);
                qz0Var.l0(objM2);
            }
            d.a(vg4Var, (bp2) objM2, a, s7.X(1315155414, new qp2() { // from class: androidx.compose.foundation.text.contextmenu.internal.b
                @Override // defpackage.qp2
                public final Object invoke(Object obj, Object obj2) {
                    qz0 qz0Var2 = (qz0) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (qz0Var2.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                        ag8 ag8Var2 = ag8Var;
                        boolean zF = qz0Var2.f(ag8Var2);
                        Object objM3 = qz0Var2.M();
                        if (zF || objM3 == jz0.a) {
                            objM3 = g.c(new DefaultTextContextMenuDropdownProvider_androidKt$OpenContextMenu$2$data$2$1(0, ag8Var2, ag8.class, "data", "data()Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuData;", 0));
                            qz0Var2.l0(objM3);
                        }
                        oh1.a(mg8Var, (zf8) ((u48) objM3).getValue(), qz0Var2, 0);
                    } else {
                        qz0Var2.U();
                    }
                    return tx8.a;
                }
            }, qz0Var), qz0Var, 3456, 0);
        } else {
            qz0Var.U();
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new ca(i, 9, mg8Var, ag8Var, bp2Var);
        }
    }

    public static final void d(hx4 hx4Var, a aVar, qz0 qz0Var, int i) {
        int i2;
        qz0Var.c0(1392105195);
        if ((i & 6) == 0) {
            i2 = (qz0Var.f(hx4Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= qz0Var.h(aVar) ? 32 : 16;
        }
        if (qz0Var.R(i2 & 1, (i2 & 19) != 18)) {
            c26.d(hx4Var, kg8.a, aVar, qz0Var, ((i2 << 6) & 7168) | (i2 & 14) | 432);
        } else {
            qz0Var.U();
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new ji(hx4Var, aVar, i, 2);
        }
    }
}
