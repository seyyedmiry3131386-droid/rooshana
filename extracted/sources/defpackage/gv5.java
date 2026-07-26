package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gv5 extends ri2 {
    public static final gv5 d = new gv5(1, 0, 2);

    @Override // defpackage.ri2
    public final void a(vl1 vl1Var, ou ouVar, fz7 fz7Var, l37 l37Var, lv5 lv5Var) {
        int iD = vl1Var.d(0);
        int i = fz7Var.v;
        int iP = fz7Var.P(fz7Var.b, fz7Var.r(i));
        int iG = fz7Var.g(fz7Var.b, fz7Var.r(i + 1));
        for (int iMax = Math.max(iP, iG - iD); iMax < iG; iMax++) {
            Object obj = fz7Var.c[fz7Var.h(iMax)];
            if (obj instanceof n37) {
                l37Var.f((n37) obj);
            } else if (obj instanceof my6) {
                ((my6) obj).d();
            }
        }
        if (iD <= 0) {
            sz0.a("Check failed");
        }
        int i2 = fz7Var.v;
        int iP2 = fz7Var.P(fz7Var.b, fz7Var.r(i2));
        int iG2 = fz7Var.g(fz7Var.b, fz7Var.r(i2 + 1)) - iD;
        if (iG2 < iP2) {
            sz0.a("Check failed");
        }
        fz7Var.L(iG2, iD, i2);
        int i3 = fz7Var.i;
        if (i3 >= iP2) {
            fz7Var.i = i3 - iD;
        }
    }
}
