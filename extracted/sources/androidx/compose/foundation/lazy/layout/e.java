package androidx.compose.foundation.lazy.layout;

import defpackage.bs3;
import defpackage.dp2;
import defpackage.dy3;
import defpackage.ib5;
import defpackage.js3;
import defpackage.pg;
import defpackage.rm7;
import defpackage.s34;
import defpackage.un3;
import defpackage.uq3;
import defpackage.xq5;
import defpackage.zb5;

/* JADX INFO: loaded from: classes.dex */
public final class e {
    public final ib5 a;
    public final Object[] b;
    public final int c;

    public e(uq3 uq3Var, s34 s34Var) {
        pg pgVar = s34Var.a;
        int i = uq3Var.a;
        if (i < 0) {
            un3.c("negative nearestRange.first");
        }
        int iMin = Math.min(uq3Var.b, pgVar.b - 1);
        if (iMin < i) {
            ib5 ib5Var = xq5.a;
            js3.n(ib5Var, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>");
            this.a = ib5Var;
            this.b = new Object[0];
            this.c = 0;
            return;
        }
        int i2 = (iMin - i) + 1;
        this.b = new Object[i2];
        this.c = i;
        ib5 ib5Var2 = new ib5(i2);
        zb5 zb5Var = (zb5) pgVar.c;
        if (i < 0 || i >= pgVar.b) {
            StringBuilder sbR = rm7.r(i, "Index ", ", size ");
            sbR.append(pgVar.b);
            un3.e(sbR.toString());
        }
        if (iMin < 0 || iMin >= pgVar.b) {
            StringBuilder sbR2 = rm7.r(iMin, "Index ", ", size ");
            sbR2.append(pgVar.b);
            un3.e(sbR2.toString());
        }
        if (iMin < i) {
            un3.a("toIndex (" + iMin + ") should be not smaller than fromIndex (" + i + ')');
        }
        int iF = dy3.f(i, zb5Var);
        int i3 = ((bs3) zb5Var.a[iF]).a;
        while (i3 <= iMin) {
            bs3 bs3Var = (bs3) zb5Var.a[iF];
            dp2 dp2Var = (dp2) bs3Var.c.d;
            int i4 = bs3Var.a;
            int iMax = Math.max(i, i4);
            int iMin2 = Math.min(iMin, (bs3Var.b + i4) - 1);
            if (iMax <= iMin2) {
                while (true) {
                    Object objInvoke = dp2Var.invoke(Integer.valueOf(iMax - i4));
                    objInvoke = objInvoke == null ? new DefaultLazyKey(iMax) : objInvoke;
                    ib5Var2.g(iMax, objInvoke);
                    this.b[iMax - this.c] = objInvoke;
                    iMax = iMax != iMin2 ? iMax + 1 : iMax;
                }
            }
            i3 += bs3Var.b;
            iF++;
        }
        this.a = ib5Var2;
    }

    public final int a(Object obj) {
        ib5 ib5Var = this.a;
        int iD = ib5Var.d(obj);
        if (iD >= 0) {
            return ib5Var.c[iD];
        }
        return -1;
    }
}
