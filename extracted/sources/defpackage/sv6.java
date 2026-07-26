package defpackage;

import java.nio.ByteBuffer;
import okio.ByteString;

/* JADX INFO: loaded from: classes3.dex */
public final class sv6 implements oh0 {
    public final by7 a;
    public final gh0 b;
    public boolean c;

    public sv6(by7 by7Var) {
        js3.p(by7Var, "sink");
        this.a = by7Var;
        this.b = new gh0();
    }

    @Override // defpackage.oh0
    public final oh0 T0(ByteString byteString) {
        js3.p(byteString, "byteString");
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.b.L0(byteString);
        b();
        return this;
    }

    @Override // defpackage.by7
    public final void X0(gh0 gh0Var, long j) {
        js3.p(gh0Var, "source");
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.b.X0(gh0Var, j);
        b();
    }

    public final oh0 b() {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        gh0 gh0Var = this.b;
        long jG = gh0Var.g();
        if (jG > 0) {
            this.a.X0(gh0Var, jG);
        }
        return this;
    }

    @Override // defpackage.by7, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        by7 by7Var = this.a;
        if (this.c) {
            return;
        }
        try {
            gh0 gh0Var = this.b;
            long j = gh0Var.b;
            if (j > 0) {
                by7Var.X0(gh0Var, j);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            by7Var.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // defpackage.oh0, defpackage.by7, java.io.Flushable
    public final void flush() {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        gh0 gh0Var = this.b;
        long j = gh0Var.b;
        by7 by7Var = this.a;
        if (j > 0) {
            by7Var.X0(gh0Var, j);
        }
        by7Var.flush();
    }

    @Override // defpackage.oh0
    public final gh0 h() {
        return this.b;
    }

    @Override // defpackage.by7
    public final dm8 i() {
        return this.a.i();
    }

    @Override // defpackage.oh0
    public final oh0 i1(long j) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.b.U0(j);
        b();
        return this;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.c;
    }

    @Override // defpackage.oh0
    public final oh0 j0(int i, byte[] bArr) {
        js3.p(bArr, "source");
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.b.H0(i, bArr);
        b();
        return this;
    }

    @Override // defpackage.oh0
    public final oh0 n0(String str) {
        js3.p(str, "string");
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.b.h1(str);
        b();
        return this;
    }

    public final String toString() {
        return "buffer(" + this.a + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        js3.p(byteBuffer, "source");
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        int iWrite = this.b.write(byteBuffer);
        b();
        return iWrite;
    }

    @Override // defpackage.oh0
    public final oh0 writeByte(int i) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.b.R0(i);
        b();
        return this;
    }

    @Override // defpackage.oh0
    public final oh0 writeInt(int i) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.b.a1(i);
        b();
        return this;
    }

    @Override // defpackage.oh0
    public final oh0 writeShort(int i) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.b.e1(i);
        b();
        return this;
    }

    @Override // defpackage.oh0
    public final oh0 write(byte[] bArr) {
        js3.p(bArr, "source");
        if (!this.c) {
            this.b.H0(bArr.length, bArr);
            b();
            return this;
        }
        throw new IllegalStateException("closed");
    }
}
