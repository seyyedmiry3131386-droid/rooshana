package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ww8 extends wj6 {
    public static final ww8 c = new ww8(xw8.a);

    @Override // defpackage.p
    public final int d(Object obj) {
        long[] jArr = ((uw8) obj).a;
        js3.p(jArr, "$this$collectionSize");
        return jArr.length;
    }

    @Override // defpackage.tu0, defpackage.p
    public final void f(tz0 tz0Var, int i, Object obj) {
        vw8 vw8Var = (vw8) obj;
        js3.p(vw8Var, "builder");
        long jX = tz0Var.f(this.b, i).x();
        vw8Var.b(vw8Var.d() + 1);
        long[] jArr = vw8Var.a;
        int i2 = vw8Var.b;
        vw8Var.b = i2 + 1;
        jArr[i2] = jX;
    }

    @Override // defpackage.p
    public final Object g(Object obj) {
        long[] jArr = ((uw8) obj).a;
        js3.p(jArr, "$this$toBuilder");
        vw8 vw8Var = new vw8();
        vw8Var.a = jArr;
        vw8Var.b = jArr.length;
        vw8Var.b(10);
        return vw8Var;
    }

    @Override // defpackage.wj6
    public final Object j() {
        return new uw8(new long[0]);
    }

    @Override // defpackage.wj6
    public final void k(uz0 uz0Var, Object obj, int i) {
        long[] jArr = ((uw8) obj).a;
        js3.p(uz0Var, "encoder");
        for (int i2 = 0; i2 < i; i2++) {
            uz0Var.B(this.b, i2).A(jArr[i2]);
        }
    }
}
