package defpackage;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class oe1 implements w72 {
    public final ra1 b;
    public final long c;
    public long d;
    public int f;
    public int g;
    public byte[] e = new byte[65536];
    public final byte[] a = new byte[4096];

    static {
        lp4.a("media3.extractor");
    }

    public oe1(ra1 ra1Var, long j, long j2) {
        this.b = ra1Var;
        this.d = j;
        this.c = j2;
    }

    @Override // defpackage.w72
    public final boolean a(byte[] bArr, int i, int i2, boolean z) throws EOFException, InterruptedIOException {
        int iMin;
        int i3 = this.g;
        if (i3 == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(i3, i2);
            System.arraycopy(this.e, 0, bArr, i, iMin);
            s(iMin);
        }
        int iR = iMin;
        while (iR < i2 && iR != -1) {
            iR = r(bArr, i, i2, iR, z);
        }
        if (iR != -1) {
            this.d += (long) iR;
        }
        return iR != -1;
    }

    @Override // defpackage.w72
    public final boolean d(int i, boolean z) throws EOFException, InterruptedIOException {
        int iMin = Math.min(this.g, i);
        s(iMin);
        int iR = iMin;
        while (iR < i && iR != -1) {
            byte[] bArr = this.a;
            iR = r(bArr, -iR, Math.min(i, bArr.length + iR), iR, z);
        }
        if (iR != -1) {
            this.d += (long) iR;
        }
        return iR != -1;
    }

    @Override // defpackage.w72
    public final boolean e(byte[] bArr, int i, int i2, boolean z) {
        if (!l(i2, z)) {
            return false;
        }
        System.arraycopy(this.e, this.f - i2, bArr, i, i2);
        return true;
    }

    @Override // defpackage.w72
    public final long f() {
        return this.d + ((long) this.f);
    }

    @Override // defpackage.w72
    public final void g(int i) throws EOFException, InterruptedIOException {
        l(i, false);
    }

    @Override // defpackage.w72
    public final long getPosition() {
        return this.d;
    }

    @Override // defpackage.w72
    public final int h(int i) throws EOFException, InterruptedIOException {
        oe1 oe1Var;
        int iMin = Math.min(this.g, i);
        s(iMin);
        if (iMin == 0) {
            byte[] bArr = this.a;
            oe1Var = this;
            iMin = oe1Var.r(bArr, 0, Math.min(i, bArr.length), 0, true);
        } else {
            oe1Var = this;
        }
        if (iMin != -1) {
            oe1Var.d += (long) iMin;
        }
        return iMin;
    }

    @Override // defpackage.w72
    public final long i() {
        return this.c;
    }

    @Override // defpackage.w72
    public final int j(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        oe1 oe1Var;
        int iMin;
        o(i2);
        int i3 = this.g;
        int i4 = this.f;
        int i5 = i3 - i4;
        if (i5 == 0) {
            oe1Var = this;
            iMin = oe1Var.r(this.e, i4, i2, 0, true);
            if (iMin == -1) {
                return -1;
            }
            oe1Var.g += iMin;
        } else {
            oe1Var = this;
            iMin = Math.min(i2, i5);
        }
        System.arraycopy(oe1Var.e, oe1Var.f, bArr, i, iMin);
        oe1Var.f += iMin;
        return iMin;
    }

    public final boolean l(int i, boolean z) throws EOFException, InterruptedIOException {
        o(i);
        int iR = this.g - this.f;
        while (iR < i) {
            int i2 = i;
            boolean z2 = z;
            iR = r(this.e, this.f, i2, iR, z2);
            if (iR == -1) {
                return false;
            }
            this.g = this.f + iR;
            i = i2;
            z = z2;
        }
        this.f += i;
        return true;
    }

    @Override // defpackage.w72
    public final void m() {
        this.f = 0;
    }

    @Override // defpackage.w72
    public final void n(int i) throws EOFException, InterruptedIOException {
        d(i, false);
    }

    public final void o(int i) {
        int i2 = this.f + i;
        byte[] bArr = this.e;
        if (i2 > bArr.length) {
            this.e = Arrays.copyOf(this.e, j29.i(bArr.length * 2, 65536 + i2, i2 + 524288));
        }
    }

    @Override // defpackage.w72
    public final void q(byte[] bArr, int i, int i2) {
        e(bArr, i, i2, false);
    }

    public final int r(byte[] bArr, int i, int i2, int i3, boolean z) throws EOFException, InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int i4 = this.b.read(bArr, i + i3, i2 - i3);
        if (i4 != -1) {
            return i3 + i4;
        }
        if (i3 == 0 && z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // defpackage.ra1
    public final int read(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        oe1 oe1Var;
        int i3 = this.g;
        int iR = 0;
        if (i3 != 0) {
            int iMin = Math.min(i3, i2);
            System.arraycopy(this.e, 0, bArr, i, iMin);
            s(iMin);
            iR = iMin;
        }
        if (iR == 0) {
            oe1Var = this;
            iR = oe1Var.r(bArr, i, i2, 0, true);
        } else {
            oe1Var = this;
        }
        if (iR != -1) {
            oe1Var.d += (long) iR;
        }
        return iR;
    }

    @Override // defpackage.w72
    public final void readFully(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        a(bArr, i, i2, false);
    }

    public final void s(int i) {
        int i2 = this.g - i;
        this.g = i2;
        this.f = 0;
        byte[] bArr = this.e;
        byte[] bArr2 = i2 < bArr.length - 524288 ? new byte[65536 + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.e = bArr2;
    }
}
