package defpackage;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.unit.LayoutDirection;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ak1 implements dp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ak1(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i;
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ck1 ck1Var = (ck1) this.c;
                wq3 wq3Var = (wq3) this.d;
                ib5 ib5Var = (ib5) this.e;
                if (obj == ck1Var) {
                    throw new IllegalStateException("A derived state calculation cannot read itself");
                }
                if (obj instanceof e58) {
                    int i = wq3Var.a - this.b;
                    int iD = ib5Var.d(obj);
                    ib5Var.g(Math.min(i, iD >= 0 ? ib5Var.c[iD] : Integer.MAX_VALUE), obj);
                }
                return tx8.a;
            case 1:
                tc3 tc3Var = (tc3) this.c;
                el4 el4Var = (el4) this.d;
                b96 b96Var = (b96) this.e;
                a96 a96Var = (a96) obj;
                int i2 = tc3Var.c;
                qh8 qh8Var = tc3Var.b;
                tq8 tq8Var = tc3Var.d;
                si8 si8Var = (si8) tc3Var.e.invoke();
                qh8Var.b(Orientation.b, sa7.c(a96Var, i2, tq8Var, si8Var != null ? si8Var.a : null, el4Var.getLayoutDirection() == LayoutDirection.b, b96Var.a), this.b, b96Var.a);
                a96.j(a96Var, b96Var, Math.round(-qh8Var.a()), 0);
                return tx8.a;
            default:
                b96[] b96VarArr = (b96[]) this.c;
                cb7 cb7Var = (cb7) this.d;
                int[] iArr = (int[]) this.e;
                a96 a96Var2 = (a96) obj;
                int length = b96VarArr.length;
                int i3 = 0;
                int i4 = 0;
                while (i3 < length) {
                    b96 b96Var2 = b96VarArr[i3];
                    int i5 = i4 + 1;
                    js3.m(b96Var2);
                    Object objV = b96Var2.v();
                    ab7 ab7Var = objV instanceof ab7 ? (ab7) objV : null;
                    ok4 ok4Var = ab7Var != null ? ab7Var.c : null;
                    int i6 = this.b;
                    a96Var2.g(b96Var2, iArr[i4], ok4Var != null ? ok4Var.k(i6, LayoutDirection.a, b96Var2) : cb7Var.b.a(b96Var2.b, i6), 0.0f);
                    i3++;
                    i4 = i5;
                }
                return tx8.a;
        }
    }

    public /* synthetic */ ak1(b96[] b96VarArr, cb7 cb7Var, int i, int[] iArr) {
        this.a = 2;
        this.c = b96VarArr;
        this.d = cb7Var;
        this.b = i;
        this.e = iArr;
    }
}
