package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class hu5 extends ri2 {
    public static final hu5 d = new hu5(0, 2, 1);

    @Override // defpackage.ri2
    public final void a(vl1 vl1Var, ou ouVar, fz7 fz7Var, l37 l37Var, lv5 lv5Var) {
        int i = ((wq3) vl1Var.e(0)).a;
        List list = (List) vl1Var.e(1);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            int i3 = i + i2;
            ouVar.b(i3, obj);
            ouVar.m(i3, obj);
        }
    }
}
