package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class j98 {
    public static final fu1 a;

    static {
        float f = 40;
        float f2 = 10;
        a = new fu1(f2, f, f2, f);
    }

    public static final hx4 a(boolean z, boolean z2, bp2 bp2Var) {
        hx4 m98Var = ex4.b;
        if (!z || !l98.a) {
            return m98Var;
        }
        if (z2) {
            m98Var = new m98(a);
        }
        return m98Var.d(new i98(bp2Var));
    }
}
