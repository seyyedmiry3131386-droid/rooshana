package defpackage;

import androidx.compose.material3.m;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ou6 implements sp2 {
    public final /* synthetic */ List a;
    public final /* synthetic */ int b;
    public final /* synthetic */ qa6 c;

    public ou6(List list, int i, qa6 qa6Var) {
        this.a = list;
        this.b = i;
        this.c = qa6Var;
    }

    @Override // defpackage.sp2
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        l24 l24Var = (l24) obj;
        int iIntValue = ((Number) obj2).intValue();
        qz0 qz0Var = (qz0) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (qz0Var.f(l24Var) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= qz0Var.d(iIntValue) ? 32 : 16;
        }
        if (qz0Var.R(i & 1, (i & 147) != 146)) {
            tu6 tu6Var = (tu6) this.a.get(iIntValue);
            qz0Var.a0(-631049604);
            int i2 = tu6Var.b;
            int i3 = this.b;
            boolean z = i2 == i3;
            Object objM = qz0Var.M();
            av avVar = jz0.a;
            if (objM == avVar) {
                objM = o40.r(qz0Var);
            }
            ab5 ab5Var = (ab5) objM;
            Object objJ = qz0Var.j(uj8.a);
            js3.m(objJ);
            m mVarA = r97.a(0.0f, 3, ((tj8) objJ).z);
            v97 v97Var = new v97(3);
            qa6 qa6Var = this.c;
            boolean zF = qz0Var.f(qa6Var) | qz0Var.h(tu6Var);
            Object objM2 = qz0Var.M();
            if (zF || objM2 == avVar) {
                objM2 = new zd3(qa6Var, tu6Var);
                qz0Var.l0(objM2);
            }
            tt3.f(tv8.x(z, ab5Var, mVarA, true, v97Var, (bp2) objM2), tu6Var.a, tu6Var.b == i3, qz0Var, 0);
            qz0Var.q(false);
        } else {
            qz0Var.U();
        }
        return tx8.a;
    }
}
