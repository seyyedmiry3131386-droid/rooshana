package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class kj0 extends InputStream {
    public final /* synthetic */ int a = 1;
    public int b = 1073741824;
    public final Object c;

    public kj0(InputStream inputStream) {
        this.c = inputStream;
    }

    private final synchronized void b(int i) {
        this.b = ((ByteBuffer) this.c).position();
    }

    private final synchronized void d() {
        int i = this.b;
        if (i == -1) {
            throw new IOException("Cannot reset to unset mark position");
        }
        ((ByteBuffer) this.c).position(i);
    }

    @Override // java.io.InputStream
    public final int available() {
        switch (this.a) {
            case 0:
                return ((ByteBuffer) this.c).remaining();
            default:
                return this.b;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        switch (this.a) {
            case 1:
                ((InputStream) this.c).close();
                break;
            default:
                super.close();
                break;
        }
    }

    @Override // java.io.InputStream
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

    @Override // java.io.InputStream
    public boolean markSupported() {
        switch (this.a) {
            case 0:
                return true;
            default:
                return super.markSupported();
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        switch (this.a) {
            case 0:
                ByteBuffer byteBuffer = (ByteBuffer) this.c;
                if (byteBuffer.hasRemaining()) {
                    return byteBuffer.get() & 255;
                }
                return -1;
            default:
                int i = ((InputStream) this.c).read();
                if (i == -1) {
                    this.b = 0;
                }
                return i;
        }
    }

    @Override // java.io.InputStream
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

    @Override // java.io.InputStream
    public final long skip(long j) {
        switch (this.a) {
            case 0:
                ByteBuffer byteBuffer = (ByteBuffer) this.c;
                if (!byteBuffer.hasRemaining()) {
                    return -1L;
                }
                long jMin = Math.min(j, byteBuffer.remaining());
                byteBuffer.position((int) (((long) byteBuffer.position()) + jMin));
                return jMin;
            default:
                return ((InputStream) this.c).skip(j);
        }
    }

    public kj0(ByteBuffer byteBuffer) {
        this.c = byteBuffer;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        switch (this.a) {
            case 1:
                int i = ((InputStream) this.c).read(bArr);
                if (i == -1) {
                    this.b = 0;
                }
                return i;
            default:
                return super.read(bArr);
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        switch (this.a) {
            case 0:
                ByteBuffer byteBuffer = (ByteBuffer) this.c;
                if (!byteBuffer.hasRemaining()) {
                    return -1;
                }
                int iMin = Math.min(i2, byteBuffer.remaining());
                byteBuffer.get(bArr, i, iMin);
                return iMin;
            default:
                int i3 = ((InputStream) this.c).read(bArr, i, i2);
                if (i3 == -1) {
                    this.b = 0;
                }
                return i3;
        }
    }
}
