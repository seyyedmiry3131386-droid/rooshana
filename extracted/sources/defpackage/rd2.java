package defpackage;

import androidx.media3.common.ParserException;
import androidx.media3.common.b;
import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class rd2 implements v72 {
    public x72 e;
    public cp8 f;
    public jv4 h;
    public ud2 i;
    public int j;
    public int k;
    public qd2 l;
    public int m;
    public long n;
    public final byte[] a = new byte[42];
    public final h26 b = new h26(new byte[32768], 0);
    public final boolean c = false;
    public final sd2 d = new sd2();
    public int g = 0;

    @Override // defpackage.v72
    public final v72 b() {
        return this;
    }

    @Override // defpackage.v72
    public final int d(w72 w72Var, sd2 sd2Var) throws ParserException {
        ud2 ud2Var;
        int i;
        kl7 x30Var;
        long j;
        long j2;
        boolean zP;
        int i2 = this.g;
        if (i2 == 0) {
            boolean z = !this.c;
            w72Var.m();
            long jF = w72Var.f();
            jv4 jv4VarW = ct2.w(w72Var, z);
            w72Var.n((int) (w72Var.f() - jF));
            this.h = jv4VarW;
            this.g = 1;
            return 0;
        }
        byte[] bArr = this.a;
        if (i2 == 1) {
            w72Var.q(bArr, 0, bArr.length);
            w72Var.m();
            this.g = 2;
            return 0;
        }
        int i3 = 4;
        int i4 = 3;
        if (i2 == 2) {
            h26 h26Var = new h26(4);
            w72Var.readFully(h26Var.a, 0, 4);
            if (h26Var.z() != 1716281667) {
                throw ParserException.a(null, "Failed to read FLAC stream marker.");
            }
            this.g = 3;
            return 0;
        }
        int i5 = 6;
        if (i2 == 3) {
            int i6 = 0;
            ud2 ud2Var2 = this.i;
            boolean z2 = false;
            while (!z2) {
                w72Var.m();
                byte[] bArr2 = new byte[i3];
                ao0 ao0Var = new ao0(bArr2, i3);
                int i7 = i6;
                w72Var.q(bArr2, i7, i3);
                boolean zH = ao0Var.h();
                int i8 = ao0Var.i(i);
                int i9 = ao0Var.i(24) + i3;
                if (i8 == 0) {
                    byte[] bArr3 = new byte[38];
                    w72Var.readFully(bArr3, i7, 38);
                    ud2Var2 = new ud2(bArr3, i3);
                } else {
                    if (ud2Var2 == null) {
                        throw new IllegalArgumentException();
                    }
                    jv4 jv4Var = ud2Var2.l;
                    if (i8 == i4) {
                        h26 h26Var2 = new h26(i9);
                        w72Var.readFully(h26Var2.a, i7, i9);
                        ud2Var2 = new ud2(ud2Var2.a, ud2Var2.b, ud2Var2.c, ud2Var2.d, ud2Var2.e, ud2Var2.g, ud2Var2.h, ud2Var2.j, ct2.x(h26Var2), ud2Var2.l);
                    } else {
                        if (i8 == i3) {
                            h26 h26Var3 = new h26(i9);
                            w72Var.readFully(h26Var3.a, 0, i9);
                            h26Var3.K(i3);
                            jv4 jv4VarG = c67.g(Arrays.asList((String[]) c67.i(h26Var3, false, false).b));
                            if (jv4Var != null) {
                                jv4VarG = jv4Var.b(jv4VarG);
                            }
                            ud2Var = new ud2(ud2Var2.a, ud2Var2.b, ud2Var2.c, ud2Var2.d, ud2Var2.e, ud2Var2.g, ud2Var2.h, ud2Var2.j, ud2Var2.k, jv4VarG);
                        } else if (i8 == i5) {
                            h26 h26Var4 = new h26(i9);
                            w72Var.readFully(h26Var4.a, 0, i9);
                            h26Var4.K(4);
                            jv4 jv4Var2 = new jv4(ImmutableList.s(i76.d(h26Var4)));
                            if (jv4Var != null) {
                                jv4Var2 = jv4Var.b(jv4Var2);
                            }
                            ud2Var = new ud2(ud2Var2.a, ud2Var2.b, ud2Var2.c, ud2Var2.d, ud2Var2.e, ud2Var2.g, ud2Var2.h, ud2Var2.j, ud2Var2.k, jv4Var2);
                        } else {
                            w72Var.n(i9);
                        }
                        ud2Var2 = ud2Var;
                    }
                }
                String str = j29.a;
                this.i = ud2Var2;
                z2 = zH;
                i3 = 4;
                i4 = 3;
                i = 7;
                i5 = 6;
                i6 = 0;
            }
            this.i.getClass();
            this.j = Math.max(this.i.c, 6);
            b bVarC = this.i.c(bArr, this.h);
            cp8 cp8Var = this.f;
            rj2 rj2VarA = bVarC.a();
            rj2VarA.l = tv4.m("audio/flac");
            rm7.w(rj2VarA, cp8Var);
            cp8 cp8Var2 = this.f;
            this.i.b();
            cp8Var2.getClass();
            this.g = 4;
            return 0;
        }
        long j3 = 0;
        if (i2 == 4) {
            w72Var.m();
            h26 h26Var5 = new h26(2);
            w72Var.q(h26Var5.a, 0, 2);
            int iD = h26Var5.D();
            if ((iD >> 2) != 16382) {
                w72Var.m();
                throw ParserException.a(null, "First frame does not start with sync code.");
            }
            w72Var.m();
            this.k = iD;
            x72 x72Var = this.e;
            String str2 = j29.a;
            long position = w72Var.getPosition();
            long jI = w72Var.i();
            this.i.getClass();
            ud2 ud2Var3 = this.i;
            qq4 qq4Var = ud2Var3.k;
            if (qq4Var != null && ((long[]) qq4Var.a).length > 0) {
                x30Var = new x30(1, position, ud2Var3);
                i = 0;
            } else if (jI == -1 || ud2Var3.j <= 0) {
                i = 0;
                x30Var = new x30(ud2Var3.b());
            } else {
                int i10 = this.k;
                int i11 = ud2Var3.c;
                v4 v4Var = new v4(26, ud2Var3);
                pg pgVar = new pg(ud2Var3, i10);
                long jB = ud2Var3.b();
                long j4 = ud2Var3.j;
                int i12 = ud2Var3.d;
                if (i12 > 0) {
                    i = 0;
                    j = ((((long) i12) + ((long) i11)) / 2) + 1;
                } else {
                    i = 0;
                    int i13 = ud2Var3.a;
                    j = 64 + (((((i13 != ud2Var3.b || i13 <= 0) ? 4096L : i13) * ((long) ud2Var3.g)) * ((long) ud2Var3.h)) / 8);
                }
                qd2 qd2Var = new qd2(v4Var, pgVar, jB, j4, position, jI, j, Math.max(6, i11));
                this.l = qd2Var;
                x30Var = (hb0) qd2Var.c;
            }
            x72Var.t(x30Var);
            this.g = 5;
            return i;
        }
        if (i2 != 5) {
            throw new IllegalStateException();
        }
        this.f.getClass();
        this.i.getClass();
        qd2 qd2Var2 = this.l;
        if (qd2Var2 != null && ((ib0) qd2Var2.e) != null) {
            return qd2Var2.w(w72Var, sd2Var);
        }
        if (this.n == -1) {
            ud2 ud2Var4 = this.i;
            w72Var.m();
            w72Var.g(1);
            byte[] bArr4 = new byte[1];
            w72Var.q(bArr4, 0, 1);
            boolean z3 = (bArr4[0] & 1) == 1;
            w72Var.g(2);
            i = z3 ? 7 : 6;
            h26 h26Var6 = new h26(i);
            byte[] bArr5 = h26Var6.a;
            int i14 = 0;
            while (i14 < i) {
                int iJ = w72Var.j(bArr5, i14, i - i14);
                if (iJ == -1) {
                    break;
                }
                i14 += iJ;
            }
            h26Var6.I(i14);
            w72Var.m();
            try {
                long jE = h26Var6.E();
                if (!z3) {
                    jE *= (long) ud2Var4.b;
                }
                j3 = jE;
            } catch (NumberFormatException unused) {
                z = false;
            }
            if (!z) {
                throw ParserException.a(null, null);
            }
            this.n = j3;
        } else {
            h26 h26Var7 = this.b;
            int i15 = h26Var7.c;
            if (i15 < 32768) {
                int i16 = w72Var.read(h26Var7.a, i15, 32768 - i15);
                z = i16 == -1;
                if (!z) {
                    h26Var7.I(i15 + i16);
                } else if (h26Var7.a() == 0) {
                    long j5 = this.n * 1000000;
                    ud2 ud2Var5 = this.i;
                    String str3 = j29.a;
                    this.f.a(j5 / ((long) ud2Var5.e), 1, this.m, 0, null);
                    return -1;
                }
            } else {
                z = false;
            }
            int i17 = h26Var7.b;
            int i18 = this.m;
            int i19 = this.j;
            if (i18 < i19) {
                h26Var7.K(Math.min(i19 - i18, h26Var7.a()));
            }
            this.i.getClass();
            int i20 = h26Var7.b;
            while (true) {
                int i21 = h26Var7.c - 16;
                sd2 sd2Var2 = this.d;
                if (i20 <= i21) {
                    h26Var7.J(i20);
                    if (bt2.p(h26Var7, this.i, this.k, sd2Var2)) {
                        h26Var7.J(i20);
                        j2 = sd2Var2.a;
                        break;
                    }
                    i20++;
                } else {
                    if (z) {
                        while (true) {
                            int i22 = h26Var7.c;
                            if (i20 > i22 - this.j) {
                                h26Var7.J(i22);
                                break;
                            }
                            h26Var7.J(i20);
                            try {
                                zP = bt2.p(h26Var7, this.i, this.k, sd2Var2);
                            } catch (IndexOutOfBoundsException unused2) {
                                zP = false;
                            }
                            if (h26Var7.b > h26Var7.c) {
                                zP = false;
                            }
                            if (zP) {
                                h26Var7.J(i20);
                                j2 = sd2Var2.a;
                                break;
                            }
                            i20++;
                        }
                    } else {
                        h26Var7.J(i20);
                    }
                    j2 = -1;
                }
            }
            int i23 = h26Var7.b - i17;
            h26Var7.J(i17);
            this.f.d(i23, h26Var7);
            int i24 = this.m + i23;
            this.m = i24;
            if (j2 != -1) {
                long j6 = this.n * 1000000;
                ud2 ud2Var6 = this.i;
                String str4 = j29.a;
                this.f.a(j6 / ((long) ud2Var6.e), 1, i24, 0, null);
                this.m = 0;
                this.n = j2;
            }
            int length = h26Var7.a.length - h26Var7.c;
            if (h26Var7.a() < 16 && length < 16) {
                int iA = h26Var7.a();
                byte[] bArr6 = h26Var7.a;
                System.arraycopy(bArr6, h26Var7.b, bArr6, 0, iA);
                h26Var7.J(0);
                h26Var7.I(iA);
            }
        }
        return 0;
    }

    @Override // defpackage.v72
    public final boolean g(w72 w72Var) {
        ct2.w(w72Var, false);
        h26 h26Var = new h26(4);
        ((oe1) w72Var).e(h26Var.a, 0, 4, false);
        return h26Var.z() == 1716281667;
    }

    @Override // defpackage.v72
    public final void h(long j, long j2) {
        if (j == 0) {
            this.g = 0;
        } else {
            qd2 qd2Var = this.l;
            if (qd2Var != null) {
                qd2Var.F(j2);
            }
        }
        this.n = j2 != 0 ? -1L : 0L;
        this.m = 0;
        this.b.G(0);
    }

    @Override // defpackage.v72
    public final List i() {
        return ImmutableList.q();
    }

    @Override // defpackage.v72
    public final void m(x72 x72Var) {
        this.e = x72Var;
        this.f = x72Var.o(0, 1);
        x72Var.l();
    }

    @Override // defpackage.v72
    public final void a() {
    }
}
