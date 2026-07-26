package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class rw8 extends wj6 {
    public static final rw8 c = new rw8(sw8.a);

    @Override // defpackage.p
    public final int d(Object obj) {
        int[] iArr = ((pw8) obj).a;
        js3.p(iArr, "$this$collectionSize");
        return iArr.length;
    }

    @Override // defpackage.tu0, defpackage.p
    public final void f(tz0 tz0Var, int i, Object obj) {
        qw8 qw8Var = (qw8) obj;
        js3.p(qw8Var, "builder");
        int iP = tz0Var.f(this.b, i).p();
        qw8Var.b(qw8Var.d() + 1);
        int[] iArr = qw8Var.a;
        int i2 = qw8Var.b;
        qw8Var.b = i2 + 1;
        iArr[i2] = iP;
    }

    @Override // defpackage.p
    public final Object g(Object obj) {
        int[] iArr = ((pw8) obj).a;
        js3.p(iArr, "$this$toBuilder");
        qw8 qw8Var = new qw8();
        qw8Var.a = iArr;
        qw8Var.b = iArr.length;
        qw8Var.b(10);
        return qw8Var;
    }

    @Override // defpackage.wj6
    public final Object j() {
        return new pw8(new int[0]);
    }

    @Override // defpackage.wj6
    public final void k(uz0 uz0Var, Object obj, int i) {
        int[] iArr = ((pw8) obj).a;
        js3.p(uz0Var, "encoder");
        for (int i2 = 0; i2 < i; i2++) {
            uz0Var.B(this.b, i2).y(iArr[i2]);
        }
    }
}
