package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class qp0 extends wj6 {
    public static final qp0 c = new qp0(wp0.a);

    @Override // defpackage.p
    public final int d(Object obj) {
        char[] cArr = (char[]) obj;
        js3.p(cArr, "<this>");
        return cArr.length;
    }

    @Override // defpackage.tu0, defpackage.p
    public final void f(tz0 tz0Var, int i, Object obj) {
        np0 np0Var = (np0) obj;
        js3.p(np0Var, "builder");
        char cK = tz0Var.k(this.b, i);
        np0Var.b(np0Var.d() + 1);
        char[] cArr = np0Var.a;
        int i2 = np0Var.b;
        np0Var.b = i2 + 1;
        cArr[i2] = cK;
    }

    @Override // defpackage.p
    public final Object g(Object obj) {
        char[] cArr = (char[]) obj;
        js3.p(cArr, "<this>");
        np0 np0Var = new np0();
        np0Var.a = cArr;
        np0Var.b = cArr.length;
        np0Var.b(10);
        return np0Var;
    }

    @Override // defpackage.wj6
    public final Object j() {
        return new char[0];
    }

    @Override // defpackage.wj6
    public final void k(uz0 uz0Var, Object obj, int i) {
        char[] cArr = (char[]) obj;
        js3.p(uz0Var, "encoder");
        js3.p(cArr, "content");
        for (int i2 = 0; i2 < i; i2++) {
            uz0Var.x(this.b, i2, cArr[i2]);
        }
    }
}
