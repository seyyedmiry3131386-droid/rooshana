package defpackage;

import androidx.compose.foundation.gestures.Orientation;

/* JADX INFO: loaded from: classes.dex */
public final class nq0 implements w72, x72 {
    public final /* synthetic */ int a;
    public long b;
    public Object c;

    public /* synthetic */ nq0(int i, long j, Object obj) {
        this.a = i;
        this.b = j;
        this.c = obj;
    }

    public void A() {
        this.b = 0L;
        nq0 nq0Var = (nq0) this.c;
        if (nq0Var != null) {
            nq0Var.A();
        }
    }

    public void B(int i) {
        if (i < 64) {
            this.b |= 1 << i;
        } else {
            v();
            ((nq0) this.c).B(i - 64);
        }
    }

    @Override // defpackage.w72
    public boolean a(byte[] bArr, int i, int i2, boolean z) {
        return ((w72) this.c).a(bArr, 0, i2, z);
    }

    @Override // defpackage.w72
    public boolean d(int i, boolean z) {
        return ((w72) this.c).d(i, true);
    }

    @Override // defpackage.w72
    public boolean e(byte[] bArr, int i, int i2, boolean z) {
        return ((w72) this.c).e(bArr, i, i2, z);
    }

    @Override // defpackage.w72
    public long f() {
        return ((w72) this.c).f() - this.b;
    }

    @Override // defpackage.w72
    public void g(int i) {
        ((w72) this.c).g(i);
    }

    @Override // defpackage.w72
    public long getPosition() {
        return ((w72) this.c).getPosition() - this.b;
    }

    @Override // defpackage.w72
    public int h(int i) {
        return ((w72) this.c).h(i);
    }

    @Override // defpackage.w72
    public long i() {
        return ((w72) this.c).i() - this.b;
    }

    @Override // defpackage.w72
    public int j(byte[] bArr, int i, int i2) {
        return ((w72) this.c).j(bArr, i, i2);
    }

    @Override // defpackage.x72
    public void l() {
        ((x72) this.c).l();
    }

    @Override // defpackage.w72
    public void m() {
        ((w72) this.c).m();
    }

    @Override // defpackage.w72
    public void n(int i) {
        ((w72) this.c).n(i);
    }

    @Override // defpackage.x72
    public cp8 o(int i, int i2) {
        return ((x72) this.c).o(i, i2);
    }

    @Override // defpackage.w72
    public void q(byte[] bArr, int i, int i2) {
        ((w72) this.c).q(bArr, i, i2);
    }

    public long r(long j, long j2, float f) {
        long jG = nr5.g(this.b, nr5.f(j, j2));
        this.b = jG;
        if ((((Orientation) this.c) == null ? nr5.d(jG) : Math.abs(y(jG))) < f) {
            return 9205357640488583168L;
        }
        if (((Orientation) this.c) == null) {
            long j3 = this.b;
            return nr5.f(this.b, nr5.h(f, nr5.b(nr5.d(j3), j3)));
        }
        float fY = y(this.b) - (Math.signum(y(this.b)) * f);
        long j4 = this.b;
        Orientation orientation = (Orientation) this.c;
        Orientation orientation2 = Orientation.b;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (orientation == orientation2 ? j4 & 4294967295L : j4 >> 32));
        if (((Orientation) this.c) != orientation2) {
            return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fY)) & 4294967295L);
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (((long) Float.floatToRawIntBits(fY)) << 32);
    }

    @Override // defpackage.ra1
    public int read(byte[] bArr, int i, int i2) {
        return ((w72) this.c).read(bArr, i, i2);
    }

    @Override // defpackage.w72
    public void readFully(byte[] bArr, int i, int i2) {
        ((w72) this.c).readFully(bArr, i, i2);
    }

    public void s(int i) {
        if (i < 64) {
            this.b &= ~(1 << i);
            return;
        }
        nq0 nq0Var = (nq0) this.c;
        if (nq0Var != null) {
            nq0Var.s(i - 64);
        }
    }

    @Override // defpackage.x72
    public void t(kl7 kl7Var) {
        ((x72) this.c).t(new s48(this, kl7Var, kl7Var));
    }

    public String toString() {
        switch (this.a) {
            case 0:
                if (((nq0) this.c) == null) {
                    return Long.toBinaryString(this.b);
                }
                return ((nq0) this.c).toString() + "xx" + Long.toBinaryString(this.b);
            default:
                return super.toString();
        }
    }

    public int u(int i) {
        nq0 nq0Var = (nq0) this.c;
        if (nq0Var == null) {
            return i >= 64 ? Long.bitCount(this.b) : Long.bitCount(this.b & ((1 << i) - 1));
        }
        if (i < 64) {
            return Long.bitCount(this.b & ((1 << i) - 1));
        }
        return Long.bitCount(this.b) + nq0Var.u(i - 64);
    }

    public void v() {
        if (((nq0) this.c) == null) {
            this.c = new nq0();
        }
    }

    public boolean w(int i) {
        if (i < 64) {
            return (this.b & (1 << i)) != 0;
        }
        v();
        return ((nq0) this.c).w(i - 64);
    }

    public void x(int i, boolean z) {
        if (i >= 64) {
            v();
            ((nq0) this.c).x(i - 64, z);
            return;
        }
        long j = this.b;
        boolean z2 = (Long.MIN_VALUE & j) != 0;
        long j2 = (1 << i) - 1;
        this.b = ((j & (~j2)) << 1) | (j & j2);
        if (z) {
            B(i);
        } else {
            s(i);
        }
        if (z2 || ((nq0) this.c) != null) {
            v();
            ((nq0) this.c).x(0, z2);
        }
    }

    public float y(long j) {
        return Float.intBitsToFloat((int) (((Orientation) this.c) == Orientation.b ? j >> 32 : j & 4294967295L));
    }

    public boolean z(int i) {
        if (i >= 64) {
            v();
            return ((nq0) this.c).z(i - 64);
        }
        long j = 1 << i;
        long j2 = this.b;
        boolean z = (j2 & j) != 0;
        long j3 = j2 & (~j);
        this.b = j3;
        long j4 = j - 1;
        this.b = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
        nq0 nq0Var = (nq0) this.c;
        if (nq0Var != null) {
            if (nq0Var.w(0)) {
                B(63);
            }
            ((nq0) this.c).z(0);
        }
        return z;
    }

    public nq0(tv6 tv6Var) {
        this.a = 1;
        js3.p(tv6Var, "source");
        this.c = tv6Var;
        this.b = 262144L;
    }

    public nq0(w72 w72Var, long j) {
        this.a = 3;
        this.c = w72Var;
        vy2.j(w72Var.getPosition() >= j);
        this.b = j;
    }

    public nq0() {
        this.a = 0;
        this.b = 0L;
    }

    public nq0(long j, Orientation orientation) {
        this.a = 5;
        this.c = orientation;
        this.b = j;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nq0(Orientation orientation, int i) {
        this(0L, (i & 1) != 0 ? null : orientation);
        this.a = 5;
    }
}
