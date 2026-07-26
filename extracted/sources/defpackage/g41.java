package defpackage;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class g41 extends FilterInputStream {
    public final long a;
    public int b;

    public g41(InputStream inputStream, long j) {
        super(inputStream);
        this.a = j;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        return (int) Math.max(this.a - ((long) this.b), ((FilterInputStream) this).in.available());
    }

    public final void b(int i) throws IOException {
        if (i >= 0) {
            this.b += i;
            return;
        }
        long j = this.b;
        long j2 = this.a;
        if (j2 - j <= 0) {
            return;
        }
        StringBuilder sbS = rm7.s(j2, "Failed to read all expected data, expected: ", ", but read: ");
        sbS.append(this.b);
        throw new IOException(sbS.toString());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        int i;
        i = super.read();
        b(i >= 0 ? 1 : -1);
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) {
        int i3;
        i3 = super.read(bArr, i, i2);
        b(i3);
        return i3;
    }
}
