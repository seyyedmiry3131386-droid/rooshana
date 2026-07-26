package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class zu5 extends ri2 {
    public static final zu5 d = new zu5(0, 1, 1);

    @Override // defpackage.ri2
    public final void a(vl1 vl1Var, ou ouVar, fz7 fz7Var, l37 l37Var, lv5 lv5Var) {
        my6 my6Var = (my6) vl1Var.e(0);
        Set set = (Set) l37Var.b;
        if (set == null) {
            return;
        }
        x36 x36Var = new x36(set);
        rb5 rb5Var = (rb5) l37Var.j;
        if (rb5Var == null) {
            long[] jArr = ce7.a;
            rb5Var = new rb5();
            l37Var.j = rb5Var;
        }
        rb5Var.m(my6Var, x36Var);
        ((zb5) l37Var.e).b(new n37(x36Var, -1));
    }
}
