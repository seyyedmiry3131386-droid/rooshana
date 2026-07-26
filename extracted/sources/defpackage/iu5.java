package defpackage;

import java.util.List;
import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: classes.dex */
public final class iu5 extends ri2 {
    public static final iu5 d = new iu5(0, 4, 1);

    @Override // defpackage.ri2
    public final void a(vl1 vl1Var, ou ouVar, fz7 fz7Var, l37 l37Var, lv5 lv5Var) {
        lz4 lz4Var = (lz4) vl1Var.e(2);
        lz4 lz4Var2 = (lz4) vl1Var.e(3);
        d01 d01Var = (d01) vl1Var.e(1);
        kz4 kz4VarP = (kz4) vl1Var.e(0);
        if (kz4VarP == null && (kz4VarP = d01Var.p(lz4Var)) == null) {
            sz0.b("Could not resolve state for movable content");
            throw new KotlinNothingValueException();
        }
        cz7 cz7Var = kz4VarP.a;
        if (fz7Var.n > 0 || fz7Var.u(fz7Var.t + 1) != 1) {
            sz0.a("Check failed");
        }
        int i = fz7Var.t;
        int i2 = fz7Var.i;
        int i3 = fz7Var.j;
        fz7Var.a(1);
        fz7Var.R();
        fz7Var.d();
        fz7 fz7VarE = cz7Var.e();
        try {
            List listG = w07.g(fz7VarE, 2, fz7Var, false, true, true);
            fz7VarE.e(true);
            fz7Var.k();
            fz7Var.j();
            fz7Var.t = i;
            fz7Var.i = i2;
            fz7Var.j = i3;
            br9.n(fz7Var, listG, lz4Var2.c);
        } catch (Throwable th) {
            fz7VarE.e(false);
            throw th;
        }
    }
}
