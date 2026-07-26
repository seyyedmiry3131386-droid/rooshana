package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class jw8 extends wj6 {
    public static final jw8 c = new jw8(kw8.a);

    @Override // defpackage.p
    public final int d(Object obj) {
        byte[] bArr = ((hw8) obj).a;
        js3.p(bArr, "$this$collectionSize");
        return bArr.length;
    }

    @Override // defpackage.tu0, defpackage.p
    public final void f(tz0 tz0Var, int i, Object obj) {
        iw8 iw8Var = (iw8) obj;
        js3.p(iw8Var, "builder");
        byte B = tz0Var.f(this.b, i).B();
        iw8Var.b(iw8Var.d() + 1);
        byte[] bArr = iw8Var.a;
        int i2 = iw8Var.b;
        iw8Var.b = i2 + 1;
        bArr[i2] = B;
    }

    @Override // defpackage.p
    public final Object g(Object obj) {
        byte[] bArr = ((hw8) obj).a;
        js3.p(bArr, "$this$toBuilder");
        iw8 iw8Var = new iw8();
        iw8Var.a = bArr;
        iw8Var.b = bArr.length;
        iw8Var.b(10);
        return iw8Var;
    }

    @Override // defpackage.wj6
    public final Object j() {
        return new hw8(new byte[0]);
    }

    @Override // defpackage.wj6
    public final void k(uz0 uz0Var, Object obj, int i) {
        byte[] bArr = ((hw8) obj).a;
        js3.p(uz0Var, "encoder");
        for (int i2 = 0; i2 < i; i2++) {
            uz0Var.B(this.b, i2).k(bArr[i2]);
        }
    }
}
