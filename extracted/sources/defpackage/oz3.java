package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class oz3 {
    public static final s01 a = new s01(new qq1(23));
    public static final s01 b = new s01(new qq1(24));

    public static final lf7 a(qz0 qz0Var) {
        lf7 lf7Var;
        Object obj;
        s01 s01Var = b;
        qz0Var.a0(1668867238);
        try {
            zy0 zy0Var = (zy0) qz0Var.j(s01Var);
            if (zy0Var.b == null) {
                zy0Var.b = zy0Var.a.invoke();
            }
            obj = zy0Var.b;
        } catch (Exception e) {
            zy0 zy0Var2 = (zy0) qz0Var.j(s01Var);
            Object objInvoke = zy0Var2.a.invoke();
            zy0Var2.b = objInvoke;
            lf7Var = (lf7) objInvoke;
            if (lf7Var == null) {
                throw new IllegalStateException(("Can't get Koin scope due to error: " + e).toString());
            }
        }
        if (obj == null) {
            throw new IllegalStateException("Can't retrieve value for ");
        }
        lf7Var = (lf7) obj;
        if (lf7Var.j) {
            zy0 zy0Var3 = (zy0) qz0Var.j(s01Var);
            Object objInvoke2 = zy0Var3.a.invoke();
            zy0Var3.b = objInvoke2;
            lf7 lf7Var2 = (lf7) objInvoke2;
            if (lf7Var2 == null) {
                throw new IllegalStateException(("Can't get Koin scope. Scope '" + lf7Var + "' is closed").toString());
            }
            lf7Var = lf7Var2;
        }
        qz0Var.q(false);
        return lf7Var;
    }
}
