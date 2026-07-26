package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class du5 implements sp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ Object c;

    public /* synthetic */ du5(List list, Object obj, int i) {
        this.a = i;
        this.b = list;
        this.c = obj;
    }

    @Override // defpackage.sp2
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        switch (this.a) {
            case 0:
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
                    qx6 qx6Var = (qx6) this.b.get(iIntValue);
                    qz0Var.a0(-896958394);
                    wu8.d(null, qx6Var, (dp2) this.c, qz0Var, 0);
                    qz0Var.q(false);
                } else {
                    qz0Var.U();
                }
                break;
            default:
                l24 l24Var2 = (l24) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                qz0 qz0Var2 = (qz0) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i2 = (qz0Var2.f(l24Var2) ? 4 : 2) | iIntValue4;
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= qz0Var2.d(iIntValue3) ? 32 : 16;
                }
                if (qz0Var2.R(i2 & 1, (i2 & 147) != 146)) {
                    c32 c32Var = (c32) this.b.get(iIntValue3);
                    qz0Var2.a0(-1032071535);
                    c26.a(null, c32Var, qz0Var2, 0);
                    if (iIntValue3 < br9.y((List) this.c)) {
                        qz0Var2.a0(-1031994656);
                        hx4 hx4VarB = yh0.B(ex4.b, ml9.q(hq6.space_16, qz0Var2), 0.0f, 2);
                        float fQ = ml9.q(hq6.size_1, qz0Var2);
                        Object objJ = qz0Var2.j(uj8.a);
                        js3.m(objJ);
                        tt3.b(hx4VarB, fQ, ((tj8) objJ).r, qz0Var2, 0, 0);
                    } else {
                        qz0Var2.a0(-1038950684);
                    }
                    qz0Var2.q(false);
                    qz0Var2.q(false);
                } else {
                    qz0Var2.U();
                }
                break;
        }
        return tx8.a;
    }
}
