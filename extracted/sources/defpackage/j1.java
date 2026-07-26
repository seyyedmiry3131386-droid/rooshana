package defpackage;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class j1 extends FilterInputStream {
    public final /* synthetic */ int a = 0;
    public int b;

    public j1(k42 k42Var) {
        super(k42Var);
        this.b = Integer.MIN_VALUE;
    }

    private final synchronized void d(int i) {
        super.mark(i);
        this.b = i;
    }

    private final synchronized void g() {
        super.reset();
        this.b = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        switch (this.a) {
            case 0:
                return Math.min(super.available(), this.b);
            default:
                int i = this.b;
                return i == Integer.MIN_VALUE ? super.available() : Math.min(i, super.available());
        }
    }

    public long b(long j) {
        int i = this.b;
        if (i == 0) {
            return -1L;
        }
        return (i == Integer.MIN_VALUE || j <= ((long) i)) ? j : i;
    }

    public void k(long j) {
        int i = this.b;
        if (i == Integer.MIN_VALUE || j == -1) {
            return;
        }
        this.b = (int) (((long) i) - j);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i) {
        switch (this.a) {
            case 1:
                d(i);
                break;
            default:
                super.mark(i);
                break;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        switch (this.a) {
            case 0:
                if (this.b <= 0) {
                    return -1;
                }
                int i = super.read();
                if (i < 0) {
                    return i;
                }
                this.b--;
                return i;
            default:
                if (b(1L) == -1) {
                    return -1;
                }
                int i2 = super.read();
                k(1L);
                return i2;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        switch (this.a) {
            case 1:
                g();
                break;
            default:
                super.reset();
                break;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        switch (this.a) {
            case 0:
                int iSkip = (int) super.skip(Math.min(j, this.b));
                if (iSkip >= 0) {
                    this.b -= iSkip;
                }
                return iSkip;
            default:
                long jB = b(j);
                if (jB == -1) {
                    return 0L;
                }
                long jSkip = super.skip(jB);
                k(jSkip);
                return jSkip;
        }
    }

    public j1(int i, InputStream inputStream) {
        super(inputStream);
        this.b = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        switch (this.a) {
            case 0:
                int i3 = this.b;
                if (i3 <= 0) {
                    return -1;
                }
                int i4 = super.read(bArr, i, Math.min(i2, i3));
                if (i4 < 0) {
                    return i4;
                }
                this.b -= i4;
                return i4;
            default:
                int iB = (int) b(i2);
                if (iB == -1) {
                    return -1;
                }
                int i5 = super.read(bArr, i, iB);
                k(i5);
                return i5;
        }
    }
}
