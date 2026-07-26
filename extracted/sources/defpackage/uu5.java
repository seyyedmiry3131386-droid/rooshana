package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class uu5 extends ri2 {
    public static final uu5 d = new uu5(0, 3, 1);

    @Override // defpackage.ri2
    public final void a(vl1 vl1Var, ou ouVar, fz7 fz7Var, l37 l37Var, lv5 lv5Var) {
        hh2 hh2Var;
        cz7 cz7Var = (cz7) vl1Var.e(1);
        ge geVar = (ge) vl1Var.e(0);
        pd2 pd2Var = (pd2) vl1Var.e(2);
        fz7 fz7VarE = cz7Var.e();
        if (lv5Var != null) {
            try {
                hh2Var = new hh2(lv5Var, fz7Var, 25);
            } catch (Throwable th) {
                fz7VarE.e(false);
                throw th;
            }
        } else {
            hh2Var = null;
        }
        if (!pd2Var.h.B0()) {
            sz0.a("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        pd2Var.g.A0(ouVar, fz7VarE, l37Var, hh2Var);
        fz7VarE.e(true);
        fz7Var.d();
        geVar.getClass();
        fz7Var.A(cz7Var, cz7Var.a(geVar));
        fz7Var.k();
    }
}
