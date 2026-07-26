package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class hx7 implements ra4 {
    public final db1 a;
    public final w58 b;
    public byte[] c;

    public hx7(xa1 xa1Var, db1 db1Var) {
        da4.d.getAndIncrement();
        this.a = db1Var;
        this.b = new w58(xa1Var);
    }

    @Override // defpackage.ra4
    public final void a() {
        w58 w58Var = this.b;
        w58Var.b = 0L;
        try {
            w58Var.b(this.a);
            int i = 0;
            while (i != -1) {
                int i2 = (int) w58Var.b;
                byte[] bArr = this.c;
                if (bArr == null) {
                    this.c = new byte[1024];
                } else if (i2 == bArr.length) {
                    this.c = Arrays.copyOf(bArr, bArr.length * 2);
                }
                byte[] bArr2 = this.c;
                i = w58Var.read(bArr2, i2, bArr2.length - i2);
            }
            tv8.i(w58Var);
        } catch (Throwable th) {
            tv8.i(w58Var);
            throw th;
        }
    }

    @Override // defpackage.ra4
    public final void b() {
    }
}
