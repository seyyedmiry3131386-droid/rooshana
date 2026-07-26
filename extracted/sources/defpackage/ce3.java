package defpackage;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import okio.ByteString;

/* JADX INFO: loaded from: classes3.dex */
public final class ce3 implements t18 {
    public final ph0 a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;

    public ce3(ph0 ph0Var) {
        js3.p(ph0Var, "source");
        this.a = ph0Var;
    }

    @Override // defpackage.t18
    public final long f0(gh0 gh0Var, long j) throws IOException {
        int i;
        int i2;
        js3.p(gh0Var, "sink");
        do {
            int i3 = this.e;
            ph0 ph0Var = this.a;
            if (i3 == 0) {
                ph0Var.skip(this.f);
                this.f = 0;
                if ((this.c & 4) == 0) {
                    i = this.d;
                    int iN = gh9.n(ph0Var);
                    this.e = iN;
                    this.b = iN;
                    int i4 = ph0Var.readByte() & 255;
                    this.c = ph0Var.readByte() & 255;
                    Logger logger = de3.d;
                    if (logger.isLoggable(Level.FINE)) {
                        ByteString byteString = sd3.a;
                        logger.fine(sd3.b(true, this.d, this.b, i4, this.c));
                    }
                    i2 = ph0Var.readInt() & Integer.MAX_VALUE;
                    this.d = i2;
                    if (i4 != 9) {
                        throw new IOException(i4 + " != TYPE_CONTINUATION");
                    }
                }
            } else {
                long jF0 = ph0Var.f0(gh0Var, Math.min(j, i3));
                if (jF0 != -1) {
                    this.e -= (int) jF0;
                    return jF0;
                }
            }
            return -1L;
        } while (i2 == i);
        throw new IOException("TYPE_CONTINUATION streamId changed");
    }

    @Override // defpackage.t18
    public final dm8 i() {
        return this.a.i();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
