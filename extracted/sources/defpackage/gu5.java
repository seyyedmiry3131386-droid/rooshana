package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gu5 extends ri2 {
    public static final gu5 d = new gu5(0, 2, 1);

    @Override // defpackage.ri2
    public final void a(vl1 vl1Var, ou ouVar, fz7 fz7Var, l37 l37Var, lv5 lv5Var) {
        wq3 wq3Var = (wq3) vl1Var.e(1);
        int i = wq3Var != null ? wq3Var.a : 0;
        uo0 uo0Var = (uo0) vl1Var.e(0);
        if (i > 0) {
            xr5 xr5Var = new xr5();
            xr5Var.c = ouVar;
            xr5Var.a = i;
            ouVar = xr5Var;
        }
        uo0Var.z0(ouVar, fz7Var, l37Var, lv5Var != null ? new hh2(lv5Var, fz7Var, 25) : null);
    }
}
