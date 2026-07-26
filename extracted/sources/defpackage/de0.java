package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class de0 extends wj6 {
    public static final de0 c = new de0(ee0.a);

    @Override // defpackage.p
    public final int d(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        js3.p(zArr, "<this>");
        return zArr.length;
    }

    @Override // defpackage.tu0, defpackage.p
    public final void f(tz0 tz0Var, int i, Object obj) {
        ae0 ae0Var = (ae0) obj;
        js3.p(ae0Var, "builder");
        boolean zA = tz0Var.A(this.b, i);
        ae0Var.b(ae0Var.d() + 1);
        boolean[] zArr = ae0Var.a;
        int i2 = ae0Var.b;
        ae0Var.b = i2 + 1;
        zArr[i2] = zA;
    }

    @Override // defpackage.p
    public final Object g(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        js3.p(zArr, "<this>");
        ae0 ae0Var = new ae0();
        ae0Var.a = zArr;
        ae0Var.b = zArr.length;
        ae0Var.b(10);
        return ae0Var;
    }

    @Override // defpackage.wj6
    public final Object j() {
        return new boolean[0];
    }

    @Override // defpackage.wj6
    public final void k(uz0 uz0Var, Object obj, int i) {
        boolean[] zArr = (boolean[]) obj;
        js3.p(uz0Var, "encoder");
        js3.p(zArr, "content");
        for (int i2 = 0; i2 < i; i2++) {
            uz0Var.n(this.b, i2, zArr[i2]);
        }
    }
}
