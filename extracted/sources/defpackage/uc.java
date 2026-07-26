package defpackage;

import androidx.media3.common.ParserException;
import com.google.common.collect.ImmutableList;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class uc implements v72 {
    public final h26 c;
    public final ao0 d;
    public x72 e;
    public long f;
    public boolean h;
    public boolean i;
    public final vc a = new vc(0, null, "audio/mp4a-latm", true);
    public final h26 b = new h26(2048);
    public long g = -1;

    public uc(int i) {
        h26 h26Var = new h26(10);
        this.c = h26Var;
        byte[] bArr = h26Var.a;
        this.d = new ao0(bArr, bArr.length);
    }

    @Override // defpackage.v72
    public final v72 b() {
        return this;
    }

    @Override // defpackage.v72
    public final int d(w72 w72Var, sd2 sd2Var) throws ParserException {
        vy2.t(this.e);
        w72Var.i();
        h26 h26Var = this.b;
        int i = w72Var.read(h26Var.a, 0, 2048);
        boolean z = i == -1;
        if (!this.i) {
            this.e.t(new x30(-9223372036854775807L));
            this.i = true;
        }
        if (z) {
            return -1;
        }
        h26Var.J(0);
        h26Var.I(i);
        boolean z2 = this.h;
        vc vcVar = this.a;
        if (!z2) {
            vcVar.u = this.f;
            this.h = true;
        }
        vcVar.a(h26Var);
        return 0;
    }

    @Override // defpackage.v72
    public final boolean g(w72 w72Var) throws EOFException, InterruptedIOException {
        int i = 0;
        while (true) {
            h26 h26Var = this.c;
            w72Var.q(h26Var.a, 0, 10);
            h26Var.J(0);
            if (h26Var.A() != 4801587) {
                break;
            }
            h26Var.K(3);
            int iW = h26Var.w();
            i += iW + 10;
            w72Var.g(iW);
        }
        w72Var.m();
        w72Var.g(i);
        if (this.g == -1) {
            this.g = i;
        }
        int i2 = i;
        int i3 = 0;
        int i4 = 0;
        do {
            h26 h26Var2 = this.c;
            oe1 oe1Var = (oe1) w72Var;
            oe1Var.e(h26Var2.a, 0, 2, false);
            h26Var2.J(0);
            if ((h26Var2.D() & 65526) == 65520) {
                i3++;
                if (i3 >= 4 && i4 > 188) {
                    return true;
                }
                oe1Var.e(h26Var2.a, 0, 4, false);
                ao0 ao0Var = this.d;
                ao0Var.q(14);
                int i5 = ao0Var.i(13);
                if (i5 <= 6) {
                    i2++;
                    oe1Var.f = 0;
                    oe1Var.l(i2, false);
                } else {
                    oe1Var.l(i5 - 6, false);
                    i4 += i5;
                }
            } else {
                i2++;
                oe1Var.f = 0;
                oe1Var.l(i2, false);
            }
            i3 = 0;
            i4 = 0;
        } while (i2 - i < 8192);
        return false;
    }

    @Override // defpackage.v72
    public final void h(long j, long j2) {
        this.h = false;
        this.a.c();
        this.f = j2;
    }

    @Override // defpackage.v72
    public final List i() {
        return ImmutableList.q();
    }

    @Override // defpackage.v72
    public final void m(x72 x72Var) {
        this.e = x72Var;
        this.a.f(x72Var, new ft8(0, 1));
        x72Var.l();
    }

    @Override // defpackage.v72
    public final void a() {
    }
}
