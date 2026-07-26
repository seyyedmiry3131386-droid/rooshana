package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class fv5 extends ri2 {
    public static final fv5 d = new fv5(0, 1, 1);

    @Override // defpackage.ri2
    public final void a(vl1 vl1Var, ou ouVar, fz7 fz7Var, l37 l37Var, lv5 lv5Var) {
        my6 my6Var = (my6) vl1Var.e(0);
        rb5 rb5Var = (rb5) l37Var.j;
        x36 x36Var = rb5Var != null ? (x36) rb5Var.g(my6Var) : null;
        if (x36Var != null) {
            ArrayList arrayList = l37Var.a;
            if (arrayList == null) {
                arrayList = new ArrayList();
                l37Var.a = arrayList;
            }
            arrayList.add((zb5) l37Var.e);
            l37Var.e = x36Var.b;
        }
    }
}
