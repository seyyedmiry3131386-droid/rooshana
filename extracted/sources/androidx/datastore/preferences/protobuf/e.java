package androidx.datastore.preferences.protobuf;

import defpackage.hf7;
import defpackage.mx8;
import defpackage.r79;
import defpackage.tt3;
import defpackage.ur3;
import defpackage.vy8;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class e extends tt3 {
    public static final Logger q = Logger.getLogger(e.class.getName());
    public static final boolean r = vy8.e;
    public r79 l;
    public final byte[] m;
    public final int n;
    public int o;
    public final mx8 p;

    public e(mx8 mx8Var, int i) {
        if (i < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int iMax = Math.max(i, 20);
        this.m = new byte[iMax];
        this.n = iMax;
        this.p = mx8Var;
    }

    public static int V(int i, ByteString byteString) {
        int iZ = Z(i);
        int size = byteString.size();
        return a0(size) + size + iZ;
    }

    public static int W(int i) {
        return a0((i >> 31) ^ (i << 1));
    }

    public static int X(long j) {
        return b0((j >> 63) ^ (j << 1));
    }

    public static int Y(String str) {
        int length;
        try {
            length = q.a(str);
        } catch (Utf8$UnpairedSurrogateException unused) {
            length = str.getBytes(ur3.a).length;
        }
        return a0(length) + length;
    }

    public static int Z(int i) {
        return a0(i << 3);
    }

    public static int a0(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int b0(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    @Override // defpackage.tt3
    public final void O(ByteBuffer byteBuffer) throws IOException {
        int iRemaining = byteBuffer.remaining();
        int i = this.o;
        int i2 = this.n;
        int i3 = i2 - i;
        byte[] bArr = this.m;
        if (i3 >= iRemaining) {
            byteBuffer.get(bArr, i, iRemaining);
            this.o += iRemaining;
            return;
        }
        byteBuffer.get(bArr, i, i3);
        int i4 = iRemaining - i3;
        this.o = i2;
        c0();
        while (i4 > i2) {
            byteBuffer.get(bArr, 0, i2);
            this.p.write(bArr, 0, i2);
            i4 -= i2;
        }
        byteBuffer.get(bArr, 0, i4);
        this.o = i4;
    }

    @Override // defpackage.tt3
    public final void P(byte[] bArr, int i, int i2) throws IOException {
        f0(bArr, i, i2);
    }

    public final void Q(int i) {
        int i2 = this.o;
        int i3 = i2 + 1;
        this.o = i3;
        byte[] bArr = this.m;
        bArr[i2] = (byte) (i & 255);
        int i4 = i2 + 2;
        this.o = i4;
        bArr[i3] = (byte) ((i >> 8) & 255);
        int i5 = i2 + 3;
        this.o = i5;
        bArr[i4] = (byte) ((i >> 16) & 255);
        this.o = i2 + 4;
        bArr[i5] = (byte) ((i >> 24) & 255);
    }

    public final void R(long j) {
        int i = this.o;
        int i2 = i + 1;
        this.o = i2;
        byte[] bArr = this.m;
        bArr[i] = (byte) (j & 255);
        int i3 = i + 2;
        this.o = i3;
        bArr[i2] = (byte) ((j >> 8) & 255);
        int i4 = i + 3;
        this.o = i4;
        bArr[i3] = (byte) ((j >> 16) & 255);
        int i5 = i + 4;
        this.o = i5;
        bArr[i4] = (byte) (255 & (j >> 24));
        int i6 = i + 5;
        this.o = i6;
        bArr[i5] = (byte) (((int) (j >> 32)) & 255);
        int i7 = i + 6;
        this.o = i7;
        bArr[i6] = (byte) (((int) (j >> 40)) & 255);
        int i8 = i + 7;
        this.o = i8;
        bArr[i7] = (byte) (((int) (j >> 48)) & 255);
        this.o = i + 8;
        bArr[i8] = (byte) (((int) (j >> 56)) & 255);
    }

    public final void S(int i, int i2) {
        T((i << 3) | i2);
    }

    public final void T(int i) {
        boolean z = r;
        byte[] bArr = this.m;
        if (z) {
            while ((i & (-128)) != 0) {
                int i2 = this.o;
                this.o = i2 + 1;
                vy8.j(bArr, i2, (byte) ((i | 128) & 255));
                i >>>= 7;
            }
            int i3 = this.o;
            this.o = i3 + 1;
            vy8.j(bArr, i3, (byte) i);
            return;
        }
        while ((i & (-128)) != 0) {
            int i4 = this.o;
            this.o = i4 + 1;
            bArr[i4] = (byte) ((i | 128) & 255);
            i >>>= 7;
        }
        int i5 = this.o;
        this.o = i5 + 1;
        bArr[i5] = (byte) i;
    }

    public final void U(long j) {
        boolean z = r;
        byte[] bArr = this.m;
        if (z) {
            while ((j & (-128)) != 0) {
                int i = this.o;
                this.o = i + 1;
                vy8.j(bArr, i, (byte) ((((int) j) | 128) & 255));
                j >>>= 7;
            }
            int i2 = this.o;
            this.o = i2 + 1;
            vy8.j(bArr, i2, (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            int i3 = this.o;
            this.o = i3 + 1;
            bArr[i3] = (byte) ((((int) j) | 128) & 255);
            j >>>= 7;
        }
        int i4 = this.o;
        this.o = i4 + 1;
        bArr[i4] = (byte) j;
    }

    public final void c0() {
        this.p.write(this.m, 0, this.o);
        this.o = 0;
    }

    public final void d0(int i) {
        if (this.n - this.o < i) {
            c0();
        }
    }

    public final void e0(byte b) {
        if (this.o == this.n) {
            c0();
        }
        int i = this.o;
        this.o = i + 1;
        this.m[i] = b;
    }

    public final void f0(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.o;
        int i4 = this.n;
        int i5 = i4 - i3;
        byte[] bArr2 = this.m;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.o += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.o = i4;
        c0();
        if (i7 > i4) {
            this.p.write(bArr, i6, i7);
        } else {
            System.arraycopy(bArr, i6, bArr2, 0, i7);
            this.o = i7;
        }
    }

    public final void g0(int i, boolean z) {
        d0(11);
        S(i, 0);
        byte b = z ? (byte) 1 : (byte) 0;
        int i2 = this.o;
        this.o = i2 + 1;
        this.m[i2] = b;
    }

    public final void h0(int i, ByteString byteString) {
        s0(i, 2);
        i0(byteString);
    }

    public final void i0(ByteString byteString) {
        u0(byteString.size());
        byteString.q(this);
    }

    public final void j0(int i, int i2) {
        d0(14);
        S(i, 5);
        Q(i2);
    }

    public final void k0(int i) {
        d0(4);
        Q(i);
    }

    public final void l0(int i, long j) {
        d0(18);
        S(i, 1);
        R(j);
    }

    public final void m0(long j) {
        d0(8);
        R(j);
    }

    public final void n0(int i, int i2) {
        d0(20);
        S(i, 0);
        if (i2 >= 0) {
            T(i2);
        } else {
            U(i2);
        }
    }

    public final void o0(int i) {
        if (i >= 0) {
            u0(i);
        } else {
            w0(i);
        }
    }

    public final void p0(int i, a aVar, hf7 hf7Var) {
        s0(i, 2);
        u0(aVar.a(hf7Var));
        hf7Var.e(aVar, this.l);
    }

    public final void q0(int i, String str) throws IOException {
        s0(i, 2);
        r0(str);
    }

    public final void r0(String str) throws IOException {
        try {
            int length = str.length() * 3;
            int iA0 = a0(length);
            int i = iA0 + length;
            int i2 = this.n;
            if (i > i2) {
                byte[] bArr = new byte[length];
                int iD = q.a.d(bArr, str, 0, length);
                u0(iD);
                f0(bArr, 0, iD);
                return;
            }
            if (i > i2 - this.o) {
                c0();
            }
            int iA02 = a0(str.length());
            int i3 = this.o;
            byte[] bArr2 = this.m;
            try {
                try {
                    if (iA02 == iA0) {
                        int i4 = i3 + iA02;
                        this.o = i4;
                        int iD2 = q.a.d(bArr2, str, i4, i2 - i4);
                        this.o = i3;
                        T((iD2 - i3) - iA02);
                        this.o = iD2;
                    } else {
                        int iA = q.a(str);
                        T(iA);
                        this.o = q.a.d(bArr2, str, this.o, iA);
                    }
                } catch (Utf8$UnpairedSurrogateException e) {
                    this.o = i3;
                    throw e;
                }
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw new IOException(e2) { // from class: androidx.datastore.preferences.protobuf.CodedOutputStream$OutOfSpaceException
                    private static final long serialVersionUID = -6947486886997889499L;
                };
            }
        } catch (Utf8$UnpairedSurrogateException e3) {
            q.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e3);
            byte[] bytes = str.getBytes(ur3.a);
            try {
                u0(bytes.length);
                P(bytes, 0, bytes.length);
            } catch (IndexOutOfBoundsException e4) {
                throw new IOException(e4) { // from class: androidx.datastore.preferences.protobuf.CodedOutputStream$OutOfSpaceException
                    private static final long serialVersionUID = -6947486886997889499L;
                };
            }
        }
    }

    public final void s0(int i, int i2) {
        u0((i << 3) | i2);
    }

    public final void t0(int i, int i2) {
        d0(20);
        S(i, 0);
        T(i2);
    }

    public final void u0(int i) {
        d0(5);
        T(i);
    }

    public final void v0(int i, long j) {
        d0(20);
        S(i, 0);
        U(j);
    }

    public final void w0(long j) {
        d0(10);
        U(j);
    }
}
