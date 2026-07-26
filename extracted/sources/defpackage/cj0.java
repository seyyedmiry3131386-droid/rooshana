package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class cj0 extends wj6 {
    public static final cj0 c = new cj0(mj0.a);

    @Override // defpackage.p
    public final int d(Object obj) {
        byte[] bArr = (byte[]) obj;
        js3.p(bArr, "<this>");
        return bArr.length;
    }

    @Override // defpackage.tu0, defpackage.p
    public final void f(tz0 tz0Var, int i, Object obj) {
        ui0 ui0Var = (ui0) obj;
        js3.p(ui0Var, "builder");
        byte bN = tz0Var.n(this.b, i);
        ui0Var.b(ui0Var.d() + 1);
        byte[] bArr = ui0Var.a;
        int i2 = ui0Var.b;
        ui0Var.b = i2 + 1;
        bArr[i2] = bN;
    }

    @Override // defpackage.p
    public final Object g(Object obj) {
        byte[] bArr = (byte[]) obj;
        js3.p(bArr, "<this>");
        ui0 ui0Var = new ui0();
        ui0Var.a = bArr;
        ui0Var.b = bArr.length;
        ui0Var.b(10);
        return ui0Var;
    }

    @Override // defpackage.wj6
    public final Object j() {
        return new byte[0];
    }

    @Override // defpackage.wj6
    public final void k(uz0 uz0Var, Object obj, int i) {
        byte[] bArr = (byte[]) obj;
        js3.p(uz0Var, "encoder");
        js3.p(bArr, "content");
        for (int i2 = 0; i2 < i; i2++) {
            uz0Var.q(this.b, i2, bArr[i2]);
        }
    }
}
