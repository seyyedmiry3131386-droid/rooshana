package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class bx8 extends wj6 {
    public static final bx8 c = new bx8(cx8.a);

    @Override // defpackage.p
    public final int d(Object obj) {
        short[] sArr = ((zw8) obj).a;
        js3.p(sArr, "$this$collectionSize");
        return sArr.length;
    }

    @Override // defpackage.tu0, defpackage.p
    public final void f(tz0 tz0Var, int i, Object obj) {
        ax8 ax8Var = (ax8) obj;
        js3.p(ax8Var, "builder");
        short sC = tz0Var.f(this.b, i).C();
        ax8Var.b(ax8Var.d() + 1);
        short[] sArr = ax8Var.a;
        int i2 = ax8Var.b;
        ax8Var.b = i2 + 1;
        sArr[i2] = sC;
    }

    @Override // defpackage.p
    public final Object g(Object obj) {
        short[] sArr = ((zw8) obj).a;
        js3.p(sArr, "$this$toBuilder");
        ax8 ax8Var = new ax8();
        ax8Var.a = sArr;
        ax8Var.b = sArr.length;
        ax8Var.b(10);
        return ax8Var;
    }

    @Override // defpackage.wj6
    public final Object j() {
        return new zw8(new short[0]);
    }

    @Override // defpackage.wj6
    public final void k(uz0 uz0Var, Object obj, int i) {
        short[] sArr = ((zw8) obj).a;
        js3.p(uz0Var, "encoder");
        for (int i2 = 0; i2 < i; i2++) {
            uz0Var.B(this.b, i2).i(sArr[i2]);
        }
    }
}
