package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ku5 extends ri2 {
    public static final ku5 d = new ku5(0, 2, 1);

    @Override // defpackage.ri2
    public final void a(vl1 vl1Var, ou ouVar, fz7 fz7Var, l37 l37Var, lv5 lv5Var) {
        int i;
        wq3 wq3Var = (wq3) vl1Var.e(0);
        int iC = fz7Var.c((ge) vl1Var.e(1));
        if (fz7Var.t >= iC) {
            sz0.a("Check failed");
        }
        wq2.R(fz7Var, ouVar, iC);
        int i2 = fz7Var.t;
        int iG = fz7Var.v;
        while (iG >= 0 && !fz7Var.y(iG)) {
            iG = fz7Var.G(fz7Var.b, iG);
        }
        int iU = iG + 1;
        int iN = 0;
        while (iU < i2) {
            if (fz7Var.v(i2, iU)) {
                if (fz7Var.y(iU)) {
                    iN = 0;
                }
                iU++;
            } else {
                iN += fz7Var.y(iU) ? 1 : fz7Var.F(iU);
                iU += fz7Var.u(iU);
            }
        }
        while (true) {
            i = fz7Var.t;
            if (i >= iC) {
                break;
            }
            if (fz7Var.v(iC, i)) {
                int i3 = fz7Var.t;
                if (i3 < fz7Var.u && (fz7Var.b[(fz7Var.r(i3) * 5) + 1] & 1073741824) != 0) {
                    ouVar.c(fz7Var.E(fz7Var.t));
                    iN = 0;
                }
                fz7Var.R();
            } else {
                iN += fz7Var.N();
            }
        }
        if (i != iC) {
            sz0.a("Check failed");
        }
        wq3Var.a = iN;
    }
}
