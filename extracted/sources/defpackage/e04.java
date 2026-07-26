package defpackage;

import androidx.media3.common.ParserException;
import androidx.media3.common.b;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class e04 implements mz1 {
    public final String a;
    public final int b;
    public final h26 c;
    public final ao0 d;
    public cp8 e;
    public String f;
    public b g;
    public int h;
    public int i;
    public int j;
    public int k;
    public long l;
    public boolean m;
    public int n;
    public int o;
    public int p;
    public boolean q;
    public long r;
    public int s;
    public long t;
    public int u;
    public String v;

    public e04(String str, int i) {
        this.a = str;
        this.b = i;
        h26 h26Var = new h26(1024);
        this.c = h26Var;
        byte[] bArr = h26Var.a;
        this.d = new ao0(bArr, bArr.length);
        this.l = -9223372036854775807L;
    }

    @Override // defpackage.mz1
    public final void a(h26 h26Var) throws ParserException {
        int i;
        boolean zH;
        vy2.t(this.e);
        while (h26Var.a() > 0) {
            int i2 = this.h;
            if (i2 != 0) {
                if (i2 != 1) {
                    h26 h26Var2 = this.c;
                    ao0 ao0Var = this.d;
                    if (i2 == 2) {
                        int iX = ((this.k & (-225)) << 8) | h26Var.x();
                        this.j = iX;
                        if (iX > h26Var2.a.length) {
                            h26Var2.G(iX);
                            byte[] bArr = h26Var2.a;
                            ao0Var.getClass();
                            ao0Var.o(bArr.length, bArr);
                        }
                        this.i = 0;
                        this.h = 3;
                    } else {
                        if (i2 != 3) {
                            throw new IllegalStateException();
                        }
                        int iMin = Math.min(h26Var.a(), this.j - this.i);
                        h26Var.h(ao0Var.b, this.i, iMin);
                        int i3 = this.i + iMin;
                        this.i = i3;
                        if (i3 == this.j) {
                            ao0Var.q(0);
                            if (ao0Var.h()) {
                                if (this.m) {
                                }
                                this.h = 0;
                            } else {
                                this.m = true;
                                int i4 = ao0Var.i(1);
                                int i5 = i4 == 1 ? ao0Var.i(1) : 0;
                                this.n = i5;
                                if (i5 != 0) {
                                    throw ParserException.a(null, null);
                                }
                                if (i4 == 1) {
                                    ao0Var.i((ao0Var.i(2) + 1) * 8);
                                }
                                if (!ao0Var.h()) {
                                    throw ParserException.a(null, null);
                                }
                                this.o = ao0Var.i(6);
                                int i6 = ao0Var.i(4);
                                int i7 = ao0Var.i(3);
                                if (i6 != 0 || i7 != 0) {
                                    throw ParserException.a(null, null);
                                }
                                if (i4 == 0) {
                                    int iG = ao0Var.g();
                                    int iB = ao0Var.b();
                                    g gVarH = rf0.H(ao0Var, true);
                                    this.v = gVarH.a;
                                    this.s = gVarH.b;
                                    this.u = gVarH.c;
                                    int iB2 = iB - ao0Var.b();
                                    ao0Var.q(iG);
                                    byte[] bArr2 = new byte[(iB2 + 7) / 8];
                                    ao0Var.j(iB2, bArr2);
                                    rj2 rj2Var = new rj2();
                                    rj2Var.a = this.f;
                                    rj2Var.l = tv4.m("video/mp2t");
                                    rj2Var.m = tv4.m("audio/mp4a-latm");
                                    rj2Var.j = this.v;
                                    rj2Var.E = this.u;
                                    rj2Var.F = this.s;
                                    rj2Var.p = Collections.singletonList(bArr2);
                                    rj2Var.d = this.a;
                                    rj2Var.f = this.b;
                                    b bVar = new b(rj2Var);
                                    if (!bVar.equals(this.g)) {
                                        this.g = bVar;
                                        this.t = 1024000000 / ((long) bVar.G);
                                        this.e.f(bVar);
                                    }
                                } else {
                                    int iB3 = ao0Var.b();
                                    g gVarH2 = rf0.H(ao0Var, true);
                                    this.v = gVarH2.a;
                                    this.s = gVarH2.b;
                                    this.u = gVarH2.c;
                                    ao0Var.t(ao0Var.i((ao0Var.i(2) + 1) * 8) - (iB3 - ao0Var.b()));
                                }
                                int i8 = ao0Var.i(3);
                                this.p = i8;
                                if (i8 == 0) {
                                    ao0Var.t(8);
                                } else if (i8 == 1) {
                                    ao0Var.t(9);
                                } else if (i8 == 3 || i8 == 4 || i8 == 5) {
                                    ao0Var.t(6);
                                } else {
                                    if (i8 != 6 && i8 != 7) {
                                        throw new IllegalStateException();
                                    }
                                    ao0Var.t(1);
                                }
                                boolean zH2 = ao0Var.h();
                                this.q = zH2;
                                this.r = 0L;
                                if (zH2) {
                                    if (i4 == 1) {
                                        this.r = ao0Var.i((ao0Var.i(2) + 1) * 8);
                                    } else {
                                        do {
                                            zH = ao0Var.h();
                                            this.r = (this.r << 8) + ((long) ao0Var.i(8));
                                        } while (zH);
                                    }
                                }
                                if (ao0Var.h()) {
                                    ao0Var.t(8);
                                }
                            }
                            if (this.n != 0) {
                                throw ParserException.a(null, null);
                            }
                            if (this.o != 0) {
                                throw ParserException.a(null, null);
                            }
                            if (this.p != 0) {
                                throw ParserException.a(null, null);
                            }
                            int i9 = 0;
                            do {
                                i = ao0Var.i(8);
                                i9 += i;
                            } while (i == 255);
                            int iG2 = ao0Var.g();
                            if ((iG2 & 7) == 0) {
                                h26Var2.J(iG2 >> 3);
                            } else {
                                ao0Var.j(i9 * 8, h26Var2.a);
                                h26Var2.J(0);
                            }
                            this.e.d(i9, h26Var2);
                            vy2.s(this.l != -9223372036854775807L);
                            this.e.a(this.l, 1, i9, 0, null);
                            this.l += this.t;
                            if (this.q) {
                                ao0Var.t((int) this.r);
                            }
                            this.h = 0;
                        } else {
                            continue;
                        }
                    }
                } else {
                    int iX2 = h26Var.x();
                    if ((iX2 & 224) == 224) {
                        this.k = iX2;
                        this.h = 2;
                    } else if (iX2 != 86) {
                        this.h = 0;
                    }
                }
            } else if (h26Var.x() == 86) {
                this.h = 1;
            }
        }
    }

    @Override // defpackage.mz1
    public final void c() {
        this.h = 0;
        this.l = -9223372036854775807L;
        this.m = false;
    }

    @Override // defpackage.mz1
    public final void e(int i, long j) {
        this.l = j;
    }

    @Override // defpackage.mz1
    public final void f(x72 x72Var, ft8 ft8Var) {
        ft8Var.a();
        ft8Var.b();
        this.e = x72Var.o(ft8Var.d, 1);
        ft8Var.b();
        this.f = ft8Var.e;
    }

    @Override // defpackage.mz1
    public final void d(boolean z) {
    }
}
