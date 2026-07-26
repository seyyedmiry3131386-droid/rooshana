package defpackage;

import androidx.compose.runtime.internal.a;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class jt3 implements sp2 {
    public final /* synthetic */ List a;
    public final /* synthetic */ a b;
    public final /* synthetic */ pj3 c;

    public jt3(List list, a aVar, pj3 pj3Var) {
        this.a = list;
        this.b = aVar;
        this.c = pj3Var;
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
            kf0 kf0Var = (kf0) this.a.get(iIntValue);
            qz0Var.a0(1904250318);
            this.b.a(kf0Var, qz0Var, 0);
            if (iIntValue < br9.y(this.c)) {
                qz0Var.a0(1904304133);
                hx4 hx4VarB = yh0.B(ex4.b, ml9.q(hq6.space_16, qz0Var), 0.0f, 2);
                float fQ = ml9.q(hq6.size_1, qz0Var);
                Object objJ = qz0Var.j(uj8.a);
                js3.m(objJ);
                tt3.b(hx4VarB, fQ, ((tj8) objJ).r, qz0Var, 0, 0);
            } else {
                qz0Var.a0(1902062089);
            }
            qz0Var.q(false);
            qz0Var.q(false);
        } else {
            qz0Var.U();
        }
        return tx8.a;
    }
}
