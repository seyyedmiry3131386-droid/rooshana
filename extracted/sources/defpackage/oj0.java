package defpackage;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class oj0 extends FilterInputStream {
    public final /* synthetic */ int a = 1;
    public long b;
    public long c;

    public oj0(InputStream inputStream) {
        super(inputStream);
        this.c = -1L;
        this.b = 1048577L;
    }

    private final synchronized void b(int i) {
        ((FilterInputStream) this).in.mark(i);
        this.c = this.b;
    }

    private final synchronized void d() {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("Mark not supported");
        }
        if (this.c == -1) {
            throw new IOException("Mark not set");
        }
        ((FilterInputStream) this).in.reset();
        this.b = this.c;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        switch (this.a) {
            case 0:
                return (int) Math.min(((FilterInputStream) this).in.available(), this.b);
            default:
                return super.available();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i) {
        switch (this.a) {
            case 0:
                b(i);
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
                if (this.b == 0) {
                    return -1;
                }
                int i = ((FilterInputStream) this).in.read();
                if (i != -1) {
                    this.b--;
                }
                return i;
            default:
                int i2 = super.read();
                if (i2 != -1) {
                    this.c++;
                }
                return i2;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        switch (this.a) {
            case 0:
                d();
                break;
            default:
                super.reset();
                break;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        switch (this.a) {
            case 0:
                long jSkip = ((FilterInputStream) this).in.skip(Math.min(j, this.b));
                this.b -= jSkip;
                return jSkip;
            default:
                return super.skip(j);
        }
    }

    public oj0(BufferedInputStream bufferedInputStream, long j) {
        super(bufferedInputStream);
        this.b = j;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        switch (this.a) {
            case 0:
                long j = this.b;
                if (j == 0) {
                    return -1;
                }
                int i3 = ((FilterInputStream) this).in.read(bArr, i, (int) Math.min(i2, j));
                if (i3 != -1) {
                    this.b -= (long) i3;
                }
                return i3;
            default:
                int i4 = super.read(bArr, i, i2);
                if (i4 != -1) {
                    this.c += (long) i4;
                }
                return i4;
        }
    }
}
