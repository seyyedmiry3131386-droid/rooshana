package com.google.protobuf;

import com.google.protobuf.ByteString;
import defpackage.dv4;
import defpackage.h72;
import defpackage.lu0;
import defpackage.sy8;
import defpackage.tr3;
import defpackage.uy8;
import java.nio.ByteBuffer;
import org.pcap4j.packet.Dot11LinkAdaptationControl;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends lu0 {
    public final ByteBuffer c;
    public final long d;
    public long e;
    public long f;
    public final long g;
    public int h;
    public int i;
    public int j = Integer.MAX_VALUE;

    public f(ByteBuffer byteBuffer, boolean z) {
        this.c = byteBuffer;
        long jK = uy8.c.k(uy8.g, byteBuffer);
        this.d = jK;
        this.e = ((long) byteBuffer.limit()) + jK;
        long jPosition = jK + ((long) byteBuffer.position());
        this.f = jPosition;
        this.g = jPosition;
    }

    @Override // defpackage.lu0
    public final long A() {
        return K();
    }

    @Override // defpackage.lu0
    public final int B() {
        return lu0.c(x());
    }

    @Override // defpackage.lu0
    public final long C() {
        return lu0.d(L());
    }

    @Override // defpackage.lu0
    public final String D() throws InvalidProtocolBufferException {
        int iX = x();
        if (iX > 0) {
            long j = this.e;
            long j2 = this.f;
            if (iX <= ((int) (j - j2))) {
                byte[] bArr = new byte[iX];
                long j3 = iX;
                uy8.c.c(j2, bArr, 0L, j3);
                String str = new String(bArr, tr3.a);
                this.f += j3;
                return str;
            }
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
            long j = this.e;
            long j2 = this.f;
            if (iX <= ((int) (j - j2))) {
                String strC = z.c(this.c, (int) (j2 - this.d), iX);
                this.f += (long) iX;
                return strC;
            }
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
            this.i = 0;
            return 0;
        }
        int iX = x();
        this.i = iX;
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
        return L();
    }

    @Override // defpackage.lu0
    public final boolean I(int i) throws InvalidProtocolBufferException {
        int iF;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (((int) (this.e - this.f)) >= 10) {
                while (i3 < 10) {
                    long j = this.f;
                    this.f = j + 1;
                    if (uy8.c.e(j) < 0) {
                        i3++;
                    }
                }
                throw InvalidProtocolBufferException.f();
            }
            while (i3 < 10) {
                long j2 = this.f;
                if (j2 == this.e) {
                    throw InvalidProtocolBufferException.i();
                }
                this.f = j2 + 1;
                if (uy8.c.e(j2) < 0) {
                    i3++;
                }
            }
            throw InvalidProtocolBufferException.f();
            return true;
        }
        if (i2 == 1) {
            O(8);
            return true;
        }
        if (i2 == 2) {
            O(x());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw InvalidProtocolBufferException.e();
            }
            O(4);
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

    public final int J() throws InvalidProtocolBufferException {
        long j = this.f;
        if (this.e - j < 4) {
            throw InvalidProtocolBufferException.i();
        }
        this.f = 4 + j;
        sy8 sy8Var = uy8.c;
        return ((sy8Var.e(j + 3) & 255) << 24) | (sy8Var.e(j) & 255) | ((sy8Var.e(1 + j) & 255) << 8) | ((sy8Var.e(2 + j) & 255) << 16);
    }

    public final long K() throws InvalidProtocolBufferException {
        long j = this.f;
        if (this.e - j < 8) {
            throw InvalidProtocolBufferException.i();
        }
        this.f = 8 + j;
        sy8 sy8Var = uy8.c;
        return ((((long) sy8Var.e(j + 7)) & 255) << 56) | (((long) sy8Var.e(j)) & 255) | ((((long) sy8Var.e(1 + j)) & 255) << 8) | ((((long) sy8Var.e(2 + j)) & 255) << 16) | ((((long) sy8Var.e(3 + j)) & 255) << 24) | ((((long) sy8Var.e(4 + j)) & 255) << 32) | ((((long) sy8Var.e(5 + j)) & 255) << 40) | ((((long) sy8Var.e(6 + j)) & 255) << 48);
    }

    public final long L() {
        long j;
        long j2;
        long j3;
        long j4 = this.f;
        if (this.e != j4) {
            long j5 = 1 + j4;
            sy8 sy8Var = uy8.c;
            byte bE = sy8Var.e(j4);
            if (bE >= 0) {
                this.f = j5;
                return bE;
            }
            if (this.e - j5 >= 9) {
                long j6 = 2 + j4;
                int iE = (sy8Var.e(j5) << 7) ^ bE;
                if (iE < 0) {
                    j = iE ^ (-128);
                } else {
                    long j7 = 3 + j4;
                    int iE2 = iE ^ (sy8Var.e(j6) << Dot11LinkAdaptationControl.ASELI);
                    if (iE2 >= 0) {
                        j = iE2 ^ 16256;
                    } else {
                        long j8 = 4 + j4;
                        int iE3 = iE2 ^ (sy8Var.e(j7) << 21);
                        if (iE3 < 0) {
                            j = (-2080896) ^ iE3;
                            j6 = j8;
                        } else {
                            j7 = 5 + j4;
                            long jE = ((long) iE3) ^ (((long) sy8Var.e(j8)) << 28);
                            if (jE >= 0) {
                                j3 = 266354560;
                            } else {
                                long j9 = 6 + j4;
                                long jE2 = jE ^ (((long) sy8Var.e(j7)) << 35);
                                if (jE2 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    j7 = 7 + j4;
                                    jE = jE2 ^ (((long) sy8Var.e(j9)) << 42);
                                    if (jE >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        j9 = 8 + j4;
                                        jE2 = jE ^ (((long) sy8Var.e(j7)) << 49);
                                        if (jE2 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            long j10 = 9 + j4;
                                            long jE3 = (jE2 ^ (((long) sy8Var.e(j9)) << 56)) ^ 71499008037633920L;
                                            if (jE3 < 0) {
                                                long j11 = j4 + 10;
                                                if (sy8Var.e(j10) >= 0) {
                                                    j6 = j11;
                                                    j = jE3;
                                                }
                                            } else {
                                                j = jE3;
                                                j6 = j10;
                                            }
                                        }
                                    }
                                }
                                j = j2 ^ jE2;
                                j6 = j9;
                            }
                            j = j3 ^ jE;
                        }
                    }
                    j6 = j7;
                }
                this.f = j6;
                return j;
            }
        }
        return M();
    }

    public final long M() throws InvalidProtocolBufferException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            long j2 = this.f;
            if (j2 == this.e) {
                throw InvalidProtocolBufferException.i();
            }
            this.f = 1 + j2;
            byte bE = uy8.c.e(j2);
            j |= ((long) (bE & 127)) << i;
            if ((bE & 128) == 0) {
                return j;
            }
        }
        throw InvalidProtocolBufferException.f();
    }

    public final void N() {
        long j = this.e + ((long) this.h);
        this.e = j;
        int i = (int) (j - this.g);
        int i2 = this.j;
        if (i <= i2) {
            this.h = 0;
            return;
        }
        int i3 = i - i2;
        this.h = i3;
        this.e = j - ((long) i3);
    }

    public final void O(int i) throws InvalidProtocolBufferException {
        if (i >= 0) {
            long j = this.e;
            long j2 = this.f;
            if (i <= ((int) (j - j2))) {
                this.f = j2 + ((long) i);
                return;
            }
        }
        if (i >= 0) {
            throw InvalidProtocolBufferException.i();
        }
        throw InvalidProtocolBufferException.g();
    }

    @Override // defpackage.lu0
    public final void a(int i) throws InvalidProtocolBufferException {
        if (this.i != i) {
            throw InvalidProtocolBufferException.a();
        }
    }

    @Override // defpackage.lu0
    public final int e() {
        int i = this.j;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - f();
    }

    @Override // defpackage.lu0
    public final int f() {
        return (int) (this.f - this.g);
    }

    @Override // defpackage.lu0
    public final boolean g() {
        return this.f == this.e;
    }

    @Override // defpackage.lu0
    public final void k(int i) {
        this.j = i;
        N();
    }

    @Override // defpackage.lu0
    public final int l(int i) throws InvalidProtocolBufferException {
        if (i < 0) {
            throw InvalidProtocolBufferException.g();
        }
        int iF = f() + i;
        int i2 = this.j;
        if (iF > i2) {
            throw InvalidProtocolBufferException.i();
        }
        this.j = iF;
        N();
        return i2;
    }

    @Override // defpackage.lu0
    public final boolean m() {
        return L() != 0;
    }

    @Override // defpackage.lu0
    public final ByteString n() throws InvalidProtocolBufferException {
        int iX = x();
        if (iX > 0) {
            long j = this.e;
            long j2 = this.f;
            if (iX <= ((int) (j - j2))) {
                byte[] bArr = new byte[iX];
                long j3 = iX;
                uy8.c.c(j2, bArr, 0L, j3);
                this.f += j3;
                ByteString byteString = ByteString.b;
                return new ByteString.LiteralByteString(bArr);
            }
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
        return Double.longBitsToDouble(K());
    }

    @Override // defpackage.lu0
    public final int p() {
        return x();
    }

    @Override // defpackage.lu0
    public final int q() {
        return J();
    }

    @Override // defpackage.lu0
    public final long r() {
        return K();
    }

    @Override // defpackage.lu0
    public final float s() {
        return Float.intBitsToFloat(J());
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
        return L();
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
        long j = this.f;
        if (this.e != j) {
            long j2 = 1 + j;
            sy8 sy8Var = uy8.c;
            byte bE = sy8Var.e(j);
            if (bE >= 0) {
                this.f = j2;
                return bE;
            }
            if (this.e - j2 >= 9) {
                long j3 = 2 + j;
                int iE = (sy8Var.e(j2) << 7) ^ bE;
                if (iE < 0) {
                    i = iE ^ (-128);
                } else {
                    long j4 = 3 + j;
                    int iE2 = iE ^ (sy8Var.e(j3) << Dot11LinkAdaptationControl.ASELI);
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
                                            long j6 = 9 + j;
                                            if (sy8Var.e(j5) < 0) {
                                                long j7 = j + 10;
                                                if (sy8Var.e(j6) >= 0) {
                                                    j3 = j7;
                                                    i = i2;
                                                }
                                            } else {
                                                i = i2;
                                                j3 = j6;
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
                this.f = j3;
                return i;
            }
        }
        return (int) M();
    }

    @Override // defpackage.lu0
    public final int z() {
        return J();
    }
}
