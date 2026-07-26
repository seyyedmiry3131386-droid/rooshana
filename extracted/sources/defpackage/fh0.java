package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class fh0 extends InputStream {
    public final /* synthetic */ int a;
    public final /* synthetic */ ph0 b;

    public /* synthetic */ fh0(ph0 ph0Var, int i) {
        this.a = i;
        this.b = ph0Var;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        long jMin;
        switch (this.a) {
            case 0:
                jMin = Math.min(((gh0) this.b).b, Integer.MAX_VALUE);
                break;
            default:
                tv6 tv6Var = (tv6) this.b;
                if (tv6Var.c) {
                    throw new IOException("closed");
                }
                jMin = Math.min(tv6Var.b.b, Integer.MAX_VALUE);
                break;
        }
        return (int) jMin;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.a) {
            case 0:
                break;
            default:
                ((tv6) this.b).close();
                break;
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        switch (this.a) {
            case 0:
                gh0 gh0Var = (gh0) this.b;
                if (gh0Var.b > 0) {
                    return gh0Var.readByte() & 255;
                }
                return -1;
            default:
                tv6 tv6Var = (tv6) this.b;
                gh0 gh0Var2 = tv6Var.b;
                if (tv6Var.c) {
                    throw new IOException("closed");
                }
                if (gh0Var2.b == 0 && tv6Var.a.f0(gh0Var2, 8192L) == -1) {
                    return -1;
                }
                return gh0Var2.readByte() & 255;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return ((gh0) this.b) + ".inputStream()";
            default:
                return ((tv6) this.b) + ".inputStream()";
        }
    }

    @Override // java.io.InputStream
    public long transferTo(OutputStream outputStream) throws IOException {
        switch (this.a) {
            case 1:
                js3.p(outputStream, "out");
                tv6 tv6Var = (tv6) this.b;
                gh0 gh0Var = tv6Var.b;
                if (tv6Var.c) {
                    throw new IOException("closed");
                }
                long j = 0;
                long j2 = 0;
                while (true) {
                    if (gh0Var.b == j && tv6Var.a.f0(gh0Var, 8192L) == -1) {
                        return j2;
                    }
                    long j3 = gh0Var.b;
                    j2 += j3;
                    wq2.m(j3, 0L, j3);
                    vl7 vl7Var = gh0Var.a;
                    while (j3 > j) {
                        js3.m(vl7Var);
                        int iMin = (int) Math.min(j3, vl7Var.c - vl7Var.b);
                        outputStream.write(vl7Var.a, vl7Var.b, iMin);
                        int i = vl7Var.b + iMin;
                        vl7Var.b = i;
                        long j4 = iMin;
                        gh0Var.b -= j4;
                        j3 -= j4;
                        if (i == vl7Var.c) {
                            vl7 vl7VarA = vl7Var.a();
                            gh0Var.a = vl7VarA;
                            am7.a(vl7Var);
                            vl7Var = vl7VarA;
                        }
                        j = 0;
                    }
                }
                break;
            default:
                return super.transferTo(outputStream);
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        switch (this.a) {
            case 0:
                js3.p(bArr, "sink");
                return ((gh0) this.b).read(bArr, i, i2);
            default:
                js3.p(bArr, "data");
                tv6 tv6Var = (tv6) this.b;
                gh0 gh0Var = tv6Var.b;
                if (!tv6Var.c) {
                    wq2.m(bArr.length, i, i2);
                    if (gh0Var.b == 0 && tv6Var.a.f0(gh0Var, 8192L) == -1) {
                        return -1;
                    }
                    return gh0Var.read(bArr, i, i2);
                }
                throw new IOException("closed");
        }
    }

    private final void b() {
    }
}
