package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class pk {
    public static final long a;

    static {
        long j = Integer.MIN_VALUE;
        a = (j & 4294967295L) | (j << 32);
    }

    public static hx4 a(hx4 hx4Var, o38 o38Var, qp2 qp2Var, int i) {
        if ((i & 1) != 0) {
            long j = 1;
            o38Var = y97.c0(0.0f, 400.0f, new zq3((j & 4294967295L) | (j << 32)), 1);
        }
        if ((i & 2) != 0) {
            qp2Var = null;
        }
        return zk8.t(hx4Var).d(new fy7(o38Var, qp2Var));
    }
}
