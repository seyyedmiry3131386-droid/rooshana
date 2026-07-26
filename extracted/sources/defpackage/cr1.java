package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class cr1 extends wj6 {
    public static final cr1 c = new cr1(jr1.a);

    @Override // defpackage.p
    public final int d(Object obj) {
        double[] dArr = (double[]) obj;
        js3.p(dArr, "<this>");
        return dArr.length;
    }

    @Override // defpackage.tu0, defpackage.p
    public final void f(tz0 tz0Var, int i, Object obj) {
        zq1 zq1Var = (zq1) obj;
        js3.p(zq1Var, "builder");
        double dJ = tz0Var.j(this.b, i);
        zq1Var.b(zq1Var.d() + 1);
        double[] dArr = zq1Var.a;
        int i2 = zq1Var.b;
        zq1Var.b = i2 + 1;
        dArr[i2] = dJ;
    }

    @Override // defpackage.p
    public final Object g(Object obj) {
        double[] dArr = (double[]) obj;
        js3.p(dArr, "<this>");
        zq1 zq1Var = new zq1();
        zq1Var.a = dArr;
        zq1Var.b = dArr.length;
        zq1Var.b(10);
        return zq1Var;
    }

    @Override // defpackage.wj6
    public final Object j() {
        return new double[0];
    }

    @Override // defpackage.wj6
    public final void k(uz0 uz0Var, Object obj, int i) {
        double[] dArr = (double[]) obj;
        js3.p(uz0Var, "encoder");
        js3.p(dArr, "content");
        for (int i2 = 0; i2 < i; i2++) {
            uz0Var.d(this.b, i2, dArr[i2]);
        }
    }
}
