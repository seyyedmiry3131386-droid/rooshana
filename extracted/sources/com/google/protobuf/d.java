package com.google.protobuf;

import com.google.protobuf.ByteString;
import defpackage.dv4;
import defpackage.h72;
import defpackage.lu0;
import defpackage.sy8;
import defpackage.tr3;
import defpackage.uy8;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import org.pcap4j.packet.Dot11LinkAdaptationControl;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends lu0 {
    public final Iterator c;
    public ByteBuffer d;
    public int e;
    public int f;
    public int h;
    public long j;
    public long k;
    public long l;
    public int g = Integer.MAX_VALUE;
    public int i = 0;

    public d(int i, ArrayList arrayList) {
        this.e = i;
        this.c = arrayList.iterator();
        if (i != 0) {
            S();
            return;
        }
        this.d = tr3.c;
        this.j = 0L;
        this.k = 0L;
        this.l = 0L;
    }

    @Override // defpackage.lu0
    public final long A() {
        return N();
    }

    @Override // defpackage.lu0
    public final int B() {
        return lu0.c(x());
    }

    @Override // defpackage.lu0
    public final long C() {
        return lu0.d(O());
    }

    @Override // defpackage.lu0
    public final String D() throws InvalidProtocolBufferException {
        int iX = x();
        if (iX > 0) {
            long j = iX;
            long j2 = this.l;
            long j3 = this.j;
            if (j <= j2 - j3) {
                byte[] bArr = new byte[iX];
                uy8.c.c(j3, bArr, 0L, j);
                String str = new String(bArr, tr3.a);
                this.j += j;
                return str;
            }
        }
        if (iX > 0 && iX <= Q()) {
            byte[] bArr2 = new byte[iX];
            L(iX, bArr2);
            return new String(bArr2, tr3.a);
        }
        if (iX == 0) {
            return "";
        }
        if (iX < 0) {
            throw InvalidProtocolBufferException.g();
        }
        throw InvalidProtocolBufferException.i();
    }

    @Override // defpackage.lu0
    public final String E() throws InvalidProtocolBufferException {
        int iX = x();
        if (iX > 0) {
            long j = iX;
            long j2 = this.l;
            long j3 = this.j;
            if (j <= j2 - j3) {
                String strC = z.c(this.d, (int) (j3 - this.k), iX);
                this.j += j;
                return strC;
            }
        }
        if (iX >= 0 && iX <= Q()) {
            byte[] bArr = new byte[iX];
            L(iX, bArr);
            return z.a.d(bArr, 0, iX);
        }
        if (iX == 0) {
            return "";
        }
        if (iX <= 0) {
            throw InvalidProtocolBufferException.g();
        }
        throw InvalidProtocolBufferException.i();
    }

    @Override // defpackage.lu0
    public final int F() throws InvalidProtocolBufferException {
        if (g()) {
            this.h = 0;
            return 0;
        }
        int iX = x();
        this.h = iX;
        if ((iX >>> 3) != 0) {
            return iX;
        }
        throw InvalidProtocolBufferException.b();
    }

    @Override // defpackage.lu0
    public final int G() {
        return x();
    }

    @Override // defpackage.lu0
    public final long H() {
        return O();
    }

    @Override // defpackage.lu0
    public final boolean I(int i) throws InvalidProtocolBufferException {
        int iF;
        int i2 = i & 7;
        if (i2 == 0) {
            for (int i3 = 0; i3 < 10; i3++) {
                if (K() >= 0) {
                    return true;
                }
            }
            throw InvalidProtocolBufferException.f();
        }
        if (i2 == 1) {
            R(8);
            return true;
        }
        if (i2 == 2) {
            R(x());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw InvalidProtocolBufferException.e();
            }
            R(4);
            return true;
        }
        do {
            iF = F();
            if (iF == 0) {
                break;
            }
        } while (I(iF));
        a(((i >>> 3) << 3) | 4);
        return true;
    }

    public final long J() {
        return this.l - this.j;
    }

    public final byte K() throws InvalidProtocolBufferException {
        if (J() == 0) {
            if (!this.c.hasNext()) {
                throw InvalidProtocolBufferException.i();
            }
            S();
        }
        long j = this.j;
        this.j = 1 + j;
        return uy8.c.e(j);
    }

    public final void L(int i, byte[] bArr) throws InvalidProtocolBufferException {
        if (i < 0 || i > Q()) {
            if (i > 0) {
                throw InvalidProtocolBufferException.i();
            }
            if (i != 0) {
                throw InvalidProtocolBufferException.g();
            }
            return;
        }
        int i2 = i;
        while (i2 > 0) {
            if (J() == 0) {
                if (!this.c.hasNext()) {
                    throw InvalidProtocolBufferException.i();
                }
                S();
            }
            int iMin = Math.min(i2, (int) J());
            long j = iMin;
            uy8.c.c(this.j, bArr, i - i2, j);
            i2 -= iMin;
            this.j += j;
        }
    }

    public final int M() {
        if (J() < 4) {
            return (K() & 255) | ((K() & 255) << 8) | ((K() & 255) << 16) | ((K() & 255) << 24);
        }
        long j = this.j;
        this.j = 4 + j;
        sy8 sy8Var = uy8.c;
        return ((sy8Var.e(j + 3) & 255) << 24) | (sy8Var.e(j) & 255) | ((sy8Var.e(1 + j) & 255) << 8) | ((sy8Var.e(2 + j) & 255) << 16);
    }

    public final long N() {
        if (J() < 8) {
            return (((long) K()) & 255) | ((((long) K()) & 255) << 8) | ((((long) K()) & 255) << 16) | ((((long) K()) & 255) << 24) | ((((long) K()) & 255) << 32) | ((((long) K()) & 255) << 40) | ((((long) K()) & 255) << 48) | ((((long) K()) & 255) << 56);
        }
        long j = this.j;
        this.j = 8 + j;
        sy8 sy8Var = uy8.c;
        return (((long) sy8Var.e(j)) & 255) | ((((long) sy8Var.e(j + 1)) & 255) << 8) | ((((long) sy8Var.e(j + 2)) & 255) << 16) | ((((long) sy8Var.e(3 + j)) & 255) << 24) | ((((long) sy8Var.e(4 + j)) & 255) << 32) | ((((long) sy8Var.e(5 + j)) & 255) << 40) | ((((long) sy8Var.e(6 + j)) & 255) << 48) | ((((long) sy8Var.e(j + 7)) & 255) << 56);
    }

    public final long O() {
        long j;
        long j2;
        long j3;
        long j4 = this.j;
        if (this.l != j4) {
            long j5 = j4 + 1;
            sy8 sy8Var = uy8.c;
            byte bE = sy8Var.e(j4);
            if (bE >= 0) {
                this.j++;
                return bE;
            }
            if (this.l - this.j >= 10) {
                long j6 = 2 + j4;
                int iE = (sy8Var.e(j5) << 7) ^ bE;
                if (iE < 0) {
                    j = iE ^ (-128);
                } else {
                    long j7 = 3 + j4;
                    int iE2 = (sy8Var.e(j6) << Dot11LinkAdaptationControl.ASELI) ^ iE;
                    if (iE2 >= 0) {
                        j = iE2 ^ 16256;
                    } else {
                        long j8 = 4 + j4;
                        int iE3 = iE2 ^ (sy8Var.e(j7) << 21);
                        if (iE3 < 0) {
                            j = (-2080896) ^ iE3;
                            j6 = j8;
                        } else {
                            long j9 = 5 + j4;
                            long jE = (((long) sy8Var.e(j8)) << 28) ^ ((long) iE3);
                            if (jE >= 0) {
                                j3 = 266354560;
                            } else {
                                j7 = 6 + j4;
                                long jE2 = jE ^ (((long) sy8Var.e(j9)) << 35);
                                if (jE2 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    j9 = 7 + j4;
                                    jE = jE2 ^ (((long) sy8Var.e(j7)) << 42);
                                    if (jE >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        j7 = 8 + j4;
                                        jE2 = jE ^ (((long) sy8Var.e(j9)) << 49);
                                        if (jE2 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            j9 = 9 + j4;
                                            long jE3 = (jE2 ^ (((long) sy8Var.e(j7)) << 56)) ^ 71499008037633920L;
                                            if (jE3 < 0) {
                                                long j10 = j4 + 10;
                                                if (sy8Var.e(j9) >= 0) {
                                                    j6 = j10;
                                                    j = jE3;
                                                }
                                            } else {
                                                j = jE3;
                                                j6 = j9;
                                            }
                                        }
                                    }
                                }
                                j = j2 ^ jE2;
                            }
                            j = j3 ^ jE;
                            j6 = j9;
                        }
                    }
                    j6 = j7;
                }
                this.j = j6;
                return j;
            }
        }
        return P();
    }

    public final long P() throws InvalidProtocolBufferException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte bK = K();
            j |= ((long) (bK & 127)) << i;
            if ((bK & 128) == 0) {
                return j;
            }
        }
        throw InvalidProtocolBufferException.f();
    }

    public final int Q() {
        return (int) ((((long) (this.e - this.i)) - this.j) + this.k);
    }

    public final void R(int i) throws InvalidProtocolBufferException {
        if (i < 0 || i > (((long) (this.e - this.i)) - this.j) + this.k) {
            if (i >= 0) {
                throw InvalidProtocolBufferException.i();
            }
            throw InvalidProtocolBufferException.g();
        }
        while (i > 0) {
            if (J() == 0) {
                if (!this.c.hasNext()) {
                    throw InvalidProtocolBufferException.i();
                }
                S();
            }
            int iMin = Math.min(i, (int) J());
            i -= iMin;
            this.j += (long) iMin;
        }
    }

    public final void S() {
        ByteBuffer byteBuffer = (ByteBuffer) this.c.next();
        this.d = byteBuffer;
        this.i += (int) (this.j - this.k);
        long jPosition = byteBuffer.position();
        this.j = jPosition;
        this.k = jPosition;
        this.l = this.d.limit();
        long jK = uy8.c.k(uy8.g, this.d);
        this.j += jK;
        this.k += jK;
        this.l += jK;
    }

    @Override // defpackage.lu0
    public final void a(int i) throws InvalidProtocolBufferException {
        if (this.h != i) {
            throw InvalidProtocolBufferException.a();
        }
    }

    @Override // defpackage.lu0
    public final int e() {
        int i = this.g;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - f();
    }

    @Override // defpackage.lu0
    public final int f() {
        return (int) ((((long) this.i) + this.j) - this.k);
    }

    @Override // defpackage.lu0
    public final boolean g() {
        return (((long) this.i) + this.j) - this.k == ((long) this.e);
    }

    @Override // defpackage.lu0
    public final void k(int i) {
        this.g = i;
        int i2 = this.e + this.f;
        this.e = i2;
        if (i2 <= i) {
            this.f = 0;
            return;
        }
        int i3 = i2 - i;
        this.f = i3;
        this.e = i2 - i3;
    }

    @Override // defpackage.lu0
    public final int l(int i) throws InvalidProtocolBufferException {
        if (i < 0) {
            throw InvalidProtocolBufferException.g();
        }
        int iF = f() + i;
        int i2 = this.g;
        if (iF > i2) {
            throw InvalidProtocolBufferException.i();
        }
        this.g = iF;
        int i3 = this.e + this.f;
        this.e = i3;
        if (i3 <= iF) {
            this.f = 0;
            return i2;
        }
        int i4 = i3 - iF;
        this.f = i4;
        this.e = i3 - i4;
        return i2;
    }

    @Override // defpackage.lu0
    public final boolean m() {
        return O() != 0;
    }

    @Override // defpackage.lu0
    public final ByteString n() throws InvalidProtocolBufferException {
        int iX = x();
        if (iX > 0) {
            long j = iX;
            long j2 = this.l;
            long j3 = this.j;
            if (j <= j2 - j3) {
                byte[] bArr = new byte[iX];
                uy8.c.c(j3, bArr, 0L, j);
                this.j += j;
                ByteString byteString = ByteString.b;
                return new ByteString.LiteralByteString(bArr);
            }
        }
        if (iX > 0 && iX <= Q()) {
            byte[] bArr2 = new byte[iX];
            L(iX, bArr2);
            ByteString byteString2 = ByteString.b;
            return new ByteString.LiteralByteString(bArr2);
        }
        if (iX == 0) {
            return ByteString.b;
        }
        if (iX < 0) {
            throw InvalidProtocolBufferException.g();
        }
        throw InvalidProtocolBufferException.i();
    }

    @Override // defpackage.lu0
    public final double o() {
        return Double.longBitsToDouble(N());
    }

    @Override // defpackage.lu0
    public final int p() {
        return x();
    }

    @Override // defpackage.lu0
    public final int q() {
        return M();
    }

    @Override // defpackage.lu0
    public final long r() {
        return N();
    }

    @Override // defpackage.lu0
    public final float s() {
        return Float.intBitsToFloat(M());
    }

    @Override // defpackage.lu0
    public final void t(int i, dv4 dv4Var, h72 h72Var) throws InvalidProtocolBufferException {
        b();
        this.a++;
        dv4Var.mergeFrom(this, h72Var);
        a((i << 3) | 4);
        this.a--;
    }

    @Override // defpackage.lu0
    public final int u() {
        return x();
    }

    @Override // defpackage.lu0
    public final long v() {
        return O();
    }

    @Override // defpackage.lu0
    public final void w(dv4 dv4Var, h72 h72Var) throws InvalidProtocolBufferException {
        int iX = x();
        b();
        int iL = l(iX);
        this.a++;
        dv4Var.mergeFrom(this, h72Var);
        a(0);
        this.a--;
        if (e() != 0) {
            throw InvalidProtocolBufferException.i();
        }
        k(iL);
    }

    @Override // defpackage.lu0
    public final int x() {
        int i;
        long j = this.j;
        if (this.l != j) {
            long j2 = j + 1;
            sy8 sy8Var = uy8.c;
            byte bE = sy8Var.e(j);
            if (bE >= 0) {
                this.j++;
                return bE;
            }
            if (this.l - this.j >= 10) {
                long j3 = 2 + j;
                int iE = (sy8Var.e(j2) << 7) ^ bE;
                if (iE < 0) {
                    i = iE ^ (-128);
                } else {
                    long j4 = 3 + j;
                    int iE2 = (sy8Var.e(j3) << Dot11LinkAdaptationControl.ASELI) ^ iE;
                    if (iE2 >= 0) {
                        i = iE2 ^ 16256;
                    } else {
                        long j5 = 4 + j;
                        int iE3 = iE2 ^ (sy8Var.e(j4) << 21);
                        if (iE3 < 0) {
                            i = (-2080896) ^ iE3;
                        } else {
                            j4 = 5 + j;
                            byte bE2 = sy8Var.e(j5);
                            int i2 = (iE3 ^ (bE2 << 28)) ^ 266354560;
                            if (bE2 < 0) {
                                j5 = 6 + j;
                                if (sy8Var.e(j4) < 0) {
                                    j4 = 7 + j;
                                    if (sy8Var.e(j5) < 0) {
                                        j5 = 8 + j;
                                        if (sy8Var.e(j4) < 0) {
                                            j4 = 9 + j;
                                            if (sy8Var.e(j5) < 0) {
                                                long j6 = j + 10;
                                                if (sy8Var.e(j4) >= 0) {
                                                    i = i2;
                                                    j3 = j6;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i2;
                            }
                            i = i2;
                        }
                        j3 = j5;
                    }
                    j3 = j4;
                }
                this.j = j3;
                return i;
            }
        }
        return (int) P();
    }

    @Override // defpackage.lu0
    public final int z() {
        return M();
    }
}
