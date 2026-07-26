package defpackage;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class lh3 implements xa1 {
    public final xa1 a;
    public final int b;
    public final om6 c;
    public final byte[] d;
    public int e;

    public lh3(xa1 xa1Var, int i, om6 om6Var) {
        vy2.j(i > 0);
        this.a = xa1Var;
        this.b = i;
        this.c = om6Var;
        this.d = new byte[1];
        this.e = i;
    }

    @Override // defpackage.xa1
    public final long b(db1 db1Var) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.xa1
    public final void c(fq8 fq8Var) {
        fq8Var.getClass();
        this.a.c(fq8Var);
    }

    @Override // defpackage.xa1
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.xa1
    public final Map k() {
        return this.a.k();
    }

    @Override // defpackage.xa1
    public final Uri p() {
        return this.a.p();
    }

    @Override // defpackage.ra1
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.e;
        xa1 xa1Var = this.a;
        if (i3 == 0) {
            byte[] bArr2 = this.d;
            int i4 = 0;
            if (xa1Var.read(bArr2, 0, 1) != -1) {
                int i5 = (bArr2[0] & 255) << 4;
                if (i5 != 0) {
                    byte[] bArr3 = new byte[i5];
                    int i6 = i5;
                    while (i6 > 0) {
                        int i7 = xa1Var.read(bArr3, i4, i6);
                        if (i7 != -1) {
                            i4 += i7;
                            i6 -= i7;
                        }
                    }
                    while (i5 > 0 && bArr3[i5 - 1] == 0) {
                        i5--;
                    }
                    if (i5 > 0) {
                        h26 h26Var = new h26(bArr3, i5);
                        om6 om6Var = this.c;
                        long jMax = !om6Var.l ? om6Var.i : Math.max(om6Var.m.y(true), om6Var.i);
                        int iA = h26Var.a();
                        cp8 cp8Var = om6Var.k;
                        cp8Var.getClass();
                        cp8Var.d(iA, h26Var);
                        cp8Var.a(jMax, 1, iA, 0, null);
                        om6Var.l = true;
                    }
                }
                this.e = this.b;
            }
            return -1;
        }
        int i8 = xa1Var.read(bArr, i, Math.min(this.e, i2));
        if (i8 != -1) {
            this.e -= i8;
        }
        return i8;
    }
}
