package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class jo3 implements t18 {
    public final InputStream a;
    public final dm8 b;

    public jo3(InputStream inputStream, dm8 dm8Var) {
        js3.p(inputStream, "input");
        this.a = inputStream;
        this.b = dm8Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.close();
    }

    @Override // defpackage.t18
    public final long f0(gh0 gh0Var, long j) throws IOException {
        js3.p(gh0Var, "sink");
        if (j == 0) {
            return 0L;
        }
        if (j < 0) {
            throw new IllegalArgumentException(bl4.r(j, "byteCount < 0: ").toString());
        }
        try {
            this.b.f();
            vl7 vl7VarF0 = gh0Var.F0(1);
            int i = this.a.read(vl7VarF0.a, vl7VarF0.c, (int) Math.min(j, 8192 - vl7VarF0.c));
            if (i != -1) {
                vl7VarF0.c += i;
                long j2 = i;
                gh0Var.b += j2;
                return j2;
            }
            if (vl7VarF0.b != vl7VarF0.c) {
                return -1L;
            }
            gh0Var.a = vl7VarF0.a();
            am7.a(vl7VarF0);
            return -1L;
        } catch (AssertionError e) {
            if (fh9.a(e)) {
                throw new IOException(e);
            }
            throw e;
        }
    }

    @Override // defpackage.t18
    public final dm8 i() {
        return this.b;
    }

    public final String toString() {
        return "source(" + this.a + ')';
    }
}
