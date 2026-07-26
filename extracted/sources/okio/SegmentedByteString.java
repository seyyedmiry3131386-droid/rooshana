package okio;

import defpackage.bl4;
import defpackage.dw1;
import defpackage.ew;
import defpackage.gh0;
import defpackage.js3;
import defpackage.rm7;
import defpackage.ub1;
import defpackage.vl7;
import defpackage.wq2;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes3.dex */
public final class SegmentedByteString extends ByteString {
    public final transient byte[][] e;
    public final transient int[] f;

    public SegmentedByteString(byte[][] bArr, int[] iArr) {
        super(ByteString.d.a);
        this.e = bArr;
        this.f = iArr;
    }

    private final Object writeReplace() {
        return w();
    }

    @Override // okio.ByteString
    public final String a() {
        throw null;
    }

    @Override // okio.ByteString
    public final ByteString c(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        byte[][] bArr = this.e;
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.f;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            messageDigest.update(bArr[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        byte[] bArrDigest = messageDigest.digest();
        js3.m(bArrDigest);
        return new ByteString(bArrDigest);
    }

    @Override // okio.ByteString
    public final int e() {
        return this.f[this.e.length - 1];
    }

    @Override // okio.ByteString
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.e() == e() && m(0, byteString, e())) {
                return true;
            }
        }
        return false;
    }

    @Override // okio.ByteString
    public final String f() {
        return w().f();
    }

    @Override // okio.ByteString
    public final int g(int i, byte[] bArr) {
        js3.p(bArr, "other");
        return w().g(i, bArr);
    }

    @Override // okio.ByteString
    public final int hashCode() {
        int i = this.b;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.e;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.f;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            byte[] bArr2 = bArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr2[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.b = i3;
        return i3;
    }

    @Override // okio.ByteString
    public final byte[] i() {
        return v();
    }

    @Override // okio.ByteString
    public final byte j(int i) {
        byte[][] bArr = this.e;
        int length = bArr.length - 1;
        int[] iArr = this.f;
        wq2.m(iArr[length], i, 1L);
        int I = ub1.I(this, i);
        return bArr[I][(i - (I == 0 ? 0 : iArr[I - 1])) + iArr[bArr.length + I]];
    }

    @Override // okio.ByteString
    public final int k(byte[] bArr) {
        js3.p(bArr, "other");
        return w().k(bArr);
    }

    @Override // okio.ByteString
    public final boolean m(int i, ByteString byteString, int i2) {
        js3.p(byteString, "other");
        if (i >= 0 && i <= e() - i2) {
            int i3 = i2 + i;
            int I = ub1.I(this, i);
            int i4 = 0;
            while (i < i3) {
                int[] iArr = this.f;
                int i5 = I == 0 ? 0 : iArr[I - 1];
                int i6 = iArr[I] - i5;
                byte[][] bArr = this.e;
                int i7 = iArr[bArr.length + I];
                int iMin = Math.min(i3, i6 + i5) - i;
                if (byteString.n(bArr[I], i4, (i - i5) + i7, iMin)) {
                    i4 += iMin;
                    i += iMin;
                    I++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // okio.ByteString
    public final boolean n(byte[] bArr, int i, int i2, int i3) {
        js3.p(bArr, "other");
        if (i < 0 || i > e() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i4 = i3 + i;
        int I = ub1.I(this, i);
        while (i < i4) {
            int[] iArr = this.f;
            int i5 = I == 0 ? 0 : iArr[I - 1];
            int i6 = iArr[I] - i5;
            byte[][] bArr2 = this.e;
            int i7 = iArr[bArr2.length + I];
            int iMin = Math.min(i4, i6 + i5) - i;
            if (!wq2.h((i - i5) + i7, i2, iMin, bArr2[I], bArr)) {
                return false;
            }
            i2 += iMin;
            i += iMin;
            I++;
        }
        return true;
    }

    @Override // okio.ByteString
    public final String o(Charset charset) {
        js3.p(charset, "charset");
        return w().o(charset);
    }

    @Override // okio.ByteString
    public final ByteString p(int i, int i2) {
        if (i2 == -1234567890) {
            i2 = e();
        }
        if (i < 0) {
            throw new IllegalArgumentException(bl4.q(i, "beginIndex=", " < 0").toString());
        }
        if (i2 > e()) {
            StringBuilder sbR = rm7.r(i2, "endIndex=", " > length(");
            sbR.append(e());
            sbR.append(')');
            throw new IllegalArgumentException(sbR.toString().toString());
        }
        int i3 = i2 - i;
        if (i3 < 0) {
            throw new IllegalArgumentException(dw1.j(i2, i, "endIndex=", " < beginIndex=").toString());
        }
        if (i == 0 && i2 == e()) {
            return this;
        }
        if (i == i2) {
            return ByteString.d;
        }
        int I = ub1.I(this, i);
        int I2 = ub1.I(this, i2 - 1);
        byte[][] bArr = this.e;
        byte[][] bArr2 = (byte[][]) ew.E0(bArr, I, I2 + 1);
        int[] iArr = new int[bArr2.length * 2];
        int[] iArr2 = this.f;
        if (I <= I2) {
            int i4 = I;
            int i5 = 0;
            while (true) {
                iArr[i5] = Math.min(iArr2[i4] - i, i3);
                int i6 = i5 + 1;
                iArr[i5 + bArr2.length] = iArr2[bArr.length + i4];
                if (i4 == I2) {
                    break;
                }
                i4++;
                i5 = i6;
            }
        }
        int i7 = I != 0 ? iArr2[I - 1] : 0;
        int length = bArr2.length;
        iArr[length] = (i - i7) + iArr[length];
        return new SegmentedByteString(bArr2, iArr);
    }

    @Override // okio.ByteString
    public final ByteString r() {
        return w().r();
    }

    @Override // okio.ByteString
    public final void t(gh0 gh0Var, int i) {
        int I = ub1.I(this, 0);
        int i2 = 0;
        while (i2 < i) {
            int[] iArr = this.f;
            int i3 = I == 0 ? 0 : iArr[I - 1];
            int i4 = iArr[I] - i3;
            byte[][] bArr = this.e;
            int i5 = iArr[bArr.length + I];
            int iMin = Math.min(i, i4 + i3) - i2;
            int i6 = (i2 - i3) + i5;
            vl7 vl7Var = new vl7(bArr[I], i6, i6 + iMin, true);
            vl7 vl7Var2 = gh0Var.a;
            if (vl7Var2 == null) {
                vl7Var.g = vl7Var;
                vl7Var.f = vl7Var;
                gh0Var.a = vl7Var;
            } else {
                vl7 vl7Var3 = vl7Var2.g;
                js3.m(vl7Var3);
                vl7Var3.b(vl7Var);
            }
            i2 += iMin;
            I++;
        }
        gh0Var.b += (long) i;
    }

    @Override // okio.ByteString
    public final String toString() {
        return w().toString();
    }

    public final byte[] v() {
        byte[] bArr = new byte[e()];
        byte[][] bArr2 = this.e;
        int length = bArr2.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.f;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            ew.w0(i3, i4, i4 + i6, bArr2[i], bArr);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    public final ByteString w() {
        return new ByteString(v());
    }
}
