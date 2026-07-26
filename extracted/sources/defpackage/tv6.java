package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import okio.ByteString;

/* JADX INFO: loaded from: classes3.dex */
public final class tv6 implements ph0 {
    public final t18 a;
    public final gh0 b;
    public boolean c;

    public tv6(t18 t18Var) {
        js3.p(t18Var, "source");
        this.a = t18Var;
        this.b = new gh0();
    }

    @Override // defpackage.ph0
    public final int A(tv5 tv5Var) {
        js3.p(tv5Var, "options");
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            gh0 gh0Var = this.b;
            int iD = b.d(gh0Var, tv5Var, true);
            if (iD != -2) {
                if (iD != -1) {
                    gh0Var.skip(tv5Var.a[iD].e());
                    return iD;
                }
            } else if (this.a.f0(gh0Var, 8192L) == -1) {
                break;
            }
        }
        return -1;
    }

    public final String D(long j) {
        g1(j);
        gh0 gh0Var = this.b;
        gh0Var.getClass();
        return gh0Var.s0(j, zp0.a);
    }

    @Override // defpackage.ph0
    public final String Y(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(bl4.r(j, "limit < 0: ").toString());
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long jD = d((byte) 10, 0L, j2);
        gh0 gh0Var = this.b;
        if (jD != -1) {
            return b.c(gh0Var, jD);
        }
        if (j2 < Long.MAX_VALUE && request(j2) && gh0Var.y(j2 - 1) == 13 && request(j2 + 1) && gh0Var.y(j2) == 10) {
            return b.c(gh0Var, j2);
        }
        gh0 gh0Var2 = new gh0();
        gh0Var.k(gh0Var2, 0L, Math.min(32, gh0Var.b));
        throw new EOFException("\\n not found: limit=" + Math.min(gh0Var.b, j) + " content=" + gh0Var2.v(gh0Var2.b).f() + (char) 8230);
    }

    public final boolean b() {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        gh0 gh0Var = this.b;
        return gh0Var.u() && this.a.f0(gh0Var, 8192L) == -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws IOException {
        if (this.c) {
            return;
        }
        this.c = true;
        this.a.close();
        this.b.b();
    }

    public final long d(byte b, long j, long j2) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        if (0 > j2) {
            throw new IllegalArgumentException(bl4.r(j2, "fromIndex=0 toIndex=").toString());
        }
        long jMax = 0;
        while (jMax < j2) {
            gh0 gh0Var = this.b;
            byte b2 = b;
            long j3 = j2;
            long jD = gh0Var.D(b2, jMax, j3);
            if (jD != -1) {
                return jD;
            }
            long j4 = gh0Var.b;
            if (j4 >= j3 || this.a.f0(gh0Var, 8192L) == -1) {
                break;
            }
            jMax = Math.max(jMax, j4);
            b = b2;
            j2 = j3;
        }
        return -1L;
    }

    @Override // defpackage.ph0
    public final long e0(oh0 oh0Var) {
        gh0 gh0Var;
        long j = 0;
        while (true) {
            t18 t18Var = this.a;
            gh0Var = this.b;
            if (t18Var.f0(gh0Var, 8192L) == -1) {
                break;
            }
            long jG = gh0Var.g();
            if (jG > 0) {
                j += jG;
                oh0Var.X0(gh0Var, jG);
            }
        }
        long j2 = gh0Var.b;
        if (j2 <= 0) {
            return j;
        }
        long j3 = j + j2;
        oh0Var.X0(gh0Var, j2);
        return j3;
    }

    @Override // defpackage.t18
    public final long f0(gh0 gh0Var, long j) {
        js3.p(gh0Var, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(bl4.r(j, "byteCount < 0: ").toString());
        }
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        gh0 gh0Var2 = this.b;
        if (gh0Var2.b == 0) {
            if (j == 0) {
                return 0L;
            }
            if (this.a.f0(gh0Var2, 8192L) == -1) {
                return -1L;
            }
        }
        return gh0Var2.f0(gh0Var, Math.min(j, gh0Var2.b));
    }

    public final long g(ByteString byteString) {
        js3.p(byteString, "targetBytes");
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        long jMax = 0;
        while (true) {
            gh0 gh0Var = this.b;
            long J = gh0Var.J(byteString, jMax);
            if (J != -1) {
                return J;
            }
            long j = gh0Var.b;
            if (this.a.f0(gh0Var, 8192L) == -1) {
                return -1L;
            }
            jMax = Math.max(jMax, j);
        }
    }

    @Override // defpackage.ph0
    public final void g1(long j) {
        if (!request(j)) {
            throw new EOFException();
        }
    }

    @Override // defpackage.ph0, defpackage.oh0
    public final gh0 h() {
        return this.b;
    }

    @Override // defpackage.t18
    public final dm8 i() {
        return this.a.i();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.c;
    }

    public final int k() {
        g1(4L);
        int i = this.b.readInt();
        return ((i & 255) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    @Override // defpackage.ph0
    public final InputStream n1() {
        return new fh0(this, 1);
    }

    @Override // defpackage.ph0
    public final tv6 peek() {
        return rf0.j(new n46(this));
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        js3.p(byteBuffer, "sink");
        gh0 gh0Var = this.b;
        if (gh0Var.b == 0 && this.a.f0(gh0Var, 8192L) == -1) {
            return -1;
        }
        return gh0Var.read(byteBuffer);
    }

    @Override // defpackage.ph0
    public final byte readByte() {
        g1(1L);
        return this.b.readByte();
    }

    @Override // defpackage.ph0
    public final int readInt() {
        g1(4L);
        return this.b.readInt();
    }

    @Override // defpackage.ph0
    public final short readShort() {
        g1(2L);
        return this.b.readShort();
    }

    @Override // defpackage.ph0
    public final boolean request(long j) {
        gh0 gh0Var;
        if (j < 0) {
            throw new IllegalArgumentException(bl4.r(j, "byteCount < 0: ").toString());
        }
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        do {
            gh0Var = this.b;
            if (gh0Var.b >= j) {
                return true;
            }
        } while (this.a.f0(gh0Var, 8192L) != -1);
        return false;
    }

    @Override // defpackage.ph0
    public final void skip(long j) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        while (j > 0) {
            gh0 gh0Var = this.b;
            if (gh0Var.b == 0 && this.a.f0(gh0Var, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j, gh0Var.b);
            gh0Var.skip(jMin);
            j -= jMin;
        }
    }

    public final String toString() {
        return "buffer(" + this.a + ')';
    }

    public final long u() throws EOFException {
        char c;
        char c2;
        char c3;
        char c4;
        long j;
        g1(8L);
        gh0 gh0Var = this.b;
        if (gh0Var.b < 8) {
            throw new EOFException();
        }
        vl7 vl7Var = gh0Var.a;
        js3.m(vl7Var);
        int i = vl7Var.b;
        int i2 = vl7Var.c;
        if (i2 - i < 8) {
            j = ((((long) gh0Var.readInt()) & 4294967295L) << 32) | (4294967295L & ((long) gh0Var.readInt()));
            c3 = '8';
            c4 = '\b';
            c = 24;
            c2 = '(';
        } else {
            byte[] bArr = vl7Var.a;
            c = 24;
            c2 = '(';
            c3 = '8';
            c4 = '\b';
            int i3 = i + 7;
            long j2 = ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i + 1]) & 255) << 48) | ((((long) bArr[i + 2]) & 255) << 40) | ((((long) bArr[i + 3]) & 255) << 32) | ((((long) bArr[i + 4]) & 255) << 24) | ((((long) bArr[i + 5]) & 255) << 16) | ((((long) bArr[i + 6]) & 255) << 8);
            int i4 = i + 8;
            long j3 = j2 | (((long) bArr[i3]) & 255);
            gh0Var.b -= 8;
            if (i4 == i2) {
                gh0Var.a = vl7Var.a();
                am7.a(vl7Var);
            } else {
                vl7Var.b = i4;
            }
            j = j3;
        }
        return ((j & 255) << c3) | (((-72057594037927936L) & j) >>> c3) | ((71776119061217280L & j) >>> c2) | ((280375465082880L & j) >>> c) | ((1095216660480L & j) >>> c4) | ((4278190080L & j) << c4) | ((16711680 & j) << c) | ((65280 & j) << c2);
    }

    @Override // defpackage.ph0
    public final String u0(Charset charset) {
        js3.p(charset, "charset");
        t18 t18Var = this.a;
        gh0 gh0Var = this.b;
        gh0Var.N0(t18Var);
        return gh0Var.u0(charset);
    }

    @Override // defpackage.ph0
    public final ByteString v(long j) {
        g1(j);
        return this.b.v(j);
    }

    public final short y() {
        g1(2L);
        return this.b.k0();
    }
}
