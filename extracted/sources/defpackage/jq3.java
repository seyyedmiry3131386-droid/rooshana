package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class jq3 extends wj6 {
    public static final jq3 c = new jq3(xq3.a);

    @Override // defpackage.p
    public final int d(Object obj) {
        int[] iArr = (int[]) obj;
        js3.p(iArr, "<this>");
        return iArr.length;
    }

    @Override // defpackage.tu0, defpackage.p
    public final void f(tz0 tz0Var, int i, Object obj) {
        gq3 gq3Var = (gq3) obj;
        js3.p(gq3Var, "builder");
        int iT = tz0Var.t(this.b, i);
        gq3Var.b(gq3Var.d() + 1);
        int[] iArr = gq3Var.a;
        int i2 = gq3Var.b;
        gq3Var.b = i2 + 1;
        iArr[i2] = iT;
    }

    @Override // defpackage.p
    public final Object g(Object obj) {
        int[] iArr = (int[]) obj;
        js3.p(iArr, "<this>");
        gq3 gq3Var = new gq3();
        gq3Var.a = iArr;
        gq3Var.b = iArr.length;
        gq3Var.b(10);
        return gq3Var;
    }

    @Override // defpackage.wj6
    public final Object j() {
        return new int[0];
    }

    @Override // defpackage.wj6
    public final void k(uz0 uz0Var, Object obj, int i) {
        int[] iArr = (int[]) obj;
        js3.p(uz0Var, "encoder");
        js3.p(iArr, "content");
        for (int i2 = 0; i2 < i; i2++) {
            uz0Var.v(i2, iArr[i2], this.b);
        }
    }
}
