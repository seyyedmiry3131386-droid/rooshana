package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class bb7 {
    public static final cb7 a = new cb7(jv.a, eq.l);

    public static final cb7 a(dv dvVar, bb0 bb0Var, qz0 qz0Var, int i) {
        if (js3.i(dvVar, jv.a) && js3.i(bb0Var, eq.l)) {
            qz0Var.a0(-1073830487);
            qz0Var.q(false);
            return a;
        }
        qz0Var.a0(-1073779616);
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && qz0Var.f(dvVar)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !qz0Var.f(bb0Var)) && (i & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object objM = qz0Var.M();
        if (z3 || objM == jz0.a) {
            objM = new cb7(dvVar, bb0Var);
            qz0Var.l0(objM);
        }
        cb7 cb7Var = (cb7) objM;
        qz0Var.q(false);
        return cb7Var;
    }
}
