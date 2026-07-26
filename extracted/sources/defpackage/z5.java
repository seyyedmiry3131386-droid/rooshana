package defpackage;

import androidx.compose.foundation.layout.b;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class z5 implements rp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ z5(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // defpackage.rp2
    public final Object a(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                qz0 qz0Var = (qz0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                js3.p((db7) obj, "$this$Button");
                if (qz0Var.R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    kh3.a(rf0.G(this.b, qz0Var), b.i(ex4.b, ml9.q(hq6.icon_size_small, qz0Var)), 0L, qz0Var, 56, 8);
                } else {
                    qz0Var.U();
                }
                break;
            case 1:
                qz0 qz0Var2 = (qz0) obj2;
                ((Integer) obj3).getClass();
                js3.p((ik) obj, "$this$AnimatedVisibility");
                String strF = ln2.f(this.b, qz0Var2);
                gj8 gj8Var = ((wf5) qz0Var2.j(aw8.a)).d;
                Object objJ = qz0Var2.j(uj8.a);
                js3.m(objJ);
                mi8.b(strF, null, ((tj8) objJ).j, 0L, 0L, null, 0L, 0, false, 0, 0, gj8Var, qz0Var2, 0, 0, 131066);
                break;
            default:
                qz0 qz0Var3 = (qz0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                js3.p((db7) obj, "$this$Button");
                if (qz0Var3.R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    kh3.a(rf0.G(this.b, qz0Var3), b.i(ex4.b, ml9.q(hq6.icon_size_large, qz0Var3)), 0L, qz0Var3, 56, 8);
                } else {
                    qz0Var3.U();
                }
                break;
        }
        return tx8.a;
    }
}
