package defpackage;

import android.content.res.Resources;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.e;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b22 implements rp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fy6 b;
    public final /* synthetic */ dp2 c;

    public /* synthetic */ b22(fy6 fy6Var, dp2 dp2Var, int i) {
        this.a = i;
        this.b = fy6Var;
        this.c = dp2Var;
    }

    @Override // defpackage.rp2
    public final Object a(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        tx8 tx8Var = tx8.a;
        int i2 = 2;
        dp2 dp2Var = this.c;
        fy6 fy6Var = this.b;
        int i3 = 1;
        switch (i) {
            case 0:
                qz0 qz0Var = (qz0) obj2;
                ((Integer) obj3).getClass();
                js3.p((ik) obj, "$this$AnimatedVisibility");
                fv fvVar = jv.a;
                ev evVarG = jv.g(ml9.q(hq6.space_24, qz0Var));
                ev evVar = new ev(ml9.q(hq6.space_16, qz0Var), true, new g8(2, eq.p));
                int i4 = fs6.ending_recommendation_pane_max_rows;
                s01 s01Var = e.c;
                ok4.c(null, evVar, evVarG, null, ((Resources) qz0Var.j(s01Var)).getInteger(fs6.ending_recommendation_pane_max_item_rows_in_each_row), ((Resources) qz0Var.j(s01Var)).getInteger(i4), s7.X(-856471691, new b22(fy6Var, dp2Var, i3), qz0Var), qz0Var, 1572864);
                break;
            default:
                qz0 qz0Var2 = (qz0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                js3.p((zf2) obj, "$this$FlowRow");
                if (qz0Var2.R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    ArrayList arrayListG0 = a.g0(fy6Var.a.a, ((Resources) qz0Var2.j(e.c)).getInteger(fs6.ending_recommendation_pane_max_items_in_each_row));
                    int size = arrayListG0.size();
                    int i5 = 0;
                    while (i5 < size) {
                        List list = (List) arrayListG0.get(i5);
                        fv fvVar2 = jv.a;
                        cb7 cb7VarA = bb7.a(new ev(ml9.q(hq6.space_16, qz0Var2), true, new g8(i2, eq.p)), eq.l, qz0Var2, 0);
                        long j = qz0Var2.T;
                        int i6 = (int) (j ^ (j >>> 32));
                        j56 j56VarL = qz0Var2.l();
                        hx4 hx4VarC = b.c(qz0Var2, ex4.b);
                        hz0.d0.getClass();
                        bp2 bp2Var = d.b;
                        qz0Var2.e0();
                        if (qz0Var2.S) {
                            qz0Var2.k(bp2Var);
                        } else {
                            qz0Var2.o0();
                        }
                        ia7.o(qz0Var2, d.f, cb7VarA);
                        ia7.o(qz0Var2, d.e, j56VarL);
                        ia7.g(qz0Var2, Integer.valueOf(i6), d.g);
                        ia7.n(qz0Var2, d.h);
                        ia7.o(qz0Var2, d.d, hx4VarC);
                        qz0Var2.a0(-2054741987);
                        int size2 = list.size();
                        for (int i7 = 0; i7 < size2; i7++) {
                            bt2.b(null, (qx6) list.get(i7), dp2Var, qz0Var2, 0);
                        }
                        qz0Var2.q(false);
                        qz0Var2.q(true);
                        i5++;
                        i2 = 2;
                    }
                } else {
                    qz0Var2.U();
                }
                break;
        }
        return tx8Var;
    }
}
