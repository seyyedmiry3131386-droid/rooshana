package defpackage;

import com.google.common.collect.ImmutableList;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c3 implements v72 {
    public final b3 a = new b3(0, 1, null, "audio/ac4");
    public final h26 b = new h26(16384);
    public boolean c;

    @Override // defpackage.v72
    public final v72 b() {
        return this;
    }

    @Override // defpackage.v72
    public final int d(w72 w72Var, sd2 sd2Var) {
        h26 h26Var = this.b;
        int i = w72Var.read(h26Var.a, 0, 16384);
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
        int i;
        h26 h26Var = new h26(10);
        int i2 = 0;
        while (true) {
            oe1Var = (oe1) w72Var;
            oe1Var.e(h26Var.a, 0, 10, false);
            h26Var.J(0);
            if (h26Var.A() != 4801587) {
                break;
            }
            h26Var.K(3);
            int iW = h26Var.w();
            i2 += iW + 10;
            oe1Var.l(iW, false);
        }
        oe1Var.f = 0;
        oe1Var.l(i2, false);
        int i3 = 0;
        int i4 = i2;
        while (true) {
            int i5 = 7;
            oe1Var.e(h26Var.a, 0, 7, false);
            h26Var.J(0);
            int iD = h26Var.D();
            if (iD == 44096 || iD == 44097) {
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                byte[] bArr = h26Var.a;
                if (bArr.length < 7) {
                    i = -1;
                } else {
                    int i6 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    if (i6 == 65535) {
                        i6 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
                    } else {
                        i5 = 4;
                    }
                    if (iD == 44097) {
                        i5 += 2;
                    }
                    i = i6 + i5;
                }
                if (i == -1) {
                    break;
                }
                oe1Var.l(i - 7, false);
            } else {
                oe1Var.f = 0;
                i4++;
                if (i4 - i2 >= 8192) {
                    break;
                }
                oe1Var.l(i4, false);
                i3 = 0;
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
