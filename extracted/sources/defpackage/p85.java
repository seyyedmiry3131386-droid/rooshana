package defpackage;

import com.google.common.collect.ImmutableList;
import java.io.EOFException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class p85 implements v72 {
    public final long a;
    public final h26 b;
    public final y85 c;
    public final kq2 d;
    public final sh3 e;
    public final uo1 f;
    public x72 g;
    public cp8 h;
    public cp8 i;
    public int j;
    public jv4 k;
    public long l;
    public long m;
    public long n;
    public long o;
    public int p;
    public sl7 q;
    public boolean r;
    public boolean s;
    public long t;

    public p85(int i) {
        this(-9223372036854775807L);
    }

    @Override // defpackage.v72
    public final v72 b() {
        return this;
    }

    public final void c() {
        sl7 sl7Var = this.q;
        if ((sl7Var instanceof s21) && ((s21) sl7Var).e()) {
            long j = this.o;
            if (j == -1 || j == this.q.c()) {
                return;
            }
            s21 s21Var = (s21) this.q;
            this.q = new s21(this.o, s21Var.h, s21Var.i, s21Var.j, s21Var.k);
            x72 x72Var = this.g;
            x72Var.getClass();
            x72Var.t(this.q);
            this.h.getClass();
            this.q.l();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x033b A[LOOP:2: B:158:0x0339->B:159:0x033b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    @Override // defpackage.v72
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int d(defpackage.w72 r54, defpackage.sd2 r55) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p85.d(w72, sd2):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e(defpackage.w72 r9) {
        /*
            r8 = this;
            sl7 r0 = r8.q
            r1 = 1
            if (r0 == 0) goto L1b
            long r2 = r0.c()
            r4 = -1
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L1b
            long r4 = r9.f()
            r6 = 4
            long r2 = r2 - r6
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L1b
            goto L27
        L1b:
            h26 r0 = r8.b     // Catch: java.io.EOFException -> L27
            byte[] r0 = r0.a     // Catch: java.io.EOFException -> L27
            r2 = 0
            r3 = 4
            boolean r9 = r9.e(r0, r2, r3, r1)     // Catch: java.io.EOFException -> L27
            r9 = r9 ^ r1
            return r9
        L27:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p85.e(w72):boolean");
    }

    public final boolean f(w72 w72Var, boolean z) throws EOFException {
        int iF;
        int i;
        int iU;
        int i2 = z ? 32768 : 131072;
        w72Var.m();
        if (w72Var.getPosition() == 0) {
            h26 h26Var = this.e.a;
            int i3 = 0;
            jv4 jv4VarO = null;
            while (true) {
                try {
                    w72Var.q(h26Var.a, 0, 10);
                    h26Var.J(0);
                    if (h26Var.A() != 4801587) {
                        break;
                    }
                    h26Var.K(3);
                    int iW = h26Var.w();
                    int i4 = iW + 10;
                    if (jv4VarO == null) {
                        byte[] bArr = new byte[i4];
                        System.arraycopy(h26Var.a, 0, bArr, 0, 10);
                        w72Var.q(bArr, 10, iW);
                        jv4VarO = new qh3(null).o(i4, bArr);
                    } else {
                        w72Var.g(iW);
                    }
                    i3 += i4;
                } catch (EOFException unused) {
                }
            }
            w72Var.m();
            w72Var.g(i3);
            this.k = jv4VarO;
            if (jv4VarO != null) {
                this.d.b(jv4VarO);
            }
            iF = (int) w72Var.f();
            if (!z) {
                w72Var.n(iF);
            }
            i = 0;
        } else {
            iF = 0;
            i = 0;
        }
        int i5 = i;
        int i6 = i5;
        while (true) {
            if (!e(w72Var)) {
                h26 h26Var2 = this.b;
                h26Var2.J(0);
                int iJ = h26Var2.j();
                if ((i == 0 || ((-128000) & iJ) == (((long) i) & (-128000))) && (iU = wu8.u(iJ)) != -1) {
                    i5++;
                    if (i5 != 1) {
                        if (i5 == 4) {
                            break;
                        }
                    } else {
                        this.c.a(iJ);
                        i = iJ;
                    }
                    w72Var.g(iU - 4);
                } else {
                    int i7 = i6 + 1;
                    if (i6 == i2) {
                        if (z) {
                            return false;
                        }
                        c();
                        throw new EOFException();
                    }
                    if (z) {
                        w72Var.m();
                        w72Var.g(iF + i7);
                    } else {
                        w72Var.n(1);
                    }
                    i5 = 0;
                    i6 = i7;
                    i = 0;
                }
            } else if (i5 <= 0) {
                c();
                throw new EOFException();
            }
        }
        if (z) {
            w72Var.n(iF + i6);
        } else {
            w72Var.m();
        }
        this.j = i;
        return true;
    }

    @Override // defpackage.v72
    public final boolean g(w72 w72Var) {
        return f(w72Var, true);
    }

    @Override // defpackage.v72
    public final void h(long j, long j2) {
        this.j = 0;
        this.l = -9223372036854775807L;
        this.m = 0L;
        this.p = 0;
        this.t = j2;
        if (this.q instanceof om3) {
            throw null;
        }
    }

    @Override // defpackage.v72
    public final List i() {
        return ImmutableList.q();
    }

    @Override // defpackage.v72
    public final void m(x72 x72Var) {
        this.g = x72Var;
        cp8 cp8VarO = x72Var.o(0, 1);
        this.h = cp8VarO;
        this.i = cp8VarO;
        this.g.l();
    }

    public p85(long j) {
        this.a = j;
        this.b = new h26(10);
        this.c = new y85();
        this.d = new kq2();
        this.l = -9223372036854775807L;
        this.e = new sh3(0);
        uo1 uo1Var = new uo1();
        this.f = uo1Var;
        this.i = uo1Var;
        this.o = -1L;
    }

    @Override // defpackage.v72
    public final void a() {
    }
}
