package androidx.compose.ui.graphics;

import defpackage.dp2;
import defpackage.gv2;
import defpackage.hx4;
import defpackage.lq8;
import defpackage.o87;
import defpackage.tt3;
import defpackage.xr7;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static o87 a;

    public static final hx4 a(hx4 hx4Var, dp2 dp2Var) {
        return hx4Var.d(new a(dp2Var));
    }

    public static hx4 b(hx4 hx4Var, float f, float f2, float f3, float f4, xr7 xr7Var, int i) {
        float f5 = (i & 1) != 0 ? 1.0f : f;
        float f6 = (i & 2) != 0 ? 1.0f : f2;
        float f7 = (i & 4) != 0 ? 1.0f : f3;
        float f8 = (i & 32) != 0 ? 0.0f : f4;
        long j = lq8.b;
        xr7 xr7Var2 = (i & 2048) != 0 ? tt3.d : xr7Var;
        long j2 = gv2.a;
        return hx4Var.d(new c(f5, f6, f7, f8, j, xr7Var2, false, j2, j2));
    }

    public static hx4 c(hx4 hx4Var, float f, xr7 xr7Var, int i) {
        float f2 = (i & 4) != 0 ? 1.0f : f;
        long j = lq8.b;
        xr7 xr7Var2 = (i & 2048) != 0 ? tt3.d : xr7Var;
        long j2 = gv2.a;
        return hx4Var.d(new c(1.0f, 1.0f, f2, 0.0f, j, xr7Var2, true, j2, j2));
    }
}
