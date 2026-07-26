package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes3.dex */
public final class kn3 implements t18 {
    public final tv6 a;
    public final Inflater b;
    public int c;
    public boolean d;

    public kn3(tv6 tv6Var, Inflater inflater) {
        this.a = tv6Var;
        this.b = inflater;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.d) {
            return;
        }
        this.b.end();
        this.d = true;
        this.a.close();
    }

    @Override // defpackage.t18
    public final long f0(gh0 gh0Var, long j) throws IOException {
        long j2;
        js3.p(gh0Var, "sink");
        while (j >= 0) {
            if (this.d) {
                throw new IllegalStateException("closed");
            }
            tv6 tv6Var = this.a;
            Inflater inflater = this.b;
            if (j == 0) {
                j2 = 0;
            } else {
                try {
                    vl7 vl7VarF0 = gh0Var.F0(1);
                    int iMin = (int) Math.min(j, 8192 - vl7VarF0.c);
                    if (inflater.needsInput() && !tv6Var.b()) {
                        vl7 vl7Var = tv6Var.b.a;
                        js3.m(vl7Var);
                        int i = vl7Var.c;
                        int i2 = vl7Var.b;
                        int i3 = i - i2;
                        this.c = i3;
                        inflater.setInput(vl7Var.a, i2, i3);
                    }
                    int iInflate = inflater.inflate(vl7VarF0.a, vl7VarF0.c, iMin);
                    int i4 = this.c;
                    if (i4 != 0) {
                        int remaining = i4 - inflater.getRemaining();
                        this.c -= remaining;
                        tv6Var.skip(remaining);
                    }
                    if (iInflate > 0) {
                        vl7VarF0.c += iInflate;
                        j2 = iInflate;
                        gh0Var.b += j2;
                    } else {
                        if (vl7VarF0.b == vl7VarF0.c) {
                            gh0Var.a = vl7VarF0.a();
                            am7.a(vl7VarF0);
                        }
                        j2 = 0;
                    }
                } catch (DataFormatException e) {
                    throw new IOException(e);
                }
            }
            if (j2 > 0) {
                return j2;
            }
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
            if (tv6Var.b()) {
                throw new EOFException("source exhausted prematurely");
            }
        }
        throw new IllegalArgumentException(bl4.r(j, "byteCount < 0: ").toString());
    }

    @Override // defpackage.t18
    public final dm8 i() {
        return this.a.a.i();
    }
}
