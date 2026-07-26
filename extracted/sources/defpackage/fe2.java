package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class fe2 extends wj6 {
    public static final fe2 c = new fe2(je2.a);

    @Override // defpackage.p
    public final int d(Object obj) {
        float[] fArr = (float[]) obj;
        js3.p(fArr, "<this>");
        return fArr.length;
    }

    @Override // defpackage.tu0, defpackage.p
    public final void f(tz0 tz0Var, int i, Object obj) {
        ce2 ce2Var = (ce2) obj;
        js3.p(ce2Var, "builder");
        float fL = tz0Var.l(this.b, i);
        ce2Var.b(ce2Var.d() + 1);
        float[] fArr = ce2Var.a;
        int i2 = ce2Var.b;
        ce2Var.b = i2 + 1;
        fArr[i2] = fL;
    }

    @Override // defpackage.p
    public final Object g(Object obj) {
        float[] fArr = (float[]) obj;
        js3.p(fArr, "<this>");
        ce2 ce2Var = new ce2();
        ce2Var.a = fArr;
        ce2Var.b = fArr.length;
        ce2Var.b(10);
        return ce2Var;
    }

    @Override // defpackage.wj6
    public final Object j() {
        return new float[0];
    }

    @Override // defpackage.wj6
    public final void k(uz0 uz0Var, Object obj, int i) {
        float[] fArr = (float[]) obj;
        js3.p(uz0Var, "encoder");
        js3.p(fArr, "content");
        for (int i2 = 0; i2 < i; i2++) {
            uz0Var.s(this.b, i2, fArr[i2]);
        }
    }
}
