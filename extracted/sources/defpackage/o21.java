package defpackage;

import androidx.compose.ui.graphics.colorspace.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class o21 {
    public static final ya5 a;

    static {
        a aVar = pv0.e;
        int i = aVar.c;
        l21 l21Var = new l21(aVar, aVar, 1);
        int i2 = aVar.c;
        ls5 ls5Var = pv0.x;
        int i3 = (ls5Var.c << 6) | i2;
        n21 n21Var = new n21(aVar, ls5Var, 0);
        int i4 = (i2 << 6) | ls5Var.c;
        n21 n21Var2 = new n21(ls5Var, aVar, 0);
        ya5 ya5Var = qq3.a;
        ya5 ya5Var2 = new ya5();
        ya5Var2.h(i | (i << 6), l21Var);
        ya5Var2.h(i3, n21Var);
        ya5Var2.h(i4, n21Var2);
        a = ya5Var2;
    }
}
