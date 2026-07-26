package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes.dex */
public final class e39 {
    public static final long[] d = {128, 64, 32, 16, 8, 4, 2, 1};
    public int a;
    public int b;
    public final byte[] c;

    public e39(byte[] bArr) {
        int length = bArr.length;
        this.c = bArr;
        this.a = 0;
        this.b = length;
    }

    public static long a(byte[] bArr, int i, boolean z) {
        long j = ((long) bArr[0]) & 255;
        if (z) {
            j &= ~d[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (((long) bArr[i2]) & 255);
        }
        return j;
    }

    public static void b(int i, int i2, int i3) {
        if (i2 == i3) {
            return;
        }
        StringBuilder sbR = rm7.r(i, "Field ", ": expected ");
        sbR.append(i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 5 ? "unknown" : "fixed32" : "length-delimited" : "fixed64" : "varint");
        sbR.append(" (wire type ");
        sbR.append(i2);
        sbR.append(") but got ");
        sbR.append(i3 != 0 ? i3 != 1 ? i3 != 2 ? i3 != 5 ? "unknown" : "fixed32" : "length-delimited" : "fixed64" : "varint");
        sbR.append(" (wire type ");
        sbR.append(i3);
        sbR.append(")");
        throw new IOException(sbR.toString());
    }

    public boolean c() {
        return i() != 0;
    }

    public byte[] d() {
        int i = (int) i();
        if (i < 0) {
            throw new IOException(rm7.n(i, "Negative length: "));
        }
        int i2 = this.b;
        int i3 = this.a;
        if (i2 - i3 < i) {
            throw new EOFException("Not enough bytes for length-delimited field");
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.c, i3, bArr, 0, i);
        this.a += i;
        return bArr;
    }

    public e39 e() {
        return new e39(d());
    }

    public String f() {
        return new String(d(), StandardCharsets.UTF_8);
    }

    public int g() {
        if (this.a < this.b) {
            return (int) i();
        }
        return 0;
    }

    public long h(w72 w72Var, boolean z, boolean z2, int i) {
        int i2;
        int i3 = this.a;
        byte[] bArr = this.c;
        if (i3 == 0) {
            if (!w72Var.a(bArr, 0, 1, z)) {
                return -1L;
            }
            int i4 = bArr[0] & 255;
            int i5 = 0;
            while (true) {
                if (i5 >= 8) {
                    i2 = -1;
                    break;
                }
                if ((d[i5] & ((long) i4)) != 0) {
                    i2 = i5 + 1;
                    break;
                }
                i5++;
            }
            this.b = i2;
            if (i2 == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.a = 1;
        }
        int i6 = this.b;
        if (i6 > i) {
            this.a = 0;
            return -2L;
        }
        if (i6 != 1) {
            w72Var.readFully(bArr, 1, i6 - 1);
        }
        this.a = 0;
        return a(bArr, this.b, z2);
    }

    public long i() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.a;
            if (i2 >= this.b) {
                throw new EOFException("Truncated varint");
            }
            this.a = i2 + 1;
            byte b = this.c[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        throw new IOException("Malformed varint");
    }

    public void j(int i) {
        int i2 = this.b;
        if (i == 0) {
            i();
            return;
        }
        if (i == 1) {
            int i3 = this.a;
            if (i2 - i3 < 8) {
                throw new EOFException("Not enough bytes to skip fixed64");
            }
            this.a = i3 + 8;
            return;
        }
        if (i == 2) {
            int i4 = (int) i();
            int i5 = this.a;
            if (i2 - i5 < i4) {
                throw new EOFException("Not enough bytes to skip length-delimited");
            }
            this.a = i5 + i4;
            return;
        }
        if (i != 5) {
            throw new IOException(rm7.n(i, "Unknown wire type: "));
        }
        int i6 = this.a;
        if (i2 - i6 < 4) {
            throw new EOFException("Not enough bytes to skip fixed32");
        }
        this.a = i6 + 4;
    }

    public e39() {
        this.c = new byte[8];
    }

    public e39(byte[] bArr, int i, int i2) {
        this.c = bArr;
        this.a = i;
        this.b = i2;
    }
}
