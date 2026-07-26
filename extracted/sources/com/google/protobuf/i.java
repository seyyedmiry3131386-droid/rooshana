package com.google.protobuf;

import defpackage.ev4;
import defpackage.gf7;
import defpackage.uy8;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends j {
    public final byte[] l;
    public final int m;
    public int n;
    public final OutputStream o;

    public i(OutputStream outputStream, int i) {
        if (i < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int iMax = Math.max(i, 20);
        this.l = new byte[iMax];
        this.m = iMax;
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        this.o = outputStream;
    }

    @Override // com.google.protobuf.j
    public final void A0(int i) {
        J0(5);
        G0(i);
    }

    @Override // com.google.protobuf.j
    public final void B0(int i, long j) {
        J0(20);
        F0(i, 0);
        H0(j);
    }

    @Override // com.google.protobuf.j
    public final void C0(long j) {
        J0(10);
        H0(j);
    }

    public final void D0(int i) {
        int i2 = this.n;
        int i3 = i2 + 1;
        this.n = i3;
        byte[] bArr = this.l;
        bArr[i2] = (byte) (i & 255);
        int i4 = i2 + 2;
        this.n = i4;
        bArr[i3] = (byte) ((i >> 8) & 255);
        int i5 = i2 + 3;
        this.n = i5;
        bArr[i4] = (byte) ((i >> 16) & 255);
        this.n = i2 + 4;
        bArr[i5] = (byte) ((i >> 24) & 255);
    }

    public final void E0(long j) {
        int i = this.n;
        int i2 = i + 1;
        this.n = i2;
        byte[] bArr = this.l;
        bArr[i] = (byte) (j & 255);
        int i3 = i + 2;
        this.n = i3;
        bArr[i2] = (byte) ((j >> 8) & 255);
        int i4 = i + 3;
        this.n = i4;
        bArr[i3] = (byte) ((j >> 16) & 255);
        int i5 = i + 4;
        this.n = i5;
        bArr[i4] = (byte) (255 & (j >> 24));
        int i6 = i + 5;
        this.n = i6;
        bArr[i5] = (byte) (((int) (j >> 32)) & 255);
        int i7 = i + 6;
        this.n = i7;
        bArr[i6] = (byte) (((int) (j >> 40)) & 255);
        int i8 = i + 7;
        this.n = i8;
        bArr[i7] = (byte) (((int) (j >> 48)) & 255);
        this.n = i + 8;
        bArr[i8] = (byte) (((int) (j >> 56)) & 255);
    }

    public final void F0(int i, int i2) {
        G0((i << 3) | i2);
    }

    public final void G0(int i) {
        boolean z = j.k;
        byte[] bArr = this.l;
        if (z) {
            while ((i & (-128)) != 0) {
                int i2 = this.n;
                this.n = i2 + 1;
                uy8.k(bArr, i2, (byte) ((i & 127) | 128));
                i >>>= 7;
            }
            int i3 = this.n;
            this.n = i3 + 1;
            uy8.k(bArr, i3, (byte) i);
            return;
        }
        while ((i & (-128)) != 0) {
            int i4 = this.n;
            this.n = i4 + 1;
            bArr[i4] = (byte) ((i & 127) | 128);
            i >>>= 7;
        }
        int i5 = this.n;
        this.n = i5 + 1;
        bArr[i5] = (byte) i;
    }

    public final void H0(long j) {
        boolean z = j.k;
        byte[] bArr = this.l;
        if (z) {
            while ((j & (-128)) != 0) {
                int i = this.n;
                this.n = i + 1;
                uy8.k(bArr, i, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            int i2 = this.n;
            this.n = i2 + 1;
            uy8.k(bArr, i2, (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            int i3 = this.n;
            this.n = i3 + 1;
            bArr[i3] = (byte) ((((int) j) & 127) | 128);
            j >>>= 7;
        }
        int i4 = this.n;
        this.n = i4 + 1;
        bArr[i4] = (byte) j;
    }

    public final void I0() {
        this.o.write(this.l, 0, this.n);
        this.n = 0;
    }

    public final void J0(int i) {
        if (this.m - this.n < i) {
            I0();
        }
    }

    public final void K0(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.n;
        int i4 = this.m;
        int i5 = i4 - i3;
        byte[] bArr2 = this.l;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.n += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.n = i4;
        I0();
        if (i7 > i4) {
            this.o.write(bArr, i6, i7);
        } else {
            System.arraycopy(bArr, i6, bArr2, 0, i7);
            this.n = i7;
        }
    }

    @Override // defpackage.js3
    public final void X(ByteBuffer byteBuffer) throws IOException {
        int iRemaining = byteBuffer.remaining();
        int i = this.n;
        int i2 = this.m;
        int i3 = i2 - i;
        byte[] bArr = this.l;
        if (i3 >= iRemaining) {
            byteBuffer.get(bArr, i, iRemaining);
            this.n += iRemaining;
            return;
        }
        byteBuffer.get(bArr, i, i3);
        int i4 = iRemaining - i3;
        this.n = i2;
        I0();
        while (i4 > i2) {
            byteBuffer.get(bArr, 0, i2);
            this.o.write(bArr, 0, i2);
            i4 -= i2;
        }
        byteBuffer.get(bArr, 0, i4);
        this.n = i4;
    }

    @Override // defpackage.js3
    public final void Y(byte[] bArr, int i, int i2) throws IOException {
        K0(bArr, i, i2);
    }

    @Override // com.google.protobuf.j
    public final void h0(byte b) {
        if (this.n == this.m) {
            I0();
        }
        int i = this.n;
        this.n = i + 1;
        this.l[i] = b;
    }

    @Override // com.google.protobuf.j
    public final void i0(int i, boolean z) {
        J0(11);
        F0(i, 0);
        byte b = z ? (byte) 1 : (byte) 0;
        int i2 = this.n;
        this.n = i2 + 1;
        this.l[i2] = b;
    }

    @Override // com.google.protobuf.j
    public final void j0(int i, byte[] bArr) throws IOException {
        A0(i);
        K0(bArr, 0, i);
    }

    @Override // com.google.protobuf.j
    public final void k0(int i, ByteString byteString) {
        y0(i, 2);
        l0(byteString);
    }

    @Override // com.google.protobuf.j
    public final void l0(ByteString byteString) {
        A0(byteString.size());
        byteString.x(this);
    }

    @Override // com.google.protobuf.j
    public final void m0(int i, int i2) {
        J0(14);
        F0(i, 5);
        D0(i2);
    }

    @Override // com.google.protobuf.j
    public final void n0(int i) {
        J0(4);
        D0(i);
    }

    @Override // com.google.protobuf.j
    public final void o0(int i, long j) {
        J0(18);
        F0(i, 1);
        E0(j);
    }

    @Override // com.google.protobuf.j
    public final void p0(long j) {
        J0(8);
        E0(j);
    }

    @Override // com.google.protobuf.j
    public final void q0(int i, int i2) {
        J0(20);
        F0(i, 0);
        if (i2 >= 0) {
            G0(i2);
        } else {
            H0(i2);
        }
    }

    @Override // com.google.protobuf.j
    public final void r0(int i) {
        if (i >= 0) {
            A0(i);
        } else {
            C0(i);
        }
    }

    @Override // com.google.protobuf.j
    public final void s0(int i, ev4 ev4Var, gf7 gf7Var) {
        y0(i, 2);
        A0(((a) ev4Var).getSerializedSize(gf7Var));
        gf7Var.f(ev4Var, this.i);
    }

    @Override // com.google.protobuf.j
    public final void t0(ev4 ev4Var) {
        A0(ev4Var.getSerializedSize());
        ev4Var.writeTo(this);
    }

    @Override // com.google.protobuf.j
    public final void u0(int i, ev4 ev4Var) {
        y0(1, 3);
        z0(2, i);
        y0(3, 2);
        t0(ev4Var);
        y0(1, 4);
    }

    @Override // com.google.protobuf.j
    public final void v0(int i, ByteString byteString) {
        y0(1, 3);
        z0(2, i);
        k0(3, byteString);
        y0(1, 4);
    }

    @Override // com.google.protobuf.j
    public final void w0(int i, String str) throws IOException {
        y0(i, 2);
        x0(str);
    }

    @Override // com.google.protobuf.j
    public final void x0(String str) throws IOException {
        try {
            int length = str.length() * 3;
            int iE0 = j.e0(length);
            int i = iE0 + length;
            int i2 = this.m;
            if (i > i2) {
                byte[] bArr = new byte[length];
                int iJ = z.a.j(bArr, str, 0, length);
                A0(iJ);
                K0(bArr, 0, iJ);
                return;
            }
            if (i > i2 - this.n) {
                I0();
            }
            int iE02 = j.e0(str.length());
            int i3 = this.n;
            byte[] bArr2 = this.l;
            try {
                try {
                    if (iE02 == iE0) {
                        int i4 = i3 + iE02;
                        this.n = i4;
                        int iJ2 = z.a.j(bArr2, str, i4, i2 - i4);
                        this.n = i3;
                        G0((iJ2 - i3) - iE02);
                        this.n = iJ2;
                    } else {
                        int iD = z.d(str);
                        G0(iD);
                        this.n = z.a.j(bArr2, str, this.n, iD);
                    }
                } catch (Utf8$UnpairedSurrogateException e) {
                    this.n = i3;
                    throw e;
                }
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw new CodedOutputStream$OutOfSpaceException(e2);
            }
        } catch (Utf8$UnpairedSurrogateException e3) {
            g0(str, e3);
        }
    }

    @Override // com.google.protobuf.j
    public final void y0(int i, int i2) {
        A0((i << 3) | i2);
    }

    @Override // com.google.protobuf.j
    public final void z0(int i, int i2) {
        J0(20);
        F0(i, 0);
        G0(i2);
    }
}
