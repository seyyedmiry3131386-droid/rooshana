package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class pu5 extends ri2 {
    public static final pu5 d = new pu5(0, 1, 1);

    @Override // defpackage.ri2
    public final void a(vl1 vl1Var, ou ouVar, fz7 fz7Var, l37 l37Var, lv5 lv5Var) {
        zb5 zb5Var;
        my6 my6Var = (my6) vl1Var.e(0);
        rb5 rb5Var = (rb5) l37Var.j;
        if (rb5Var == null || ((x36) rb5Var.g(my6Var)) == null) {
            return;
        }
        ArrayList arrayList = l37Var.a;
        if (arrayList != null && (zb5Var = (zb5) arrayList.remove(arrayList.size() - 1)) != null) {
            l37Var.e = zb5Var;
        }
        rb5Var.k(my6Var);
    }
}
