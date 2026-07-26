package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import java.util.List;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ou0 implements rp2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ou0(int i, cy6 cy6Var) {
        this.b = i;
        this.c = cy6Var;
    }

    @Override // defpackage.rp2
    public final Object a(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                cy6 cy6Var = (cy6) this.c;
                db7 db7Var = (db7) obj;
                qz0 qz0Var = (qz0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                js3.p(db7Var, "$this$Button");
                if ((iIntValue & 6) == 0) {
                    iIntValue |= qz0Var.f(db7Var) ? 4 : 2;
                }
                boolean z = false;
                if (qz0Var.R(iIntValue & 1, (iIntValue & 19) != 18)) {
                    cl4 cl4VarD = bg0.d(eq.c, false);
                    long j = qz0Var.T;
                    int i = (int) (j ^ (j >>> 32));
                    j56 j56VarL = qz0Var.l();
                    ex4 ex4Var = ex4.b;
                    hx4 hx4VarC = b.c(qz0Var, ex4Var);
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
                    ia7.g(qz0Var, Integer.valueOf(i), d.g);
                    ia7.n(qz0Var, d.h);
                    ia7.o(qz0Var, d.d, hx4VarC);
                    qz0Var.a0(-1784402453);
                    List listH0 = a.H0(a.K0(cy6Var.b.a, 3));
                    int size = listH0.size();
                    int i2 = 0;
                    while (i2 < size) {
                        String str = ((qx6) listH0.get(i2)).e;
                        Object objJ = qz0Var.j(uj8.a);
                        js3.m(objJ);
                        cc7.a(str, zk8.s(androidx.compose.foundation.layout.b.j(ng0.a.a(ex4Var, yh0.d).d(new sy5(0, 0, i2 * ml9.q(hq6.space_16, qz0Var), 0, false, new sm5(12))), ml9.q(hq6.recommendation_drawer_collapsed_poster_width, qz0Var), ml9.q(hq6.recommendation_drawer_collapsed_poster_height, qz0Var)), la7.a(ml9.q(hq6.radius_4, qz0Var))), p41.a, new tc0(9, zu0.b((2 - i2) * 0.3f, ((tj8) objJ).J.a)), qz0Var, 1572912, 1720);
                        i2++;
                        z = false;
                    }
                    qz0Var.q(z);
                    qz0Var.q(true);
                    z27.a(qz0Var, androidx.compose.foundation.layout.b.l(ex4Var, ml9.q(hq6.size_8, qz0Var)));
                    String strF = ln2.f(this.b, qz0Var);
                    gj8 gj8Var = ((wf5) qz0Var.j(aw8.a)).k;
                    Object objJ2 = qz0Var.j(uj8.a);
                    js3.m(objJ2);
                    mi8.b(strF, db7Var.a(), ((tj8) objJ2).j, 0L, 0L, null, 0L, 0, false, 0, 0, gj8Var, qz0Var, 0, 0, 131064);
                    z27.a(qz0Var, androidx.compose.foundation.layout.b.l(ex4Var, ml9.q(hq6.size_8, qz0Var)));
                    kh3.a(rf0.G(br6.player_ic_chevron, qz0Var), androidx.compose.foundation.layout.b.i(ex4Var, ml9.q(hq6.size_12, qz0Var)), 0L, qz0Var, 56, 8);
                    z27.a(qz0Var, androidx.compose.foundation.layout.b.l(ex4Var, ml9.q(hq6.size_2, qz0Var)));
                } else {
                    qz0Var.U();
                }
                break;
            default:
                rp2 rp2Var = (rp2) this.c;
                qz0 qz0Var2 = (qz0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                js3.p((wv0) obj, "$this$BottomSheetScaffold");
                if (qz0Var2.R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    rp2Var.a(Integer.valueOf(this.b), qz0Var2, 0);
                } else {
                    qz0Var2.U();
                }
                break;
        }
        return tx8.a;
    }

    public /* synthetic */ ou0(rp2 rp2Var, int i) {
        this.c = rp2Var;
        this.b = i;
    }
}
