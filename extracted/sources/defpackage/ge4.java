package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ge4 extends wj6 {
    public static final ge4 c = new ge4(se4.a);

    @Override // defpackage.p
    public final int d(Object obj) {
        long[] jArr = (long[]) obj;
        js3.p(jArr, "<this>");
        return jArr.length;
    }

    @Override // defpackage.tu0, defpackage.p
    public final void f(tz0 tz0Var, int i, Object obj) {
        de4 de4Var = (de4) obj;
        js3.p(de4Var, "builder");
        long jE = tz0Var.E(this.b, i);
        de4Var.b(de4Var.d() + 1);
        long[] jArr = de4Var.a;
        int i2 = de4Var.b;
        de4Var.b = i2 + 1;
        jArr[i2] = jE;
    }

    @Override // defpackage.p
    public final Object g(Object obj) {
        long[] jArr = (long[]) obj;
        js3.p(jArr, "<this>");
        de4 de4Var = new de4();
        de4Var.a = jArr;
        de4Var.b = jArr.length;
        de4Var.b(10);
        return de4Var;
    }

    @Override // defpackage.wj6
    public final Object j() {
        return new long[0];
    }

    @Override // defpackage.wj6
    public final void k(uz0 uz0Var, Object obj, int i) {
        long[] jArr = (long[]) obj;
        js3.p(uz0Var, "encoder");
        js3.p(jArr, "content");
        for (int i2 = 0; i2 < i; i2++) {
            uz0Var.j(this.b, i2, jArr[i2]);
        }
    }
}
