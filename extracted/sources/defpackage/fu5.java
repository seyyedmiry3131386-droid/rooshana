package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fu5 extends ri2 {
    public static final fu5 d = new fu5(0, 2, 1);

    @Override // defpackage.ri2
    public final void a(vl1 vl1Var, ou ouVar, fz7 fz7Var, l37 l37Var, lv5 lv5Var) {
        ge geVar = (ge) vl1Var.e(0);
        Object objE = vl1Var.e(1);
        if (objE instanceof n37) {
            n37 n37Var = (n37) objE;
            ((zb5) l37Var.e).b(n37Var);
            ((sb5) l37Var.h).d(n37Var);
        }
        if (fz7Var.n != 0) {
            sz0.a("Can only append a slot if not current inserting");
        }
        int i = fz7Var.i;
        int i2 = fz7Var.j;
        int iC = fz7Var.c(geVar);
        int iG = fz7Var.g(fz7Var.b, fz7Var.r(iC + 1));
        fz7Var.i = iG;
        fz7Var.j = iG;
        fz7Var.x(1, iC);
        if (i >= iG) {
            i++;
            i2++;
        }
        fz7Var.c[iG] = objE;
        fz7Var.i = i;
        fz7Var.j = i2;
    }
}
