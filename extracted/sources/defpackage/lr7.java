package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class lr7 {
    public int a;
    public final int[] b = new int[10];

    public final int a() {
        if ((this.a & 16) != 0) {
            return this.b[4];
        }
        return 65535;
    }

    public final void b(lr7 lr7Var) {
        js3.p(lr7Var, "other");
        for (int i = 0; i < 10; i++) {
            if (((1 << i) & lr7Var.a) != 0) {
                c(i, lr7Var.b[i]);
            }
        }
    }

    public final void c(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.b;
            if (i >= iArr.length) {
                return;
            }
            this.a = (1 << i) | this.a;
            iArr[i] = i2;
        }
    }
}
