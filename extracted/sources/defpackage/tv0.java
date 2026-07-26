package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class tv0 {
    public static final vv0 a = new vv0(jv.c, eq.o);

    public static final vv0 a(hv hvVar, ab0 ab0Var, qz0 qz0Var, int i) {
        if (hvVar.equals(jv.c) && ab0Var.equals(eq.o)) {
            qz0Var.a0(-1446604504);
            qz0Var.q(false);
            return a;
        }
        qz0Var.a0(-1446550657);
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && qz0Var.f(hvVar)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !qz0Var.f(ab0Var)) && (i & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object objM = qz0Var.M();
        if (z3 || objM == jz0.a) {
            objM = new vv0(hvVar, ab0Var);
            qz0Var.l0(objM);
        }
        vv0 vv0Var = (vv0) objM;
        qz0Var.q(false);
        return vv0Var;
    }
}
