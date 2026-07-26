package com.google.protobuf;

import defpackage.ev4;
import defpackage.gf7;
import defpackage.uy8;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends j {
    public final byte[] l;
    public final int m;
    public int n;

    public h(byte[] bArr, int i) {
        if (((bArr.length - i) | i) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i)));
        }
        this.l = bArr;
        this.n = 0;
        this.m = i;
    }

    @Override // com.google.protobuf.j
    public final void A0(int i) throws CodedOutputStream$OutOfSpaceException {
        while (true) {
            int i2 = i & (-128);
            byte[] bArr = this.l;
            if (i2 == 0) {
                int i3 = this.n;
                this.n = i3 + 1;
                bArr[i3] = (byte) i;
                return;
            } else {
                try {
                    int i4 = this.n;
                    this.n = i4 + 1;
                    bArr[i4] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.n), Integer.valueOf(this.m), 1), e);
                }
            }
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.n), Integer.valueOf(this.m), 1), e);
        }
    }

    @Override // com.google.protobuf.j
    public final void B0(int i, long j) throws CodedOutputStream$OutOfSpaceException {
        y0(i, 0);
        C0(j);
    }

    @Override // com.google.protobuf.j
    public final void C0(long j) throws CodedOutputStream$OutOfSpaceException {
        boolean z = j.k;
        byte[] bArr = this.l;
        if (z && D0() >= 10) {
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
            try {
                int i3 = this.n;
                this.n = i3 + 1;
                bArr[i3] = (byte) ((((int) j) & 127) | 128);
                j >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.n), Integer.valueOf(this.m), 1), e);
            }
        }
        int i4 = this.n;
        this.n = i4 + 1;
        bArr[i4] = (byte) j;
    }

    public final int D0() {
        return this.m - this.n;
    }

    public final void E0(byte[] bArr, int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        try {
            System.arraycopy(bArr, i, this.l, this.n, i2);
            this.n += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.n), Integer.valueOf(this.m), Integer.valueOf(i2)), e);
        }
    }

    @Override // defpackage.js3
    public final void X(ByteBuffer byteBuffer) throws CodedOutputStream$OutOfSpaceException {
        int iRemaining = byteBuffer.remaining();
        try {
            byteBuffer.get(this.l, this.n, iRemaining);
            this.n += iRemaining;
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.n), Integer.valueOf(this.m), Integer.valueOf(iRemaining)), e);
        }
    }

    @Override // defpackage.js3
    public final void Y(byte[] bArr, int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        E0(bArr, i, i2);
    }

    @Override // com.google.protobuf.j
    public final void h0(byte b) throws CodedOutputStream$OutOfSpaceException {
        try {
            byte[] bArr = this.l;
            int i = this.n;
            this.n = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.n), Integer.valueOf(this.m), 1), e);
        }
    }

    @Override // com.google.protobuf.j
    public final void i0(int i, boolean z) throws CodedOutputStream$OutOfSpaceException {
        y0(i, 0);
        h0(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.protobuf.j
    public final void j0(int i, byte[] bArr) throws CodedOutputStream$OutOfSpaceException {
        A0(i);
        E0(bArr, 0, i);
    }

    @Override // com.google.protobuf.j
    public final void k0(int i, ByteString byteString) throws CodedOutputStream$OutOfSpaceException {
        y0(i, 2);
        l0(byteString);
    }

    @Override // com.google.protobuf.j
    public final void l0(ByteString byteString) throws CodedOutputStream$OutOfSpaceException {
        A0(byteString.size());
        byteString.x(this);
    }

    @Override // com.google.protobuf.j
    public final void m0(int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        y0(i, 5);
        n0(i2);
    }

    @Override // com.google.protobuf.j
    public final void n0(int i) throws CodedOutputStream$OutOfSpaceException {
        try {
            byte[] bArr = this.l;
            int i2 = this.n;
            int i3 = i2 + 1;
            this.n = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i2 + 2;
            this.n = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i2 + 3;
            this.n = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.n = i2 + 4;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.n), Integer.valueOf(this.m), 1), e);
        }
    }

    @Override // com.google.protobuf.j
    public final void o0(int i, long j) throws CodedOutputStream$OutOfSpaceException {
        y0(i, 1);
        p0(j);
    }

    @Override // com.google.protobuf.j
    public final void p0(long j) throws CodedOutputStream$OutOfSpaceException {
        try {
            byte[] bArr = this.l;
            int i = this.n;
            int i2 = i + 1;
            this.n = i2;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i + 2;
            this.n = i3;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i + 3;
            this.n = i4;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i + 4;
            this.n = i5;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
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
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.n), Integer.valueOf(this.m), 1), e);
        }
    }

    @Override // com.google.protobuf.j
    public final void q0(int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        y0(i, 0);
        r0(i2);
    }

    @Override // com.google.protobuf.j
    public final void r0(int i) throws CodedOutputStream$OutOfSpaceException {
        if (i >= 0) {
            A0(i);
        } else {
            C0(i);
        }
    }

    @Override // com.google.protobuf.j
    public final void s0(int i, ev4 ev4Var, gf7 gf7Var) throws CodedOutputStream$OutOfSpaceException {
        y0(i, 2);
        A0(((a) ev4Var).getSerializedSize(gf7Var));
        gf7Var.f(ev4Var, this.i);
    }

    @Override // com.google.protobuf.j
    public final void t0(ev4 ev4Var) throws CodedOutputStream$OutOfSpaceException {
        A0(ev4Var.getSerializedSize());
        ev4Var.writeTo(this);
    }

    @Override // com.google.protobuf.j
    public final void u0(int i, ev4 ev4Var) throws CodedOutputStream$OutOfSpaceException {
        y0(1, 3);
        z0(2, i);
        y0(3, 2);
        t0(ev4Var);
        y0(1, 4);
    }

    @Override // com.google.protobuf.j
    public final void v0(int i, ByteString byteString) throws CodedOutputStream$OutOfSpaceException {
        y0(1, 3);
        z0(2, i);
        k0(3, byteString);
        y0(1, 4);
    }

    @Override // com.google.protobuf.j
    public final void w0(int i, String str) throws CodedOutputStream$OutOfSpaceException {
        y0(i, 2);
        x0(str);
    }

    @Override // com.google.protobuf.j
    public final void x0(String str) throws CodedOutputStream$OutOfSpaceException {
        int i = this.n;
        try {
            int iE0 = j.e0(str.length() * 3);
            int iE02 = j.e0(str.length());
            byte[] bArr = this.l;
            if (iE02 != iE0) {
                A0(z.d(str));
                this.n = z.a.j(bArr, str, this.n, D0());
                return;
            }
            int i2 = i + iE02;
            this.n = i2;
            int iJ = z.a.j(bArr, str, i2, D0());
            this.n = i;
            A0((iJ - i) - iE02);
            this.n = iJ;
        } catch (Utf8$UnpairedSurrogateException e) {
            this.n = i;
            g0(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new CodedOutputStream$OutOfSpaceException(e2);
        }
    }

    @Override // com.google.protobuf.j
    public final void y0(int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        A0((i << 3) | i2);
    }

    @Override // com.google.protobuf.j
    public final void z0(int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        y0(i, 0);
        A0(i2);
    }
}
