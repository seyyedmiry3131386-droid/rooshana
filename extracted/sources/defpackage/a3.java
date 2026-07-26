package defpackage;

import com.google.common.collect.ImmutableList;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a3 implements v72 {
    public final b3 a = new b3("audio/ac3");
    public final h26 b = new h26(2786);
    public boolean c;

    @Override // defpackage.v72
    public final v72 b() {
        return this;
    }

    @Override // defpackage.v72
    public final int d(w72 w72Var, sd2 sd2Var) {
        h26 h26Var = this.b;
        int i = w72Var.read(h26Var.a, 0, 2786);
        if (i == -1) {
            return -1;
        }
        h26Var.J(0);
        h26Var.I(i);
        boolean z = this.c;
        b3 b3Var = this.a;
        if (!z) {
            b3Var.o = 0L;
            this.c = true;
        }
        b3Var.a(h26Var);
        return 0;
    }

    @Override // defpackage.v72
    public final boolean g(w72 w72Var) throws EOFException, InterruptedIOException {
        oe1 oe1Var;
        int iP;
        h26 h26Var = new h26(10);
        int i = 0;
        while (true) {
            oe1Var = (oe1) w72Var;
            oe1Var.e(h26Var.a, 0, 10, false);
            h26Var.J(0);
            if (h26Var.A() != 4801587) {
                break;
            }
            h26Var.K(3);
            int iW = h26Var.w();
            i += iW + 10;
            oe1Var.l(iW, false);
        }
        oe1Var.f = 0;
        oe1Var.l(i, false);
        int i2 = 0;
        int i3 = i;
        while (true) {
            oe1Var.e(h26Var.a, 0, 6, false);
            h26Var.J(0);
            if (h26Var.D() != 2935) {
                oe1Var.f = 0;
                i3++;
                if (i3 - i >= 8192) {
                    break;
                }
                oe1Var.l(i3, false);
                i2 = 0;
            } else {
                i2++;
                if (i2 >= 4) {
                    return true;
                }
                byte[] bArr = h26Var.a;
                if (bArr.length < 6) {
                    iP = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    iP = ((((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1) * 2;
                } else {
                    byte b = bArr[4];
                    iP = ja1.p((b & 192) >> 6, b & 63);
                }
                if (iP == -1) {
                    break;
                }
                oe1Var.l(iP - 6, false);
            }
        }
        return false;
    }

    @Override // defpackage.v72
    public final void h(long j, long j2) {
        this.c = false;
        this.a.c();
    }

    @Override // defpackage.v72
    public final List i() {
        return ImmutableList.q();
    }

    @Override // defpackage.v72
    public final void m(x72 x72Var) {
        this.a.f(x72Var, new ft8(0, 1));
        x72Var.l();
        x72Var.t(new x30(-9223372036854775807L));
    }

    @Override // defpackage.v72
    public final void a() {
    }
}
