package defpackage;

import java.io.EOFException;

/* JADX INFO: loaded from: classes.dex */
public final class yr5 {
    public final zr5 a = new zr5();
    public final h26 b = new h26(new byte[65025], 0);
    public int c = -1;
    public int d;
    public boolean e;

    public final int a(int i) {
        int i2;
        int i3 = 0;
        this.d = 0;
        do {
            int i4 = this.d;
            int i5 = i + i4;
            zr5 zr5Var = this.a;
            if (i5 >= zr5Var.c) {
                break;
            }
            int[] iArr = zr5Var.f;
            this.d = i4 + 1;
            i2 = iArr[i5];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    public final boolean b(w72 w72Var) {
        int i;
        vy2.s(w72Var != null);
        boolean z = this.e;
        h26 h26Var = this.b;
        if (z) {
            this.e = false;
            h26Var.G(0);
        }
        while (!this.e) {
            int i2 = this.c;
            zr5 zr5Var = this.a;
            if (i2 < 0) {
                if (zr5Var.b(w72Var, -1L) && zr5Var.a(w72Var, true)) {
                    int iA = zr5Var.d;
                    if ((zr5Var.a & 1) == 1 && h26Var.c == 0) {
                        iA += a(0);
                        i = this.d;
                    } else {
                        i = 0;
                    }
                    try {
                        w72Var.n(iA);
                        this.c = i;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int iA2 = a(this.c);
            int i3 = this.c + this.d;
            if (iA2 > 0) {
                h26Var.c(h26Var.c + iA2);
                try {
                    w72Var.readFully(h26Var.a, h26Var.c, iA2);
                    h26Var.I(h26Var.c + iA2);
                    this.e = zr5Var.f[i3 + (-1)] != 255;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i3 == zr5Var.c) {
                i3 = -1;
            }
            this.c = i3;
        }
        return true;
    }
}
