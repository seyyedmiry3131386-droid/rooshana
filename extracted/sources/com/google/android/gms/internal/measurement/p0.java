package com.google.android.gms.internal.measurement;

import defpackage.c35;
import defpackage.d77;
import defpackage.dw1;
import defpackage.qs9;
import defpackage.ut9;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class p0 extends d77 {
    public static final Logger j = Logger.getLogger(p0.class.getName());
    public static final boolean k = ut9.e;
    public c35 f;
    public final byte[] g;
    public final int h;
    public int i;

    public p0(byte[] bArr, int i) {
        int length = bArr.length;
        if (((length - i) | i) < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(dw1.j(length, i, "Array range is invalid. Buffer.length=", ", offset=0, length="));
        }
        this.g = bArr;
        this.i = 0;
        this.h = i;
    }

    public static int f(long j2) {
        return (640 - (Long.numberOfLeadingZeros(j2) * 9)) >>> 6;
    }

    public static int g(String str) {
        int length;
        try {
            length = v0.b(str);
        } catch (zzor unused) {
            length = str.getBytes(qs9.a).length;
        }
        return v(length) + length;
    }

    public static int v(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public final void h(int i, int i2) {
        p((i << 3) | i2);
    }

    public final void i(int i, int i2) throws zzll {
        p(i << 3);
        o(i2);
    }

    public final void j(int i, int i2) {
        p(i << 3);
        p(i2);
    }

    public final void k(int i, int i2) throws zzll {
        p((i << 3) | 5);
        q(i2);
    }

    public final void l(int i, long j2) throws zzll {
        p(i << 3);
        r(j2);
    }

    public final void m(int i, long j2) throws zzll {
        p((i << 3) | 1);
        s(j2);
    }

    public final void n(byte b) throws zzll {
        int i = this.i;
        try {
            int i2 = i + 1;
            try {
                this.g[i] = b;
                this.i = i2;
            } catch (IndexOutOfBoundsException e) {
                e = e;
                i = i2;
                throw new zzll(i, this.h, 1, e);
            }
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
        }
    }

    public final void o(int i) throws zzll {
        if (i >= 0) {
            p(i);
        } else {
            r(i);
        }
    }

    public final void p(int i) {
        int i2;
        int i3 = this.i;
        while (true) {
            int i4 = i & (-128);
            byte[] bArr = this.g;
            if (i4 == 0) {
                i2 = i3 + 1;
                bArr[i3] = (byte) i;
                this.i = i2;
                return;
            } else {
                i2 = i3 + 1;
                try {
                    bArr[i3] = (byte) (i | 128);
                    i >>>= 7;
                    i3 = i2;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzll(i2, this.h, 1, e);
                }
            }
            throw new zzll(i2, this.h, 1, e);
        }
    }

    public final void q(int i) throws zzll {
        int i2 = this.i;
        try {
            byte[] bArr = this.g;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.i = i2 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new zzll(i2, this.h, 4, e);
        }
    }

    public final void r(long j2) throws zzll {
        int i;
        int i2 = this.i;
        int i3 = this.h;
        byte[] bArr = this.g;
        if (!k || i3 - i2 < 10) {
            long j3 = j2;
            while ((j3 & (-128)) != 0) {
                int i4 = i2 + 1;
                try {
                    bArr[i2] = (byte) (((int) j3) | 128);
                    j3 >>>= 7;
                    i2 = i4;
                } catch (IndexOutOfBoundsException e) {
                    e = e;
                    i = i4;
                    throw new zzll(i, i3, 1, e);
                }
            }
            i = i2 + 1;
            try {
                bArr[i2] = (byte) j3;
            } catch (IndexOutOfBoundsException e2) {
                e = e2;
                throw new zzll(i, i3, 1, e);
            }
        } else {
            long j4 = j2;
            while ((j4 & (-128)) != 0) {
                ut9.c.v(bArr, ut9.f + ((long) i2), (byte) (((int) j4) | 128));
                j4 >>>= 7;
                i2++;
            }
            i = i2 + 1;
            ut9.c.v(bArr, ut9.f + ((long) i2), (byte) j4);
        }
        this.i = i;
    }

    public final void s(long j2) throws zzll {
        int i = this.i;
        try {
            byte[] bArr = this.g;
            bArr[i] = (byte) j2;
            bArr[i + 1] = (byte) (j2 >> 8);
            bArr[i + 2] = (byte) (j2 >> 16);
            bArr[i + 3] = (byte) (j2 >> 24);
            bArr[i + 4] = (byte) (j2 >> 32);
            bArr[i + 5] = (byte) (j2 >> 40);
            bArr[i + 6] = (byte) (j2 >> 48);
            bArr[i + 7] = (byte) (j2 >> 56);
            this.i = i + 8;
        } catch (IndexOutOfBoundsException e) {
            throw new zzll(i, this.h, 8, e);
        }
    }

    public final void t(int i, byte[] bArr) throws zzll {
        try {
            System.arraycopy(bArr, 0, this.g, this.i, i);
            this.i += i;
        } catch (IndexOutOfBoundsException e) {
            throw new zzll(this.i, this.h, i, e);
        }
    }

    public final void u(String str) throws zzll {
        int i = this.i;
        try {
            int iV = v(str.length() * 3);
            int iV2 = v(str.length());
            int i2 = this.h;
            byte[] bArr = this.g;
            if (iV2 != iV) {
                p(v0.b(str));
                int i3 = this.i;
                this.i = v0.c(bArr, str, i3, i2 - i3);
            } else {
                int i4 = i + iV2;
                this.i = i4;
                int iC = v0.c(bArr, str, i4, i2 - i4);
                this.i = i;
                p((iC - i) - iV2);
                this.i = iC;
            }
        } catch (zzor e) {
            this.i = i;
            j.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e);
            byte[] bytes = str.getBytes(qs9.a);
            try {
                int length = bytes.length;
                p(length);
                t(length, bytes);
            } catch (IndexOutOfBoundsException e2) {
                throw new zzll(e2);
            }
        } catch (IndexOutOfBoundsException e3) {
            throw new zzll(e3);
        }
    }
}
