package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class wf9 {
    public static final ya5 a;
    public static final uf9[] b;

    static {
        ya5 ya5Var = new ya5(8);
        uf9.a.getClass();
        vf9 vf9Var = tf9.g;
        ya5Var.h(1, vf9Var);
        vf9 vf9Var2 = tf9.f;
        ya5Var.h(2, vf9Var2);
        vf9 vf9Var3 = tf9.b;
        ya5Var.h(4, vf9Var3);
        vf9 vf9Var4 = tf9.d;
        ya5Var.h(8, vf9Var4);
        vf9 vf9Var5 = tf9.h;
        ya5Var.h(16, vf9Var5);
        vf9 vf9Var6 = tf9.e;
        ya5Var.h(32, vf9Var6);
        vf9 vf9Var7 = tf9.i;
        ya5Var.h(64, vf9Var7);
        vf9 vf9Var8 = tf9.c;
        ya5Var.h(128, vf9Var8);
        a = ya5Var;
        b = new uf9[]{vf9Var, vf9Var2, vf9Var3, vf9Var7, vf9Var5, vf9Var6, vf9Var4, tf9.j, vf9Var8};
    }

    public static final void a(we4 we4Var, wy6 wy6Var, long j, int i, int i2) {
        if (c77.d(j, -1L)) {
            return;
        }
        we4Var.a(wy6Var.b(), (int) ((j >>> 48) & 65535));
        we4Var.a(wy6Var.c(), (int) ((j >>> 32) & 65535));
        we4Var.a(wy6Var.d(), i - ((int) ((j >>> 16) & 65535)));
        we4Var.a(wy6Var.a(), i2 - ((int) (j & 65535)));
    }
}
