package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes.dex */
public final class yh6 extends ByteArrayOutputStream {
    public final /* synthetic */ int a = 0;
    public final Object b;

    public yh6(aj0 aj0Var, int i) {
        this.b = aj0Var;
        ((ByteArrayOutputStream) this).buf = aj0Var.g(Math.max(i, 256));
    }

    private final synchronized void d(int i) {
        b(1);
        super.write(i);
    }

    private final synchronized void g(byte[] bArr, int i, int i2) {
        b(i2);
        super.write(bArr, i, i2);
    }

    public void b(int i) {
        aj0 aj0Var = (aj0) this.b;
        int i2 = ((ByteArrayOutputStream) this).count;
        if (i2 + i <= ((ByteArrayOutputStream) this).buf.length) {
            return;
        }
        byte[] bArrG = aj0Var.g((i2 + i) * 2);
        System.arraycopy(((ByteArrayOutputStream) this).buf, 0, bArrG, 0, ((ByteArrayOutputStream) this).count);
        aj0Var.x(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = bArrG;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        switch (this.a) {
            case 0:
                ((aj0) this.b).x(((ByteArrayOutputStream) this).buf);
                ((ByteArrayOutputStream) this).buf = null;
                super.close();
                break;
            default:
                super.close();
                break;
        }
    }

    public void finalize() throws Throwable {
        switch (this.a) {
            case 0:
                ((aj0) this.b).x(((ByteArrayOutputStream) this).buf);
                break;
            default:
                super.finalize();
                break;
        }
    }

    @Override // java.io.ByteArrayOutputStream
    public String toString() {
        switch (this.a) {
            case 1:
                int i = ((ByteArrayOutputStream) this).count;
                if (i > 0 && ((ByteArrayOutputStream) this).buf[i - 1] == 13) {
                    i--;
                }
                try {
                    return new String(((ByteArrayOutputStream) this).buf, 0, i, ((s78) this.b).b.name());
                } catch (UnsupportedEncodingException e) {
                    throw new AssertionError(e);
                }
            default:
                return super.toString();
        }
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public synchronized void write(int i) {
        switch (this.a) {
            case 0:
                d(i);
                break;
            default:
                super.write(i);
                break;
        }
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public synchronized void write(byte[] bArr, int i, int i2) {
        switch (this.a) {
            case 0:
                g(bArr, i, i2);
                break;
            default:
                super.write(bArr, i, i2);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yh6(s78 s78Var, int i) {
        super(i);
        this.b = s78Var;
    }
}
