package com.google.protobuf;

import com.google.protobuf.ByteString;
import defpackage.bl4;
import defpackage.dv4;
import defpackage.h72;
import defpackage.lu0;
import defpackage.tr3;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import org.pcap4j.packet.Dot11LinkAdaptationControl;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends lu0 {
    public final InputStream c;
    public final byte[] d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j = Integer.MAX_VALUE;

    public e(InputStream inputStream) {
        tr3.a(inputStream, "input");
        this.c = inputStream;
        this.d = new byte[4096];
        this.e = 0;
        this.g = 0;
        this.i = 0;
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
        byte[] bArr = this.d;
        if (iX > 0) {
            int i = this.e;
            int i2 = this.g;
            if (iX <= i - i2) {
                String str = new String(bArr, i2, iX, tr3.a);
                this.g += iX;
                return str;
            }
        }
        if (iX == 0) {
            return "";
        }
        if (iX > this.e) {
            return new String(J(iX), tr3.a);
        }
        R(iX);
        String str2 = new String(bArr, this.g, iX, tr3.a);
        this.g += iX;
        return str2;
    }

    @Override // defpackage.lu0
    public final String E() throws IOException {
        int iX = x();
        int i = this.g;
        int i2 = this.e;
        int i3 = i2 - i;
        byte[] bArrJ = this.d;
        if (iX <= i3 && iX > 0) {
            this.g = i + iX;
        } else {
            if (iX == 0) {
                return "";
            }
            i = 0;
            if (iX <= i2) {
                R(iX);
                this.g = iX;
            } else {
                bArrJ = J(iX);
            }
        }
        return z.a.d(bArrJ, i, iX);
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
        int i3 = 0;
        if (i2 == 0) {
            int i4 = this.e - this.g;
            byte[] bArr = this.d;
            if (i4 >= 10) {
                while (i3 < 10) {
                    int i5 = this.g;
                    this.g = i5 + 1;
                    if (bArr[i5] < 0) {
                        i3++;
                    }
                }
                throw InvalidProtocolBufferException.f();
            }
            while (i3 < 10) {
                if (this.g == this.e) {
                    R(1);
                }
                int i6 = this.g;
                this.g = i6 + 1;
                if (bArr[i6] < 0) {
                    i3++;
                }
            }
            throw InvalidProtocolBufferException.f();
            return true;
        }
        if (i2 == 1) {
            S(8);
            return true;
        }
        if (i2 == 2) {
            S(x());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw InvalidProtocolBufferException.e();
            }
            S(4);
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

    public final byte[] J(int i) throws IOException {
        byte[] bArrK = K(i);
        if (bArrK != null) {
            return bArrK;
        }
        int i2 = this.g;
        int i3 = this.e;
        int length = i3 - i2;
        this.i += i3;
        this.g = 0;
        this.e = 0;
        ArrayList<byte[]> arrayListL = L(i - length);
        byte[] bArr = new byte[i];
        System.arraycopy(this.d, i2, bArr, 0, length);
        for (byte[] bArr2 : arrayListL) {
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    public final byte[] K(int i) throws IOException {
        if (i == 0) {
            return tr3.b;
        }
        if (i < 0) {
            throw InvalidProtocolBufferException.g();
        }
        int i2 = this.i;
        int i3 = this.g;
        int i4 = i2 + i3 + i;
        if (i4 - Integer.MAX_VALUE > 0) {
            throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i5 = this.j;
        if (i4 > i5) {
            S((i5 - i2) - i3);
            throw InvalidProtocolBufferException.i();
        }
        int i6 = this.e - i3;
        int i7 = i - i6;
        InputStream inputStream = this.c;
        if (i7 >= 4096) {
            try {
                if (i7 > inputStream.available()) {
                    return null;
                }
            } catch (InvalidProtocolBufferException e) {
                e.a = true;
                throw e;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.d, this.g, bArr, 0, i6);
        this.i += this.e;
        this.g = 0;
        this.e = 0;
        while (i6 < i) {
            try {
                int i8 = inputStream.read(bArr, i6, i - i6);
                if (i8 == -1) {
                    throw InvalidProtocolBufferException.i();
                }
                this.i += i8;
                i6 += i8;
            } catch (InvalidProtocolBufferException e2) {
                e2.a = true;
                throw e2;
            }
        }
        return bArr;
    }

    public final ArrayList L(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int iMin = Math.min(i, 4096);
            byte[] bArr = new byte[iMin];
            int i2 = 0;
            while (i2 < iMin) {
                int i3 = this.c.read(bArr, i2, iMin - i2);
                if (i3 == -1) {
                    throw InvalidProtocolBufferException.i();
                }
                this.i += i3;
                i2 += i3;
            }
            i -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int M() throws InvalidProtocolBufferException {
        int i = this.g;
        if (this.e - i < 4) {
            R(4);
            i = this.g;
        }
        this.g = i + 4;
        byte[] bArr = this.d;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public final long N() throws InvalidProtocolBufferException {
        int i = this.g;
        if (this.e - i < 8) {
            R(8);
            i = this.g;
        }
        this.g = i + 8;
        byte[] bArr = this.d;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    public final long O() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.g;
        int i2 = this.e;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.d;
            byte b = bArr[i];
            if (b >= 0) {
                this.g = i3;
                return b;
            }
            if (i2 - i3 >= 9) {
                int i4 = i + 2;
                int i5 = (bArr[i3] << 7) ^ b;
                if (i5 < 0) {
                    j = i5 ^ (-128);
                } else {
                    int i6 = i + 3;
                    int i7 = (bArr[i4] << Dot11LinkAdaptationControl.ASELI) ^ i5;
                    if (i7 >= 0) {
                        j = i7 ^ 16256;
                        i4 = i6;
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            j4 = (-2080896) ^ i9;
                        } else {
                            long j5 = i9;
                            i4 = i + 5;
                            long j6 = j5 ^ (((long) bArr[i8]) << 28);
                            if (j6 >= 0) {
                                j3 = 266354560;
                            } else {
                                i8 = i + 6;
                                long j7 = j6 ^ (((long) bArr[i4]) << 35);
                                if (j7 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    i4 = i + 7;
                                    j6 = j7 ^ (((long) bArr[i8]) << 42);
                                    if (j6 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        i8 = i + 8;
                                        j7 = j6 ^ (((long) bArr[i4]) << 49);
                                        if (j7 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            i4 = i + 9;
                                            long j8 = (j7 ^ (((long) bArr[i8]) << 56)) ^ 71499008037633920L;
                                            if (j8 < 0) {
                                                int i10 = i + 10;
                                                if (bArr[i4] >= 0) {
                                                    i4 = i10;
                                                }
                                            }
                                            j = j8;
                                        }
                                    }
                                }
                                j4 = j2 ^ j7;
                            }
                            j = j3 ^ j6;
                        }
                        i4 = i8;
                        j = j4;
                    }
                }
                this.g = i4;
                return j;
            }
        }
        return P();
    }

    public final long P() throws InvalidProtocolBufferException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.g == this.e) {
                R(1);
            }
            int i2 = this.g;
            this.g = i2 + 1;
            byte b = this.d[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        throw InvalidProtocolBufferException.f();
    }

    public final void Q() {
        int i = this.e + this.f;
        this.e = i;
        int i2 = this.i + i;
        int i3 = this.j;
        if (i2 <= i3) {
            this.f = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f = i4;
        this.e = i - i4;
    }

    public final void R(int i) throws InvalidProtocolBufferException {
        if (T(i)) {
            return;
        }
        if (i <= (Integer.MAX_VALUE - this.i) - this.g) {
            throw InvalidProtocolBufferException.i();
        }
        throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public final void S(int i) throws InvalidProtocolBufferException {
        int i2 = this.e;
        int i3 = this.g;
        if (i <= i2 - i3 && i >= 0) {
            this.g = i3 + i;
            return;
        }
        InputStream inputStream = this.c;
        if (i < 0) {
            throw InvalidProtocolBufferException.g();
        }
        int i4 = this.i;
        int i5 = i4 + i3;
        int i6 = i5 + i;
        int i7 = this.j;
        if (i6 > i7) {
            S((i7 - i4) - i3);
            throw InvalidProtocolBufferException.i();
        }
        this.i = i5;
        int i8 = i2 - i3;
        this.e = 0;
        this.g = 0;
        while (i8 < i) {
            long j = i - i8;
            try {
                try {
                    long jSkip = inputStream.skip(j);
                    if (jSkip < 0 || jSkip > j) {
                        throw new IllegalStateException(inputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i8 += (int) jSkip;
                    }
                } catch (InvalidProtocolBufferException e) {
                    e.a = true;
                    throw e;
                }
            } catch (Throwable th) {
                this.i += i8;
                Q();
                throw th;
            }
        }
        this.i += i8;
        Q();
        if (i8 >= i) {
            return;
        }
        int i9 = this.e;
        int i10 = i9 - this.g;
        this.g = i9;
        R(1);
        while (true) {
            int i11 = i - i10;
            int i12 = this.e;
            if (i11 <= i12) {
                this.g = i11;
                return;
            } else {
                i10 += i12;
                this.g = i12;
                R(1);
            }
        }
    }

    public final boolean T(int i) throws IOException {
        InputStream inputStream = this.c;
        int i2 = this.g;
        int i3 = i2 + i;
        int i4 = this.e;
        if (i3 <= i4) {
            throw new IllegalStateException(bl4.q(i, "refillBuffer() called when ", " bytes were already available in buffer"));
        }
        int i5 = this.i;
        if (i <= (Integer.MAX_VALUE - i5) - i2 && i5 + i2 + i <= this.j) {
            byte[] bArr = this.d;
            if (i2 > 0) {
                if (i4 > i2) {
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                this.i += i2;
                this.e -= i2;
                this.g = 0;
            }
            int i6 = this.e;
            try {
                int i7 = inputStream.read(bArr, i6, Math.min(bArr.length - i6, (Integer.MAX_VALUE - this.i) - i6));
                if (i7 == 0 || i7 < -1 || i7 > bArr.length) {
                    throw new IllegalStateException(inputStream.getClass() + "#read(byte[]) returned invalid result: " + i7 + "\nThe InputStream implementation is buggy.");
                }
                if (i7 > 0) {
                    this.e += i7;
                    Q();
                    if (this.e >= i) {
                        return true;
                    }
                    return T(i);
                }
            } catch (InvalidProtocolBufferException e) {
                e.a = true;
                throw e;
            }
        }
        return false;
    }

    @Override // defpackage.lu0
    public final void a(int i) throws InvalidProtocolBufferException {
        if (this.h != i) {
            throw InvalidProtocolBufferException.a();
        }
    }

    @Override // defpackage.lu0
    public final int e() {
        int i = this.j;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - (this.i + this.g);
    }

    @Override // defpackage.lu0
    public final int f() {
        return this.i + this.g;
    }

    @Override // defpackage.lu0
    public final boolean g() {
        return this.g == this.e && !T(1);
    }

    @Override // defpackage.lu0
    public final void k(int i) {
        this.j = i;
        Q();
    }

    @Override // defpackage.lu0
    public final int l(int i) throws InvalidProtocolBufferException {
        if (i < 0) {
            throw InvalidProtocolBufferException.g();
        }
        int i2 = this.i + this.g + i;
        int i3 = this.j;
        if (i2 > i3) {
            throw InvalidProtocolBufferException.i();
        }
        this.j = i2;
        Q();
        return i3;
    }

    @Override // defpackage.lu0
    public final boolean m() {
        return O() != 0;
    }

    @Override // defpackage.lu0
    public final ByteString n() throws IOException {
        int iX = x();
        int i = this.e;
        int i2 = this.g;
        int i3 = i - i2;
        byte[] bArr = this.d;
        if (iX <= i3 && iX > 0) {
            ByteString byteStringH = ByteString.h(bArr, i2, iX);
            this.g += iX;
            return byteStringH;
        }
        if (iX == 0) {
            return ByteString.b;
        }
        byte[] bArrK = K(iX);
        if (bArrK != null) {
            return ByteString.h(bArrK, 0, bArrK.length);
        }
        int i4 = this.g;
        int i5 = this.e;
        int length = i5 - i4;
        this.i += i5;
        this.g = 0;
        this.e = 0;
        ArrayList<byte[]> arrayListL = L(iX - length);
        byte[] bArr2 = new byte[iX];
        System.arraycopy(bArr, i4, bArr2, 0, length);
        for (byte[] bArr3 : arrayListL) {
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        ByteString byteString = ByteString.b;
        return new ByteString.LiteralByteString(bArr2);
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
        int i2 = this.g;
        int i3 = this.e;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.d;
            byte b = bArr[i2];
            if (b >= 0) {
                this.g = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << Dot11LinkAdaptationControl.ASELI) ^ i6;
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        if (i10 < 0) {
                            i = (-2080896) ^ i10;
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                int i12 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i5 = i12;
                                                    i = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i11;
                            }
                            i = i11;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.g = i5;
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
