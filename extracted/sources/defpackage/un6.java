package defpackage;

import android.util.SparseArray;
import com.google.common.collect.ImmutableList;
import io.sentry.b6;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class un6 implements v72 {
    public boolean e;
    public boolean f;
    public boolean g;
    public long h;
    public qd2 i;
    public x72 j;
    public boolean k;
    public final hm8 a = new hm8(0);
    public final h26 c = new h26(4096);
    public final SparseArray b = new SparseArray();
    public final sn6 d = new sn6(0);

    @Override // defpackage.v72
    public final v72 b() {
        return this;
    }

    @Override // defpackage.v72
    public final int d(w72 w72Var, sd2 sd2Var) {
        int i;
        int i2;
        long j;
        mz1 ew2Var;
        long j2;
        vy2.t(this.j);
        long jI = w72Var.i();
        int i3 = (jI > (-1L) ? 1 : (jI == (-1L) ? 0 : -1));
        long j3 = -9223372036854775807L;
        sn6 sn6Var = this.d;
        if (i3 != 0 && !sn6Var.d) {
            hm8 hm8Var = sn6Var.b;
            h26 h26Var = sn6Var.c;
            if (!sn6Var.f) {
                long jI2 = w72Var.i();
                int iMin = (int) Math.min(20000L, jI2);
                long j4 = jI2 - ((long) iMin);
                if (w72Var.getPosition() != j4) {
                    sd2Var.a = j4;
                    return 1;
                }
                h26Var.G(iMin);
                w72Var.m();
                w72Var.q(h26Var.a, 0, iMin);
                int i4 = h26Var.b;
                int i5 = h26Var.c - 4;
                while (true) {
                    if (i5 < i4) {
                        break;
                    }
                    if (sn6.b(i5, h26Var.a) == 442) {
                        h26Var.J(i5 + 4);
                        long jC = sn6.c(h26Var);
                        if (jC != -9223372036854775807L) {
                            j3 = jC;
                            break;
                        }
                    }
                    i5--;
                }
                sn6Var.h = j3;
                sn6Var.f = true;
                return 0;
            }
            if (sn6Var.h == -9223372036854775807L) {
                sn6Var.a(w72Var);
                return 0;
            }
            if (sn6Var.e) {
                long j5 = sn6Var.g;
                if (j5 == -9223372036854775807L) {
                    sn6Var.a(w72Var);
                    return 0;
                }
                sn6Var.i = hm8Var.c(sn6Var.h) - hm8Var.b(j5);
                sn6Var.a(w72Var);
                return 0;
            }
            int iMin2 = (int) Math.min(20000L, w72Var.i());
            long j6 = 0;
            if (w72Var.getPosition() != j6) {
                sd2Var.a = j6;
                return 1;
            }
            h26Var.G(iMin2);
            w72Var.m();
            w72Var.q(h26Var.a, 0, iMin2);
            int i6 = h26Var.b;
            int i7 = h26Var.c;
            while (true) {
                if (i6 >= i7 - 3) {
                    j2 = -9223372036854775807L;
                    break;
                }
                if (sn6.b(i6, h26Var.a) == 442) {
                    h26Var.J(i6 + 4);
                    long jC2 = sn6.c(h26Var);
                    if (jC2 != -9223372036854775807L) {
                        j2 = jC2;
                        break;
                    }
                }
                i6++;
            }
            sn6Var.g = j2;
            sn6Var.e = true;
            return 0;
        }
        if (this.k) {
            i = i3;
            i2 = 4;
        } else {
            this.k = true;
            long j7 = sn6Var.i;
            if (j7 != -9223372036854775807L) {
                i = i3;
                i2 = 4;
                qd2 qd2Var = new qd2(new fv(2), new rn6(sn6Var.b), j7, j7 + 1, 0L, jI, 188L, 1000);
                this.i = qd2Var;
                this.j.t((hb0) qd2Var.c);
            } else {
                i = i3;
                i2 = 4;
                this.j.t(new x30(j7));
            }
        }
        qd2 qd2Var2 = this.i;
        if (qd2Var2 != null && ((ib0) qd2Var2.e) != null) {
            return qd2Var2.w(w72Var, sd2Var);
        }
        w72Var.m();
        long jF = i != 0 ? jI - w72Var.f() : -1L;
        if (jF != -1 && jF < 4) {
            return -1;
        }
        h26 h26Var2 = this.c;
        if (!w72Var.e(h26Var2.a, 0, i2, true)) {
            return -1;
        }
        h26Var2.J(0);
        int iJ = h26Var2.j();
        if (iJ == 441) {
            return -1;
        }
        if (iJ == 442) {
            w72Var.q(h26Var2.a, 0, 10);
            h26Var2.J(9);
            w72Var.n((h26Var2.x() & 7) + 14);
            return 0;
        }
        if (iJ == 443) {
            w72Var.q(h26Var2.a, 0, 2);
            h26Var2.J(0);
            w72Var.n(h26Var2.D() + 6);
            return 0;
        }
        if (((iJ & (-256)) >> 8) != 1) {
            w72Var.n(1);
            return 0;
        }
        int i8 = iJ & 255;
        SparseArray sparseArray = this.b;
        tn6 tn6Var = (tn6) sparseArray.get(i8);
        if (!this.e) {
            if (tn6Var == null) {
                if (i8 == 189) {
                    ew2Var = new b3("video/mp2p");
                    this.f = true;
                    this.h = w72Var.getPosition();
                } else if ((iJ & 224) == 192) {
                    ew2Var = new x85(null, 0, "video/mp2p");
                    this.f = true;
                    this.h = w72Var.getPosition();
                } else if ((iJ & 240) == 224) {
                    ew2Var = new ew2(null, "video/mp2p");
                    this.g = true;
                    this.h = w72Var.getPosition();
                } else {
                    ew2Var = null;
                }
                if (ew2Var != null) {
                    ew2Var.f(this.j, new ft8(i8, 256));
                    tn6Var = new tn6(ew2Var, this.a);
                    sparseArray.put(i8, tn6Var);
                }
            }
            if (w72Var.getPosition() > ((this.f && this.g) ? this.h + 8192 : b6.MAX_EVENT_SIZE_BYTES)) {
                this.e = true;
                this.j.l();
            }
        }
        w72Var.q(h26Var2.a, 0, 2);
        h26Var2.J(0);
        int iD = h26Var2.D() + 6;
        if (tn6Var == null) {
            w72Var.n(iD);
            return 0;
        }
        h26Var2.G(iD);
        w72Var.readFully(h26Var2.a, 0, iD);
        h26Var2.J(6);
        mz1 mz1Var = tn6Var.a;
        ao0 ao0Var = tn6Var.c;
        h26Var2.h(ao0Var.b, 0, 3);
        ao0Var.q(0);
        ao0Var.t(8);
        tn6Var.d = ao0Var.h();
        tn6Var.e = ao0Var.h();
        ao0Var.t(6);
        h26Var2.h(ao0Var.b, 0, ao0Var.i(8));
        ao0Var.q(0);
        hm8 hm8Var2 = tn6Var.b;
        tn6Var.g = 0L;
        if (tn6Var.d) {
            ao0Var.t(4);
            long jI3 = ((long) ao0Var.i(3)) << 30;
            ao0Var.t(1);
            long jI4 = jI3 | ((long) (ao0Var.i(15) << 15));
            ao0Var.t(1);
            long jI5 = jI4 | ((long) ao0Var.i(15));
            ao0Var.t(1);
            if (tn6Var.f || !tn6Var.e) {
                j = jI5;
            } else {
                ao0Var.t(4);
                long jI6 = ((long) ao0Var.i(3)) << 30;
                ao0Var.t(1);
                long jI7 = ((long) (ao0Var.i(15) << 15)) | jI6;
                ao0Var.t(1);
                long jI8 = jI7 | ((long) ao0Var.i(15));
                ao0Var.t(1);
                hm8Var2.b(jI8);
                tn6Var.f = true;
                j = jI5;
            }
            tn6Var.g = hm8Var2.b(j);
        }
        mz1Var.e(4, tn6Var.g);
        mz1Var.a(h26Var2);
        mz1Var.d(false);
        h26Var2.I(h26Var2.a.length);
        return 0;
    }

    @Override // defpackage.v72
    public final boolean g(w72 w72Var) throws EOFException, InterruptedIOException {
        byte[] bArr = new byte[14];
        oe1 oe1Var = (oe1) w72Var;
        oe1Var.e(bArr, 0, 14, false);
        if (442 == (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            oe1Var.l(bArr[13] & 7, false);
            oe1Var.e(bArr, 0, 3, false);
            if (1 == (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.v72
    public final void h(long j, long j2) {
        hm8 hm8Var = this.a;
        boolean z = hm8Var.e() == -9223372036854775807L;
        if (!z) {
            long jD = hm8Var.d();
            z = (jD == -9223372036854775807L || jD == 0 || jD == j2) ? false : true;
        }
        if (z) {
            hm8Var.g(j2);
        }
        qd2 qd2Var = this.i;
        if (qd2Var != null) {
            qd2Var.F(j2);
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.b;
            if (i >= sparseArray.size()) {
                return;
            }
            tn6 tn6Var = (tn6) sparseArray.valueAt(i);
            tn6Var.f = false;
            tn6Var.a.c();
            i++;
        }
    }

    @Override // defpackage.v72
    public final List i() {
        return ImmutableList.q();
    }

    @Override // defpackage.v72
    public final void m(x72 x72Var) {
        this.j = x72Var;
    }

    @Override // defpackage.v72
    public final void a() {
    }
}
