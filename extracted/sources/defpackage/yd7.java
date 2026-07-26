package defpackage;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.material3.SheetValue;
import androidx.compose.material3.n;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yd7 implements qp2 {
    public final /* synthetic */ int a;

    public /* synthetic */ yd7(int i) {
        this.a = i;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return Integer.valueOf(((wi8) obj2).a);
            case 1:
                return Integer.valueOf(((tg7) obj2).f());
            case 2:
                return (SheetValue) ((s08) ((n) obj2).d.g).getValue();
            case 3:
                qh8 qh8Var = (qh8) obj2;
                return br9.C(Float.valueOf(qh8Var.a()), Boolean.valueOf(((Orientation) ((s08) qh8Var.f).getValue()) == Orientation.a));
            case 4:
                u61 u61Var = (u61) obj2;
                if (!(u61Var instanceof sk8)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int iIntValue = num != null ? num.intValue() : 1;
                return iIntValue == 0 ? u61Var : Integer.valueOf(iIntValue + 1);
            case 5:
                sk8 sk8Var = (sk8) obj;
                u61 u61Var2 = (u61) obj2;
                if (sk8Var != null) {
                    return sk8Var;
                }
                if (u61Var2 instanceof sk8) {
                    return (sk8) u61Var2;
                }
                return null;
            default:
                xk8 xk8Var = (xk8) obj;
                u61 u61Var3 = (u61) obj2;
                if (u61Var3 instanceof sk8) {
                    sk8 sk8Var2 = (sk8) u61Var3;
                    Object objC = sk8Var2.c(xk8Var.a);
                    Object[] objArr = xk8Var.b;
                    int i = xk8Var.d;
                    objArr[i] = objC;
                    sk8[] sk8VarArr = xk8Var.c;
                    xk8Var.d = i + 1;
                    sk8VarArr[i] = sk8Var2;
                }
                return xk8Var;
        }
    }
}
