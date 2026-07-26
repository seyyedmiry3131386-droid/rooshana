package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class iv7 extends wj6 {
    public static final iv7 c = new iv7(jv7.a);

    @Override // defpackage.p
    public final int d(Object obj) {
        short[] sArr = (short[]) obj;
        js3.p(sArr, "<this>");
        return sArr.length;
    }

    @Override // defpackage.tu0, defpackage.p
    public final void f(tz0 tz0Var, int i, Object obj) {
        hv7 hv7Var = (hv7) obj;
        js3.p(hv7Var, "builder");
        short sQ = tz0Var.q(this.b, i);
        hv7Var.b(hv7Var.d() + 1);
        short[] sArr = hv7Var.a;
        int i2 = hv7Var.b;
        hv7Var.b = i2 + 1;
        sArr[i2] = sQ;
    }

    @Override // defpackage.p
    public final Object g(Object obj) {
        short[] sArr = (short[]) obj;
        js3.p(sArr, "<this>");
        hv7 hv7Var = new hv7();
        hv7Var.a = sArr;
        hv7Var.b = sArr.length;
        hv7Var.b(10);
        return hv7Var;
    }

    @Override // defpackage.wj6
    public final Object j() {
        return new short[0];
    }

    @Override // defpackage.wj6
    public final void k(uz0 uz0Var, Object obj, int i) {
        short[] sArr = (short[]) obj;
        js3.p(uz0Var, "encoder");
        js3.p(sArr, "content");
        for (int i2 = 0; i2 < i; i2++) {
            uz0Var.u(this.b, i2, sArr[i2]);
        }
    }
}
