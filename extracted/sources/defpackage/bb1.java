package defpackage;

import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class bb1 extends InputStream {
    public final xa1 a;
    public final db1 b;
    public boolean d = false;
    public boolean e = false;
    public final byte[] c = new byte[1];

    public bb1(xa1 xa1Var, db1 db1Var) {
        this.a = xa1Var;
        this.b = db1Var;
    }

    public final void b() {
        if (this.d) {
            return;
        }
        this.a.b(this.b);
        this.d = true;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.e) {
            return;
        }
        this.a.close();
        this.e = true;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.c;
        if (read(bArr, 0, bArr.length) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        vy2.s(!this.e);
        b();
        int i3 = this.a.read(bArr, i, i2);
        if (i3 == -1) {
            return -1;
        }
        return i3;
    }
}
