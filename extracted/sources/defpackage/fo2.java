package defpackage;

import androidx.media3.common.b;

/* JADX INFO: loaded from: classes.dex */
public final class fo2 {
    public final cp8 a;
    public dp8 d;
    public sg1 e;
    public int f;
    public int g;
    public int h;
    public int i;
    public final b j;
    public boolean m;
    public final xo8 b = new xo8();
    public final h26 c = new h26();
    public final h26 k = new h26(1);
    public final h26 l = new h26();

    public fo2(cp8 cp8Var, dp8 dp8Var, sg1 sg1Var, b bVar) {
        this.a = cp8Var;
        this.d = dp8Var;
        this.e = sg1Var;
        this.j = bVar;
        this.d = dp8Var;
        this.e = sg1Var;
        cp8Var.f(bVar);
        e();
    }

    public final int a() {
        int i = !this.m ? this.d.g[this.f] : this.b.j[this.f] ? 1 : 0;
        return b() != null ? i | 1073741824 : i;
    }

    public final wo8 b() {
        if (!this.m) {
            return null;
        }
        xo8 xo8Var = this.b;
        sg1 sg1Var = xo8Var.a;
        String str = j29.a;
        int i = sg1Var.a;
        wo8 wo8Var = xo8Var.m;
        if (wo8Var == null) {
            wo8Var = this.d.a.l[i];
        }
        if (wo8Var == null || !wo8Var.a) {
            return null;
        }
        return wo8Var;
    }

    public final boolean c() {
        this.f++;
        if (!this.m) {
            return false;
        }
        int i = this.g + 1;
        this.g = i;
        int[] iArr = this.b.g;
        int i2 = this.h;
        if (i != iArr[i2]) {
            return true;
        }
        this.h = i2 + 1;
        this.g = 0;
        return false;
    }

    public final int d(int i, int i2) {
        h26 h26Var;
        wo8 wo8VarB = b();
        if (wo8VarB == null) {
            return 0;
        }
        int length = wo8VarB.d;
        xo8 xo8Var = this.b;
        if (length != 0) {
            h26Var = xo8Var.n;
        } else {
            byte[] bArr = wo8VarB.e;
            String str = j29.a;
            int length2 = bArr.length;
            h26 h26Var2 = this.l;
            h26Var2.H(length2, bArr);
            length = bArr.length;
            h26Var = h26Var2;
        }
        boolean z = xo8Var.k && xo8Var.l[this.f];
        boolean z2 = z || i2 != 0;
        h26 h26Var3 = this.k;
        h26Var3.a[0] = (byte) ((z2 ? 128 : 0) | length);
        h26Var3.J(0);
        cp8 cp8Var = this.a;
        cp8Var.b(h26Var3, 1, 1);
        cp8Var.b(h26Var, length, 1);
        if (!z2) {
            return length + 1;
        }
        h26 h26Var4 = this.c;
        if (!z) {
            h26Var4.G(8);
            byte[] bArr2 = h26Var4.a;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = (byte) 0;
            bArr2[3] = (byte) (i2 & 255);
            bArr2[4] = (byte) ((i >> 24) & 255);
            bArr2[5] = (byte) ((i >> 16) & 255);
            bArr2[6] = (byte) ((i >> 8) & 255);
            bArr2[7] = (byte) (i & 255);
            cp8Var.b(h26Var4, 8, 1);
            return length + 9;
        }
        h26 h26Var5 = xo8Var.n;
        int iD = h26Var5.D();
        h26Var5.K(-2);
        int i3 = (iD * 6) + 2;
        if (i2 != 0) {
            h26Var4.G(i3);
            byte[] bArr3 = h26Var4.a;
            h26Var5.h(bArr3, 0, i3);
            int i4 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i2;
            bArr3[2] = (byte) ((i4 >> 8) & 255);
            bArr3[3] = (byte) (i4 & 255);
        } else {
            h26Var4 = h26Var5;
        }
        cp8Var.b(h26Var4, i3, 1);
        return length + 1 + i3;
    }

    public final void e() {
        xo8 xo8Var = this.b;
        xo8Var.d = 0;
        xo8Var.p = 0L;
        xo8Var.q = false;
        xo8Var.k = false;
        xo8Var.o = false;
        xo8Var.m = null;
        this.f = 0;
        this.h = 0;
        this.g = 0;
        this.i = 0;
        this.m = false;
    }
}
