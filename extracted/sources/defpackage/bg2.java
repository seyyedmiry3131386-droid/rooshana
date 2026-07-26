package defpackage;

import com.google.common.collect.ImmutableList;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class bg2 implements v72 {
    public final h26 a = new h26(4);
    public final h26 b = new h26(9);
    public final h26 c = new h26(11);
    public final h26 d = new h26();
    public final fg7 e;
    public x72 f;
    public int g;
    public boolean h;
    public long i;
    public int j;
    public int k;
    public int l;
    public long m;
    public boolean n;
    public p00 o;
    public x59 p;

    public bg2() {
        fg7 fg7Var = new fg7(8, new uo1());
        fg7Var.c = -9223372036854775807L;
        fg7Var.d = new long[0];
        fg7Var.e = new long[0];
        this.e = fg7Var;
        this.g = 1;
    }

    @Override // defpackage.v72
    public final v72 b() {
        return this;
    }

    public final h26 c(w72 w72Var) {
        int i = this.l;
        h26 h26Var = this.d;
        byte[] bArr = h26Var.a;
        if (i > bArr.length) {
            h26Var.H(0, new byte[Math.max(bArr.length * 2, i)]);
        } else {
            h26Var.J(0);
        }
        h26Var.I(this.l);
        w72Var.readFully(h26Var.a, 0, this.l);
        return h26Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03b3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x017a  */
    @Override // defpackage.v72
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int d(defpackage.w72 r29, defpackage.sd2 r30) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instruction units count: 1121
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bg2.d(w72, sd2):int");
    }

    @Override // defpackage.v72
    public final boolean g(w72 w72Var) throws EOFException, InterruptedIOException {
        h26 h26Var = this.a;
        oe1 oe1Var = (oe1) w72Var;
        oe1Var.e(h26Var.a, 0, 3, false);
        h26Var.J(0);
        if (h26Var.A() == 4607062) {
            oe1Var.e(h26Var.a, 0, 2, false);
            h26Var.J(0);
            if ((h26Var.D() & 250) == 0) {
                oe1Var.e(h26Var.a, 0, 4, false);
                h26Var.J(0);
                int iJ = h26Var.j();
                oe1Var.f = 0;
                oe1Var.l(iJ, false);
                oe1Var.e(h26Var.a, 0, 4, false);
                h26Var.J(0);
                if (h26Var.j() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.v72
    public final void h(long j, long j2) {
        if (j == 0) {
            this.g = 1;
            this.h = false;
        } else {
            this.g = 3;
        }
        this.j = 0;
    }

    @Override // defpackage.v72
    public final List i() {
        return ImmutableList.q();
    }

    @Override // defpackage.v72
    public final void m(x72 x72Var) {
        this.f = x72Var;
    }

    @Override // defpackage.v72
    public final void a() {
    }
}
