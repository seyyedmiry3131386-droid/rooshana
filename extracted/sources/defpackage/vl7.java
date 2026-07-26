package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vl7 {
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    public final boolean e;
    public vl7 f;
    public vl7 g;

    public vl7() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }

    public final vl7 a() {
        vl7 vl7Var = this.f;
        if (vl7Var == this) {
            vl7Var = null;
        }
        vl7 vl7Var2 = this.g;
        js3.m(vl7Var2);
        vl7Var2.f = this.f;
        vl7 vl7Var3 = this.f;
        js3.m(vl7Var3);
        vl7Var3.g = this.g;
        this.f = null;
        this.g = null;
        return vl7Var;
    }

    public final void b(vl7 vl7Var) {
        js3.p(vl7Var, "segment");
        vl7Var.g = this;
        vl7Var.f = this.f;
        vl7 vl7Var2 = this.f;
        js3.m(vl7Var2);
        vl7Var2.g = vl7Var;
        this.f = vl7Var;
    }

    public final vl7 c() {
        this.d = true;
        return new vl7(this.a, this.b, this.c, true);
    }

    public final void d(vl7 vl7Var, int i) {
        js3.p(vl7Var, "sink");
        byte[] bArr = vl7Var.a;
        if (!vl7Var.e) {
            throw new IllegalStateException("only owner can write");
        }
        int i2 = vl7Var.c;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (vl7Var.d) {
                throw new IllegalArgumentException();
            }
            int i4 = vl7Var.b;
            if (i3 - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            ew.w0(0, i4, i2, bArr, bArr);
            vl7Var.c -= vl7Var.b;
            vl7Var.b = 0;
        }
        int i5 = vl7Var.c;
        int i6 = this.b;
        ew.w0(i5, i6, i6 + i, this.a, bArr);
        vl7Var.c += i;
        this.b += i;
    }

    public vl7(byte[] bArr, int i, int i2, boolean z) {
        js3.p(bArr, "data");
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = false;
    }
}
